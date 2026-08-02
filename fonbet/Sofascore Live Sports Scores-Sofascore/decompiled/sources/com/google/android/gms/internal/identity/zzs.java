package com.google.android.gms.internal.identity;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzs extends zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i == 1) {
            parcel.readInt();
            parcel.createStringArray();
            zzc.b(parcel);
            H();
            return true;
        }
        if (i == 2) {
            parcel.readInt();
            parcel.createStringArray();
            zzc.b(parcel);
            zzc();
            return true;
        }
        if (i != 3) {
            return false;
        }
        parcel.readInt();
        zzc.b(parcel);
        a2();
        return true;
    }
}
