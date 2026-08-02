package com.vk.video.ui.discovery.minimizable.doc2doc.onboarding;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.d;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.unity3d.services.UnityAdsConstants;
import xsna.bh5;
import xsna.gzs;
import xsna.kai;
import xsna.kg50;
import xsna.rrv0;
import xsna.s3q0;
import xsna.td;
import xsna.u70;
import xsna.vak0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: D2DOnboardingView.kt */
/* loaded from: classes7.dex */
public final class D2DOnboardingView extends td {
    public static final /* synthetic */ int n = 0;
    public final kg50 l;
    public final wh50 m;

    public D2DOnboardingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.m = k.b(null);
    }

    public final float getAnimationTime() {
        return this.l.getFloatValue();
    }

    public final gzs<s3q0> getOnTooltipClick() {
        return (gzs) ((zak0) this.m).getValue();
    }

    @Override // xsna.td
    public final void o(int i, a aVar) {
        a M = aVar.M(2038629602);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(2038629602, i2, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView.Content (D2DOnboardingView.kt:69)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(1751028383, new bh5(this, 3), M), M, 1572870, 62);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new u70(this, i, 2);
        }
    }

    public final void setAnimationTime(float f) {
        ((vak0) this.l).g(f);
    }

    public final void setOnTooltipClick(gzs<s3q0> gzsVar) {
        ((zak0) this.m).setValue(gzsVar);
    }
}
