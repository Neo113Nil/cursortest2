package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bw4 extends wtc {
    public final int o = xdd.e(this);
    public wtc p;

    @Override // defpackage.wtc
    public final void a1() {
        super.a1();
        for (wtc wtcVar = this.p; wtcVar != null; wtcVar = wtcVar.f) {
            wtcVar.j1(this.h);
            if (!wtcVar.n) {
                wtcVar.a1();
            }
        }
    }

    @Override // defpackage.wtc
    public final void b1() {
        for (wtc wtcVar = this.p; wtcVar != null; wtcVar = wtcVar.f) {
            wtcVar.b1();
        }
        super.b1();
    }

    @Override // defpackage.wtc
    public final void f1() {
        super.f1();
        for (wtc wtcVar = this.p; wtcVar != null; wtcVar = wtcVar.f) {
            wtcVar.f1();
        }
    }

    @Override // defpackage.wtc
    public final void g1() {
        for (wtc wtcVar = this.p; wtcVar != null; wtcVar = wtcVar.f) {
            wtcVar.g1();
        }
        super.g1();
    }

    @Override // defpackage.wtc
    public final void h1() {
        super.h1();
        for (wtc wtcVar = this.p; wtcVar != null; wtcVar = wtcVar.f) {
            wtcVar.h1();
        }
    }

    @Override // defpackage.wtc
    public final void i1(wtc wtcVar) {
        this.a = wtcVar;
        for (wtc wtcVar2 = this.p; wtcVar2 != null; wtcVar2 = wtcVar2.f) {
            wtcVar2.i1(wtcVar);
        }
    }

    @Override // defpackage.wtc
    public final void j1(wdd wddVar) {
        this.h = wddVar;
        for (wtc wtcVar = this.p; wtcVar != null; wtcVar = wtcVar.f) {
            wtcVar.j1(wddVar);
        }
    }

    public final xv4 k1(xv4 xv4Var) {
        wtc wtcVar = ((wtc) xv4Var).a;
        if (wtcVar != xv4Var) {
            wtc wtcVar2 = xv4Var instanceof wtc ? (wtc) xv4Var : null;
            wtc wtcVar3 = wtcVar2 != null ? wtcVar2.e : null;
            if (wtcVar != this.a || !Intrinsics.c(wtcVar3, this)) {
                a70.r("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (wtcVar.n) {
                r3a.b("Cannot delegate to an already attached node");
            }
            wtcVar.i1(this.a);
            int i = this.c;
            int f = xdd.f(wtcVar);
            wtcVar.c = f;
            int i2 = this.c;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof oma)) {
                r3a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + wtcVar);
            }
            wtcVar.f = this.p;
            this.p = wtcVar;
            wtcVar.e = this;
            m1(f | this.c, false);
            if (this.n) {
                if (i3 == 0 || (i & 2) != 0) {
                    j1(this.h);
                } else {
                    c40 c40Var = c6o.c0(this).F;
                    this.a.j1(null);
                    c40Var.r();
                }
                wtcVar.a1();
                wtcVar.g1();
                if (!wtcVar.n) {
                    r3a.b("autoInvalidateInsertedNode called on unattached node");
                }
                xdd.a(wtcVar, -1, 1);
            }
        }
        return xv4Var;
    }

    public final void l1(xv4 xv4Var) {
        wtc wtcVar = null;
        for (wtc wtcVar2 = this.p; wtcVar2 != null; wtcVar2 = wtcVar2.f) {
            if (wtcVar2 == xv4Var) {
                boolean z = wtcVar2.n;
                if (z) {
                    h0d h0dVar = xdd.a;
                    if (!z) {
                        r3a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    xdd.a(wtcVar2, -1, 2);
                    wtcVar2.h1();
                    wtcVar2.b1();
                }
                wtcVar2.i1(wtcVar2);
                wtcVar2.d = 0;
                wtc wtcVar3 = wtcVar2.f;
                if (wtcVar == null) {
                    this.p = wtcVar3;
                } else {
                    wtcVar.f = wtcVar3;
                }
                wtcVar2.f = null;
                wtcVar2.e = null;
                int i = this.c;
                int f = xdd.f(this);
                m1(f, true);
                if (this.n && (i & 2) != 0 && (f & 2) == 0) {
                    c40 c40Var = c6o.c0(this).F;
                    this.a.j1(null);
                    c40Var.r();
                    return;
                }
                return;
            }
            wtcVar = wtcVar2;
        }
        cp4.g(xv4Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void m1(int i, boolean z) {
        wtc wtcVar;
        int i2 = this.c;
        this.c = i;
        if (i2 != i) {
            wtc wtcVar2 = this.a;
            if (wtcVar2 == this) {
                this.d = i;
            }
            boolean z2 = this.n;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.c;
                    r2.c = i;
                    if (r2 == wtcVar2) {
                        break;
                    } else {
                        r2 = r2.e;
                    }
                }
                if (z && r2 == wtcVar2) {
                    i = xdd.f(wtcVar2);
                    wtcVar2.c = i;
                }
                int i3 = i | ((r2 == 0 || (wtcVar = r2.f) == null) ? 0 : wtcVar.d);
                for (wtc wtcVar3 = r2; wtcVar3 != null; wtcVar3 = wtcVar3.e) {
                    i3 |= wtcVar3.c;
                    wtcVar3.d = i3;
                }
            }
        }
    }
}
