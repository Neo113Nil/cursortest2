package com.google.android.gms.internal.location;

import V9.J;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcp extends zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ J zzb;

    public zzcp(TaskCompletionSource taskCompletionSource, J j10) {
        this.zza = taskCompletionSource;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        AbstractC3165y.a(zzgVar.getStatus(), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
        this.zzb.zzf();
    }
}
