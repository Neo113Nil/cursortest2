package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* loaded from: classes4.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    default void onAdClosed(Map<String, Object> map) {
        onAdClosed();
    }

    void onAdEnded();

    default void onAdEnded(Map<String, Object> map) {
        onAdEnded();
    }

    void onAdStarted();

    default void onAdStarted(Map<String, Object> map) {
        onAdStarted();
    }

    void onAdVisible();

    default void onAdVisible(Map<String, Object> map) {
        onAdVisible();
    }
}
