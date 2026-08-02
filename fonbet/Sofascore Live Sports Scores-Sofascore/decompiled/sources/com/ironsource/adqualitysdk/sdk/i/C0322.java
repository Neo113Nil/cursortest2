package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsBaseOptions;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerHide;
import com.unity3d.services.banners.BannerShow;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.UnityBanners;
import com.unity3d.services.banners.api.Banner;
import com.unity3d.services.banners.api.BannerListener;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.banners.properties.BannerProperties;
import com.unity3d.services.banners.view.BannerEvent;
import com.unity3d.services.banners.view.BannerPosition;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.monetization.UnityMonetization;
import com.unity3d.services.monetization.placementcontent.ads.ShowAdListenerAdapter;
import com.unity3d.services.monetization.placementcontent.core.CustomEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0322 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f780 = StringFog.decrypt("ZGCfXPNlnw1tcbx65EGEDXREm28=\n", "AwXrH4YX7Wg=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f779 = StringFog.decrypt("WVtRdLSiiRRtTFZDqaKqF0pZ\n", "Oik0FcDH3VY=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f778 = StringFog.decrypt("3d44U1iAd9XAzxt1T6Rs1dn6PGA=\n", "rrtMEC3yBbA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f777 = StringFog.decrypt("VxozB3Ls9zxU\n", "MH9HQBOBknU=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f776 = StringFog.decrypt("mufLVxrI95u85sxOHdL3h5PnzQ==\n", "/YK/AnShg+I=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f775 = StringFog.decrypt("sei3/Jj8iQWD6bDln+aJGazosQ==\n", "wo3DqfaV/Xw=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f774 = StringFog.decrypt("MkQq97cBeMApVT7ZpRdhxzNVIvakFg==\n", "QCFHmMFkLa4=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f773 = StringFog.decrypt("eniKikTz6fVaeJ2TQ+np6XV5nA==\n", "Gxzu3yqanYw=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f772 = StringFog.decrypt("QWuGiwPDJGBDebeqA88GSkd6l7sJ0ws=\n", "Jg7y3Gahcgk=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f771 = StringFog.decrypt("2IIfjcvjMSDOkg6p2sQVINGT\n", "v+dr2q6BY0U=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f770 = StringFog.decrypt("ZvnGHNv4+99s+dw4/v0=\n", "AZyyTLeZmLo=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f769 = StringFog.decrypt("jPWAkH3RhQyZ3J2haNqFDJk=\n", "65D00hy/62k=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f768 = StringFog.decrypt("sjDFV7aJBy+zGdhmo4IHL7M=\n", "wVWxFdfnaUo=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f767 = StringFog.decrypt("txwzoP8Vkz23HDOg/xWTPQ==\n", "4nJa1IZU904=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f766 = StringFog.decrypt("Vu4YRN2JqCZK1R9Z0LGNMXDMGEPQraIwcQ==\n", "A4BxMKTIzFU=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f765 = StringFog.decrypt("L6V6Vv2v7b8znn1L8JfIqAmOa1bhgO2pHod6UfCL56kI\n", "essTIoTuicw=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f764 = StringFog.decrypt("Egm+6kxLoSkQArXIXG+yGzcX\n", "R2fXnjUKxVo=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f763 = StringFog.decrypt("DGB2laSI3SsvY1GA\n", "WCIh8MbetE4=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f762 = StringFog.decrypt("rnf1d2D/dRCKZtJTYOB0\n", "+RKXJQWOAHU=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f761 = StringFog.decrypt("A9Y1rfndVJ4i1jmP09lXvjPcJYI=\n", "VLNX+5C4I9s=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f760 = StringFog.decrypt("ooec56uyoNeSnZzps4um1pk=\n", "9+n1k9L/z7k=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f759 = StringFog.decrypt("3n1u/nfFenn+YWTnU9N3dOxldexE\n", "jRUBiTahNhA=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f758 = StringFog.decrypt("ClBM4ibuBmgsS0s=\n", "SSU/lkmDQx4=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f757 = StringFog.decrypt("CK40uPobr6Isvw==\n", "X8tW6p9q2sc=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f756 = StringFog.decrypt("0BB3KGLRf+zSG3wKcvVs\n", "hX4eXBuQG58=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f755 = StringFog.decrypt("THidvQX8jo15db66GPE=\n", "DRzI02yIz+4=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f754 = StringFog.decrypt("cfAIP10F\n", "M5FmUTh3ry4=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f753 = StringFog.decrypt("xoV7oYhKrlT9jmCm\n", "k+sS1fEIzzo=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f752 = StringFog.decrypt("jrPlsHLQEhy1uP6XYugW\n", "292MxAuSc3I=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f751 = StringFog.decrypt("jkydGvPjePujWg==\n", "zC3zdJaRK5M=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f750 = StringFog.decrypt("SBMKmd+eYfpuFw==\n", "CnJk97rsKZM=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f749 = StringFog.decrypt("a3B5yQ8TcOlMf2M=\n", "KREXp2phNZ8=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f748 = StringFog.decrypt("psw5jL9NZ3iX2TKMv00=\n", "5K1X4to/KxE=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f747 = StringFog.decrypt("UTHt07ZCPHR8NPbRtnMgV3U55MihUTtQfD4=\n", "E1CDvdMwTzk=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f746 = StringFog.decrypt("f83hiK1gVd9S3OqUvHtg3g==\n", "PayP5sgSBa0=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f745 = StringFog.decrypt("EFFrqDbapfQhWXGvPMY=\n", "UjAFxlOo9Zs=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f744 = StringFog.decrypt("yy1X+7aeAlbrHFX0qokncOYiTfS6gjBB\n", "iUw5ldPsVTM=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f743 = StringFog.decrypt("dmaZc+oNK5ZGaIVe4BsL\n", "NAf3HY9/buQ=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f742 = StringFog.decrypt("IH1D4CQTf8AQc1/HLwdV\n", "YhwtjkFhOrI=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f741 = StringFog.decrypt("dSIB14IJ5UBSNA==\n", "N0Nvued7syk=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f740 = StringFog.decrypt("sC7N38aU+BeqcsTfwJ/jFboixYKdmPANvSTSgp248A29JNKn2p/m\n", "00Gg8bP6kWM=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f739 = StringFog.decrypt("Efcar635SIY24TutrA==\n", "U5Z0wciLHu8=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f738 = StringFog.decrypt("56lSnZAd3xv99VudlhbEGe2lWsDLEdcB6qNNwMsF3wrz6H3Six3THdKvWsQ=\n", "hMY/s+Vztm8=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f737 = StringFog.decrypt("U09gJK38Uzp0WU0rq+Zg\n", "ES4OSsiOBVM=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f736 = StringFog.decrypt("so1mJONDQ9eVtm0/21Nywp62bT8=\n", "+9gITZc6AbY=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f735 = StringFog.decrypt("i/QB6e4/B8+s4ibL4j4lw6fwHQ==\n", "yZVvh4tNUaY=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f734 = StringFog.decrypt("b3BBNLOL429IZmMzpY3QaEhj\n", "LREvWtb5tQY=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f733 = StringFog.decrypt("pcY0HlOB3H6G3Q8XQrTHfpT3MQFQjs9i\n", "47NYciDirhs=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f732 = StringFog.decrypt("AVk+35dmkW4bBTffg2yLNANSI52DcZ1oTHAmnY5bm2gHUz2mh2qucwdBF5iReJR7Gw==\n", "YjZT8eII+Bo=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f731 = StringFog.decrypt("WZ6mNo5242k=\n", "GPrpVOQTgB0=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f730 = StringFog.decrypt("q1+BD9grVfmfXYkO1DBU2oRmgB/hK1TIq1W1EdY7VM0=\n", "6jHlfbdCMb8=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f729 = StringFog.decrypt("r1lqOAe2MEq2WGIoMYcgUJVZcA==\n", "+jcDTH73VDk=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f728 = StringFog.decrypt("pXU7ZiRBAJmyeiF3EnAQg591IQ==\n", "8BtSEl0AZOo=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f727 = StringFog.decrypt("6kQ0DxMTWh4=\n", "qyByYGF+O2o=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f726 = StringFog.decrypt("wHuyS/D/hdvsZ75c6uKw2g==\n", "gxfbLp6L1ak=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f725 = StringFog.decrypt("RyaC9YCMDtNqLKbki40J\n", "A0/jku7jfac=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f724 = StringFog.decrypt("WoPvkgYBHYBghemUBTQ1l2ez754A\n", "E9aB+3J4XOQ=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f723 = StringFog.decrypt("W5EMBdJXpMZIgRYj1l6C0A==\n", "PPR4SqIny7Q=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f722 = StringFog.decrypt("J77FE0yaqM8tvt83aZ+N2C+28CdvmaHPI68=\n", "QNuxQyD7y6o=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f721 = StringFog.decrypt("ZW/t80mHR1hyfvDQSJU=\n", "AgqZvybmIxc=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f720 = StringFog.decrypt("CB5DdVRyUw==\n", "b3s3MTUGMmA=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f719 = StringFog.decrypt("FoB3B7LUvtYVo3Evvvq39hSLdxCh1qv6A5FqJaA=\n", "ceUDQNO5258=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f718 = StringFog.decrypt("4cdy3vu/Pxzrx2j63roaC+nPQuf2uTIW9dZv7dKoORfy\n", "hqIGjpfeXHk=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f717 = StringFog.decrypt("hUK40PGwXfCFc63k9g==\n", "4ifMg4XCNJ4=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f716 = StringFog.decrypt("YY5a8f+LNPlvhUnx4oEy/A==\n", "BusupY3qV5I=\n");

    public C0322(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        String version = UnityAds.getVersion();
        if (version != null) {
            return version.split(StringFog.decrypt("zg==\n", "46AUtgh9QL4=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f780, new C0819(this));
        hashMap.put(f779, new C0434(this));
        hashMap.put(f778, new C0310(this));
        hashMap.put(f777, new C1194(this));
        hashMap.put(f776, new C1078(this));
        hashMap.put(f775, new C0628(this));
        hashMap.put(f773, new C0627(this));
        hashMap.put(f774, new C0477(this));
        hashMap.put(f772, new C0330(this));
        hashMap.put(f771, new C0319(this));
        hashMap.put(f770, new C0305(this));
        hashMap.put(f769, new C0304(this));
        hashMap.put(f768, new C1161(this));
        hashMap.put(f723, new C1084(this));
        hashMap.put(f722, new C1080(this));
        hashMap.put(f721, new C0949(this));
        hashMap.put(f720, new C0863(this));
        hashMap.put(f719, new C0850(this));
        hashMap.put(f718, new C0844(this));
        hashMap.put(f717, new C0485(this));
        hashMap.put(f716, new C0450(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2043984616:
                if (str.equals(f744)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -2015334886:
                if (str.equals(f727)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case -1797664962:
                if (str.equals(f760)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1769924254:
                if (str.equals(f731)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -1719935914:
                if (str.equals(f739)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1673897431:
                if (str.equals(f743)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1673719574:
                if (str.equals(f742)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1627944928:
                if (str.equals(f748)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1543737546:
                if (str.equals(f767)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1347165098:
                if (str.equals(f763)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1258512514:
                if (str.equals(f726)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -1251710408:
                if (str.equals(f738)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -858834302:
                if (str.equals(f752)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -800280637:
                if (str.equals(f747)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -618035586:
                if (str.equals(f756)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -598903877:
                if (str.equals(f759)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -553681069:
                if (str.equals(f730)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -327500225:
                if (str.equals(f761)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -324825325:
                if (str.equals(f725)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -324012869:
                if (str.equals(f757)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -262912338:
                if (str.equals(f749)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -249507173:
                if (str.equals(f732)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -133620343:
                if (str.equals(f758)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -30759555:
                if (str.equals(f766)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 29694293:
                if (str.equals(f724)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 67119908:
                if (str.equals(f733)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 252148886:
                if (str.equals(f755)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 539301490:
                if (str.equals(f728)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 626721475:
                if (str.equals(f764)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 692588017:
                if (str.equals(f737)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 819533772:
                if (str.equals(f736)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 961427118:
                if (str.equals(f750)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 961754217:
                if (str.equals(f751)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f741)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1067215379:
                if (str.equals(f740)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1246120607:
                if (str.equals(f762)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1326268204:
                if (str.equals(f735)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1374920114:
                if (str.equals(f753)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1407526303:
                if (str.equals(f746)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1646468069:
                if (str.equals(f734)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1658279126:
                if (str.equals(f765)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1982491468:
                if (str.equals(f754)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2020034237:
                if (str.equals(f729)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 2068667541:
                if (str.equals(f745)) {
                    c = 22;
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
                return UnityAds.class;
            case 1:
                return IUnityAdsListener.class;
            case 2:
                return IUnityAdsExtendedListener.class;
            case 3:
                return WebViewApp.class;
            case 4:
                return C0326.class;
            case 5:
                return WebRequestEvent.class;
            case 6:
                return WebViewEventCategory.class;
            case 7:
                return UnityMonetization.class;
            case '\b':
                return ShowAdListenerAdapter.class;
            case '\t':
                return CustomEvent.class;
            case '\n':
                return WebView.class;
            case 11:
                return WebRequest.class;
            case '\f':
                return AdUnitActivity.class;
            case '\r':
                return Banner.class;
            case 14:
                return UnityBanners.class;
            case 15:
                return UnityBannerSize.class;
            case 16:
                return BannerShow.class;
            case 17:
                return BannerHide.class;
            case 18:
                return BannerEvent.class;
            case 19:
                return BannerListener.class;
            case 20:
                return BannersModuleConfiguration.class;
            case 21:
                return BannerProperties.class;
            case 22:
                return BannerPosition.class;
            case 23:
                return BannerWebPlayerContainer.class;
            case 24:
                return BannerErrorCode.class;
            case 25:
                return BannerErrorInfo.class;
            case 26:
            case 27:
                return BannerView.class;
            case 28:
                return BannerViewCache.class;
            case 29:
                return IUnityBannerListener.class;
            case 30:
                return BannerView.IListener.class;
            case 31:
                return BannerView.Listener.class;
            case ' ':
            case '!':
                return com.unity3d.services.banners.view.BannerView.class;
            case '\"':
            case '#':
                return FullScreenWebViewDisplay.class;
            case '$':
                return AdObject.class;
            case '%':
                return AndroidFullscreenWebViewAdPlayer.class;
            case '&':
                return UnityAdsLoadOptions.class;
            case '\'':
                return UnityAdsBaseOptions.class;
            case '(':
                return AdFormat.class;
            case ')':
                return ClientProperties.class;
            case '*':
                return DiagnosticEventRequestOuterClass.DiagnosticEvent.class;
            case '+':
                return IUnityAdsShowListener.class;
            default:
                return null;
        }
    }
}
