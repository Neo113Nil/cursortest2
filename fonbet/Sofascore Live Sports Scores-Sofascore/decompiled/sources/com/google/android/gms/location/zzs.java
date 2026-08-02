package com.google.android.gms.location;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzs extends com.google.android.gms.internal.identity.zzb implements zzt {
    public static final /* synthetic */ int a = 0;

    public zzs() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.identity.zzc.b(parcel);
        U();
        return true;
    }
}
