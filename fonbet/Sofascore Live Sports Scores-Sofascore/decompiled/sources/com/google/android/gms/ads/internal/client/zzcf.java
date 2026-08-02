package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcda;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcf extends zzbeu implements zzch {
    public zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(List list, zzcb zzcbVar) throws RemoteException {
        Parcel J = J();
        J.writeTypedList(list);
        zzbew.e(J, zzcbVar);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 2);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcda zzg(String str) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 3);
        zzcda zzs = zzccz.zzs(S1.readStrongBinder());
        S1.recycle();
        return zzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 4);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgz zzi(String str) throws RemoteException {
        zzbgz zzbgxVar;
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 5);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i = zzbgy.a;
        if (readStrongBinder == null) {
            zzbgxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            zzbgxVar = queryLocalInterface instanceof zzbgz ? (zzbgz) queryLocalInterface : new zzbgx(readStrongBinder);
        }
        S1.recycle();
        return zzbgxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 6);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzk(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 7);
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

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(zzbvu zzbvuVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbvuVar);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        zzbew.c(J, zzfpVar);
        zzbew.e(J, zzceVar);
        Parcel S1 = S1(J, 9);
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i, String str) throws RemoteException {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        Parcel S1 = S1(J, 10);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzo(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 11);
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

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgz zzp(String str) throws RemoteException {
        zzbgz zzbgxVar;
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 12);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i = zzbgy.a;
        if (readStrongBinder == null) {
            zzbgxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            zzbgxVar = queryLocalInterface instanceof zzbgz ? (zzbgz) queryLocalInterface : new zzbgx(readStrongBinder);
        }
        S1.recycle();
        return zzbgxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcda zzq(String str) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 13);
        zzcda zzs = zzccz.zzs(S1.readStrongBinder());
        S1.recycle();
        return zzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i, String str) throws RemoteException {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        Parcel S1 = S1(J, 14);
        zzfp zzfpVar = (zzfp) zzbew.b(S1, zzfp.CREATOR);
        S1.recycle();
        return zzfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i) throws RemoteException {
        Parcel J = J();
        J.writeInt(i);
        Parcel S1 = S1(J, 15);
        Bundle bundle = (Bundle) zzbew.b(S1, Bundle.CREATOR);
        S1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i, String str) throws RemoteException {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        Parcel S1 = S1(J, 16);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i, String str) throws RemoteException {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        Parcel S1 = S1(J, 17);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i) throws RemoteException {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 18);
    }
}
