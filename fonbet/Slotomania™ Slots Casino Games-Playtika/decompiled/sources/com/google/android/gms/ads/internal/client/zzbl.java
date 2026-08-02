package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzbl extends zzbds implements zzbn {
    zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzmVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzh() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzi(zzm zzmVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zzc(zza, zzmVar);
        zza.writeInt(i);
        zzda(5, zza);
    }
}
