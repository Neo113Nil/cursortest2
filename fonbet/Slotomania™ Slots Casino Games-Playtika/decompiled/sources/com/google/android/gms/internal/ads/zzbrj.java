package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public abstract class zzbrj extends zzbdt implements zzbrk {
    public zzbrj() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbrk zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbrk ? (zzbrk) queryLocalInterface : new zzbri(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbrd.CREATOR);
        zzbdu.zzh(parcel);
        zzb(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
