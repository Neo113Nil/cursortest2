package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcm extends zzbeu implements zzco {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zza(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzrVar);
        J.writeString(str);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 1);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        S1.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzrVar);
        J.writeString(str);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 2);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        S1.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzc(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        J.writeString(str);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 3);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        S1.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmz zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, iObjectWrapper2);
        Parcel S1 = S1(J, 5);
        zzbmz zzdG = zzbmy.zzdG(S1.readStrongBinder());
        S1.recycle();
        return zzdG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcck zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzt zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Parcel S1 = S1(J, 8);
        zzbzt zzH = zzbzs.zzH(S1.readStrongBinder());
        S1.recycle();
        return zzH;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzg(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        zzch zzcfVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 18);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzcfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(readStrongBinder);
        }
        S1.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzh(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcy zzcwVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 9);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzcwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcwVar = queryLocalInterface instanceof zzcy ? (zzcy) queryLocalInterface : new zzcw(readStrongBinder);
        }
        S1.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzi(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbne zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcda zzk(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        J.writeString(str);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 12);
        zzcda zzs = zzccz.zzs(S1.readStrongBinder());
        S1.recycle();
        return zzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzl(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzrVar);
        J.writeString(str);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 13);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        S1.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcfe zzm(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 14);
        zzcfe zza = zzcfd.zza(S1.readStrongBinder());
        S1.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzm zzn(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbzm zzbzkVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 15);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i2 = zzbzl.a;
        if (readStrongBinder == null) {
            zzbzkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbzkVar = queryLocalInterface instanceof zzbzm ? (zzbzm) queryLocalInterface : new zzbzk(readStrongBinder);
        }
        S1.recycle();
        return zzbzkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbrl zzo(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i, zzbri zzbriVar) throws RemoteException {
        zzbrl zzbrjVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbew.e(J, zzbriVar);
        Parcel S1 = S1(J, 16);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i2 = zzbrk.a;
        if (readStrongBinder == null) {
            zzbrjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbrjVar = queryLocalInterface instanceof zzbrl ? (zzbrl) queryLocalInterface : new zzbrj(readStrongBinder);
        }
        S1.recycle();
        return zzbrjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzp(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 17);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
        }
        S1.recycle();
        return zzdrVar;
    }
}
