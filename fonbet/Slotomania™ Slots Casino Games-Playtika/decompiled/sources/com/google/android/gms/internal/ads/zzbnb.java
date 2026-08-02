package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbnb extends zzbds implements zzbnd {
    zzbnb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zze(zzbnj zzbnjVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbnjVar);
        zzda(1, zza);
    }
}
