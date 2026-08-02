package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.frn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcfa extends zzbev implements zzcfb {
    public zzcfa() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzbew.f(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbew.f(parcel);
            ((frn) this).zza(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
            zzbew.f(parcel);
            ((frn) this).J1(readString2, bundle, readString3);
        }
        parcel2.writeNoException();
        return true;
    }
}
