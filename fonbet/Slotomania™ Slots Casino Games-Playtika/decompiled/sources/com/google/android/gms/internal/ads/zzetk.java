package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
final class zzetk implements zzhbf {
    final /* synthetic */ zzetf zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzdnq zzd;
    final /* synthetic */ zzetn zze;

    zzetk(zzetn zzetnVar, zzetf zzetfVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzdnq zzdnqVar) {
        this.zza = zzetfVar;
        this.zzb = zzfpsVar;
        this.zzc = zzfpiVar;
        this.zzd = zzdnqVar;
        Objects.requireNonNull(zzetnVar);
        this.zze = zzetnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdnq zzdnqVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdnqVar.zza().zzg(th);
        zzdnqVar.zzb().zzdJ(zzg);
        zzetn zzetnVar = this.zze;
        zzetnVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzetk.this.zze.zzf().zze().zzdJ(zzg);
            }
        });
        zzflj.zza(zzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
            zzfpv zzg2 = zzetnVar.zzg();
            zzfpi zzfpiVar = this.zzc;
            zzfpiVar.zzh(zzg);
            zzfpiVar.zzj(th);
            zzfpiVar.zzd(false);
            zzg2.zzb(zzfpiVar.zzm());
            return;
        }
        zzfpsVar.zzf(zzg);
        zzfpi zzfpiVar2 = this.zzc;
        zzfpiVar2.zzj(th);
        zzfpiVar2.zzd(false);
        zzfpsVar.zza(zzfpiVar2);
        zzfpsVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfps zzfpsVar;
        zzetn zzetnVar = this.zze;
        zzcxh zzcxhVar = (zzcxh) obj;
        synchronized (zzetnVar) {
            if (zzcxhVar != null) {
                zzcxhVar.zzt();
            }
            zzcxhVar.zzq().zza(zzetnVar.zzf().zzc());
            this.zza.zzb(zzcxhVar);
            zzetnVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzetk.this.zze.zzf().zzd().zzg();
                }
            });
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzg = zzetnVar.zzg();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzg(zzcxhVar.zzr().zzb);
                zzfpiVar.zzi(zzcxhVar.zzn().zze());
                zzfpiVar.zzd(true);
                zzg.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zze(zzcxhVar.zzr().zzb);
                zzfpsVar.zzg(zzcxhVar.zzn().zze());
                zzfpi zzfpiVar2 = this.zzc;
                zzfpiVar2.zzd(true);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }
}
