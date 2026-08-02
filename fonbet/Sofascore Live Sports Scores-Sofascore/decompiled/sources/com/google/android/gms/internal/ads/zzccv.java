package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzccv extends zzbeu implements zzccx {
    public zzccv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final String zze() {
        Parcel S1 = S1(J(), 1);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzf() {
        Parcel S1 = S1(J(), 2);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }
}
