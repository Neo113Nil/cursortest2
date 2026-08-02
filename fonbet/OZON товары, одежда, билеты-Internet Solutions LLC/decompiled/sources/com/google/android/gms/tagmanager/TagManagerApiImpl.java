package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzhl;
import com.google.android.gms.internal.gtm.zzhr;
import com.google.android.gms.internal.gtm.zzje;

@DynamiteApi
/* loaded from: classes9.dex */
public class TagManagerApiImpl extends zzcr {
    private zzje zza;

    @Override // com.google.android.gms.tagmanager.zzcs
    public void initialize(IObjectWrapper iObjectWrapper, zzcp zzcpVar, zzcg zzcgVar) throws RemoteException {
        zzje zzf = zzje.zzf((Context) ObjectWrapper.unwrap(iObjectWrapper), zzcpVar, zzcgVar);
        this.zza = zzf;
        zzf.zzm(null);
    }

    @Override // com.google.android.gms.tagmanager.zzcs
    @Deprecated
    public void preview(@RecentlyNonNull Intent intent, @RecentlyNonNull IObjectWrapper iObjectWrapper) {
        zzhl.zze("Deprecated. Please use previewIntent instead.");
    }

    @Override // com.google.android.gms.tagmanager.zzcs
    public void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzcp zzcpVar, zzcg zzcgVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapper2);
        zzje zzf = zzje.zzf(context, zzcpVar, zzcgVar);
        this.zza = zzf;
        new zzhr(intent, context, context2, zzf).zzb();
    }
}
