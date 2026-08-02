package com.google.android.gms.internal.ads;

import android.os.Parcel;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzboc extends zzbev implements zzbod {
    public zzboc() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ((zzbou) this).h2(com.google.android.gms.ads.internal.client.zzbt.zzY(parcel.readStrongBinder()), x5n.j(parcel, parcel));
        parcel2.writeNoException();
        return true;
    }
}
