package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbww extends zzbwc {
    public final MediationInterscrollerAd a;

    public zzbww(MediationInterscrollerAd mediationInterscrollerAd) {
        this.a = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final IObjectWrapper zze() {
        return new ObjectWrapper(this.a.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final boolean zzf() {
        return this.a.shouldDelegateInterscrollerEffect();
    }
}
