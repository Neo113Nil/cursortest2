package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes.dex */
final class zzv extends zzn {
    final /* synthetic */ TaskCompletionSource zza;

    public zzv(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzo
    public final void zza(Status status, int i) {
        i7o0.i(status, Integer.valueOf(i), this.zza);
    }
}
