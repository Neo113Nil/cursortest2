package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public final class zzhe extends zzas implements zzhg {
    zzhe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    @Override // com.google.android.gms.internal.gtm.zzhg
    public final void zze(boolean z11, String str) throws RemoteException {
        Parcel zza = zza();
        zzau.zzc(zza, z11);
        zza.writeString(str);
        zzm(1, zza);
    }
}
