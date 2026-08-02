package com.google.android.gms.location;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzv extends com.google.android.gms.internal.identity.zzb implements zzw {
    public static final /* synthetic */ int a = 0;

    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i == 1) {
            com.google.android.gms.internal.identity.zzc.b(parcel);
            n0();
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            zzf();
            return true;
        }
        com.google.android.gms.internal.identity.zzc.b(parcel);
        v();
        return true;
    }
}
