package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbjz;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzccn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbt extends zzbev implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzY(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzbh zzbhVar = null;
        zzcs zzcsVar = null;
        zzbk zzbkVar = null;
        zzdq zzdqVar = null;
        zzbhc zzbhcVar = null;
        zzby zzbyVar = null;
        zzccn zzccnVar = null;
        zzcp zzcpVar = null;
        zzbe zzbeVar = null;
        zzbkb zzbkbVar = null;
        zzcaf zzcafVar = null;
        zzcac zzcacVar = null;
        zzcl zzclVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zza = zza();
                parcel2.writeNoException();
                zzbew.e(parcel2, zza);
                return true;
            case 2:
                zzb();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzc = zzc();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeInt(zzc ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzbew.b(parcel, zzm.CREATOR);
                zzbew.f(parcel);
                boolean zzd = zzd(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zzd ? 1 : 0);
                return true;
            case 5:
                zze();
                parcel2.writeNoException();
                return true;
            case 6:
                zzf();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzbew.f(parcel);
                zzg(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzclVar = queryLocalInterface2 instanceof zzcl ? (zzcl) queryLocalInterface2 : new zzcj(readStrongBinder2);
                }
                zzbew.f(parcel);
                zzdU(zzclVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzk();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzl();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzm = zzm();
                parcel2.writeNoException();
                zzbew.d(parcel2, zzm);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzbew.b(parcel, zzr.CREATOR);
                zzbew.f(parcel);
                zzn(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    zzcacVar = queryLocalInterface3 instanceof zzcac ? (zzcac) queryLocalInterface3 : new zzcaa(readStrongBinder3, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                }
                zzbew.f(parcel);
                zzo(zzcacVar);
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    zzcafVar = queryLocalInterface4 instanceof zzcaf ? (zzcaf) queryLocalInterface4 : new zzcad(readStrongBinder4, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                }
                String readString = parcel.readString();
                zzbew.f(parcel);
                zzp(zzcafVar, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    zzbkbVar = queryLocalInterface5 instanceof zzbkb ? (zzbkb) queryLocalInterface5 : new zzbjz(readStrongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                }
                zzbew.f(parcel);
                zzw(zzbkbVar);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbeVar = queryLocalInterface6 instanceof zzbe ? (zzbe) queryLocalInterface6 : new zzbc(readStrongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                zzbew.f(parcel);
                zzx(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface7 instanceof zzcp ? (zzcp) queryLocalInterface7 : new zzcp(readStrongBinder7);
                }
                zzbew.f(parcel);
                zzX(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean a = zzbew.a(parcel);
                zzbew.f(parcel);
                zzy(a);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzA = zzA();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbew.a;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzccnVar = queryLocalInterface8 instanceof zzccn ? (zzccn) queryLocalInterface8 : new zzccl(readStrongBinder8);
                }
                zzbew.f(parcel);
                zzB(zzccnVar);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzbew.f(parcel);
                zzC(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzea zzE = zzE();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzE);
                return true;
            case 29:
                zzfw zzfwVar = (zzfw) zzbew.b(parcel, zzfw.CREATOR);
                zzbew.f(parcel);
                zzF(zzfwVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzee zzeeVar = (zzee) zzbew.b(parcel, zzee.CREATOR);
                zzbew.f(parcel);
                zzG(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 32:
                zzcl zzu = zzu();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzu);
                return true;
            case 33:
                zzbh zzv = zzv();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzv);
                return true;
            case 34:
                boolean a2 = zzbew.a(parcel);
                zzbew.f(parcel);
                zzJ(a2);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbyVar = queryLocalInterface9 instanceof zzby ? (zzby) queryLocalInterface9 : new zzbw(readStrongBinder9);
                }
                zzbew.f(parcel);
                zzi(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzj = zzj();
                parcel2.writeNoException();
                zzbew.d(parcel2, zzj);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzbew.f(parcel);
                zzD(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzbew.b(parcel, zzx.CREATOR);
                zzbew.f(parcel);
                zzH(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    zzbhcVar = queryLocalInterface10 instanceof zzbhc ? (zzbhc) queryLocalInterface10 : new zzbha(readStrongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                }
                zzbew.f(parcel);
                zzI(zzbhcVar);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx zzs = zzs();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzs);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdqVar = queryLocalInterface11 instanceof zzdq ? (zzdq) queryLocalInterface11 : new zzdo(readStrongBinder11);
                }
                zzbew.f(parcel);
                zzO(zzdqVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzbew.b(parcel, zzm.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbkVar = queryLocalInterface12 instanceof zzbk ? (zzbk) queryLocalInterface12 : new zzbi(readStrongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                zzbew.f(parcel);
                zzP(zzmVar2, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzQ(S1);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcsVar = queryLocalInterface13 instanceof zzcs ? (zzcs) queryLocalInterface13 : new zzcq(readStrongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                zzbew.f(parcel);
                zzR(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zzz = zzz();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzbew.a;
                parcel2.writeInt(zzz ? 1 : 0);
                return true;
            case 47:
                long zzT = zzT();
                parcel2.writeNoException();
                parcel2.writeLong(zzT);
                return true;
            case 48:
                long readLong = parcel.readLong();
                zzbew.f(parcel);
                zzS(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
