package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｌ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1143 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f3622 = StringFog.decrypt("U2bxpsVGfaJN\n", "NAOF57U2Nsc=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f3621 = StringFog.decrypt("0RKTey2/3jLwFoRJJ7nEE9gEk1wmqNg=\n", "tnfnPUjLvVo=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3620 = StringFog.decrypt("gdR19qw9PU+W3m/ErS0xWK/V\n", "5rEBt8hvWDw=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f3619 = StringFog.decrypt("lwbbgvYhGPmADMGw9zoQ+oIG3LD7HBPfgg8=\n", "8GOvw5JzfYo=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f3618 = StringFog.decrypt("Q4M3zMoS3KlUiS3+yxLctECDMeTAJ/S7VA==\n", "JOZDja5Audo=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f3617 = StringFog.decrypt("c7atYIJlJeRkvLdSg2Ul+XC2q0iIUALiere1RA==\n", "FNPZIeY3QJc=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f3616 = StringFog.decrypt("1bM/3LWhPHLeoh3xtKIyRtalGf2hsjh0xpU+66SoMFfTpCr1ow==\n", "stZLmNDHXQc=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f3615 = StringFog.decrypt("WP+BUuxYc39P9Ztg7Utyfw==\n", "P5r1E4gKFgw=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f3614 = StringFog.decrypt("i/bHoKDtxoec/N2Soe/RnY/2446t0dc=\n", "7JOz4cS/o/Q=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f3613 = StringFog.decrypt("+V9Gax9XHrr7aV5FD1Eiido=\n", "njoyKnsEd8A=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f3612 = StringFog.decrypt("nVyoZL1878ifeLhxoF/j\n", "+jncJdkvhrI=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f3611 = StringFog.decrypt("t4tls+JewLi1vmSQ1WjdtrmAdoE=\n", "0O4R8oYNqcI=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f3610 = StringFog.decrypt("IO+4+TFsCF4A8o34EHYGUj31mPEjYQ==\n", "SZz5nWIFcjs=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f3609 = StringFog.decrypt("hbVVrFZ+ceagokSuSl1Ex5KoQrRvekvFgaJCgENr\n", "5scwzSIbJaQ=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3608 = StringFog.decrypt("BmQpohBgIswgbimgEXEZ/DZzPrUNZhM=\n", "ZRZMw2QFdo4=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3607 = StringFog.decrypt("nWERVPn+G6KKawtm+O8MtJtwDGP45Ro=\n", "+gRlFZ2sftE=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f3606 = StringFog.decrypt("wukXfYp6fWjx7DFxgn0=\n", "g41FGO0TDhw=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f3605 = StringFog.decrypt("DffNCTTbbtYg1/Y=\n", "SaOPSFevB6A=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3604 = StringFog.decrypt("PmMhsJFWez0yYmL6lU1zJDgiLfqDFV4TH00v6plNczMk\n", "XQxMnvA7Gkc=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3603 = StringFog.decrypt("aUQ4SI3Ek5ReZBN1itGap05kE3eKxI8=\n", "LRB6AeOw9uY=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3602 = StringFog.decrypt("ufyr7U4bNfW1/einSgA97L+9p6dcWBDbmNqot0oEJ/uz56+iQzc3+7Plr7dW\n", "2pPGwy92VI8=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3601 = StringFog.decrypt("l6yJ94/OWPi6jqLCkg==\n", "0/jLtuuPO4w=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3600 = StringFog.decrypt("NObjL/7HZnc456Bl+txubjKn72XshENZFcjqQPzebns+/fc=\n", "V4mOAZ+qBw0=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3599 = StringFog.decrypt("2QlpgrOdotb4L1i3vqClw/E=\n", "nV0rw9fUzKI=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3598 = StringFog.decrypt("/PNq6ceW3XLcwlo=\n", "uKcoqKPashM=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3597 = StringFog.decrypt("7hQse1p8ZHrfJR1O\n", "qkBuOj4uAQs=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3596 = StringFog.decrypt("l/WikGHa5Cmjzo6iYA==\n", "06Hg0QWIgVo=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3595 = StringFog.decrypt("EYZvHQer/Wci\n", "VdItXGP9lAI=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3594 = StringFog.decrypt("lJgF8ySGnbi1\n", "0MxHskDV9MI=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3593 = StringFog.decrypt("xBwrb9gLrdDIHWgl3BClycJdJyXKSIj+5TIiF9ADuw==\n", "p3NGQblmzKo=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3592 = StringFog.decrypt("8PHVwjBtjCzD9uLzJFSXPffJ/uY6Tw==\n", "tKWXg1Q75Uk=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3591 = StringFog.decrypt("kXfTlRKhOWCTQvKnGKcj\n", "1SOR03fVWgg=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3590 = StringFog.decrypt("tXd22Mu19d68Qlr/yaTk\n", "8SM0nq7BlrY=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3589 = StringFog.decrypt("Acgmijlg/E43+RY=\n", "RZxk2FwOmCs=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3588 = StringFog.decrypt("8Bv7Dk0F277aKssDQDTOtdoqyw==\n", "tE+5TylHutA=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3587 = StringFog.decrypt("o87j+QtWbuiC2MDWAXF9147p1d0BcX0=\n", "55qhuG8UD5s=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3586 = StringFog.decrypt("8DeS8UZEtC3RKr7ER3SmKt0XudFOSrwtwAa+1VA=\n", "tGPQsCIG1V4=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f3585 = StringFog.decrypt("nBcbAWubz8i0ITgjZA==\n", "2ENZQA/YrqQ=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f3584 = StringFog.decrypt("crkJZ0Q4bc5Xgy9DRDF8zUKIJUNS\n", "Nu1LJiB9Fb4=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f3583 = StringFog.decrypt("JPyotUoofyMF2pmARxV4Ngzkg4daBH8yEg==\n", "YKjq9C5hEVc=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f3582 = StringFog.decrypt("TPq+WXovC6d8y5J9bA==\n", "CK78GB5jYtQ=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f3581 = StringFog.decrypt("JH1e8KPkABYCd3LipcgGAw==\n", "cD8Tkc2FZ3M=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f3580 = StringFog.decrypt("DDD50zLrMM83AO/OJf4s2D0=\n", "WHK8q1eIRbs=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f3579 = StringFog.decrypt("zYH5iymbeen/heO2Lo5w2u+F47Qum2U=\n", "jPGKwkfvHJs=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f3578 = StringFog.decrypt("bpvi7t8mkalimqGhzjjesmmHoaHdP5mlZID27v87g5pjgOqyzT+Zp2SV44HdP5mlZID2\n", "DfSPwL5L8NM=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f3577 = StringFog.decrypt("gCqEM8sdagKoLJ4G1g==\n", "wVr3cq9cCXY=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f3576 = StringFog.decrypt("XY+Y8YzdU91Rjtu+ncMcxlqT276OxFvRV5SM8azAQeZaoZarhMZb00c=\n", "PuD13+2wMqc=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f3575 = StringFog.decrypt("Elk1szVNNswk\n", "UylG8lEbX6k=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f3574 = StringFog.decrypt("HRsn\n", "XGtUxZdwxRE=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f3573 = StringFog.decrypt("2kKSNxo=\n", "mzLhdn7FV/c=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f3572 = StringFog.decrypt("1OyYviBfTXvh7oSTKHlQ\n", "lZzr/0QcIhU=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f3571 = StringFog.decrypt("/KKwhcPtViHJt62h1Q==\n", "vdLDxKehP1I=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f3570 = StringFog.decrypt("X9Yx1KzIQqxrwzHhhPNUqXvIJ+c=\n", "HqZClciaJ90=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f3569 = StringFog.decrypt("Mhd66aFHRmoeBn0=\n", "c2cJqMUBKRg=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f3568 = StringFog.decrypt("VGe2jwR/VC1w\n", "FRfFzmArLV0=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f3567 = StringFog.decrypt("C7mgGSFmUYI/rKAs\n", "SsnTWEU0NPM=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f3566 = StringFog.decrypt("6nBbgPvRi4/fcF607tG+\n", "jRUvwYuiyus=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f3565 = StringFog.decrypt("WGgB8Yg2H01ZYg==\n", "Pw11s+FSViM=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f3564 = StringFog.decrypt("LdhPB05Khs4a0lI5SA==\n", "Sr07Vzwj5as=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f3563 = StringFog.decrypt("V1mtOOh5yLNFVb0=\n", "MDzZa4QWvOY=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f3562 = StringFog.decrypt("HZgznacWnUU8kjWxthE=\n", "ev1H3Ndl3CE=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f3561 = StringFog.decrypt("RhUatmWJ/sJFFRw=\n", "IXBu9wHFkaM=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f3560 = StringFog.decrypt("/tiTVeyPoaru\n", "mb3nFIjZyM8=\n");

    public C1143(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        Matcher matcher = Pattern.compile(StringFog.decrypt("XDpP1YhK3HMvO0vT+Q==\n", "chBi/dMWuF0=\n")).matcher(AdRegistration.getVersion());
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f3622, new C0225(this));
        hashMap.put(f3621, new C1173(this));
        hashMap.put(f3620, new C1171(this));
        hashMap.put(f3607, new C1168(this));
        hashMap.put(f3619, new C1167(this));
        hashMap.put(f3618, new C1166(this));
        hashMap.put(f3617, new C1164(this));
        hashMap.put(f3616, new C1151(this));
        hashMap.put(f3615, new C1146(this));
        hashMap.put(f3614, new C0344(this));
        hashMap.put(f3613, new C0343(this));
        hashMap.put(f3612, new C0339(this));
        hashMap.put(f3611, new C0295(this));
        hashMap.put(f3610, new C0263(this));
        hashMap.put(f3609, new C0261(this));
        hashMap.put(f3608, new C0238(this));
        hashMap.put(f3566, new C0237(this));
        hashMap.put(f3565, new C0230(this));
        hashMap.put(f3564, new C0229(this));
        hashMap.put(f3563, new C0223(this));
        hashMap.put(f3562, new C0212(this));
        hashMap.put(f3561, new C1187(this));
        hashMap.put(f3560, new C1180(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2137858584:
                if (str.equals(f3598)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -2133119933:
                if (str.equals(f3572)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1987686071:
                if (str.equals(f3582)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1885106463:
                if (str.equals(f3605)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1879113962:
                if (str.equals(f3594)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1879025222:
                if (str.equals(f3595)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1554728876:
                if (str.equals(f3602)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1464660218:
                if (str.equals(f3586)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1358954558:
                if (str.equals(f3591)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1293925587:
                if (str.equals(f3603)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1291566264:
                if (str.equals(f3567)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1092884085:
                if (str.equals(f3600)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1090060454:
                if (str.equals(f3597)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -832298225:
                if (str.equals(f3581)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -791598050:
                if (str.equals(f3569)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -723985259:
                if (str.equals(f3589)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -696695160:
                if (str.equals(f3604)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -694845532:
                if (str.equals(f3601)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -466918522:
                if (str.equals(f3587)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -341719851:
                if (str.equals(f3588)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -300800492:
                if (str.equals(f3580)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -197992833:
                if (str.equals(f3579)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -27446238:
                if (str.equals(f3584)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 66052:
                if (str.equals(f3574)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 63478087:
                if (str.equals(f3573)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 355568411:
                if (str.equals(f3571)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 568188517:
                if (str.equals(f3590)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 620798166:
                if (str.equals(f3596)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 788901082:
                if (str.equals(f3585)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1036908700:
                if (str.equals(f3606)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1251356764:
                if (str.equals(f3576)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1306698049:
                if (str.equals(f3599)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1328085269:
                if (str.equals(f3583)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1340383521:
                if (str.equals(f3568)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1340427404:
                if (str.equals(f3575)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1600627740:
                if (str.equals(f3570)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1648408950:
                if (str.equals(f3577)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1713728997:
                if (str.equals(f3578)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 2019413793:
                if (str.equals(f3593)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2144664800:
                if (str.equals(f3592)) {
                    c = 14;
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
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case '\b':
                return DTBAdLoader.class;
            case '\t':
                return DTBAdRequest.class;
            case '\n':
                return DTBAdResponse.class;
            case 11:
            case '\f':
                return DTBAdView.class;
            case '\r':
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return C1144.class;
            case 26:
                return C1145.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case ' ':
                return Aps.class;
            case '!':
                return ApsAd.class;
            case '\"':
                return ApsAdController.class;
            case '#':
                return ApsAdListener.class;
            case '$':
                return ApsAdRequestListener.class;
            case '%':
                return ApsAdFormat.class;
            case '&':
                return ApsAdType.class;
            case '\'':
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final String mo118() {
        return AdRegistration.getVersion();
    }
}
