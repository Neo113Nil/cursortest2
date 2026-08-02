package com.facebook.ads.internal.api;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.NativeAdBase;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes2.dex */
public interface NativeAdBaseApi {
    NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase);

    void destroy();

    void downloadMedia();

    @Nullable
    String getAdBodyText();

    @Nullable
    String getAdCallToAction();

    @Nullable
    NativeAdImageApi getAdChoicesIcon();

    @Nullable
    String getAdChoicesImageUrl();

    @Nullable
    String getAdChoicesLinkUrl();

    @Nullable
    String getAdChoicesText();

    @Nullable
    NativeAdImageApi getAdCoverImage();

    @Nullable
    String getAdHeadline();

    @Nullable
    NativeAdImageApi getAdIcon();

    @Nullable
    String getAdLinkDescription();

    @Nullable
    String getAdSocialContext();

    @Nullable
    @Deprecated
    NativeAdRatingApi getAdStarRating();

    @Nullable
    String getAdTranslation();

    @Nullable
    String getAdUntrimmedBodyText();

    @Nullable
    String getAdvertiserName();

    float getAspectRatio();

    @Nullable
    String getId();

    String getPlacementId();

    @Nullable
    Drawable getPreloadedIconViewDrawable();

    @Nullable
    String getPromotedTranslation();

    @Nullable
    String getSponsoredTranslation();

    boolean hasCallToAction();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig);

    void onCtaBroadcast();

    void setExtraHints(ExtraHints extraHints);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void unregisterView();
}
