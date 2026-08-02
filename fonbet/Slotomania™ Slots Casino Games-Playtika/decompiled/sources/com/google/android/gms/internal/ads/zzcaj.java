package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcaj extends zzbds implements IInterface {
    zzcaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzcaa zzcaaVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbdu.zzc(zza, zzcaaVar);
        zzda(1, zza);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzbaVar);
        zzda(2, zza);
    }
}
