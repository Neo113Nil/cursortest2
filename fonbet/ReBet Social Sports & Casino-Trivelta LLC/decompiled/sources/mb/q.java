package mb;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final D f56481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56482b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56483c;

    public q(Class cls, int i10, int i11) {
        this(D.b(cls), i10, i11);
    }

    public static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q g(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q i(D d10) {
        return new q(d10, 0, 1);
    }

    public static q j(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q k(D d10) {
        return new q(d10, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q m(Class cls) {
        return new q(cls, 2, 0);
    }

    public D b() {
        return this.f56481a;
    }

    public boolean c() {
        return this.f56483c == 2;
    }

    public boolean d() {
        return this.f56483c == 0;
    }

    public boolean e() {
        return this.f56482b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f56481a.equals(qVar.f56481a) && this.f56482b == qVar.f56482b && this.f56483c == qVar.f56483c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f56482b == 2;
    }

    public int hashCode() {
        return ((((this.f56481a.hashCode() ^ 1000003) * 1000003) ^ this.f56482b) * 1000003) ^ this.f56483c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f56481a);
        sb2.append(", type=");
        int i10 = this.f56482b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(a(this.f56483c));
        sb2.append("}");
        return sb2.toString();
    }

    public q(D d10, int i10, int i11) {
        this.f56481a = (D) AbstractC5573C.c(d10, "Null dependency anInterface.");
        this.f56482b = i10;
        this.f56483c = i11;
    }
}
