package j$.util;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f17612c = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17613a;

    /* renamed from: b, reason: collision with root package name */
    public final double f17614b;

    public a0() {
        this.f17613a = false;
        this.f17614b = Double.NaN;
    }

    public a0(double d10) {
        this.f17613a = true;
        this.f17614b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        boolean z5 = a0Var.f17613a;
        boolean z7 = this.f17613a;
        return (z7 && z5) ? Double.compare(this.f17614b, a0Var.f17614b) == 0 : z7 == z5;
    }

    public final int hashCode() {
        if (!this.f17613a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f17614b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f17613a) {
            return "OptionalDouble[" + this.f17614b + "]";
        }
        return "OptionalDouble.empty";
    }
}
