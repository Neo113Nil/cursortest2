package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.o;
import com.unity3d.services.UnityAdsConstants;
import xsna.ahn;
import xsna.ci50;
import xsna.cp10;
import xsna.gt1;
import xsna.izs;
import xsna.k600;
import xsna.l5g;
import xsna.m600;
import xsna.mdu;
import xsna.op4;
import xsna.q630;
import xsna.s3q0;
import xsna.soy;
import xsna.t2o0;
import xsna.tdu;
import xsna.tra0;
import xsna.va2;
import xsna.voy;
import xsna.yq9;
import xsna.z8v;

/* compiled from: InnerNodeCoordinator.kt */
/* loaded from: classes11.dex */
public final class c extends o {
    public static final va2 a0;
    public final t2o0 Y;
    public a Z;

    /* compiled from: InnerNodeCoordinator.kt */
    public final class a extends m600 {
        @Override // xsna.zox
        public final int M(int i) {
            op4 H = this.q.q.H();
            cp10 a = H.a();
            LayoutNode layoutNode = (LayoutNode) H.a;
            return a.g(layoutNode.G.d, layoutNode.z(), i);
        }

        @Override // xsna.zo10
        public final tra0 N(long j) {
            v0(j);
            o oVar = this.q;
            ci50<LayoutNode> L = oVar.q.L();
            LayoutNode[] layoutNodeArr = L.b;
            int i = L.d;
            for (int i2 = 0; i2 < i; i2++) {
                layoutNodeArr[i2].H.q.k = LayoutNode.UsageByParent.NotUsed;
            }
            LayoutNode layoutNode = oVar.q;
            m600.W0(this, layoutNode.x.b(this, layoutNode.z(), j));
            return this;
        }

        @Override // xsna.zox
        public final int Z(int i) {
            op4 H = this.q.q.H();
            cp10 a = H.a();
            LayoutNode layoutNode = (LayoutNode) H.a;
            return a.c(layoutNode.G.d, layoutNode.z(), i);
        }

        @Override // xsna.m600
        public final void f1() {
            this.q.q.H.q.H0();
        }

        @Override // xsna.zox
        public final int j0(int i) {
            op4 H = this.q.q.H();
            cp10 a = H.a();
            LayoutNode layoutNode = (LayoutNode) H.a;
            return a.f(layoutNode.G.d, layoutNode.z(), i);
        }

        @Override // xsna.zox
        public final int l0(int i) {
            op4 H = this.q.q.H();
            cp10 a = H.a();
            LayoutNode layoutNode = (LayoutNode) H.a;
            return a.e(layoutNode.G.d, layoutNode.z(), i);
        }

        @Override // androidx.compose.ui.node.f
        public final int y0(gt1 gt1Var) {
            g gVar = this.q.q.H.q;
            k600 k600Var = gVar.t;
            if (!gVar.l) {
                e eVar = gVar.g;
                if (eVar.d == LayoutNode.LayoutState.LookaheadMeasuring) {
                    k600Var.f = true;
                    if (k600Var.b) {
                        eVar.f = true;
                        eVar.g = true;
                    }
                } else {
                    k600Var.g = true;
                }
            }
            a aVar = gVar.L().Z;
            if (aVar != null) {
                aVar.l = true;
            }
            gVar.K();
            a aVar2 = gVar.L().Z;
            if (aVar2 != null) {
                aVar2.l = false;
            }
            Integer num = (Integer) k600Var.i.get(gt1Var);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            this.v.i(gt1Var, intValue);
            return intValue;
        }
    }

    static {
        va2 va2Var = new va2();
        va2Var.d(l5g.e);
        va2Var.p(1.0f);
        va2Var.q(1);
        a0 = va2Var;
    }

    public c(LayoutNode layoutNode) {
        super(layoutNode);
        t2o0 t2o0Var = new t2o0();
        t2o0Var.e = 0;
        this.Y = t2o0Var;
        t2o0Var.i = this;
        this.Z = layoutNode.i != null ? new a(this) : null;
    }

    @Override // androidx.compose.ui.node.o
    public final q630.c D1() {
        return this.Y;
    }

    @Override // xsna.zox
    public final int M(int i) {
        op4 H = this.q.H();
        cp10 a2 = H.a();
        LayoutNode layoutNode = (LayoutNode) H.a;
        return a2.g(layoutNode.G.d, layoutNode.A(), i);
    }

