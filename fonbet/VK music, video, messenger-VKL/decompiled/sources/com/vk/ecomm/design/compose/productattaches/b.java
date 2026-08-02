package com.vk.ecomm.design.compose.productattaches;

import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.aqw;
import xsna.cri;
import xsna.dt1;
import xsna.gzs;
import xsna.hr80;
import xsna.ip6;
import xsna.iyk0;
import xsna.k9q0;
import xsna.n34;
import xsna.ojc;
import xsna.q630;
import xsna.qri;
import xsna.r18;
import xsna.rrv0;
import xsna.rte0;
import xsna.s200;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.v05;
import xsna.vog0;
import xsna.xpy;
import xsna.y18;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: VideoAttach.kt */
/* loaded from: classes18.dex */
public final class b {
    public static final void a(ProductVideoAttach productVideoAttach, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        gzs gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(100426381);
        int i2 = i | (M.J(productVideoAttach) ? 4 : 2) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(100426381, i2, -1, "com.vk.ecomm.design.compose.productattaches.VideoAttach (VideoAttach.kt:30)");
            }
            q630Var2 = q630Var;
            float f = 12;
            q630 d = rte0.d(txj0.h(q630Var2, 68), vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().B, e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            y18 a = aqw.a(f2, ylu0Var2.getImage().a);
            q630 b = r18.b(a.a, a.b, m, vog0.b(f));
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                gzsVar2 = gzsVar;
                x = new v05(2, gzsVar2);
                M.R(x);
            } else {
                gzsVar2 = gzsVar;
            }
            q630 c = ojc.c(b, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            k a2 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            M.K(-1089663876);
            Image image = productVideoAttach.c;
            ProductVideoAttach.StatusType statusType = productVideoAttach.b;
            boolean z2 = statusType == ProductVideoAttach.StatusType.Adult;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1738642628, 384, -1, "com.vk.ecomm.design.compose.productattaches.ImageContent.Companion.invoke (ImageContent.kt:145)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new a(image, z2);
                M.R(x2);
            }
            a aVar3 = (a) x2;
            ((zak0) aVar3.a).setValue(image != null ? new ProductVideoAttach.b(image) : null);
            ((zak0) aVar3.b).setValue(Boolean.valueOf(z2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f3 = 6;
            float f4 = 4;
            q630.a aVar4 = q630.a.a;
            aVar3.a(s200.G(aVar4, f3, f3, f4, f3), M, 0);
            M.j();
            M.K(-1089656175);
            c cVar = new c(statusType, productVideoAttach.e, productVideoAttach.f, productVideoAttach.d);
            q630 G = s200.G(aVar4, f4, f3, f3, f3);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            cVar.c(G.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), M, 6);
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ip6(i, 8, productVideoAttach, q630Var2, gzsVar2);
        }
    }
}
