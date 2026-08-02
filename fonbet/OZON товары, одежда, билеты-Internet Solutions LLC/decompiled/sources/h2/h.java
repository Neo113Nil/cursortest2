package h2;

import java.lang.reflect.Array;

/* loaded from: classes8.dex */
public final class h extends AbstractC6784b {

    /* renamed from: a, reason: collision with root package name */
    private double[] f64672a;

    /* renamed from: b, reason: collision with root package name */
    private double[][] f64673b;

    /* renamed from: c, reason: collision with root package name */
    private double[][] f64674c;

    /* renamed from: d, reason: collision with root package name */
    double[] f64675d;

    public h(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f64675d = new double[length2];
        int i11 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i11, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = 0;
            while (i13 < i11) {
                int i14 = i13 + 1;
                double d11 = dArr[i14] - dArr[i13];
                double[] dArr5 = dArr3[i13];
                double d12 = (dArr2[i14][i12] - dArr2[i13][i12]) / d11;
                dArr5[i12] = d12;
                if (i13 == 0) {
                    dArr4[i13][i12] = d12;
                } else {
                    dArr4[i13][i12] = (dArr3[i13 - 1][i12] + d12) * 0.5d;
                }
                i13 = i14;
            }
            dArr4[i11][i12] = dArr3[length - 2][i12];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < length2; i16++) {
                double d13 = dArr3[i15][i16];
                if (d13 == 0.0d) {
                    dArr4[i15][i16] = 0.0d;
                    dArr4[i15 + 1][i16] = 0.0d;
                } else {
                    double d14 = dArr4[i15][i16] / d13;
                    int i17 = i15 + 1;
                    double d15 = dArr4[i17][i16] / d13;
                    double hypot = Math.hypot(d14, d15);
                    if (hypot > 9.0d) {
                        double d16 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i15];
                        double[] dArr7 = dArr3[i15];
                        dArr6[i16] = d14 * d16 * dArr7[i16];
                        dArr4[i17][i16] = d16 * d15 * dArr7[i16];
                    }
                }
            }
        }
        this.f64672a = dArr;
        this.f64673b = dArr2;
        this.f64674c = dArr4;
    }

    private static double g(double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d12 * d12;
        double d18 = d12 * 6.0d;
        double d19 = 6.0d * d17 * d13;
        double d21 = (d19 + ((d18 * d14) + (((-6.0d) * d17) * d14))) - (d18 * d13);
        double d22 = 3.0d * d11;
        return (d11 * d15) + (((((d22 * d15) * d17) + (((d22 * d16) * d17) + d21)) - (((2.0d * d11) * d16) * d12)) - (((4.0d * d11) * d15) * d12));
    }

    private static double i(double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d12 * d12;
        double d18 = d17 * d12;
        double d19 = 3.0d * d17;
        double d21 = d18 * 2.0d * d13;
        double d22 = ((d21 + ((d19 * d14) + (((-2.0d) * d18) * d14))) - (d19 * d13)) + d13;
        double d23 = d11 * d16;
        double d24 = (d23 * d18) + d22;
        double d25 = d11 * d15;
        return (d25 * d12) + ((((d18 * d25) + d24) - (d23 * d17)) - (((d11 * 2.0d) * d15) * d17));
    }

    @Override // h2.AbstractC6784b
    public final double b(double d11) {
        double d12;
        double d13;
        double h11;
        double[] dArr = this.f64672a;
        int length = dArr.length;
        double d14 = dArr[0];
        double[][] dArr2 = this.f64673b;
        if (d11 <= d14) {
            d12 = dArr2[0][0];
            d13 = d11 - d14;
            h11 = h(d14);
        } else {
            int i11 = length - 1;
            double d15 = dArr[i11];
            if (d11 < d15) {
                int i12 = 0;
                while (i12 < i11) {
                    double d16 = dArr[i12];
                    if (d11 == d16) {
                        return dArr2[i12][0];
                    }
                    int i13 = i12 + 1;
                    double d17 = dArr[i13];
                    if (d11 < d17) {
                        double d18 = d17 - d16;
                        double d19 = (d11 - d16) / d18;
                        double d21 = dArr2[i12][0];
                        double d22 = dArr2[i13][0];
                        double[][] dArr3 = this.f64674c;
                        return i(d18, d19, d21, d22, dArr3[i12][0], dArr3[i13][0]);
                    }
                    i12 = i13;
                }
                return 0.0d;
            }
            d12 = dArr2[i11][0];
            d13 = d11 - d15;
            h11 = h(d15);
        }
        return (h11 * d13) + d12;
    }

    @Override // h2.AbstractC6784b
    public final void c(double d11, double[] dArr) {
        double[] dArr2 = this.f64672a;
        int length = dArr2.length;
        double[][] dArr3 = this.f64673b;
        int i11 = 0;
        int length2 = dArr3[0].length;
        double d12 = dArr2[0];
        double[] dArr4 = this.f64675d;
        if (d11 <= d12) {
            e(d12, dArr4);
            for (int i12 = 0; i12 < length2; i12++) {
                dArr[i12] = ((d11 - dArr2[0]) * dArr4[i12]) + dArr3[0][i12];
            }
            return;
        }
        int i13 = length - 1;
        double d13 = dArr2[i13];
        if (d11 >= d13) {
            e(d13, dArr4);
            while (i11 < length2) {
                dArr[i11] = ((d11 - dArr2[i13]) * dArr4[i11]) + dArr3[i13][i11];
                i11++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d11 == dArr2[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = dArr3[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d14 = dArr2[i16];
            if (d11 < d14) {
                double d15 = dArr2[i14];
                double d16 = d14 - d15;
                double d17 = (d11 - d15) / d16;
                while (i11 < length2) {
                    double d18 = dArr3[i14][i11];
                    double d19 = dArr3[i16][i11];
                    double[][] dArr5 = this.f64674c;
                    dArr[i11] = i(d16, d17, d18, d19, dArr5[i14][i11], dArr5[i16][i11]);
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // h2.AbstractC6784b
    public final void d(double d11, float[] fArr) {
        double[] dArr = this.f64672a;
        int length = dArr.length;
        double[][] dArr2 = this.f64673b;
        int i11 = 0;
        int length2 = dArr2[0].length;
        double d12 = dArr[0];
        double[] dArr3 = this.f64675d;
        if (d11 <= d12) {
            e(d12, dArr3);
            for (int i12 = 0; i12 < length2; i12++) {
                fArr[i12] = (float) (((d11 - dArr[0]) * dArr3[i12]) + dArr2[0][i12]);
            }
            return;
        }
        int i13 = length - 1;
        double d13 = dArr[i13];
        if (d11 >= d13) {
            e(d13, dArr3);
            while (i11 < length2) {
                fArr[i11] = (float) (((d11 - dArr[i13]) * dArr3[i11]) + dArr2[i13][i11]);
                i11++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d11 == dArr[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) dArr2[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d14 = dArr[i16];
            if (d11 < d14) {
                double d15 = dArr[i14];
                double d16 = d14 - d15;
                double d17 = (d11 - d15) / d16;
                while (i11 < length2) {
                    double d18 = dArr2[i14][i11];
                    double d19 = dArr2[i16][i11];
                    double[][] dArr4 = this.f64674c;
                    fArr[i11] = (float) i(d16, d17, d18, d19, dArr4[i14][i11], dArr4[i16][i11]);
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // h2.AbstractC6784b
    public final void e(double d11, double[] dArr) {
        double[] dArr2 = this.f64672a;
        int length = dArr2.length;
        double[][] dArr3 = this.f64673b;
        int length2 = dArr3[0].length;
        double d12 = dArr2[0];
        if (d11 > d12) {
            d12 = dArr2[length - 1];
            if (d11 < d12) {
                d12 = d11;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d13 = dArr2[i12];
            if (d12 <= d13) {
                double d14 = dArr2[i11];
                double d15 = d13 - d14;
                double d16 = (d12 - d14) / d15;
                for (int i13 = 0; i13 < length2; i13++) {
                    double d17 = dArr3[i11][i13];
                    double d18 = dArr3[i12][i13];
                    double[][] dArr4 = this.f64674c;
                    dArr[i13] = g(d15, d16, d17, d18, dArr4[i11][i13], dArr4[i12][i13]) / d15;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // h2.AbstractC6784b
    public final double[] f() {
        return this.f64672a;
    }

    public final double h(double d11) {
        double[] dArr = this.f64672a;
        int length = dArr.length;
        double d12 = dArr[0];
        if (d11 >= d12) {
            d12 = dArr[length - 1];
            if (d11 < d12) {
                d12 = d11;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d13 = dArr[i12];
            if (d12 <= d13) {
                double d14 = dArr[i11];
                double d15 = d13 - d14;
                double[][] dArr2 = this.f64673b;
                double d16 = dArr2[i11][0];
                double d17 = dArr2[i12][0];
                double[][] dArr3 = this.f64674c;
                return g(d15, (d12 - d14) / d15, d16, d17, dArr3[i11][0], dArr3[i12][0]) / d15;
            }
            i11 = i12;
        }
        return 0.0d;
    }
}
