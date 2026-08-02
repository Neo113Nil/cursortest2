package com.google.android.gms.internal.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolvableVoidResult;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;

/* loaded from: classes.dex */
public final class zzaa extends GmsClient<zzt> {
    private final int environment;
    private final int theme;
    private final String zzci;
    private final boolean zzem;
    private final Context zzfn;

    public zzaa(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i11, int i12, boolean z11) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzfn = context;
        this.environment = i11;
        this.zzci = clientSettings.getAccountName();
        this.theme = i12;
        this.zzem = z11;
    }

    private final Bundle zzf() {
        int i11 = this.environment;
        String packageName = this.zzfn.getPackageName();
        String str = this.zzci;
        int i12 = this.theme;
        boolean z11 = this.zzem;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i11);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z11);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i12);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof zzt ? (zzt) queryLocalInterface : new zzw(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.wallet.zzg.zzbb;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, int i11) {
        zzz zzzVar = new zzz((Activity) this.zzfn, i11);
        try {
            ((zzt) getService()).zza(createWalletObjectsRequest, zzf(), zzzVar);
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e11);
            zzzVar.zza(8, Bundle.EMPTY);
        }
    }

    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, TaskCompletionSource<AutoResolvableVoidResult> taskCompletionSource) {
        Bundle zzf = zzf();
        zzf.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzae zzaeVar = new zzae(taskCompletionSource);
        try {
            ((zzt) getService()).zza(createWalletObjectsRequest, zzf, zzaeVar);
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException creating wallet objects", e11);
            zzaeVar.zza(8, Bundle.EMPTY);
        }
    }

    public final void zza(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        zzab zzabVar = new zzab(taskCompletionSource);
        try {
            ((zzt) getService()).zza(isReadyToPayRequest, zzf(), zzabVar);
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e11);
            zzabVar.zza(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    public final void zza(PaymentDataRequest paymentDataRequest, TaskCompletionSource<PaymentData> taskCompletionSource) {
        Bundle zzf = zzf();
        zzf.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzad zzadVar = new zzad(taskCompletionSource);
        try {
            ((zzt) getService()).zza(paymentDataRequest, zzf, zzadVar);
        } catch (RemoteException e11) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e11);
            zzadVar.zza(Status.RESULT_INTERNAL_ERROR, (PaymentData) null, Bundle.EMPTY);
        }
    }
}
