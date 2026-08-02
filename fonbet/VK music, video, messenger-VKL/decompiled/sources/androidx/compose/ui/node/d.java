package androidx.compose.ui.node;

import java.util.Map;
import xsna.dp10;
import xsna.gt1;
import xsna.h9x;
import xsna.izs;
import xsna.l5g;
import xsna.m600;
import xsna.mdu;
import xsna.n600;
import xsna.noy;
import xsna.o6j;
import xsna.q630;
import xsna.q9x;
import xsna.rdi;
import xsna.s3q0;
import xsna.srg0;
import xsna.td3;
import xsna.tdu;
import xsna.tra0;
import xsna.ud3;
import xsna.va2;
import xsna.voy;
import xsna.yq9;

/* compiled from: LayoutModifierNodeCoordinator.kt */
/* loaded from: classes11.dex */
public final class d extends o {
    public static final va2 c0;
    public noy Y;
    public o6j Z;
    public a a0;
    public ud3 b0;

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    public final class a extends m600 {
        public a() {
            super(d.this);
        }

        @Override // xsna.zox
        public final int M(int i) {
            d dVar = d.this;
            return dVar.Y.w(this, dVar.t.w1(), i);
        }

        @Override // xsna.zo10
        public final tra0 N(long j) {
            v0(j);
            o6j o6jVar = new o6j(j);
            d dVar = d.this;
            dVar.Z = o6jVar;
            m600.W0(this, dVar.Y.c(this, dVar.t.w1(), j));
            return this;
        }

        @Override // xsna.zox
        public final int Z(int i) {
            d dVar = d.this;
            return dVar.Y.k(this, dVar.t.w1(), i);
        }

        @Override // xsna.zox
        public final int j0(int i) {
            d dVar = d.this;
            return dVar.Y.x(this, dVar.t.w1(), i);
        }

        @Override // xsna.zox
        public final int l0(int i) {
            d dVar = d.this;
            return dVar.Y.y(this, dVar.t.w1(), i);
        }

        @Override // androidx.compose.ui.node.f
        public final int y0(gt1 gt1Var) {
            int f = rdi.f(this, gt1Var);
            this.v.i(gt1Var, f);
            return f;
        }
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    public static final class b implements dp10 {
        public final /* synthetic */ dp10 a;
        public final int b;
        public final int c;

        public b(dp10 dp10Var, d dVar) {
            this.a = dp10Var;
            a aVar = dVar.a0;
            this.b = aVar.b;
            this.c = aVar.c;
        }

        @Override // xsna.dp10
        public final int getHeight() {
            return this.c;
        }

        @Override // xsna.dp10
        public final int getWidth() {
            return this.b;
        }

        @Override // xsna.dp10
        public final void j() {
            this.a.j();
        }

        @Override // xsna.dp10
        public final izs<srg0, s3q0> k() {
            return this.a.k();
        }

        @Override // xsna.dp10
        public final Map<gt1, Integer> q() {
            return this.a.q();
        }
    }

    static {
        va2 va2Var = new va2();
        va2Var.d(l5g.g);
        va2Var.p(1.0f);
        va2Var.q(1);
        c0 = va2Var;
    }

    public d(LayoutNode layoutNode, noy noyVar) {
        super(layoutNode);
        this.Y = noyVar;
        this.a0 = layoutNode.i != null ? new a() : null;
        this.b0 = (noyVar.z().d & 512) != 0 ? new ud3(this, (td3) noyVar) : null;
    }

    @Override // androidx.compose.ui.node.o
    public final q630.c D1() {
        return this.Y.z();
    }

    @Override // xsna.zox
    public final int M(int i) {
        ud3 ud3Var = this.b0;
        return ud3Var != null ? ud3Var.c.P0(ud3Var, this.t, i) : this.Y.w(this, this.t, i);
    }

    @Override // xsna.zo10
    public final tra0 N(long j) {
        dp10 c;
        o6j o6jVar;
        if (this.s) {
            o6j o6jVar2 = this.Z;
            if (o6jVar2 == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j = o6jVar2.a;
        }
        v0(j);
        ud3 ud3Var = this.b0;
        if (ud3Var != null) {
            td3 td3Var = ud3Var.c;
            dp10 J0 = ud3Var.b.a0.J0();
            J0.getWidth();
            J0.getHeight();
            boolean z = td3Var.O1() || (o6jVar = this.Z) == null || j != o6jVar.a;
            ud3Var.d = z;
            if (!z) {
                this.t.s = true;
            }
            c = td3Var.o0();
            this.t.s = false;
            boolean z2 = c.getWidth() == this.a0.b && c.getHeight() == this.a0.c;
            if (!ud3Var.d) {
                o oVar = this.t;
                long j2 = oVar.d;
                m600 w1 = oVar.w1();
                if (q9x.a(j2, w1 != null ? new q9x(w1.c1()) : null) && !z2) {
                    c = new b(c, this);
                }
            }
        } else {
            c = this.Y.c(this, this.t, j);
        }
        d2(c);
        S1();
        return this;
    }

    @Override // xsna.zox
    public final int Z(int i) {
        ud3 ud3Var = this.b0;
        return ud3Var != null ? ud3Var.c.l0(ud3Var, this.t, i) : this.Y.k(this, this.t, i);
    }

    @Override // androidx.compose.ui.node.o
    public final void Z1(yq9 yq9Var, mdu mduVar) {
        o oVar;
        this.t.i1(yq9Var, mduVar);
        if (!voy.a(this.q).getShowLayoutBounds() || (oVar = this.t) == null) {
            return;
        }
        if (q9x.b(this.d, oVar.d) && h9x.b(oVar.D, 0L)) {
            return;
        }
        long j = this.d;
        yq9Var.i(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, c0);
    }

    @Override // xsna.zox
    public final int j0(int i) {
        ud3 ud3Var = this.b0;
        return ud3Var != null ? ud3Var.c.m1(ud3Var, this.t, i) : this.Y.x(this, this.t, i);
    }

    @Override // xsna.zox
    public final int l0(int i) {
        ud3 ud3Var = this.b0;
        return ud3Var != null ? ud3Var.c.Z(ud3Var, this.t, i) : this.Y.y(this, this.t, i);
    }

    @Override // androidx.compose.ui.node.o
    public final void m1() {
        if (this.a0 == null) {
            this.a0 = new a();
        }
    }

    public final void m2() {
        boolean z;
        if (this.k) {
            return;
        }
        T1();
        o oVar = this.t;
        ud3 ud3Var = this.b0;
        if (ud3Var != null) {
            a aVar = this.a0;
            n600 n600Var = aVar.t;
            if (!ud3Var.d) {
                if (q9x.a(this.d, aVar != null ? new q9x(aVar.c1()) : null)) {
                    long j = oVar.d;
                    m600 w1 = oVar.w1();
                    if (q9x.a(j, w1 != null ? new q9x(w1.c1()) : null)) {
                        z = true;
                        oVar.r = z;
                    }
                }
            }
            z = false;
            oVar.r = z;
        }
        oVar.l = this.l;
        J0().j();
        oVar.l = false;
        oVar.r = false;
    }

    public final void n2(noy noyVar) {
        if (!noyVar.equals(this.Y)) {
            if ((noyVar.z().d & 512) != 0) {
                td3 td3Var = (td3) noyVar;
                ud3 ud3Var = this.b0;
                if (ud3Var != null) {
                    ud3Var.c = td3Var;
                } else {
                    ud3Var = new ud3(this, td3Var);
                }
                this.b0 = ud3Var;
            } else {
                this.b0 = null;
            }
        }
        this.Y = noyVar;
    }

    @Override // androidx.compose.ui.node.o, xsna.tra0
    public final void p0(long j, float f, izs<? super tdu, s3q0> izsVar) {
        super.p0(j, f, izsVar);
        m2();
    }

    @Override // androidx.compose.ui.node.o, xsna.tra0
    public final void q0(long j, float f, mdu mduVar) {
        super.q0(j, f, mduVar);
        m2();
    }

    @Override // androidx.compose.ui.node.o
    public final m600 w1() {
        return this.a0;
    }

    @Override // androidx.compose.ui.node.f
    public final int y0(gt1 gt1Var) {
        a aVar = this.a0;
        return aVar != null ? aVar.v.c(Integer.MIN_VALUE, gt1Var) : rdi.f(this, gt1Var);
    }
}
