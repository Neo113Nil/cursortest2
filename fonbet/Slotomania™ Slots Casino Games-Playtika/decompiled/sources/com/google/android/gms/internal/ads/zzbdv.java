package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbdv extends zzbds implements zzbdx {
    zzbdv(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    public final Bundle zze(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        Parcel zzcZ = zzcZ(1, zza);
        Bundle bundle2 = (Bundle) zzbdu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle2;
    }
}
