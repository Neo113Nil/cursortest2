package com.google.android.gms.ads.preload;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
@Deprecated
/* loaded from: classes8.dex */
public interface PreloadCallback {
    void onAdsAvailable(PreloadConfiguration preloadConfiguration);

    void onAdsExhausted(PreloadConfiguration preloadConfiguration);
}
