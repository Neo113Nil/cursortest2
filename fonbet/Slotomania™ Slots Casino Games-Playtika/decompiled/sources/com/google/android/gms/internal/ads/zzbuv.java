package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbuv extends zzbdt implements zzbuw {
    public zzbuv() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbuw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbuw ? (zzbuw) queryLocalInterface : new zzbuu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzbdu.zzh(parcel);
                zzg(readInt);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbva) {
                    }
                }
                zzbdu.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbdu.zzh(parcel);
                zzl(readString, readString2);
                break;
            case 10:
                zzbmi.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzbdu.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzbdu.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzcbp zzcbpVar = (zzcbp) zzbdu.zzb(parcel, zzcbp.CREATOR);
                zzbdu.zzh(parcel);
                zzp(zzcbpVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzcbt zzb = zzcbs.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzr(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzs(readInt2);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzbdu.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzbdu.zzh(parcel);
                zzv(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzbdu.zzh(parcel);
                zzw(readInt3, readString4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbdu.zzh(parcel);
                zzx(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbdu.zzh(parcel);
                zzy(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
