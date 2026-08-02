package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfes implements zzfdg {
    public final String a;
    public final int b;

    public zzfes(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        JSONObject jSONObject = (JSONObject) obj;
        String str = this.a;
        if (TextUtils.isEmpty(str) || (i = this.b) == -1) {
            return;
        }
        try {
            JSONObject zzh = zzbp.zzh(jSONObject, "pii");
            zzh.put("pvid", str);
            zzh.put("pvid_s", i);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
