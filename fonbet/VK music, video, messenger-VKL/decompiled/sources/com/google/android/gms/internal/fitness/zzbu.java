package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataSourcesResult;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzbu extends zza implements zzbw {
    public zzbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDataSourcesCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzbw
    public final void zzb(DataSourcesResult dataSourcesResult) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, dataSourcesResult);
        zzl(1, zza);
    }
}
