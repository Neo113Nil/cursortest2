package h2;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC6784b {

    /* renamed from: h2.b$a */
    static class a extends AbstractC6784b {

        /* renamed from: a, reason: collision with root package name */
        double f64640a;

        /* renamed from: b, reason: collision with root package name */
        double[] f64641b;

        @Override // h2.AbstractC6784b
        public final double b(double d11) {
            return this.f64641b[0];
        }

        @Override // h2.AbstractC6784b
        public final void c(double d11, double[] dArr) {
            double[] dArr2 = this.f64641b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // h2.AbstractC6784b
        public final void d(double d11, float[] fArr) {
            int i11 = 0;
            while (true) {
                double[] dArr = this.f64641b;
                if (i11 >= dArr.length) {
                    return;
                }
                fArr[i11] = (float) dArr[i11];
                i11++;
            }
        }

        @Override // h2.AbstractC6784b
        public final void e(double d11, double[] dArr) {
            for (int i11 = 0; i11 < this.f64641b.length; i11++) {
                dArr[i11] = 0.0d;
            }
        }

        @Override // h2.AbstractC6784b
        public final double[] f() {
            return new double[]{this.f64640a};
        }
    }

    public static AbstractC6784b a(int i11, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i11 = 2;
        }
        if (i11 == 0) {
            return new h(dArr, dArr2);
        }
        if (i11 != 2) {
            return new g(dArr, dArr2);
        }
        double d11 = dArr[0];
        double[] dArr3 = dArr2[0];
        a aVar = new a();
        aVar.f64640a = d11;
        aVar.f64641b = dArr3;
        return aVar;
    }

    public abstract double b(double d11);

    public abstract void c(double d11, double[] dArr);

    public abstract void d(double d11, float[] fArr);

    public abstract void e(double d11, double[] dArr);

    public abstract double[] f();
}
