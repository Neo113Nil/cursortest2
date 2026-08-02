package Wj;

/* loaded from: classes5.dex */
public final class d implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f13340a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f13341b;

    public d(Gg.e eVar, Gg.e eVar2) {
        this.f13340a = eVar;
        this.f13341b = eVar2;
    }

    public static d a(Gg.e eVar, Gg.e eVar2) {
        return new d(eVar, eVar2);
    }

    public static c c(i iVar, g gVar) {
        return new c(iVar, gVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((i) this.f13340a.get(), (g) this.f13341b.get());
    }
}
