package com.google.android.gms.internal.tapandpay;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class zzv extends zzae {
    final /* synthetic */ TaskCompletionSource zza;

    zzv(zzad zzadVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzae, com.google.android.gms.internal.tapandpay.zzf
    public final void zzu(Status status, Bundle bundle) {
        TaskUtil.trySetResultOrApiException(status.hasResolution() ? Status.RESULT_SUCCESS : status, status.getResolution(), this.zza);
    }
}
