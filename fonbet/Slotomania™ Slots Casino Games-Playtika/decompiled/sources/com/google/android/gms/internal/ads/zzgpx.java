package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgpx extends zzbds implements zzgpz {
    zzgpx(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgpz
    public final void zze(String str, Bundle bundle, zzgqb zzgqbVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbdu.zzc(zza, bundle);
        zzbdu.zze(zza, zzgqbVar);
        zzdb(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgpz
    public final void zzf(Bundle bundle, zzgqb zzgqbVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        zzbdu.zze(zza, zzgqbVar);
        zzdb(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgpz
    public final void zzg(Bundle bundle, zzgqb zzgqbVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, bundle);
        zzbdu.zze(zza, zzgqbVar);
        zzdb(3, zza);
    }
}
