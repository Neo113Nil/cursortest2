package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbyg extends zzbds implements zzbyi {
    zzbyg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, intent);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbdu.zze(zza, iObjectWrapper);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzaVar);
        zzda(6, zza);
    }
}
