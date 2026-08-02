package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾋ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1181 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3745 = StringFog.decrypt("7vYSIn0H7OXk9ggGWALJ8ub+JxZHD+r3\n", "iZNmchFmj4A=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3744 = StringFog.decrypt("k9sOQBK8UO+Z2xRkN7l1+JvTO3Q=\n", "9L56EH7dM4o=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3743 = StringFog.decrypt("t5oX3R/b7Zewmg35CQ==\n", "xP9jnHuXhOQ=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3742 = StringFog.decrypt("zQXTWvOV8inEA8JV44XsI9gL5njymO0l3hnxcuOGzzXaBex+/w==\n", "qmCnG4bxm0w=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3741 = StringFog.decrypt("OVLbaCGEs4IwVMpnMZStiCxc7kogiayOKk7qRzCju5U6es5bP5WqrDtO\n", "XjevKVTg2uc=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3740 = StringFog.decrypt("BysFgYlQWeEHOhi8hkh99zgnAryCSlnh\n", "dE5xyOckPJM=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3739 = StringFog.decrypt("rN3YdMecHQWi2+Bf35YZGg==\n", "y7isML7yfGg=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3738 = StringFog.decrypt("1cxpR07jJ07fzHNjdvs0Tg==\n", "sqkdFyKCRCs=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3737 = StringFog.decrypt("vYxTBCf0D2KQn0IMJfQaRImbVw4b8ChIk59G\n", "3v42ZVORWyA=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3736 = StringFog.decrypt("CpM=\n", "S/fdUUsQk2c=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3735 = StringFog.decrypt("AX8z3cUT36ky\n", "QBtyuaRjq8w=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3734 = StringFog.decrypt("HXLUoBzEwg==\n", "XBaR0m6rsEg=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3733 = StringFog.decrypt("eTGTWREn/FVdJw==\n", "OFXfMGJTmTs=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3732 = StringFog.decrypt("+h4f5CUo\n", "u3pJjUBfkds=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3731 = StringFog.decrypt("P3HwdDF+vTk+cfIxeX66L3Jf+Qw+eqk=\n", "XB6dWlcf3lw=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3730 = StringFog.decrypt("Z03llXdW38VDR8Gtb0Xf\n", "Jim1+RY1uqg=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3729 = StringFog.decrypt("TWxiLgog68dtRn4wEjP96mVgYw==\n", "CQURXmZBkoY=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3728 = StringFog.decrypt("ejOTlkNL4h91I4OISVfqO1gynolPUfg=\n", "O0b3/yYlgXo=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3727 = StringFog.decrypt("Sq8DbEpTpotLrwEpAlOhnQeBGyZFV6uNTI4LNltdt4VooxorWluxlw==\n", "KcBuQiwyxe4=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3726 = StringFog.decrypt("nFC+AaX+7AihV6sIlunUCKZKrwqy/w==\n", "1T7KZNeNmGE=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3725 = StringFog.decrypt("Rvo/k+baPA17/Sqa1c0=\n", "D5RL9pSpSGQ=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3724 = StringFog.decrypt("Hx8nd9OIcm0bEzRzzq1zRSQJJHPPiWU=\n", "TXpQFqHsFwk=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3723 = StringFog.decrypt("en+STxCxydd+c4FLDZTI\n", "KBrlLmLVrLM=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3722 = StringFog.decrypt("ZqbsmHCE1WRNvuacb6vXS1aw8IA=\n", "It+C+R3ttig=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3721 = StringFog.decrypt("aTN6/Gj0vmJlM33w\n", "J1IOlR6R/wY=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3720 = StringFog.decrypt("FQMWwLAKe0Q1DAfbhws=\n", "W2JiqcZvOSU=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3719 = StringFog.decrypt("wCM6d9s3zoE=\n", "jkJOHq1Sj+U=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3718 = StringFog.decrypt("1qaCXme+/93OrpNA\n", "mMf2NxHbvrk=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3717 = StringFog.decrypt("aN7mIieax/Bq1uE/NJHj5g==\n", "Jr+SS1H/hpQ=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3716 = StringFog.decrypt("vOKHyGjsJg2v+ZrMb+U0DKnikNw=\n", "/4v1qx2AR38=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3715 = StringFog.decrypt("oCYi7wxNpBy1ADvrGU+aGIcMIe8I\n", "9GRsjngk0nk=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3714 = StringFog.decrypt("WdRN4jR2i4p0303iK0C0hHvaSeYq\n", "Fbsug1g0+eU=\n");

    public C1181(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        try {
            try {
                try {
                    return (String) C0267.m139().f488.m463(AdSdkVersion.class, String.class).get(null);
                } catch (Throwable unused) {
                    return null;
                }
            } catch (Throwable unused2) {
                return (String) C0267.m139().f488.m463(AdSdkVersion.class, String.class).get(null);
            }
        } catch (Throwable unused3) {
            C1050 c1050 = C0267.m139().f487;
            String decrypt = StringFog.decrypt("U8Ce0rOfHoMmstA=\n", "DZz6ie/7MN4=\n");
            c1050.getClass();
            return C1050.m621((Object) null, BuildConfig.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3745, new C0284(this));
        hashMap.put(f3744, new C0266(this));
        hashMap.put(f3743, new C0265(this));
        hashMap.put(f3742, new C0246(this));
        hashMap.put(f3741, new C0239(this));
        hashMap.put(f3740, new C0234(this));
        hashMap.put(f3739, new C0231(this));
        hashMap.put(f3738, new C1191(this));
        hashMap.put(f3737, new C1190(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(f3717)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1585374524:
                if (str.equals(f3724)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1513928064:
                if (str.equals(f3727)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1256969519:
                if (str.equals(f3716)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -501313640:
                if (str.equals(f3722)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(f3726)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -105717264:
                if (str.equals(f3723)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f3736)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 289409084:
                if (str.equals(f3730)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f3725)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 435867927:
                if (str.equals(f3714)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 488344453:
                if (str.equals(f3734)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 535330969:
                if (str.equals(f3728)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 553704929:
                if (str.equals(f3729)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1165508119:
                if (str.equals(f3733)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1237162638:
                if (str.equals(f3715)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1476063628:
                if (str.equals(f3735)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1838933446:
                if (str.equals(f3720)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1908493505:
                if (str.equals(f3731)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1955913096:
                if (str.equals(f3732)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2035065003:
                if (str.equals(f3721)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2035668095:
                if (str.equals(f3718)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2110329530:
                if (str.equals(f3719)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case '\b':
                return InterstitialAdListener.class;
            case '\t':
                return InterstitialAd.class;
            case '\n':
                return RewardedVideoAdListener.class;
            case 11:
                return RewardedVideoAd.class;
            case '\f':
            case '\r':
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                return CircularProgressView.class;
            case 21:
                return C1185.class;
            case 22:
                int i = AbstractC0655.f2248;
                String decrypt = StringFog.decrypt("Z46k3SD1F8gojK/MLvARwmmBpMwu7wfdZ46hyCruXdNpjrTKIehd/GmDocMN7hzRYoOh3DvREt5n\nh6Xd\n", "BuDAr0+cc7A=\n");
                String str2 = AbstractC0816.f2624;
                try {
                    return Class.forName(decrypt);
                } catch (Throwable unused) {
                    return null;
                }
            default:
                return null;
        }
    }
}
