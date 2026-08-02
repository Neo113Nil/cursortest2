package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfei implements zzfdg {
    public final AdvertisingIdClient.Info a;
    public final String b;
    public final zzgdj c;

    public zzfei(AdvertisingIdClient.Info info, String str, zzgdj zzgdjVar) {
        this.a = info;
        this.b = str;
        this.c = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final void zza(Object obj) {
        try {
            JSONObject zzh = zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.b;
                if (str != null) {
                    zzh.put("pdid", str);
                    zzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzh.put("rdid", info.getId());
            zzh.put("is_lat", info.isLimitAdTrackingEnabled());
            zzh.put("idtype", "adid");
            zzgdj zzgdjVar = this.c;
            long j = zzgdjVar.b;
            String str2 = zzgdjVar.a;
            if (str2 != null && j > 0) {
                zzh.put("paidv1_id_android_3p", str2);
                zzh.put("paidv1_creation_time_android_3p", j);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
