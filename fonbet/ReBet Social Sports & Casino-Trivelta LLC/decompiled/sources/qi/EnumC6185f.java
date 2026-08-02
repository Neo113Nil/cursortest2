package qi;

import li.AbstractC5468b;
import li.InterfaceC5467a;

/* renamed from: qi.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC6185f {
    POSIX,
    UTC,
    TAI,
    GPS,
    TT,
    UT;

    public static double a(int i10, double d10) {
        double d11;
        double d12;
        if (i10 < -2000 || i10 > 3000) {
            throw new IllegalArgumentException("Year out of range: " + i10);
        }
        if (i10 <= 2050) {
            if (i10 >= 2018) {
                double d13 = d10 - 2000.0d;
                d11 = ((0.012125d * d13) + 0.0533d) * d13;
                d12 = 64.16d;
            } else if (i10 >= 2005) {
                double d14 = d10 - 2000.0d;
                d11 = ((((((4.2060317E-5d * d14) - 0.00112745d) * d14) + 0.014201d) * d14) + 0.171417d) * d14;
                d12 = 63.5934d;
            } else if (i10 >= 1986) {
                double d15 = d10 - 2000.0d;
                d11 = ((((((((2.373599E-5d * d15) + 6.51814E-4d) * d15) + 0.0017275d) * d15) - 0.060374d) * d15) + 0.3345d) * d15;
                d12 = 63.86d;
            } else {
                if (i10 >= 1961) {
                    double d16 = d10 - 1975.0d;
                    return ((((0.0d - (d16 / 718.0d)) * d16) + 1.067d) * d16) + 45.45d;
                }
                if (i10 >= 1941) {
                    double d17 = d10 - 1950.0d;
                    d11 = ((((d17 / 2547.0d) + 0.0d) * d17) + 0.407d) * d17;
                    d12 = 29.07d;
                } else if (i10 >= 1920) {
                    double d18 = d10 - 1920.0d;
                    d11 = ((((0.0020936d * d18) - 0.0761d) * d18) + 0.84493d) * d18;
                    d12 = 21.2d;
                } else {
                    if (i10 >= 1900) {
                        double d19 = d10 - 1900.0d;
                        return ((((((0.0061966d - (1.97E-4d * d19)) * d19) - 0.0598939d) * d19) + 1.494119d) * d19) - 2.79d;
                    }
                    if (i10 >= 1860) {
                        double d20 = d10 - 1860.0d;
                        d11 = ((((((((d20 / 233174.0d) - 4.473624E-4d) * d20) + 0.01680668d) * d20) - 0.251754d) * d20) + 0.5737d) * d20;
                        d12 = 7.62d;
                    } else if (i10 >= 1800) {
                        d11 = ((((((((((((8.75E-10d * r12) - 1.699E-7d) * r12) + 1.21272E-5d) * r12) - 3.7436E-4d) * r12) + 0.0041116d) * r12) + 0.0068612d) * r12) - 0.332447d) * (d10 - 1800.0d);
                        d12 = 13.72d;
                    } else if (i10 >= 1700) {
                        double d21 = d10 - 1700.0d;
                        d11 = ((((((d21 / 1174000.0d) + 1.3336E-4d) * d21) - 0.0059285d) * d21) + 0.1603d) * d21;
                        d12 = 8.83d;
                    } else if (i10 >= 1600) {
                        d11 = ((((r12 / 7129.0d) - 0.01532d) * r12) - 0.9808d) * (d10 - 1600.0d);
                        d12 = 120.0d;
                    } else if (i10 >= 500) {
                        d11 = ((((((((((0.0083572073d * r12) - 0.005050998d) * r12) - 0.8503463d) * r12) + 0.319781d) * r12) + 71.23472d) * r12) - 556.01d) * ((d10 - 1000.0d) / 100.0d);
                        d12 = 1574.2d;
                    } else if (i10 >= -500) {
                        d11 = ((((((((((0.0090316521d * r12) + 0.022174192d) * r12) - 0.1798452d) * r12) - 5.952053d) * r12) + 33.78311d) * r12) - 1014.41d) * (d10 / 100.0d);
                        d12 = 10583.6d;
                    }
                }
            }
            return d11 + d12;
        }
        double d22 = (d10 - 1820.0d) / 100.0d;
        return ((32.0d * d22) * d22) - 20.0d;
    }

    public static double b(int i10, int i11) {
        if (i11 >= 1 && i11 <= 12) {
            return a(i10, i10 + ((i11 - 0.5d) / 12.0d));
        }
        throw new IllegalArgumentException("Month out of range: " + i11);
    }

    public static double c(InterfaceC5467a interfaceC5467a) {
        int n10 = interfaceC5467a.n();
        int i10 = AbstractC5468b.e(n10) ? 366 : 365;
        int o10 = interfaceC5467a.o();
        int i11 = 1;
        int i12 = 0;
        for (int i13 = 1; i13 < o10; i13++) {
            i12 += AbstractC5468b.d(n10, i13);
        }
        int p10 = i12 + interfaceC5467a.p();
        if (p10 > i10) {
            throw new IllegalArgumentException(interfaceC5467a.toString());
        }
        if (n10 == -2001 && p10 == 365) {
            n10 = -2000;
        } else {
            i11 = p10;
        }
        return a(n10, n10 + ((i11 - 1.0d) / i10));
    }
}
