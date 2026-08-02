package com.google.android.gms.internal.cast;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzez extends zza implements IInterface {
    public zzez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    }

    public final void zze(ApiMetadata apiMetadata) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, apiMetadata);
        zzd(3, zza);
    }

    public final void zzf(zzey zzeyVar, zzfb zzfbVar, String str, String str2, Bundle bundle, ApiMetadata apiMetadata) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzeyVar);
        zzc.zze(zza, zzfbVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzc(zza, bundle);
        zzc.zzc(zza, apiMetadata);
        zzd(7, zza);
    }

    public final void zzg(zzey zzeyVar, PendingIntent pendingIntent, String str, String str2, Bundle bundle, ApiMetadata apiMetadata) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzeyVar);
        zzc.zzc(zza, pendingIntent);
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzc(zza, bundle);
        zzc.zzc(zza, apiMetadata);
        zzd(8, zza);
    }

    public final void zzh(zzey zzeyVar, int i, ApiMetadata apiMetadata) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzeyVar);
        zza.writeInt(i);
        zzc.zzc(zza, apiMetadata);
        zzd(5, zza);
    }

    public final void zzi(zzey zzeyVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzeyVar);
        zzc.zzc(zza, apiMetadata);
        zzd(6, zza);
    }
}
