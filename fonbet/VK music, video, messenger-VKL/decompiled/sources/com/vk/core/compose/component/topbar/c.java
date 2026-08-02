package com.vk.core.compose.component.topbar;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.topbar.d;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cp10;
import xsna.cri;
import xsna.cx;
import xsna.dt1;
import xsna.ja8;
import xsna.k9q0;
import xsna.l5g;
import xsna.mtk0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.s200;
import xsna.sy90;
import xsna.txj0;
import xsna.wh50;
import xsna.x2e0;
import xsna.zak0;
import xsna.zy60;

/* compiled from: ProgressIndicatorImpl.kt */
/* loaded from: classes17.dex */
public final class c extends d.c.f {
    public final wh50 d;

    public c(long j) {
        this.d = zy60.d(j);
    }

    @Override // com.vk.core.compose.component.topbar.d.c
    public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1699771075);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1699771075, i2, -1, "com.vk.core.compose.component.topbar.ProgressIndicatorImpl.Content (ProgressIndicatorImpl.kt:22)");
            }
            q630 D = s200.D(txj0.q(q630.a.a, 44), 10);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            x2e0.b(null, ((l5g) ((zak0) this.d).getValue()).a, 2, 0L, 0, M, 384, 25);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cx(this, mtk0Var, i, 15);
        }
    }
}
