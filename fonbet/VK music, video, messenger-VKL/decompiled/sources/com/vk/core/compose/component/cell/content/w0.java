package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.dt1;
import xsna.fvr;
import xsna.g4j0;
import xsna.gzs;
import xsna.kud0;
import xsna.l5g;
import xsna.lg90;
import xsna.nzu0;
import xsna.pg90;
import xsna.q630;
import xsna.spg0;
import xsna.t050;
import xsna.wh50;
import xsna.zak0;
import xsna.zy60;

/* compiled from: RightExtraActionMoreImpl.kt */
/* loaded from: classes17.dex */
public final class w0 implements g4j0, o.e {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public w0() {
        throw null;
    }

    public w0(long j, SemanticsConfiguration semanticsConfiguration, String str, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(gzsVar);
        this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.g4j0, com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(242422539);
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
                androidx.compose.runtime.b.f(242422539, i2, -1, "com.vk.core.compose.component.cell.content.RightExtraActionMoreImpl.Content (RightExtraActionMoreImpl.kt:31)");
            }
            wh50 wh50Var = this.c;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(-2125010443);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new kud0(r9);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(1039829592);
            }
            M.j();
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
            fvr.n();
            com.vk.core.compose.component.defaults.c cVar = com.vk.core.compose.component.defaults.c.a;
            M.K(1698652671);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1698652671, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.moreIconSize (VkCellDefaults.kt:72)");
            }
            float f = 16;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            fvr.n();
            M.K(407827824);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(407827824, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeCellDefaults.moreIconPainter (VkCellDefaults.kt:69)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-836118916, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical16> (VkSdkIcons.kt:2658)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_more_vertical_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            long j = ((l5g) ((zak0) this.b).getValue()).a;
            dt1.a.getClass();
            aVar2 = M;
            nzu0.c(gzsVar, a, (String) ((zak0) this.a).getValue(), b, f, j, false, null, ((gzs) ((zak0) wh50Var).getValue()) == null ? 0 : 1, dt1.a.g, null, aVar2, 805306432, 1216);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new t050(this, spg0Var, q630Var, i);
        }
    }
}
