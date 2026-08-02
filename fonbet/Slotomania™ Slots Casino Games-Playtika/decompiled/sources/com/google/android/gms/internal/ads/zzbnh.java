package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbnh extends zzbds implements zzbnj {
    zzbnh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final boolean zzA() throws RemoteException {
        Parcel zzcZ = zzcZ(24, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzB(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzdgVar);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzC(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzdcVar);
        zzda(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzD() throws RemoteException {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzE() throws RemoteException {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final zzblp zzF() throws RemoteException {
        zzblp zzblnVar;
        Parcel zzcZ = zzcZ(29, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzblnVar = queryLocalInterface instanceof zzblp ? (zzblp) queryLocalInterface : new zzbln(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final boolean zzG() throws RemoteException {
        Parcel zzcZ = zzcZ(30, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final com.google.android.gms.ads.internal.client.zzdx zzH() throws RemoteException {
        Parcel zzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzdx zzb = com.google.android.gms.ads.internal.client.zzdw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzI(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzdqVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        zzda(33, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final long zzK() throws RemoteException {
        Parcel zzcZ = zzcZ(34, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzL(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final List zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzf = zzbdu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final zzbls zzh() throws RemoteException {
        zzbls zzblqVar;
        Parcel zzcZ = zzcZ(5, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzblqVar = queryLocalInterface instanceof zzbls ? (zzbls) queryLocalInterface : new zzblq(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final double zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzp() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final zzbll zzq() throws RemoteException {
        zzbll zzbljVar;
        Parcel zzcZ = zzcZ(14, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbljVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbljVar = queryLocalInterface instanceof zzbll ? (zzbll) queryLocalInterface : new zzblj(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        Parcel zzcZ = zzcZ(16, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        zzda(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final IObjectWrapper zzu() throws RemoteException {
        Parcel zzcZ = zzcZ(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final IObjectWrapper zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final Bundle zzw() throws RemoteException {
        Parcel zzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzbdu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzx(zzbng zzbngVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbngVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzy() throws RemoteException {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final List zzz() throws RemoteException {
        Parcel zzcZ = zzcZ(23, zza());
        ArrayList zzf = zzbdu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }
}
