package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
final class zzz extends zzj {
    final /* synthetic */ TaskCompletionSource zza;

    public zzz(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzk
    public final void zza(Status status, boolean z) {
        i7o0.i(status, Boolean.valueOf(z), this.zza);
    }
}
