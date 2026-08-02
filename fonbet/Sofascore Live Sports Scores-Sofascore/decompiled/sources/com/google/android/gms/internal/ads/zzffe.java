package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzffe implements zzfdg {
    public final String a;
    public final String b;

    public zzffe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject zzh = zzbp.zzh((JSONObject) obj, "pii");
            zzh.put("doritos", this.a);
            zzh.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }
}
