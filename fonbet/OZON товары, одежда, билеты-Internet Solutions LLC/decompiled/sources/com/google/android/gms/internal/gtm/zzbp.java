package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
final class zzbp implements Callable<Void> {
    final /* synthetic */ zzbq zza;

    zzbp(zzbq zzbqVar) {
        this.zza = zzbqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() throws Exception {
        zzck zzckVar;
        zzckVar = this.zza.zza;
        zzckVar.zzac();
        return null;
    }
}
