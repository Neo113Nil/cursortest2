package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.monetization.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p0 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f227 = StringFog.decrypt("RPL6PO8ZGDNX3uo=\n", "I5eOfYtMdlo=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f226 = StringFog.decrypt("MNrNHr55Lmsj3g==\n", "V7+5TN8Oago=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f225 = StringFog.decrypt("gZUrRAS70nq3hjp8GZPeZoaVMXcf\n", "8vBfEm3ftxU=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f224 = StringFog.decrypt("ngtxV8kyoNiLHXF30yi10bAAY3E=\n", "+W4FHqdB1L0=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f223 = StringFog.decrypt("4iFyTjgVnozhBWtzKAyL\n", "hUQGHF1i//4=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f222 = StringFog.decrypt("yV4Rv8BOTwzKbxydwA==\n", "rjtl7aU5Ln4=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f221 = StringFog.decrypt("TABRWa4rx3pPAEFKrxXIbkQ=\n", "K2UlC8tcpgg=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f220 = StringFog.decrypt("fKjylaF+4adrqOKGoEz2sGG5yq63feW7ar8=\n", "D82Gx8QJgNU=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f219 = StringFog.decrypt("h912KXwe1nqHzGsUewvfSZD9dAV8Hv9hh8xnDncY\n", "9LgCYBJqswg=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f218 = StringFog.decrypt("HPjTEw+AIao99Ms7P5Yk\n", "e52nXmrkSMs=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f217 = StringFog.decrypt("zCjrUp2Ech3qKdJhkIl2NMIh+g==\n", "q02fBPTgF3I=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f216 = StringFog.decrypt("DiELIveNOiAoIDYa+IY=\n", "aUR/dJ7pX08=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f215 = StringFog.decrypt("+keMiW9V0uv7Y5yOeF7S+sVLi79rVdn8\n", "iSL4yw47vI4=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f214 = StringFog.decrypt("3CDpKTYEl4LpPQ==\n", "nUSoSkJt4es=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f213 = StringFog.decrypt("dXTFlO7SJY9zY4bX+NEih3M1yd7knSiEe3bH1LnyL6p1b8HM/scy\n", "FhuoupezS+s=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f212 = StringFog.decrypt("P70PyWKu\n", "ftlGpwTBzB0=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f211 = StringFog.decrypt("sgYBmSo07lmH\n", "82JT/FtBiyo=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f210 = StringFog.decrypt("CNUFBdKl\n", "SbFRfKLAm8k=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f209 = StringFog.decrypt("v+A/yWlXRj2Z4wvaeEU=\n", "9o1PuwwkNVQ=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f208 = StringFog.decrypt("rA/08zpqChSS\n", "4WCWmlYPS3A=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f207 = StringFog.decrypt("U3rzGDdBQsdxYfgRNGdf\n", "BROXfVgCLak=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f206 = StringFog.decrypt("RRwYmmm4tC59ATCWdYmnJXYH\n", "E3V8/wb9wks=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f205 = StringFog.decrypt("iO+A5d7a/3aP+Ivlz+TXYb7rgO7J\n", "yo7ui7uovhI=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f204 = StringFog.decrypt("3wQWEcT3iEjLDB0I\n", "nWV4f6GFySw=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f203 = StringFog.decrypt("UF/YonYP4WBWSJvhYAzmaFYe1Oh8QO1lXV7Q/iEs7mpdVcfNazjmYUQ=\n", "MzC1jA9ujwQ=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f202 = StringFog.decrypt("PweD200mRBcCAJbSfjE=\n", "dmn3vj9VMH4=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f201 = StringFog.decrypt("9Fyvy2HL+SvJW7rCUtzINNhcr+J6y/kn01ep\n", "vTLbrhO4jUI=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f200 = StringFog.decrypt("hqf0m9Yh\n", "1MKD+qRFqvw=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f199 = StringFog.decrypt("dq1CQ604NDZlrA==\n", "JMg1It9cUVI=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f198 = StringFog.decrypt("VGEKdIFsQH1HYDhjlmZRVW93CXCdbVc=\n", "BgR9FfMIJRk=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f197 = StringFog.decrypt("szUb8xC2BnGJPQb0HpQJbYwvC/MRkhA=\n", "5Vx/ln/3YiE=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f196 = StringFog.decrypt("woxTBuemuzzq\n", "j+k3b4bg0lA=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f195 = StringFog.decrypt("jNMLg9zW1Q==\n", "2rpv5rOXsa8=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f194 = StringFog.decrypt("QubBPje7Se5k4g==\n", "EIO2X0XfDY8=\n");

    public p0(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        return MobileAds.getLibraryVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f227, new g0(this));
        hashMap.put(f226, new h0(this));
        hashMap.put(f225, new i0(this));
        hashMap.put(f224, new j0(this));
        hashMap.put(f223, new k0(this));
        hashMap.put(f222, new l0(this));
        hashMap.put(f221, new m0(this));
        hashMap.put(f220, new n0(this));
        hashMap.put(f219, new o0(this));
        hashMap.put(f218, new c0(this));
        hashMap.put(f217, new d0(this));
        hashMap.put(f216, new e0(this));
        hashMap.put(f215, new f0(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -1850459313:
                if (str.equals(f200)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1836618638:
                if (str.equals(f214)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1666698098:
                if (str.equals(f208)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1401317165:
                if (str.equals(f206)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1338246468:
                if (str.equals(f203)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1139615429:
                if (str.equals(f213)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1115843213:
                if (str.equals(f209)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -650052115:
                if (str.equals(f197)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -610771047:
                if (str.equals(f194)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f199)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -572702516:
                if (str.equals(f211)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -564429827:
                if (str.equals(f198)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -150968480:
                if (str.equals(f196)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 308060116:
                if (str.equals(f204)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f202)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 871099991:
                if (str.equals(f207)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 957243679:
                if (str.equals(f205)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1228411167:
                if (str.equals(f201)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1955530641:
                if (str.equals(f212)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1955869213:
                if (str.equals(f210)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2117435870:
                if (str.equals(f195)) {
                    c = 19;
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
            case 1:
                return AdActivity.class;
            case 2:
                return AdInfo.class;
            case 3:
                return AdRequest.class;
            case 4:
                return AdType.class;
            case 5:
                return ImpressionData.class;
            case 6:
                return MobileAds.class;
            case 7:
            case '\b':
                return BannerAdView.class;
            case '\t':
                return VideoController.class;
            case '\n':
                return VideoEventListener.class;
            case 11:
                return BannerAdEventListener.class;
            case '\f':
                return InterstitialAd.class;
            case '\r':
                return InterstitialAdEventListener.class;
            case 14:
                return Reward.class;
            case 15:
                return RewardedAd.class;
            case 16:
                return RewardedAdEventListener.class;
            case 17:
                return VideoAdPlaybackListener.class;
            case 18:
                return MediaFile.class;
            case 19:
                return VideoAd.class;
            case 20:
                return RewardData.class;
            default:
                return null;
        }
    }
}
