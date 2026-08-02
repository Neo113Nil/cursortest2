package com.playtika.pras.sdk.network;

import com.playtika.pras.sdk.network.models.WebStage;

/* loaded from: classes4.dex */
public interface WebStageReceivedListener {
    void onFailure();

    void onSuccess(WebStage webStage);
}
