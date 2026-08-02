package com.playtika.pras.sdk.network;

import com.playtika.pras.sdk.network.models.WebStage;

/* loaded from: classes7.dex */
public interface WebStageReceivedInterceptorChain {
    void onFailure();

    void onSuccess(WebStage webStage);
}
