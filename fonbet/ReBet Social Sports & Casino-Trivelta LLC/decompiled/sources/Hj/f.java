package Hj;

/* loaded from: classes5.dex */
public final class f implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5035a;

    public f(Gg.e eVar) {
        this.f5035a = eVar;
    }

    public static f a(Gg.e eVar) {
        return new f(eVar);
    }

    public static e c(Xj.d dVar) {
        return new e(dVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((Xj.d) this.f5035a.get());
    }
}
