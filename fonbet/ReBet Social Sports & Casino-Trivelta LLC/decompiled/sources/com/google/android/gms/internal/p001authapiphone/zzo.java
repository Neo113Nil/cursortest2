package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.common.api.internal.InterfaceC3132h;
import com.google.android.gms.common.internal.AbstractC3178b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzo extends InterfaceC3132h.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3132h
    public final void onResult(Status status) {
        if (status.i() == 6) {
            this.zza.trySetException(AbstractC3178b.a(status));
        } else {
            AbstractC3165y.a(status, this.zza);
        }
    }
}
