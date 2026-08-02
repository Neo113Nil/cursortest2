package com.vk.core.compose.component.cell.content;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.f9t;
import xsna.frv0;
import xsna.gdv;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.sp;
import xsna.spg0;
import xsna.sy90;
import xsna.txj0;
import xsna.us2;
import xsna.wh50;
import xsna.wlb0;
import xsna.wn20;
import xsna.wuv0;
import xsna.yqv0;
import xsna.zak0;

/* compiled from: SexyMiddleMetaImpl.kt */
/* loaded from: classes17.dex */
public final class d1 implements a1.d, RichCell$Middle.d {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public d1(us2 us2Var, us2 us2Var2, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.b = androidx.compose.runtime.k.b(us2Var2);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // com.vk.core.compose.component.cell.content.a1.d, com.vk.core.compose.component.cell.content.RichCell$Middle.d
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(973182795);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(973182795, i2, -1, "com.vk.core.compose.component.cell.content.SexyMiddleMetaImpl.Content (SexyMiddleMetaImpl.kt:34)");
            }
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.c).getValue();
            q630.a aVar3 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, semanticsConfiguration);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.p, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            us2 us2Var = (us2) ((zak0) this.a).getValue();
            sp.l();
            wn20 wn20Var = wn20.a;
            M.K(1223756217);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1223756217, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeRichCellDefaults.metaTextStyle (MilkshakeRichCellDefaults.kt:32)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.O;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            yqv0.d(us2Var, null, wlb0.h(M).getText().m, 6, null, 0, false, 0, null, null, frv0Var, M, 0, 0, 8122);
            us2 us2Var2 = (us2) ((zak0) this.b).getValue();
            if (us2Var2 == null) {
                M.K(681770111);
                M.j();
                aVar2 = M;
            } else {
                M.K(681770112);
                f9t.e(txj0.h(aVar3, kqu0.q), M, 0);
                aVar2 = M;
                yqv0.d(us2Var2, null, wlb0.h(M).getText().p, 6, null, 0, false, 0, null, null, wlb0.l(M).i0, aVar2, 0, 0, 8122);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new gdv(i, 4, this, spg0Var, q630Var);
        }
    }
}
