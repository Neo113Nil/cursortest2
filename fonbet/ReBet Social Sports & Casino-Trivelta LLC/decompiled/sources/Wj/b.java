package Wj;

import Ej.q;

/* loaded from: classes5.dex */
public final class b implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f13332a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f13333b;

    public b(a aVar, Gg.e eVar) {
        this.f13332a = aVar;
        this.f13333b = eVar;
    }

    public static b a(a aVar, Gg.e eVar) {
        return new b(aVar, eVar);
    }

    public static i c(a aVar, q qVar) {
        return (i) Gg.d.d(aVar.a(qVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f13332a, (q) this.f13333b.get());
    }
}
