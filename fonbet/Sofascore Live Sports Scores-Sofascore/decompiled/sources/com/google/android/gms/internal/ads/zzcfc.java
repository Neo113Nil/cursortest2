package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcfc extends zzbeu implements zzcfe {
    public zzcfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zze(IObjectWrapper iObjectWrapper, zzcfi zzcfiVar, zzcfb zzcfbVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzcfiVar);
        zzbew.e(J, zzcfbVar);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, iObjectWrapper2);
        J.writeString(str);
        zzbew.e(J, iObjectWrapper3);
        return x5n.i(S1(J, 11));
    }
}
