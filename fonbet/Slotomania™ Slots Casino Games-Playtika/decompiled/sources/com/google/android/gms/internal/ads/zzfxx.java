package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfxx extends zzbds implements IInterface {
    zzfxx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfxv zze(zzfxt zzfxtVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzfxtVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzfxv zzfxvVar = (zzfxv) zzbdu.zzb(zzcZ, zzfxv.CREATOR);
        zzcZ.recycle();
        return zzfxvVar;
    }

    public final void zzf(zzfxq zzfxqVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzfxqVar);
        zzda(2, zza);
    }

    public final zzfye zzg(zzfyc zzfycVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzfycVar);
        Parcel zzcZ = zzcZ(3, zza);
        zzfye zzfyeVar = (zzfye) zzbdu.zzb(zzcZ, zzfye.CREATOR);
        zzcZ.recycle();
        return zzfyeVar;
    }
}
