package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzab extends zzac {
    private final TaskCompletionSource<Boolean> zzfo;

    zzab(TaskCompletionSource<Boolean> taskCompletionSource) {
        this.zzfo = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzac, com.google.android.gms.internal.wallet.zzv
    public final void zza(int i11, boolean z11, Bundle bundle) {
        TaskUtil.setResultOrApiException(new Status(i11), Boolean.valueOf(z11), this.zzfo);
    }

    @Override // com.google.android.gms.internal.wallet.zzac, com.google.android.gms.internal.wallet.zzv
    public final void zza(Status status, boolean z11, Bundle bundle) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z11), this.zzfo);
    }
}
