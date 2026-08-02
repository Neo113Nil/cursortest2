package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzcbi;
import com.google.android.gms.internal.ads.zzcbj;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbt extends zzbdt implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzZ(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcs zzcsVar = null;
        zzbk zzbkVar = null;
        zzdq zzdqVar = null;
        zzby zzbyVar = null;
        zzcp zzcpVar = null;
        zzbe zzbeVar = null;
        zzcl zzclVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzb = zzb();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzd = zzd();
                parcel2.writeNoException();
                int i3 = zzbdu.zza;
                parcel2.writeInt(zzd ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzbdu.zzb(parcel, zzm.CREATOR);
                zzbdu.zzh(parcel);
                boolean zze = zze(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zze ? 1 : 0);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzbdu.zzh(parcel);
                zzdS(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzclVar = queryLocalInterface2 instanceof zzcl ? (zzcl) queryLocalInterface2 : new zzcj(readStrongBinder2);
                }
                zzbdu.zzh(parcel);
                zzi(zzclVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzn = zzn();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzn);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                zzbdu.zzh(parcel);
                zzo(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbyy zzb2 = zzbyx.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzp(zzb2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbzb zzb3 = zzbza.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzbdu.zzh(parcel);
                zzq(zzb3, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 19:
                zzbiz zzb4 = zzbiy.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzx(zzb4);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbeVar = queryLocalInterface3 instanceof zzbe ? (zzbe) queryLocalInterface3 : new zzbc(readStrongBinder3);
                }
                zzbdu.zzh(parcel);
                zzy(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface4 instanceof zzcp ? (zzcp) queryLocalInterface4 : new zzcp(readStrongBinder4);
                }
                zzbdu.zzh(parcel);
                zzY(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zza = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzz(zza);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzB = zzB();
                parcel2.writeNoException();
                int i4 = zzbdu.zza;
                parcel2.writeInt(zzB ? 1 : 0);
                return true;
            case 24:
                zzcbj zzb5 = zzcbi.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzC(zzb5);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzbdu.zzh(parcel);
                zzD(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzea zzF = zzF();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzF);
                return true;
            case 29:
                zzfw zzfwVar = (zzfw) zzbdu.zzb(parcel, zzfw.CREATOR);
                zzbdu.zzh(parcel);
                zzG(zzfwVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzee zzeeVar = (zzee) zzbdu.zzb(parcel, zzee.CREATOR);
                zzbdu.zzh(parcel);
                zzH(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(zzu);
                return true;
            case 32:
                zzcl zzv = zzv();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzv);
                return true;
            case 33:
                zzbh zzw = zzw();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzw);
                return true;
            case 34:
                boolean zza2 = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzK(zza2);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbyVar = queryLocalInterface5 instanceof zzby ? (zzby) queryLocalInterface5 : new zzbw(readStrongBinder5);
                }
                zzbdu.zzh(parcel);
                zzj(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzk = zzk();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, zzk);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzbdu.zzh(parcel);
                zzE(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzbdu.zzb(parcel, zzx.CREATOR);
                zzbdu.zzh(parcel);
                zzI(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbga zze2 = zzbfz.zze(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzJ(zze2);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx zzt = zzt();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzt);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdqVar = queryLocalInterface6 instanceof zzdq ? (zzdq) queryLocalInterface6 : new zzdo(readStrongBinder6);
                }
                zzbdu.zzh(parcel);
                zzP(zzdqVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzbdu.zzb(parcel, zzm.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbkVar = queryLocalInterface7 instanceof zzbk ? (zzbk) queryLocalInterface7 : new zzbi(readStrongBinder7);
                }
                zzbdu.zzh(parcel);
                zzQ(zzmVar2, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzR(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcsVar = queryLocalInterface8 instanceof zzcs ? (zzcs) queryLocalInterface8 : new zzcq(readStrongBinder8);
                }
                zzbdu.zzh(parcel);
                zzS(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zzA = zzA();
                parcel2.writeNoException();
                int i5 = zzbdu.zza;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 47:
                long zzU = zzU();
                parcel2.writeNoException();
                parcel2.writeLong(zzU);
                return true;
            case 48:
                long readLong = parcel.readLong();
                zzbdu.zzh(parcel);
                zzT(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
