package com.playtika.pras.sdk.views;

import android.net.Uri;
import com.ironsource.B5;
import com.playtika.pras.sdk.network.SdkConfig;
import com.playtika.pras.sdk.network.StagesApi;
import com.playtika.pras.sdk.network.models.WebStage;
import com.playtika.pras.sdk.network.models.WidgetGeneration;

/* loaded from: classes4.dex */
public class SettingsWebViewContainer extends BaseWebViewContainer {
    private static final String CONTEXT = "payments_settings_widget";

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
        formattedUrl.appendQueryParameter("settingsMode", "true");
        return formattedUrl;
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer
    public String getProductTitleForSession() {
        return null;
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer
    public Boolean isSettingsWidget() {
        return Boolean.TRUE;
    }

    @Override // com.playtika.pras.sdk.views.BaseWebViewContainer, com.playtika.pras.e.h
    public void setResult(String str) {
    }
}
