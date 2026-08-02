package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;
import xsna.sq01;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzco extends zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ sq01 zzb;

    public zzco(TaskCompletionSource taskCompletionSource, sq01 sq01Var) {
        this.zza = taskCompletionSource;
        this.zzb = sq01Var;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        i7o0.i(zzgVar.getStatus(), null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() throws RemoteException {
        this.zzb.zze();
    }
}
