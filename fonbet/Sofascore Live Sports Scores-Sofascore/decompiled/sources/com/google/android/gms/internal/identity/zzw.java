package com.google.android.gms.internal.identity;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzw extends zzb implements zzx {
    public zzw() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        zzc.b(parcel);
        h4();
        return true;
    }
}
