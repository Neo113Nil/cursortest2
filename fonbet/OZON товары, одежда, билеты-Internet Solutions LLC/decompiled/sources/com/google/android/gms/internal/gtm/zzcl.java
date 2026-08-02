package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
final class zzcl implements Callable<String> {
    final /* synthetic */ zzcn zza;

    zzcl(zzcn zzcnVar) {
        this.zza = zzcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        return this.zza.zzc();
    }
}
