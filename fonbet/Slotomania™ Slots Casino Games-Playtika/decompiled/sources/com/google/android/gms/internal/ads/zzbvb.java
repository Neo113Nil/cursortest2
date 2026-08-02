package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbvb extends zzbds implements IInterface {
    zzbvb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final List zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzf = zzbdu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    public final String zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final zzbls zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        zzbls zzh = zzblr.zzh(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzh;
    }

    public final String zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final double zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    public final String zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzm() throws RemoteException {
        zzda(10, zza());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(11, zza);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(12, zza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(14, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(15, zza());
        Bundle bundle = (Bundle) zzbdu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(16, zza);
    }

    public final com.google.android.gms.ads.internal.client.zzea zzt() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final zzbll zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(19, zza());
        zzbll zzj = zzblk.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        Parcel zzcZ = zzcZ(20, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzx() throws RemoteException {
        Parcel zzcZ = zzcZ(21, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, iObjectWrapper2);
        zzbdu.zze(zza, iObjectWrapper3);
        zzda(22, zza);
    }
}
