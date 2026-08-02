package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerView;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˌ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0325 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f800 = StringFog.decrypt("V8KEAd2Kt79iz6cGwIc=\n", "FqbRb7T+9tw=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f799 = StringFog.decrypt("USlPNxcfokhLdUY3ERS5SlslR2pMEK9PHCdGbAwYvxJzInd3CwWKX0YvVHAWCA==\n", "MkYiGWJxyzw=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f798 = StringFog.decrypt("a7PlnPi0R+JMpQ==\n", "KdKL8p3GEYs=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f797 = StringFog.decrypt("IOURgadzAx86uRiBoXgYHSrpGdz8fwsFLe8O3PxfCwUt7w75u3gd\n", "Q4p8r9Idams=\n");

    public C0325(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        String version = UnityAds.getVersion();
        if (version != null) {
            return version.split(StringFog.decrypt("2g==\n", "9zfjTF7qK3A=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        return new HashMap();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        int hashCode = str.hashCode();
        if (hashCode == 252148886) {
            if (str.equals(f800)) {
                return AdUnitActivity.class;
            }
            return null;
        }
        if (hashCode == 961844241) {
            if (str.equals(f798)) {
                return BannerView.class;
            }
            return null;
        }
        if (hashCode == 1067215379) {
            if (str.equals(f797)) {
                return BannerView.class;
            }
            return null;
        }
        if (hashCode == 1531208100 && str.equals(f799)) {
            return AdUnitActivity.class;
        }
        return null;
    }
}
