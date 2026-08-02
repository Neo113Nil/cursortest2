package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccn;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbs extends zzbeu implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws RemoteException {
        Parcel S1 = S1(J(), 23);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzea zzE() throws RemoteException {
        zzea zzdyVar;
        Parcel S1 = S1(J(), 26);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdyVar = queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(readStrongBinder);
        }
        S1.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzfw zzfwVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzfwVar);
        Z1(J, 29);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzee zzeeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbhcVar);
        Z1(J, 40);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) throws RemoteException {
        Parcel J = J();
        ClassLoader classLoader = zzbew.a;
        J.writeInt(z ? 1 : 0);
        Z1(J, 34);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzdq zzdqVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzdqVar);
        Z1(J, 42);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzm zzmVar, zzbk zzbkVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzmVar);
        zzbew.e(J, zzbkVar);
        Z1(J, 43);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 44);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(zzcs zzcsVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzcsVar);
        Z1(J, 45);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(long j) throws RemoteException {
        Parcel J = J();
        J.writeLong(j);
        Z1(J, 48);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzT() throws RemoteException {
        Parcel S1 = S1(J(), 47);
        long readLong = S1.readLong();
        S1.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX(zzcp zzcpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() throws RemoteException {
        return x5n.i(S1(J(), 1));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzb() throws RemoteException {
        Z1(J(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd(zzm zzmVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzmVar);
        Parcel S1 = S1(J, 4);
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(zzcl zzclVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzclVar);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zze() throws RemoteException {
        Z1(J(), 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws RemoteException {
        Z1(J(), 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbh zzbhVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbhVar);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzby zzbyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws RemoteException {
        Z1(J(), 11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzr zzm() throws RemoteException {
        Parcel S1 = S1(J(), 12);
        zzr zzrVar = (zzr) zzbew.b(S1, zzr.CREATOR);
        S1.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzr zzrVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzrVar);
        Z1(J, 13);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzq() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdx zzs() throws RemoteException {
        zzdx zzdvVar;
        Parcel S1 = S1(J(), 41);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzdvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdvVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(readStrongBinder);
        }
        S1.recycle();
        return zzdvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() throws RemoteException {
        Parcel S1 = S1(J(), 31);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzu() throws RemoteException {
        zzcl zzcjVar;
        Parcel S1 = S1(J(), 32);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzcjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcjVar = queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(readStrongBinder);
        }
        S1.recycle();
        return zzcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzv() throws RemoteException {
        zzbh zzbfVar;
        Parcel S1 = S1(J(), 33);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
        }
        S1.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzw(zzbkb zzbkbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(zzbe zzbeVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbeVar);
        Z1(J, 20);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(boolean z) throws RemoteException {
        Parcel J = J();
        ClassLoader classLoader = zzbew.a;
        J.writeInt(z ? 1 : 0);
        Z1(J, 22);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzz() throws RemoteException {
        Parcel S1 = S1(J(), 46);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }
}
