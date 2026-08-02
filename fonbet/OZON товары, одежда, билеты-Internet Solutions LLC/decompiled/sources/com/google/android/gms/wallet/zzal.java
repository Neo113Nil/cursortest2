package com.google.android.gms.wallet;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class zzal extends TaskApiCall<com.google.android.gms.internal.wallet.zzaa, AutoResolvableVoidResult> {
    private final /* synthetic */ CreateWalletObjectsRequest zzep;

    zzal(WalletObjectsClient walletObjectsClient, CreateWalletObjectsRequest createWalletObjectsRequest) {
        this.zzep = createWalletObjectsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.wallet.zzaa zzaaVar, TaskCompletionSource<AutoResolvableVoidResult> taskCompletionSource) throws RemoteException {
        zzaaVar.zza(this.zzep, taskCompletionSource);
    }
}
