package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.a1;
import xsna.a86;
import xsna.jai;
import xsna.q630;
import xsna.spg0;
import xsna.tpg0;
import xsna.wh50;
import xsna.zak0;
import xsna.zzs;

/* compiled from: InternalSlots.kt */
/* loaded from: classes17.dex */
public final class d0 extends a1.g.a implements a1.f.a {
    public final wh50 c;

    public d0() {
        throw null;
    }

    public d0(jai jaiVar) {
        this.c = androidx.compose.runtime.k.b(jaiVar);
    }

    @Override // com.vk.core.compose.component.cell.content.a1.g.a, com.vk.core.compose.component.cell.content.a1.f.a
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1473945101);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1473945101, i2, -1, "com.vk.core.compose.component.cell.content.InternalAlongSlot.Content (InternalSlots.kt:44)");
            }
            ((zzs) ((zak0) this.c).getValue()).invoke(tpg0.a, q630.a.a, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a86(this, i, 8);
        }
    }
}
