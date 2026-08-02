package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbgr extends zzbds implements IInterface {
    zzbgr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbgm zze(zzbgp zzbgpVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzbgpVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzbgm zzbgmVar = (zzbgm) zzbdu.zzb(zzcZ, zzbgm.CREATOR);
        zzcZ.recycle();
        return zzbgmVar;
    }

    public final zzbgm zzf(zzbgp zzbgpVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzbgpVar);
        Parcel zzcZ = zzcZ(2, zza);
        zzbgm zzbgmVar = (zzbgm) zzbdu.zzb(zzcZ, zzbgm.CREATOR);
        zzcZ.recycle();
        return zzbgmVar;
    }

    public final long zzg(zzbgp zzbgpVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzbgpVar);
        Parcel zzcZ = zzcZ(3, zza);
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }
}
