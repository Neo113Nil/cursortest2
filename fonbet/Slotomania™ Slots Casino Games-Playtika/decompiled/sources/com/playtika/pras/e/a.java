package com.playtika.pras.e;

import android.view.View;
import com.playtika.pras.sdk.network.ResponseCode;
import com.playtika.pras.sdk.network.WebStageReceivedListener;
import com.playtika.pras.sdk.network.models.WebStage;
import com.playtika.pras.sdk.network.models.results.BillingResult;
import com.playtika.pras.sdk.views.BaseWebViewContainer;

/* loaded from: classes4.dex */
public final class a implements WebStageReceivedListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ BaseWebViewContainer b;

    public a(BaseWebViewContainer baseWebViewContainer, View view) {
        this.b = baseWebViewContainer;
        this.a = view;
    }

    @Override // com.playtika.pras.sdk.network.WebStageReceivedListener
    public final void onFailure() {
        com.playtika.pras.c.d.b("Error loading config");
        BaseWebViewContainer baseWebViewContainer = this.b;
        baseWebViewContainer.sendAnalyticsErrorEvent("result_config_loading_error", baseWebViewContainer.getESContext(), "WebStage is null");
        this.b.closeWidget(new BillingResult(ResponseCode.RESULT_ERROR).toBundle());
    }

    @Override // com.playtika.pras.sdk.network.WebStageReceivedListener
    public final void onSuccess(WebStage webStage) {
        this.b.doOnViewCreated(this.a, webStage);
    }
}
