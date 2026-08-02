package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes4.dex */
public final class zzdo extends zzbds implements zzdq {
    zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zze(zzt zztVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zztVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }
}
