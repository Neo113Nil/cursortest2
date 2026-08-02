package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import xsna.i7o0;
import xsna.mov;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzaq extends mov.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzaq(zzav zzavVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzavVar);
    }

    @Override // xsna.mov
    public final void onResult(Status status) {
        i7o0.i(status, null, this.zza);
    }
}
