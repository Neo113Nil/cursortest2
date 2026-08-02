package Ej;

/* loaded from: classes5.dex */
public final class b implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f3135a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3136b;

    public b(a aVar, Gg.e eVar) {
        this.f3135a = aVar;
        this.f3136b = eVar;
    }

    public static b a(a aVar, Gg.e eVar) {
        return new b(aVar, eVar);
    }

    public static Gj.f c(a aVar, Gj.i iVar) {
        return (Gj.f) Gg.d.d(aVar.a(iVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Gj.f get() {
        return c(this.f3135a, (Gj.i) this.f3136b.get());
    }
}
