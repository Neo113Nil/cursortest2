package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzdos implements zzhbf {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdpc zzb;

    zzdos(zzdpc zzdpcVar, String str, boolean z) {
        Objects.requireNonNull(zzdpcVar);
        this.zzb = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgs)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdpc zzdpcVar = this.zzb;
        zzdpcVar.zzZ().zzo((zzcki) obj);
        String str = this.zza;
        zzcfk zzY = zzdpcVar.zzZ().zzY();
        zzelb zzL = zzdpcVar.zzL(str, true);
        if (zzL != null && zzY != null) {
            zzY.zzc(zzL);
        } else if (zzY != null) {
            zzY.cancel(false);
        }
    }
}
