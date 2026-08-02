package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbwc extends zzbev implements zzbwd {
    public zzbwc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IObjectWrapper zze = ((zzbww) this).zze();
            parcel2.writeNoException();
            zzbew.e(parcel2, zze);
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean shouldDelegateInterscrollerEffect = ((zzbww) this).a.shouldDelegateInterscrollerEffect();
        parcel2.writeNoException();
        ClassLoader classLoader = zzbew.a;
        parcel2.writeInt(shouldDelegateInterscrollerEffect ? 1 : 0);
        return true;
    }
}
