package com.bytedance.sdk.openadsdk.api.nativeAd;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PAGImageItem {
    private final String gm;
    private float oo;
    private final int pcc;
    private final int sf;

    public PAGImageItem(int i, int i2, String str, float f) {
        this.pcc = i;
        this.sf = i2;
        this.gm = str;
        this.oo = f;
    }

    public float getDuration() {
        return this.oo;
    }

    public int getHeight() {
        return this.pcc;
    }

    public String getImageUrl() {
        return this.gm;
    }

    public int getWidth() {
        return this.sf;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
