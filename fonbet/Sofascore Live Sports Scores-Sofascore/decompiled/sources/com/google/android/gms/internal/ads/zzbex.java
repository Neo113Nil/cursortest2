package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbex extends zzbeu implements zzbez {
    @Override // com.google.android.gms.internal.ads.zzbez
    public final Bundle u(Bundle bundle) {
        Parcel J = J();
        zzbew.c(J, bundle);
        Parcel S1 = S1(J, 1);
        Bundle bundle2 = (Bundle) zzbew.b(S1, Bundle.CREATOR);
        S1.recycle();
        return bundle2;
    }
}
