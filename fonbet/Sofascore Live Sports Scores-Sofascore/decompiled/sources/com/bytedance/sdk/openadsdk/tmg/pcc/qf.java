package com.bytedance.sdk.openadsdk.tmg.pcc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.mu;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private final mu pcc;
    private final String sf;

    public qf(String str, mu muVar) {
        this.pcc = muVar;
        this.sf = str;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc("appInfo", new qf("appInfo", muVar));
        jrVar.pcc("adInfo", new qf("adInfo", muVar));
        jrVar.pcc("sendLog", new qf("sendLog", muVar));
        jrVar.pcc("playable_style", new qf("playable_style", muVar));
        jrVar.pcc("getTemplateInfo", new qf("getTemplateInfo", muVar));
        jrVar.pcc("getTeMaiAds", new qf("getTeMaiAds", muVar));
        jrVar.pcc(U3.i.o, new qf(U3.i.o, muVar));
        jrVar.pcc("getScreenSize", new qf("getScreenSize", muVar));
        jrVar.pcc("getCloseButtonInfo", new qf("getCloseButtonInfo", muVar));
        jrVar.pcc("getVolume", new qf("getVolume", muVar));
        jrVar.pcc("removeLoading", new qf("removeLoading", muVar));
        jrVar.pcc("sendReward", new qf("sendReward", muVar));
        jrVar.pcc("subscribe_app_ad", new qf("subscribe_app_ad", muVar));
        jrVar.pcc("download_app_ad", new qf("download_app_ad", muVar));
        jrVar.pcc("cancel_download_app_ad", new qf("cancel_download_app_ad", muVar));
        jrVar.pcc("unsubscribe_app_ad", new qf("unsubscribe_app_ad", muVar));
        jrVar.pcc("landscape_click", new qf("landscape_click", muVar));
        jrVar.pcc("clickEvent", new qf("clickEvent", muVar));
        jrVar.pcc("renderDidFinish", new qf("renderDidFinish", muVar));
        jrVar.pcc("dynamicTrack", new qf("dynamicTrack", muVar));
        jrVar.pcc("skipVideo", new qf("skipVideo", muVar));
        jrVar.pcc(FyberMediationAdapter.KEY_MUTE_VIDEO, new qf(FyberMediationAdapter.KEY_MUTE_VIDEO, muVar));
        jrVar.pcc("changeVideoState", new qf("changeVideoState", muVar));
        jrVar.pcc("getCurrentVideoState", new qf("getCurrentVideoState", muVar));
        jrVar.pcc("send_temai_product_ids", new qf("send_temai_product_ids", muVar));
        jrVar.pcc("getMaterialMeta", new qf("getMaterialMeta", muVar));
        jrVar.pcc("endcard_load", new qf("endcard_load", muVar));
        jrVar.pcc("pauseWebView", new qf("pauseWebView", muVar));
        jrVar.pcc("pauseWebViewTimers", new qf("pauseWebViewTimers", muVar));
        jrVar.pcc("webview_time_track", new qf("webview_time_track", muVar));
        jrVar.pcc("openPrivacy", new qf("openPrivacy", muVar));
        jrVar.pcc("openAdLandPageLinks", new qf("openAdLandPageLinks", muVar));
        jrVar.pcc("getNativeSiteCustomData", new qf("getNativeSiteCustomData", muVar));
        jrVar.pcc(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, new qf(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, muVar));
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    @Nullable
    public JSONObject pcc(String str, @NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        mu.sf sfVar = new mu.sf();
        sfVar.pcc = NotificationCompat.CATEGORY_CALL;
        sfVar.gm = this.sf;
        sfVar.oo = jSONObject;
        return this.pcc.pcc(sfVar, 3);
    }
}
