package bo.app;

/* loaded from: classes.dex */
public final class oe {

    /* renamed from: a, reason: collision with root package name */
    public final int f25893a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25894b;

    public oe(int i10, int i11) {
        this.f25893a = i10;
        this.f25894b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return this.f25893a == oeVar.f25893a && this.f25894b == oeVar.f25894b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25894b) + (Integer.hashCode(this.f25893a) * 31);
    }

    public final String toString() {
        return "RateLimitEndpointConfig(capacity=" + this.f25893a + ", refillRate=" + this.f25894b + ")";
    }
}
