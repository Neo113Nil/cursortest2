package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.tapandpay.zzae;
import com.google.android.gms.tapandpay.TapAndPay;

/* loaded from: classes9.dex */
public final class zzd extends zzae {
    private static final ListenerHolder.Notifier<TapAndPay.DataChangedListener> zza = new zzc();
    private final ListenerHolder<TapAndPay.DataChangedListener> zzb;

    public zzd(BaseImplementation.ResultHolder<Status> resultHolder, ListenerHolder<TapAndPay.DataChangedListener> listenerHolder) {
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzae, com.google.android.gms.internal.tapandpay.zzf
    public final void zzb() {
        this.zzb.notifyListener(zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzae, com.google.android.gms.internal.tapandpay.zzf
    public final void zzc(Status status) {
    }
}
