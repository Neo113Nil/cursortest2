package Ij;

/* loaded from: classes5.dex */
public final class d implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5860a;

    public d(Gg.e eVar) {
        this.f5860a = eVar;
    }

    public static d a(Gg.e eVar) {
        return new d(eVar);
    }

    public static c c(Rj.c cVar) {
        return new c(cVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Rj.c) this.f5860a.get());
    }
}
