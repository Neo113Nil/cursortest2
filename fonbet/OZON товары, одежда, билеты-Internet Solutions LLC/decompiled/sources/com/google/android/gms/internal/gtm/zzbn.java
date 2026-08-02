package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzbn implements Runnable {
    final /* synthetic */ zzbq zza;

    zzbn(zzbq zzbqVar) {
        this.zza = zzbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zza.zza;
        zzckVar.zzh();
    }
}
