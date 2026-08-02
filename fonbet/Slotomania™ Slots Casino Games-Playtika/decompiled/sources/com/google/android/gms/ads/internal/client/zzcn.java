package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbw;
import com.google.android.gms.internal.ads.zzcea;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcn extends zzbdt implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzbuq zzf = zzbup.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbu zzb = zzb(asInterface, zzrVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzb);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzbuq zzf2 = zzbup.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbu zzc = zzc(asInterface2, zzrVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzc);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbuq zzf3 = zzbup.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbq zzd = zzd(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzblw zze = zze(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zze);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzf4 = zzbup.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzcbg zzf5 = zzf(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzf5);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzbyp zzg = zzg(asInterface7);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzg);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzcy zzi = zzi(asInterface8, readInt5);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzi);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbu zzj = zzj(asInterface9, zzrVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzj);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzbmb zzk = zzk(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzk);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbuq zzf6 = zzbup.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzcbw zzl = zzl(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzl);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzbuq zzf7 = zzbup.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbu zzm = zzm(asInterface14, zzrVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzm);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzf8 = zzbup.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzcea zzn = zzn(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzn);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzf9 = zzbup.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbyi zzo = zzo(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzo);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzf10 = zzbup.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbqe zzc2 = zzbqd.zzc(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzbqh zzp = zzp(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzp);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzf11 = zzbup.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzdt zzq = zzq(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzq);
                return true;
            case 18:
                IObjectWrapper asInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzf12 = zzbup.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzch zzh = zzh(asInterface19, zzf12, readInt13);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
