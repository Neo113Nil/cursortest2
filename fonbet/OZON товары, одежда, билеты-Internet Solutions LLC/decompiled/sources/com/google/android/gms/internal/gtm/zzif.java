package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzif implements Runnable {
    final /* synthetic */ zzik zza;

    zzif(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhd zzhdVar;
        this.zza.zzg = false;
        zzhdVar = this.zza.zzd;
        zzhdVar.zza();
    }
}
