package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbwb extends zzbds implements zzbwd {
    zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzh(zzbuz zzbuzVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbuzVar);
        zzda(4, zza);
    }
}
