package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.Wallet;

/* loaded from: classes.dex */
public class PaymentsClient extends GoogleApi<Wallet.WalletOptions> {
    PaymentsClient(@NonNull Activity activity, @NonNull Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<Boolean> isReadyToPay(@NonNull IsReadyToPayRequest isReadyToPayRequest) {
        return doRead(new zzab(this, isReadyToPayRequest));
    }

    public Task<PaymentData> loadPaymentData(@NonNull final PaymentDataRequest paymentDataRequest) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(paymentDataRequest) { // from class: com.google.android.gms.wallet.zzac
            private final PaymentDataRequest zzdx;

            {
                this.zzdx = paymentDataRequest;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzaa) obj).zza(this.zzdx, (TaskCompletionSource<PaymentData>) obj2);
            }
        }).setFeatures(zzg.zzba).setAutoResolveMissingFeatures(true).build());
    }

    PaymentsClient(@NonNull Context context, @NonNull Wallet.WalletOptions walletOptions) {
        super(context, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
