package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbmx extends zzbeu implements zzbmz {
    public zzbmx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        J.writeString(str);
        zzbew.e(J, iObjectWrapper);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final IObjectWrapper zzb(String str) {
        Parcel J = J();
        J.writeString(str);
        return x5n.i(S1(J, 2));
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzc(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzd() {
        Z1(J(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdB(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdC(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 9);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdD(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdE(zzbms zzbmsVar) {
        Parcel J = J();
        zzbew.e(J, zzbmsVar);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zze(IObjectWrapper iObjectWrapper, int i) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        J.writeInt(i);
        Z1(J, 5);
    }
}
