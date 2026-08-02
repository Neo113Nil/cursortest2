package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdof implements zzimi {
    private final zzdod zza;

    private zzdof(zzdod zzdodVar) {
        this.zza = zzdodVar;
    }

    public static zzdof zzc(zzdod zzdodVar) {
        return new zzdof(zzdodVar);
    }

    public static JSONObject zzd(zzdod zzdodVar) {
        JSONObject zzc = zzdodVar.zzc();
        zzimq.zzb(zzc);
        return zzc;
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
