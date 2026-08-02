package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tapandpay.TapAndPay;

/* loaded from: classes9.dex */
final class zzc implements ListenerHolder.Notifier<TapAndPay.DataChangedListener> {
    zzc() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(TapAndPay.DataChangedListener dataChangedListener) {
        dataChangedListener.onDataChanged();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
