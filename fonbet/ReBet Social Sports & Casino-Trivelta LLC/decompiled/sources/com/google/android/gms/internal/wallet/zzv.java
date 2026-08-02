package com.google.android.gms.internal.wallet;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AbstractC3414b;
import com.google.android.gms.wallet.C3413a;

/* loaded from: classes2.dex */
final class zzv extends zzt {
    private final TaskCompletionSource zza;

    public zzv(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzh(int i10, Bundle bundle) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        AbstractC3414b.b((pendingIntent == null || i10 != 6) ? new Status(i10) : new Status(6, "Need to resolve PendingIntent", pendingIntent), new C3413a(), this.zza);
    }
}
