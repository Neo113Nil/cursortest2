package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public abstract class zzck extends zzbdt implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcl zzd(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        zzbdu.zzh(parcel);
        zzb(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
