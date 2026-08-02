package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcac extends zzbds implements zzcae {
    zzcac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zze(zzcar zzcarVar, zzcai zzcaiVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzcarVar);
        zzbdu.zze(zza, zzcaiVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzf(zzcar zzcarVar, zzcai zzcaiVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzcarVar);
        zzbdu.zze(zza, zzcaiVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzg(zzcar zzcarVar, zzcai zzcaiVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzcarVar);
        zzbdu.zze(zza, zzcaiVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzh(String str, zzcai zzcaiVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbdu.zze(zza, zzcaiVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzj(zzcaa zzcaaVar, zzcaj zzcajVar) throws RemoteException {
        throw null;
    }
}
