package h2;

/* loaded from: classes8.dex */
public final class g extends AbstractC6784b {

    /* renamed from: a, reason: collision with root package name */
    private double[] f64669a;

    /* renamed from: b, reason: collision with root package name */
    private double[][] f64670b;

    /* renamed from: c, reason: collision with root package name */
    double[] f64671c;

    public g(double[] dArr, double[][] dArr2) {
        int length = dArr2[0].length;
        this.f64671c = new double[length];
        this.f64669a = dArr;
        this.f64670b = dArr2;
        if (length <= 2) {
            return;
        }
        double d11 = 0.0d;
        int i11 = 0;
        while (true) {
            double d12 = d11;
            if (i11 >= dArr.length) {
                return;
            }
            double d13 = dArr2[i11][0];
            if (i11 > 0) {
                Math.hypot(d13 - d11, d13 - d12);
            }
            i11++;
            d11 = d13;
        }
    }

    @Override // h2.AbstractC6784b
    public final double b(double d11) {
        double d12;
        double d13;
        double g10;
        double[] dArr = this.f64669a;
        int length = dArr.length;
        double d14 = dArr[0];
        double[][] dArr2 = this.f64670b;
        if (d11 <= d14) {
            d12 = dArr2[0][0];
            d13 = d11 - d14;
            g10 = g(d14);
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
                        double d18 = (d11 - d16) / (d17 - d16);
                        return (dArr2[i13][0] * d18) + ((1.0d - d18) * dArr2[i12][0]);
                    }
                    i12 = i13;
                }
                return 0.0d;
            }
            d12 = dArr2[i11][0];
            d13 = d11 - d15;
            g10 = g(d15);
        }
        return (g10 * d13) + d12;
    }

    @Override // h2.AbstractC6784b
    public final void c(double d11, double[] dArr) {
        double[] dArr2 = this.f64669a;
        int length = dArr2.length;
        double[][] dArr3 = this.f64670b;
        int i11 = 0;
        int length2 = dArr3[0].length;
        double d12 = dArr2[0];
        double[] dArr4 = this.f64671c;
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
                double d16 = (d11 - d15) / (d14 - d15);
                while (i11 < length2) {
                    dArr[i11] = (dArr3[i16][i11] * d16) + ((1.0d - d16) * dArr3[i14][i11]);
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // h2.AbstractC6784b
    public final void d(double d11, float[] fArr) {
        double[] dArr = this.f64669a;
        int length = dArr.length;
        double[][] dArr2 = this.f64670b;
        int i11 = 0;
        int length2 = dArr2[0].length;
        double d12 = dArr[0];
        double[] dArr3 = this.f64671c;
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
                double d16 = (d11 - d15) / (d14 - d15);
                while (i11 < length2) {
                    fArr[i11] = (float) ((dArr2[i16][i11] * d16) + ((1.0d - d16) * dArr2[i14][i11]));
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r12 >= r5) goto L4;
     */
    @Override // h2.AbstractC6784b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(double d11, double[] dArr) {
        double[] dArr2 = this.f64669a;
        int length = dArr2.length;
        double[][] dArr3 = this.f64670b;
        int length2 = dArr3[0].length;
        double d12 = dArr2[0];
        if (d11 > d12) {
            d12 = dArr2[length - 1];
        }
        d11 = d12;
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d13 = dArr2[i12];
            if (d11 <= d13) {
                double d14 = d13 - dArr2[i11];
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = (dArr3[i12][i13] - dArr3[i11][i13]) / d14;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // h2.AbstractC6784b
    public final double[] f() {
        return this.f64669a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r9 >= r3) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double g(double d11) {
        double[] dArr = this.f64669a;
        int length = dArr.length;
        double d12 = dArr[0];
        if (d11 >= d12) {
            d12 = dArr[length - 1];
        }
        d11 = d12;
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d13 = dArr[i12];
            if (d11 <= d13) {
                double d14 = d13 - dArr[i11];
                double[][] dArr2 = this.f64670b;
                return (dArr2[i12][0] - dArr2[i11][0]) / d14;
            }
            i11 = i12;
        }
        return 0.0d;
    }
}
