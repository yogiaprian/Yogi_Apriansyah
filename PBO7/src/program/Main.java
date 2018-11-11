package program;

import java.util.Scanner;

public class Main {
    
    public static void TampilData() {    
    }
    
    public static void InputData() {
        Program.Mahasiswa mahasiswa = new Program.Mahasiswa();
        Scanner s = new Scanner(System.in);
        System.out.print("Nim : ");
        String nims = s.nextLine();
        System.out.print("Nama: ");
        String nama = s.nextLine();
        System.out.print("IPK : ");
        String ipk = s.nextLine();
        mahasiswa.isiData(nims, nama, ipk);
    }
    
    public static void main(String[] args) {
        Program.Mahasiswa mhs =  new Program.Mahasiswa();
        int pil = 0;/*Mahasiswa*/
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Urut data");
            System.out.print("Pilih: ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    InputData();
                    break;
                case 2:
                    mhs.tampilData();
                    break;
                case 3:
                    System.out.println("1. Berdasarkan Nim");
                    System.out.println("2. Berdasarkan Nama");
                    System.out.println("3. Berdasarkan IPK");
                    pil = s.nextInt();
                    if (pil == 1) {
                        mhs.sortNim();
                    } else if (pil == 2) {
                        mhs.sortNama();
                    } else if (pil == 3) {
                        mhs.sortIpk();
                    }
                    break;
            }        
           
        } while (pil != 4);
        
        
    }
    
}