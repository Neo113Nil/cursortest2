package Hj;

/* loaded from: classes5.dex */
public final class h implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5037a;

    public h(Gg.e eVar) {
        this.f5037a = eVar;
    }

    public static h a(Gg.e eVar) {
        return new h(eVar);
    }

    public static g c(Xj.d dVar) {
        return new g(dVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((Xj.d) this.f5037a.get());
    }
}
