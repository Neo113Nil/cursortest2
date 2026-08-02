package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzfb extends zzcv {
    private final ue6 zza;

    public zzfb(ue6 ue6Var) {
        this.zza = ue6Var;
    }

    public static zzfb zzd(TaskCompletionSource taskCompletionSource) {
        return new zzfb(new zzez(taskCompletionSource));
    }

    public static zzfb zze(TaskCompletionSource taskCompletionSource) {
        return new zzfb(new zzfa(taskCompletionSource));
    }

    @Override // com.google.android.gms.internal.fitness.zzcw
    public final void zzb(Status status) {
        this.zza.setResult(status);
    }
}
