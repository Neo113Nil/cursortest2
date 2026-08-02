package com.vk.core.compose.component.cell.content;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import xsna.fvr;
import xsna.g4j0;
import xsna.jai;
import xsna.kqu0;
import xsna.q630;
import xsna.s200;
import xsna.spg0;
import xsna.wh50;
import xsna.y85;
import xsna.zak0;
import xsna.zzs;

/* compiled from: LeftMainCustomImpl.kt */
/* loaded from: classes17.dex */
public final class j0 implements Cell$Left.Main.a, g4j0 {
    public final wh50 a;

    public j0(jai jaiVar) {
        this.a = androidx.compose.runtime.k.b(jaiVar);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1852949451);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1852949451, i2, -1, "com.vk.core.compose.component.cell.content.LeftMainCustomImpl.Content (LeftMainCustomImpl.kt:18)");
            }
            zzs zzsVar = (zzs) ((zak0) this.a).getValue();
            fvr.n();
            com.vk.core.compose.component.defaults.c.a.d(M);
            zzsVar.invoke(spg0Var, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, 1, q630Var), M, Integer.valueOf(i2 & 14));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y85(this, spg0Var, q630Var, i, 1);
        }
    }
}
