package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final class zzfhu implements zzhbf {
    final /* synthetic */ zzetf zza;
    final /* synthetic */ zzfps zzb;
    final /* synthetic */ zzfpi zzc;
    final /* synthetic */ zzdmu zzd;
    final /* synthetic */ zzfhw zze;

    zzfhu(zzfhw zzfhwVar, zzetf zzetfVar, zzfps zzfpsVar, zzfpi zzfpiVar, zzdmu zzdmuVar) {
        this.zza = zzetfVar;
        this.zzb = zzfpsVar;
        this.zzc = zzfpiVar;
        this.zzd = zzdmuVar;
        Objects.requireNonNull(zzfhwVar);
        this.zze = zzfhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzfps zzfpsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgL)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdmu zzdmuVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdmuVar.zzb().zzg(th);
        zzfhw zzfhwVar = this.zze;
        synchronized (zzfhwVar) {
            zzfhwVar.zzi(null);
            zzdmuVar.zza().zzdJ(zzg);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzju)).booleanValue()) {
                zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfhu.this.zze.zzf().zzdJ(zzg);
                    }
                });
                zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfhu.this.zze.zzg().zzdJ(zzg);
                    }
                });
            }
            zzflj.zza(zzg.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzh = zzfhwVar.zzh();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzh(zzg);
                zzfpiVar.zzj(th);
                zzfpiVar.zzd(false);
                zzh.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zzf(zzg);
                zzfpi zzfpiVar2 = this.zzc;
                zzfpiVar2.zzj(th);
                zzfpiVar2.zzd(false);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfps zzfpsVar;
        zzfhw zzfhwVar = this.zze;
        zzdln zzdlnVar = (zzdln) obj;
        synchronized (zzfhwVar) {
            if (zzdlnVar != null) {
                zzdlnVar.zzt();
            }
            zzfhwVar.zzi(null);
            zzbhv zzbhvVar = zzbie.zzju;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                zzdfv zzq = zzdlnVar.zzq();
                zzq.zza(zzfhwVar.zzf());
                zzq.zzd(zzfhwVar.zzg());
            }
            this.zza.zzb(zzdlnVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue()) {
                zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfht
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfhu.this.zze.zzf().zzg();
                    }
                });
                zzfhwVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfhu.this.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbjx.zzc.zze()).booleanValue() || (zzfpsVar = this.zzb) == null) {
                zzfpv zzh = zzfhwVar.zzh();
                zzfpi zzfpiVar = this.zzc;
                zzfpiVar.zzg(zzdlnVar.zzr().zzb);
                zzfpiVar.zzi(zzdlnVar.zzn().zze());
                zzfpiVar.zzd(true);
                zzh.zzb(zzfpiVar.zzm());
            } else {
                zzfpsVar.zze(zzdlnVar.zzr().zzb);
                zzfpsVar.zzg(zzdlnVar.zzn().zze());
                zzfpi zzfpiVar2 = this.zzc;
                zzfpiVar2.zzd(true);
                zzfpsVar.zza(zzfpiVar2);
                zzfpsVar.zzh();
            }
        }
    }
}
