package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzblu extends zzbds implements zzblw {
    zzblu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbdu.zze(zza, iObjectWrapper);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final IObjectWrapper zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzdB(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzdC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzdD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzdE(zzblp zzblpVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, zzblpVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zza.writeInt(i);
        zzda(5, zza);
    }
}
