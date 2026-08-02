package com.google.android.gms.internal.location;

import V9.AbstractC1755k;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C3142m;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcj extends AbstractC1755k {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzda zzb;

    public zzcj(zzda zzdaVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzdaVar;
        this.zza = taskCompletionSource;
    }

    @Override // V9.AbstractC1755k
    public final void onLocationResult(LocationResult locationResult) {
        this.zza.trySetResult(locationResult.h());
        try {
            this.zzb.zzB(C3142m.c(this, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
