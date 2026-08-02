package net.time4j.calendar.astro;

import java.util.concurrent.TimeUnit;
import li.AbstractC5469c;
import net.time4j.A;
import net.time4j.H;

/* loaded from: classes5.dex */
public enum d {
    NEW_MOON(0),
    FIRST_QUARTER(90),
    FULL_MOON(180),
    LAST_QUARTER(270);


    /* renamed from: a, reason: collision with root package name */
    public final transient int f57781a;
    private static final int[] FACTORS = {100, 1000, 10000, 100000};

    /* renamed from: f, reason: collision with root package name */
    public static final A f57780f = H.U(2000, 1, 6, 18, 13, 42).L();
    private static final int[] W_NEW_FULL = {0, 1, 0, 0, 1, 1, 2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final int[] W_QUARTER = {0, 1, 1, 0, 0, 1, 2, 0, 0, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final int[] X_NEW_FULL = {0, 1, 0, 0, -1, 1, 2, 0, 0, 1, 0, 1, 1, -1, 2, 0, 3, 1, 0, 1, -1, -1, 1, 0};
    private static final int[] X_QUARTER = {0, 1, 1, 0, 0, -1, 2, 0, 0, 0, -1, 1, 1, 2, 1, -1, 0, 1, -2, 1, 3, 0, -1, 1};
    private static final int[] Y_NEW_FULL = {1, 0, 2, 0, 1, 1, 0, 1, 1, 2, 3, 0, 0, 2, 1, 2, 0, 1, 2, 1, 1, 1, 3, 4};
    private static final int[] Y_QUARTER = {1, 0, 1, 2, 0, 1, 0, 1, 1, 3, 2, 0, 0, 1, 2, 1, 2, 1, 1, 1, 0, 2, 1, 3};
    private static final int[] Z_NEW_FULL = {0, 0, 0, 2, 0, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 0, -2, 2, 2, 2, -2, 0, 0};
    private static final int[] Z_QUARTER = {0, 0, 0, 0, 2, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 2, 2, 0, -2, 0, -2, 2, 0};
    private static final double[] V_NEW = {-0.4072d, 0.17241d, 0.01608d, 0.01039d, 0.00739d, -0.00514d, 0.00208d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};
    private static final double[] V_FULL = {-0.40614d, 0.17302d, 0.01614d, 0.01043d, 0.00734d, -0.00515d, 0.00209d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};
    private static final double[] V_QUARTER = {-0.62801d, 0.17172d, -0.01183d, 0.00862d, 0.00804d, 0.00454d, 0.00204d, -0.0018d, -7.0E-4d, -4.0E-4d, -3.4E-4d, 3.2E-4d, 3.2E-4d, -2.8E-4d, 2.7E-4d, -5.0E-5d, 4.0E-5d, -4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, 2.0E-5d, 2.0E-5d, -2.0E-5d};

    d(int i10) {
        this.f57781a = i10;
    }

    public static double d(double d10, double d11, double d12, double d13) {
        return (((0.00306d - ((d10 * 3.8E-4d) * e(d11))) + (e(d12) * 2.6E-4d)) - (e(d12 - d11) * 2.0E-5d)) + (e(d12 + d11) * 2.0E-5d) + (e(d13 * 2.0d) * 2.0E-5d);
    }

    public static double e(double d10) {
        return Math.cos((d10 * 3.141592653589793d) / 180.0d);
    }

    public static double h(double d10) {
        return Math.sin((d10 * 3.141592653589793d) / 180.0d);
    }

    public A a(int i10) {
        double d10 = i10 + (this.f57781a / 360.0d);
        double d11 = d10 / 1236.85d;
        double d12 = d11 * d11;
        double d13 = 1.0d - (((7.4E-6d * d11) + 0.002516d) * d11);
        double d14 = ((29.1053567d * d10) + 2.5534d) - (((1.1E-7d * d11) + 1.4E-6d) * d12);
        double d15 = (385.81693528d * d10) + 201.5643d + ((((1.238E-5d - (5.8E-8d * d11)) * d11) + 0.0107582d) * d12);
        double d16 = (390.67050284d * d10) + 160.7108d + (((((1.1E-8d * d11) - 2.27E-6d) * d11) - 0.0016118d) * d12);
        double sin = ((((29.530588861d * d10) + 2451550.09766d) + (((((7.3E-10d * d11) - 1.5E-7d) * d11) + 1.5437E-4d) * d12)) - (Math.sin(Math.toRadians((124.7746d - (1.56375588d * d10)) + (((2.15E-6d * d11) + 0.0020672d) * d12))) * 1.7E-4d)) + g(d13, d14, d15, d16);
        if (this == FIRST_QUARTER) {
            sin += d(d13, d14, d15, d16);
        } else if (this == LAST_QUARTER) {
            sin -= d(d13, d14, d15, d16);
        }
        double[] dArr = {((0.107408d * d10) + 299.77d) - (d12 * 0.009173d), 3.25E-4d, (0.016321d * d10) + 251.88d, 1.65E-4d, (26.651886d * d10) + 251.83d, 1.64E-4d, (36.412478d * d10) + 349.42d, 1.26E-4d, (18.206239d * d10) + 84.66d, 1.1E-4d, (53.303771d * d10) + 141.74d, 6.2E-5d, (2.453732d * d10) + 207.14d, 6.0E-5d, (7.30686d * d10) + 154.84d, 5.6E-5d, (27.261239d * d10) + 34.52d, 4.7E-5d, (0.121824d * d10) + 207.19d, 4.2E-5d, (1.844379d * d10) + 291.34d, 4.0E-5d, (24.198154d * d10) + 161.72d, 3.7E-5d, (25.513099d * d10) + 239.56d, 3.5E-5d, (d10 * 3.592518d) + 331.55d, 2.3E-5d};
        for (int i11 = 0; i11 < 28; i11 += 2) {
            sin += dArr[i11 + 1] * Math.sin(Math.toRadians(dArr[i11]));
        }
        return (A) c.f(sin).h().y(A.f57507o, TimeUnit.SECONDS);
    }

    public A b(A a10) {
        int f10 = f(a10);
        A a11 = a(f10);
        int i10 = f10;
        while (a11.c0(a10)) {
            i10++;
            a11 = a(i10);
        }
        if (i10 <= f10) {
            while (true) {
                i10--;
                A a12 = a(i10);
                if (a12.c0(a10)) {
                    break;
                }
                a11 = a12;
            }
        }
        return a11;
    }

    public A c(A a10) {
        int f10 = f(a10);
        A a11 = a(f10);
        int i10 = f10;
        while (!a11.c0(a10)) {
            i10--;
            a11 = a(i10);
        }
        if (i10 >= f10) {
            while (((A) a11.E(29L, TimeUnit.DAYS)).c0(a10)) {
                i10++;
                A a12 = a(i10);
                if (!a12.c0(a10)) {
                    break;
                }
                a11 = a12;
            }
        }
        return a11;
    }

    public final int f(A a10) {
        return AbstractC5469c.g(Math.round((f57780f.F(a10, TimeUnit.DAYS) / 29.530588861d) - (this.f57781a / 360.0d)));
    }

    public final double g(double d10, double d11, double d12, double d13) {
        d dVar = NEW_MOON;
        double[] dArr = this == dVar ? V_NEW : this == FULL_MOON ? V_FULL : V_QUARTER;
        int[] iArr = (this == dVar || this == FULL_MOON) ? W_NEW_FULL : W_QUARTER;
        int[] iArr2 = (this == dVar || this == FULL_MOON) ? X_NEW_FULL : X_QUARTER;
        int[] iArr3 = (this == dVar || this == FULL_MOON) ? Y_NEW_FULL : Y_QUARTER;
        int[] iArr4 = (this == dVar || this == FULL_MOON) ? Z_NEW_FULL : Z_QUARTER;
        double d14 = 0.0d;
        for (int i10 = 23; i10 >= 0; i10--) {
            double d15 = dArr[i10];
            int i11 = iArr[i10];
            if (i11 != 1) {
                if (i11 == 2) {
                    d15 *= d10;
                } else {
                    d14 += d15 * h((iArr2[i10] * d11) + (iArr3[i10] * d12) + (iArr4[i10] * d13));
                }
            }
            d15 *= d10;
            d14 += d15 * h((iArr2[i10] * d11) + (iArr3[i10] * d12) + (iArr4[i10] * d13));
        }
        return d14;
    }
}
