package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzboh extends zzbeu implements zzboj {
    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zze(String str) {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzf() {
        Z1(J(), 2);
    }
}
