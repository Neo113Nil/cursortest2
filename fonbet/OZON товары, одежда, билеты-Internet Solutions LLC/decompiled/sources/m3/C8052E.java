package m3;

/* renamed from: m3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8052E {

    /* renamed from: c, reason: collision with root package name */
    public static final C8052E f74274c = new C8052E(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f74275a;

    /* renamed from: b, reason: collision with root package name */
    private final int f74276b;

    static {
        new C8052E(0, 0);
    }

    public C8052E(int i11, int i12) {
        G10.a.c((i11 == -1 || i11 >= 0) && (i12 == -1 || i12 >= 0));
        this.f74275a = i11;
        this.f74276b = i12;
    }

    public final int a() {
        return this.f74276b;
    }

    public final int b() {
        return this.f74275a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8052E) {
            C8052E c8052e = (C8052E) obj;
            if (this.f74275a == c8052e.f74275a && this.f74276b == c8052e.f74276b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f74275a;
        return ((i11 >>> 16) | (i11 << 16)) ^ this.f74276b;
    }

    public final String toString() {
        return this.f74275a + "x" + this.f74276b;
    }
}
