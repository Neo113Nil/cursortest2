package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzgh extends zza implements IInterface {
    public zzgh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void zze(zzgf zzgfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzgfVar);
        zzc(2, zza);
    }

    public final void zzf(zzgg zzggVar, zzgf zzgfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzggVar);
        zzc.zze(zza, zzgfVar);
        zzc(5, zza);
    }
}
