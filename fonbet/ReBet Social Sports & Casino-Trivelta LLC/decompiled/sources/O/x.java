package O;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final double f8233a;

    /* renamed from: b, reason: collision with root package name */
    public final double f8234b;

    /* renamed from: c, reason: collision with root package name */
    public final double f8235c;

    /* renamed from: d, reason: collision with root package name */
    public final double f8236d;

    /* renamed from: e, reason: collision with root package name */
    public final double f8237e;

    /* renamed from: f, reason: collision with root package name */
    public final double f8238f;

    /* renamed from: g, reason: collision with root package name */
    public final double f8239g;

    public x(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f8233a = d10;
        this.f8234b = d11;
        this.f8235c = d12;
        this.f8236d = d13;
        this.f8237e = d14;
        this.f8238f = d15;
        this.f8239g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f8234b;
    }

    public final double b() {
        return this.f8235c;
    }

    public final double c() {
        return this.f8236d;
    }

    public final double d() {
        return this.f8237e;
    }

    public final double e() {
        return this.f8238f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Double.compare(this.f8233a, xVar.f8233a) == 0 && Double.compare(this.f8234b, xVar.f8234b) == 0 && Double.compare(this.f8235c, xVar.f8235c) == 0 && Double.compare(this.f8236d, xVar.f8236d) == 0 && Double.compare(this.f8237e, xVar.f8237e) == 0 && Double.compare(this.f8238f, xVar.f8238f) == 0 && Double.compare(this.f8239g, xVar.f8239g) == 0;
    }

    public final double f() {
        return this.f8239g;
    }

    public final double g() {
        return this.f8233a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f8233a) * 31) + Double.hashCode(this.f8234b)) * 31) + Double.hashCode(this.f8235c)) * 31) + Double.hashCode(this.f8236d)) * 31) + Double.hashCode(this.f8237e)) * 31) + Double.hashCode(this.f8238f)) * 31) + Double.hashCode(this.f8239g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f8233a + ", a=" + this.f8234b + ", b=" + this.f8235c + ", c=" + this.f8236d + ", d=" + this.f8237e + ", e=" + this.f8238f + ", f=" + this.f8239g + ')';
    }

    public /* synthetic */ x(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
