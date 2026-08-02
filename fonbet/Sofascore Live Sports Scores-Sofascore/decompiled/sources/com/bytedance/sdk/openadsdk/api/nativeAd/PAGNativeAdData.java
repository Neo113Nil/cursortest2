package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface PAGNativeAdData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum PAGNativeMediaType {
        PAGNativeMediaTypeImage,
        PAGNativeMediaTypeVideo
    }

    @Nullable
    View getAdChoicesView();

    View getAdLogoView();

    String getButtonText();

    String getDescription();

    PAGImageItem getIcon();

    PAGNativeMediaType getMediaType();

    PAGMediaView getMediaView();

    String getTitle();
}
