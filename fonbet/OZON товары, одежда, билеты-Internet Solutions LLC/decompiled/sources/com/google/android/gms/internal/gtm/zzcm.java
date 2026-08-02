package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
final class zzcm implements Callable<String> {
    final /* synthetic */ zzcn zza;

    zzcm(zzcn zzcnVar) {
        this.zza = zzcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        String zzf;
        zzf = this.zza.zzf();
        return zzf;
    }
}
