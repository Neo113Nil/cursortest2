package com.google.android.gms.internal.location;

import V9.C1757m;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcq extends zzr {
    final /* synthetic */ TaskCompletionSource zza;

    public zzcq(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzs
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        AbstractC3165y.b(locationSettingsResult.getStatus(), new C1757m(locationSettingsResult), this.zza);
    }
}
