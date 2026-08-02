package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ה, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0445 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1293 = StringFog.decrypt("QFW3c6WdyBBKVa1XnYXbEGJetk4=\n", "JzDDI8n8q3U=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1292 = StringFog.decrypt("aUUB1FEytLplVQXBTA+wjWBVGA==\n", "DiB1lTV/1cg=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1291 = StringFog.decrypt("1W7eSUmZ8SLdb89h\n", "sguqDSjtkG8=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1290 = StringFog.decrypt("mpPkUx6JPnmcgvlkH541bJg=\n", "/faQEnrKTBw=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1289 = StringFog.decrypt("IFzJBc/08BIoUfAD2/TFDw==\n", "aTKEaq2dsXY=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1288 = StringFog.decrypt("X0/+3mFJJjReSb2CbUkvPk5J/ZcmbiUWU0L6sWxmKC9VVvqEcQ==\n", "PCCT8AgnS1s=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1287 = StringFog.decrypt("YItPJOLUxW9ohnYi9tTwcn/d\n", "KeUCS4C9hAs=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1286 = StringFog.decrypt("n837Y15OFOOey7gsU1NX/pnM8ihFSRfr0uv4AFhCEM2Y4/U5XlYQ+IU=\n", "/KKWTTcgeYw=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1285 = StringFog.decrypt("oGtwPTkqQxSKb2sCJipi\n", "7goEVE9PFX0=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1284 = StringFog.decrypt("lbGvhMyzZ2mArJKA\n", "1NXi5b7YEhk=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1283 = StringFog.decrypt("Elc0/J+gQB09VgU=\n", "UzN3k/HUIXQ=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1282 = StringFog.decrypt("ui1mdBdgHq+PGHp/AncFtYEtew==\n", "6EgIEHISd8E=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1281 = StringFog.decrypt("NMUNDujgU20Q/RUd6A==\n", "ZKlsbY2NNgM=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1280 = StringFog.decrypt("3oW2kgd4Vy/+\n", "m/PT/HMsLl8=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1279 = StringFog.decrypt("/X0nlDsmHk7afQ+J\n", "tBNq+1lPXC8=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1278 = StringFog.decrypt("TmEaiNc0GjhJdhGIxgoyL3hlGoPA\n", "DAB05rJGW1w=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1277 = StringFog.decrypt("ppv4QToe2MWbkMddLB7lwo6Z\n", "7/W1Llh3kas=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1276 = StringFog.decrypt("Imi2Qi7BB4Mfb6NLHdY2nA5otms1wQePBWOw\n", "awbCJ1yyc+o=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1275 = StringFog.decrypt("1XD0rGNrqQjeZ+WrYUKBH+907qBn\n", "mxGAxRUO6Gw=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1274 = StringFog.decrypt("l7xOxmk2e1+voWbKdQdoVKSn\n", "wdUqowZzDTo=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1273 = StringFog.decrypt("4tuccobuXRTA\n", "q7XRHeSHDnA=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1272 = StringFog.decrypt("Mm5d69fVNncpZWHx0M8D\n", "ewAQhLW8dxM=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1271 = StringFog.decrypt("ubscyTI+F/Kutg==\n", "79J5vlNce5c=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1270 = StringFog.decrypt("zRSABcfs\n", "jHDVa66YHFE=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1269 = StringFog.decrypt("dYpdh/AlMQNYkkqC4zI1D16caIrnMBcDSQ==\n", "O+sp7oZAY2Y=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1268 = StringFog.decrypt("sWTCoGro1Wa7ZNiET+0=\n", "1gG28AaJtgM=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1267 = StringFog.decrypt("e18XL42Ih/hv\n", "HDpjbunb4ow=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1266 = StringFog.decrypt("dy5pZALQ+gx7OQ==\n", "Hl07AXWxiGg=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1265 = StringFog.decrypt("TJcrZOJN\n", "K/JfJYY+JQM=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1264 = StringFog.decrypt("ycHpElLrzXTW0NkwSeQ=\n", "rqSdUT2FuRE=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1263 = StringFog.decrypt("RTDFtOQXgP5GJg==\n", "IlWx5oFg4Yw=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1262 = StringFog.decrypt("2sYIx8nPSpPO1w==\n", "vaN8kKytHPI=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1261 = StringFog.decrypt("Qp80fxjI5OBMjCV1Dg==\n", "JfpAPGqthZQ=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1260 = StringFog.decrypt("VsoSeHC6TIVFxhVccI9GmUXKCE0=\n", "Ma9mORTMKfc=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1259 = StringFog.decrypt("EpKYdswm8Lkgkw==\n", "U/bKE79Wn9c=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1258 = StringFog.decrypt("e2WZaHY=\n", "OgHKDQIr+js=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1257 = StringFog.decrypt("yOM=\n", "iYeg4w8adyk=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1256 = StringFog.decrypt("4tsrYDxU/zzAwCQ=\n", "obRFFFksi3g=\n");

    public C0445(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        return InMobiSdk.getVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1293, new C0605(this));
        hashMap.put(f1292, new C0591(this));
        hashMap.put(f1291, new C0580(this));
        hashMap.put(f1290, new C0549(this));
        hashMap.put(f1268, new C0531(this));
        hashMap.put(f1267, new C0510(this));
        hashMap.put(f1266, new C0507(this));
        hashMap.put(f1265, new C0484(this));
        hashMap.put(f1264, new C0483(this));
        hashMap.put(f1263, new C0660(this));
        hashMap.put(f1262, new C0616(this));
        hashMap.put(f1261, new C0611(this));
        hashMap.put(f1260, new C0607(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2044438337:
                if (str.equals(f1282)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1769689844:
                if (str.equals(f1273)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1716191362:
                if (str.equals(f1283)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1405271692:
                if (str.equals(f1269)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1401317165:
                if (str.equals(f1274)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1304544044:
                if (str.equals(f1275)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1062227179:
                if (str.equals(f1288)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -808014786:
                if (str.equals(f1272)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -595852006:
                if (str.equals(f1279)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -560158238:
                if (str.equals(f1287)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -541364416:
                if (str.equals(f1289)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -520974940:
                if (str.equals(f1259)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -235933147:
                if (str.equals(f1284)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -204096109:
                if (str.equals(f1286)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -93733047:
                if (str.equals(f1285)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -32161126:
                if (str.equals(f1277)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f1257)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 63090975:
                if (str.equals(f1258)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 99044255:
                if (str.equals(f1281)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 515339810:
                if (str.equals(f1271)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 957243679:
                if (str.equals(f1278)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1228411167:
                if (str.equals(f1276)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1564529113:
                if (str.equals(f1256)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1955888231:
                if (str.equals(f1270)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2035398868:
                if (str.equals(f1280)) {
                    c = '\t';
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
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case '\b':
                return AdContainer.RenderingProperties.PlacementType.class;
            case '\t':
                return AdContainer.EventType.class;
            case '\n':
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case '\f':
                return InMobiSdk.class;
            case '\r':
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            case 21:
                return AdResponse.class;
            case 22:
                return AdSet.class;
            case 23:
                return Ad.class;
            case 24:
                return ContextData.class;
            default:
                return null;
        }
    }
}
