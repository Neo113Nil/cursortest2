package com.google.android.gms.internal.gtm;

import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zziv implements Runnable {
    final /* synthetic */ zzje zza;

    zziv(zzje zzjeVar) {
        this.zza = zzjeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorService executorService;
        executorService = this.zza.zzh;
        executorService.execute(new zziu(this));
    }
}
