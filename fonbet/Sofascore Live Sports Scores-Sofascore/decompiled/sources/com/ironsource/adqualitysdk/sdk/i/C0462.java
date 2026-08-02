package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ק, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0462 extends AbstractC0706 {
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0706
    /* renamed from: ﻛ */
    public final String mo119() {
        return StringFog.decrypt("I10xuzUJNx0sV3L0PAIqFSlWcvI/FXYbJEFy2D0EMRYlczjm\n", "QDJclVJmWHo=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0706
    /* renamed from: ｋ */
    public final Class mo120() {
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0706
    /* renamed from: ﾇ */
    public final String mo122() {
        return StringFog.decrypt("dSHbJrk=\n", "FEW2SdvRInM=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0706
    /* renamed from: ﾒ */
    public final AbstractC0433 mo121() {
        try {
            if (Prode.class.getName().equals("com.ironsource.adqualitysdk.sdk.i.Prode")) {
                Class.forName(StringFog.decrypt("SS4IcNWrtVhGJEs/3KCoUEMlSznft/ReTjJLCNe2qVZFLyww1Ks=\n", "KkFlXrLE2j8=\n"));
            }
            return new C0500(StringFog.decrypt("dSHbJrk=\n", "FEW2SdvRInM=\n"));
        } catch (Throwable unused) {
            return new C0464(StringFog.decrypt("dSHbJrk=\n", "FEW2SdvRInM=\n"));
        }
    }
}
