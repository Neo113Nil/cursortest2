package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.PaymentData;
import xsna.ey2;
import xsna.fj5;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes12.dex */
final class zzy extends zzx {
    private final TaskCompletionSource<PaymentData> zzes;

    public zzy(TaskCompletionSource<PaymentData> taskCompletionSource) {
        this.zzes = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(Status status, PaymentData paymentData, Bundle bundle) {
        TaskCompletionSource<PaymentData> taskCompletionSource = this.zzes;
        int i = fj5.c;
        if (status.i()) {
            taskCompletionSource.setResult(paymentData);
        } else {
            taskCompletionSource.setException(ey2.g(status));
        }
    }
}
