package com.vk.core.compose.component.cell.content;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.f9t;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.q630;
import xsna.qhp;
import xsna.qri;
import xsna.r9g;
import xsna.s3q0;
import xsna.sp;
import xsna.spg0;
import xsna.sy90;
import xsna.tpg0;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.wh50;
import xsna.wn20;
import xsna.wzs;
import xsna.zak0;

/* compiled from: SexyMiddleImpl.kt */
/* loaded from: classes17.dex */
public final class b1 extends a1 implements RichCell$Middle, Cell$Middle {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;

    public b1() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // com.vk.core.compose.component.cell.content.a1, com.vk.core.compose.component.cell.content.RichCell$Middle, com.vk.core.compose.component.cell.content.Cell$Middle
    public final void a(final spg0 spg0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(116481835);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(116481835, i2, -1, "com.vk.core.compose.component.cell.content.SexyMiddleImpl.Content (SexyMiddleImpl.kt:59)");
            }
            q630 b = spg0Var.b(1.0f, com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.l).getValue()), true);
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, aVar2, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.v), dt1.a.k, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            int i3 = i2;
            q630.a aVar4 = q630.a.a;
            q630 c2 = qri.c(M, aVar4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar4, true);
            sp.l();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(wn20.c, dt1.a.l), aVar2, M, 48);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, b2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            wh50 wh50Var = this.b;
            a1.f fVar = (a1.f) ((zak0) wh50Var).getValue();
            r9g r9gVar = r9g.a;
            if (fVar == null) {
                M.K(-1973234819);
            } else {
                M.K(-1973234818);
                fVar.a(r9gVar, aVar4, M, 54);
                sp.l();
                f9t.e(txj0.h(aVar4, wn20.d), M, 0);
                s3q0 s3q0Var = s3q0.a;
            }
            M.j();
            wh50 wh50Var2 = this.c;
            a1.g gVar = (a1.g) ((zak0) wh50Var2).getValue();
            if (gVar != null) {
                ((zak0) gVar.b).setValue((SexyCell$Size) ((zak0) this.a).getValue());
                s3q0 s3q0Var2 = s3q0.a;
            }
            a1.g gVar2 = (a1.g) ((zak0) wh50Var2).getValue();
            if (gVar2 != null) {
                ((zak0) gVar2.a).setValue(Boolean.valueOf(((a1.f) ((zak0) wh50Var).getValue()) != null));
                s3q0 s3q0Var3 = s3q0.a;
            }
            a1.g gVar3 = (a1.g) ((zak0) wh50Var2).getValue();
            if (gVar3 == null) {
                M.K(-1972936723);
            } else {
                M.K(-1972936722);
                gVar3.a(r9gVar, aVar4, M, 54);
                s3q0 s3q0Var4 = s3q0.a;
            }
            M.j();
            a1.f fVar2 = (a1.f) ((zak0) this.d).getValue();
            if (fVar2 == null) {
                M.K(-1972881171);
            } else {
                M.K(-1972881170);
                fVar2.a(r9gVar, aVar4, M, 54);
                s3q0 s3q0Var5 = s3q0.a;
            }
            M.j();
            a1.f fVar3 = (a1.f) ((zak0) this.e).getValue();
            if (fVar3 == null) {
                M.K(-1972816195);
            } else {
                M.K(-1972816194);
                sp.l();
                f9t.e(txj0.h(aVar4, wn20.d), M, 0);
                fVar3.a(r9gVar, aVar4, M, 54);
                s3q0 s3q0Var6 = s3q0.a;
            }
            M.j();
            a1.c cVar2 = (a1.c) ((zak0) this.k).getValue();
            if (cVar2 == null) {
                M.K(-1972615904);
            } else {
                M.K(-1972615903);
                f9t.e(txj0.h(aVar4, 4), M, 6);
                cVar2.a(r9gVar, aVar4, M, 54);
                s3q0 s3q0Var7 = s3q0.a;
            }
            M.j();
            M.G();
            a1.d dVar2 = (a1.d) ((zak0) this.j).getValue();
            if (dVar2 == null) {
                M.K(-2133039069);
            } else {
                M.K(-2133039068);
                dVar2.a(tpg0Var, aVar4, M, 54);
                s3q0 s3q0Var8 = s3q0.a;
            }
            M.j();
            M.G();
            a1.e eVar2 = (a1.e) ((zak0) this.f).getValue();
            if (eVar2 == null) {
                M.K(418312959);
            } else {
                M.K(418312960);
                f9t.e(txj0.h(aVar4, kqu0.s), M, 0);
                eVar2.a(r9gVar, aVar4, M, 54);
                s3q0 s3q0Var9 = s3q0.a;
            }
            M.j();
            if (((a1.a) ((zak0) this.g).getValue()) == null && ((a1.a) ((zak0) this.h).getValue()) == null && ((a1.a) ((zak0) this.i).getValue()) == null) {
                M.K(413914401);
            } else {
                M.K(418523667);
                b((i3 >> 6) & 14, M);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.i4j0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    com.vk.core.compose.component.cell.content.b1.this.a(spg0Var, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-436058917);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-436058917, i2, -1, "com.vk.core.compose.component.cell.content.SexyMiddleImpl.ButtonsGroup (SexyMiddleImpl.kt:111)");
            }
            sp.l();
            float f = wn20.f;
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, f), M, 0);
            q630 f2 = txj0.f(aVar2, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            sp.l();
            a.j g = androidx.compose.foundation.layout.a.g(wn20.e);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a1.a aVar4 = (a1.a) ((zak0) this.g).getValue();
            tpg0 tpg0Var = tpg0.a;
            if (aVar4 == null) {
                M.K(-1269625335);
            } else {
                M.K(-1269625334);
                aVar4.a(tpg0Var, aVar2, M, 54);
            }
            M.j();
            a1.a aVar5 = (a1.a) ((zak0) this.h).getValue();
            if (aVar5 == null) {
                M.K(-1269573751);
            } else {
                M.K(-1269573750);
                aVar5.a(tpg0Var, aVar2, M, 54);
            }
            M.j();
            a1.a aVar6 = (a1.a) ((zak0) this.i).getValue();
            if (aVar6 == null) {
                M.K(-1269523159);
            } else {
                M.K(-1269523158);
                aVar6.a(tpg0Var, aVar2, M, 54);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qhp(this, i);
        }
    }

    public b1(a1.f fVar, a1.g gVar, a1.f fVar2, a1.f fVar3, a1.e eVar, a1.a aVar, a1.a aVar2, e0 e0Var, a1.d dVar, a1.c cVar) {
        this.b = androidx.compose.runtime.k.b(fVar);
        this.c = androidx.compose.runtime.k.b(gVar);
        this.d = androidx.compose.runtime.k.b(fVar2);
        this.e = androidx.compose.runtime.k.b(fVar3);
        this.f = androidx.compose.runtime.k.b(eVar);
        this.g = androidx.compose.runtime.k.b(aVar);
        this.h = androidx.compose.runtime.k.b(aVar2);
        this.i = androidx.compose.runtime.k.b(e0Var);
        this.j = androidx.compose.runtime.k.b(dVar);
        this.k = androidx.compose.runtime.k.b(cVar);
        this.l = androidx.compose.runtime.k.b(null);
    }
}
