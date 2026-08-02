package javazoom.jl.converter;

import java.io.OutputStream;
import java.io.PrintWriter;
import javazoom.jl.converter.Converter;
import javazoom.jl.decoder.Crc16;
import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public class jlc {
    public static void main(String[] strArr) {
        System.currentTimeMillis();
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = "jlc";
        int i = 0;
        while (i < strArr.length) {
            int i2 = i + 1;
            strArr2[i2] = strArr[i];
            i = i2;
        }
        jlcArgs jlcargs = new jlcArgs();
        if (!jlcargs.processArgs(strArr2)) {
            System.exit(1);
        }
        try {
            new Converter().convert(jlcargs.filename, jlcargs.output_filename, new Converter.PrintWriterProgressListener(new PrintWriter((OutputStream) System.out, true), jlcargs.verbose_mode ? jlcargs.verbose_level : 0));
        } catch (JavaLayerException e) {
            System.err.println("Convertion failure: " + e);
        }
        System.exit(0);
    }

    static class jlcArgs {
        public String filename;
        public String output_filename;
        public int output_mode;
        public int verbose_level = 3;
        public int which_c = 0;
        public boolean use_own_scalefactor = false;
        public float scalefactor = 32768.0f;
        public boolean verbose_mode = false;

        public boolean processArgs(String[] strArr) {
            this.filename = null;
            Crc16[] crc16Arr = new Crc16[1];
            int length = strArr.length;
            this.verbose_mode = false;
            this.output_mode = 0;
            this.output_filename = "";
            if (length < 2 || strArr[1].equals("-h")) {
                return Usage();
            }
            int i = 1;
            while (i < length) {
                if (strArr[i].charAt(0) == '-') {
                    if (strArr[i].startsWith("-v")) {
                        this.verbose_mode = true;
                        if (strArr[i].length() > 2) {
                            try {
                                this.verbose_level = Integer.parseInt(strArr[i].substring(2));
                            } catch (NumberFormatException unused) {
                                System.err.println("Invalid verbose level. Using default.");
                            }
                        }
                        System.out.println("Verbose Activated (level " + this.verbose_level + ")");
                    } else if (strArr[i].equals("-p")) {
                        i++;
                        if (i == length) {
                            System.out.println("Please specify an output filename after the -p option!");
                            System.exit(1);
                        }
                        this.output_filename = strArr[i];
                    } else {
                        return Usage();
                    }
                } else {
                    this.filename = strArr[i];
                    System.out.println("FileName = " + strArr[i]);
                    if (this.filename == null) {
                        return Usage();
                    }
                }
                i++;
            }
            if (this.filename == null) {
                return Usage();
            }
            return true;
        }

        public boolean Usage() {
            System.out.println("JavaLayer Converter :");
            System.out.println("  -v[x]         verbose mode. ");
            System.out.println("                default = 2");
            System.out.println("  -p name    output as a PCM wave file");
            System.out.println("");
            System.out.println("  More info on http://www.javazoom.net");
            return false;
        }
    }
}
