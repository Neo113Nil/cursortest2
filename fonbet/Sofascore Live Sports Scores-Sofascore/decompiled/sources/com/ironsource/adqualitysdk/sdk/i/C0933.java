package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ogury.sdk.Ogury;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῑ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0933 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3135 = StringFog.decrypt("VtFMeafU8i1W0XFHpsXgIlLR\n", "MbQ4KdWxgUw=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3134 = StringFog.decrypt("Phj9dAQbHxI+CeBJAw4WIywR5V8LDBE=\n", "TX2JPWpvemA=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3133 = StringFog.decrypt("W3TEy+kBjRV+eNTh9jaFF0Rz0efy\n", "KBGwhJl15Hs=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3132 = StringFog.decrypt("KLp6oG+FwWMmsHq5c5TXcDKhPaR0gd4sCLsgtW+Txms1vDW8XIPGaze8IKk=\n", "QdVU0B3gsgI=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3131 = StringFog.decrypt("G2NAjV08JlgmZFWEbiwmWCRkQJE=\n", "Ug006C9PUjE=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3130 = StringFog.decrypt("kWT8bVQDdH+fbvx0SBJibIt/u2lPB2swjWL8VEgSYmyLf7tpTwdrX5t/u2tPEn4=\n", "+AvSHSZmBx4=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3129 = StringFog.decrypt("cAxP48+AEuNRDHLk2okh81EMcOTPnA==\n", "JWUGjbvlYJA=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3128 = StringFog.decrypt("XmgU/rI=\n", "EQ9hjMuRlqg=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3127 = StringFog.decrypt("hi7hu6MWkQ==\n", "1lyEyMJx9IM=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3126 = StringFog.decrypt("aWAnCW8zEHpdeQ==\n", "ORJCeg5UdSk=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3125 = StringFog.decrypt("JYZjgW7pAxYbgGOAfPoPKxyVag==\n", "dfQG8g+OZl8=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3124 = StringFog.decrypt("4e1iV11c/N3f62JWT0/w4Nj+a2ddV/X20Pxs\n", "sZ8HJDw7mZQ=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3123 = StringFog.decrypt("wn/dguaGByviedGf0YgGAf0=\n", "kg248YfhYmQ=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3122 = StringFog.decrypt("rEmqmrHdDIyMT6aHhtMNppN4roW82Aiglw==\n", "/DvP6dC6acM=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3121 = StringFog.decrypt("78flGPMCFNLYzw==\n", "vaKSeYFmXaY=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3120 = StringFog.decrypt("zbgnpjCYxP0=\n", "jNxkyV7+rZo=\n");

    public C0933(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        String mo118 = mo118();
        if (mo118 != null) {
            return mo118.split(StringFog.decrypt("Sw==\n", "ZokwtQ99OBg=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3135, new C0948(this));
        hashMap.put(f3134, new C0947(this));
        hashMap.put(f3133, new C0946(this));
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        switch (str.hashCode()) {
            case -2101347995:
                if (str.equals(f3120)) {
                    return AdConfig.class;
                }
                return null;
            case -1907784110:
                if (str.equals(f3123)) {
                    return PresageOptinVideo.class;
                }
                return null;
            case -1704786309:
                if (str.equals(f3131)) {
                    return InterstitialActivity.class;
                }
                return null;
            case -938422005:
                if (str.equals(f3126)) {
                    return PresageSdk.class;
                }
                return null;
            case -610604286:
                if (str.equals(f3121)) {
                    return RewardItem.class;
                }
                return null;
            case -126768170:
                if (str.equals(f3132)) {
                    return InterstitialActivity.class;
                }
                return null;
            case 76142724:
                if (str.equals(f3128)) {
                    return Ogury.class;
                }
                return null;
            case 698887547:
                if (str.equals(f3125)) {
                    return PresageInterstitial.class;
                }
                return null;
            case 1067648736:
                if (str.equals(f3124)) {
                    return PresageInterstitialCallback.class;
                }
                return null;
            case 1346371759:
                if (str.equals(f3127)) {
                    return Presage.class;
                }
                return null;
            case 1871097647:
                if (str.equals(f3129)) {
                    return io.presage.interstitial.ui.InterstitialActivity.class;
                }
                return null;
            case 2109755994:
                if (str.equals(f3130)) {
                    return io.presage.interstitial.ui.InterstitialActivity.class;
                }
                return null;
            case 2128976055:
                if (str.equals(f3122)) {
                    return PresageOptinVideoCallback.class;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final String mo118() {
        try {
            try {
                return (String) Class.forName(StringFog.decrypt("elOAYlxa6AJ0WYBxQVL2DH0Sx3QAafoAe1nce0Bb7gtySdpWQUr5EF5TwGZKcOk=\n", "EzyuEi4/m2M=\n")).getMethod(StringFog.decrypt("lQ==\n", "9MqBztbBv/0=\n"), null).invoke(null, null);
            } catch (Exception unused) {
                return PresageSdk.getAdsSdkVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
