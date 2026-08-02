package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
final class zzgr implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhc zzd;

    zzgr(zzhc zzhcVar, String str, String str2, String str3) {
        this.zzd = zzhcVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzll zzllVar;
        zzll zzllVar2;
        zzllVar = this.zzd.zza;
        zzllVar.zzA();
        zzllVar2 = this.zzd.zza;
        return zzllVar2.zzi().zzs(this.zza, this.zzb, this.zzc);
    }
}
