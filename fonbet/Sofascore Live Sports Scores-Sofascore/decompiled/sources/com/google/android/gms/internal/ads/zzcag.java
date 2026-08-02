package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcag extends zzbeu implements zzcai {
    @Override // com.google.android.gms.internal.ads.zzcai
    public final void z(List list) {
        Parcel J = J();
        J.writeTypedList(list);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(String str) {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 2);
    }
}
