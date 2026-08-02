package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.a1;
import xsna.jai;
import xsna.q630;
import xsna.q9g;
import xsna.r9g;
import xsna.wh50;
import xsna.z76;
import xsna.zak0;
import xsna.zzs;

/* compiled from: InternalSlots.kt */
/* loaded from: classes17.dex */
public final class f0 extends a1.g implements a1.f, a1.e {
    public final wh50 c;

    public f0() {
        throw null;
    }

    public f0(jai jaiVar) {
        this.c = androidx.compose.runtime.k.b(jaiVar);
    }

    @Override // com.vk.core.compose.component.cell.content.a1.g, com.vk.core.compose.component.cell.content.a1.f, com.vk.core.compose.component.cell.content.a1.e
    public final void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(105937776);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(105937776, i2, -1, "com.vk.core.compose.component.cell.content.InternalTitleSlot.Content (InternalSlots.kt:67)");
            }
            ((zzs) ((zak0) this.c).getValue()).invoke(r9g.a, q630.a.a, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z76(this, i, 2);
        }
    }
}
