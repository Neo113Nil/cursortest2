package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdsv {
    private final Executor zza;
    private final zzdsq zzb;
    private final zzdyu zzc;

    zzdsv(Executor executor, zzdsq zzdsqVar, zzdyu zzdyuVar) {
        this.zza = executor;
        this.zzb = zzdsqVar;
        this.zzc = zzdyuVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture zza;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzhbi.zza(Collections.emptyList());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcU)).booleanValue()) {
            this.zzc.zzf(zzdyi.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zza = zzhbi.zza(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zza = zzhbi.zza(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zza = "string".equals(optString2) ? zzhbi.zza(new zzdss(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzhbi.zzk(this.zzb.zza(optJSONObject, "image_value", null), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzdst
                        @Override // com.google.android.gms.internal.ads.zzgsn
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdss(optString, (zzbld) obj);
                        }
                    }, this.zza) : zzhbi.zza(null);
                }
            }
            arrayList.add(zza);
        }
        return zzhbi.zzk(zzhbi.zzm(arrayList), zzdsu.zza, this.zza);
    }
}
