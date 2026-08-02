package androidx.dynamicanimation.animation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public double f1806a;

    /* renamed from: b, reason: collision with root package name */
    public double f1807b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1808c;

    /* renamed from: d, reason: collision with root package name */
    public double f1809d;

    /* renamed from: e, reason: collision with root package name */
    public double f1810e;

    /* renamed from: f, reason: collision with root package name */
    public double f1811f;

    /* renamed from: g, reason: collision with root package name */
    public double f1812g;

    /* renamed from: h, reason: collision with root package name */
    public double f1813h;

    /* renamed from: i, reason: collision with root package name */
    public double f1814i;
    public final g j;

    public m() {
        this.f1806a = Math.sqrt(1500.0d);
        this.f1807b = 0.5d;
        this.f1808c = false;
        this.f1814i = Double.MAX_VALUE;
        this.j = new g();
    }

    public final void a(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f1807b = f6;
        this.f1808c = false;
    }

    public final void b(float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f1806a = Math.sqrt(f6);
        this.f1808c = false;
    }

    public final g c(double d10, double d11, long j) {
        double sin;
        double cos;
        if (!this.f1808c) {
            if (this.f1814i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f1807b;
            if (d12 > 1.0d) {
                double d13 = this.f1806a;
                this.f1811f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f1807b;
                double d15 = this.f1806a;
                this.f1812g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f1813h = Math.sqrt(1.0d - (d12 * d12)) * this.f1806a;
            }
            this.f1808c = true;
        }
        double d16 = j / 1000.0d;
        double d17 = d10 - this.f1814i;
        double d18 = this.f1807b;
        if (d18 > 1.0d) {
            double d19 = this.f1812g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f1811f);
            double d21 = d17 - d20;
            sin = (Math.pow(2.718281828459045d, this.f1811f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f1812g;
            double pow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f1811f;
            cos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + pow;
        } else if (d18 == 1.0d) {
            double d24 = this.f1806a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double pow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double pow3 = Math.pow(2.718281828459045d, (-this.f1806a) * d16) * d26;
            double d27 = -this.f1806a;
            cos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (pow3 * d27);
            sin = pow2;
        } else {
            double d28 = 1.0d / this.f1813h;
            double d29 = this.f1806a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            sin = ((Math.sin(this.f1813h * d16) * d30) + (Math.cos(this.f1813h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f1806a;
            double d32 = this.f1807b;
            double d33 = (-d31) * sin * d32;
            double pow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f1813h;
            double sin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f1813h;
            cos = (((Math.cos(d35 * d16) * d30 * d35) + sin2) * pow4) + d33;
        }
        float f6 = (float) (sin + this.f1814i);
        g gVar = this.j;
        gVar.f1783a = f6;
        gVar.f1784b = (float) cos;
        return gVar;
    }

    public m(float f6) {
        this.f1806a = Math.sqrt(1500.0d);
        this.f1807b = 0.5d;
        this.f1808c = false;
        this.j = new g();
        this.f1814i = f6;
    }
}
