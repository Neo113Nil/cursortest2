package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbm extends zzbds implements zzbo {
    zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        Parcel zzcZ = zzcZ(1, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzaVar);
        Parcel zzcZ = zzcZ(3, zza);
        boolean zza2 = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}
