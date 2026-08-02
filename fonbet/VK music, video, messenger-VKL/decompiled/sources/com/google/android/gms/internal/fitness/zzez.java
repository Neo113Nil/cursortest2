package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzez implements ue6 {
    final /* synthetic */ TaskCompletionSource zza;

    public zzez(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // xsna.ue6
    public final void setFailedResult(Status status) {
        throw new UnsupportedOperationException("This method should never get invoked");
    }

    @Override // xsna.ue6
    public final void setResult(Object obj) {
        i7o0.i((Status) obj, null, this.zza);
    }
}
