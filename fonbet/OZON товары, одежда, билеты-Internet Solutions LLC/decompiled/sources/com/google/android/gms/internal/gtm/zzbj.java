package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzbj implements Runnable {
    final /* synthetic */ zzbq zza;

    zzbj(zzbq zzbqVar, boolean z11) {
        this.zza = zzbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zza.zza;
        zzckVar.zzae();
    }
}
