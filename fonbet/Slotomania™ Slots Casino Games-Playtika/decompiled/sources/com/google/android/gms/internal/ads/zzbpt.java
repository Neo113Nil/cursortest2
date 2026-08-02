package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzbpt implements zzbpu {
    final /* synthetic */ zzcfk zza;

    zzbpt(zzbpv zzbpvVar, zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
        Objects.requireNonNull(zzbpvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzb(String str) {
        this.zza.zzd(new zzbtl(str));
    }
}
