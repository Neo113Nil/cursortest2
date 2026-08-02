package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcag extends zzbds implements zzcai {
    zzcag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, parcelFileDescriptor);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzbaVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcar zzcarVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, parcelFileDescriptor);
        zzbdu.zzc(zza, zzcarVar);
        zzda(3, zza);
    }
}
