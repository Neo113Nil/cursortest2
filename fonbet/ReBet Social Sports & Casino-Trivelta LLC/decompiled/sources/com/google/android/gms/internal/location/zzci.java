package com.google.android.gms.internal.location;

import V9.AbstractC1751g;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzci extends zzl {
    final /* synthetic */ TaskCompletionSource zza;

    public zzci(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzb(int i10, String[] strArr) {
        AbstractC3165y.a(new Status(AbstractC1751g.a(i10)), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzc(int i10, PendingIntent pendingIntent) {
        AbstractC3165y.a(new Status(AbstractC1751g.a(i10)), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzd(int i10, String[] strArr) {
        AbstractC3165y.a(new Status(AbstractC1751g.a(i10)), this.zza);
    }
}
