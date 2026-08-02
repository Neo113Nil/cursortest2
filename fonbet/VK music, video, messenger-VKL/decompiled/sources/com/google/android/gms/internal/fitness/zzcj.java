package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataSourcesRequest;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzcj extends zza implements IInterface {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    }

    public final void zzd(DataSourcesRequest dataSourcesRequest) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, dataSourcesRequest);
        zzk(1, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzal zzalVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzalVar);
        zzk(2, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzao zzaoVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzaoVar);
        zzk(3, zza);
    }
}
