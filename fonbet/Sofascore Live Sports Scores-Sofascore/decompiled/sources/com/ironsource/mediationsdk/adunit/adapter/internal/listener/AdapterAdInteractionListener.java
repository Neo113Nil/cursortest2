package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    default void onAdClosed(@NotNull Map<String, Object> map) {
        onAdClosed();
    }

    void onAdEnded();

    default void onAdEnded(@NotNull Map<String, Object> map) {
        onAdEnded();
    }

    void onAdStarted();

    default void onAdStarted(@NotNull Map<String, Object> map) {
        onAdStarted();
    }

    void onAdVisible();

    default void onAdVisible(@NotNull Map<String, Object> map) {
        onAdVisible();
    }
}
