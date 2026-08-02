package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.monetization.ads.base.model.reward.RewardData;
import com.vungle.ads.internal.protos.Sdk;
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
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ci extends be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1330 = 720074175611530066L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1331 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1332 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1333 = {-1396376767, 1536672479, 1967225926, 489902690, -811992244, -266979684, -1129295330, -450638482, 195175819, -1407300830, 399241809, 1665798770, 63868480, -1705372748, 1062963671, 1205996560, -841619603, 761664175};

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ AdInfo m7111(RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = f1331 + 21;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        AdInfo m7135 = m7135(rewardedAd);
        int i4 = f1332 + 35;
        f1331 = i4 % 128;
        int i5 = i4 % 2;
        return m7135;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m7112(AdInfo adInfo) {
        int i = 2 % 2;
        int i2 = f1332 + 103;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        String m7128 = m7128(adInfo);
        int i4 = f1331 + 5;
        f1332 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return m7128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m7113(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1332 + 35;
        f1331 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m7133(impressionData);
            super.hashCode();
            throw null;
        }
        String m7133 = m7133(impressionData);
        int i3 = f1331 + 69;
        f1332 = i3 % 128;
        if (i3 % 2 != 0) {
            return m7133;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m7114(Reward reward) {
        int i = 2 % 2;
        int i2 = f1331 + 53;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        String m7136 = m7136(reward);
        int i4 = f1331 + 41;
        f1332 = i4 % 128;
        int i5 = i4 % 2;
        return m7136;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m7118(VideoController videoController, VideoEventListener videoEventListener) {
        int i = 2 % 2;
        int i2 = f1332 + 95;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        m7130(videoController, videoEventListener);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m7119(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i = 2 % 2;
        int i2 = f1332 + 3;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        m7134(interstitialAd, interstitialAdEventListener);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m7120(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i = 2 % 2;
        int i2 = f1332 + 97;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        m7131(rewardedAd, rewardedAdEventListener);
        int i4 = f1332 + 89;
        f1331 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ int m7121(Reward reward) {
        int i = 2 % 2;
        int i2 = f1331 + 49;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        int m7126 = m7126(reward);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return m7126;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ MediaFile m7123(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f1332 + 45;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        MediaFile m7127 = m7127(videoAd);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return m7127;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m7124(MediaFile mediaFile) {
        int i = 2 % 2;
        int i2 = f1332 + 77;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        String m7115 = m7115(mediaFile);
        int i4 = f1331 + 111;
        f1332 = i4 % 128;
        int i5 = i4 % 2;
        return m7115;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m7129(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = 2 % 2;
        int i2 = f1331 + 97;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        m7138(bannerAdView, bannerAdEventListener);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ AdInfo m7132(InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = f1331 + 5;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        AdInfo m7122 = m7122(interstitialAd);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        int i5 = f1332 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1331 = i5 % 128;
        if (i5 % 2 == 0) {
            return m7122;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m7137(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f1331 + 113;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        String m7116 = m7116(videoAd);
        int i4 = f1332 + 1;
        f1331 = i4 % 128;
        if (i4 % 2 == 0) {
            return m7116;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public ci(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1331 + 59;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        String libraryVersion = MobileAds.getLibraryVersion();
        int i4 = f1332 + 7;
        f1331 = i4 % 128;
        int i5 = i4 % 2;
        return libraryVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f9, code lost:
    
        if (r15.equals(m7125("\ueb31뀲崡祝蜗ⱸ쥦陟㍏\ud8ad旪ʚ꾉瓳ᇩ뻟寇\ue083谽⤫\uf60d鍇㡻앤扗\u0f48풻熩Ộ뮠䃴\uedc2諑埉ﳅ頩┧숍漑", android.view.View.MeasureSpec.getMode(0) + 23311).intern()) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0244, code lost:
    
        if (r15.equals(m7117(new int[]{-1706205425, 1788459475, -1769132660, 1788544833, 1690296975, 627763800, -1066721835, 1342430990, -1241409074, -518107366}, 17 - android.text.TextUtils.lastIndexOf("", '0', 0, 0)).intern()) != false) goto L77;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        int i = 2 % 2;
        int i2 = f1332 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        char c = 14;
        switch (str.hashCode()) {
            case -1850459313:
                if (str.equals(m7117(new int[]{-1703354036, 563804431, 1448248551, -1774170433}, Color.red(0) + 6).intern())) {
                    int i4 = f1331 + 51;
                    f1332 = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
                c = 65535;
                break;
            case -1836618638:
                if (str.equals(m7125("\ueb13ʏ㡡嘚䷂箦酲輴ꛮ\udcaa", 59881 - AndroidCharacter.getMirror('0')).intern())) {
                    int i6 = f1331 + 45;
                    f1332 = i6 % 128;
                    if (i6 % 2 != 0) {
                        c = 0;
                        break;
                    }
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1666698098:
                if (str.equals(m7125("\ueb1f邦ᰆ駪Ւ脰ັ訋㟹", 31643 - TextUtils.indexOf("", "", 0)).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1401317165:
                c = '\n';
                break;
            case -1338246468:
                if (str.equals(m7117(new int[]{1893902667, -904170779, 949762177, -676177148, 928825236, -1269258360, -1873959174, 1363447781, 509470075, 709866850, -1702362358, 1791594962, 691117189, -2047026438, -376693504, 285944365, 1081518631, 469055972, -1816455697, -484661586, -1090279297, 1177932737}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41).intern())) {
                    int i7 = f1332 + 91;
                    f1331 = i7 % 128;
                    if (i7 % 2 == 0) {
                        c = '\b';
                        break;
                    } else {
                        c = 'l';
                        break;
                    }
                }
                c = 65535;
                break;
            case -1139615429:
                break;
            case -1115843213:
                if (str.equals(m7117(new int[]{-1515341837, -1972656218, 527855203, -1198371663, -2120881438, 1673248865, 1478723406, 1185393701}, 14 - Color.argb(0, 0, 0, 0)).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -650052115:
                if (str.equals(m7117(new int[]{-1706205425, 1788459475, 1480714116, 1468617723, -1405846124, 611018494, 568886527, 752674398, 632155538, -1447656321, 1409809711, 1505297724}, 23 - KeyEvent.keyCodeFromString("")).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -610771047:
                if (str.equals(m7117(new int[]{-1703354036, 563804431, -1695257451, 1550068378, 1478723406, 1185393701}, 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -609786639:
                if (!(!str.equals(m7117(new int[]{-1703354036, 563804431, 929902379, -379559278, -1346236138, -1350064768}, 9 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()))) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -572702516:
                if (str.equals(m7117(new int[]{-196050398, -399857613, -1118017227, 1670746493, -1904967977, -2077781985}, 9 - (Process.myPid() >> 22)).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -564429827:
                if (str.equals(m7117(new int[]{-1703354036, 563804431, 929902379, -379559278, -743304575, 696607243, 594029788, 679761714, 632155538, -1447656321, 1409809711, 1505297724}, 23 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -150968480:
                if (str.equals(m7125("\ueb1f☊煌貌\udfc7\ue925\u2455瞕苟", (ViewConfiguration.getLongPressTimeout() >> 16) + 52541).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 308060116:
                if (str.equals(m7125("\ueb10帾脦\uf41b㼃扡핝ᡭ䍬뙎例Ⲫ", View.resolveSizeAndState(0, 0, 0) + 46349).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(m7125("\ueb1b\udac3裘绊Ⳝዚ샜뛂擞⫌ᣅ컋볧担", 12799 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 871099991:
                if (str.equals(m7117(new int[]{-1706205425, 1788459475, 578501607, -500785932, 1089891535, 685544047, -678872703, 1801386342}, (ViewConfiguration.getEdgeSlop() >> 16) + 15).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 957243679:
                if (str.equals(m7125("\ueb10頎െ늋⟃ꬑ塽춝狿\ue601歕ᢣ跺ㄇꙭ⮲\ud8f6䰺\uf176暰\uebe4", 29501 - Color.green(0)).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1228411167:
                if (str.equals(m7125("\ueb1b籧얐\u2d26뙌ῦ朄졆凾뤈ʽ毗\uf357䒩귭㕱麇\ue637佀탟㠧腖\ueaf4爚\udbb4Ⳕ됞", TextUtils.indexOf("", "", 0) + 38747).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1955530641:
                if (str.equals(m7125("\ueb13콉ꏥ虁竈嵆", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9342).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1955869213:
                if (str.equals(m7117(new int[]{-1343365292, -124949988, -973747466, -525289508}, KeyEvent.normalizeMetaState(0) + 6).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2117435870:
                if (str.equals(m7125("\ueb04擲\uf4a4䑬퐙◾떀", TextUtils.getTrimmedLength("") + 36809).intern())) {
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
                int i8 = f1331 + 53;
                f1332 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 62 / 0;
                }
                return AdActivity.class;
            case 2:
                int i10 = f1331 + 33;
                f1332 = i10 % 128;
                int i11 = i10 % 2;
                return AdInfo.class;
            case 3:
                return AdRequest.class;
            case 4:
                return AdType.class;
            case 5:
                int i12 = f1332 + 115;
                f1331 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 67 / 0;
                }
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

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m7125("\ueb35䯾ꪴै栒죪⾊蹄\ued6e䰊곬", TextUtils.indexOf((CharSequence) "", '0', 0) + 41162).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ci.m7112((AdInfo) list.get(0));
            }
        });
        hashMap.put(m7125("\ueb35頺഼눧✇푤奘침獎\ue046", 29453 - View.resolveSizeAndState(0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ci.m7113((ImpressionData) list.get(0));
            }
        });
        hashMap.put(m7125("\ueb21쮜ꩰ褅榗䡡⼵ྐ\uee4f촧궙豥挢䎱≡Ĥ\ue196쁬Ꜻ螆晼", 8363 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                ci.m7118((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m7125("\ueb35裶Ⲥ쁘搸᧤붠兰\uf528櫨ຬꉰ䘪ﯶ龽㍱휋瓭\ue8a6豮", 25537 - Color.argb(0, 0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ci.m7132((InterstitialAd) list.get(0));
            }
        });
        hashMap.put(m7117(new int[]{-1932153295, -611277800, -1180887521, -1518403096, -1572016753, -2018521409, -70863340, 49711341}, 15 - View.combineMeasuredStates(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Integer.valueOf(ci.m7121((Reward) list.get(0)));
            }
        });
        hashMap.put(m7125("\ueb35䞼눰\ueea1夛떒\ue071峭轮ﯥ噅苛ﶳ", (Process.myTid() >> 22) + 44171).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ci.m7114((Reward) list.get(0));
            }
        });
        hashMap.put(m7125("\ueb35ࠔⵠ䉩枻蒊맡\uded5\uf22eᜌ㑨⦒互揜胖ꐹ\ud90d", View.MeasureSpec.getMode(0) + 58147).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ci.m7111((RewardedAd) list.get(0));
            }
        });
        hashMap.put(m7125("\ueb21缶쌤圃묳༠錵\ue727䬾\udf3e⌼뜘ᬺ漚\uf32a䜸ꬬ㼷茌ᜨ笵켳匡ꜫଯ鼹", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37889).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                ci.m7120((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m7125("\ueb21楘\ueff8汖\ue280服\ue5ad稩\uf859绁\uf36d燣\uf60f璐줬侒췆䉈샪䔊\udb90堽\ude94峂텉埱푱⪉꼓ⶳ", 33390 - Process.getGidForName("")).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                ci.m7119((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m7125("\ueb35伌ꍐޮ篛\ude11㉙隮쫌\u2d28腰\ue5be姃뷟င", Process.getGidForName("") + 42044).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ci.m7124((MediaFile) list.get(0));
            }
        });
        hashMap.put(m7117(new int[]{-49306377, 326647385, -1775945423, -1369555394, -383045618, 1963400076, -1349409348, 786705187, 1796814311, -685680829}, TextUtils.indexOf("", "", 0) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ci.m7123((VideoAd) list.get(0));
            }
        });
        hashMap.put(m7117(new int[]{-49306377, 326647385, -1775945423, -1369555394, -1392286269, -1720793143, 1933700878, 767088917}, 14 - View.combineMeasuredStates(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ci.m7137((VideoAd) list.get(0));
            }
        });
        hashMap.put(m7117(new int[]{534005965, 765034874, -2113525048, 1389128009, 452827938, 735818359, 1841065906, -362518639, -639117453, 1593560874, -1980288103, 340338366}, TextUtils.indexOf("", "") + 24).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                ci.m7129((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i2 = f1331 + 89;
        f1332 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7128(AdInfo adInfo) {
        int i = 2 % 2;
        int i2 = f1332 + 77;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        String adUnitId = adInfo.getAdUnitId();
        int i4 = f1331 + 115;
        f1332 = i4 % 128;
        int i5 = i4 % 2;
        return adUnitId;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7133(ImpressionData impressionData) {
        int i = 2 % 2;
        int i2 = f1331 + 45;
        f1332 = i2 % 128;
        if (i2 % 2 != 0) {
            return impressionData.getRawData();
        }
        impressionData.getRawData();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m7130(VideoController videoController, VideoEventListener videoEventListener) {
        int i = 2 % 2;
        int i2 = f1332 + 19;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        videoController.setVideoEventListener(videoEventListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static AdInfo m7122(InterstitialAd interstitialAd) {
        int i = 2 % 2;
        int i2 = f1331 + 19;
        f1332 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            interstitialAd.getInfo();
            super.hashCode();
            throw null;
        }
        AdInfo info = interstitialAd.getInfo();
        int i3 = f1332 + 41;
        f1331 = i3 % 128;
        if (i3 % 2 == 0) {
            return info;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int m7126(Reward reward) {
        int i = 2 % 2;
        int i2 = f1332 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        int amount = reward.getAmount();
        int i4 = f1331 + 67;
        f1332 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return amount;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7136(Reward reward) {
        int i = 2 % 2;
        int i2 = f1332 + 3;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        String type = reward.getType();
        int i4 = f1331 + 71;
        f1332 = i4 % 128;
        int i5 = i4 % 2;
        return type;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static AdInfo m7135(RewardedAd rewardedAd) {
        int i = 2 % 2;
        int i2 = f1332 + 115;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        AdInfo info = rewardedAd.getInfo();
        int i4 = f1332 + 7;
        f1331 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return info;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m7131(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i = 2 % 2;
        int i2 = f1331 + 27;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f1331 + 81;
        f1332 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m7134(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i = 2 % 2;
        int i2 = f1332 + 1;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f1332 + 61;
        f1331 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7115(MediaFile mediaFile) {
        int i = 2 % 2;
        int i2 = f1331 + 17;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        String url = mediaFile.getUrl();
        int i4 = f1331 + 29;
        f1332 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return url;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static MediaFile m7127(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f1331 + 45;
        f1332 = i2 % 128;
        if (i2 % 2 == 0) {
            videoAd.getMediaFile();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        MediaFile mediaFile = videoAd.getMediaFile();
        int i3 = f1332 + 55;
        f1331 = i3 % 128;
        int i4 = i3 % 2;
        return mediaFile;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7116(VideoAd videoAd) {
        int i = 2 % 2;
        int i2 = f1331 + 15;
        f1332 = i2 % 128;
        int i3 = i2 % 2;
        String info = videoAd.getInfo();
        int i4 = f1332 + 63;
        f1331 = i4 % 128;
        if (i4 % 2 == 0) {
            return info;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m7138(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = 2 % 2;
        int i2 = f1332 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1331 = i2 % 128;
        int i3 = i2 % 2;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        int i4 = f1331 + 63;
        f1332 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7125(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1330);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7117(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1333.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
