package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzu extends zzt {
    private final TaskCompletionSource zza;

    public zzu(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzc(Status status, boolean z10, Bundle bundle) {
        AbstractC3165y.b(status, Boolean.valueOf(z10), this.zza);
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzg(int i10, boolean z10, Bundle bundle) {
        AbstractC3165y.b(new Status(i10), Boolean.valueOf(z10), this.zza);
    }
}
