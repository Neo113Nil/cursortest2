package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.common.api.internal.InterfaceC3132h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzae extends InterfaceC3132h.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzae(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3132h
    public final void onResult(Status status) {
        AbstractC3165y.a(status, this.zza);
    }
}
