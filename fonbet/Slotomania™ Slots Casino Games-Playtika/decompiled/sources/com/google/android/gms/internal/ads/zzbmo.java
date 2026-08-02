package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbmo extends zzbds implements zzbmq {
    zzbmo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zze(zzbmg zzbmgVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbmgVar);
        zzda(1, zza);
    }
}
