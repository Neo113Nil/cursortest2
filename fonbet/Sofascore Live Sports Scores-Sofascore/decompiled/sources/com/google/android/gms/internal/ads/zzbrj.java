package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbrj extends zzbeu implements zzbrl {
    public zzbrj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zze(String str) {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzf() {
        Z1(J(), 2);
    }
}
