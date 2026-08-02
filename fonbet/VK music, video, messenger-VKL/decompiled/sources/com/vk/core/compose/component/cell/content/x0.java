package com.vk.core.compose.component.cell.content;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.o;
import xsna.cri;
import xsna.dt1;
import xsna.f9t;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.spg0;
import xsna.sy90;
import xsna.tpg0;
import xsna.txj0;
import xsna.wh50;
import xsna.x85;
import xsna.zak0;

/* compiled from: RightExtraPairImpl.kt */
/* loaded from: classes17.dex */
public final class x0 implements o.d {
    public final wh50 a;
    public final wh50 b;

    public x0(x xVar, x xVar2) {
        this.a = androidx.compose.runtime.k.b(xVar);
        this.b = androidx.compose.runtime.k.b(xVar2);
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(216367723);
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
                androidx.compose.runtime.b.f(216367723, i2, -1, "com.vk.core.compose.component.cell.content.RightExtraPairImpl.Content (RightExtraPairImpl.kt:23)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
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
            M.K(-799961360);
            o.d dVar = (o.d) ((zak0) this.a).getValue();
            tpg0 tpg0Var = tpg0.a;
            q630.a aVar3 = q630.a.a;
            dVar.a(tpg0Var, aVar3, M, 54);
            M.j();
            f9t.e(txj0.v(aVar3, kqu0.t), M, 0);
            M.K(-799957615);
            ((o.d) ((zak0) this.b).getValue()).a(tpg0Var, aVar3, M, 54);
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
            s.d = new x85(this, spg0Var, q630Var, i, 3);
        }
    }
}
