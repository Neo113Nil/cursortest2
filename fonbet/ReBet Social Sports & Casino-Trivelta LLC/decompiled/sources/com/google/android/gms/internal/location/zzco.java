package com.google.android.gms.internal.location;

import V9.M;
import com.google.android.gms.common.api.internal.AbstractC3165y;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzco extends zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ M zzb;

    public zzco(TaskCompletionSource taskCompletionSource, M m10) {
        this.zza = taskCompletionSource;
        this.zzb = m10;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        AbstractC3165y.a(zzgVar.getStatus(), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
        this.zzb.zze();
    }
}
