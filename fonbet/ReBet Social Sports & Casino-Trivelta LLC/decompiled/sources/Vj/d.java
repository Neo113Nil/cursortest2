package Vj;

import Ej.j;

/* loaded from: classes5.dex */
public final class d implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f12958a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f12959b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f12960c;

    public d(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        this.f12958a = eVar;
        this.f12959b = eVar2;
        this.f12960c = eVar3;
    }

    public static d a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        return new d(eVar, eVar2, eVar3);
    }

    public static c c(h hVar, f fVar, j jVar) {
        return new c(hVar, fVar, jVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((h) this.f12958a.get(), (f) this.f12959b.get(), (j) this.f12960c.get());
    }
}
