package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbrh extends zzbev implements zzbri {
    public zzbrh() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        zzbew.f(parcel);
        ((zzbrf) this).zza(readString);
        parcel2.writeNoException();
        return true;
    }
}
