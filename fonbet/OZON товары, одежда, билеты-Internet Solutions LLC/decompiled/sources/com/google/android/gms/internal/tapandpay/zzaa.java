package com.google.android.gms.internal.tapandpay;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class zzaa extends zzae {
    final /* synthetic */ TaskCompletionSource zza;

    zzaa(zzad zzadVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzae, com.google.android.gms.internal.tapandpay.zzf
    public final void zzz(Status status, String str) throws RemoteException {
        TaskUtil.trySetResultOrApiException(status, str, this.zza);
    }
}
