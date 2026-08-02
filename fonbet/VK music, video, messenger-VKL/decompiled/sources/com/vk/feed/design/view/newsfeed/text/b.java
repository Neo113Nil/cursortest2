package com.vk.feed.design.view.newsfeed.text;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ChipTextFadeDrawing.kt */
/* loaded from: classes18.dex */
public final class b {
    public static final float a(float f, float f2) {
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        float f3 = f * 1.5f;
        return f3 > f2 ? f2 : f3;
    }
}
