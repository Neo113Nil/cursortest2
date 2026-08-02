package com.vk.profile.design.compose.header;

import androidx.compose.runtime.f;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import xsna.h85;
import xsna.izs;
import xsna.ja5;
import xsna.kai;
import xsna.q630;
import xsna.rvi;
import xsna.wzs;

/* compiled from: AuthorHeader.kt */
/* loaded from: classes5.dex */
public final class d {
    public static final void a(final AuthorHeaderConfig authorHeaderConfig, final izs izsVar, final q630 q630Var, final ja5 ja5Var, final float f, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-630337618);
        int i2 = (M.J(authorHeaderConfig) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i3 = i2 | (M.J(ja5Var) ? 2048 : 1024) | (M.n(f) ? 16384 : 8192) | 196608 | (M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.l(z2) ? 8388608 : 4194304);
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-630337618, i3, -1, "com.vk.profile.design.compose.header.AuthorHeader (AuthorHeader.kt:26)");
            }
            rvi.a(h85.a.b(izsVar), kai.c(1459127022, new wzs() { // from class: xsna.o95
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1459127022, intValue, -1, "com.vk.profile.design.compose.header.AuthorHeader.<anonymous> (AuthorHeader.kt:30)");
                        }
                        g85.a(AuthorHeaderConfig.this, ja5Var, f, z, q630Var, z2, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p95
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.profile.design.compose.header.d.a(AuthorHeaderConfig.this, izsVar, q630Var, ja5Var, f, z, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
