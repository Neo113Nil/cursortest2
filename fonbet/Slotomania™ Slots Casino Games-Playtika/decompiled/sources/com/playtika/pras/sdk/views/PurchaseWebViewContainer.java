package com.playtika.pras.sdk.views;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.B5;
import com.playtika.pras.e.g;
import com.playtika.pras.sdk.network.ResponseCode;
import com.playtika.pras.sdk.network.SdkConfig;
import com.playtika.pras.sdk.network.StagesApi;
import com.playtika.pras.sdk.network.models.PrasSdkRequestParams;
import com.playtika.pras.sdk.network.models.PurchaseConfirmation;
import com.playtika.pras.sdk.network.models.WebStage;
import com.playtika.pras.sdk.network.models.WidgetGeneration;
import com.playtika.pras.sdk.network.models.results.PurchaseResult;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class PurchaseWebViewContainer extends BaseWebViewContainer {
    private static final String CONTEXT = "payments_widget";
    private static final int MIN_WEB_VIEW_VERSION_CODE = 284008500;

    private Bundle generateResult(String str) {
        PurchaseConfirmation purchaseConfirmation;
        try {
            JSONObject jSONObject = new JSONObject(str);
            ResponseCode fromCode = ResponseCode.fromCode(jSONObject.getInt("responseCode"));
            String optString = jSONObject.optString("purchaseData");
            String optString2 = jSONObject.optString("purchaseDataSignature");
            purchaseConfirmation = ((fromCode != ResponseCode.RESULT_USER_CANCELED && fromCode != ResponseCode.RESULT_SERVICE_UNAVAILABLE && fromCode != ResponseCode.RESULT_MAINTENANCE_MODE) || TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) ? new PurchaseConfirmation(jSONObject) : new PurchaseConfirmation(fromCode, optString, optString2);
        } catch (JSONException unused) {
            purchaseConfirmation = new PurchaseConfirmation(ResponseCode.RESULT_ERROR);
        }
        return new PurchaseResult(purchaseConfirmation).toBundle();
    }

    private Boolean turnOffFormattingParam() {
        try {
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return (!"com.google.android.webview".equals(packageInfo.packageName) || packageInfo.versionCode >= MIN_WEB_VIEW_VERSION_CODE) ? Boolean.FALSE : Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer
    public String getCDNUrl(WebStage webStage) {
        SdkConfig sdkConfig;
        if (SdkConfig.isDynamicConfigFlow() && (sdkConfig = SdkConfig.getInstance()) != null && sdkConfig.getInitResponse() != null) {
            return sdkConfig.getInitResponse().getWidgetUrl();
        }
        if (webStage == null) {
            com.playtika.pras.c.d.b("WebStage is null in fallback mode");
            return "";
        }
        WidgetGeneration widgetGeneration = SdkConfig.getWidgetGeneration();
        String gen6_cdnPath = widgetGeneration == WidgetGeneration.GEN_6 ? webStage.getGen6_cdnPath() : widgetGeneration == WidgetGeneration.GEN_5 ? webStage.getGen5_cdnPath() : webStage.getGen4_cdnPath();
        String stageName = StagesApi.getInstance().getStageName();
        String cDNHost = StagesApi.getInstance().getCDNHost();
        return (cDNHost != null ? cDNHost.replaceAll("/+$", "") : stageName.toLowerCase().equals(B5.t) ? "https://pras-cdn.playtika.com" : "https://pras-preprod-cdn.playtika.com") + "/" + gen6_cdnPath;
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer
    public String getESContext() {
        return CONTEXT;
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer
    public Uri.Builder getFormattedUrl(WebStage webStage) {
        Uri.Builder formattedUrl = super.getFormattedUrl(webStage);
        if (isSessionFlow()) {
            return formattedUrl;
        }
        formattedUrl.appendQueryParameter(AppLovinEventParameters.PRODUCT_IDENTIFIER, this.mRequestParams.getSku());
        formattedUrl.appendQueryParameter("platform", this.mRequestParams.getPlatform());
        if (!TextUtils.isEmpty(this.mRequestParams.getDeveloperPayload())) {
            formattedUrl.appendQueryParameter(SDKConstants.PARAM_DEVELOPER_PAYLOAD, this.mRequestParams.getDeveloperPayload());
        }
        if (!TextUtils.isEmpty(this.mRequestParams.getProductTitle())) {
            formattedUrl.appendQueryParameter("productTitle", this.mRequestParams.getProductTitle());
        }
        if (!TextUtils.isEmpty(this.mRequestParams.getCurrency())) {
            formattedUrl.appendQueryParameter("currency", this.mRequestParams.getCurrency());
        }
        if (!TextUtils.isEmpty(this.mRequestParams.getAppTransactionId())) {
            formattedUrl.appendQueryParameter("appTxnId", this.mRequestParams.getAppTransactionId());
        }
        formattedUrl.appendQueryParameter("oldWebView", String.valueOf(turnOffFormattingParam()));
        return formattedUrl;
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer
    public String getProductTitleForSession() {
        PrasSdkRequestParams prasSdkRequestParams = this.mRequestParams;
        if (prasSdkRequestParams != null) {
            return prasSdkRequestParams.getProductTitle();
        }
        return null;
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer
    public Boolean isSettingsWidget() {
        return Boolean.FALSE;
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer, com.playtika.pras.e.h
    public void onResult(String str) {
        com.playtika.pras.c.d.a("result data: " + str);
        closeWidget(generateResult(str));
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer, com.playtika.pras.e.h
    public void setResult(String str) {
        g gVar = this.webViewActionsListener;
        if (gVar != null) {
            gVar.b(generateResult(str));
        }
    }
}
