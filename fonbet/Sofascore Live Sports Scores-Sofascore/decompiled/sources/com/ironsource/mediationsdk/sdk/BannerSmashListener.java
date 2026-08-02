package com.ironsource.mediationsdk.sdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface BannerSmashListener {
    void onBannerAdClicked();

    default void onBannerAdClicked(Map<String, Object> map) {
        onBannerAdClicked();
    }

    void onBannerAdLeftApplication();

    default void onBannerAdLeftApplication(Map<String, Object> map) {
        onBannerAdLeftApplication();
    }

    void onBannerAdLoadFailed(IronSourceError ironSourceError);

    default void onBannerAdLoadFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onBannerAdLoadFailed(ironSourceError);
    }

    void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams);

    default void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        onBannerAdLoaded(view, layoutParams);
    }

    void onBannerAdScreenDismissed();

    default void onBannerAdScreenDismissed(Map<String, Object> map) {
        onBannerAdScreenDismissed();
    }

    void onBannerAdScreenPresented();

    default void onBannerAdScreenPresented(Map<String, Object> map) {
        onBannerAdScreenPresented();
    }

    void onBannerAdShown();

    default void onBannerAdShown(Map<String, Object> map) {
        onBannerAdShown();
    }

    void onBannerInitFailed(IronSourceError ironSourceError);

    default void onBannerInitFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onBannerInitFailed(ironSourceError);
    }

    void onBannerInitSuccess();

    default void onBannerInitSuccess(Map<String, Object> map) {
        onBannerInitSuccess();
    }
}
