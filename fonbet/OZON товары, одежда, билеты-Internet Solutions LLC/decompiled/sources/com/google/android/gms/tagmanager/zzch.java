package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzau;

/* loaded from: classes9.dex */
public final class zzch extends zzas implements zzcj {
    zzch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    @Override // com.google.android.gms.tagmanager.zzcj
    public final void zze(String str, String str2, Bundle bundle, long j11) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzau.zzd(zza, bundle);
        zza.writeLong(j11);
        zzl(1, zza);
    }
}
