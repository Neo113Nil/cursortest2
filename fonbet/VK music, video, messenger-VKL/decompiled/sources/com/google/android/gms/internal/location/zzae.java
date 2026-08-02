package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;
import xsna.mov;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzae extends mov.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzae(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // xsna.mov
    public final void onResult(Status status) {
        i7o0.i(status, null, this.zza);
    }
}
