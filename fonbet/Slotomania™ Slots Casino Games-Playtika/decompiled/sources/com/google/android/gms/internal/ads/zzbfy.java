package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbfy extends zzbds implements zzbga {
    zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzb(zzbfx zzbfxVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbfxVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzc(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
