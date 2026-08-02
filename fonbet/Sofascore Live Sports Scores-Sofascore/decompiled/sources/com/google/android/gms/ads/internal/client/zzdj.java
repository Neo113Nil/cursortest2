package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzdj extends zzbev implements zzdk {
    public zzdj() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        zze zzeVar = (zze) zzbew.b(parcel, zze.CREATOR);
        zzbew.f(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
