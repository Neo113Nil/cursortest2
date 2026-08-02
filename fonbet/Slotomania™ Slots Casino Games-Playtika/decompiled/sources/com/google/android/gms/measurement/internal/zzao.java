package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes8.dex */
final class zzao implements Runnable {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzap zzb;

    zzao(zzap zzapVar, zzgz zzgzVar) {
        this.zzb = zzapVar;
        this.zza = zzgzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzay();
        if (zzab.zza()) {
            this.zza.zzaB().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
