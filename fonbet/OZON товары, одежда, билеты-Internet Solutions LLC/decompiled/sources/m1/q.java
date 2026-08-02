package m1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final double f73997a;

    /* renamed from: b, reason: collision with root package name */
    private final double f73998b;

    /* renamed from: c, reason: collision with root package name */
    private final double f73999c;

    /* renamed from: d, reason: collision with root package name */
    private final double f74000d;

    /* renamed from: e, reason: collision with root package name */
    private final double f74001e;

    /* renamed from: f, reason: collision with root package name */
    private final double f74002f;

    /* renamed from: g, reason: collision with root package name */
    private final double f74003g;

    public /* synthetic */ q(double d11, double d12, double d13, double d14, double d15) {
        this(d11, d12, d13, d14, d15, 0.0d, 0.0d);
    }

    public final double a() {
        return this.f73998b;
    }

    public final double b() {
        return this.f73999c;
    }

    public final double c() {
        return this.f74000d;
    }

    public final double d() {
        return this.f74001e;
    }

    public final double e() {
        return this.f74002f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Double.compare(this.f73997a, qVar.f73997a) == 0 && Double.compare(this.f73998b, qVar.f73998b) == 0 && Double.compare(this.f73999c, qVar.f73999c) == 0 && Double.compare(this.f74000d, qVar.f74000d) == 0 && Double.compare(this.f74001e, qVar.f74001e) == 0 && Double.compare(this.f74002f, qVar.f74002f) == 0 && Double.compare(this.f74003g, qVar.f74003g) == 0;
    }

    public final double f() {
        return this.f74003g;
    }

    public final double g() {
        return this.f73997a;
    }

    public final int hashCode() {
        return Double.hashCode(this.f74003g) + Pk0.g.a(Pk0.g.a(Pk0.g.a(Pk0.g.a(Pk0.g.a(Double.hashCode(this.f73997a) * 31, 31, this.f73998b), 31, this.f73999c), 31, this.f74000d), 31, this.f74001e), 31, this.f74002f);
    }

    @NotNull
    public final String toString() {
        return "TransferParameters(gamma=" + this.f73997a + ", a=" + this.f73998b + ", b=" + this.f73999c + ", c=" + this.f74000d + ", d=" + this.f74001e + ", e=" + this.f74002f + ", f=" + this.f74003g + ')';
    }

    public q(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f73997a = d11;
        this.f73998b = d12;
        this.f73999c = d13;
        this.f74000d = d14;
        this.f74001e = d15;
        this.f74002f = d16;
        this.f74003g = d17;
        if (Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d17) || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d15 < 0.0d || d15 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d15);
        }
        if (d15 == 0.0d && (d12 == 0.0d || d11 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d15 >= 1.0d && d14 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d12 == 0.0d || d11 == 0.0d) && d14 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d14 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d12 < 0.0d || d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
