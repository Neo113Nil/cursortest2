package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qd8 extends wtc implements be8, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View o;
    public ViewTreeObserver p;
    public final pd8 q = new pd8(this, 0);
    public final pd8 r = new pd8(this, 1);

    @Override // defpackage.be8
    public final void I(zd8 zd8Var) {
        zd8Var.b(false);
        zd8Var.a(this.q);
        zd8Var.d(this.r);
    }

    @Override // defpackage.wtc
    public final void c1() {
        ViewTreeObserver viewTreeObserver = pco.N(this).getViewTreeObserver();
        this.p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.wtc
    public final void d1() {
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.p = null;
        pco.N(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.o = null;
    }

    public final ne8 k1() {
        boolean z;
        if (!this.a.n) {
            r3a.b("visitLocalDescendants called on an unattached node");
        }
        wtc wtcVar = this.a;
        if ((wtcVar.d & 1024) != 0) {
            boolean z2 = false;
            for (wtc wtcVar2 = wtcVar.f; wtcVar2 != null; wtcVar2 = wtcVar2.f) {
                if ((wtcVar2.c & 1024) != 0) {
                    wtc wtcVar3 = wtcVar2;
                    i1d i1dVar = null;
                    while (wtcVar3 != null) {
                        if (wtcVar3 instanceof ne8) {
                            ne8 ne8Var = (ne8) wtcVar3;
                            if (z2) {
                                return ne8Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (wtcVar3.c & 1024) != 0 && (wtcVar3 instanceof bw4)) {
                            int i = 0;
                            for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                if ((wtcVar4.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        wtcVar3 = wtcVar4;
                                    } else {
                                        if (i1dVar == null) {
                                            i1dVar = new i1d(new wtc[16], 0);
                                        }
                                        if (wtcVar3 != null) {
                                            i1dVar.b(wtcVar3);
                                            wtcVar3 = null;
                                        }
                                        i1dVar.b(wtcVar4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        wtcVar3 = c6o.X(i1dVar);
                    }
                }
            }
        }
        a70.r("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (c6o.c0(this).n == null) {
            return;
        }
        View q = ok3.q(this);
        wd8 focusOwner = ((xy) c6o.d0(this)).getFocusOwner();
        ryd d0 = c6o.d0(this);
        boolean z2 = true;
        if (view != null && !view.equals(d0)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == q.getParent()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (view2 != null && !view2.equals(d0)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == q.getParent()) {
                    break;
                }
            }
        }
        z2 = false;
        if (z && z2) {
            this.o = view2;
            return;
        }
        if (z2) {
            this.o = view2;
            ne8 k1 = k1();
            if (k1.p1().d()) {
                return;
            }
            ml4.o0(k1);
            return;
        }
        if (!z) {
            this.o = null;
            return;
        }
        this.o = null;
        if (k1().p1().g()) {
            ((yd8) focusOwner).c(8, false, false);
        }
    }
}
