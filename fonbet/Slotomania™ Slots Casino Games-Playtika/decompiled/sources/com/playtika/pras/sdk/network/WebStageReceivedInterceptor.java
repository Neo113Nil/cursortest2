package com.playtika.pras.sdk.network;

import com.playtika.pras.sdk.network.models.WebStage;

/* loaded from: classes8.dex */
public interface WebStageReceivedInterceptor {
    void onFailure(WebStageReceivedInterceptorChain webStageReceivedInterceptorChain);

    void onSuccess(WebStage webStage, WebStageReceivedInterceptorChain webStageReceivedInterceptorChain);
}
