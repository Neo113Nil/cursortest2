package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class zzac extends zzae {
    final /* synthetic */ TaskCompletionSource zza;

    zzac(zzad zzadVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzae, com.google.android.gms.internal.tapandpay.zzf
    public final void zzx(Status status, boolean z11) {
        TaskUtil.trySetResultOrApiException(status, Boolean.valueOf(z11), this.zza);
    }
}
