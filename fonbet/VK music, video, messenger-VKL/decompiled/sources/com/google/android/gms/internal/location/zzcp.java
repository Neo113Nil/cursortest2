package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;
import xsna.yo01;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcp extends zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ yo01 zzb;

    public zzcp(TaskCompletionSource taskCompletionSource, yo01 yo01Var) {
        this.zza = taskCompletionSource;
        this.zzb = yo01Var;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        i7o0.i(zzgVar.getStatus(), null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() throws RemoteException {
        this.zzb.zzf();
    }
}
