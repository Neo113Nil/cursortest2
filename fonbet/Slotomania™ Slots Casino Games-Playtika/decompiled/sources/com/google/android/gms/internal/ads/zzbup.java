package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbup extends zzbdt implements zzbuq {
    public zzbup() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbuq zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbuq ? (zzbuq) queryLocalInterface : new zzbuo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzbdu.zzh(parcel);
            zzbut zzb = zzb(readString);
            parcel2.writeNoException();
            zzbdu.zze(parcel2, zzb);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzbdu.zzh(parcel);
            boolean zzc = zzc(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzc ? 1 : 0);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            zzbdu.zzh(parcel);
            zzbwp zze = zze(readString3);
            parcel2.writeNoException();
            zzbdu.zze(parcel2, zze);
        } else {
            if (i != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            zzbdu.zzh(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}
