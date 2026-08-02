package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbm extends zzbeu implements zzbo {
    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        J.writeString(str);
        J.writeString(str2);
        Parcel S1 = S1(J, 1);
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzaVar);
        Parcel S1 = S1(J, 3);
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }
}
