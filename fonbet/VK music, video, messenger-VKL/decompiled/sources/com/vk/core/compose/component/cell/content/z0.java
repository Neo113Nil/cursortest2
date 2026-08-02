package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.lg90;
import xsna.or;
import xsna.q630;
import xsna.rrv0;
import xsna.spg0;
import xsna.txj0;
import xsna.uqv;
import xsna.wh50;
import xsna.ylu0;
import xsna.yoj;
import xsna.zak0;

/* compiled from: RightReorderImpl.kt */
/* loaded from: classes17.dex */
public final class z0 implements o.f {
    public final wh50 a = androidx.compose.runtime.k.b(null);
    public final wh50 b;
    public final wh50 c;

    public z0(q630 q630Var, String str) {
        this.b = androidx.compose.runtime.k.b(q630Var);
        this.c = androidx.compose.runtime.k.b(str);
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 g;
        androidx.compose.runtime.a M = aVar.M(1278997771);
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
                androidx.compose.runtime.b.f(1278997771, i2, -1, "com.vk.core.compose.component.cell.content.RightReorderImpl.Content (RightReorderImpl.kt:28)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.a).getValue());
            q630 q630Var2 = (q630) ((zak0) this.b).getValue();
            if (q630Var2 != null && (g = b.g(q630Var2)) != null) {
                b = g;
            }
            q630 q = txj0.q(b, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1416148378, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Reorder24> (VkSdkIcons.kt:2948)");
            }
            lg90 b2 = or.b(M, -987250162, R.drawable.vk_icon_reorder_24, M, 0);
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
            uqv.b(b2, (String) ((zak0) this.c).getValue(), q, ylu0Var.getIcon().l, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yoj(this, spg0Var, q630Var, i, 1);
        }
    }
}
