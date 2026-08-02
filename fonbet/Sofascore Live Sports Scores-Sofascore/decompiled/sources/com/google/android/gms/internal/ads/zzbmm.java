package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbmm extends zzbeu implements zzbmo {
    public zzbmm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final String zza() {
        Parcel S1 = S1(J(), 2);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final ArrayList zzb() {
        Parcel S1 = S1(J(), 3);
        ArrayList readArrayList = S1.readArrayList(zzbew.a);
        S1.recycle();
        return readArrayList;
    }
}
