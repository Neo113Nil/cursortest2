package com.google.android.gms.internal.gtm;

import C.o0;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zziq extends com.google.android.gms.tagmanager.zzcl {
    final /* synthetic */ zzje zza;

    zziq(zzje zzjeVar) {
        this.zza = zzjeVar;
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final void zze(String str, String str2, Bundle bundle, long j11) throws RemoteException {
        ExecutorService executorService;
        String c11 = o0.c(new StringBuilder(String.valueOf(str).length() + 4), str, "+gtm");
        executorService = this.zza.zzh;
        executorService.execute(new zzip(this, str2, bundle, c11, j11, str));
    }
}
