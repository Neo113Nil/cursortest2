package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbvn {
    public final List a;
    public final String b;
    public final String c;

    public zzbvn(JSONObject jSONObject) {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.a("clickurl", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.a("imp_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.a("downloaded_imp_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.a("fill_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.a("video_start_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.a("video_complete_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.a("video_reward_urls", jSONObject);
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbvp.a("manual_impression_urls", optJSONObject);
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbvp.a("template_ids", jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
