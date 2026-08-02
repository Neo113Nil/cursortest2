package Fj;

/* loaded from: classes5.dex */
public final class s implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f3762a;

    public s(Gg.e eVar) {
        this.f3762a = eVar;
    }

    public static s a(Gg.e eVar) {
        return new s(eVar);
    }

    public static r c(Gj.d dVar) {
        return new r(dVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Gj.d) this.f3762a.get());
    }
}
