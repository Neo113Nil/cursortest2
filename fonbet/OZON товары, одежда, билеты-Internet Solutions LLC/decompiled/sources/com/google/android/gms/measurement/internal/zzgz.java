package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
final class zzgz implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzhc zzb;

    zzgz(zzhc zzhcVar, String str) {
        this.zzb = zzhcVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzll zzllVar;
        zzll zzllVar2;
        zzllVar = this.zzb.zza;
        zzllVar.zzA();
        zzllVar2 = this.zzb.zza;
        return zzllVar2.zzi().zzu(this.zza);
    }
}
