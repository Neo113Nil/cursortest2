package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.g4j0;
import xsna.jo7;
import xsna.q630;
import xsna.rdu0;
import xsna.spg0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: RightActionBadgeImpl.kt */
/* loaded from: classes17.dex */
public final class q0 implements g4j0, o.a {
    public final wh50 a;
    public final wh50 b = androidx.compose.runtime.k.b(null);

    public q0(BadgeAppearance.Design design) {
        this.a = androidx.compose.runtime.k.b(design);
    }

    @Override // xsna.g4j0, com.vk.core.compose.component.cell.content.Cell$Left.b, com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1750105547);
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
                androidx.compose.runtime.b.f(1750105547, i2, -1, "com.vk.core.compose.component.cell.content.RightActionBadgeImpl.Content (RightActionBadgeImpl.kt:24)");
            }
            rdu0.a(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.b).getValue()), (BadgeAppearance) ((zak0) this.a).getValue(), M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jo7(i, 4, this, spg0Var, q630Var);
        }
    }
}
