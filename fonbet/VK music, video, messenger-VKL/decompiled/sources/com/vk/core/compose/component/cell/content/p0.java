package com.vk.core.compose.component.cell.content;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.f880;
import xsna.gzs;
import xsna.hyv0;
import xsna.izs;
import xsna.k9q0;
import xsna.n34;
import xsna.ojc;
import xsna.q630;
import xsna.q9g;
import xsna.qri;
import xsna.qy9;
import xsna.rzq0;
import xsna.s3q0;
import xsna.sy90;
import xsna.us2;
import xsna.wh50;
import xsna.xcc;
import xsna.zak0;

/* compiled from: RichUserStack.kt */
/* loaded from: classes17.dex */
public final class p0 implements RichCell$Middle.f {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public p0(izs<? super rzq0, s3q0> izsVar, UserStackSize userStackSize, xcc.a.f fVar, us2 us2Var, gzs<s3q0> gzsVar, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(izsVar);
        this.b = androidx.compose.runtime.k.b(userStackSize);
        this.c = androidx.compose.runtime.k.b(fVar);
        this.d = androidx.compose.runtime.k.b(us2Var);
        this.e = androidx.compose.runtime.k.b(gzsVar);
        this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // com.vk.core.compose.component.cell.content.RichCell$Middle.f
    public final void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2082202369);
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
                androidx.compose.runtime.b.f(-2082202369, i2, -1, "com.vk.core.compose.component.cell.content.RichUserStack.Content (RichUserStack.kt:40)");
            }
            M.K(458289478);
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.f).getValue());
            if (((gzs) ((zak0) this.e).getValue()) != null) {
                boolean z = (i2 & 896) == 256;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new f880(this, 18);
                    M.R(x);
                }
                q630 g = b.g(ojc.c(q630.a.a, false, null, null, (gzs) x, 15));
                if (g != null) {
                    b = g;
                }
            }
            M.j();
            a.j g2 = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g2, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            hyv0.d(null, (UserStackSize) ((zak0) this.b).getValue(), (xcc.a.f) ((zak0) this.c).getValue(), (us2) ((zak0) this.d).getValue(), (izs) ((zak0) this.a).getValue(), M, 0, 1);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qy9(this, q9gVar, q630Var, i, 3);
        }
    }
}
