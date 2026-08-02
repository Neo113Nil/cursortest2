package com.vk.core.compose.component.cell.content;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.c6v;
import xsna.frv0;
import xsna.fvr;
import xsna.g4j0;
import xsna.q630;
import xsna.rrv0;
import xsna.s200;
import xsna.spg0;
import xsna.wh50;
import xsna.wuv0;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zak0;

/* compiled from: RightActionDetailImpl.kt */
/* loaded from: classes17.dex */
public final class s0 implements g4j0, o.a {
    public final wh50 a;
    public final wh50 b;

    public s0(String str, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.g4j0, com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1539891293);
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
                androidx.compose.runtime.b.f(-1539891293, i2, -1, "com.vk.core.compose.component.cell.content.RightActionDetailImpl.Content (RightActionDetailImpl.kt:26)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.b).getValue());
            fvr.n();
            com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
            M.K(397087446);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(397087446, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.captionTopPadding (VkCellDefaults.kt:63)");
            }
            float f = 0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            q630 H = s200.H(b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String str = (String) ((zak0) this.a).getValue();
            fvr.n();
            M.K(1799258679);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1799258679, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.captionTextStyle (VkCellDefaults.kt:66)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.T;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, H, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new c6v(this, spg0Var, q630Var, i, 3);
        }
    }
}
