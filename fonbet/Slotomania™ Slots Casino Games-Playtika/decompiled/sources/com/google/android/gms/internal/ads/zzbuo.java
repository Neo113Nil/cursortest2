package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbuo extends zzbds implements zzbuq {
    zzbuo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbuq
    public final zzbut zzb(String str) throws RemoteException {
        zzbut zzburVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzburVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzburVar = queryLocalInterface instanceof zzbut ? (zzbut) queryLocalInterface : new zzbur(readStrongBinder);
        }
        zzcZ.recycle();
        return zzburVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuq
    public final boolean zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbuq
    public final boolean zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbuq
    public final zzbwp zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzbwp zzb = zzbwo.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }
}
