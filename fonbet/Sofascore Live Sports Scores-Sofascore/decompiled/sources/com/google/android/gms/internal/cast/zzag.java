package com.google.android.gms.internal.cast;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzag extends zzb implements zzah {
    public zzag() {
        super("com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsCallback");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzc.d(parcel);
            H();
            return true;
        }
        if (i != 2) {
            return false;
        }
        zzc.d(parcel);
        q1();
        return true;
    }
}
