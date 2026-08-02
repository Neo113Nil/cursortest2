package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzboa implements zzbpe {
    zzboa() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzd;
        zzcki zzckiVar = (zzcki) obj;
        zzblf zzar = zzckiVar.zzar();
        if (zzar == null || (zzd = zzar.zzd()) == null) {
            zzckiVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzckiVar.zzd("nativeClickMetaReady", zzd);
        }
    }
}
