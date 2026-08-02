package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3981t extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f265 = StringFog.decrypt("mblCTdQdmVespA==\n", "2N0DLqB07z4=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f264 = StringFog.decrypt("x7JGnKAlDinIuAXTsiNOJ8qpTsC4MQxg0bQF87IRAzrNq0LGrw==\n", "pN0rstZQYE4=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f263 = StringFog.decrypt("RC2MR3Hzbg==\n", "BUnNNAKWGho=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f262 = StringFog.decrypt("/xT9iwtRVsbfHA==\n", "vnC05X80JKg=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f261 = StringFog.decrypt("2/RSicYaOuj+\n", "mpAC6L92VYk=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f260 = StringFog.decrypt("Opz7TOZdwQ==\n", "e+yLAok5pB0=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f259 = StringFog.decrypt("oLHOjG0swFU=\n", "4tCg4ghegTE=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f258 = StringFog.decrypt("sAdRSF3oT2q+D0xSXfRrfA==\n", "8mY/JjiaDg4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f257 = StringFog.decrypt("tzKZ3a50elGmOo3W\n", "9VP3s8sGOzU=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f256 = StringFog.decrypt("YybVCK7cmTZEMA==\n", "IUe7Zsuuz18=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f255 = StringFog.decrypt("UPp+tRh0yIVf8D36CnKIoFL7ff4cV8+HRA==\n", "M5UTm24BpuI=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f254 = StringFog.decrypt("0UcfhkDz\n", "kyZs4wGXCKU=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f253 = StringFog.decrypt("kERE215UMp2hUVLQekI=\n", "0iU3vh8wfvQ=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f252 = StringFog.decrypt("9AV97WRxBNDFB3ztR2op2A==\n", "tmQOiCIEaLw=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f251 = StringFog.decrypt("tXq42k5FYz+TSb7CR0ViNpt+tcY=\n", "9hvbsiskAVM=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f250 = StringFog.decrypt("OVrmubB2exgaQcux\n", "fy+K1cMVCX0=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f249 = StringFog.decrypt("/YQbij6wGenenzaCAboY+N6fEpQ=\n", "u/F35k3Ta4w=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f248 = StringFog.decrypt("pHJsdO+nr0CZdXl93LA=\n", "7RwYEZ3U2yk=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f247 = StringFog.decrypt("/P6ycvK2DSHB+ad7waE1Icbko3nltw==\n", "tZDGF4DFeUg=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f246 = StringFog.decrypt("IdmFVPPJz54f7qpp0us=\n", "bIvEHbeZvfs=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f245 = StringFog.decrypt("Y14suNIEPMlH\n", "MzJN27dpWac=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f244 = StringFog.decrypt("czKrFs1ufm5gMw==\n", "IVfcd78KGwo=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f243 = StringFog.decrypt("V+eTaxrB6sRE5qhjG9HqzmDw\n", "BYLkCmilj6A=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f242 = StringFog.decrypt("G+R73uwTQpg5+GPQ9A8=\n", "TZEVuYB2A/s=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f241 = StringFog.decrypt("cCrJTXhQuyB/IIoCalb7Ln0xwRFgRLlpZiyKNXtLsit2BMcXZ1O8M2o=\n", "E0WkYw4l1Uc=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f240 = StringFog.decrypt("S8m0e6pVXK9u\n", "HbzaHMYwHcs=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f239 = StringFog.decrypt("NNrL0IRIU2sL7MnejUNm\n", "Yq+lt+gtEhs=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f238 = StringFog.decrypt("r0OHp0VItFSbdYWpTEOX\n", "+TbpwCkt4zE=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f237 = StringFog.decrypt("5hentsZ7td/1\n", "gXLT96Iu27Y=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f236 = StringFog.decrypt("vK57J8/GUGU=\n", "28sPZr+2GQE=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f235 = StringFog.decrypt("sW5Hd3ShJe63aV9RR6c957doVllwrDnepGc=\n", "1gszNBXCTYs=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f234 = StringFog.decrypt("zBMB2EXoiyjCERs=\n", "q3Z1mySF+0k=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f233 = StringFog.decrypt("gOB/qHKi2LmK4GWMV6c=\n", "54UL+B7Du9w=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f232 = StringFog.decrypt("pzue5MGWo2+hKo/jwY+naq45mQ==\n", "wF7qsKT70wM=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f231 = StringFog.decrypt("QWkCYjEV7IJNfgZuIhHx\n", "KBpQB0Z0nuY=\n");

    public C3981t(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        try {
            return mo118().split(StringFog.decrypt("mQ==\n", "tCgfmak1rI8=\n"))[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f237, new C3975m(this));
        hashMap.put(f236, new C3976n(this));
        hashMap.put(f235, new C3977o(this));
        hashMap.put(f234, new C3978p(this));
        hashMap.put(f233, new C3979q(this));
        hashMap.put(f232, new r(this));
        hashMap.put(f231, new C3980s(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -1836618638:
                if (str.equals(f265)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1791176561:
                if (str.equals(f259)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1560947009:
                if (str.equals(f255)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1494265129:
                if (str.equals(f241)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1435839138:
                if (str.equals(f250)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1179107681:
                if (str.equals(f240)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f244)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(f247)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f245)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -486531311:
                if (str.equals(f246)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -393802555:
                if (str.equals(f243)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -43797322:
                if (str.equals(f251)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 307971376:
                if (str.equals(f257)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f248)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 324239304:
                if (str.equals(f253)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 389759008:
                if (str.equals(f262)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 484680813:
                if (str.equals(f263)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 870529955:
                if (str.equals(f260)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f256)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 989853769:
                if (str.equals(f264)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1205766784:
                if (str.equals(f242)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1208038126:
                if (str.equals(f238)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1442693170:
                if (str.equals(f249)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1505622627:
                if (str.equals(f258)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1839869899:
                if (str.equals(f261)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1853648591:
                if (str.equals(f252)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1930966324:
                if (str.equals(f239)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1982630644:
                if (str.equals(f254)) {
                    c = 11;
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
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case '\b':
                return BannerAdSize.class;
            case '\t':
            case '\n':
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case '\f':
                return BaseAdListener.class;
            case '\r':
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
                return FullscreenAd.class;
            case 16:
                return FullscreenAdListener.class;
            case 17:
                return InterstitialAd.class;
            case 18:
                return InterstitialAdListener.class;
            case 19:
                return MRAIDPresenter.class;
            case 20:
                return Placement.class;
            case 21:
                return RewardedAd.class;
            case 22:
                return RewardedAdListener.class;
            case 23:
            case 24:
                return VungleActivity.class;
            case 25:
                return VungleAds.class;
            case 26:
                return VungleApiClient.class;
            case 27:
                return VungleWebClient.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final String mo118() {
        try {
            C1050 c1050 = C0267.m139().f487;
            String decrypt = StringFog.decrypt("7XM7+X1Rka6YczuMCxE=\n", "sy9foiE1v/M=\n");
            c1050.getClass();
            return C1050.m621((Object) null, BuildConfig.class, decrypt);
        } catch (Throwable unused) {
            return null;
        }
    }
}
