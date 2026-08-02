package com.iab.omid.library.smartadserver1.devicevolume;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public class a {
    public float a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = i / i2;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
