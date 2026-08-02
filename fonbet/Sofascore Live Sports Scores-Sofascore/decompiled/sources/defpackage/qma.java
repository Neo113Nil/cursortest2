package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qma extends wdd {
    public static final gtj U;
    public oma S;
    public pma T;

    static {
        gtj n = yqo.n();
        int i = r13.j;
        n.v(r13.f);
        n.D(1.0f);
        n.E(1);
        U = n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qma(wma wmaVar, oma omaVar) {
        super(wmaVar);
        this.S = omaVar;
        this.T = wmaVar.h != null ? new pma(this) : null;
        if ((((wtc) omaVar).a.c & 512) == 0) {
            return;
        }
        pvd.j();
        throw null;
    }

    @Override // defpackage.g1c
    public final int B(int i) {
        oma omaVar = this.S;
        wdd wddVar = this.p;
        wddVar.getClass();
        return omaVar.h(this, wddVar, i);
    }

    @Override // defpackage.g1c
    public final int G(int i) {
        oma omaVar = this.S;
        wdd wddVar = this.p;
        wddVar.getClass();
        return omaVar.b(this, wddVar, i);
    }

    public final void G1() {
        if (this.j) {
            return;
        }
        p1();
        wdd wddVar = this.p;
        wddVar.getClass();
        wddVar.k = this.k;
        z0().b();
        wddVar.k = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H1(oma omaVar) {
        if (omaVar.equals(this.S) || (((wtc) omaVar).a.c & 512) == 0) {
            this.S = omaVar;
        } else {
            pvd.j();
        }
    }

    @Override // defpackage.g1c
    public final qhe J(long j) {
        m0(j);
        oma omaVar = this.S;
        wdd wddVar = this.p;
        wddVar.getClass();
        x1(omaVar.k(this, wddVar, j));
        o1();
        return this;
    }

    @Override // defpackage.wdd
    public final void Z0() {
        if (this.T == null) {
            this.T = new pma(this);
        }
    }

    @Override // defpackage.wdd, defpackage.qhe
    public final void a0(float f, long j, n29 n29Var) {
        u1(j, f, null, n29Var);
        G1();
    }

    @Override // defpackage.g1c
    public final int b(int i) {
        oma omaVar = this.S;
        wdd wddVar = this.p;
        wddVar.getClass();
        return omaVar.e(this, wddVar, i);
    }

    @Override // defpackage.qhe
    public final void b0(long j, float f, Function1 function1) {
        u1(j, f, function1, null);
        G1();
    }

    @Override // defpackage.wdd
    public final vkb c1() {
        return this.T;
    }

    @Override // defpackage.wdd
    public final wtc e1() {
        return ((wtc) this.S).a;
    }

    @Override // defpackage.tkb
    public final int p0(jo joVar) {
        pma pmaVar = this.T;
        if (pmaVar == null) {
            return t6a.o(this, joVar);
        }
        h0d h0dVar = pmaVar.t;
        int d = h0dVar.d(joVar);
        if (d >= 0) {
            return h0dVar.c[d];
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.g1c
    public final int s(int i) {
        oma omaVar = this.S;
        wdd wddVar = this.p;
        wddVar.getClass();
        return omaVar.m(this, wddVar, i);
    }

    @Override // defpackage.wdd
    public final void t1(uj2 uj2Var, n29 n29Var) {
        wdd wddVar;
        wdd wddVar2 = this.p;
        wddVar2.getClass();
        wddVar2.V0(uj2Var, n29Var);
        if (!((xy) zma.a(this.o)).getShowLayoutBounds() || (wddVar = this.p) == null) {
            return;
        }
        if (c7a.a(this.c, wddVar.c) && r6a.b(wddVar.z, 0L)) {
            return;
        }
        long j = this.c;
        uj2Var.d(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, U);
    }
}
