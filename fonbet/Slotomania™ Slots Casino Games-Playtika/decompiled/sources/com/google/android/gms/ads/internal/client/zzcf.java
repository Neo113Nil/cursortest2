package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcbw;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzcf extends zzbds implements zzch {
    zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(List list, zzcb zzcbVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbdu.zze(zza, zzcbVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcbw zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzcbw zzt = zzcbv.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbfx zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(5, zza);
        zzbfx zzb = zzbfw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(6, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzk(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(7, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(zzbuq zzbuqVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbuqVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbdu.zzc(zza, zzfpVar);
        zzbdu.zze(zza, zzceVar);
        Parcel zzcZ = zzcZ(9, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzcZ = zzcZ(10, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzo(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(11, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbfx zzp(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(12, zza);
        zzbfx zzb = zzbfw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcbw zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(13, zza);
        zzcbw zzt = zzcbv.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzcZ = zzcZ(14, zza);
        zzfp zzfpVar = (zzfp) zzbdu.zzb(zzcZ, zzfp.CREATOR);
        zzcZ.recycle();
        return zzfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        Parcel zzcZ = zzcZ(15, zza);
        Bundle bundle = (Bundle) zzbdu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzcZ = zzcZ(16, zza);
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(18, zza);
    }
}
