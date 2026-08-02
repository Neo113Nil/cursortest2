package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbvo {
    public final List a;

    public zzbvo(JSONObject jSONObject) {
        if (zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzbvn zzbvnVar = new zzbvn(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzbvnVar.c);
                arrayList.add(zzbvnVar);
                if (i < 0) {
                    Iterator it = zzbvnVar.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbvp.a("click_urls", optJSONObject);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbvp.a("imp_urls", optJSONObject);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbvp.a("downloaded_imp_urls", optJSONObject);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbvp.a("nofill_urls", optJSONObject);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbvp.a("remote_ping_urls", optJSONObject);
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong(ToolBar.REFRESH, -1L);
            zzcct.Y0(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
