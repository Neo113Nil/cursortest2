package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzci extends zzl {
    final /* synthetic */ TaskCompletionSource zza;

    public zzci(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzb(int i, String[] strArr) {
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        i7o0.i(new Status(i), null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzc(int i, PendingIntent pendingIntent) {
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        i7o0.i(new Status(i), null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzd(int i, String[] strArr) {
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        i7o0.i(new Status(i), null, this.zza);
    }
}
