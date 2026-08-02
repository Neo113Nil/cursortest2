package com.playtika.pras.e;

import android.view.View;
import com.playtika.pras.sdk.network.ResponseCode;
import com.playtika.pras.sdk.network.models.results.BillingResult;
import com.playtika.pras.sdk.views.BaseWebViewContainer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements View.OnClickListener {
    public final /* synthetic */ BaseWebViewContainer a;

    public b(BaseWebViewContainer baseWebViewContainer) {
        this.a = baseWebViewContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        try {
            JSONObject createAdditionalFieldsWithSessionId = this.a.createAdditionalFieldsWithSessionId();
            str = this.a.widgetRuntimeGuid;
            createAdditionalFieldsWithSessionId.put("widget_runtime_guid", str);
            BaseWebViewContainer baseWebViewContainer = this.a;
            baseWebViewContainer.sendAnalyticsErrorEvent(baseWebViewContainer.getWidgetClosedEventType(), this.a.getESContext(), "", createAdditionalFieldsWithSessionId);
        } catch (JSONException unused) {
            BaseWebViewContainer baseWebViewContainer2 = this.a;
            baseWebViewContainer2.sendAnalyticsErrorEvent(baseWebViewContainer2.getWidgetClosedEventType(), this.a.getESContext(), "");
        }
        this.a.closeWidget(new BillingResult(ResponseCode.RESULT_USER_CANCELED).toBundle());
    }
}
