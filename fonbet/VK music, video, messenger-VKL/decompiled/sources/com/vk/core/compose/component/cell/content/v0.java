package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.button.DropdownButton$Appearance;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.bhu0;
import xsna.gzs;
import xsna.ph00;
import xsna.q630;
import xsna.spg0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: RightExtraActionDropdownImpl.kt */
/* loaded from: classes17.dex */
public final class v0 implements o.e {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    public v0(String str, gzs gzsVar, Cell$Right$ExtraAction$Dropdown$Mode cell$Right$ExtraAction$Dropdown$Mode) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(cell$Right$ExtraAction$Dropdown$Mode);
        this.c = androidx.compose.runtime.k.b(gzsVar);
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(427899019);
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
                androidx.compose.runtime.b.f(427899019, i2, -1, "com.vk.core.compose.component.cell.content.RightExtraActionDropdownImpl.Content (RightExtraActionDropdownImpl.kt:41)");
            }
            M.K(77765332);
            bhu0.g((String) ((zak0) this.a).getValue(), (gzs) ((zak0) this.c).getValue(), com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.d).getValue()), DropdownButton$Appearance.Neutral, M, 3072);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ph00(i, 2, this, spg0Var, q630Var);
        }
    }
}
