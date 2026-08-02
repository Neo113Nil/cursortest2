package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class zzab extends zzae {
    final /* synthetic */ TaskCompletionSource zza;

    zzab(zzad zzadVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzae, com.google.android.gms.internal.tapandpay.zzf
    public final void zzA(Status status, TokenInfo[] tokenInfoArr) {
        TaskUtil.trySetResultOrApiException(status, zzaq.zzi(tokenInfoArr), this.zza);
    }
}
