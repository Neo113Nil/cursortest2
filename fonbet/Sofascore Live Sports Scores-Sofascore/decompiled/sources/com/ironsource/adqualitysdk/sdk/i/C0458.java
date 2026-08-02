package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.adcom.Ad;
import com.ironsource.adqualitysdk.sdk.StringFog;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ף, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0458 extends AbstractC0433 {

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1376 = StringFog.decrypt("R8XT2VBfbQZB2eb5VA==\n", "IKCnnTksHWo=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1375 = StringFog.decrypt("5esUfm44nC3D6g0=\n", "go5gKAdc+UI=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1374 = StringFog.decrypt("PtB4NpXh5NYw2w==\n", "WbUMd/GOibc=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1373 = StringFog.decrypt("FGQskm7ZhEQadz2YeA==\n", "cwFY0Ry85TA=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1372 = StringFog.decrypt("JVUWzNihphgn\n", "QjBijq3PwnQ=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1371 = StringFog.decrypt("dTjKNIBg3v9zJA==\n", "El2+cOkTrpM=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1370 = StringFog.decrypt("XgJZMhUAn5RYHm8XEh2Kig==\n", "OWctdnxz7/g=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1369 = StringFog.decrypt("cFaFMtzVw2tldokE7cnCenh/mAPJ\n", "FzPxcL27rQ4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1368 = StringFog.decrypt("dwpNIqYaU/Y=\n", "EG85dM9+Npk=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static final String f1367 = StringFog.decrypt("+RWzPWckgy3xBKg0diOn\n", "nnDHeB9Q018=\n");

    /* renamed from: ゥ, reason: contains not printable characters */
    public static final String f1366 = StringFog.decrypt("QQqsEAOMGkRSHbE8HQ==\n", "Jm/YUnr4fxc=\n");

    /* renamed from: へ, reason: contains not printable characters */
    public static final String f1365 = StringFog.decrypt("z/Kl8WX1dT/D7IX7ZfV1P8Ps\n", "rYvRlDaBB1Y=\n");

    /* renamed from: っ, reason: contains not printable characters */
    public static final String f1364 = StringFog.decrypt("YLZYqWZmgEBqtkKNQ2M=\n", "B9Ms+QoH4yU=\n");

    /* renamed from: く, reason: contains not printable characters */
    public static final String f1363 = StringFog.decrypt("/M8+N5F7Ebr+\n", "m6pKdvUvaMo=\n");

    /* renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1362 = StringFog.decrypt("q8EHbs/LBSW+7Rc=\n", "zKRzPaqnaUA=\n");

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1361 = StringFog.decrypt("942YXejwZgr3nIVg7+VvNO2bmHHo4XE=\n", "hOjsFIaEA3g=\n");

    /* renamed from: K, reason: contains not printable characters */
    public static final String f1360 = StringFog.decrypt("Bw7g9Ea9pB0QDvDqSrmxChoO5g==\n", "dGuUpiPKxW8=\n");

    /* renamed from: Ύ, reason: contains not printable characters */
    public static final String f1359 = StringFog.decrypt("UBOMbeu5dHFROpFc/rJ0cVE=\n", "I3b4L4rXGhQ=\n");

    /* renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1358 = StringFog.decrypt("PFAj5QVGmcoJYBn6Dg==\n", "fTRgimsy/KQ=\n");

    /* renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1357 = StringFog.decrypt("vC3Gg5gQQdCE\n", "/UmC6utgLbE=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1356 = StringFog.decrypt("oZZvCtFg6A==\n", "4PI5Y7UFhwk=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1355 = StringFog.decrypt("GUWHyBxghwQqRKTTPGWnEz1PpM8=\n", "WCHBvXAM1Gc=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1354 = StringFog.decrypt("czJbF3FqmvhXJA==\n", "MlYXfgIe/5Y=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1353 = StringFog.decrypt("9dPH/HLq/ofA\n", "tLeVmQOfm/Q=\n");

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1352 = StringFog.decrypt("Uop9SydNCTBnvk5cN1UJN3acXA==\n", "E+4vLlY4bEM=\n");

    /* renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1351 = StringFog.decrypt("583Cn2A+VQ==\n", "pqmxyxlOMIY=\n");

    /* renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1350 = StringFog.decrypt("qBmrXB6j\n", "6X39NXvU8oY=\n");

    /* renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1349 = StringFog.decrypt("Z+nJELBMVE5W/MIQsEw=\n", "JYinftU+GCc=\n");

    /* renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1348 = StringFog.decrypt("v5ZhZexoDR2YgA==\n", "/fcPC4kaW3Q=\n");

    /* renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1347 = StringFog.decrypt("YQuyxkb2d+BrDPXKSrx44GYK+dYB0HvvZgHu8kb3bQ==\n", "CGScpC+SGoE=\n");

    /* renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1346 = StringFog.decrypt("/p5IRGW1UzzSkg==\n", "vPcsCQTWO1U=\n");

    /* renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1345 = StringFog.decrypt("zps+8UnYQNPilxvY\n", "jPJavCi7KLo=\n");

    /* renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1344 = StringFog.decrypt("W05EEbevOYleU1MdorI=\n", "GDwhcMPGT+w=\n");

    /* renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1343 = StringFog.decrypt("41FQECMrQg/L\n", "qjwxd0ZvI3s=\n");

    /* renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1342 = StringFog.decrypt("Hqd9lIu+OIUjoGiduKk=\n", "V8kJ8fnNTOw=\n");

    /* renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1341 = StringFog.decrypt("GOftfhFJ5BQl4Ph3L1PjCTTn/Gk=\n", "UYmZG2M6kH0=\n");

    /* renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1340 = StringFog.decrypt("7KXic94yOQnPvs97\n", "qtCOH41RS2w=\n");

    /* renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1339 = StringFog.decrypt("OYD57FWwxO8Rkcn8RJQ=\n", "dOWdhTTxt5w=\n");

    /* renamed from: ᕂ, reason: contains not printable characters */
    public static final String f1338 = StringFog.decrypt("qv8EM1gQFFmQ\n", "55pgWjlGfTw=\n");

    /* renamed from: ᔽ, reason: contains not printable characters */
    public static final String f1337 = StringFog.decrypt("coaILXpLk0F4gc8hdgGQQW+A0CpyS9BWcozRYV5Kmkl6v88qZA==\n", "G+mmTxMv/iA=\n");

    /* renamed from: ᔺ, reason: contains not printable characters */
    public static final String f1336 = StringFog.decrypt("1yAL0xyCutw=\n", "mUF/umrn+7g=\n");

    /* renamed from: ᔹ, reason: contains not printable characters */
    public static final String f1335 = StringFog.decrypt("m9tE/wgJTJimzlX4Gx4=\n", "1bowln5sAPE=\n");

    /* renamed from: ᔲ, reason: contains not printable characters */
    public static final String f1334 = StringFog.decrypt("5SmqWBXa3BfPIb9nCtrm\n", "q0jeMWO/kXI=\n");

    /* renamed from: ᔱ, reason: contains not printable characters */
    public static final String f1333 = StringFog.decrypt("d5ZlRtCciQVklw==\n", "JfMSJ6L47GE=\n");

    /* renamed from: ᓮ, reason: contains not printable characters */
    public static final String f1332 = StringFog.decrypt("I2bdMtupy3g9atknzKPLbg==\n", "cQOqU6nNrhw=\n");

    /* renamed from: ᐱ, reason: contains not printable characters */
    public static final String f1331 = StringFog.decrypt("hSZ3P78YvSq2A30khhi3JqU=\n", "108UV/J92UM=\n");

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f1330 = StringFog.decrypt("cTAgY+e0Z8ZCDypu3Q==\n", "I1lDC6rRA68=\n");

    /* renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f1329 = StringFog.decrypt("8gTrTJRfS0j4A6xAmBVUQPgDqEuZUkcHyQKmRrBeQkD6PaxLig==\n", "m2vFLv07Jik=\n");

    /* renamed from: პ, reason: contains not printable characters */
    public static final String f1328 = StringFog.decrypt("1rgSnUMyygj5tAS5TxbPH+mlDw==\n", "gNF2+Cxipmk=\n");

    /* renamed from: ე, reason: contains not printable characters */
    public static final String f1327 = StringFog.decrypt("Jj2018qYl+YsOvPbxtKU5js77NDCmNTxJjftm/WVnuIgAvbU2pmIxiwm88PKiIM=\n", "T1KataP8+oc=\n");

    /* renamed from: ງ, reason: contains not printable characters */
    public static final String f1326 = StringFog.decrypt("8bGr3N/4fcPboL/HyeJm6A==\n", "o9TaqbqLCYY=\n");

    /* renamed from: อ, reason: contains not printable characters */
    public static final String f1325 = StringFog.decrypt("FAc=\n", "VWNmYp+YAss=\n");

    /* renamed from: ม, reason: contains not printable characters */
    public static final String f1324 = StringFog.decrypt("/jtTzS8/mhjaP1vQMg==\n", "s0kypEt++Ww=\n");

    /* renamed from: น, reason: contains not printable characters */
    public static final String f1323 = StringFog.decrypt("8TuB9BWbbEX9JompBIJ/Qrw9jbhejm5I+zDClwKCdU3TN5izBopoUA==\n", "klTs2nDjHCk=\n");

    /* renamed from: ต, reason: contains not printable characters */
    public static final String f1322 = StringFog.decrypt("uNdzy61r4EWZynXjqlvgUpzRaw==\n", "9aUSoskviSQ=\n");

    /* renamed from: ฑ, reason: contains not printable characters */
    public static final String f1321 = StringFog.decrypt("5ne1+WKUacfqar2kc416wKtxubUpgWvK7Hz2mnWNcM/Bcbm7aItYyPFxrr5zlQ==\n", "hRjY1wfsGas=\n");

    /* renamed from: ঢ়, reason: contains not printable characters */
    public static final String f1320 = StringFog.decrypt("s7Zpge8L69Sbtnuc4jbswZI=\n", "/sQI6ItChaA=\n");

    /* renamed from: ষ, reason: contains not printable characters */
    public static final String f1319 = StringFog.decrypt("Lll2Fu7+/8YGWWQL48P40w9nfgz+0v/XEQ==\n", "YysXf4q3kbI=\n");

    /* renamed from: ঘ, reason: contains not printable characters */
    public static final String f1318 = StringFog.decrypt("42j9ABjbFMzZ\n", "rhqcaXyNfak=\n");

    /* renamed from: খ, reason: contains not printable characters */
    public static final String f1317 = StringFog.decrypt("DV79Wf+Z/GwBQ/UE7oDva0BY8RW0jP5hB1W+OuiA5WQ4WPUA\n", "bjGQd5rhjAA=\n");

    /* renamed from: এ, reason: contains not printable characters */
    public static final String f1316 = StringFog.decrypt("9CtyQ3/F8ELOFXpZb/b3Qss=\n", "uVkTKhuTmSc=\n");

    /* renamed from: ऱ, reason: contains not printable characters */
    public static final String f1315 = StringFog.decrypt("Isai8ITwrJ4CzqX9\n", "dKfRhMWT2Pc=\n");

    /* renamed from: ܟ, reason: contains not printable characters */
    public static final String f1314 = StringFog.decrypt("d34MhMGKXpR7YwTZ0JNNkzp4AMiKhE+LYD8AydCbWJFgaE/8xYFauXdlCNzNhlc=\n", "FBFhqqTyLvg=\n");

    /* renamed from: ܘ, reason: contains not printable characters */
    public static final String f1313 = StringFog.decrypt("83qhn63n0M0=\n", "pRvS6/uOtbo=\n");

    /* renamed from: ے, reason: contains not printable characters */
    public static final String f1312 = StringFog.decrypt("PoECHCHsaOYynApBMPV74XOHDlBq4nn5KcAOUTD9buMpl0FkJeds3DSLGA==\n", "Xe5vMkSUGIo=\n");

    /* renamed from: ۉ, reason: contains not printable characters */
    public static final String f1311 = StringFog.decrypt("5cc12q1uNxLB0CM=\n", "qLVUs8kvU0Q=\n");

    /* renamed from: ۅ, reason: contains not printable characters */
    public static final String f1310 = StringFog.decrypt("aF8guE2icuNkQijlXLth5CVZLPQGt3DuYlRj21q7a+tKVBv/Ta0=\n", "CzBNlijaAo8=\n");

    /* renamed from: ڑ, reason: contains not printable characters */
    public static final String f1309 = StringFog.decrypt("k7dGnO+NuFiJv0ac3Iq4XQ==\n", "xdY16Lnk3S8=\n");

    public C0458(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﻛ */
    public final String mo115() {
        try {
            C1050 c1050 = C0267.m139().f487;
            String decrypt = StringFog.decrypt("Ea5C/ByAwrpkrkKD\n", "T/Imp0Dk7Oc=\n");
            c1050.getClass();
            return C1050.m621((Object) null, BidMachine.class, decrypt);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾇ */
    public final HashMap mo116() {
        HashMap hashMap = new HashMap();
        hashMap.put(f1376, new C0541(this));
        hashMap.put(f1375, new C0535(this));
        hashMap.put(f1372, new C0533(this));
        hashMap.put(f1371, new C0522(this));
        hashMap.put(f1370, new C0511(this));
        hashMap.put(f1369, new C0502(this));
        hashMap.put(f1368, new C0488(this));
        hashMap.put(f1374, new C0487(this));
        hashMap.put(f1373, new C0471(this));
        hashMap.put(f1364, new C0565(this));
        hashMap.put(f1363, new C0560(this));
        hashMap.put(f1362, new C0557(this));
        hashMap.put(f1361, new C0554(this));
        hashMap.put(f1360, new C0553(this));
        hashMap.put(f1359, new C0551(this));
        hashMap.put(f1367, new C0550(this));
        hashMap.put(f1366, new C0548(this));
        hashMap.put(f1365, new C0545(this));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0433
    /* renamed from: ﾒ */
    public final Class mo117(String str) {
        char c;
        switch (str.hashCode()) {
            case -2127904484:
                if (str.equals(f1331)) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -2032115546:
                if (str.equals(f1344)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1921270373:
                if (str.equals(f1315)) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -1798479256:
                if (str.equals(f1314)) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -1683121555:
                if (str.equals(f1345)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1628534628:
                if (str.equals(f1318)) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1627944928:
                if (str.equals(f1349)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1518365947:
                if (str.equals(f1309)) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -1507727624:
                if (str.equals(f1337)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1371195010:
                if (str.equals(f1340)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1246480821:
                if (str.equals(f1328)) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1146475727:
                if (str.equals(f1313)) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -1087582685:
                if (str.equals(f1320)) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1011229113:
                if (str.equals(f1321)) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -838844802:
                if (str.equals(f1312)) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -642689680:
                if (str.equals(f1316)) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (str.equals(f1333)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -589219056:
                if (str.equals(f1358)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -572702516:
                if (str.equals(f1353)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -475472046:
                if (str.equals(f1355)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -211807062:
                if (str.equals(f1346)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -150492023:
                if (str.equals(f1338)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(f1325)) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1282165:
                if (str.equals(f1317)) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 3368703:
                if (str.equals(f1357)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 141091039:
                if (str.equals(f1323)) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(f1342)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 503762424:
                if (str.equals(f1356)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 529939434:
                if (str.equals(f1351)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 625873720:
                if (str.equals(f1310)) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 713768498:
                if (str.equals(f1334)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 737636858:
                if (str.equals(f1327)) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 742497451:
                if (str.equals(f1329)) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 745946635:
                if (str.equals(f1335)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 961844241:
                if (str.equals(f1348)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1125320581:
                if (str.equals(f1343)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1165508119:
                if (str.equals(f1354)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1212533506:
                if (str.equals(f1332)) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1297340448:
                if (str.equals(f1341)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1387614166:
                if (str.equals(f1352)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1395486086:
                if (str.equals(f1324)) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1444286894:
                if (str.equals(f1322)) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1461955341:
                if (str.equals(f1330)) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1494941328:
                if (str.equals(f1326)) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1917129446:
                if (str.equals(f1339)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1955913096:
                if (str.equals(f1350)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2034998687:
                if (str.equals(f1311)) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 2110329530:
                if (str.equals(f1336)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2112955383:
                if (str.equals(f1319)) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 2136410007:
                if (str.equals(f1347)) {
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
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case '\b':
                return AdView.class;
            case '\t':
                return BannerListener.class;
            case '\n':
            case 11:
                return BannerView.class;
            case '\f':
                return BidMachine.class;
            case '\r':
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialListener.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return MediaView.class;
            case 22:
                return NativeAd.class;
            case 23:
                return NativeListener.class;
            case 24:
                return NativeMediaView.class;
            case 25:
                return RewardedAd.class;
            case 26:
                return RewardedListener.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case 31:
                return VideoPlayerActivity.class;
            case ' ':
                return Ad.class;
            case '!':
            case '\"':
                return MraidActivity.class;
            case '#':
            case '$':
                return MraidDialogActivity.class;
            case '%':
                return MraidInterstitial.class;
            case '&':
                return MraidInterstitialListener.class;
            case '\'':
            case '(':
                return MraidView.class;
            case ')':
                return MraidViewListener.class;
            case '*':
            case '+':
                return VastActivity.class;
            case ',':
            case '-':
                return VastView.class;
            case '.':
            case '/':
                return MraidAdView.class;
            case '0':
                return VastViewListener.class;
            case '1':
                return RequestExtension.class;
            default:
                return null;
        }
    }
}
