package com.google.android.gms.cast.internal;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzaf extends com.google.android.gms.internal.cast.zzb implements zzag {
    public zzaf() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.zzc.a(parcel, Bundle.CREATOR);
        com.google.android.gms.internal.cast.zzc.d(parcel);
        F(bundle);
        return true;
    }
}
