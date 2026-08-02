package com.google.android.gms.internal.gtm;

import android.os.Handler;

/* loaded from: classes9.dex */
final class zzfl implements zzcz {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfn zzb;

    zzfl(zzfn zzfnVar, Runnable runnable) {
        this.zzb = zzfnVar;
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.gtm.zzcz
    public final void zza(Throwable th2) {
        Handler handler;
        handler = this.zzb.zzb;
        handler.post(this.zza);
    }
}
