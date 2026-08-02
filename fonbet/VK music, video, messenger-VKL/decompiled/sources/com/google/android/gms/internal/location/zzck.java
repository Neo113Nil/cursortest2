package com.google.android.gms.internal.location;

import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzck implements zzcs {
    final /* synthetic */ ehz zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzck(zzda zzdaVar, ehz ehzVar, TaskCompletionSource taskCompletionSource) {
        this.zza = ehzVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final ehz zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        this.zzb.trySetResult(null);
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzc(ehz ehzVar) {
        throw new IllegalStateException();
    }
}
