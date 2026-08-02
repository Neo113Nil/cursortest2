package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public abstract class zzcbv extends zzbdt implements zzcbw {
    public zzcbv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcbw zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzcbw ? (zzcbw) queryLocalInterface : new zzcbu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzccd zzccdVar = null;
        zzccd zzccdVar2 = null;
        zzcce zzcceVar = null;
        zzcbz zzcbzVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccdVar = queryLocalInterface instanceof zzccd ? (zzccd) queryLocalInterface : new zzccb(readStrongBinder);
                }
                zzbdu.zzh(parcel);
                zzc(zzmVar, zzccdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcbzVar = queryLocalInterface2 instanceof zzcbz ? (zzcbz) queryLocalInterface2 : new zzcbx(readStrongBinder2);
                }
                zzbdu.zzh(parcel);
                zze(zzcbzVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzi = zzi();
                parcel2.writeNoException();
                int i3 = zzbdu.zza;
                parcel2.writeInt(zzi ? 1 : 0);
                return true;
            case 4:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzb(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcceVar = queryLocalInterface3 instanceof zzcce ? (zzcce) queryLocalInterface3 : new zzcce(readStrongBinder3);
                }
                zzbdu.zzh(parcel);
                zzs(zzcceVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcck zzcckVar = (zzcck) zzbdu.zzb(parcel, zzcck.CREATOR);
                zzbdu.zzh(parcel);
                zzh(zzcckVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zza = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzk(asInterface2, zza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzcbt zzl = zzl();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdx zzm = zzm();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zzb2 = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzo(zzb2);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccdVar2 = queryLocalInterface4 instanceof zzccd ? (zzccd) queryLocalInterface4 : new zzccb(readStrongBinder4);
                }
                zzbdu.zzh(parcel);
                zzd(zzmVar2, zzccdVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zza2 = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzp(zza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 17:
                long zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(zzq);
                return true;
            case 18:
                long readLong = parcel.readLong();
                zzbdu.zzh(parcel);
                zzr(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
