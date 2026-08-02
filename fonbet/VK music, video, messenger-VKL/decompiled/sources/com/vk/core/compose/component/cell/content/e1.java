package com.vk.core.compose.component.cell.content;

import com.vk.core.compose.component.cell.content.a1;
import xsna.jai;
import xsna.o4e;
import xsna.q630;
import xsna.q9g;
import xsna.r9g;
import xsna.wh50;
import xsna.zak0;
import xsna.zzs;

/* compiled from: SexyMiddleSlotImpl.kt */
/* loaded from: classes17.dex */
public final class e1 implements a1.e {
    public final wh50 a;

    public e1(jai jaiVar) {
        this.a = androidx.compose.runtime.k.b(jaiVar);
    }

    @Override // com.vk.core.compose.component.cell.content.a1.e
    public final void a(q9g q9gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-142416253);
        int i2 = (M.J(this) ? 256 : 128) | i;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-142416253, i2, -1, "com.vk.core.compose.component.cell.content.SexyMiddleSlotImpl.Content (SexyMiddleSlotImpl.kt:17)");
            }
            ((zzs) ((zak0) this.a).getValue()).invoke(r9g.a, q630.a.a, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o4e(this, i, 11);
        }
    }
}
