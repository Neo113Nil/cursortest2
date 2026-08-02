package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* loaded from: classes8.dex */
public interface AdapterAdRewardListener extends AdapterAdInteractionListener {
    void onAdRewarded();

    default void onAdRewarded(Map<String, Object> map) {
        onAdRewarded();
    }
}
