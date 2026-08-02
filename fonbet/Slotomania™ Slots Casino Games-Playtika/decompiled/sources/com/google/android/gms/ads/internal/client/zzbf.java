package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzbf extends zzbds implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzeVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        zzda(7, zza());
    }
}
