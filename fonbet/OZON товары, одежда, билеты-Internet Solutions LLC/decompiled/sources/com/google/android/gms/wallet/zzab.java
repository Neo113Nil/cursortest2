package com.google.android.gms.wallet;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzab extends TaskApiCall<com.google.android.gms.internal.wallet.zzaa, Boolean> {
    private final /* synthetic */ IsReadyToPayRequest zzdw;

    zzab(PaymentsClient paymentsClient, IsReadyToPayRequest isReadyToPayRequest) {
        this.zzdw = isReadyToPayRequest;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.wallet.zzaa zzaaVar, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        zzaaVar.zza(this.zzdw, taskCompletionSource);
    }
}
