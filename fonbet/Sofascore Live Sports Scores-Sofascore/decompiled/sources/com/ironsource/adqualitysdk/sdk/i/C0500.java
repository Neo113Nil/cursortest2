package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڑ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0500 extends C0464 {

    /* renamed from: ﺟ, reason: contains not printable characters */
    public static final String f1615 = StringFog.decrypt("z2Q4Wnl34Nv3ZyU=\n", "mQFKKRAYjpI=\n");

    public C0500(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0464, com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        return MobileAds.getVersion().toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0464, com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        return (str.hashCode() == -1938329210 && str.equals(f1615)) ? VersionInfo.class : super.mo117(str);
    }
}
