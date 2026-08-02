package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfdu implements zzfbw {
    private final String zza;
    private final String zzb;

    public zzfdu(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject zzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            zzh.put("doritos", this.zza);
            zzh.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }
}
