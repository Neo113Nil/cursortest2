package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface AdapterAdListener {
    void onAdClicked();

    default void onAdClicked(@NotNull Map<String, Object> map) {
        onAdClicked();
    }

    void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str);

    default void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str, @NotNull Map<String, Object> map) {
        onAdLoadFailed(adapterErrorType, i, str);
    }

    void onAdLoadSuccess();

    default void onAdLoadSuccess(@NotNull Map<String, Object> map) {
        onAdLoadSuccess();
    }

    void onAdOpened();

    default void onAdOpened(@NotNull Map<String, Object> map) {
        onAdOpened();
    }

    void onAdShowFailed(int i, String str);

    default void onAdShowFailed(int i, String str, @NotNull Map<String, Object> map) {
        onAdShowFailed(i, str);
    }
}
