package com.google.android.gms.internal.wallet;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolvableVoidResult;
import com.google.android.gms.wallet.AutoResolveHelper;

/* loaded from: classes9.dex */
final class zzae extends zzac {
    private final TaskCompletionSource<AutoResolvableVoidResult> zzfo;

    public zzae(TaskCompletionSource<AutoResolvableVoidResult> taskCompletionSource) {
        this.zzfo = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzac, com.google.android.gms.internal.wallet.zzv
    public final void zza(int i11, Bundle bundle) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        AutoResolveHelper.zza((pendingIntent == null || i11 != 6) ? new Status(i11) : new Status(i11, "Need to resolve PendingIntent", pendingIntent), new AutoResolvableVoidResult(), this.zzfo);
    }
}
