package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AbstractC3414b;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes2.dex */
final class zzx extends zzt {
    private final TaskCompletionSource zza;

    public zzx(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzf(Status status, PaymentData paymentData, Bundle bundle) {
        AbstractC3414b.b(status, paymentData, this.zza);
    }
}
