package com.google.android.gms.internal.ads;

import android.os.Parcel;
import defpackage.a3o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbsk extends zzbev implements zzbsl {
    public zzbsk() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            ((a3o) this).zze();
        } else {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            zzbew.f(parcel);
            ((a3o) this).zzf(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
