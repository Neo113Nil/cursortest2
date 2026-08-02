package com.google.android.gms.internal.wallet;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ej5;
import xsna.ey2;
import xsna.fj5;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes12.dex */
final class zzz extends zzx {
    private final TaskCompletionSource<ej5> zzes;

    public zzz(TaskCompletionSource<ej5> taskCompletionSource) {
        this.zzes = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzq
    public final void zza(int i, Bundle bundle) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        Status status = (pendingIntent == null || i != 6) ? new Status(i) : new Status(i, "Need to resolve PendingIntent", pendingIntent);
        ej5 ej5Var = new ej5();
        TaskCompletionSource<ej5> taskCompletionSource = this.zzes;
        int i2 = fj5.c;
        if (status.i()) {
            taskCompletionSource.setResult(ej5Var);
        } else {
            taskCompletionSource.setException(ey2.g(status));
        }
    }
}
