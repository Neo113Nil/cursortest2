package j$.util;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f17616c = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17617a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17618b;

    public b0() {
        this.f17617a = false;
        this.f17618b = 0;
    }

    public b0(int i5) {
        this.f17617a = true;
        this.f17618b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        boolean z5 = b0Var.f17617a;
        boolean z7 = this.f17617a;
        return (z7 && z5) ? this.f17618b == b0Var.f17618b : z7 == z5;
    }

    public final int hashCode() {
        if (this.f17617a) {
            return this.f17618b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f17617a) {
            return "OptionalInt[" + this.f17618b + "]";
        }
        return "OptionalInt.empty";
    }
}
