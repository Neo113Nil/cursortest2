package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbfz extends zzbdt implements zzbga {
    public zzbfz() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbga zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzbga ? (zzbga) queryLocalInterface : new zzbfy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbfx zzbfvVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbfvVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbfvVar = queryLocalInterface instanceof zzbfx ? (zzbfx) queryLocalInterface : new zzbfv(readStrongBinder);
            }
            zzbdu.zzh(parcel);
            zzb(zzbfvVar);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            zzbdu.zzh(parcel);
            zzc(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbdu.zzh(parcel);
            zzd(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
