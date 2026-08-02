package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.p;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1m;
import xsna.ci50;
import xsna.epx;
import xsna.k600;
import xsna.o6j;
import xsna.os9;
import xsna.p52;
import xsna.s3q0;
import xsna.sdi;
import xsna.tra0;
import xsna.utb;
import xsna.uzw;
import xsna.voy;

/* compiled from: MeasureAndLayoutDelegate.kt */
/* loaded from: classes11.dex */
public final class j {
    public final LayoutNode a;
    public boolean c;
    public boolean d;
    public o6j i;
    public final a1m b = new a1m();
    public final utb e = new utb();
    public final ci50<p.a> f = new ci50<>(new p.a[16]);
    public final long g = 1;
    public final ci50<a> h = new ci50<>(new a[16]);

    /* compiled from: MeasureAndLayoutDelegate.kt */
    public static final class a {
        public final LayoutNode a;
        public final boolean b;
        public final boolean c;

        public a(LayoutNode layoutNode, boolean z, boolean z2) {
            this.a = layoutNode;
            this.b = z;
            this.c = z2;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    public static final boolean a(j jVar, LayoutNode layoutNode, boolean z) {
        tra0.a placementScope;
        c cVar;
        LayoutNode I;
        LayoutNode layoutNode2 = jVar.a;
        boolean z2 = layoutNode.R;
        e eVar = layoutNode.H;
        if (!z2 && k(layoutNode)) {
            o6j o6jVar = layoutNode == layoutNode2 ? jVar.i : null;
            if (z) {
                r3 = eVar.e ? c(layoutNode, o6jVar) : false;
                if ((r3 || eVar.f) && epx.f(layoutNode.T(), Boolean.TRUE)) {
                    layoutNode.U();
                }
            } else {
                boolean d = layoutNode.E() ? d(layoutNode, o6jVar) : false;
                if (layoutNode.D() && (layoutNode == layoutNode2 || ((I = layoutNode.I()) != null && I.g() && eVar.p.v))) {
                    if (layoutNode == layoutNode2) {
                        if (layoutNode.D == LayoutNode.UsageByParent.NotUsed) {
                            layoutNode.u();
                        }
                        LayoutNode I2 = layoutNode.I();
                        if (I2 == null || (cVar = I2.G.c) == null || (placementScope = cVar.m) == null) {
                            placementScope = voy.a(layoutNode).getPlacementScope();
                        }
                        tra0.a.x(placementScope, eVar.p, 0, 0);
                    } else {
                        layoutNode.b0();
                    }
                    utb utbVar = jVar.e;
                    utbVar.getClass();
                    if (layoutNode.Q > 0) {
                        ((ci50) utbVar.b).b(layoutNode);
                        layoutNode.P = true;
                    }
                }
                r3 = d;
            }
            jVar.e();
        }
        return r3;
    }

    public static boolean c(LayoutNode layoutNode, o6j o6jVar) {
        boolean M0;
        LayoutNode layoutNode2 = layoutNode.i;
        e eVar = layoutNode.H;
        if (layoutNode2 == null) {
            return false;
        }
        if (o6jVar != null) {
            if (layoutNode2 != null) {
                M0 = eVar.q.M0(o6jVar.a);
            }
            M0 = false;
        } else {
            g gVar = eVar.q;
            o6j o6jVar2 = gVar != null ? gVar.o : null;
            if (o6jVar2 != null && layoutNode2 != null) {
                M0 = gVar.M0(o6jVar2.a);
            }
            M0 = false;
        }
        LayoutNode I = layoutNode.I();
        if (M0 && I != null) {
            if (I.i == null) {
                LayoutNode.f0(I, false, 3);
                return M0;
            }
            if (layoutNode.G() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.d0(I, false, 3);
                return M0;
            }
            if (layoutNode.G() == LayoutNode.UsageByParent.InLayoutBlock) {
                I.c0(false);
            }
        }
        return M0;
    }

    public static boolean d(LayoutNode layoutNode, o6j o6jVar) {
        boolean z;
        if (o6jVar != null) {
            if (layoutNode.D == LayoutNode.UsageByParent.NotUsed) {
                layoutNode.t();
            }
            z = layoutNode.H.p.M0(o6jVar.a);
        } else {
            k kVar = layoutNode.H.p;
            o6j o6jVar2 = kVar.k ? new o6j(kVar.e) : null;
            if (o6jVar2 != null) {
                if (layoutNode.D == LayoutNode.UsageByParent.NotUsed) {
                    layoutNode.t();
                }
                z = layoutNode.H.p.M0(o6jVar2.a);
            } else {
                z = false;
            }
        }
        LayoutNode I = layoutNode.I();
        if (z && I != null) {
            if (layoutNode.F() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.f0(I, false, 3);
                return z;
            }
            if (layoutNode.F() == LayoutNode.UsageByParent.InLayoutBlock) {
                I.e0(false);
            }
        }
        return z;
    }

    public static boolean i(LayoutNode layoutNode) {
        g gVar;
        k600 k600Var;
        if (layoutNode.H.e) {
            return (layoutNode.G() == LayoutNode.UsageByParent.NotUsed && ((gVar = layoutNode.H.q) == null || (k600Var = gVar.t) == null || !k600Var.f())) ? false : true;
        }
        return false;
    }

    public static boolean j(LayoutNode layoutNode) {
        if (!layoutNode.E()) {
            return false;
        }
        do {
            if (layoutNode.F() == LayoutNode.UsageByParent.NotUsed && !layoutNode.H.p.z.f()) {
                LayoutNode I = layoutNode.I();
                if ((I != null ? I.H.d : null) != LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.I();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.g());
        return true;
    }

    public static boolean k(LayoutNode layoutNode) {
        g gVar;
        k600 k600Var;
        e eVar = layoutNode.H;
        return layoutNode.g() || eVar.p.v || j(layoutNode) || epx.f(layoutNode.T(), Boolean.TRUE) || i(layoutNode) || eVar.p.z.f() || !((gVar = eVar.q) == null || (k600Var = gVar.t) == null || !k600Var.f());
    }

    public final void b(boolean z) {
        utb utbVar = this.e;
        if (z) {
            ci50 ci50Var = (ci50) utbVar.b;
            LayoutNode layoutNode = this.a;
            if (layoutNode.Q > 0) {
                ci50Var.g();
                ci50Var.b(layoutNode);
                layoutNode.P = true;
            }
        }
        if (((ci50) utbVar.b).d != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                utbVar.p();
                s3q0 s3q0Var = s3q0.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        ci50<a> ci50Var = this.h;
        int i = ci50Var.d;
        if (i != 0) {
            a[] aVarArr = ci50Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                a aVar = aVarArr[i2];
                LayoutNode layoutNode = aVar.a;
                boolean z = aVar.c;
                LayoutNode layoutNode2 = aVar.a;
                if (layoutNode.e()) {
                    if (aVar.b) {
                        LayoutNode.d0(layoutNode2, z, 2);
                    } else {
                        LayoutNode.f0(layoutNode2, z, 2);
                    }
                }
            }
            ci50Var.g();
        }
    }

    public final void f(LayoutNode layoutNode) {
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (epx.f(layoutNode2.T(), Boolean.TRUE) && !layoutNode2.R) {
                if (this.b.b(layoutNode2)) {
                    layoutNode2.U();
                }
                f(layoutNode2);
            }
        }
    }

    public final void g(LayoutNode layoutNode, boolean z) {
        if (!this.c) {
            uzw.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? layoutNode.H.e : layoutNode.E()) {
            uzw.a("node not yet measured");
        }
        h(layoutNode, z);
    }

    public final void h(LayoutNode layoutNode, boolean z) {
        g gVar;
        k600 k600Var;
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if ((!z && (layoutNode2.F() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode2.H.p.z.f())) || (z && (layoutNode2.G() == LayoutNode.UsageByParent.InMeasureBlock || ((gVar = layoutNode2.H.q) != null && (k600Var = gVar.t) != null && k600Var.f())))) {
                boolean k = sdi.k(layoutNode2);
                e eVar = layoutNode2.H;
                if (k && !z) {
                    if (eVar.e && this.b.b(layoutNode2)) {
                        o(layoutNode2, true);
                    } else {
                        g(layoutNode2, true);
                    }
                }
                if (z ? eVar.e : layoutNode2.E()) {
                    o(layoutNode2, z);
                }
                if (!(z ? eVar.e : layoutNode2.E())) {
                    h(layoutNode2, z);
                }
            }
        }
        if (z ? layoutNode.H.e : layoutNode.E()) {
            o(layoutNode, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(p52.n nVar) {
        boolean z;
        Object[] objArr;
        LayoutNode layoutNode;
        boolean z2;
        boolean o;
        a1m a1mVar = this.b;
        LayoutNode layoutNode2 = this.a;
        if (!layoutNode2.e()) {
            uzw.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.g()) {
            uzw.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            uzw.a("performMeasureAndLayout called during measure layout");
        }
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean c = a1mVar.c();
                os9 os9Var = a1mVar.a;
                if (c) {
                    z = false;
                    while (true) {
                        os9 os9Var2 = a1mVar.c;
                        os9 os9Var3 = a1mVar.b;
                        if (!((SortedSet) os9Var.c).isEmpty()) {
                            layoutNode = (LayoutNode) ((SortedSet) os9Var.c).first();
                            os9Var.h(layoutNode);
                            z2 = layoutNode.i != null;
                            objArr = false;
                        } else if (!((SortedSet) os9Var3.c).isEmpty()) {
                            layoutNode = (LayoutNode) ((SortedSet) os9Var3.c).first();
                            os9Var3.h(layoutNode);
                            z2 = layoutNode.i != null;
                            objArr = true;
                        } else {
                            if (((SortedSet) os9Var2.c).isEmpty()) {
                                break;
                            }
                            LayoutNode layoutNode3 = (LayoutNode) ((SortedSet) os9Var2.c).first();
                            os9Var2.h(layoutNode3);
                            objArr = true;
                            layoutNode = layoutNode3;
                            z2 = false;
                        }
                        if (objArr == true) {
                            o = a(this, layoutNode, z2);
                        } else {
                            o = o(layoutNode, z2);
                            if (layoutNode.H.f) {
                                a1mVar.a(layoutNode, Invalidation.LookaheadPlacement);
                            }
                            if (layoutNode.D()) {
                                a1mVar.a(layoutNode, Invalidation.Placement);
                            }
                        }
                        if (layoutNode == layoutNode2 && o) {
                            z = true;
                        }
                    }
                    if (nVar != null) {
                        nVar.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        ci50<p.a> ci50Var = this.f;
        p.a[] aVarArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            aVarArr[i2].h();
        }
        ci50Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(LayoutNode layoutNode, long j) {
        if (layoutNode.R) {
            return;
        }
        LayoutNode layoutNode2 = this.a;
        if (layoutNode.equals(layoutNode2)) {
            uzw.a("measureAndLayout called on root");
        }
        if (!layoutNode2.e()) {
            uzw.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.g()) {
            uzw.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            uzw.a("performMeasureAndLayout called during measure layout");
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                a1m a1mVar = this.b;
                a1mVar.a.h(layoutNode);
                a1mVar.b.h(layoutNode);
                a1mVar.c.h(layoutNode);
                if ((c(layoutNode, new o6j(j)) || layoutNode.H.f) && epx.f(layoutNode.T(), Boolean.TRUE)) {
                    layoutNode.U();
                }
                f(layoutNode);
                d(layoutNode, new o6j(j));
                if (layoutNode.D() && layoutNode.g()) {
                    layoutNode.b0();
                    utb utbVar = this.e;
                    utbVar.getClass();
                    if (layoutNode.Q > 0) {
                        ((ci50) utbVar.b).b(layoutNode);
                        layoutNode.P = true;
                    }
                }
                e();
            } finally {
            }
        }
        ci50<p.a> ci50Var = this.f;
        p.a[] aVarArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            aVarArr[i2].h();
        }
        ci50Var.g();
    }

    public final void n() {
        a1m a1mVar = this.b;
        if (a1mVar.c()) {
            LayoutNode layoutNode = this.a;
            if (!layoutNode.e()) {
                uzw.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.g()) {
                uzw.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                uzw.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((SortedSet) a1mVar.c.c).isEmpty() || ((SortedSet) a1mVar.a.c).isEmpty()) ? false : true) {
                        if (layoutNode.i != null) {
                            q(layoutNode, true);
                        } else {
                            p(layoutNode);
                        }
                    }
                    q(layoutNode, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean o(LayoutNode layoutNode, boolean z) {
        boolean z2 = false;
        if (!layoutNode.R && k(layoutNode)) {
            o6j o6jVar = layoutNode == this.a ? this.i : null;
            if (z) {
                if (layoutNode.H.e) {
                    z2 = c(layoutNode, o6jVar);
                }
            } else if (layoutNode.E()) {
                z2 = d(layoutNode, o6jVar);
            }
            e();
        }
        return z2;
    }

    public final void p(LayoutNode layoutNode) {
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (layoutNode2.F() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode2.H.p.z.f()) {
                if (sdi.k(layoutNode2)) {
                    q(layoutNode2, true);
                } else {
                    p(layoutNode2);
                }
            }
        }
    }

    public final void q(LayoutNode layoutNode, boolean z) {
        if (layoutNode.R) {
            return;
        }
        o6j o6jVar = layoutNode == this.a ? this.i : null;
        if (z) {
            c(layoutNode, o6jVar);
        } else {
            d(layoutNode, o6jVar);
        }
    }

    public final boolean r(LayoutNode layoutNode, boolean z) {
        int i = b.$EnumSwitchMapping$0[layoutNode.H.d.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.h.b(new a(layoutNode, false, z));
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.E() || z) {
                    layoutNode.H.p.w = true;
                    if (!layoutNode.R && (layoutNode.g() || j(layoutNode))) {
                        LayoutNode I = layoutNode.I();
                        if (I == null || !I.E()) {
                            this.b.a(layoutNode, Invalidation.Measurement);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        o6j o6jVar = this.i;
        if (o6jVar == null ? false : o6j.c(o6jVar.a, j)) {
            return;
        }
        if (this.c) {
            uzw.a("updateRootConstraints called while measuring");
        }
        this.i = new o6j(j);
        LayoutNode layoutNode = this.a;
        LayoutNode layoutNode2 = layoutNode.i;
        e eVar = layoutNode.H;
        if (layoutNode2 != null) {
            eVar.e = true;
        }
        eVar.p.w = true;
        this.b.a(layoutNode, layoutNode2 != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
    }
}