    @Override // xsna.zo10
    public final tra0 N(long j) {
        if (this.s) {
            j = this.Z.e;
        }
        v0(j);
        LayoutNode layoutNode = this.q;
        ci50<LayoutNode> L = layoutNode.L();
        LayoutNode[] layoutNodeArr = L.b;
        int i = L.d;
        for (int i2 = 0; i2 < i; i2++) {
            layoutNodeArr[i2].H.p.m = LayoutNode.UsageByParent.NotUsed;
        }
        d2(layoutNode.x.b(this, layoutNode.A(), j));
        S1();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // androidx.compose.ui.node.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O1(o.e eVar, long j, z8v z8vVar, int i, boolean z) {
        int i2;
        boolean z2;
        LayoutNode layoutNode = this.q;
        boolean z3 = false;
        if (eVar.e(layoutNode)) {
            if (l2(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(h1(j, y1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = z8vVar.d;
            ci50<LayoutNode> K = layoutNode.K();
            LayoutNode[] layoutNodeArr = K.b;
            int i4 = K.d - 1;
            while (i4 >= 0) {
                LayoutNode layoutNode2 = layoutNodeArr[i4];
                if (layoutNode2.g()) {
                    eVar.d(layoutNode2, j, z8vVar, i2, z2);
                    long c = z8vVar.c();
                    if (ahn.q(c) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ahn.x(c) && !ahn.w(c) && !eVar.b(z8vVar, layoutNode2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            z8vVar.d = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // xsna.zox
    public final int Z(int i) {
        op4 H = this.q.H();
        cp10 a2 = H.a();
        LayoutNode layoutNode = (LayoutNode) H.a;
        return a2.c(layoutNode.G.d, layoutNode.A(), i);
    }

    @Override // androidx.compose.ui.node.o
    public final void Z1(yq9 yq9Var, mdu mduVar) {
        LayoutNode layoutNode = this.q;
        p a2 = voy.a(layoutNode);
        ci50<LayoutNode> K = layoutNode.K();
        LayoutNode[] layoutNodeArr = K.b;
        int i = K.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (layoutNode2.g()) {
                layoutNode2.x(yq9Var, mduVar);
            }
        }
        if (a2.getShowLayoutBounds()) {
            long j = this.d;
            yq9Var.i(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, a0);
        }
    }

    @Override // xsna.zox
    public final int j0(int i) {
        op4 H = this.q.H();
        cp10 a2 = H.a();
        LayoutNode layoutNode = (LayoutNode) H.a;
        return a2.f(layoutNode.G.d, layoutNode.A(), i);
    }

    @Override // xsna.zox
    public final int l0(int i) {
        op4 H = this.q.H();
        cp10 a2 = H.a();
        LayoutNode layoutNode = (LayoutNode) H.a;
        return a2.e(layoutNode.G.d, layoutNode.A(), i);
    }

    @Override // androidx.compose.ui.node.o
    public final void m1() {
        if (this.Z == null) {
            this.Z = new a(this);
        }
    }

    @Override // androidx.compose.ui.node.o, xsna.tra0
    public final void p0(long j, float f, izs<? super tdu, s3q0> izsVar) {
        super.p0(j, f, izsVar);
        if (this.k) {
            return;
        }
        this.q.H.p.F0();
    }

    @Override // androidx.compose.ui.node.o, xsna.tra0
    public final void q0(long j, float f, mdu mduVar) {
        super.q0(j, f, mduVar);
        if (this.k) {
            return;
        }
        this.q.H.p.F0();
    }

    @Override // androidx.compose.ui.node.o
    public final m600 w1() {
        return this.Z;
    }

    @Override // androidx.compose.ui.node.f
    public final int y0(gt1 gt1Var) {
        a aVar = this.Z;
        if (aVar != null) {
            return aVar.y0(gt1Var);
        }
        k kVar = this.q.H.p;
        soy soyVar = kVar.z;
        if (!kVar.n) {
            if (kVar.g.d == LayoutNode.LayoutState.Measuring) {
                soyVar.f = true;
                if (soyVar.b) {
                    kVar.x = true;
                    kVar.y = true;
                }
            } else {
                soyVar.g = true;
            }
        }
        c L = kVar.L();
        boolean z = L.l;
        L.l = true;
        kVar.K();
        L.l = z;
        Integer num = (Integer) soyVar.i.get(gt1Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
