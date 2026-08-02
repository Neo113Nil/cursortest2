package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public abstract class zzhi extends zzat implements zzhj {
    public zzhi() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    public static zzhj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
        return queryLocalInterface instanceof zzhj ? (zzhj) queryLocalInterface : new zzhh(iBinder);
    }

    @Override // com.google.android.gms.internal.gtm.zzat
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        zzhg zzheVar;
        if (i11 == 1) {
            zzg(parcel.readString(), parcel.readString(), parcel.readString());
        } else if (i11 == 2) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzheVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                zzheVar = queryLocalInterface instanceof zzhg ? (zzhg) queryLocalInterface : new zzhe(readStrongBinder);
            }
            zzh(readString, readString2, readString3, zzheVar);
        } else if (i11 == 3) {
            zzi();
        } else if (i11 == 101) {
            zzf(parcel.readString(), (Bundle) zzau.zza(parcel, Bundle.CREATOR), parcel.readString(), parcel.readLong(), zzau.zzf(parcel));
        } else {
            if (i11 != 102) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
