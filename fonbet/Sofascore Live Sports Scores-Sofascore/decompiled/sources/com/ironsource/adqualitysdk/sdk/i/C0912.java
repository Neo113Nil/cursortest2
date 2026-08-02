package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἰ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0912 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3057 = StringFog.decrypt("bE/Zxsb0EXtsXsT7weEYSHtmxPzc5RpsbQ==\n", "Hyqtj6iAdAk=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3056 = StringFog.decrypt("0aPncs/zdirGo/dhzsh+K9aj/UXY\n", "osaTIKqEF1g=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3055 = StringFog.decrypt("qnxsdhYn0CawPWA8VynLIKxhciwQNMw1pT10MVcJyyCsYXIsEDTMNaVSYiwQNswgsA==\n", "yRMBWHlApVQ=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3054 = StringFog.decrypt("7h79gBBgHb7TGeiJI3AdvtEZ/Zw=\n", "p3CJ5WITadc=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3053 = StringFog.decrypt("7rDVonw=\n", "odeg0AWclcY=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3052 = StringFog.decrypt("h/WhrUXxoOut4KerVcyn/qTTsA==\n", "yJLU3zy4zp8=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3051 = StringFog.decrypt("WbHfMwoUnc1zpNk1Gima2HqXzg0aLofceLPY\n", "FtaqQXNd87k=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3050 = StringFog.decrypt("nwbXXHCBlWixE8ZLbZKU\n", "0GGiLgnT8B8=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3049 = StringFog.decrypt("BL6CssV1S2kqq5Ol2GZKUiKqg6XSQlw=\n", "S9n3wLwnLh4=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3048 = StringFog.decrypt("i74RWOpPfoylqwA=\n", "xNlkKpMdG/s=\n");

    public C0912(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        try {
            return Ogury.getSdkVersion();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3057, new C0929(this));
        hashMap.put(f3056, new C0913(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        switch (str.hashCode()) {
            case -1704786309:
                if (str.equals(f3054)) {
                    return InterstitialActivity.class;
                }
                return null;
            case -734879533:
                if (str.equals(f3048)) {
                    return OguryReward.class;
                }
                return null;
            case 76142724:
                if (str.equals(f3053)) {
                    return Ogury.class;
                }
                return null;
            case 82913255:
                if (str.equals(f3051)) {
                    return OguryInterstitialAdListener.class;
                }
                return null;
            case 186993737:
                if (str.equals(f3049)) {
                    return OguryRewardedAdListener.class;
                }
                return null;
            case 1169123445:
                if (str.equals(f3050)) {
                    return OguryRewardedAd.class;
                }
                return null;
            case 1789379091:
                if (str.equals(f3052)) {
                    return OguryInterstitialAd.class;
                }
                return null;
            case 1866202823:
                if (str.equals(f3055)) {
                    return InterstitialActivity.class;
                }
                return null;
            default:
                return null;
        }
    }
}
