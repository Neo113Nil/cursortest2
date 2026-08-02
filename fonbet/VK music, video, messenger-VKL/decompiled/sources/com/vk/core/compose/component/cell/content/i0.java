package com.vk.core.compose.component.cell.content;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Left;
import xsna.cri;
import xsna.dt1;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.q1h;
import xsna.q630;
import xsna.qri;
import xsna.spg0;
import xsna.sy90;
import xsna.tpg0;
import xsna.ty6;
import xsna.wh50;
import xsna.zak0;

/* compiled from: LeftImpl.kt */
/* loaded from: classes17.dex */
public final class i0 implements Cell$Left {
    public final wh50 a;
    public final wh50 b;

    public i0(Cell$Left.Main main, Cell$Left.b bVar) {
        this.a = androidx.compose.runtime.k.b(main);
        this.b = androidx.compose.runtime.k.b(bVar);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1896974837);
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
                androidx.compose.runtime.b.f(-1896974837, i2, -1, "com.vk.core.compose.component.cell.content.LeftImpl.Content (LeftImpl.kt:25)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.v), bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Cell$Left.b bVar2 = (Cell$Left.b) ((zak0) this.b).getValue();
            q630.a aVar3 = q630.a.a;
            tpg0 tpg0Var = tpg0.a;
            if (bVar2 == null) {
                M.K(1782773657);
            } else {
                M.K(1782773658);
                bVar2.a(tpg0Var, aVar3, M, 54);
            }
            M.j();
            M.K(473152200);
            ((Cell$Left.Main) ((zak0) this.a).getValue()).a(tpg0Var, aVar3, M, 54);
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
            s.d = new q1h(i, 3, this, spg0Var, q630Var);
        }
    }
}
