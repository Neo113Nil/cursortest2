package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ey2;
import xsna.i7o0;
import xsna.mov;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes12.dex */
final class zzo extends mov.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // xsna.mov
    public final void onResult(Status status) {
        if (status.b == 6) {
            this.zza.trySetException(ey2.g(status));
        } else {
            i7o0.i(status, null, this.zza);
        }
    }
}
