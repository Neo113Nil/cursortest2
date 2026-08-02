package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzau;

/* loaded from: classes9.dex */
public final class zzck extends zzas implements zzcm {
    zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    @Override // com.google.android.gms.tagmanager.zzcm
    public final void zze(String str, String str2, Bundle bundle, long j11) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzau.zzd(zza, bundle);
        zza.writeLong(j11);
        zzl(2, zza);
    }
}
