package O0;

import O0.h;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public double f8296a;

    /* renamed from: b, reason: collision with root package name */
    public double f8297b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8298c;

    /* renamed from: d, reason: collision with root package name */
    public double f8299d;

    /* renamed from: e, reason: collision with root package name */
    public double f8300e;

    /* renamed from: f, reason: collision with root package name */
    public double f8301f;

    /* renamed from: g, reason: collision with root package name */
    public double f8302g;

    /* renamed from: h, reason: collision with root package name */
    public double f8303h;

    /* renamed from: i, reason: collision with root package name */
    public double f8304i;

    /* renamed from: j, reason: collision with root package name */
    public final h.p f8305j;

    public m() {
        this.f8296a = Math.sqrt(1500.0d);
        this.f8297b = 0.5d;
        this.f8298c = false;
        this.f8304i = Double.MAX_VALUE;
        this.f8305j = new h.p();
    }

    public float a() {
        return (float) this.f8297b;
    }

    public float b() {
        return (float) this.f8304i;
    }

    public float c() {
        double d10 = this.f8296a;
        return (float) (d10 * d10);
    }

    public final void d() {
        if (this.f8298c) {
            return;
        }
        if (this.f8304i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f8297b;
        if (d10 > 1.0d) {
            double d11 = this.f8296a;
            this.f8301f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f8297b;
            double d13 = this.f8296a;
            this.f8302g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f8303h = this.f8296a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f8298c = true;
    }

    public boolean e(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f8300e && ((double) Math.abs(f10 - b())) < this.f8299d;
    }

    public m f(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f8297b = f10;
        this.f8298c = false;
        return this;
    }

    public m g(float f10) {
        this.f8304i = f10;
        return this;
    }

    public m h(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f8296a = Math.sqrt(f10);
        this.f8298c = false;
        return this;
    }

    public void i(double d10) {
        double abs = Math.abs(d10);
        this.f8299d = abs;
        this.f8300e = abs * 62.5d;
    }

    public h.p j(double d10, double d11, long j10) {
        double pow;
        double cos;
        d();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f8304i;
        double d14 = this.f8297b;
        if (d14 > 1.0d) {
            double d15 = this.f8302g;
            double d16 = this.f8301f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            pow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f8301f * d12) * d18);
            double d19 = this.f8302g;
            double pow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f8301f;
            cos = pow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f8296a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            pow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double pow3 = d23 * Math.pow(2.718281828459045d, (-this.f8296a) * d12);
            double d24 = this.f8296a;
            cos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (pow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f8303h;
            double d26 = this.f8296a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            pow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f8303h * d12) * d13) + (Math.sin(this.f8303h * d12) * d27));
            double d28 = this.f8296a;
            double d29 = this.f8297b;
            double pow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f8303h;
            double sin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f8303h;
            cos = ((-d28) * pow * d29) + (pow4 * (sin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        h.p pVar = this.f8305j;
        pVar.f8289a = (float) (pow + this.f8304i);
        pVar.f8290b = (float) cos;
        return pVar;
    }

    public m(float f10) {
        this.f8296a = Math.sqrt(1500.0d);
        this.f8297b = 0.5d;
        this.f8298c = false;
        this.f8304i = Double.MAX_VALUE;
        this.f8305j = new h.p();
        this.f8304i = f10;
    }
}
