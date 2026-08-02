package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbkz extends zzbds implements IInterface {
    zzbkz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbzs zzbzsVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbzsVar);
        zzda(1, zza);
    }
}
