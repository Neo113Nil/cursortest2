package com.vk.core.compose.component.cell.content;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.o;
import xsna.cri;
import xsna.dt1;
import xsna.egi;
import xsna.fvr;
import xsna.izs;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.spg0;
import xsna.sy90;
import xsna.tpg0;
import xsna.ts0;
import xsna.ty6;
import xsna.ur;
import xsna.wh50;
import xsna.zak0;

/* compiled from: RightImpl.kt */
/* loaded from: classes17.dex */
public final class y0 implements o {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public y0() {
        this(null, null, null, null, null);
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1505078095);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1505078095, i2, -1, "com.vk.core.compose.component.cell.content.RightImpl.Content (RightImpl.kt:35)");
            }
            izs izsVar = (izs) ((zak0) this.f).getValue();
            q630.a aVar2 = q630.a.a;
            if (izsVar == null || (q630Var2 = q630Var.g(egi.o(aVar2, izsVar))) == null) {
                q630Var2 = q630Var;
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.v), bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var2);
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
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            fvr.n();
            com.vk.core.compose.component.defaults.c cVar2 = com.vk.core.compose.component.defaults.c.a;
            M.K(-1831387683);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1831387683, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.rightContentSpace (VkCellDefaults.kt:81)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.t), bVar, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
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
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            o.a aVar4 = (o.a) ((zak0) this.a).getValue();
            tpg0 tpg0Var = tpg0.a;
            if (aVar4 == null) {
                M.K(-494224209);
            } else {
                M.K(-494224208);
                aVar4.a(tpg0Var, aVar2, M, 54);
            }
            M.j();
            o.d dVar2 = (o.d) ((zak0) this.b).getValue();
            if (dVar2 == null) {
                M.K(-494175601);
            } else {
                M.K(-494175600);
                dVar2.a(tpg0Var, aVar2, M, 54);
            }
            M.j();
            o.e eVar2 = (o.e) ((zak0) this.c).getValue();
            if (eVar2 == null) {
                M.K(-494121041);
            } else {
                M.K(-494121040);
                eVar2.a(tpg0Var, aVar2, M, 54);
            }
            M.j();
            M.G();
            o.b bVar3 = (o.b) ((zak0) this.d).getValue();
            if (bVar3 == null) {
                M.K(1135705747);
            } else {
                M.K(1135705748);
                bVar3.a(tpg0Var, aVar2, M, 54);
            }
            M.j();
            o.f fVar = (o.f) ((zak0) this.e).getValue();
            if (fVar == null) {
                M.K(1135752371);
            } else {
                M.K(1135752372);
                fVar.a(tpg0Var, aVar2, M, 54);
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
            s.d = new ts0(this, spg0Var, q630Var, i, 3);
        }
    }

    public y0(o.a aVar, o.d dVar, o.e eVar, o.b bVar, o.f fVar) {
        this.a = androidx.compose.runtime.k.b(aVar);
        this.b = androidx.compose.runtime.k.b(dVar);
        this.c = androidx.compose.runtime.k.b(eVar);
        this.d = androidx.compose.runtime.k.b(bVar);
        this.e = androidx.compose.runtime.k.b(fVar);
        this.f = androidx.compose.runtime.k.b(null);
    }
}
