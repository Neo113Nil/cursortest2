package net.time4j.calendar.astro;

import com.plaid.internal.EnumC3631g;
import net.time4j.G;
import net.time4j.H;
import net.time4j.tz.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class e {
    private static final /* synthetic */ e[] $VALUES;
    private static final int[] DG_X;
    private static final double[] DG_Y;
    private static final double[] DG_Z;

    /* renamed from: a, reason: collision with root package name */
    public static final e f57782a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f57783b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f57784c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f57785d;

    /* renamed from: e, reason: collision with root package name */
    public static final double[][] f57786e;

    public enum a extends e {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // net.time4j.calendar.astro.e
        public double e(double d10) {
            return Math.toDegrees(Math.asin(Math.sin(Math.toRadians(l(k(d10)))) * 0.39782d));
        }

        @Override // net.time4j.calendar.astro.e
        public double i(double d10) {
            double l10 = l(k(d10));
            double b10 = net.time4j.calendar.astro.a.b(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(l10)) * 0.91764d)));
            double floor = Math.floor(l10 / 90.0d) * 90.0d;
            return (b10 + floor) - (Math.floor(b10 / 90.0d) * 90.0d);
        }

        public final double k(double d10) {
            H n02 = net.time4j.calendar.astro.c.f(d10).h().n0(p.f58410k);
            return n02.P().v0() + (((Integer) n02.R().j(G.f57595y)).intValue() / 86400.0d);
        }

        public final double l(double d10) {
            double d11 = (d10 * 0.9856d) - 3.289d;
            return net.time4j.calendar.astro.a.b((Math.sin(Math.toRadians(d11)) * 1.916d) + d11 + (Math.sin(Math.toRadians(d11) * 2.0d) * 0.02d) + 282.634d);
        }
    }

    static {
        a aVar = new a("SIMPLE", 0);
        f57782a = aVar;
        e eVar = new e("NOAA", 1) { // from class: net.time4j.calendar.astro.e.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.astro.e
            public double e(double d10) {
                return Math.toDegrees(k(e.j(d10)));
            }

            @Override // net.time4j.calendar.astro.e
            public double i(double d10) {
                double j10 = e.j(d10);
                double radians = Math.toRadians(p(j10));
                return net.time4j.calendar.astro.a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(o(j10))) * Math.sin(radians), Math.cos(radians))));
            }

            public final double k(double d10) {
                return Math.asin(Math.sin(Math.toRadians(o(d10))) * Math.sin(Math.toRadians(p(d10))));
            }

            public final double l(double d10) {
                double radians = Math.toRadians(m(d10));
                return (Math.sin(radians) * (1.914602d - (((1.4E-5d * d10) + 0.004817d) * d10))) + (Math.sin(2.0d * radians) * (0.019993d - (d10 * 1.01E-4d))) + (Math.sin(radians * 3.0d) * 2.89E-4d);
            }

            public final double m(double d10) {
                return ((35999.05029d - (1.537E-4d * d10)) * d10) + 357.52911d;
            }

            public final double n(double d10) {
                return ((((3.032E-4d * d10) + 36000.76983d) * d10) + 280.46646d) % 360.0d;
            }

            public final double o(double d10) {
                return (((((((0.001813d * d10) - 5.9E-4d) * d10) - 46.815d) * d10) + 21.448d) / 3600.0d) + 23.433333333333334d + (Math.cos(Math.toRadians(125.04d - (d10 * 1934.136d))) * 0.00256d);
            }

            public final double p(double d10) {
                return ((n(d10) + l(d10)) - 0.00569d) - (Math.sin(Math.toRadians(125.04d - (d10 * 1934.136d))) * 0.00478d);
            }
        };
        f57783b = eVar;
        e eVar2 = new e("CC", 2) { // from class: net.time4j.calendar.astro.e.c
            {
                a aVar2 = null;
            }

            private double k(double d10) {
                return Math.asin(Math.sin(Math.toRadians(n(d10))) * Math.sin(Math.toRadians(e.d(d10, m(d10)))));
            }

            private double l(double d10) {
                return (((((4.8E-7d * d10) - 1.559E-4d) * d10) + 35999.0503d) * d10) + 357.5291d;
            }

            private double n(double d10) {
                return (((((((0.001813d * d10) - 5.9E-4d) * d10) - 46.815d) * d10) + 21.448d) / 3600.0d) + 23.433333333333334d;
            }

            @Override // net.time4j.calendar.astro.e
            public double e(double d10) {
                return f(d10, "declination");
            }

            @Override // net.time4j.calendar.astro.e
            public double f(double d10, String str) {
                double j10 = e.j(d10);
                if (str.equals("declination")) {
                    return Math.toDegrees(k(j10));
                }
                if (!str.equals("right-ascension")) {
                    return str.equals("nutation") ? m(j10) : str.equals("obliquity") ? n(j10) : str.equals("mean-anomaly") ? l(j10) : str.equals("solar-longitude") ? e.d(j10, m(j10)) : str.equals("solar-latitude") ? 0.0d : Double.NaN;
                }
                double radians = Math.toRadians(e.d(j10, m(j10)));
                return net.time4j.calendar.astro.a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(n(j10))) * Math.sin(radians), Math.cos(radians))));
            }

            @Override // net.time4j.calendar.astro.e
            public double i(double d10) {
                return f(d10, "right-ascension");
            }

            public final double m(double d10) {
                return (Math.sin(Math.toRadians((((0.002063d * d10) - 1934.134d) * d10) + 124.9d)) * (-0.004778d)) - (Math.sin(Math.toRadians((((5.7E-4d * d10) + 72001.5377d) * d10) + 201.11d)) * 3.667E-4d);
            }
        };
        f57784c = eVar2;
        e eVar3 = new e("TIME4J", 3) { // from class: net.time4j.calendar.astro.e.d
            {
                a aVar2 = null;
            }

            private double k(double d10) {
                double[] dArr = new double[2];
                e.h(d10, dArr);
                return Math.asin(Math.sin(Math.toRadians(e.g(d10) + dArr[1])) * Math.sin(Math.toRadians(e.d(d10, dArr[0]))));
            }

            private double l(double d10) {
                return ((35999.05029d - (1.537E-4d * d10)) * d10) + 357.52911d;
            }

            @Override // net.time4j.calendar.astro.e
            public double e(double d10) {
                return f(d10, "declination");
            }

            @Override // net.time4j.calendar.astro.e
            public double f(double d10, String str) {
                double j10 = e.j(d10);
                if (str.equals("declination")) {
                    return Math.toDegrees(k(j10));
                }
                if (str.equals("right-ascension")) {
                    double[] dArr = new double[2];
                    e.h(j10, dArr);
                    double radians = Math.toRadians(e.d(j10, dArr[0]));
                    return net.time4j.calendar.astro.a.b(Math.toDegrees(Math.atan2(Math.cos(Math.toRadians(e.g(j10) + dArr[1])) * Math.sin(radians), Math.cos(radians))));
                }
                if (str.equals("nutation")) {
                    double[] dArr2 = new double[2];
                    e.h(j10, dArr2);
                    return dArr2[0];
                }
                if (str.equals("obliquity")) {
                    double[] dArr3 = new double[2];
                    e.h(j10, dArr3);
                    return e.g(j10) + dArr3[1];
                }
                if (str.equals("mean-anomaly")) {
                    return l(j10);
                }
                if (!str.equals("solar-longitude")) {
                    return str.equals("solar-latitude") ? 0.0d : Double.NaN;
                }
                double[] dArr4 = new double[2];
                e.h(j10, dArr4);
                return e.d(j10, dArr4[0]);
            }

            @Override // net.time4j.calendar.astro.e
            public double i(double d10) {
                return f(d10, "right-ascension");
            }
        };
        f57785d = eVar3;
        $VALUES = new e[]{aVar, eVar, eVar2, eVar3};
        DG_X = new int[]{403406, 195207, 119433, 112392, 3891, 2819, 1721, 660, 350, 334, EnumC3631g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, EnumC3631g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 114, 99, 93, 86, 78, 72, 68, 64, 46, 38, 37, 32, 29, 28, 27, 27, 25, 24, 21, 21, 20, 18, 17, 14, 13, 13, 13, 12, 10, 10, 10, 10};
        DG_Y = new double[]{270.54861d, 340.19128d, 63.91854d, 331.2622d, 317.843d, 86.631d, 240.052d, 310.26d, 247.23d, 260.87d, 297.82d, 343.14d, 166.79d, 81.53d, 3.5d, 132.75d, 182.95d, 162.03d, 29.8d, 266.4d, 249.2d, 157.6d, 257.8d, 185.1d, 69.9d, 8.0d, 197.1d, 250.4d, 65.3d, 162.7d, 341.5d, 291.6d, 98.5d, 146.7d, 110.0d, 5.2d, 342.6d, 230.9d, 256.1d, 45.3d, 242.9d, 115.2d, 151.8d, 285.3d, 53.3d, 126.6d, 205.7d, 85.9d, 146.1d};
        DG_Z = new double[]{0.9287892d, 35999.1376958d, 35999.4089666d, 35998.7287385d, 71998.20261d, 71998.4403d, 36000.35726d, 71997.4812d, 32964.4678d, -19.441d, 445267.1117d, 45036.884d, 3.1008d, 22518.4434d, -19.9739d, 65928.9345d, 9038.0293d, 3034.7684d, 33718.148d, 3034.448d, -2280.773d, 29929.992d, 31556.493d, 149.588d, 9037.75d, 107997.405d, -4444.176d, 151.771d, 67555.316d, 31556.08d, -4561.54d, 107996.706d, 1221.655d, 62894.167d, 31437.369d, 14578.298d, -31931.757d, 34777.243d, 1221.999d, 62894.511d, -4442.039d, 107997.909d, 119.066d, 16859.071d, -4.578d, 26895.292d, -39.127d, 12297.536d, 90073.778d};
        f57786e = new double[][]{new double[]{0.0d, 0.0d, 0.0d, 0.0d, 1.0d, -171996.0d, -174.2d, 92025.0d, 8.9d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 2.0d, -13187.0d, -1.6d, 5736.0d, -3.1d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 2.0d, -2274.0d, -0.2d, 977.0d, -0.5d}, new double[]{0.0d, 0.0d, 0.0d, 0.0d, 2.0d, 2062.0d, 0.2d, -895.0d, 0.5d}, new double[]{0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1426.0d, -3.4d, 54.0d, -0.1d}, new double[]{0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 712.0d, 0.1d, -7.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 2.0d, 2.0d, -517.0d, 1.2d, 224.0d, -0.6d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 1.0d, -386.0d, -0.4d, 200.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 2.0d, -301.0d, 0.0d, 129.0d, -0.1d}, new double[]{-2.0d, -1.0d, 0.0d, 2.0d, 2.0d, 217.0d, -0.5d, -95.0d, 0.3d}, new double[]{-2.0d, 0.0d, 1.0d, 0.0d, 0.0d, -158.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 1.0d, 129.0d, 0.1d, -70.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 2.0d, 2.0d, 123.0d, 0.0d, -53.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 0.0d, 0.0d, 63.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 0.0d, 1.0d, 63.0d, 0.1d, -33.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 2.0d, 2.0d, -59.0d, 0.0d, 26.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 0.0d, 1.0d, -58.0d, -0.1d, 32.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 1.0d, -51.0d, 0.0d, 27.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 0.0d, 0.0d, 48.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -2.0d, 2.0d, 1.0d, 46.0d, 0.0d, -24.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 2.0d, 2.0d, -38.0d, 0.0d, 16.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 2.0d, 2.0d, -31.0d, 0.0d, 13.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 0.0d, 0.0d, 29.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 2.0d, 2.0d, 29.0d, 0.0d, -12.0d, 0.0d}, new double[]{0.0d, 0.0d, 0.0d, 2.0d, 0.0d, 26.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 2.0d, 0.0d, -22.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -1.0d, 2.0d, 1.0d, 21.0d, 0.0d, -10.0d, 0.0d}, new double[]{0.0d, 2.0d, 0.0d, 0.0d, 0.0d, 17.0d, -0.1d, 0.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 0.0d, 1.0d, 16.0d, 0.0d, -8.0d, 0.0d}, new double[]{-2.0d, 2.0d, 0.0d, 2.0d, 2.0d, -16.0d, 0.1d, 7.0d, 0.0d}, new double[]{0.0d, 1.0d, 0.0d, 0.0d, 1.0d, -15.0d, 0.0d, 9.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 0.0d, 1.0d, -13.0d, 0.0d, 7.0d, 0.0d}, new double[]{0.0d, -1.0d, 0.0d, 0.0d, 1.0d, -12.0d, 0.0d, 6.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, -2.0d, 0.0d, 11.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, 0.0d, -1.0d, 2.0d, 1.0d, -10.0d, 0.0d, 5.0d, 0.0d}, new double[]{2.0d, 0.0d, 1.0d, 2.0d, 2.0d, -8.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, 1.0d, 0.0d, 2.0d, 2.0d, 7.0d, 0.0d, -3.0d, 0.0d}, new double[]{-2.0d, 1.0d, 1.0d, 0.0d, 0.0d, -7.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, -1.0d, 0.0d, 2.0d, 2.0d, -7.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 2.0d, 1.0d, -7.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 1.0d, 0.0d, 0.0d, 6.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 2.0d, 2.0d, 6.0d, 0.0d, -3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 1.0d, 2.0d, 1.0d, 6.0d, 0.0d, -3.0d, 0.0d}, new double[]{2.0d, 0.0d, -2.0d, 0.0d, 1.0d, -6.0d, 0.0d, 3.0d, 0.0d}, new double[]{2.0d, 0.0d, 0.0d, 0.0d, 1.0d, -6.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 5.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, -1.0d, 0.0d, 2.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 0.0d, 0.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{0.0d, 0.0d, 2.0d, 2.0d, 1.0d, -5.0d, 0.0d, 3.0d, 0.0d}, new double[]{-2.0d, 0.0d, 2.0d, 0.0d, 1.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 2.0d, 1.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, -2.0d, 0.0d, 4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-1.0d, 0.0d, 1.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{-2.0d, 1.0d, 0.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{1.0d, 0.0d, 0.0d, 0.0d, 0.0d, -4.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 1.0d, 2.0d, 0.0d, 3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, -2.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{-1.0d, -1.0d, 1.0d, 0.0d, 0.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 1.0d, 1.0d, 0.0d, 0.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, -1.0d, 1.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, -1.0d, -1.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{0.0d, 0.0d, 3.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}, new double[]{2.0d, -1.0d, 0.0d, 2.0d, 2.0d, -3.0d, 0.0d, 0.0d, 0.0d}};
    }

    public e(String str, int i10) {
    }

    public static double a(double d10) {
        return (Math.cos(Math.toRadians((d10 * 35999.01848d) + 177.63d)) * 9.74E-5d) - 0.005575d;
    }

    public static double d(double d10, double d11) {
        double d12 = 0.0d;
        for (int length = DG_X.length - 1; length >= 0; length--) {
            d12 += DG_X[length] * Math.sin(Math.toRadians(DG_Y[length] + (DG_Z[length] * d10)));
        }
        double a10 = (((((36000.76953744d * d10) + 282.7771834d) + ((d12 * 5.729577951308232d) / 1000000.0d)) + a(d10)) + d11) / 360.0d;
        return (a10 - Math.floor(a10)) * 360.0d;
    }

    public static double g(double d10) {
        return (((((((0.001813d * d10) - 5.9E-4d) * d10) - 46.815d) * d10) + 21.448d) / 3600.0d) + 23.433333333333334d;
    }

    public static void h(double d10, double[] dArr) {
        double radians = Math.toRadians((((((5.277768981496142E-6d * d10) - 0.0019142d) * d10) + 445267.11148d) * d10) + 297.85036d);
        double radians2 = Math.toRadians(((((((-3.3333333333333333E-6d) * d10) - 1.603E-4d) * d10) + 35999.05034d) * d10) + 357.52772d);
        double radians3 = Math.toRadians((((((1.7777777777777779E-4d * d10) + 0.0086972d) * d10) + 477198.867398d) * d10) + 134.96298d);
        double radians4 = Math.toRadians((((((3.0555810187307116E-6d * d10) - 0.0036825d) * d10) + 483202.017538d) * d10) + 93.27191d);
        double radians5 = Math.toRadians((((((2.222222222222222E-6d * d10) + 0.0020708d) * d10) - 1934.136261d) * d10) + 125.04452d);
        double d11 = 0.0d;
        double d12 = 0.0d;
        for (int length = f57786e.length - 1; length >= 0; length--) {
            double[] dArr2 = f57786e[length];
            double d13 = (dArr2[0] * radians) + (dArr2[1] * radians2) + (dArr2[2] * radians3) + (dArr2[3] * radians4) + (dArr2[4] * radians5);
            d11 += Math.sin(d13) * (dArr2[5] + (dArr2[6] * d10));
            d12 += Math.cos(d13) * (dArr2[7] + (dArr2[8] * d10));
        }
        dArr[0] = (d11 * 1.0E-4d) / 3600.0d;
        dArr[1] = (d12 * 1.0E-4d) / 3600.0d;
    }

    public static double j(double d10) {
        return (d10 - 2451545.0d) / 36525.0d;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public abstract double e(double d10);

    public double f(double d10, String str) {
        if (str.equals("declination")) {
            return e(d10);
        }
        if (str.equals("right-ascension")) {
            return i(d10);
        }
        return Double.NaN;
    }

    public abstract double i(double d10);

    public /* synthetic */ e(String str, int i10, a aVar) {
        this(str, i10);
    }
}
