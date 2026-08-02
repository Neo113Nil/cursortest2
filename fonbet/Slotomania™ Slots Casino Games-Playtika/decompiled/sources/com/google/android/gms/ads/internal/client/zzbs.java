package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzcbj;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzbs extends zzbds implements zzbu {
    zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws RemoteException {
        Parcel zzcZ = zzcZ(46, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzB() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzcbj zzcbjVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzea zzF() throws RemoteException {
        zzea zzdyVar;
        Parcel zzcZ = zzcZ(26, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdyVar = queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzfw zzfwVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzfwVar);
        zzda(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzee zzeeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzbga zzbgaVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbgaVar);
        zzda(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbdu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzdqVar);
        zzda(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzm zzmVar, zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, zzbkVar);
        zzda(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzcsVar);
        zzda(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(48, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() throws RemoteException {
        Parcel zzcZ = zzcZ(47, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(zzcp zzcpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbhVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zze(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzmVar);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzcl zzclVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzclVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzby zzbyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzr zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        zzr zzrVar = (zzr) zzbdu.zzb(zzcZ, zzr.CREATOR);
        zzcZ.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzbyy zzbyyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzbzb zzbzbVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdx zzt() throws RemoteException {
        zzdx zzdvVar;
        Parcel zzcZ = zzcZ(41, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdvVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(31, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzv() throws RemoteException {
        zzcl zzcjVar;
        Parcel zzcZ = zzcZ(32, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcjVar = queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzw() throws RemoteException {
        zzbh zzbfVar;
        Parcel zzcZ = zzcZ(33, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(zzbiz zzbizVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzbe zzbeVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbeVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbdu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(22, zza);
    }
}
