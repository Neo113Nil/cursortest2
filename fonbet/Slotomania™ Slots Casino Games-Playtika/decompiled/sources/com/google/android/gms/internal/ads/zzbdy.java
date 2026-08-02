package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbdy extends zzbds implements zzbea {
    zzbdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbea
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbea
    public final void zzf() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbea
    public final void zzg(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbea
    public final void zzh(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbea
    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbea
    public final void zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }
}
