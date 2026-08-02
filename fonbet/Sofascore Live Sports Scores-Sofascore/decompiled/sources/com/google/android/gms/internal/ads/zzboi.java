package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzboi extends zzbev implements zzboj {
    public zzboi() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            zzbew.f(parcel);
            ((zzbzj) this).zze(readString);
        } else {
            if (i != 2) {
                return false;
            }
            ((zzbzj) this).zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
