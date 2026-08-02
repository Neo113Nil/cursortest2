package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcbx extends zzbds implements zzcbz {
    zzcbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzg(zzcbt zzcbtVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzcbtVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzeVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzk() throws RemoteException {
        zzda(7, zza());
    }
}
