package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public abstract class zzbrg extends zzbdt implements zzbrh {
    public zzbrg() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbrh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof zzbrh ? (zzbrh) queryLocalInterface : new zzbrf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zze();
        } else {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            zzbdu.zzh(parcel);
            zzf(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
