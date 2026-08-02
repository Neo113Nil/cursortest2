package O;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final float f8240a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8241b;

    public y(float f10, float f11) {
        this.f8240a = f10;
        this.f8241b = f11;
    }

    public final float a() {
        return this.f8240a;
    }

    public final float b() {
        return this.f8241b;
    }

    public final float[] c() {
        float f10 = this.f8240a;
        float f11 = this.f8241b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f8240a, yVar.f8240a) == 0 && Float.compare(this.f8241b, yVar.f8241b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f8240a) * 31) + Float.hashCode(this.f8241b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f8240a + ", y=" + this.f8241b + ')';
    }
}
