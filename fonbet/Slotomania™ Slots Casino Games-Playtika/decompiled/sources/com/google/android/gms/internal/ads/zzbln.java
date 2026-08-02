package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzbln extends zzbds implements zzblp {
    zzbln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zze() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final IObjectWrapper zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final boolean zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final boolean zzl() throws RemoteException {
        Parcel zzcZ = zzcZ(10, zza());
        boolean zza = zzbdu.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzm(zzbmx zzbmxVar) throws RemoteException {
        throw null;
    }
}
