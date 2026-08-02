package h2;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C6785c {

    /* renamed from: b, reason: collision with root package name */
    static C6785c f64642b = new C6785c();

    /* renamed from: c, reason: collision with root package name */
    public static String[] f64643c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a, reason: collision with root package name */
    String f64644a = "identity";

    /* renamed from: h2.c$a */
    static class a extends C6785c {

        /* renamed from: d, reason: collision with root package name */
        double f64645d;

        /* renamed from: e, reason: collision with root package name */
        double f64646e;

        /* renamed from: f, reason: collision with root package name */
        double f64647f;

        /* renamed from: g, reason: collision with root package name */
        double f64648g;

        a(String str) {
            this.f64644a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f64645d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i11 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i11);
            this.f64646e = Double.parseDouble(str.substring(i11, indexOf3).trim());
            int i12 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i12);
            this.f64647f = Double.parseDouble(str.substring(i12, indexOf4).trim());
            int i13 = indexOf4 + 1;
            this.f64648g = Double.parseDouble(str.substring(i13, str.indexOf(41, i13)).trim());
        }

        private double d(double d11) {
            double d12 = 1.0d - d11;
            double d13 = 3.0d * d12;
            double d14 = d12 * d13 * d11;
            double d15 = d13 * d11 * d11;
            return (this.f64647f * d15) + (this.f64645d * d14) + (d11 * d11 * d11);
        }

        private double e(double d11) {
            double d12 = 1.0d - d11;
            double d13 = 3.0d * d12;
            double d14 = d12 * d13 * d11;
            double d15 = d13 * d11 * d11;
            return (this.f64648g * d15) + (this.f64646e * d14) + (d11 * d11 * d11);
        }

        @Override // h2.C6785c
        public final double a(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double d12 = 0.5d;
            double d13 = 0.5d;
            while (d12 > 0.01d) {
                d12 *= 0.5d;
                d13 = d(d13) < d11 ? d13 + d12 : d13 - d12;
            }
            double d14 = d13 - d12;
            double d15 = d(d14);
            double d16 = d13 + d12;
            double d17 = d(d16);
            double e11 = e(d14);
            return (((d11 - d15) * (e(d16) - e11)) / (d17 - d15)) + e11;
        }

        @Override // h2.C6785c
        public final double b(double d11) {
            double d12 = 0.5d;
            double d13 = 0.5d;
            while (d12 > 1.0E-4d) {
                d12 *= 0.5d;
                d13 = d(d13) < d11 ? d13 + d12 : d13 - d12;
            }
            double d14 = d13 - d12;
            double d15 = d13 + d12;
            return (e(d15) - e(d14)) / (d(d15) - d(d14));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015d, code lost:
    
        if (r21.equals("linear") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6785c c(String str) {
        char c11 = 3;
        char c12 = 0;
        char c13 = 2;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            m mVar = new m();
            mVar.f64644a = str;
            double[] dArr = new double[str.length() / 2];
            int indexOf = str.indexOf(40) + 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i11 = 0;
            while (indexOf2 != -1) {
                dArr[i11] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i11++;
            }
            dArr[i11] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr, i11 + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d11 = 1.0d / length2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            int i12 = 0;
            while (i12 < copyOf.length) {
                double d12 = copyOf[i12];
                int i13 = i12 + length2;
                dArr2[i13][c12] = d12;
                char c14 = c12;
                char c15 = c13;
                double d13 = i12 * d11;
                dArr3[i13] = d13;
                if (i12 > 0) {
                    int i14 = (length2 * 2) + i12;
                    dArr2[i14][c14] = d12 + 1.0d;
                    dArr3[i14] = d13 + 1.0d;
                    int i15 = i12 - 1;
                    dArr2[i15][c14] = (d12 - 1.0d) - d11;
                    dArr3[i15] = (d13 - 1.0d) - d11;
                }
                i12++;
                c12 = c14;
                c13 = c15;
            }
            h hVar = new h(dArr3, dArr2);
            System.out.println(" 0 " + hVar.b(0.0d));
            System.out.println(" 1 " + hVar.b(1.0d));
            mVar.f64697d = hVar;
            return mVar;
        }
        if (str.startsWith("Schlick")) {
            j jVar = new j();
            jVar.f64644a = str;
            int indexOf3 = str.indexOf(40);
            int indexOf4 = str.indexOf(44, indexOf3);
            jVar.f64681d = Double.parseDouble(str.substring(indexOf3 + 1, indexOf4).trim());
            int i16 = indexOf4 + 1;
            jVar.f64682e = Double.parseDouble(str.substring(i16, str.indexOf(44, i16)).trim());
            return jVar;
        }
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1102672091:
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new a("cubic(1, 1, 0, 0)");
            case 4:
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f64643c));
                return f64642b;
        }
    }

    public double a(double d11) {
        return d11;
    }

    public double b(double d11) {
        return 1.0d;
    }

    public final String toString() {
        return this.f64644a;
    }
}
