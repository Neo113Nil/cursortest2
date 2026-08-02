package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.a1;
import xsna.hq5;
import xsna.jai;
import xsna.q630;
import xsna.spg0;
import xsna.tpg0;
import xsna.wh50;
import xsna.zak0;
import xsna.zzs;

/* compiled from: InternalSlots.kt */
/* loaded from: classes17.dex */
public final class e0 extends a1 implements a1.a, a1.d {
    public final wh50 b;

    public e0() {
        throw null;
    }

    public e0(jai jaiVar) {
        this.b = androidx.compose.runtime.k.b(jaiVar);
    }

    @Override // com.vk.core.compose.component.cell.content.a1, com.vk.core.compose.component.cell.content.RichCell$Middle, com.vk.core.compose.component.cell.content.Cell$Middle
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-186914485);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-186914485, i2, -1, "com.vk.core.compose.component.cell.content.InternalMiddleRowSlot.Content (InternalSlots.kt:22)");
            }
            ((zzs) ((zak0) this.b).getValue()).invoke(tpg0.a, q630.a.a, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hq5(this, i, 9);
        }
    }
}
