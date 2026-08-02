package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcbg extends zzbeu implements zzcbi {
    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void F0(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Parcel J = J();
        zzbew.c(J, zzcbvVar);
        zzbew.e(J, zzcbmVar);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void K3(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Parcel J = J();
        zzbew.c(J, zzcbvVar);
        zzbew.e(J, zzcbmVar);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void e3(String str, zzcbm zzcbmVar) {
        Parcel J = J();
        J.writeString(str);
        zzbew.e(J, zzcbmVar);
        Z1(J, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void o3(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Parcel J = J();
        zzbew.c(J, zzcbvVar);
        zzbew.e(J, zzcbmVar);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(String str) {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 9);
    }
}
