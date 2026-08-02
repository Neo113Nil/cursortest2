package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public interface PreloadCallback {
    void onAdsAvailable(@NonNull PreloadConfiguration preloadConfiguration);

    void onAdsExhausted(@NonNull PreloadConfiguration preloadConfiguration);
}
