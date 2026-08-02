package m0;

/* renamed from: m0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8009p0 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f73842c;

    /* renamed from: d, reason: collision with root package name */
    private double f73843d;

    /* renamed from: e, reason: collision with root package name */
    private double f73844e;

    /* renamed from: f, reason: collision with root package name */
    private double f73845f;

    /* renamed from: a, reason: collision with root package name */
    private float f73840a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    private double f73841b = Math.sqrt(50.0d);

    /* renamed from: g, reason: collision with root package name */
    private float f73846g = 1.0f;

    public final float a() {
        return this.f73846g;
    }

    public final float b() {
        double d11 = this.f73841b;
        return (float) (d11 * d11);
    }

    public final void c(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f73846g = f7;
        this.f73842c = false;
    }

    public final void d(float f7) {
        this.f73840a = f7;
    }

    public final void e(float f7) {
        double d11 = this.f73841b;
        if (((float) (d11 * d11)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f73841b = Math.sqrt(f7);
        this.f73842c = false;
    }

    public final long f(float f7, float f11, long j11) {
        double cos;
        double d11;
        if (!this.f73842c) {
            if (this.f73840a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f12 = this.f73846g;
            double d12 = f12;
            double d13 = d12 * d12;
            if (f12 > 1.0f) {
                double d14 = this.f73841b;
                double d15 = d13 - 1;
                this.f73843d = (Math.sqrt(d15) * d14) + ((-f12) * d14);
                double d16 = -this.f73846g;
                double d17 = this.f73841b;
                this.f73844e = (d16 * d17) - (Math.sqrt(d15) * d17);
            } else if (f12 >= 0.0f && f12 < 1.0f) {
                this.f73845f = Math.sqrt(1 - d13) * this.f73841b;
            }
            this.f73842c = true;
        }
        float f13 = f7 - this.f73840a;
        double d18 = j11 / 1000.0d;
        float f14 = this.f73846g;
        if (f14 > 1.0f) {
            double d19 = f13;
            double d21 = this.f73844e;
            double d22 = ((d21 * d19) - f11) / (d21 - this.f73843d);
            double d23 = d19 - d22;
            d11 = (Math.exp(this.f73843d * d18) * d22) + (Math.exp(d21 * d18) * d23);
            double d24 = this.f73844e;
            double exp = Math.exp(d24 * d18) * d23 * d24;
            double d25 = this.f73843d;
            cos = (Math.exp(d25 * d18) * d22 * d25) + exp;
        } else if (f14 == 1.0f) {
            double d26 = this.f73841b;
            double d27 = f13;
            double d28 = (d26 * d27) + f11;
            double d29 = (d28 * d18) + d27;
            d11 = Math.exp((-d26) * d18) * d29;
            double exp2 = Math.exp((-this.f73841b) * d18) * d29;
            double d31 = -this.f73841b;
            cos = (exp2 * d31) + (Math.exp(d31 * d18) * d28);
        } else {
            double d32 = 1 / this.f73845f;
            double d33 = this.f73841b;
            double d34 = f13;
            double d35 = ((f14 * d33 * d34) + f11) * d32;
            double exp3 = Math.exp((-f14) * d33 * d18) * ((Math.sin(this.f73845f * d18) * d35) + (Math.cos(this.f73845f * d18) * d34));
            double d36 = this.f73841b;
            double d37 = (-d36) * exp3 * this.f73846g;
            double exp4 = Math.exp((-r7) * d36 * d18);
            double d38 = this.f73845f;
            double sin = Math.sin(d38 * d18) * (-d38) * d34;
            double d39 = this.f73845f;
            cos = (((Math.cos(d39 * d18) * d35 * d39) + sin) * exp4) + d37;
            d11 = exp3;
        }
        return Cf0.O.a((float) (d11 + this.f73840a), (float) cos);
    }
}
