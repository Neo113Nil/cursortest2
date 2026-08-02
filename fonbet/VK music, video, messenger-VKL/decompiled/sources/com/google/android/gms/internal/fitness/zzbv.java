package com.google.android.gms.internal.fitness;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataSourcesResult;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public abstract class zzbv extends zzb implements zzbw {
    public zzbv() {
        super("com.google.android.gms.fitness.internal.IDataSourcesCallback");
    }

    public static zzbw zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
        return queryLocalInterface instanceof zzbw ? (zzbw) queryLocalInterface : new zzbu(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        DataSourcesResult dataSourcesResult = (DataSourcesResult) zzc.zza(parcel, DataSourcesResult.CREATOR);
        zzc.zzb(parcel);
        zzb(dataSourcesResult);
        return true;
    }
}
