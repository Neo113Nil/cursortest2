package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpp;

/* loaded from: classes9.dex */
final class zzhb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzhc zze;

    zzhb(zzhc zzhcVar, String str, String str2, String str3, long j11) {
        this.zze = zzhcVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzll zzllVar;
        zzll zzllVar2;
        zzll zzllVar3;
        zzll zzllVar4;
        zzll zzllVar5;
        zzpp.zzc();
        zzllVar = this.zze.zza;
        if (zzllVar.zzg().zzs(null, zzen.zzat)) {
            String str = this.zza;
            if (str == null) {
                zzllVar5 = this.zze.zza;
                zzllVar5.zzQ(this.zzb, null);
                return;
            } else {
                zziw zziwVar = new zziw(this.zzc, str, this.zzd);
                zzllVar4 = this.zze.zza;
                zzllVar4.zzQ(this.zzb, zziwVar);
                return;
            }
        }
        String str2 = this.zza;
        if (str2 == null) {
            zzllVar3 = this.zze.zza;
            zzllVar3.zzq().zzs().zzy(this.zzb, null);
        } else {
            zziw zziwVar2 = new zziw(this.zzc, str2, this.zzd);
            zzllVar2 = this.zze.zza;
            zzllVar2.zzq().zzs().zzy(this.zzb, zziwVar2);
        }
    }
}
