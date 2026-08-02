package h2;

/* loaded from: classes8.dex */
public final class l implements n {

    /* renamed from: b, reason: collision with root package name */
    private double f64689b;

    /* renamed from: c, reason: collision with root package name */
    private double f64690c;

    /* renamed from: d, reason: collision with root package name */
    private float f64691d;

    /* renamed from: e, reason: collision with root package name */
    private float f64692e;

    /* renamed from: f, reason: collision with root package name */
    private float f64693f;

    /* renamed from: g, reason: collision with root package name */
    private float f64694g;

    /* renamed from: h, reason: collision with root package name */
    private float f64695h;

    /* renamed from: a, reason: collision with root package name */
    double f64688a = 0.5d;

    /* renamed from: i, reason: collision with root package name */
    private int f64696i = 0;

    @Override // h2.n
    public final float a() {
        return 0.0f;
    }

    @Override // h2.n
    public final boolean b() {
        double d11 = this.f64692e - this.f64690c;
        double d12 = this.f64689b;
        double d13 = this.f64693f;
        return Math.sqrt((((d12 * d11) * d11) + ((d13 * d13) * ((double) this.f64694g))) / d12) <= ((double) this.f64695h);
    }

    public final void c(float f7, float f11, float f12, float f13, float f14, float f15, int i11) {
        this.f64690c = f11;
        this.f64688a = f14;
        this.f64692e = f7;
        this.f64689b = f13;
        this.f64694g = f12;
        this.f64695h = f15;
        this.f64696i = i11;
        this.f64691d = 0.0f;
    }

    @Override // h2.n
    public final float getInterpolation(float f7) {
        double d11 = f7 - this.f64691d;
        if (d11 > 0.0d) {
            double d12 = this.f64689b;
            double d13 = this.f64688a;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d12 / this.f64694g) * d11) * 4.0d)) + 1.0d);
            double d14 = d11 / sqrt;
            int i11 = 0;
            while (i11 < sqrt) {
                float f11 = this.f64692e;
                double d15 = f11;
                double d16 = this.f64690c;
                double d17 = d14;
                float f12 = this.f64693f;
                double d18 = f12;
                double d19 = ((-d12) * (d15 - d16)) - (d13 * d18);
                double d21 = this.f64694g;
                double d22 = (((d19 / d21) * d17) / 2.0d) + d18;
                double d23 = ((((-((((d17 * d22) / 2.0d) + d15) - d16)) * d12) - (d22 * d13)) / d21) * d17;
                float f13 = f12 + ((float) d23);
                this.f64693f = f13;
                float f14 = f11 + ((float) (((d23 / 2.0d) + d18) * d17));
                this.f64692e = f14;
                int i12 = this.f64696i;
                if (i12 > 0) {
                    if (f14 < 0.0f && (i12 & 1) == 1) {
                        this.f64692e = -f14;
                        this.f64693f = -f13;
                    }
                    float f15 = this.f64692e;
                    if (f15 > 1.0f && (i12 & 2) == 2) {
                        this.f64692e = 2.0f - f15;
                        this.f64693f = -this.f64693f;
                    }
                }
                i11++;
                d14 = d17;
            }
        }
        this.f64691d = f7;
        if (b()) {
            this.f64692e = (float) this.f64690c;
        }
        return this.f64692e;
    }
}
