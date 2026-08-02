package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzao implements Runnable {
    final /* synthetic */ zzhf zza;
    final /* synthetic */ zzap zzb;

    zzao(zzap zzapVar, zzhf zzhfVar) {
        this.zzb = zzapVar;
        this.zza = zzhfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzaw();
        if (zzab.zza()) {
            this.zza.zzaz().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
