package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhj;

/* loaded from: classes9.dex */
public final class zzct extends zzas implements zzcv {
    zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    @Override // com.google.android.gms.tagmanager.zzcv
    public final zzhj getService(IObjectWrapper iObjectWrapper, zzcp zzcpVar, zzcg zzcgVar) throws RemoteException {
        Parcel zza = zza();
        zzau.zze(zza, iObjectWrapper);
        zzau.zze(zza, zzcpVar);
        zzau.zze(zza, zzcgVar);
        Parcel zzk = zzk(1, zza);
        zzhj zzb = zzhi.zzb(zzk.readStrongBinder());
        zzk.recycle();
        return zzb;
    }
}
