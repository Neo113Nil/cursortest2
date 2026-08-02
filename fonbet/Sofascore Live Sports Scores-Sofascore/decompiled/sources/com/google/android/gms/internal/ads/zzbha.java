package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbha extends zzbeu implements zzbhc {
    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void X(zzbgz zzbgzVar) {
        Parcel J = J();
        zzbew.e(J, zzbgzVar);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzb(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel J = J();
        zzbew.c(J, zzeVar);
        Z1(J, 3);
    }
}
