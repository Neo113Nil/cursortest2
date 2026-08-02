package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public abstract class zzbyh extends zzbdt implements zzbyi {
    public zzbyh() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbyi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbyi ? (zzbyi) queryLocalInterface : new zzbyg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Intent intent = (Intent) zzbdu.zzb(parcel, Intent.CREATOR);
                zzbdu.zzh(parcel);
                zze(intent);
                break;
            case 2:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbdu.zzh(parcel);
                zzf(asInterface, readString, readString2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzh(asInterface2);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzi(createStringArray, createIntArray, asInterface3);
                break;
            case 6:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzbdu.zzh(parcel);
                zzj(asInterface4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
