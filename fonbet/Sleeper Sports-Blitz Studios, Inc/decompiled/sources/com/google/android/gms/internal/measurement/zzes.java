package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdn;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.1 */
/* loaded from: classes7.dex */
final class zzes extends zzdn.zzb {
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzdn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzes(zzdn zzdnVar, boolean z) {
        super(zzdnVar);
        this.zzc = z;
        this.zzd = zzdnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdn.zzb
    final void zza() throws RemoteException {
        zzdc zzdcVar;
        zzdcVar = this.zzd.zzj;
        ((zzdc) Preconditions.checkNotNull(zzdcVar)).setDataCollectionEnabled(this.zzc);
    }
}
