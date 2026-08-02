package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbxv extends zzbev implements zzbxw {
    public zzbxv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            zzbew.f(parcel);
            ((zzesx) this).zze(readString);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzbew.f(parcel);
            zzesx zzesxVar = (zzesx) this;
            synchronized (zzesxVar) {
                zzesxVar.E4(2, readString2);
            }
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbew.f(parcel);
            ((zzesx) this).a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
