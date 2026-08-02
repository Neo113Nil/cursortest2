package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import xsna.mov;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzai extends zza implements IInterface {
    public zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsService");
    }

    public final void zze(mov movVar, zzah zzahVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, movVar);
        zzc.zze(zza, zzahVar);
        zzc(1, zza);
    }

    public final void zzf(mov movVar, zzah zzahVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, movVar);
        zzc.zze(zza, zzahVar);
        zzc(2, zza);
    }

    public final void zzg(mov movVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, movVar);
        zzc(3, zza);
    }

    public final void zzh(mov movVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, movVar);
        zzc(4, zza);
    }
}
