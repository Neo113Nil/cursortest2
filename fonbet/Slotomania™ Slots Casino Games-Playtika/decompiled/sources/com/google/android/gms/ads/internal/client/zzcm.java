package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcbw;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcea;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzcm extends zzbds implements zzco {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbuq zzbuqVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzrVar);
        zza.writeString(str);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(1, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbuq zzbuqVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzrVar);
        zza.writeString(str);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(2, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzd(IObjectWrapper iObjectWrapper, String str, zzbuq zzbuqVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(3, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzblw zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, iObjectWrapper2);
        Parcel zzcZ = zzcZ(5, zza);
        zzblw zzdG = zzblv.zzdG(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzdG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcbg zzf(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbyp zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(8, zza);
        zzbyp zzI = zzbyo.zzI(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzh(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) throws RemoteException {
        zzch zzcfVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(18, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzi(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcy zzcwVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(9, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcwVar = queryLocalInterface instanceof zzcy ? (zzcy) queryLocalInterface : new zzcw(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzj(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmb zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcbw zzl(IObjectWrapper iObjectWrapper, String str, zzbuq zzbuqVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(12, zza);
        zzcbw zzt = zzcbv.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzm(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbuq zzbuqVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzrVar);
        zza.writeString(str);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(13, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcea zzn(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(14, zza);
        zzcea zzb = zzcdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbyi zzo(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(15, zza);
        zzbyi zzb = zzbyh.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbqh zzp(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i, zzbqe zzbqeVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbdu.zze(zza, zzbqeVar);
        Parcel zzcZ = zzcZ(16, zza);
        zzbqh zzb = zzbqg.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzq(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbuqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzcZ = zzcZ(17, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdrVar;
    }
}
