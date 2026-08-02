package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbzk extends zzbeu implements zzbzm {
    public zzbzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void K(Intent intent) {
        Parcel J = J();
        zzbew.c(J, intent);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void T1(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        J.writeStringArray(strArr);
        J.writeIntArray(iArr);
        zzbew.e(J, iObjectWrapper);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void t(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void w4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.c(J, zzaVar);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzg() {
        Z1(J(), 3);
    }
}
