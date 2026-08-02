package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.ce0;
import xsna.gzs;
import xsna.lg90;
import xsna.nzu0;
import xsna.or;
import xsna.pr1;
import xsna.q630;
import xsna.rrv0;
import xsna.spg0;
import xsna.wh50;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: LeftExtraCloseImpl.kt */
/* loaded from: classes17.dex */
public final class h0 implements Cell$Left.b {
    public final wh50 a = androidx.compose.runtime.k.b(null);
    public final wh50 b;
    public final wh50 c;

    public h0(gzs gzsVar, SemanticsConfiguration semanticsConfiguration) {
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1175915915);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1175915915, i2, -1, "com.vk.core.compose.component.cell.content.LeftExtraCloseImpl.Content (LeftExtraCloseImpl.kt:27)");
            }
            wh50 wh50Var = this.b;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(1957879669);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new pr1(26);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(478799064);
            }
            M.j();
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.c).getValue());
            float f = 24;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            }
            lg90 b2 = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, b2, (String) ((zak0) this.a).getValue(), b, f, ylu0Var.getIcon().l, false, null, ((gzs) ((zak0) wh50Var).getValue()) != null, null, null, M, 24640, 1728);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ce0(this, i, 7);
        }
    }
}
