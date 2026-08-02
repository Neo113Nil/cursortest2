package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sxj extends nnh {
    public final nnh e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxj(nnh nnhVar, Function1 function1, boolean z, boolean z2) {
        super(0L, rnh.e);
        Function1 e;
        z1h z1hVar = snh.a;
        this.e = nnhVar;
        this.f = z;
        this.g = z2;
        this.h = snh.i(function1, (nnhVar == null || (e = nnhVar.e()) == null) ? snh.j.e : e, z);
        this.i = waa.v();
    }

    @Override // defpackage.nnh
    public final void c() {
        nnh nnhVar;
        this.c = true;
        if (!this.g || (nnhVar = this.e) == null) {
            return;
        }
        nnhVar.c();
    }

    @Override // defpackage.nnh
    public final rnh d() {
        return v().d();
    }

    @Override // defpackage.nnh
    public final Function1 e() {
        return this.h;
    }

    @Override // defpackage.nnh
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.nnh
    public final long g() {
        return v().g();
    }

    @Override // defpackage.nnh
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.nnh
    public final void k() {
        zm2.M();
        throw null;
    }

    @Override // defpackage.nnh
    public final void l() {
        zm2.M();
        throw null;
    }

    @Override // defpackage.nnh
    public final void m() {
        v().m();
    }

    @Override // defpackage.nnh
    public final void n(qdi qdiVar) {
        v().n(qdiVar);
    }

    @Override // defpackage.nnh
    public final nnh u(Function1 function1) {
        Function1 i = snh.i(function1, this.h, true);
        return !this.f ? snh.e(v().u(null), i, true) : v().u(i);
    }

    public final nnh v() {
        nnh nnhVar = this.e;
        return nnhVar == null ? snh.j : nnhVar;
    }
}
