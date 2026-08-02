package com.vk.core.compose.component.topbar;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vkontakte.android.R;
import xsna.dyn;
import xsna.epx;
import xsna.f7p0;
import xsna.gzs;
import xsna.l5g;
import xsna.lg90;
import xsna.or;
import xsna.q630;
import xsna.vby;

/* compiled from: TopBar.kt */
@vby
/* loaded from: classes17.dex */
public final class e {
    public final TopBar$Before a;

    /* compiled from: TopBar.kt */
    public static final class a {
        public static TopBar$Before.e a(gzs gzsVar, String str, f7p0 f7p0Var, l5g l5gVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
            String str2 = (i2 & 2) != 0 ? null : str;
            f7p0 f7p0Var2 = (i2 & 4) != 0 ? null : f7p0Var;
            l5g l5gVar2 = (i2 & 8) != 0 ? null : l5gVar;
            SemanticsConfiguration semanticsConfiguration2 = (i2 & 16) != 0 ? null : semanticsConfiguration;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1044674380, i, -1, "com.vk.core.compose.component.topbar.TopBar.Back.Companion.invoke (TopBar.kt:129)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(aVar, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i << 3;
            TopBar$Before.e a = TopBar$Before.e.a.a(b, str2, gzsVar, f7p0Var2, l5gVar2, semanticsConfiguration2, aVar, (i & 112) | 1572872 | ((i << 6) & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return a;
        }
    }

    public /* synthetic */ e(TopBar$Before topBar$Before) {
        this.a = topBar$Before;
    }

    public static final void a(TopBar$Before topBar$Before, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1194628407);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(topBar$Before) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1194628407, i3, -1, "com.vk.core.compose.component.topbar.TopBar.Back.Content (TopBar.kt:119)");
            }
            topBar$Before.e(q630Var, M, i3 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dyn(topBar$Before, q630Var2, i, i2, 2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return epx.f(this.a, ((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Back(content=" + this.a + ')';
    }
}
