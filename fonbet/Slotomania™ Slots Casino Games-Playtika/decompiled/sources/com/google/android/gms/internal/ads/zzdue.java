package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzdue implements zzhbf {
    final /* synthetic */ zzfjt zza;
    final /* synthetic */ zzfjw zzb;
    final /* synthetic */ zzcsx zzc;
    final /* synthetic */ zzdul zzd;

    zzdue(zzdul zzdulVar, zzfjt zzfjtVar, zzfjw zzfjwVar, zzcsx zzcsxVar) {
        this.zza = zzfjtVar;
        this.zzb = zzfjwVar;
        this.zzc = zzcsxVar;
        Objects.requireNonNull(zzdulVar);
        this.zzd = zzdulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcki zzckiVar = (zzcki) obj;
        zzfjt zzfjtVar = this.zza;
        zzckiVar.zzaD(zzfjtVar, this.zzb);
        zzcmg zzP = zzckiVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzly)).booleanValue() && zzP != null) {
            zzcsx zzcsxVar = this.zzc;
            zzdul zzdulVar = this.zzd;
            zzP.zzd(zzcsxVar, zzdulVar.zzm(), zzdulVar.zzn());
            zzP.zze(zzcsxVar, zzdulVar.zzm(), zzdulVar.zzl());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzox)).booleanValue() || zzP == null) {
            return;
        }
        zzP.zzb(zzfjtVar);
    }
}
