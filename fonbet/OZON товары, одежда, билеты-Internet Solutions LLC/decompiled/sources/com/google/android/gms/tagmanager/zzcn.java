package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzau;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzcn extends zzas implements zzcp {
    zzcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // com.google.android.gms.tagmanager.zzcp
    public final Map zzb() throws RemoteException {
        Parcel zzk = zzk(11, zza());
        HashMap zzb = zzau.zzb(zzk);
        zzk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.tagmanager.zzcp
    public final void zzc(String str, String str2, Bundle bundle, long j11) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzau.zzd(zza, bundle);
        zza.writeLong(j11);
        zzl(2, zza);
    }

    @Override // com.google.android.gms.tagmanager.zzcp
    public final void zzd(zzcj zzcjVar) throws RemoteException {
        Parcel zza = zza();
        zzau.zze(zza, zzcjVar);
        zzl(22, zza);
    }

    @Override // com.google.android.gms.tagmanager.zzcp
    public final void zze(zzcm zzcmVar) throws RemoteException {
        Parcel zza = zza();
        zzau.zze(zza, zzcmVar);
        zzl(21, zza);
    }
}
