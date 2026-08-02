package Kj;

import Dj.q;
import Ej.j;
import Fj.C1158d;
import Gg.e;
import zendesk.talk.android.internal.call.d;

/* loaded from: classes5.dex */
public final class c implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final e f6734a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6735b;

    /* renamed from: c, reason: collision with root package name */
    public final e f6736c;

    /* renamed from: d, reason: collision with root package name */
    public final e f6737d;

    /* renamed from: e, reason: collision with root package name */
    public final e f6738e;

    /* renamed from: f, reason: collision with root package name */
    public final e f6739f;

    public c(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, e eVar6) {
        this.f6734a = eVar;
        this.f6735b = eVar2;
        this.f6736c = eVar3;
        this.f6737d = eVar4;
        this.f6738e = eVar5;
        this.f6739f = eVar6;
    }

    public static c a(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, e eVar6) {
        return new c(eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static b c(q qVar, d dVar, zendesk.talk.android.internal.call.b bVar, C1158d c1158d, Jj.d dVar2, j jVar) {
        return new b(qVar, dVar, bVar, c1158d, dVar2, jVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((q) this.f6734a.get(), (d) this.f6735b.get(), (zendesk.talk.android.internal.call.b) this.f6736c.get(), (C1158d) this.f6737d.get(), (Jj.d) this.f6738e.get(), (j) this.f6739f.get());
    }
}
