package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcdy extends zzbds implements zzcea {
    zzcdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zze(IObjectWrapper iObjectWrapper, zzcee zzceeVar, zzcdx zzcdxVar) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zzc(zza, zzceeVar);
        zzbdu.zze(zza, zzcdxVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzi(zzbzh zzbzhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzbdu.zze(zza, iObjectWrapper);
        zzbdu.zze(zza, iObjectWrapper2);
        zza.writeString(str);
        zzbdu.zze(zza, iObjectWrapper3);
        Parcel zzcZ = zzcZ(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }
}
