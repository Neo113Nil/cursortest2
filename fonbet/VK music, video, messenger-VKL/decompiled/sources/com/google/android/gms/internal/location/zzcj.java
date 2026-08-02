package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.fhz;
import xsna.kxz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzcj extends kxz {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzda zzb;

    public zzcj(zzda zzdaVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzdaVar;
        this.zza = taskCompletionSource;
    }

    @Override // xsna.kxz
    public final void onLocationResult(LocationResult locationResult) {
        this.zza.trySetResult(locationResult.i());
        try {
            this.zzb.zzB(fhz.c(this, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
