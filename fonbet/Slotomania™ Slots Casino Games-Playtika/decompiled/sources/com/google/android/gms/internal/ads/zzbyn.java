package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbyn extends zzbds implements zzbyp {
    zzbyn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzH(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zze() throws RemoteException {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzf() throws RemoteException {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final boolean zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(11, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzi() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzj() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzk() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzl() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzbdu.zzc(zza, intent);
        zzda(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        Parcel zzcZ = zzcZ(6, zza);
        if (zzcZ.readInt() != 0) {
            bundle.readFromParcel(zzcZ);
        }
        zzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzp() throws RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzq() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyp
    public final void zzs() throws RemoteException {
        zzda(9, zza());
    }
}
