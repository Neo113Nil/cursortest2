package com.bytedance.sdk.openadsdk.tmg.pcc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.mu;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", U3.i.o, "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", FyberMediationAdapter.KEY_MUTE_VIDEO, "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", CampaignEx.JSON_NATIVE_VIDEO_CLOSE));
    private final mu sf;

    public kj(mu muVar) {
        this.sf = muVar;
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    @Nullable
    public JSONObject pcc(String str, @NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        mu.sf sfVar = new mu.sf();
        sfVar.pcc = NotificationCompat.CATEGORY_CALL;
        sfVar.gm = str;
        sfVar.oo = jSONObject;
        return this.sf.pcc(sfVar, 3);
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc(pcc, new kj(muVar));
    }
}
