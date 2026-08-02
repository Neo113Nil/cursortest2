package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.ah7;
import xsna.gzs;
import xsna.lg90;
import xsna.nzu0;
import xsna.or;
import xsna.q630;
import xsna.rrv0;
import xsna.spg0;
import xsna.wh50;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: LeftExtraChevronImpl.kt */
/* loaded from: classes17.dex */
public final class g0 implements Cell$Left.b {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public g0() {
        this(0);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1367780181);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1367780181, i2, -1, "com.vk.core.compose.component.cell.content.LeftExtraChevronImpl.Content (LeftExtraChevronImpl.kt:27)");
            }
            wh50 wh50Var = this.b;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(-1184512939);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new xsna.x0(20);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-176757768);
            }
            M.j();
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.c).getValue());
            float f = 24;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-141445858, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronDown24> (VkSdkIcons.kt:420)");
            }
            lg90 b2 = or.b(M, -450463739, R.drawable.vk_icon_chevron_down_24, M, 0);
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
            s.d = new ah7(this, i, 5);
        }
    }

    public g0(int i) {
        this.a = androidx.compose.runtime.k.b(null);
        this.b = androidx.compose.runtime.k.b(null);
        this.c = androidx.compose.runtime.k.b(null);
    }
}
