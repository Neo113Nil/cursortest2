package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfli {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public zzfli(JsonReader jsonReader) {
        JSONObject zzd = zzbp.zzd(jsonReader);
        this.d = zzd;
        this.a = zzd.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.b = zzd.optString("ad_base_url", null);
        this.c = zzd.optJSONObject("ad_json");
    }
}
