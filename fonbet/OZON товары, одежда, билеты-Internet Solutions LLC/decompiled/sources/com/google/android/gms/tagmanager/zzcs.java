package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes9.dex */
public interface zzcs extends IInterface {
    void initialize(IObjectWrapper iObjectWrapper, zzcp zzcpVar, zzcg zzcgVar) throws RemoteException;

    void preview(Intent intent, IObjectWrapper iObjectWrapper) throws RemoteException;

    void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzcp zzcpVar, zzcg zzcgVar) throws RemoteException;
}
