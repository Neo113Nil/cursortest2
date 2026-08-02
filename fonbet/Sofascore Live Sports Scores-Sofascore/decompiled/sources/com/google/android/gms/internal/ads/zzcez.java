package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcez extends zzbeu implements zzcfb {
    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void J1(String str, Bundle bundle, String str2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzbew.c(J, bundle);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zza(String str) {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 2);
    }
}
