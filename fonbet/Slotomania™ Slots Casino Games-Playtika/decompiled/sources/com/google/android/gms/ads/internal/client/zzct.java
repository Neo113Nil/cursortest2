package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbuq;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzct extends zzbds implements zzcv {
    zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbuq getAdapterCreator() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        zzbuq zzf = zzbup.zzf(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzez getLiteSdkVersion() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        zzez zzezVar = (zzez) zzbdu.zzb(zzcZ, zzez.CREATOR);
        zzcZ.recycle();
        return zzezVar;
    }
}
