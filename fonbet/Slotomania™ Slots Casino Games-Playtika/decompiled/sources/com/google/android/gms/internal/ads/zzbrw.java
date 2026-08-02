package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbrw extends zzbds implements zzbry {
    zzbrw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final void zze(zzbrs zzbrsVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzbrsVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
