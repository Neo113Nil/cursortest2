package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzhj;
import com.google.android.gms.internal.gtm.zzji;

@DynamiteApi
/* loaded from: classes9.dex */
public class TagManagerServiceProviderImpl extends zzcu {
    private static volatile zzji zza;

    @Override // com.google.android.gms.tagmanager.zzcv
    public zzhj getService(IObjectWrapper iObjectWrapper, zzcp zzcpVar, zzcg zzcgVar) throws RemoteException {
        zzji zzjiVar;
        zzji zzjiVar2 = zza;
        if (zzjiVar2 != null) {
            return zzjiVar2;
        }
        synchronized (TagManagerServiceProviderImpl.class) {
            try {
                zzjiVar = zza;
                if (zzjiVar == null) {
                    zzjiVar = new zzji((Context) ObjectWrapper.unwrap(iObjectWrapper), zzcpVar, zzcgVar);
                    zza = zzjiVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzjiVar;
    }
}
