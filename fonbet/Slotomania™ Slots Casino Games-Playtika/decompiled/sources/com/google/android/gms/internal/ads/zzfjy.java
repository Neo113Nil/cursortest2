package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfjy {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzfjy(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
        this.zzd = zzd;
        this.zza = zzd.optString("ad_html", null);
        this.zzb = zzd.optString("ad_base_url", null);
        this.zzc = zzd.optJSONObject("ad_json");
    }
}
