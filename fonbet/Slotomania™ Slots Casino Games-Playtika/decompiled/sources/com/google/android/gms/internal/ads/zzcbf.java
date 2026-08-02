package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public abstract class zzcbf extends zzbdt implements zzcbg {
    public zzcbf() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzcbk zzcbkVar = (zzcbk) zzbdu.zzb(parcel, zzcbk.CREATOR);
            zzbdu.zzh(parcel);
            zzb(zzcbkVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            zzcbj zzcbjVar = null;
            zzcbe zzcbeVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcbjVar = queryLocalInterface instanceof zzcbj ? (zzcbj) queryLocalInterface : new zzcbh(readStrongBinder);
                }
                zzbdu.zzh(parcel);
                zzd(zzcbjVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zze = zze();
                        parcel2.writeNoException();
                        int i3 = zzbdu.zza;
                        parcel2.writeInt(zze ? 1 : 0);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbdu.zzh(parcel);
                        zzi(asInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbdu.zzh(parcel);
                        zzj(asInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbdu.zzh(parcel);
                        zzk(asInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(zzl);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzbdu.zzh(parcel);
                        zzm(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzby zzb = com.google.android.gms.ads.internal.client.zzbx.zzb(parcel.readStrongBinder());
                        zzbdu.zzh(parcel);
                        zzn(zzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzo = zzo();
                        parcel2.writeNoException();
                        zzbdu.zzd(parcel2, zzo);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcbeVar = queryLocalInterface2 instanceof zzcbe ? (zzcbe) queryLocalInterface2 : new zzcbe(readStrongBinder2);
                        }
                        zzbdu.zzh(parcel);
                        zzu(zzcbeVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzbdu.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbdu.zzh(parcel);
                        zzp(asInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzbdu.zzh(parcel);
                        zzq(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        int i4 = zzbdu.zza;
                        parcel2.writeInt(zzs ? 1 : 0);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdx zzt = zzt();
                        parcel2.writeNoException();
                        zzbdu.zze(parcel2, zzt);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zza = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzr(zza);
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
