package com.google.android.gms.wallet.callback;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes9.dex */
public abstract class BasePaymentDataCallbacksService extends com.google.android.gms.wallet.callback.zza {

    private static class zza implements OnCompleteListener<PaymentAuthorizationResult> {
        private final OnCompleteListener<CallbackOutput> zzew;

        zza(OnCompleteListener<CallbackOutput> onCompleteListener) {
            this.zzew = onCompleteListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.wallet.callback.OnCompleteListener
        /* renamed from: zza, reason: merged with bridge method [inline-methods] */
        public final synchronized void complete(PaymentAuthorizationResult paymentAuthorizationResult) {
            this.zzew.complete(CallbackOutput.this);
        }
    }

    private static class zzb implements OnCompleteListener<PaymentDataRequestUpdate> {
        private final OnCompleteListener<CallbackOutput> zzew;

        zzb(OnCompleteListener<CallbackOutput> onCompleteListener) {
            this.zzew = onCompleteListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.wallet.callback.OnCompleteListener
        /* renamed from: zza, reason: merged with bridge method [inline-methods] */
        public final synchronized void complete(PaymentDataRequestUpdate paymentDataRequestUpdate) {
            this.zzew.complete(CallbackOutput.this);
        }
    }

    protected abstract BasePaymentDataCallbacks createPaymentDataCallbacks();

    @Override // com.google.android.gms.wallet.callback.zza, android.app.Service
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.google.android.gms.wallet.callback.zza, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.android.gms.wallet.callback.zza
    protected final void onRunTask(String str, CallbackInput callbackInput, OnCompleteListener<CallbackOutput> onCompleteListener) {
        if (callbackInput.getCallbackType() == 0) {
            throw new IllegalStateException("Callback Types must be set");
        }
        BasePaymentDataCallbacks createPaymentDataCallbacks = createPaymentDataCallbacks();
        if (callbackInput.getCallbackType() == 1) {
            createPaymentDataCallbacks.onPaymentAuthorized((PaymentData) callbackInput.deserializeRequest(PaymentData.CREATOR), new zza(onCompleteListener));
        } else {
            if (callbackInput.getCallbackType() != 2) {
                throw new IllegalStateException("Unknown Callback Types");
            }
            createPaymentDataCallbacks.onPaymentDataChanged((IntermediatePaymentData) callbackInput.deserializeRequest(IntermediatePaymentData.CREATOR), new zzb(onCompleteListener));
        }
    }
}
