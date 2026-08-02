package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbxu extends zzbeu implements zzbxw {
    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel J = J();
        zzbew.c(J, zzeVar);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zze(String str) {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 1);
    }
}
