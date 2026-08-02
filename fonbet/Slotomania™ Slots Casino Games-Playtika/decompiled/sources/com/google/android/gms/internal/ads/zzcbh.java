package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcbh extends zzbds implements zzcbj {
    zzcbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzi(zzcbd zzcbdVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzcbdVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzk(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }
}
