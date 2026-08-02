package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbvd extends zzbds implements zzbvf {
    zzbvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final float zzA() throws RemoteException {
        Parcel zzcZ = zzcZ(24, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final float zzB() throws RemoteException {
        Parcel zzcZ = zzcZ(25, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzC() throws RemoteException {
        zzda(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final String zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final List zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzf = zzbdu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final String zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final zzbls zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        zzbls zzh = zzblr.zzh(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final String zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final String zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final double zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final String zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final String zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final zzbll zzo() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        zzbll zzj = zzblk.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final IObjectWrapper zzp() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final IObjectWrapper zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(14, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final IObjectWrapper zzr() throws RemoteException {
        Parcel zzcZ = zzcZ(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final Bundle zzs() throws RemoteException {
        Parcel zzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) zzbdu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zzt() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzv() throws RemoteException {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, iObjectWrapper2);
        zzbdu.zze(zza, iObjectWrapper3);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final float zzz() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }
}
