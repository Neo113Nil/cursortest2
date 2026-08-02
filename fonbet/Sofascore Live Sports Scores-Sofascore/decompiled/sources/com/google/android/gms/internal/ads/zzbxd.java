package com.google.android.gms.internal.ads;

import android.os.Parcel;
import defpackage.a5o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbxd extends zzbev implements zzbxe {
    public zzbxd() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            ((a5o) this).zze();
        } else if (i == 3) {
            String readString = parcel.readString();
            zzbew.f(parcel);
            ((a5o) this).zzf(readString);
        } else {
            if (i != 4) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbew.f(parcel);
            ((a5o) this).a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
