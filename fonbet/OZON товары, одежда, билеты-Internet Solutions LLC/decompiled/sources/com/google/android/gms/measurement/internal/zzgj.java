package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgj implements Runnable {
    final /* synthetic */ zzhn zza;
    final /* synthetic */ zzgk zzb;

    zzgj(zzgk zzgkVar, zzhn zzhnVar) {
        this.zzb = zzgkVar;
        this.zza = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgk.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
