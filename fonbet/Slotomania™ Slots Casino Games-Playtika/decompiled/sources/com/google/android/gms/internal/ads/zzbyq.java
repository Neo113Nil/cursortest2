package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbyq extends zzbds implements zzbys {
    zzbyq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final IBinder zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        zzcZ.recycle();
        return readStrongBinder;
    }
}
