package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzck implements zzcs {
    final /* synthetic */ C3140l zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzck(zzda zzdaVar, C3140l c3140l, TaskCompletionSource taskCompletionSource) {
        this.zza = c3140l;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final C3140l zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        this.zzb.trySetResult(null);
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzc(C3140l c3140l) {
        throw new IllegalStateException();
    }
}
