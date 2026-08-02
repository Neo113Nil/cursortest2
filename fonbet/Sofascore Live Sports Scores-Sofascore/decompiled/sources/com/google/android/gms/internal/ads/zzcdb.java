package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcdb extends zzbeu implements zzcdd {
    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void N2(zzccx zzccxVar) {
        Parcel J = J();
        zzbew.e(J, zzccxVar);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void g(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void z1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel J = J();
        zzbew.c(J, zzeVar);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze() {
        Z1(J(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf() {
        Z1(J(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj() {
        Z1(J(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk() {
        Z1(J(), 7);
    }
}
