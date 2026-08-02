package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3971i extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public String f182;

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f181 = StringFog.decrypt("fk6Uw16j2Sl+S7TXWKI=\n", "Fz3drT3Gt10=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f180 = StringFog.decrypt("3TpaGuwIknXROloS7A==\n", "ul8uW4hF8wc=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f179 = StringFog.decrypt("KGYLpEv97L0mZBE=\n", "TwN/5yqQnNw=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f178 = StringFog.decrypt("q809TDkSURmjyS1pNAlaIL7EOg==\n", "zKhJCFZlP3U=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f177 = StringFog.decrypt("xxPFy/kVKfzNE9/v\n", "oHaxm5V0Spk=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f176 = StringFog.decrypt("EWQwSkXqR7wx\n", "RgFSCyG8Ltk=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f175 = StringFog.decrypt("eklhuOcC7yReSW2N5iA=\n", "LSwD+YNSnUE=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f174 = StringFog.decrypt("07KqVpyAujPUng==\n", "hNfIAPXlzXI=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f173 = StringFog.decrypt("ENPhsbZe4JQk5eO/v1XD\n", "RqaP1to7t/E=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f172 = StringFog.decrypt("6vete4I9B07OwJs=\n", "p6XsMsZ8Yxg=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f171 = StringFog.decrypt("+jhIxu74M4zSDWj7zw==\n", "t2oJj6q8VuA=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f170 = StringFog.decrypt("BPrK2BWNYXgg89nTE6l6bjb70skCi1dOM/vSySuQe38g8NnP\n", "RZ68vWf5CAs=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f169 = StringFog.decrypt("tDQ+m+nWAQ2BKQ==\n", "9VB/+J2/d2Q=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f168 = StringFog.decrypt("GRRUUbM8\n", "T2E6Nt9ZiDs=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f167 = StringFog.decrypt("nWaNWdiEGyi/epVXwJg=\n", "yxPjPrThWks=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f166 = StringFog.decrypt("UZ2UUf/Nz2Nel9cI6MrTYVzcjBan7tRqVZ6cPurMyHJbhoA=\n", "MvL5f4m4oQQ=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f165 = StringFog.decrypt("YpyCbfkuDvVGlZFm/w==\n", "I/j0CItaZ4Y=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f164 = StringFog.decrypt("XTxW5e8PejB5\n", "DVA3hopiH14=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f163 = StringFog.decrypt("+T7lKNL6KczNHeIqyd4d3cY94jvH\n", "r0uLT76ffqk=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f162 = StringFog.decrypt("thkx/k5rkwa5E3KnWWyPBLtYKbkWSIgPsho5h118qwiwAR2zTHeLCKEP\n", "1XZc0Dge/WE=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f161 = StringFog.decrypt("ERRUm2k/wwQtFFeDSzA=\n", "QXg14ihbgGU=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f160 = StringFog.decrypt("22pQXyrw\n", "iQ8gMFiEr2A=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f159 = StringFog.decrypt("UsBchX1/kfNy3A==\n", "AKUs6g4W5Zw=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f158 = StringFog.decrypt("GFv751rcgIY6Sw==\n", "WT+4iDSo8uc=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f157 = StringFog.decrypt("aYZxHUSyXF1Kh2YOSZBM\n", "JekSfCjzOB4=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f156 = StringFog.decrypt("xn7InKCaRu/jdNw=\n", "ihGr/czbIrk=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f155 = StringFog.decrypt("wOmFU/RIGan7\n", "jIbmMpgecMw=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f154 = StringFog.decrypt("BZE/FX2xHbA6mzIAdJM=\n", "Sf5cdBHhb9U=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f153 = StringFog.decrypt("yAhFkKWOFtzqGFm+r4wBz/0FdZqmnwrJ2R5jjK6UENj7\n", "iWwG/8v6ZL0=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f152 = StringFog.decrypt("eRKNqyNXiWpdG56gJXOSfEsTlbowV4l2VjCarSVMkmA=\n", "OHb7zlEj4Bk=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f151 = StringFog.decrypt("iQXRWuBoQWS3D8Fe4l1ARg==\n", "xWqyO4wpJTQ=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f150 = StringFog.decrypt("EyPOlpNjHLQsFPy6uVYdlg==\n", "XnGP39cieOQ=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f149 = StringFog.decrypt("cFUqtjJSc0RITiGj\n", "JiBE0V43MSU=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f148 = StringFog.decrypt("6A5TTPHyeWjnBBAV5vVlauVPaBfp4HtqyQBQDOL1\n", "i2E+YoeHFw8=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f147 = StringFog.decrypt("VbYOdaIQwcB3qhZ3mBzq1g==\n", "A8NgEs51j6E=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f146 = StringFog.decrypt("J9Zc0rBVhu4o3B+Lp1Ka7CqXRJXoVoHsM5dniahHhOwK2EWVsEW+4CHO\n", "RLkx/MYg6Ik=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f145 = StringFog.decrypt("utqkuXWwFMCCwa+sT7wz1g==\n", "7K/K3hnVVqE=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f144 = StringFog.decrypt("DaXn4DDrHS8Cr6S5J+wBLQDk/6do6BotGeTcuyj5Hy0sq+SgI+wlIQu9\n", "bsqKzkaec0g=\n");

    public C3971i(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String mo115() {
        String mo118 = mo118();
        if (mo118 != null) {
            return mo118.split(StringFog.decrypt("Lg==\n", "ASTPsdrpXOM=\n"))[1];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f177, new C3966d(this));
        hashMap.put(f181, new C3967e(this));
        hashMap.put(f180, new C3968f(this));
        hashMap.put(f179, new C3969g(this));
        hashMap.put(f178, new C3970h(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2075872274:
                if (str.equals(f150)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2012803321:
                if (str.equals(f146)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1853707364:
                if (str.equals(f144)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1850654380:
                if (str.equals(f160)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1836618638:
                if (str.equals(f169)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1740904301:
                if (str.equals(f156)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1721428911:
                if (str.equals(f168)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1057659822:
                if (str.equals(f170)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -965507231:
                if (str.equals(f174)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -899612152:
                if (str.equals(f162)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -828205665:
                if (str.equals(f172)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -747599243:
                if (str.equals(f158)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(f164)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -350701718:
                if (str.equals(f159)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -92732536:
                if (str.equals(f148)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 156342925:
                if (str.equals(f147)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 315438882:
                if (str.equals(f145)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 332396988:
                if (str.equals(f176)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 505165239:
                if (str.equals(f163)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 670892517:
                if (str.equals(f165)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 746354589:
                if (str.equals(f154)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 798818448:
                if (str.equals(f155)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1033471823:
                if (str.equals(f166)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1110462460:
                if (str.equals(f171)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1205766784:
                if (str.equals(f167)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1208038126:
                if (str.equals(f173)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1230133745:
                if (str.equals(f175)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1461477995:
                if (str.equals(f152)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1611471226:
                if (str.equals(f151)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1731532800:
                if (str.equals(f157)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1766407901:
                if (str.equals(f149)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1777696764:
                if (str.equals(f161)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1861686093:
                if (str.equals(f153)) {
                    c = 18;
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
                return Vungle.class;
            case 1:
            case 2:
                return VungleActivity.class;
            case 3:
            case 4:
                return VungleWebViewActivity.class;
            case 5:
                return Advertisement.class;
            case 6:
                return Placement.class;
            case 7:
                return VungleWebClient.class;
            case '\b':
                return Report.class;
            case '\t':
                return PlayAdCallback.class;
            case '\n':
                return Repository.class;
            case 11:
                return AdContract.class;
            case '\f':
                return LocalAdContract.class;
            case '\r':
                return LocalAdView.class;
            case 14:
                return LocalAdContract.LocalView.class;
            case 15:
                return LocalAdContract.LocalPresenter.class;
            case 16:
                return LocalAdPresenter.class;
            case 17:
                return MRAIDAdPresenter.class;
            case 18:
                return AdContract.AdvertisementPresenter.class;
            case 19:
                return AdvertisementPresentationFactory.class;
            case 20:
                return WebAdContract.WebAdView.class;
            case 21:
                return WebAdContract.WebAdPresenter.class;
            case 22:
                return WebViewAPI.class;
            case 23:
                return MRAIDAdView.class;
            case 24:
                return WebViewAPI.MRAIDDelegate.class;
            case 25:
                return AdContract.AdvertisementPresenter.EventListener.class;
            case 26:
                return AdActivity.class;
            case 27:
            case 28:
                return VungleBanner.class;
            case 29:
            case 30:
                return VungleBannerView.class;
            case 31:
            case ' ':
                return VungleNativeView.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String mo118() {
        String str = this.f182;
        if (str == null) {
            C0805 c0805 = C0267.m139().f488;
            C0832 c0832 = new C0874().f2896;
            c0832.f2646 = String.class;
            c0832.f1208 |= 8;
            c0832.f1207 |= 16;
            C0805 c08052 = C0267.m139().f488;
            ArrayList arrayList = new ArrayList();
            c08052.m464(VungleApiClient.class, c0832, arrayList);
            str = null;
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((Field) it.next()).get(null);
                    if (str2.startsWith(StringFog.decrypt("4ynJX0x9pRzUJshW\n", "tVynOCAY5HE=\n")) || str2.startsWith(StringFog.decrypt("TSy5YaW/J0V0MLM=\n", "G1nXBsnaYzc=\n"))) {
                        str = str2.split(StringFog.decrypt("3A==\n", "5/3MzI8nEaM=\n"))[0];
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            this.f182 = str;
            this.f1241 = str;
        }
        return str;
    }
}
