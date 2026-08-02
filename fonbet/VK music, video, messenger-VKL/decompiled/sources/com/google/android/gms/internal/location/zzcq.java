package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;
import xsna.xyz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcq extends zzr {
    final /* synthetic */ TaskCompletionSource zza;

    public zzcq(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzs
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        i7o0.i(locationSettingsResult.b, new xyz(locationSettingsResult), this.zza);
    }
}
