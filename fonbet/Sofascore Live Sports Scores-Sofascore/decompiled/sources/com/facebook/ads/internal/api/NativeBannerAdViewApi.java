package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes2.dex */
public interface NativeBannerAdViewApi {
    View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type);

    View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes);
}
