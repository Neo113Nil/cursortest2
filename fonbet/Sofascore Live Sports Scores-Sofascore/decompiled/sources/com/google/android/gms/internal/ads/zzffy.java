package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzffy implements zzfdg {
    public final String a;

    public zzffy(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            zzbp.zzh(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed putting trustless token.", e);
        }
    }
}
