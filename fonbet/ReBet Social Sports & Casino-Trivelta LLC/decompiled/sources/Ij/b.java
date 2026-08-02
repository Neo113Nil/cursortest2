package Ij;

import Ej.j;
import Fj.r;

/* loaded from: classes5.dex */
public final class b implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5853a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f5854b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f5855c;

    /* renamed from: d, reason: collision with root package name */
    public final Gg.e f5856d;

    /* renamed from: e, reason: collision with root package name */
    public final Gg.e f5857e;

    public b(Gg.e eVar, Gg.e eVar2, Gg.e eVar3, Gg.e eVar4, Gg.e eVar5) {
        this.f5853a = eVar;
        this.f5854b = eVar2;
        this.f5855c = eVar3;
        this.f5856d = eVar4;
        this.f5857e = eVar5;
    }

    public static b a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3, Gg.e eVar4, Gg.e eVar5) {
        return new b(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static a c(Wj.c cVar, c cVar2, e eVar, j jVar, r rVar) {
        return new a(cVar, cVar2, eVar, jVar, rVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Wj.c) this.f5853a.get(), (c) this.f5854b.get(), (e) this.f5855c.get(), (j) this.f5856d.get(), (r) this.f5857e.get());
    }
}
