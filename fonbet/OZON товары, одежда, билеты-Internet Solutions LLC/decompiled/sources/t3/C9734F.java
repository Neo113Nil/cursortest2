package t3;

/* renamed from: t3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9734F {

    /* renamed from: c, reason: collision with root package name */
    public static final C9734F f98985c = new C9734F(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f98986a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98987b;

    public C9734F(int i11, boolean z11) {
        this.f98986a = i11;
        this.f98987b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9734F.class != obj.getClass()) {
            return false;
        }
        C9734F c9734f = (C9734F) obj;
        return this.f98986a == c9734f.f98986a && this.f98987b == c9734f.f98987b;
    }

    public final int hashCode() {
        return (this.f98986a << 1) + (this.f98987b ? 1 : 0);
    }
}
