package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcbu extends zzbds implements zzcbw {
    zzcbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, zzccdVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzmVar);
        zzbdu.zze(zza, zzccdVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zze(zzcbz zzcbzVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzcbzVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzdnVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final Bundle zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzbdu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzh(zzcck zzcckVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzcckVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzcbt zzl() throws RemoteException {
        zzcbt zzcbrVar;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcbrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcbrVar = queryLocalInterface instanceof zzcbt ? (zzcbt) queryLocalInterface : new zzcbr(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final com.google.android.gms.ads.internal.client.zzdx zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzdx zzb = com.google.android.gms.ads.internal.client.zzdw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(16, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzdqVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbdu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzr(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzs(zzcce zzcceVar) throws RemoteException {
        throw null;
    }
}
