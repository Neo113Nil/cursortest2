package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zqd extends wtc implements tkd {
    public long o;
    public float p;
    public Function1 q;
    public wla r;
    public kgj s;
    public g9i t;
    public boolean u;
    public boolean v;
    public nwf w;
    public nwf x;
    public final xjd y = new xjd(this, 1);

    public zqd(long j, float f, wla wlaVar, Function1 function1) {
        this.o = j;
        this.p = f;
        this.q = function1;
        this.r = wlaVar;
    }

    @Override // defpackage.tkd
    public final void Z() {
        n1();
    }

    @Override // defpackage.wtc
    public final void c1() {
        kgj kgjVar = this.s;
        if (kgjVar != null) {
            kgjVar.b();
        }
        this.s = t6a.G(this, this.y);
        n1();
    }

    @Override // defpackage.wtc
    public final void d1() {
        kgj kgjVar = this.s;
        if (kgjVar != null) {
            kgjVar.b();
        }
        l1();
    }

    @Override // defpackage.wtc
    public final void e1() {
        l1();
        g9i g9iVar = this.t;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.t = null;
        this.u = false;
        this.w = null;
        this.x = null;
    }

    public final void k1(float f, nwf nwfVar, nwf nwfVar2) {
        float a;
        this.w = nwfVar;
        if (nwfVar2 != null || this.r == null) {
            if (nwfVar2 != null) {
                nwfVar.getClass();
                long j = nwfVar2.a;
                long j2 = nwfVar2.b;
                a = nwfVar.a((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
            } else {
                long j3 = nwfVar.e;
                a = nwfVar.a(0, 0, (int) (j3 >> 32), (int) j3);
            }
            boolean z = a > f || a == 1.0f;
            if (z != this.u) {
                this.u = z;
                g9i g9iVar = this.t;
                rq3 rq3Var = null;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                this.t = null;
                if (z != this.v) {
                    if (!z || this.o <= 0) {
                        m1();
                    } else {
                        this.t = xw3.L(Y0(), null, null, new ppa(this, rq3Var, 20), 3);
                    }
                }
            }
        }
    }

    public final void l1() {
        g9i g9iVar = this.t;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.t = null;
        this.u = false;
        if (this.v) {
            m1();
        }
    }

    public final void m1() {
        g9i g9iVar = this.t;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.t = null;
        this.q.invoke(Boolean.valueOf(this.u));
        this.v = this.u;
    }

    public final void n1() {
        if (this.r != null) {
            z1a.R(this, new jmc(this, 19));
            return;
        }
        if (this.x != null) {
            this.x = null;
            nwf nwfVar = this.w;
            if (nwfVar != null) {
                k1(this.p, nwfVar, null);
            }
        }
    }
}
