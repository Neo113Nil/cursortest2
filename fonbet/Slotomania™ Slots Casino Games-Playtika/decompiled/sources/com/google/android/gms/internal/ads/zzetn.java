package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzetn implements zzetg {
    private final zzfkl zza;
    private final zzcmx zzb;
    private final Context zzc;
    private final zzetd zzd;
    private final zzfpv zze;
    private zzcxw zzf;

    public zzetn(zzcmx zzcmxVar, Context context, zzetd zzetdVar, zzfkl zzfklVar) {
        this.zzb = zzcmxVar;
        this.zzc = context;
        this.zzd = zzetdVar;
        this.zza = zzfklVar;
        this.zze = zzcmxVar.zzx();
        zzfklVar.zzt(zzetdVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzete zzeteVar, zzetf zzetfVar) throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzK(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzetn.this.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzetn.this.zzd();
                }
            });
            return false;
        }
        boolean z = zzmVar.zzf;
        zzflj.zzb(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkm)).booleanValue() && z) {
            this.zzb.zzw().zzc(true);
        }
        int i3 = ((zzeth) zzeteVar).zza;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String zza = zzdyi.PUBLIC_API_CALL.zza();
        Long valueOf = Long.valueOf(currentTimeMillis);
        Bundle zza2 = zzdyk.zza(new Pair(zza, valueOf), new Pair(zzdyi.DYNAMITE_ENTER.zza(), valueOf));
        zzfkl zzfklVar = this.zza;
        zzfklVar.zza(zzmVar);
        zzfklVar.zzv(zza2);
        zzfklVar.zzl(i3);
        zzfkm zzA = zzfklVar.zzA();
        zzfpi zzo = zzfpi.zzo(context, zzfpr.zzg(zzA), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcl zzclVar = zzA.zzo;
        if (zzclVar != null) {
            this.zzd.zzc().zzo(zzclVar);
        }
        zzcmx zzcmxVar = this.zzb;
        zzdnp zzo2 = zzcmxVar.zzo();
        zzdbo zzdboVar = new zzdbo();
        zzdboVar.zza(context);
        zzdboVar.zzb(zzA);
        zzo2.zzf(zzdboVar.zze());
        zzdie zzdieVar = new zzdie();
        zzetd zzetdVar = this.zzd;
        zzdieVar.zze(zzetdVar.zzc(), zzcmxVar.zzb());
        zzo2.zzg(zzdieVar.zzn());
        zzo2.zze(zzetdVar.zzb());
        zzfps zzfpsVar = null;
        zzo2.zzd(new zzcuw(null));
        zzdnq zzh = zzo2.zzh();
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            zzfpsVar = zzh.zzc();
            zzfpsVar.zzi(8);
            zzfpsVar.zzc(zzmVar.zzp);
            zzfpsVar.zzd(zzmVar.zzm);
        }
        zzfps zzfpsVar2 = zzfpsVar;
        zzcmxVar.zzv().zza(1);
        zzhbs zzc = zzfno.zzc();
        ScheduledExecutorService zzc2 = zzcmxVar.zzc();
        zzcyl zza3 = zzh.zza();
        zzcxw zzcxwVar = new zzcxw(zzc, zzc2, zza3.zzc(zza3.zzb()));
        this.zzf = zzcxwVar;
        zzcxwVar.zza(new zzetk(this, zzetfVar, zzfpsVar2, zzo, zzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zzb() {
        zzcxw zzcxwVar = this.zzf;
        return zzcxwVar != null && zzcxwVar.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.zze().zzdJ(zzflo.zzd(4, null, null));
    }

    final /* synthetic */ void zzd() {
        this.zzd.zze().zzdJ(zzflo.zzd(6, null, null));
    }

    final /* synthetic */ zzcmx zze() {
        return this.zzb;
    }

    final /* synthetic */ zzetd zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfpv zzg() {
        return this.zze;
    }
}
