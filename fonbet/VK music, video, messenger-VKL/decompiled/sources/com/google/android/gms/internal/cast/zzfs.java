package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import xsna.i7o0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzfs extends zzgj {
    final /* synthetic */ TaskCompletionSource zza;

    public zzfs(zzfu zzfuVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzfuVar);
    }

    @Override // com.google.android.gms.internal.cast.zzgj, com.google.android.gms.internal.cast.zzgf
    public final void zzb(Status status, zzgc zzgcVar) {
        i7o0.i(status, new zzfv(new zzgi(Status.f, zzgcVar)), this.zza);
    }
}
