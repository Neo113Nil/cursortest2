package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzblj extends zzbds implements zzbll {
    zzblj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final String zzb() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final List zzc() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzf = zzbdu.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }
}
