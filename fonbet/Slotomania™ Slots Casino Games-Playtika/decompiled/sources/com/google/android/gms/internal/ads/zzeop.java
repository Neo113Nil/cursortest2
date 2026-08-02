package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzeop implements zzhbf {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfjw zzb;
    final /* synthetic */ zzfjt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfrk zze;
    final /* synthetic */ zzfke zzf;
    final /* synthetic */ zzeor zzg;

    zzeop(zzeor zzeorVar, long j, zzfjw zzfjwVar, zzfjt zzfjtVar, String str, zzfrk zzfrkVar, zzfke zzfkeVar) {
        this.zza = j;
        this.zzb = zzfjwVar;
        this.zzc = zzfjtVar;
        this.zzd = str;
        this.zze = zzfrkVar;
        this.zzf = zzfkeVar;
        Objects.requireNonNull(zzeorVar);
        this.zzg = zzeorVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        int i;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzb;
        Integer valueOf;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzeor zzeorVar = this.zzg;
        long elapsedRealtime = zzeorVar.zzj().elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i2 = 2;
        } else {
            if (th instanceof zzenz) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i2 = 4;
            } else if (th instanceof zzfkt) {
                i2 = 5;
            } else if (th instanceof zzedr) {
                i2 = zzflo.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcn)).booleanValue() && (th instanceof zzelk) && (zzb = ((zzelk) th).zzb()) != null) {
                    valueOf = Integer.valueOf(zzb.zza);
                    i = i2;
                    synchronized (zzeorVar) {
                        if (zzeorVar.zzn()) {
                            zzeorVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzelk ? (zzelk) th : null, elapsedRealtime);
                            elapsedRealtime = elapsedRealtime;
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjC)).booleanValue()) {
                            zzfro zzl = zzeorVar.zzl();
                            zzfrk zzfrkVar = this.zze;
                            zzfke zzfkeVar = this.zzf;
                            zzfjt zzfjtVar = this.zzc;
                            zzl.zza(zzfrkVar.zza(zzfkeVar, zzfjtVar, zzfjtVar.zzn), zzfjtVar.zzax);
                        }
                        if (zzeorVar.zzp()) {
                            return;
                        }
                        LinkedHashMap zzm = zzeorVar.zzm();
                        zzfjt zzfjtVar2 = this.zzc;
                        zzm.put(zzfjtVar2, new zzeoq(this.zzd, zzfjtVar2.zzaf, i, elapsedRealtime, valueOf));
                        com.google.android.gms.ads.internal.client.zze zza = zzflo.zza(th);
                        int i3 = zza.zza;
                        if ((i3 == 3 || i3 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            zza = zzflo.zza(new zzelk(13, zza.zzd));
                        }
                        zzeorVar.zzo().zze(zzfjtVar2, elapsedRealtime, zza);
                        return;
                    }
                }
            } else {
                i = 6;
            }
            valueOf = null;
            synchronized (zzeorVar) {
            }
        }
        i = i2;
        valueOf = null;
        synchronized (zzeorVar) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(Object obj) {
        long j;
        zzeor zzeorVar = this.zzg;
        long elapsedRealtime = zzeorVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzeorVar) {
            if (zzeorVar.zzn()) {
                j = elapsedRealtime;
                zzeorVar.zzk().zza(this.zzb, this.zzc, 0, null, j);
            } else {
                j = elapsedRealtime;
            }
            if (zzeorVar.zzp()) {
                return;
            }
            zzfjt zzfjtVar = this.zzc;
            if (zzeorVar.zzi(zzfjtVar)) {
                ((zzeoq) zzeorVar.zzm().get(zzfjtVar)).zzd = j;
            } else {
                long j2 = j;
                j = j2;
                zzeorVar.zzm().put(zzfjtVar, new zzeoq(this.zzd, zzfjtVar.zzaf, 0, j2, null));
            }
            zzeorVar.zzo().zzd(zzfjtVar, j, null);
        }
    }
}
