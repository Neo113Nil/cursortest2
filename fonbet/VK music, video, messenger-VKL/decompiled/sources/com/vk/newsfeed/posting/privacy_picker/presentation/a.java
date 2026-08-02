package com.vk.newsfeed.posting.privacy_picker.presentation;

import androidx.compose.runtime.f;
import com.unity3d.services.UnityAdsConstants;
import xsna.ao50;
import xsna.cr7;
import xsna.fy7;
import xsna.i6v0;
import xsna.izs;
import xsna.kai;
import xsna.lfd0;
import xsna.s3q0;
import xsna.uov0;
import xsna.wed0;

/* compiled from: PrivacySettingsNewContentView.kt */
/* loaded from: classes4.dex */
public final class a extends i6v0<lfd0, wed0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((lfd0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(lfd0 lfd0Var, izs<? super wed0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-863277614);
        int i2 = i | (M.J(lfd0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-863277614, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsNewContentView.ThemedContent (PrivacySettingsNewContentView.kt:80)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(504289433, new cr7(this, lfd0Var, izsVar, 10), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new fy7(i, 9, this, lfd0Var, izsVar);
        }
    }
}
