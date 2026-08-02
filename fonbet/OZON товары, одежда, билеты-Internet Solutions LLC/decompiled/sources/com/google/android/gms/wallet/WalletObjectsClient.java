package com.google.android.gms.wallet;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.Wallet;

/* loaded from: classes9.dex */
public class WalletObjectsClient extends GoogleApi<Wallet.WalletOptions> {
    WalletObjectsClient(@NonNull Activity activity, Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<AutoResolvableVoidResult> createWalletObjects(@NonNull CreateWalletObjectsRequest createWalletObjectsRequest) {
        return doWrite(new zzal(this, createWalletObjectsRequest));
    }
}
