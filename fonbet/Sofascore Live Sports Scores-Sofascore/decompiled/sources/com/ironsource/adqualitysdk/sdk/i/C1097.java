package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.CBImpressionActivity;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostActivity;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.callbacks.StartCallback;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺔ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1097 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3432 = StringFog.decrypt("10nqS5sRW2nBS/9rnA==\n", "pCyeH/lVPgU=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3431 = StringFog.decrypt("Eop6gwX0xskDgGGzGdHR0QSIb7QI\n", "Ye8OwG2VtL0=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3430 = StringFog.decrypt("wTjBrLRHVzTEMtqcqGJALMM61Ju5\n", "pl2179wmJUA=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3429 = StringFog.decrypt("ooMstLA8kr+niTeErAvYlPG5aLO9MYWspJI9\n", "xeZY99hd4Ms=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3428 = StringFog.decrypt("Nkq/t9/gRYUWULuk3+d+qCZMnrPH4HamIV0=\n", "VTja1quFEcc=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3427 = StringFog.decrypt("H9WuIpf2RpEB45cml8xKkA==\n", "dqb5R/WgL/Q=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3426 = StringFog.decrypt("gpBUcCIVXsaMmk4=\n", "5fUgPE12P7I=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3425 = StringFog.decrypt("/HVGNIJTMKD2dQ==\n", "mxAydfIjfsE=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3424 = StringFog.decrypt("hMtPseMps62K2W+2\n", "7bgb06dM38g=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3423 = StringFog.decrypt("ciw/FdhbRjJCMB8E2FBfNEU9\n", "MUReZ6w5KV0=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3422 = StringFog.decrypt("P6PF1Ol746YPiOPX2GryvAqI+MA=\n", "fOGMuZkJhtU=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3421 = StringFog.decrypt("cDmjFreMOBNAJQ==\n", "M1HCZMPuV3w=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3420 = StringFog.decrypt("xR25F+qHPNc=\n", "hl/webrrXa4=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3419 = StringFog.decrypt("wL7DH/3MTwTqk+A=\n", "g/yOepmlLnA=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3418 = StringFog.decrypt("22Nuz7OEkUv4S2XCt5w=\n", "lgYKptLw+CQ=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3417 = StringFog.decrypt("BvLvXovXGBc5w+ZcnMEbGz3z+nmL2RwTM/Tr\n", "UoCOPe61eXQ=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3416 = StringFog.decrypt("6OphNBdJVCjYwUc3K15WOsjRaToTUkcy39E=\n", "q6goWWc7MVs=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3415 = StringFog.decrypt("413+kmvX+5z0UPzTe8u0neRZvdBt2PuN+RzQ/kHS6pzlQeDVZ9HbjfRb5dV8xg==\n", "gDKTvAi/mu4=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3414 = StringFog.decrypt("Lpg=\n", "b/y56DbVzMI=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3413 = StringFog.decrypt("HoF1LMp0E2UjhmAl\n", "V+8BSbgHZww=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3412 = StringFog.decrypt("vpZg910S2eg=\n", "7PMXli92vIw=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3411 = StringFog.decrypt("hPdoKwhITyam+A==\n", "xZMrSmQkLUc=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3410 = StringFog.decrypt("YlY8/5PiykZEUyrTntLYQ0pdLvGR\n", "Jj9PkvqRuS8=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3409 = StringFog.decrypt("jc1s4e9dRkKwynno3k9eR6bCe+8=\n", "xKMYhJ0uMis=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3408 = StringFog.decrypt("RWE4Xt4tMVBUZSNTzig3Xw==\n", "FwRPP6xJVDQ=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3407 = StringFog.decrypt("PiRLwJQGDLsBMkvRiw==\n", "bVAqsuBFbdc=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3406 = StringFog.decrypt("ayoPqyw7h4ZbASmoCiCHgmkLMq8qIJaM\n", "KGhGxlxJ4vU=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3405 = StringFog.decrypt("Ecuo3khm55EGxqqfWHqokBbP64ZCa/HNMeaMnVt845ABzaqeam3yigTNsYk=\n", "cqTF8CsOhuM=\n");

    public C1097(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        try {
            return Chartboost.getSDKVersion();
        } catch (Error unused) {
            return StringFog.decrypt("HhG7+xI=\n", "KD+K1SIr3ZA=\n");
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3432, new C1192(this));
        hashMap.put(f3430, new C1189(this));
        hashMap.put(f3429, new C1184(this));
        hashMap.put(f3428, new C1162(this));
        hashMap.put(f3431, new C1159(this));
        hashMap.put(f3427, new C1156(this));
        hashMap.put(f3426, new C1150(this));
        hashMap.put(f3425, new C1148(this));
        hashMap.put(f3424, new C1122(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -1602236458:
                if (str.equals(f3417)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1251618628:
                if (str.equals(f3406)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -921117961:
                if (str.equals(f3422)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -869710636:
                if (str.equals(f3423)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -513187163:
                if (str.equals(f3421)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -416101408:
                if (str.equals(f3416)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -371244199:
                if (str.equals(f3419)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -352872024:
                if (str.equals(f3411)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -305846637:
                if (str.equals(f3408)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -221039695:
                if (str.equals(f3409)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -174936018:
                if (str.equals(f3412)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f3414)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 296803428:
                if (str.equals(f3410)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 544981520:
                if (str.equals(f3405)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 604162924:
                if (str.equals(f3415)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 650412337:
                if (str.equals(f3418)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 753858215:
                if (str.equals(f3407)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 769047372:
                if (str.equals(f3413)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1443881784:
                if (str.equals(f3420)) {
                    c = 3;
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
                return ChartboostActivity.class;
            case 1:
                return CBImpressionActivity.class;
            case 2:
                return Chartboost.class;
            case 3:
                return CBInPlay.class;
            case 4:
                return Chartboost.CBMediation.class;
            case 5:
                return MediationModel.class;
            case 6:
                return C1105.class;
            case 7:
            case '\b':
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case '\t':
                return Ad.class;
            case '\n':
                return Interstitial.class;
            case 11:
                return Rewarded.class;
            case '\f':
                return AdCallback.class;
            case '\r':
                return DismissibleAdCallback.class;
            case 14:
                return InterstitialCallback.class;
            case 15:
                return RewardedCallback.class;
            case 16:
                return StartCallback.class;
            case 17:
            case 18:
                return com.chartboost.sdk.view.CBImpressionActivity.class;
            default:
                return null;
        }
    }
}
