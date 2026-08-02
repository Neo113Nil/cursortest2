package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.g;
import xsna.sdi;
import xsna.t590;
import xsna.voy;

/* compiled from: LayoutNodeLayoutDelegate.kt */
/* loaded from: classes11.dex */
public final class e {
    public final LayoutNode a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public g q;
    public LayoutNode.LayoutState d = LayoutNode.LayoutState.Idle;
    public final k p = new k(this);

    public e(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    public final o a() {
        return this.a.G.d;
    }

    public final void b() {
        LayoutNode.LayoutState layoutState = this.a.H.d;
        if (layoutState == LayoutNode.LayoutState.LayingOut || layoutState == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.p.C) {
                g(true);
            } else {
                f(true);
            }
        }
        if (layoutState == LayoutNode.LayoutState.LookaheadLayingOut) {
            g gVar = this.q;
            if (gVar == null || !gVar.w) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        g gVar = this.q;
        if (gVar != null) {
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
            e eVar = gVar.g;
            eVar.d = layoutState;
            k kVar = eVar.p;
            LayoutNode layoutNode = eVar.a;
            eVar.e = false;
            gVar.A = j;
            t590 snapshotObserver = voy.a(layoutNode).getSnapshotObserver();
            g.e eVar2 = gVar.B;
            snapshotObserver.a.d(layoutNode, snapshotObserver.b, eVar2);
            eVar.f = true;
            eVar.g = true;
            if (sdi.k(layoutNode)) {
                kVar.x = true;
                kVar.y = true;
            } else {
                kVar.w = true;
            }
            eVar.d = LayoutNode.LayoutState.Idle;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode I = this.a.I();
            e eVar = I != null ? I.H : null;
            if (eVar != null) {
                if (i == 0) {
                    eVar.d(eVar.l - 1);
                } else {
                    eVar.d(eVar.l + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode I = this.a.I();
            e eVar = I != null ? I.H : null;
            if (eVar != null) {
                if (i == 0) {
                    eVar.e(eVar.o - 1);
                } else {
                    eVar.e(eVar.o + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        k kVar = this.p;
        e eVar = kVar.g;
        Object obj = kVar.t;
        LayoutNode layoutNode = this.a;
        if ((obj != null || eVar.a().c() != null) && kVar.s) {
            kVar.s = false;
            kVar.t = eVar.a().c();
            LayoutNode I = layoutNode.I();
            if (I != null) {
                LayoutNode.f0(I, false, 7);
            }
        }
        g gVar = this.q;
        if (gVar != null) {
            e eVar2 = gVar.g;
            if (!(gVar.z == null && eVar2.a().w1().q.c() == null) && gVar.y) {
                gVar.y = false;
                gVar.z = eVar2.a().w1().q.c();
                if (sdi.k(layoutNode)) {
                    LayoutNode I2 = layoutNode.I();
                    if (I2 != null) {
                        LayoutNode.f0(I2, false, 7);
                        return;
                    }
                    return;
                }
                LayoutNode I3 = layoutNode.I();
                if (I3 != null) {
                    LayoutNode.d0(I3, false, 7);
                }
            }
        }
    }
}
