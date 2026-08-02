package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbfv extends zzbds implements zzbfx {
    zzbfv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzf(IObjectWrapper iObjectWrapper, zzbge zzbgeVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, zzbgeVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzdx zzb = com.google.android.gms.ads.internal.client.zzdw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbdu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzdqVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final String zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final long zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzl(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(10, zza);
    }
}
