package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.vungle.ads.internal.protos.Sdk;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cc extends be {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f1249 = {-1520077558, 1016223665, -2036947809, 124108889, 881729005, 701067887, 443472419, -397500749, -859732575, 2010358546, -213107309, -517543647, -311662683, 1158140065, 199096735, 1095231318, 1414846413, -1691211207};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1250 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1251 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1252 = 1196782921867625397L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1253;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Map m7019(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1251 + 81;
        f1250 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> m7018 = m7018(advertisement);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return m7018;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Placement m7021(Repository repository, String str) {
        int i = 2 % 2;
        int i2 = f1250 + 115;
        f1251 = i2 % 128;
        int i3 = i2 % 2;
        Placement m7025 = m7025(repository, str);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return m7025;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m7023(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1250 + 69;
        f1251 = i2 % 128;
        int i3 = i2 % 2;
        String m7022 = m7022(advertisement);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = f1251 + 29;
        f1250 = i5 % 128;
        if (i5 % 2 == 0) {
            return m7022;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ boolean m7028(Placement placement) {
        int i = 2 % 2;
        int i2 = f1250 + 13;
        f1251 = i2 % 128;
        int i3 = i2 % 2;
        boolean m7020 = m7020(placement);
        int i4 = f1251 + 31;
        f1250 = i4 % 128;
        int i5 = i4 % 2;
        return m7020;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m7029(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1251 + 13;
        f1250 = i2 % 128;
        int i3 = i2 % 2;
        String m7026 = m7026(advertisement);
        int i4 = f1250 + 59;
        f1251 = i4 % 128;
        if (i4 % 2 != 0) {
            return m7026;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public cc(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1250 + 73;
        f1251 = i2 % 128;
        int i3 = i2 % 2;
        String mo6384 = mo6384();
        if (mo6384 != null) {
            int i4 = f1251 + 95;
            f1250 = i4 % 128;
            int i5 = i4 % 2;
            return mo6384.split(m7024("莚", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30241).intern())[1];
        }
        int i6 = f1251 + 7;
        f1250 = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ｋ */
    public final String mo6384() {
        int i = 2 % 2;
        int i2 = f1251 + 101;
        f1250 = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.f1253 == null) {
                String m7017 = m7017();
                this.f1253 = m7017;
                m6385(m7017);
                int i3 = f1250 + 99;
                f1251 = i3 % 128;
                int i4 = i3 % 2;
            }
            return this.f1253;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m7017() {
        int i = 2 % 2;
        Class m7016 = m7016();
        id.m7937().m7940();
        try {
            Iterator<Field> it = id.m7937().m7940().m7870(m7016, hw.m7864().m7897(String.class).m7898(8).m7899(16).m7900()).iterator();
            while (it.hasNext()) {
                int i2 = f1250 + 83;
                f1251 = i2 % 128;
                int i3 = i2 % 2;
                String str = (String) it.next().get(null);
                if (!str.startsWith(m7027(new int[]{893457239, -1056977799, -4313436, 382866358, -1795044078, -645299812}, TextUtils.lastIndexOf("", '0', 0, 0) + 13).intern())) {
                    int i4 = f1251 + 71;
                    f1250 = i4 % 128;
                    int i5 = i4 % 2;
                    if (!str.startsWith(m7027(new int[]{893457239, -1056977799, 2001055119, 1410712792, -2092667292, -753030071}, 12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    }
                }
                return str.split(m7024("莎", 24317 - TextUtils.indexOf("", "")).intern())[0];
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0291, code lost:
    
        if (r18.equals(m7024("菧깙\ud8d7ୁ㗢恱鋷뵥\uef8f\u1a1d", android.view.View.resolveSizeAndState(0, 0, 0) + 11657).intern()) == false) goto L111;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        int i = 2 % 2;
        char c = '\n';
        switch (str.hashCode()) {
            case -2075872274:
                if (str.equals(m7027(new int[]{1228466065, -783127419, -382497500, 1063285236, 599675694, 944184187, -566436033, -1204683045}, 15 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -2012803321:
                if (str.equals(m7027(new int[]{2081899092, 1379460168, -902818275, 1087271684, 1749452445, -1507022323, -1316294681, -838613752, -215974543, -739634649, -1667394871, -722669995, -1549066247, 1421357415, 2021839305, 1208870511, 2007897972, -1361393353, 425419658, 446417032, -782613829, 487329791}, 42 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1853707364:
                if (str.equals(m7024("菖煽暖呮䥟㺃ⰱ⅃ᛡЏ欄\ueeef\udc00톼웥됙ꦫ麌豾膹皗摰妆仑㱪㇔✕ᑝটＹ\uec4b\ue1e9휗쑓맵꼎鲬釤蜩璭槈彽", View.MeasureSpec.getMode(0) + 62119).intern())) {
                    int i2 = f1251 + 93;
                    f1250 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -1850654380:
                if (str.equals(m7024("菧㎫\ue333銫䈫\uf1a6", TextUtils.indexOf("", "", 0, 0) + 45179).intern())) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1836618638:
                if (str.equals(m7027(new int[]{-2071831196, -183205669, 1417643217, -2018549460, -2089822412, 1192264003}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9).intern())) {
                    int i4 = f1251 + 7;
                    f1250 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1740904301:
                if (str.equals(m7027(new int[]{-1683766085, -92553835, -940084067, 1148483336, -1054711862, 1370615686}, 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1721428911:
                if (str.equals(m7027(new int[]{893457239, -1056977799, -15021317, -1497150167}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5).intern())) {
                    int i6 = f1250 + 99;
                    f1251 = i6 % 128;
                    int i7 = i6 % 2;
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1057659822:
                if (str.equals(m7027(new int[]{802398027, 1292603793, -286452200, -614637672, 640749247, -302366644, 1566407343, 1259619832, -1381285567, -1923145528, 547341863, 69532717, -1448166247, 773373276, 1401896291, 1511677958, -1804041474, 527451536}, Color.green(0) + 36).intern())) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -965507231:
                if (str.equals(m7027(new int[]{-2034504438, -608094048, -1193146087, -1011131190, 1280644948, 940368709}, 10 - View.MeasureSpec.getMode(0)).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -899612152:
                if (str.equals(m7027(new int[]{2081899092, 1379460168, -902818275, 1087271684, 1749452445, -1507022323, -1316294681, -838613752, -215974543, -739634649, -504281755, 406527684, -803913332, -1833441246, 781739138, -931483023, 1136220540, 1089855431, 1417643217, -2018549460, -2089822412, 1192264003}, 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    int i8 = f1251 + 77;
                    f1250 = i8 % 128;
                    int i9 = i8 % 2;
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -828205665:
                if (str.equals(m7027(new int[]{1228466065, -783127419, 1954028660, 1502337088, -1054711862, 1370615686}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10).intern())) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -747599243:
                if (str.equals(m7024("菴까\ud8cc\u0b0d㖯某鉩벟\uef3e᥄", TextUtils.lastIndexOf("", '0') + 11678).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -498060603:
                if (str.equals(m7024("菥\udb7a㊒訿\ue15c㣷适\uefae䛙", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22691).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -350701718:
                break;
            case -92732536:
                if (str.equals(m7024("菖룷\uf582㈜潷ꐡ\ue0d5ᷩ媱靅챙भ䗈芎뾱\uf473ㄋ湦\uaac9\ue797ᱟ奣阇틛࿏䒱腉빤לּ㟞", 15149 - KeyEvent.keyCodeFromString("")).intern())) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 156342925:
                if (str.equals(m7024("菣\ue15b䛭ꐃ\u09b5滗챙\u31e9霙\uf4af姍뽹Ყ舃\ue7aa䓗", 25243 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 315438882:
                if (str.equals(m7027(new int[]{893457239, -1056977799, 1518361713, 1658367075, 205707237, 1861977522, -857728674, 989325156}, TextUtils.lastIndexOf("", '0') + 17).intern())) {
                    int i10 = f1251 + 97;
                    f1250 = i10 % 128;
                    if (i10 % 2 == 0) {
                        c = 29;
                        break;
                    } else {
                        c = 'W';
                        break;
                    }
                }
                c = 65535;
                break;
            case 332396988:
                if (str.equals(m7027(new int[]{126642706, -1235497864, -1184868164, 2007301671, 683271149, 1712169795}, Color.argb(0, 0, 0, 0) + 9).intern())) {
                    int i11 = f1250 + 27;
                    f1251 = i11 % 128;
                    int i12 = i11 % 2;
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 505165239:
                if (str.equals(m7024("菣袇镕ꈇ껅뮳쁈촡\ud9ef\ue69c\uf31a\uffddҖᅯḴ⫨㞬㱴䤢善所", 2887 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 670892517:
                if (str.equals(m7027(new int[]{802398027, 1292603793, -286452200, -614637672, 640749247, -302366644, -78480294, -339261023}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 746354589:
                if (str.equals(m7027(new int[]{-1683766085, -92553835, 1208489355, 53611206, -1381285567, -1923145528, 1131002641, -1375821685}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15).intern())) {
                    int i13 = f1250 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f1251 = i13 % 128;
                    int i14 = i13 % 2;
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 798818448:
                if (str.equals(m7024("菹뷟ￜ㧛篍뗺\uf7c2ㇳ珪", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15878).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1033471823:
                if (str.equals(m7024("菖ﾩ笾\uf6c2爏\uedff楩\ue4f7恁\ue3db忥\udb33嚰툐䶍쥭䓫쀸䏖뽕㭧뚌㈢궎⤚ꓢ⁾ꏕὂ髆ᚦ鈮\u0dbc褒Ҋ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 31859).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1110462460:
                if (str.equals(m7024("菸도\ue3b2᎕䍽獞ꌂ팬ˈ㋩把鉀쉴", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12324).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1205766784:
                if (str.equals(m7024("菣ᔥ긑䝽\ud84d熩પꎕ㓩췑朱\uf80b酽⩭", 38628 - MotionEvent.axisFromString("")).intern())) {
                    int i15 = f1250 + 1;
                    f1251 = i15 % 128;
                    if (i15 % 2 != 0) {
                        c = 1;
                        break;
                    }
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1208038126:
                if (str.equals(m7027(new int[]{893457239, -1056977799, -618756456, -808438005, -2137564456, -1952208990, -2071989714, -1515304214}, TextUtils.indexOf((CharSequence) "", '0') + 16).intern())) {
                    int i16 = f1250 + 89;
                    f1251 = i16 % 128;
                    int i17 = i16 % 2;
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1230133745:
                if (str.equals(m7027(new int[]{126642706, -1235497864, 1872374211, 935067836, -1381285567, -1923145528, 1131002641, -1375821685}, 14 - (Process.myTid() >> 22)).intern())) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1461477995:
                if (str.equals(m7024("菴措䌵⊡ȫ\ue1a6섾ꂛ耈枋䜞⚒\u0605\ue5da약ꓥ葶毻䭽⫠ੈ\ue9d6쥎꣗術濰侪⼯ີ\uee35춭괩", 57466 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1611471226:
                if (str.equals(m7027(new int[]{-1683766085, -92553835, -69418938, -1719396839, 599675694, 944184187, -566436033, -1204683045}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1731532800:
                if (str.equals(m7024("菹汉峰䵭㶕⸫ả\u0ef3ｂ\ueff0\ud87f좖뤰ꦡ駋", AndroidCharacter.getMirror('0') + 61283).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1766407901:
                if (str.equals(m7024("菣䗓\u0ffd퇫鮕嶏➅\ue951덃異㽮Ė", 50706 - TextUtils.lastIndexOf("", '0')).intern())) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1777696764:
                if (str.equals(m7024("菥据䊺⇩Ĩ\ue042잼ꛕ虡斶䓱␉ୂ\uea95", 57527 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1861686093:
                if (str.equals(m7027(new int[]{-1316586628, 72461439, -813579159, -373908092, 27033803, 1726887043, 1528572601, 754688402, -1093808741, -1911833485, -1042802778, 238845516, 1110799679, -1311505463, 1839815341, 984001289, -1172494279, 177462217}, (-16777183) - Color.rgb(0, 0, 0)).intern())) {
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
                int i18 = f1250 + 39;
                f1251 = i18 % 128;
                int i19 = i18 % 2;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m7024("菒䕁\u0ee3큖馝持⒰\uee27띐磉䉱௺", 50833 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cc.m7021((Repository) list.get(0), (String) list.get(1));
            }
        });
        hashMap.put(m7024("菜秹瞂浦欪惫庡呸判俴䖪䍺㤤㛢", (Process.myTid() >> 22) + 64063).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(cc.m7028((Placement) list.get(0)));
            }
        });
        hashMap.put(m7024("菒䂗Տ쨡軍厛ၾ픶駦庯⌇\ue7f1ꒅ", TextUtils.lastIndexOf("", '0') + 49992).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cc.m7023((Advertisement) list.get(0));
            }
        });
        hashMap.put(m7024("菒獫抷凇䄸み➧ᛉ\u0604\uf541\ue495", 61627 - (Process.myPid() >> 22)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cc.m7029((Advertisement) list.get(0));
            }
        });
        hashMap.put(m7027(new int[]{1274529701, -317969982, -138127344, 910519708, 1875831255, 2102380454, 259292548, -1648727724, 66623642, 567905235}, 19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cc.m7019((Advertisement) list.get(0));
            }
        });
        int i2 = f1250 + 59;
        f1251 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m7020(Placement placement) {
        int i = 2 % 2;
        int i2 = f1250 + 23;
        f1251 = i2 % 128;
        int i3 = i2 % 2;
        boolean isIncentivized = placement.isIncentivized();
        int i4 = f1250 + 57;
        f1251 = i4 % 128;
        if (i4 % 2 != 0) {
            return isIncentivized;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7022(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1250 + 63;
        f1251 = i2 % 128;
        int i3 = i2 % 2;
        String adMarketId = advertisement.getAdMarketId();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = f1251 + 115;
        f1250 = i5 % 128;
        int i6 = i5 % 2;
        return adMarketId;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7026(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1251 + 21;
        f1250 = i2 % 128;
        int i3 = i2 % 2;
        String campaign = advertisement.getCampaign();
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return campaign;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static Map<String, String> m7018(Advertisement advertisement) {
        int i = 2 % 2;
        int i2 = f1251 + 61;
        f1250 = i2 % 128;
        if (i2 % 2 == 0) {
            return advertisement.getDownloadableUrls();
        }
        advertisement.getDownloadableUrls();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static Class m7016() {
        int i = 2 % 2;
        int i2 = f1251 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1250 = i2 % 128;
        if (i2 % 2 == 0) {
            return VungleApiClient.class;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Placement m7025(Repository repository, String str) {
        int i = 2 % 2;
        int i2 = f1251 + 39;
        f1250 = i2 % 128;
        int i3 = i2 % 2;
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        if (i3 == 0) {
            return placement;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7024(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1252);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7027(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1249.clone();
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
