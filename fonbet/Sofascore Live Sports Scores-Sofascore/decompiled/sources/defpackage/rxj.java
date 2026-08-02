package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rxj extends c1d {
    public final c1d o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rxj(c1d c1dVar, Function1 function1, Function1 function12, boolean z, boolean z2) {
        super(0L, rnh.e, snh.i(function1, (c1dVar == null || (r0 = c1dVar.e()) == null) ? snh.j.e : r0, z), snh.j(function12, (c1dVar == null || (r9 = c1dVar.i()) == null) ? snh.j.f : r9));
        Function1 i;
        Function1 e;
        z1h z1hVar = snh.a;
        this.o = c1dVar;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = waa.v();
    }

    @Override // defpackage.c1d
    public final void B(y0d y0dVar) {
        zm2.M();
        throw null;
    }

    @Override // defpackage.c1d
    public final c1d C(Function1 function1, Function1 function12) {
        Function1 i = snh.i(function1, this.r, true);
        Function1 j = snh.j(function12, this.s);
        return !this.p ? new rxj(D().C(null, j), i, j, false, true) : D().C(i, j);
    }

    public final c1d D() {
        c1d c1dVar = this.o;
        return c1dVar == null ? snh.j : c1dVar;
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void c() {
        c1d c1dVar;
        this.c = true;
        if (!this.q || (c1dVar = this.o) == null) {
            return;
        }
        c1dVar.c();
    }

    @Override // defpackage.nnh
    public final rnh d() {
        return D().d();
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final Function1 e() {
        return this.r;
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.nnh
    public final long g() {
        return D().g();
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final int h() {
        return D().h();
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final Function1 i() {
        return this.s;
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void k() {
        zm2.M();
        throw null;
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void l() {
        zm2.M();
        throw null;
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void m() {
        D().m();
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void n(qdi qdiVar) {
        D().n(qdiVar);
    }

    @Override // defpackage.nnh
    public final void r(rnh rnhVar) {
        zm2.M();
        throw null;
    }

    @Override // defpackage.nnh
    public final void s(long j) {
        zm2.M();
        throw null;
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.c1d, defpackage.nnh
    public final nnh u(Function1 function1) {
        Function1 i = snh.i(function1, this.r, true);
        return !this.p ? snh.e(D().u(null), i, true) : D().u(i);
    }

    @Override // defpackage.c1d
    public final oea w() {
        return D().w();
    }

    @Override // defpackage.c1d
    public final y0d x() {
        return D().x();
    }

    @Override // defpackage.c1d
    /* renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
