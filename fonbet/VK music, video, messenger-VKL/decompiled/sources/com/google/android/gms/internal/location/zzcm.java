package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
final class zzcm extends zzp {
    final /* synthetic */ TaskCompletionSource zza;

    public zzcm(zzda zzdaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzq
    public final void zzb(Status status, Location location) {
        i7o0.i(status, location, this.zza);
    }
}
