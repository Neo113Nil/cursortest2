package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdFormat;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdState;
import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class br extends be {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1015 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1016 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1017 = {264346912, -1402984295, -2076986834, 984640320, -1640864717, -1420702693, 133322910, -1731791057, 1343092359, 1846230863, -1378514810, 1268657335, -1824368258, -1201273879, 128381680, -506839168, 784709575, -1790671362};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1018 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1019 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1020 = 435848138;

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ FiveAd m6676() {
        int i = 2 % 2;
        int i2 = f1019 + 111;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        FiveAd m6678 = m6678();
        int i4 = f1015 + 35;
        f1019 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6678;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ CreativeType m6682(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1015 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1019 = i2 % 128;
        int i3 = i2 % 2;
        CreativeType m6675 = m6675(fiveAdInterface);
        int i4 = f1019 + 13;
        f1015 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6675;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m6686(FiveAdCustomLayout fiveAdCustomLayout) {
        int i = 2 % 2;
        int i2 = f1019 + 15;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        String m6692 = m6692(fiveAdCustomLayout);
        int i4 = f1019 + 111;
        f1015 = i4 % 128;
        int i5 = i4 % 2;
        return m6692;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m6687(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1019 + 65;
        f1015 = i2 % 128;
        if (i2 % 2 == 0) {
            m6679(fiveAdInterface);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String m6679 = m6679(fiveAdInterface);
        int i3 = f1019 + 63;
        f1015 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return m6679;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m6688(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i = 2 % 2;
        int i2 = f1019 + 81;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        m6695(fiveAdInterface, fiveAdLoadListener);
        int i4 = f1015 + 15;
        f1019 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6689(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1015 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1019 = i2 % 128;
        int i3 = i2 % 2;
        String m6680 = m6680(fiveAdInterface);
        int i4 = f1019 + 15;
        f1015 = i4 % 128;
        int i5 = i4 % 2;
        return m6680;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6691(FiveAdConfig fiveAdConfig) {
        int i = 2 % 2;
        int i2 = f1019 + 91;
        f1015 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6683(fiveAdConfig);
        }
        m6683(fiveAdConfig);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6693(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1015 + 15;
        f1019 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6677(fiveAdInterface);
        }
        m6677(fiveAdInterface);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m6696(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = 2 % 2;
        int i2 = f1015 + 61;
        f1019 = i2 % 128;
        int i3 = i2 % 2;
        m6685(fiveAdInterface, fiveAdViewEventListener);
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ FiveAdListener m6697(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1015 + 61;
        f1019 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6681(fiveAdInterface);
        }
        m6681(fiveAdInterface);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m6698(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i = 2 % 2;
        int i2 = f1015 + 43;
        f1019 = i2 % 128;
        int i3 = i2 % 2;
        m6694(fiveAdInterface, fiveAdListener);
        int i4 = f1019 + 31;
        f1015 = i4 % 128;
        int i5 = i4 % 2;
    }

    public br(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1019 + 21;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        int i4 = f1019 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1015 = i4 % 128;
        if (i4 % 2 != 0) {
            return sdkSemanticVersion;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        int i = 2 % 2;
        int i2 = f1019 + 21;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        char c = 0;
        switch (str.hashCode()) {
            case -1836618638:
                if (!(!str.equals(m6684(new int[]{1855122119, -1851351344, -824314122, -402939328, 1437127973, 869938594}, 10 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()))) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1782131271:
                if (str.equals(m6684(new int[]{-1405448215, -973662514, -2112912638, -1633593357, -883577635, -1756408075, -404147276, -115609557, 138083762, -1661432202, -218598282, -421645486, 1012120119, 1417180854, 1311167316, 252329461}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30).intern())) {
                    int i4 = f1015 + 107;
                    f1019 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -962125644:
                if (str.equals(m6690((char) Drawable.resolveOpacity(0, 0), "\u0000\u0000\u0000\u0000", "烛뼫\uf604倫", "媍虧◞樻\udee0쏪嬉䅮蓄且盄ｒ齃阠봱慈零\uf604갂ﳨ꺽䱭鷌", (Process.myTid() >> 22) + 79637360).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -939888073:
                if (str.equals(m6684(new int[]{-1405448215, -973662514, 518558503, 1345816137, -1812121171, 1124371799}, 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    int i6 = f1019 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    f1015 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -853874964:
                if (str.equals(m6684(new int[]{-1405448215, -973662514, -617730134, -1516653898, -1214981511, 1819079918}, TextUtils.lastIndexOf("", '0', 0) + 13).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -735613671:
                if (str.equals(m6684(new int[]{-171568920, 1735098032, -890295425, -123532516, -1435658131, 1053023987, -1927155915, 1078230416, 1253132871, 2145337758, -176724831, 1676238827, -1059811328, 86617616}, 27 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -624329424:
                if (str.equals(m6684(new int[]{-1405448215, -973662514, -1399689818, 362587236, 853135605, 806747282, -1329610025, -1105734658, 1487724629, 1871477829}, 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    int i8 = f1015 + 49;
                    f1019 = i8 % 128;
                    if (i8 % 2 == 0) {
                        c = 3;
                        break;
                    }
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -295916403:
                if (str.equals(m6684(new int[]{-1405448215, -973662514, -1376360902, -1375089450, 2021603753, -190847501, -1017298472, -1428315445, -1766113378, 809570922, -1817076833, 2130684475, 1108640259, 1735540533, -1554124992, 651311707}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30).intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -189625759:
                if (str.equals(m6690((char) (10609 - (Process.myPid() >> 22)), "\u0000\u0000\u0000\u0000", "㍀䔲煔ऩ", "\uec0d\u20faꂃ邫ꄴ敛⟀娇捏䷬嶦킄褵ﻶ䴠暢\uee2d鈨", TextUtils.indexOf("", "", 0)).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -6611420:
                if (str.equals(m6684(new int[]{-1405448215, -973662514, -1376360902, -1375089450, 1668232161, 800667499, 888128328, -289469190}, TextUtils.indexOf("", "", 0) + 15).intern())) {
                    int i9 = f1019 + 11;
                    f1015 = i9 % 128;
                    int i10 = i9 % 2;
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 636996201:
                if (str.equals(m6684(new int[]{-1405448215, -973662514, -1708669054, -1139753670, 1012120119, 1417180854, 1311167316, 252329461}, Gravity.getAbsoluteGravity(0, 0) + 14).intern())) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 890103511:
                if (str.equals(m6684(new int[]{-171568920, 1735098032, -890295425, -123532516, -1435658131, 1053023987, -1927155915, 1078230416, 1703415018, -2035074698, 233918693, 1119850619, -610492197, -1588114291, -1618241918, -1194052986, 723510945, -975689051}, 36 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1252059573:
                if (!(!str.equals(m6684(new int[]{-1405448215, -973662514, -2112912638, -1633593357, -883577635, -1756408075, -404147276, -115609557, 1636233129, -621705038}, TextUtils.getOffsetAfter("", 0) + 17).intern()))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1508614908:
                if (str.equals(m6690((char) ((-1) - ImageFormat.getBitsPerPixel(0)), "\u0000\u0000\u0000\u0000", "臇켦焜점", "\u0de1홃\ue276\ude93Ḝ\uddd7ꀪ뮿\ue9bf搷奂", View.MeasureSpec.getSize(0) + 483337857).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1835584239:
                if (str.equals(m6690((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37286), "\u0000\u0000\u0000\u0000", "뀼ަꙟ誑", "̾䤱\ue6fbꋢꐦ\ua95c\uf73e蔰䅧ƍ찙ఎ\udad2\uf84c筇\udeda폸蠠", ViewConfiguration.getPressedStateDuration() >> 16).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1942443945:
                if (str.equals(m6684(new int[]{-1198262165, -334050979, 1264272905, -724492148, -2083488936, 1854422456}, (Process.myTid() >> 22) + 12).intern())) {
                    int i11 = f1015 + 69;
                    f1019 = i11 % 128;
                    int i12 = i11 % 2;
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2104624789:
                if (str.equals(m6690((char) (TextUtils.indexOf("", "", 0, 0) + 24587), "\u0000\u0000\u0000\u0000", "ሏ\uf33aீ\ue260", "瞯\ueabd烵䟕ㇷ治", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    int i13 = f1015 + 47;
                    f1019 = i13 % 128;
                    int i14 = i13 % 2;
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
                return FiveAd.class;
            case 1:
                return CreativeType.class;
            case 2:
                return FiveAdConfig.class;
            case 3:
            case 4:
                return FiveAdCustomLayout.class;
            case 5:
                return FiveAdFormat.class;
            case 6:
                return FiveAdInterface.class;
            case 7:
                int i15 = f1019 + 15;
                f1015 = i15 % 128;
                int i16 = i15 % 2;
                return FiveAdInterstitial.class;
            case '\b':
                return FiveAdListener.class;
            case '\t':
                return FiveAdVideoReward.class;
            case '\n':
                return FiveAdState.class;
            case 11:
                return FiveAdLoadListener.class;
            case '\f':
                return FiveAdViewEventListener.class;
            case '\r':
            case 14:
                return AdActivity.class;
            case 15:
                return FiveAdInterstitialEventListener.class;
            case 16:
                return FiveAdVideoRewardEventListener.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6690((char) (ExpandableListView.getPackedPositionChild(0L) + 1), "\u0000\u0000\u0000\u0000", "蛦ꦫꝇ욷", "槁霫\ue940茮\ud843䝬\ue9d5漜獆ᶌḉ♿嵵磻븞돊먈蔺᱙瑟", ((byte) KeyEvent.getModifierMetaStateMask()) + 1).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return br.m6691((FiveAdConfig) list.get(0));
            }
        });
        hashMap.put(m6690((char) (ImageFormat.getBitsPerPixel(0) + 1), "\u0000\u0000\u0000\u0000", "퇰ቑ꧙㬚", "\ue442酻銇\uf3d6㍪\udce6챆\uda12䮳\ue726\udfd7疜땯耡᧐ᑗ쭢뾒ᷪ㩷ꖬ荂㎇\uf7fb", (-1) - TextUtils.lastIndexOf("", '0')).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return br.m6687((FiveAdInterface) list.get(0));
            }
        });
        hashMap.put(m6690((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", "⬼蒡鯉困", "욤薃\uf5a7\ueb67鿠伶먠쁰␤\uef69䊣㓒鄳̜㵶䒛\uf86aꉑ㿔獐占", (-914054869) - View.resolveSizeAndState(0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return br.m6693((FiveAdInterface) list.get(0));
            }
        });
        hashMap.put(m6684(new int[]{-2046152000, 2008326612, 1109253726, 1918371048, -701016519, 284653523, 391771395, -1024960378, -288388751, -1806972954, 405317885, 866098962, -66411064, -1965219827, -167990961, 1160657948}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return br.m6682((FiveAdInterface) list.get(0));
            }
        });
        hashMap.put(m6690((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30800), "\u0000\u0000\u0000\u0000", "\ufb1aẗ傤\u2e78", "뚾⽕⩻쾂㙪䕺∸ⷊ㔦ᡬ눭蚃㎅쒢䤠译삡긖ﱭ\uecab⽶\ue5ce鳾厽楶짪甋ꮩࣄ", (-1541498884) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return br.m6689((FiveAdInterface) list.get(0));
            }
        });
        hashMap.put(m6690((char) (55299 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "гǭ̖铘", "\uef20\ue954嚕\u0011剏ﶋ쇛傪\uda54\u0cd1桜㣺ㅟ\u0ff2鉯忨뺽\ue9b2국뫗\ueaffྺ骮㿪詢嵯", ViewConfiguration.getTapTimeout() >> 16).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return br.m6697((FiveAdInterface) list.get(0));
            }
        });
        hashMap.put(m6684(new int[]{1574754667, -455673796, 1109253726, 1918371048, -701016519, 284653523, 391771395, -1024960378, -1693452390, 1993290831, 1012120119, 1417180854, 1311167316, 252329461}, 26 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                br.m6698((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6690((char) (8727 - ImageFormat.getBitsPerPixel(0)), "\u0000\u0000\u0000\u0000", "앐⊖ᣇȢ", "쓊튧ꭆ䅇\ue2e1됕綢얕鶩ፀཌྷ돑⍂䵺\uea08⮸鯚\ue1dd", ViewConfiguration.getLongPressTimeout() >> 16).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return br.m6676();
            }
        });
        hashMap.put(m6684(new int[]{-2046152000, 2008326612, 1109253726, 1918371048, 929620985, 1743737285, -727934418, 931594368, -528505962, -198472039, -94021281, -1103871068, -1539894359, -1897406953, -259010491, -569491951, 711897696, 388281785}, 36 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return br.m6686((FiveAdCustomLayout) list.get(0));
            }
        });
        hashMap.put(m6684(new int[]{588448309, -2099822164, 1144398316, 1565371233, 1108640259, 1735540533, -1554124992, 651311707}, 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                br.m6688((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6684(new int[]{1400432121, -1109551601, -602176690, -767423754, -1851840411, -937458543, 1851822823, -943574069, 335726923, 1868149601}, 21 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                br.m6696((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        int i2 = f1015 + 29;
        f1019 = i2 % 128;
        if (i2 % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6683(FiveAdConfig fiveAdConfig) {
        int i = 2 % 2;
        int i2 = f1019 + 53;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        String str = fiveAdConfig.appId;
        int i4 = f1019 + 103;
        f1015 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m6679(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1019 + 83;
        f1015 = i2 % 128;
        if (i2 % 2 == 0) {
            fiveAdInterface.getSlotId();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String slotId = fiveAdInterface.getSlotId();
        int i3 = f1015 + 81;
        f1019 = i3 % 128;
        int i4 = i3 % 2;
        return slotId;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static String m6677(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1019 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = f1015 + 93;
        f1019 = i5 % 128;
        int i6 = i5 % 2;
        return fiveAdTag;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static CreativeType m6675(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1019 + 41;
        f1015 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            fiveAdInterface.getCreativeType();
            super.hashCode();
            throw null;
        }
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        int i3 = f1019 + 81;
        f1015 = i3 % 128;
        if (i3 % 2 != 0) {
            return creativeType;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m6680(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1015 + 33;
        f1019 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            fiveAdInterface.getAdParameter();
            super.hashCode();
            throw null;
        }
        String adParameter = fiveAdInterface.getAdParameter();
        int i3 = f1015 + 97;
        f1019 = i3 % 128;
        if (i3 % 2 == 0) {
            return adParameter;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static FiveAdListener m6681(FiveAdInterface fiveAdInterface) {
        int i = 2 % 2;
        int i2 = f1019 + 21;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        FiveAdListener listener = fiveAdInterface.getListener();
        int i4 = f1015 + 29;
        f1019 = i4 % 128;
        if (i4 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m6694(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i = 2 % 2;
        int i2 = f1015 + 87;
        f1019 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setListener(fiveAdListener);
        int i4 = f1019 + 107;
        f1015 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static FiveAd m6678() {
        int i = 2 % 2;
        int i2 = f1019 + 17;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        FiveAd singleton = FiveAd.getSingleton();
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return singleton;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6692(FiveAdCustomLayout fiveAdCustomLayout) {
        int i = 2 % 2;
        int i2 = f1019 + 87;
        f1015 = i2 % 128;
        if (i2 % 2 != 0) {
            return fiveAdCustomLayout.getAdvertiserName();
        }
        fiveAdCustomLayout.getAdvertiserName();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m6685(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = 2 % 2;
        int i2 = f1015 + 61;
        f1019 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f1019 + 49;
        f1015 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m6695(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i = 2 % 2;
        int i2 = f1019 + 21;
        f1015 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6690(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f1016) ^ f1020) ^ f1018);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6684(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1017.clone();
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
