package com.google.android.gms.internal.wallet;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.Wallet;

/* loaded from: classes9.dex */
final class zzah extends Wallet.zzb {
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ CreateWalletObjectsRequest zzep;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzah(zzaf zzafVar, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i11) {
        super(googleApiClient);
        this.zzep = createWalletObjectsRequest;
        this.val$requestCode = i11;
    }

    @Override // com.google.android.gms.wallet.Wallet.zza, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaa zzaaVar) throws RemoteException {
        doExecute(zzaaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.Wallet.zza
    /* renamed from: zza */
    public final void doExecute(zzaa zzaaVar) {
        zzaaVar.zza(this.zzep, this.val$requestCode);
        setResult((zzah) Status.RESULT_SUCCESS);
    }
}
