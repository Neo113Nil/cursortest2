package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfyn extends zzbds implements zzfyp {
    zzfyn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final void zze() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final void zzf(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final void zzg(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final void zzj(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(null);
        zzda(8, zza);
    }
}
