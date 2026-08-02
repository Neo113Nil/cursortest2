package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
final class zzjc extends zzhf {
    final /* synthetic */ zzje zza;

    @Override // com.google.android.gms.internal.gtm.zzhg
    public final void zze(boolean z11, String str) throws RemoteException {
        ExecutorService executorService;
        executorService = this.zza.zzh;
        executorService.execute(new zzja(this, z11, str));
    }
}
