package com.iab.omid.library.vungle.devicevolume;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
