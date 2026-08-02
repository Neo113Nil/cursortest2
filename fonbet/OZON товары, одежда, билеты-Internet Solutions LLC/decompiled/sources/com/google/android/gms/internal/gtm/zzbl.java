package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzbl implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbq zzb;

    zzbl(zzbq zzbqVar, int i11) {
        this.zzb = zzbqVar;
        this.zza = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zzb.zza;
        zzckVar.zzZ(this.zza * 1000);
    }
}
