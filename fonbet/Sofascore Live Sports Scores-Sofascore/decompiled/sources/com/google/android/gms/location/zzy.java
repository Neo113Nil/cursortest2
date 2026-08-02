package com.google.android.gms.location;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzy extends com.google.android.gms.internal.identity.zzb implements zzz {
    public static final /* synthetic */ int a = 0;

    public zzy() {
        super("com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
            return true;
        }
        com.google.android.gms.internal.identity.zzc.b(parcel);
        J0();
        return true;
    }
}
