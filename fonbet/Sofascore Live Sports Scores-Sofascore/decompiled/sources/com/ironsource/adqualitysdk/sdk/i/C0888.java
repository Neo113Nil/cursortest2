package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṝ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0888 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2950 = StringFog.decrypt("e5TVKMWyv2l9l8cWw5+JcXmS1SrSvJg=\n", "HPGhf6DQ6xs=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2949 = StringFog.decrypt("Ic2Zt/tr3Q4FyY6Q+E7UFSXDuZDvYs0bLv2flA==\n", "Rqjt+J0NuHw=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2948 = StringFog.decrypt("z9szw0bn\n", "h6JDsQu/p+8=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2947 = StringFog.decrypt("h4QbwTEJwluhiRncED3kRg==\n", "z/1rs3xRgTQ=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2946 = StringFog.decrypt("ptlID0dceKWC4VAcRw==\n", "9rUpbCIxHcs=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2945 = StringFog.decrypt("Ggo=\n", "W26SfZYYFUc=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f2944 = StringFog.decrypt("RW2JlQAi/N9icbGfAiL8ww==\n", "AQj58G5GmbE=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f2943 = StringFog.decrypt("bsAQCh3LnDNa5BQVBu6ZIl8=\n", "PrJ1ZnKq+FY=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f2942 = StringFog.decrypt("mGcO5SaUhKS/bhvlH6WxpQ==\n", "0B5+l2vM1NY=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f2941 = StringFog.decrypt("5T1LelOa02DPElJtaZXtccUHV2dto+ZpyApaflyj9g==\n", "rUQ7CB7ChAU=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f2940 = StringFog.decrypt("eUk9C2MsXcl3Xn5EZTFf1HNCflZvPgPcaEcgTWI2XpVSXyBXRg163nhwOUB8AkTPcmU8Sng0T9d/\naDFTSTRf\n", "GiZQJQtVLbs=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f2939 = StringFog.decrypt("+JIfZz2Q/Pn/jQlwArvz9cSCGXwEsQ==\n", "sOtvFXDIspY=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f2938 = StringFog.decrypt("5e02y7TJXmHr+nWEstRcfO/mdZa42wBy5fYyk7XEVz3O+yuXkehgfMnkPYCuw29w8ustjKjJ\n", "hoJb5dywLhM=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f2937 = StringFog.decrypt("sHPBrxPgPZSeb8OLN90Fl4pL0qk3zhuGgQ==\n", "+Aqx3V64cvI=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2936 = StringFog.decrypt("sS29V4yE1xm/Ov4YipnVBLsm/gqAlokKsTa5D42J3kWaO6ALqaXoDbQnoi+NmNAOoAOzDY2Lzh+r\n", "0kLQeeT9p2s=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2935 = StringFog.decrypt("Xco6vd6rie9kxiO99peS5HPcOKLyh7Lle/Ipu/qFsv5s\n", "FbNKz5Pz24o=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f2934 = StringFog.decrypt("SGcqvp4eUSZGcGnxmANTO0JsaeOSDA81SHwu5p8TWHpjcTfiuz9zMVp9LuKTA2g6TWc1/ZcTSDtF\nSSTknxFIIFI=\n", "KwhHkPZnIVQ=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f2933 = StringFog.decrypt("h6G8slFgmI28vZqpeU+Zg6Gsvq9wVL+e\n", "z9jMwBw42uw=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2932 = StringFog.decrypt("qNi5t17EzeiT1Z+sduvY5o7Vu6p/8P77\n", "4KHJxROcm4k=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2931 = StringFog.decrypt("ldFWehIL9Xy//FRpOTXLeovBQ38cPMxtr8dKZDoh\n", "3agmCF9Tohk=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2930 = StringFog.decrypt("Iz1QIDXdDcsEPnMrM/cY0Q==\n", "bFs2RUeebKg=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2929 = StringFog.decrypt("G6s1bsZPVnIlrRhY3ktTYA==\n", "TM5XOrQuMBQ=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2928 = StringFog.decrypt("11Ms84GVyenpVRv1vw==\n", "gDZOp/P0r48=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2927 = StringFog.decrypt("+9QR24T7TwDS3w/kptFmJtzDFdumz28AwQ==\n", "s61hqcmjA2U=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2926 = StringFog.decrypt("L+M4di3RZ+8G8yxSCexd3gj0PHYP5Ub4FQ==\n", "Z5pIBGCJKp0=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2925 = StringFog.decrypt("9Mk98ipA7jra1T/XAnr3NdnHDu8JbNMz0Nwo8g==\n", "vLBNgGcYoVw=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2924 = StringFog.decrypt("x4zRubacQsLto8iujA==\n", "j/Why/vEFac=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2923 = StringFog.decrypt("oaoKVmMB/RaLhRNBWRrGGoy9Dg==\n", "6dN6JC5ZqnM=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2922 = StringFog.decrypt("tIYY1f2x2RKamhrx2YzhEY63CcnUhfMG\n", "/P9op7DplnQ=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2921 = StringFog.decrypt("wgsVYo/ejHH6CAFPnOaBeOgfP26O/IB66B8=\n", "jW1zB/2I5RQ=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2920 = StringFog.decrypt("YUCt+G6qFJVASZ7lTYY1kUVVuPg=\n", "KTndiiPyR/4=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2919 = StringFog.decrypt("TC6HDOhHvKptJ7QRy2udrmg7kgzpdpy1YTmSDA==\n", "BFf3fqUf78E=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2918 = StringFog.decrypt("07+nKXRRDJvR\n", "tNrTaBAFdes=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2917 = StringFog.decrypt("TAdIT3RJ9SRGB1JrTFHmJG4MSXI=\n", "K2I8HxgolkE=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2916 = StringFog.decrypt("zN82inFMFMrP3yytbXQeyM/fMId6TwXFxdkn\n", "q7pCzhQ8caQ=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2915 = StringFog.decrypt("nF8B9uGbWNmSWADG55plzw==\n", "+zp1sojoLKs=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2914 = StringFog.decrypt("/bldDSrEd5/3uUcpBcp6juizRTEj1w==\n", "mtwpXUalFPo=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2913 = StringFog.decrypt("DurTCzDkSRgI68I/BuBRFg==\n", "aY+nW0KBJXc=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2912 = StringFog.decrypt("A7eNo2h56gkBppyBeg==\n", "ZNL58wkLi2Q=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2911 = StringFog.decrypt("6Ntf0ffuv3jP1VzGyPeefsnURtfD\n", "oKIvo7q2/Qo=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2910 = StringFog.decrypt("tQSaWlSxkEu7E9kVUqySVr8P2QdYo85WoA6FGF2xznGvG4U5ZIqSVqEYkgZ9q5RQoAKDDQ==\n", "1mv3dDzI4Dk=\n");

    public C0888(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        try {
            try {
                return (String) BuildConfig.class.getDeclaredField(StringFog.decrypt("PwHt9vnCy4InBfLg\n", "aUS/pbCNhd0=\n")).get(null);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C1050 c1050 = C0267.m139().f487;
            String decrypt = StringFog.decrypt("06r6qmNKzaKmqvrV\n", "jfae8T8u4/8=\n");
            c1050.getClass();
            return C1050.m621((Object) null, BuildConfig.class, decrypt);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f2950, new C0996(this));
        hashMap.put(f2949, new C0970(this));
        hashMap.put(f2918, new C0951(this));
        hashMap.put(f2917, new C0936(this));
        hashMap.put(f2916, new C0917(this));
        hashMap.put(f2915, new C0916(this));
        hashMap.put(f2914, new C0915(this));
        hashMap.put(f2913, new C0914(this));
        hashMap.put(f2912, new C0896(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2118473762:
                if (str.equals(f2948)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2115661176:
                if (str.equals(f2931)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2082076211:
                if (str.equals(f2919)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2060981001:
                if (str.equals(f2944)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1783324338:
                if (str.equals(f2938)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1711062568:
                if (str.equals(f2941)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1632261541:
                if (str.equals(f2924)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1625751435:
                if (str.equals(f2934)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1429076201:
                if (str.equals(f2925)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1345825871:
                if (str.equals(f2942)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1289932600:
                if (str.equals(f2929)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1102538544:
                if (str.equals(f2921)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1056910325:
                if (str.equals(f2940)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -793729563:
                if (str.equals(f2939)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -684201479:
                if (str.equals(f2920)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -411143178:
                if (str.equals(f2936)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -352824194:
                if (str.equals(f2943)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -58290677:
                if (str.equals(f2932)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -52302939:
                if (str.equals(f2910)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -48720897:
                if (str.equals(f2937)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f2945)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 5206681:
                if (str.equals(f2911)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f2946)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 217655834:
                if (str.equals(f2947)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 748493318:
                if (str.equals(f2923)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 902272186:
                if (str.equals(f2926)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1056638846:
                if (str.equals(f2935)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1527993897:
                if (str.equals(f2930)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1564846544:
                if (str.equals(f2933)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1575934042:
                if (str.equals(f2922)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1775126662:
                if (str.equals(f2928)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1872662391:
                if (str.equals(f2927)) {
                    c = 21;
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
                return HyprMX.class;
            case 1:
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case '\b':
                return HyprMXWebViewWithClosableNavBar.class;
            case '\t':
            case '\n':
                return HyprMXNoOffersActivity.class;
            case 11:
            case '\f':
                return HyprMXOfferViewerActivity.class;
            case '\r':
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }
}
