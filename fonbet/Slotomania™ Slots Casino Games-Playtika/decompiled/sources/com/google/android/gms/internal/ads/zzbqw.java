package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbqw extends zzbds implements IInterface {
    zzbqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbqq zzbqqVar, zzbqv zzbqvVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzbqqVar);
        zzbdu.zze(zza, zzbqvVar);
        zzdb(2, zza);
    }
}
