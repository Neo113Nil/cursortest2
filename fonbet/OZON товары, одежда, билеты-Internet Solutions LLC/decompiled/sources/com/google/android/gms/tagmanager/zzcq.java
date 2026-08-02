package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzau;

/* loaded from: classes9.dex */
public final class zzcq extends zzas implements zzcs {
    zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    @Override // com.google.android.gms.tagmanager.zzcs
    public final void initialize(IObjectWrapper iObjectWrapper, zzcp zzcpVar, zzcg zzcgVar) throws RemoteException {
        Parcel zza = zza();
        zzau.zze(zza, iObjectWrapper);
        zzau.zze(zza, zzcpVar);
        zzau.zze(zza, zzcgVar);
        zzl(1, zza);
    }

    @Override // com.google.android.gms.tagmanager.zzcs
    public final void preview(Intent intent, IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.tagmanager.zzcs
    public final void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzcp zzcpVar, zzcg zzcgVar) throws RemoteException {
        Parcel zza = zza();
        zzau.zzd(zza, intent);
        zzau.zze(zza, iObjectWrapper);
        zzau.zze(zza, iObjectWrapper2);
        zzau.zze(zza, zzcpVar);
        zzau.zze(zza, zzcgVar);
        zzl(3, zza);
    }
}
