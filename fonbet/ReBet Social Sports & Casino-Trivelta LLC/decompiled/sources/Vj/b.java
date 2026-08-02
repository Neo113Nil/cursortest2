package Vj;

import Ej.q;

/* loaded from: classes5.dex */
public final class b implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f12950a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f12951b;

    public b(a aVar, Gg.e eVar) {
        this.f12950a = aVar;
        this.f12951b = eVar;
    }

    public static b a(a aVar, Gg.e eVar) {
        return new b(aVar, eVar);
    }

    public static h c(a aVar, q qVar) {
        return (h) Gg.d.d(aVar.a(qVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f12950a, (q) this.f12951b.get());
    }
}
