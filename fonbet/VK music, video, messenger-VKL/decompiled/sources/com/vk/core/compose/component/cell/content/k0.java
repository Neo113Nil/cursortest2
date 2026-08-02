package com.vk.core.compose.component.cell.content;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.fsk;
import xsna.fvr;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.ni1;
import xsna.q630;
import xsna.qri;
import xsna.s200;
import xsna.spg0;
import xsna.sy90;
import xsna.ty6;
import xsna.wh50;
import xsna.zak0;

/* compiled from: MiddleImpl.kt */
/* loaded from: classes17.dex */
public final class k0 implements Cell$Middle {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public k0() {
        this(null, null, 31);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1368760245);
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
                androidx.compose.runtime.b.f(-1368760245, i2, -1, "com.vk.core.compose.component.cell.content.MiddleImpl.Content (MiddleImpl.kt:34)");
            }
            q630 b = spg0Var.b(1.0f, com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.e).getValue()), true);
            fvr.n();
            com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
            fsk.F(M);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.u, 1, b);
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.n;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            fvr.n();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(fsk.E(M), dt1.a.l), aVar2, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            Cell$Middle.d dVar = (Cell$Middle.d) ((zak0) this.a).getValue();
            wh50 wh50Var = this.d;
            q630.a aVar4 = q630.a.a;
            if (dVar == null) {
                M.K(-1594174271);
            } else {
                M.K(-1594174270);
                dVar.c(aVar4, (Cell$Middle.Size) ((zak0) wh50Var).getValue(), M, 6);
            }
            M.j();
            Cell$Middle.c cVar2 = (Cell$Middle.c) ((zak0) this.b).getValue();
            if (cVar2 == null) {
                M.K(-1594120703);
            } else {
                M.K(-1594120702);
                cVar2.c(aVar4, (Cell$Middle.Size) ((zak0) wh50Var).getValue(), M, 6);
            }
            M.j();
            Cell$Middle.b bVar = (Cell$Middle.b) ((zak0) this.c).getValue();
            if (bVar == null) {
                M.K(-1594062175);
            } else {
                M.K(-1594062174);
                bVar.c(aVar4, (Cell$Middle.Size) ((zak0) wh50Var).getValue(), M, 6);
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
            s.d = new ni1(i, 3, this, spg0Var, q630Var);
        }
    }

    public k0(Cell$Middle.d dVar, Cell$Middle.c cVar, int i) {
        dVar = (i & 1) != 0 ? null : dVar;
        cVar = (i & 2) != 0 ? null : cVar;
        Cell$Middle.Size size = Cell$Middle.Size.Medium;
        this.a = androidx.compose.runtime.k.b(dVar);
        this.b = androidx.compose.runtime.k.b(cVar);
        this.c = androidx.compose.runtime.k.b(null);
        this.d = androidx.compose.runtime.k.b(size);
        this.e = androidx.compose.runtime.k.b(null);
    }
}
