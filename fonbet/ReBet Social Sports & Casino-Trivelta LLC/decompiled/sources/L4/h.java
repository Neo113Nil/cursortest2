package L4;

/* loaded from: classes2.dex */
public class h extends a {

    /* renamed from: A, reason: collision with root package name */
    public static h f7014A;

    /* renamed from: B, reason: collision with root package name */
    public static h f7015B;

    public static h j0(Class cls) {
        return (h) new h().e(cls);
    }

    public static h k0(com.bumptech.glide.load.engine.j jVar) {
        return (h) new h().f(jVar);
    }

    public static h l0(int i10) {
        return m0(i10, i10);
    }

    public static h m0(int i10, int i11) {
        return (h) new h().T(i10, i11);
    }

    public static h n0(com.bumptech.glide.load.g gVar) {
        return (h) new h().a0(gVar);
    }

    public static h o0(boolean z10) {
        if (z10) {
            if (f7014A == null) {
                f7014A = (h) ((h) new h().c0(true)).b();
            }
            return f7014A;
        }
        if (f7015B == null) {
            f7015B = (h) ((h) new h().c0(false)).b();
        }
        return f7015B;
    }

    @Override // L4.a
    public boolean equals(Object obj) {
        return (obj instanceof h) && super.equals(obj);
    }

    @Override // L4.a
    public int hashCode() {
        return super.hashCode();
    }
}
