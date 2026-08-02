package z3;

import D3.s;
import J3.k;
import j3.C7251G;
import java.util.List;

/* loaded from: classes8.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    private final C10977a f107020a;

    /* renamed from: b, reason: collision with root package name */
    private final List<C7251G> f107021b;

    public d(C10977a c10977a, List list) {
        this.f107020a = c10977a;
        this.f107021b = list;
    }

    @Override // z3.j
    public final k.a<h> a(g gVar, e eVar) {
        this.f107020a.getClass();
        return new s(new i(gVar, eVar), this.f107021b);
    }

    @Override // z3.j
    public final k.a<h> b() {
        this.f107020a.getClass();
        return new s(new i(), this.f107021b);
    }
}
