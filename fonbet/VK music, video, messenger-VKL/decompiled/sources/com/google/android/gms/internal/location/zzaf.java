package com.google.android.gms.internal.location;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.exc0;
import xsna.i7o0;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzaf implements ue6 {
    private final TaskCompletionSource zza;

    public zzaf(TaskCompletionSource taskCompletionSource) {
        exc0.i(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // xsna.ue6
    public final void setFailedResult(@Nullable Status status) {
        if (status == null) {
            return;
        }
        this.zza.setException(new ApiException(status));
    }

    @Override // xsna.ue6
    public final /* synthetic */ void setResult(Object obj) {
        i7o0.i((Status) obj, null, this.zza);
    }
}
