package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;

/* loaded from: classes9.dex */
public final class zzd extends zza implements IInterface {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    public final void zzc(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzfVar);
        zzb(29, zza);
    }

    public final void zzd(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzfVar);
        zzb(21, zza);
    }

    public final void zze(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzfVar);
        zzb(31, zza);
    }

    public final void zzf(String str, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzfVar);
        zzb(61, zza);
    }

    public final void zzg(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzfVar);
        zzb(30, zza);
    }

    public final void zzh(int i11, String str, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i11);
        zza.writeString(str);
        zzc.zzc(zza, zzfVar);
        zzb(22, zza);
    }

    public final void zzi(IsTokenizedRequest isTokenizedRequest, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, isTokenizedRequest);
        zzc.zzc(zza, zzfVar);
        zzb(75, zza);
    }

    public final void zzj(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzfVar);
        zzb(74, zza);
    }

    public final void zzk(PushTokenizeRequest pushTokenizeRequest, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, pushTokenizeRequest);
        zzc.zzc(zza, zzfVar);
        zzb(28, zza);
    }

    public final void zzl(zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzfVar);
        zzb(10, zza);
    }

    public final void zzm(int i11, String str, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i11);
        zza.writeString(str);
        zzc.zzc(zza, zzfVar);
        zzb(25, zza);
    }

    public final void zzn(int i11, String str, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i11);
        zza.writeString(str);
        zzc.zzc(zza, zzfVar);
        zzb(24, zza);
    }

    public final void zzo(int i11, String str, String str2, int i12, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i11);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeInt(i12);
        zzc.zzc(zza, zzfVar);
        zzb(23, zza);
    }

    public final void zzp(ViewTokenRequest viewTokenRequest, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzb(zza, viewTokenRequest);
        zzc.zzc(zza, zzfVar);
        zzb(79, zza);
    }
}
