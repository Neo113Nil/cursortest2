package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzccz extends zzbev implements zzcda {
    public zzccz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcda zzs(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzcda ? (zzcda) queryLocalInterface : new zzccy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzcdh zzcdhVar = null;
        zzcdh zzcdhVar2 = null;
        zzcdi zzcdiVar = null;
        zzcdd zzcddVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcdhVar = queryLocalInterface instanceof zzcdh ? (zzcdh) queryLocalInterface : new zzcdf(readStrongBinder);
                }
                zzbew.f(parcel);
                zzb(zzmVar, zzcdhVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcddVar = queryLocalInterface2 instanceof zzcdd ? (zzcdd) queryLocalInterface2 : new zzcdb(readStrongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                }
                zzbew.f(parcel);
                zzd(zzcddVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzh = zzh();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeInt(zzh ? 1 : 0);
                return true;
            case 4:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 5:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zza(S1);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcdiVar = queryLocalInterface3 instanceof zzcdi ? (zzcdi) queryLocalInterface3 : new zzcdi(readStrongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                }
                zzbew.f(parcel);
                zzr(zzcdiVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcdo zzcdoVar = (zzcdo) zzbew.b(parcel, zzcdo.CREATOR);
                zzbew.f(parcel);
                zzg(zzcdoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdn zza = com.google.android.gms.ads.internal.client.zzdm.zza(parcel.readStrongBinder());
                zzbew.f(parcel);
                zze(zza);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzbew.d(parcel2, zzf);
                return true;
            case 10:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                ClassLoader classLoader2 = zzbew.a;
                boolean z = parcel.readInt() != 0;
                zzbew.f(parcel);
                zzj(S12, z);
                parcel2.writeNoException();
                return true;
            case 11:
                zzccx zzk = zzk();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzk);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdx zzl = zzl();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzl);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zza2 = com.google.android.gms.ads.internal.client.zzdp.zza(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzn(zza2);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcdhVar2 = queryLocalInterface4 instanceof zzcdh ? (zzcdh) queryLocalInterface4 : new zzcdf(readStrongBinder4);
                }
                zzbew.f(parcel);
                zzc(zzmVar2, zzcdhVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean a = zzbew.a(parcel);
                zzbew.f(parcel);
                zzo(a);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 17:
                long zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeLong(zzp);
                return true;
            case 18:
                long readLong = parcel.readLong();
                zzbew.f(parcel);
                zzq(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
