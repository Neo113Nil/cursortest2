package j3;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: d, reason: collision with root package name */
    public static final Q f69042d = new Q(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f69043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69044b;

    /* renamed from: c, reason: collision with root package name */
    public final float f69045c;

    static {
        m3.N.L(0);
        m3.N.L(1);
        m3.N.L(3);
    }

    public Q(int i11, int i12) {
        this(i11, i12, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            Q q11 = (Q) obj;
            if (this.f69043a == q11.f69043a && this.f69044b == q11.f69044b && this.f69045c == q11.f69045c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f69045c) + ((((217 + this.f69043a) * 31) + this.f69044b) * 31);
    }

    public Q(int i11, int i12, float f7) {
        this.f69043a = i11;
        this.f69044b = i12;
        this.f69045c = f7;
    }
}
