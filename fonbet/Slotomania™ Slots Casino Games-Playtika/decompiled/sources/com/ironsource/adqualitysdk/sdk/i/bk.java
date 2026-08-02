package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.chartboost.sdk.CBImpressionActivity;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostActivity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.InPlay.CBInPlay;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.callbacks.StartCallback;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bk extends be {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f874 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f876 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f873 = {-2000031311, -287954716, 1164605649, 1203413467, 653553937, -1574831502, 1079909661, -1309680685, 1164288060, -1478089648, 56932618, -439946243, 267456281, 714527617, 56355774, -721232629, -247594078, 711928311};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f872 = {'C', 47151, 28819, 10537, 57828, 39501, 21231, 2690, 51771, 29274, 47855, 58161, 11151, 20497, 39095, 49361, 2372, 45551, 65141, 9880, 28471, 38821, 57216, 1096, 19692, 62734, 15836, 31267, 41657, 60110, 4967, 23536, 32793, 51411, 28937, 47461, 57853, 11884, 22254, 40729, 51101, 3110, 46161, 64726, 9571, 28151, 43575, 53920, 6948, 17220, 35788, 12414, 30864, 41224, 'I', 47107, 28846, 10530, 57798, 39506, 21242, 2706, 49948, 31676, 13347, 60611, 'R', 47112, 28845, 10534, 57798, 39493, 21227, 2719, 'D', 47108, 28841, 10538, 57821, 39506, 21245, 2706, 49930, 31673, 13351, 60654, 42360, 24010, 5527, 52751, 34492, 16223, 63435, 45172, 26863, 'I', 47107, 28846, 10530, 57798, 39506, 21242, 2706, 49948, 31676, 13347, 60611, 42335, 24040, 5530, 52751, 34482, 16220, 63433, 45180, 'C', 47151, 28819, 10538, 57796, 39507, 21227, 2696, 49947, 31676, 13357, 60609, 42314, 24032, 5523, 52756, 34449, 16222, 63454, 45182, 26866, 8344, 55594, 37298, 17197, 64344, 13296, 27250, 41631, 'g', 47112, 28846, 10500, 57820, 39488, 21244, 2703, 49930, 31674, 13357, 60636, 42344, 24013, 5523, 52751, 34485, 16218, 63435, 45155, 26849, 15107, 33663, 19423, 4678, 55968, 41252, 27066, 12761, 63563, 16605, 3907, 55229, 40456, 26251, 12025, 62828, 48579, 1065, 52366, 35602, 21384, 7156, 57945, 43722, 28972, 14752, 6901, 41602, 27153, 13246, 64330, 33003, 18555, 4098, 55683, 24844, 11952, 63058, 49122, 18297, 3855, 54427, 38801, 12286, 59224, 48880, 30258, 3495, 50486, 40300, 21747, 60486};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f875 = 4406483150570305645L;

    /* renamed from: ﭴ, reason: contains not printable characters */
    static /* synthetic */ boolean m6484() {
        int i = 2 % 2;
        int i2 = f874 + 59;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        boolean m6483 = m6483();
        int i4 = f876 + 29;
        f874 = i4 % 128;
        int i5 = i4 % 2;
        return m6483;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ Object m6488() {
        int i = 2 % 2;
        int i2 = f876 + 1;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        Object m6485 = m6485();
        int i4 = f876 + 13;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return m6485;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ Object m6489() {
        int i = 2 % 2;
        int i2 = f874 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            return m6486();
        }
        m6486();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ a m6490(bk bkVar, ChartboostDelegate chartboostDelegate, ck ckVar) {
        int i = 2 % 2;
        int i2 = f876 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            return bkVar.m6501(chartboostDelegate, ckVar);
        }
        bkVar.m6501(chartboostDelegate, ckVar);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6492(ChartboostDelegate chartboostDelegate) {
        int i = 2 % 2;
        int i2 = f874 + 75;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        m6496(chartboostDelegate);
        int i4 = f874 + 15;
        f876 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6493(bk bkVar, ck ckVar) {
        int i = 2 % 2;
        int i2 = f874 + 59;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        bkVar.m6494(ckVar);
        int i4 = f876 + 101;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m6499(bk bkVar) {
        int i = 2 % 2;
        int i2 = f876 + 27;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6487();
        }
        m6487();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ String m6500(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f876 + 89;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        String m6495 = m6495(cBInPlay);
        int i4 = f874 + 77;
        f876 = i4 % 128;
        int i5 = i4 % 2;
        return m6495;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m6502(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f874 + 61;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String m6498 = m6498(cBInPlay);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return m6498;
    }

    public bk(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0248, code lost:
    
        if (r17.equals(m6491(new int[]{73994555, -719843931, 980129530, -38832408, 474317128, 357453995}, android.graphics.Color.blue(0) + 10).intern()) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0290, code lost:
    
        if (r17.equals(m6491(new int[]{-1159768539, 1344509621, 650193761, 1759803421, -1291807652, -2111166075, 133732513, -1282906216, -829450975, -1944529523}, 20 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()) != false) goto L69;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        int i = 2 % 2;
        char c = '\f';
        switch (str.hashCode()) {
            case -1602236458:
                if (str.equals(m6491(new int[]{2010245053, 412220370, 2103861669, -893778102, -770203655, 2103026542, -2054691208, 1671211637, 1459847888, 667054568, -1969740054, -1371843628, 808088691, 544498852}, 26 - Process.getGidForName("")).intern())) {
                    int i2 = f874 + 69;
                    f876 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1251618628:
                if (str.equals(m6497((char) Color.argb(0, 0, 0, 0), 115 - (Process.myPid() >> 22), MotionEvent.axisFromString("") + 25).intern())) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -921117961:
                break;
            case -869710636:
                if (!(!str.equals(m6491(new int[]{73994555, -719843931, 980129530, -38832408, 1015918542, -365692414, 7103274, -1134364623, -1860750935, 1318242260}, 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()))) {
                    int i4 = f876 + 69;
                    f874 = i4 % 128;
                    if (i4 % 2 == 0) {
                        c = 0;
                        break;
                    }
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -513187163:
                break;
            case -416101408:
                if (str.equals(m6491(new int[]{-1159768539, 1344509621, 650193761, 1759803421, -1291807652, -2111166075, 1508545457, -1689522400, -907769593, -2031126386, 7103274, -1134364623, -1860750935, 1318242260}, 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -371244199:
                if (str.equals(m6491(new int[]{-652187401, -1690037360, -97650342, 1023883986, 824755541, 1089619880}, TextUtils.indexOf((CharSequence) "", '0') + 12).intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -352872024:
                if (str.equals(m6491(new int[]{-677230424, -115011874, -1407153186, -374772511, 975243847, -706016419}, 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    int i5 = f876 + 109;
                    f874 = i5 % 128;
                    int i6 = i5 % 2;
                    break;
                }
                c = 65535;
                break;
            case -305846637:
                if (str.equals(m6491(new int[]{1687323437, 1777492458, -79827221, 1418234937, 734443644, 324369372, 1404779129, 1995081803}, 15 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    int i7 = f876 + 107;
                    f874 = i7 % 128;
                    if (i7 % 2 == 0) {
                        c = 15;
                        break;
                    } else {
                        c = '7';
                        break;
                    }
                }
                c = 65535;
                break;
            case -221039695:
                if (str.equals(m6497((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 94 - ImageFormat.getBitsPerPixel(0), 20 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    int i8 = f876 + 23;
                    f874 = i8 % 128;
                    if (i8 % 2 == 0) {
                        c = 14;
                        break;
                    } else {
                        c = 'r';
                        break;
                    }
                }
                c = 65535;
                break;
            case -174936018:
                if (str.equals(m6497((char) ExpandableListView.getPackedPositionGroup(0L), 66 - TextUtils.indexOf("", "", 0, 0), 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                if (str.equals(m6491(new int[]{-1373607834, 383497500}, (ViewConfiguration.getTouchSlop() >> 8) + 2).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 296803428:
                if (str.equals(m6497((char) Color.green(0), Process.getGidForName("") + 75, 21 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 544981520:
                if (str.equals(m6491(new int[]{-91486163, -1567888849, -1577317243, 1360684826, 980129530, -38832408, 1635032062, 1879704477, -2007409445, -67020658, -259486819, -706540689, -1159768539, 1344509621, 650193761, 1759803421, -1291807652, -2111166075, 133732513, -1282906216, -829450975, -1944529523}, Drawable.resolveOpacity(0, 0) + 44).intern())) {
                    int i9 = f874 + 11;
                    f876 = i9 % 128;
                    int i10 = i9 % 2;
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 604162924:
                if (str.equals(m6497((char) (KeyEvent.normalizeMetaState(0) + 51800), (-16777208) - Color.rgb(0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46).intern())) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 650412337:
                if (str.equals(m6491(new int[]{107503583, 355745347, 597310248, -2083008210, -406594499, 2016918266, 1757783430, -495786061}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 14).intern())) {
                    int i11 = f874 + 47;
                    f876 = i11 % 128;
                    if (i11 % 2 != 0) {
                        c = 5;
                        break;
                    }
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 753858215:
                if (str.equals(m6491(new int[]{1474298949, 2057197015, -984675298, -1330995010, 392623860, 2084195854, 1535017431, 2143886232}, 13 - TextUtils.getCapsMode("", 0, 0)).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 769047372:
                if (str.equals(m6497((char) View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 55, ExpandableListView.getPackedPositionGroup(0L) + 12).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1443881784:
                if (str.equals(m6497((char) (Process.myTid() >> 22), View.MeasureSpec.getSize(0), '8' - AndroidCharacter.getMirror('0')).intern())) {
                    int i12 = f874 + 55;
                    f876 = i12 % 128;
                    int i13 = i12 % 2;
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
                int i14 = f876 + 25;
                f874 = i14 % 128;
                int i15 = i14 % 2;
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
                return a.class;
            case 7:
            case '\b':
                return com.chartboost.sdk.legacy.CBImpressionActivity.class;
            case '\t':
                int i16 = f874 + 109;
                f876 = i16 % 128;
                if (i16 % 2 != 0) {
                    return Ad.class;
                }
                Object obj = null;
                super.hashCode();
                throw null;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f874 + 109;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String sDKVersion = Chartboost.getSDKVersion();
            int i4 = f874 + 43;
            f876 = i4 % 128;
            int i5 = i4 % 2;
            return sDKVersion;
        } catch (Error unused) {
            return m6497((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17179), 139 - TextUtils.getOffsetAfter("", 0), Color.alpha(0) + 5).intern();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6491(new int[]{466439077, -795390373, 1740102851, 1431554927, 842167113, 2057841534, -2021504001, 1055268019}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bk.m6493(bk.this, ckVar);
                return null;
            }
        });
        hashMap.put(m6497((char) TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getMode(0) + 144, View.resolveSize(0, 0) + 21).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bk.m6489();
            }
        });
        hashMap.put(m6491(new int[]{-697295430, 696924096, -308061860, 683100825, -1026691593, -588330130, 1962688534, 167041431, 1761752808, 693255892, -1969740054, -1371843628, 808088691, 544498852}, 28 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bk.m6488();
            }
        });
        hashMap.put(m6497((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15200), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 165, 26 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bk.m6490(bk.this, (ChartboostDelegate) list.get(0), ckVar);
            }
        });
        hashMap.put(m6491(new int[]{746574407, -2062553605, -308061860, 683100825, -1026691593, -588330130, 1461867355, 130626474, 842167113, 2057841534, -2021504001, 1055268019}, TextUtils.indexOf((CharSequence) "", '0', 0) + 22).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bk.m6492((ChartboostDelegate) list.get(0));
                return null;
            }
        });
        hashMap.put(m6497((char) (Color.argb(0, 0, 0, 0) + 6812), 191 - (Process.myPid() >> 22), 16 - TextUtils.indexOf("", "")).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bk.m6484());
            }
        });
        hashMap.put(m6491(new int[]{-405592498, 1405730313, 1537045700, 203838067, 824755541, 1089619880}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bk.m6500((CBInPlay) list.get(0));
            }
        });
        hashMap.put(m6497((char) (TextUtils.indexOf((CharSequence) "", '0') + 38903), 207 - (ViewConfiguration.getFadingEdgeLength() >> 16), Drawable.resolveOpacity(0, 0) + 10).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bk.m6502((CBInPlay) list.get(0));
            }
        });
        hashMap.put(m6491(new int[]{-931802346, 267854537, -1106081094, 1450660016, -443524324, -1932507257}, Color.green(0) + 12).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bk.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bk.m6499(bk.this));
            }
        });
        int i2 = f876 + 105;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m6494(ck ckVar) {
        int i = 2 % 2;
        int i2 = f874 + 55;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        m6496(m6501((ChartboostDelegate) m6486(), ckVar));
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private a m6501(ChartboostDelegate chartboostDelegate, ck ckVar) {
        int i = 2 % 2;
        a aVar = new a(chartboostDelegate, ckVar);
        int i2 = f874 + 17;
        f876 = i2 % 128;
        if (i2 % 2 != 0) {
            return aVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m6496(ChartboostDelegate chartboostDelegate) {
        int i = 2 % 2;
        int i2 = f874 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Chartboost.setDelegate(chartboostDelegate);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f876 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f874 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static boolean m6487() {
        int i = 2 % 2;
        int i2 = f876 + 91;
        f874 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6486() instanceof a;
        }
        boolean z = m6486() instanceof a;
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static boolean m6483() {
        int i = 2 % 2;
        int i2 = f876 + 27;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        boolean isWebViewEnabled = Chartboost.isWebViewEnabled();
        int i4 = f874 + 11;
        f876 = i4 % 128;
        int i5 = i4 % 2;
        return isWebViewEnabled;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6495(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f876 + 39;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        String location = cBInPlay.getLocation();
        int i4 = f874 + 111;
        f876 = i4 % 128;
        if (i4 % 2 != 0) {
            return location;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6498(CBInPlay cBInPlay) {
        int i = 2 % 2;
        int i2 = f874 + 105;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        String appName = cBInPlay.getAppName();
        int i4 = f874 + 75;
        f876 = i4 % 128;
        int i5 = i4 % 2;
        return appName;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static Object m6486() {
        int i = 2 % 2;
        int i2 = f876 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f874 = i2 % 128;
        int i3 = i2 % 2;
        com.chartboost.sdk.a delegate = Chartboost.getDelegate();
        int i4 = f876 + 43;
        f874 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return delegate;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static Object m6485() {
        int i = 2 % 2;
        int i2 = f874 + 71;
        f876 = i2 % 128;
        int i3 = i2 % 2;
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.d;
        int i4 = f874 + 71;
        f876 = i4 % 128;
        int i5 = i4 % 2;
        return aVar;
    }

    class a extends ChartboostDelegate implements hj<ChartboostDelegate> {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f886 = 1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f887;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f888;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static long f889;

        /* renamed from: ｋ, reason: contains not printable characters */
        private ChartboostDelegate f891;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private ck f892;

        static {
            char[] cArr = new char[1261];
            ByteBuffer.wrap("ñnÿ»ì°Ý¥Ê¡»¹¨¶\u0099°\u0086®w·d\u0085U¢B©3® ®\u0011®\u001e¹\u000f\u0096üßí\u0084Ú\u009dË\u0094¸\u008c©\u0093\u0096\u0099\u0087±t\u0084e\u0096R\u0090C\u008e0\u009a!\u009b.¤\u001fý\fåýòêçÛèÈí¹ö¦é\u0097ê\u0084àuë'£)v:}\u000bh\u001clmt~{O}Pc¡z²H\u0083o\u0094dåcöcÇcÈtÙ[*\u0012;I\fP\u001dYnA\u007f^@TQj¢E³Y\u0084X\u0095JæE÷[øiÉ0Ú(+?<*\r%\u001e o;p$A'R-£&\r´\u0003a\u0010j!\u007f6{GcTlejzt\u008bm\u0098_©x¾sÏtÜtítâcóL\u0000\u0005\u0011I&F7ED`UDjD{Q\u0088^\u0099t®Q¿EÌVÝGÒDã=ð\"\u00019\u0016&' 4/\fÆ\u0002\u0013\u0011\u0018 \r7\tF\u0011U\u001ed\u0018{\u0006\u008a\u001f\u0099-¨\n¿\u0001Î\u0006Ý\u0006ì\u0006ã\u0011ò>\u0001w\u0010;'467E\u0017T6k<z'\u0089\u001d\u0098 ¯\u0001¾,Í Ü#Ó\fâUñM\u0000Z\u0017O&@5ED^[AjByH\u0088C\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0090X»g£v£\u0085¥\u0094¹£»²\u008fÁªÐ¶ß¥îÌýÏ\fÎ\u001bÑ*Â9ÝHÓWÜ\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0097X¾g¿v½\u0085©\u0094\u0083£¦²²Á¡Ð°ß³îÊýÕ\fÎ\u001bÑ*×9Ø\u0013«\u001d~\u000eu?`(dY|Js{udk\u0095r\u0086@·g lÑkÂkókü|íS\u001e\u001a\u000fV8Y)ZZ\u007fKVtQeE\u0096O\u0087k°N¡ZÒIÃXÌ[ý\"î=\u001f&\b99?*0[®U{Fpwe`a\u0011y\u0002v3p,nÝwÎEÿbèi\u0099n\u008an»n´y¥VV\u001fGSp\\a_\u0012}\u0003V<N-SÞMÏFø\\éb\u009aG\u008b[\u0084Hµ!¦\"W#@<q/b0\u0013>\f1\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0097X½g½v¾\u0085 \u0094¯£¼²£Á\u008dÐ¬ß´îÛýÎ\fÉ\u001bÌ*ß9ÀHÛWÑfÂ»Îµ\u001b¦\u0010\u0097\u0005\u0080\u0001ñ\u0019â\u0016Ó\u0010Ì\u000e=\u0017.%\u001f\u0002\b\ty\u000ej\u000e[\u000eT\u0019E6¶\u007f§$\u0090=\u00814ò,ã3Ü9Í\u0011>$/6\u00180\t.z:k;d\u0000U\\FC·R t\u0091K\u0082IóL\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0097X³g³v¦\u0085©\u0094\u0087£§²´Á¡Ð\u0083ß°îÎýÏ)\u009b'N4E\u0005P\u0012TcLpCAE^[¯B¼p\u008dW\u009a\\ë[ø[É[ÆL×c$*5q\u0002h\u0013a`yqfNl_R¬}½a\u008a`\u009brè}ùcöUÇ\tÔ\u0016%\u00072!\u0003\u001e\u0010\u001ca\u0019\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0092X³g¹v¢\u0085\u0098\u0094¥£\u0084²©Á¥Ð¦ß\u008dîÑýÎ\fß\u001bù*Æ9ÄHÁ\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0090X»g£v£\u0085¥\u0094¹£»²\u008bÁ«Ð°ß¥îÿýÌ\fÊ\u001bË\u009c©\u0092|\u0081w°b§fÖ~Åqôwëi\u001ap\tB8e/n^iMi|is~bQ\u0091\u0018\u0080T·[¦XÕ}ÄTûUêW\u0019C\bm?M.^]KLiCZr$a%\tÁ\u0007\u0014\u0014\u001f%\n2\u000eC\u0016P\u0019a\u001f~\u0001\u008f\u0018\u009c*\u00ad\rº\u0006Ë\u0001Ø\u0001é\u0001æ\u0016÷9\u0004p\u0015<\"330@\u0015Q<n;\u007f/\u008c%\u009d\u0005ª%»6È#Ù\u0001Ö2çLôM\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0090X»g£v¾\u0085 \u0094«£±²\u008bÁ«Ð°ß¥îÿýÌ\fÊ\u001bË\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0092X³g¹v¢\u0085\u0098\u0094¥£\u009a²£Á§Ð\u00adß²îÚýÿ\fÖ\u001bÑ*Õ9ß\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0084X³g¥v½\u0085©\u0094\u0089£¤²¯Á§Ð©ß\u0086îÑýÎ\fù\u001b×*Ø9ÒHÛWÂfÃuÍ\u0084Þ\u0093Á¢É±Ê\u0000d\u000e\u0097\u001d\u0098,ª;\u0099J\u0083Y\u0087h\u0097w³\u0086\u0082\u0095\u0085¤\u0089³\u0083Â Ñ\u008bà\u0090ï£þ±\r²\u001c¼+±:¤I¹X³g¤v§\u0085£\u0094¤\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c©+°:¹I¡X¾g´v\u008a\u0085¥\u0094¹£¸²ªÁ¥Ð»ß\u0092îÛýË\fÛ\u001bÊ*Ò9ÑHÖWæfÇuÈ\u0084Ï\u0093Ç\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0097X³g³v¦\u0085©\u0094\u0098£\u00ad²±Á¥Ð°ß¤îÛýØ\fì\u001bÑ*Ò9ÑHÝ\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0092X³g¹v¢\u0085\u0098\u0094¥£\u0084²©Á¥Ð¦ß\u0092îÛýË\fÛ\u001bÊ*Ò9ÑHÖWæfÇuÈ\u0084Ï\u0093Ç\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0090X»g£v£\u0085¥\u0094¹£»²\u0094Á¡Ðµß¡îÌýØ\fß\u001bÜ*à9ÝHÖWÕfÁ\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0097X¾g¿v½\u0085©\u0094\u0098£\u00ad²±Á¥Ð°ß¤îÛýØ\fì\u001bÑ*Ò9ÑHÝ\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0097X¾g¹v\u00ad\u0085§\u0094\u0098£\u00ad²±Á¥Ð°ß¤îÛýØ\fì\u001bÑ*Ò9ÑHÝ\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0097X½g½v¾\u0085 \u0094¯£¼²£Á\u0096Ð§ß·îßýÎ\fÞ\u001bÝ*Ò9âHÛWÔfËuÃ\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u0090X»g£v¾\u0085 \u0094«£±²\u0094Á¡Ðµß¡îÌýØ\fß\u001bÜ*à9ÝHÖWÕfÁ\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c\u00ad+±:ºI¸X\u0096g¹v½\u0085¼\u0094¦£©²¿Á\u0092Ð«ß¤îÛýÓ+'%ò6ù\u0007ì\u0010èaðrÿCù\\ç\u00adþ¾Ì\u008fë\u0098àéçúçËçÄðÕß&\u00967Ú\u0000Õ\u0011Öbós×L×]Â®Í¿ç\u0088Â\u0099òêÌûÇôÝR¾\\kO`~uiq\u0018i\u000bf:`%~ÔgÇUöráy\u0090~\u0083~²~½i¬F_\u000fNCyLhO\u001bo\nN5D$_×eÆXñyàT\u0093X\u0082[\u008dt¼-¯\u0011^+I$x2\u0000C\u000e\u0096\u001d\u009d,\u0088;\u008cJ\u0094Y\u009bh\u009dw\u0083\u0086\u009a\u0095¨¤\u008f³\u0084Â\u0083Ñ\u0083à\u0083ï\u0094þ»\rò\u001c¾+±:²I\u009dX¼g¹vº\u0085¥\u0094«£¤²¯Á¾Ð§".getBytes(C.ISO88591_NAME)).asCharBuffer().get(cArr, 0, 1261);
            f888 = cArr;
            f889 = -6043605503165722882L;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* renamed from: ﻐ */
        public final /* synthetic */ ChartboostDelegate mo6363() {
            int i = 2 % 2;
            int i2 = f886 + 41;
            f887 = i2 % 128;
            if (i2 % 2 != 0) {
                m6503();
                Object obj = null;
                super.hashCode();
                throw null;
            }
            ChartboostDelegate m6503 = m6503();
            int i3 = f887 + 1;
            f886 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 42 / 0;
            }
            return m6503;
        }

        a(ChartboostDelegate chartboostDelegate, ck ckVar) {
            this.f891 = chartboostDelegate;
            this.f892 = ckVar;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ChartboostDelegate m6503() {
            int i = 2 % 2;
            int i2 = f886 + 65;
            int i3 = i2 % 128;
            f887 = i3;
            int i4 = i2 % 2;
            ChartboostDelegate chartboostDelegate = this.f891;
            int i5 = i3 + 91;
            f886 = i5 % 128;
            int i6 = i5 % 2;
            return chartboostDelegate;
        }

        public boolean shouldRequestInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f887 + 91;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (61741 - View.MeasureSpec.getSize(0)), Gravity.getAbsoluteGravity(0, 0), 44 - TextUtils.getOffsetAfter("", 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate == null) {
                int i4 = f886 + 27;
                f887 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 69 / 0;
                }
                return false;
            }
            int i6 = f887 + 47;
            f886 = i6 % 128;
            if (i6 % 2 != 0) {
                return chartboostDelegate.shouldRequestInterstitial(str);
            }
            int i7 = 55 / 0;
            return chartboostDelegate.shouldRequestInterstitial(str);
        }

        public boolean shouldDisplayInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f886 + 37;
            f887 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (10208 - TextUtils.indexOf("", "", 0, 0)), 44 - (Process.myPid() >> 22), TextUtils.getOffsetBefore("", 0) + 44).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate == null) {
                return false;
            }
            boolean shouldDisplayInterstitial = chartboostDelegate.shouldDisplayInterstitial(str);
            int i4 = f887 + 115;
            f886 = i4 % 128;
            int i5 = i4 % 2;
            return shouldDisplayInterstitial;
        }

        public void didCacheInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f887 + 99;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 3575), ImageFormat.getBitsPerPixel(0) + 89, 39 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCacheInterstitial(str);
            }
            int i4 = f886 + 83;
            f887 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (3205 - View.resolveSizeAndState(0, 0, 0)), 127 - ExpandableListView.getPackedPositionGroup(0L), 43 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
                int i2 = f887 + 47;
                f886 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 2;
                }
            }
            int i4 = f887 + 55;
            f886 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void didDismissInterstitial(String str) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 171 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 41).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f887 + 95;
                f886 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDismissInterstitial(str);
                int i4 = f887 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f886 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 % 4;
                }
            }
        }

        public void didCloseInterstitial(String str) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 212 - View.MeasureSpec.getMode(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 38).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f887 + 55;
                f886 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCloseInterstitial(str);
                if (i3 == 0) {
                    throw null;
                }
            }
            int i4 = f887 + 75;
            f886 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void didClickInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f887 + 35;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (5096 - Gravity.getAbsoluteGravity(0, 0)), 250 - ImageFormat.getBitsPerPixel(0), 39 - View.resolveSizeAndState(0, 0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f887 + 15;
                f886 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didClickInterstitial(str);
                if (i5 == 0) {
                    int i6 = 63 / 0;
                }
            }
        }

        public void didDisplayInterstitial(String str) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((ViewConfiguration.getTapTimeout() >> 16) + 23533), TextUtils.lastIndexOf("", '0', 0, 0) + 291, ExpandableListView.getPackedPositionGroup(0L) + 41).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f886 + 115;
                f887 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDisplayInterstitial(str);
                int i4 = f887 + 85;
                f886 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didCompleteInterstitial(String str) {
            int i = 2 % 2;
            int i2 = f887 + 41;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 332 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 42).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f887 + 31;
                f886 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCompleteInterstitial(str);
            }
        }

        public boolean shouldRequestMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f886 + 85;
            f887 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 48013), TextUtils.indexOf((CharSequence) "", '0') + 374, 40 - View.resolveSize(0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            Object obj = null;
            if (chartboostDelegate == null) {
                int i4 = f886 + 7;
                f887 = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            int i5 = f886 + 97;
            f887 = i5 % 128;
            if (i5 % 2 == 0) {
                return chartboostDelegate.shouldRequestMoreApps(str);
            }
            chartboostDelegate.shouldRequestMoreApps(str);
            super.hashCode();
            throw null;
        }

        public void didCacheMoreApps(String str) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) TextUtils.indexOf("", "", 0, 0), TextUtils.getTrimmedLength("") + 413, (ViewConfiguration.getFadingEdgeLength() >> 16) + 35).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f887 + 13;
                f886 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didCacheMoreApps(str);
                int i4 = f886 + 109;
                f887 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public boolean shouldDisplayMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f886 + 71;
            f887 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 10712), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 448, ImageFormat.getBitsPerPixel(0) + 41).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                return chartboostDelegate.shouldDisplayMoreApps(str);
            }
            int i4 = f887 + 103;
            f886 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 55 / 0;
            }
            return false;
        }

        public void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            int i2 = f887 + 43;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 489, 41 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f887 + 5;
                f886 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
                if (i5 != 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        public void didDismissMoreApps(String str) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((Process.getThreadPriority(0) + 20) >> 6), 528 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 37 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f886 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f887 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDismissMoreApps(str);
                int i4 = f887 + 95;
                f886 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didCloseMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f887 + 11;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (View.combineMeasuredStates(0, 0) + 40170), TextUtils.lastIndexOf("", '0') + 566, TextUtils.indexOf((CharSequence) "", '0') + 36).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f886 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f887 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCloseMoreApps(str);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }

        public void didClickMoreApps(String str) {
            int i = 2 % 2;
            int i2 = f886 + 89;
            f887 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2434), Color.blue(0) + 600, 35 - View.resolveSize(0, 0)).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f887 + 99;
                f886 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didClickMoreApps(str);
            }
            int i6 = f886 + 81;
            f887 = i6 % 128;
            int i7 = i6 % 2;
        }

        public void didDisplayMoreApps(String str) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.green(0) + 635, View.combineMeasuredStates(0, 0) + 37).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f886 + 49;
                f887 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDisplayMoreApps(str);
                if (i3 != 0) {
                    int i4 = 45 / 0;
                }
                int i5 = f886 + 17;
                f887 = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        public void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
            int i = 2 % 2;
            int i2 = f887 + 35;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.getDefaultSize(0, 0) + 672, 39 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), str, cBClickError);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f887 + 15;
                f886 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didFailToRecordClick(str, cBClickError);
                if (i5 == 0) {
                    throw null;
                }
                int i6 = f886 + 73;
                f887 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 4;
                }
            }
        }

        public void didPauseClickForConfirmation(Activity activity) {
            int i = 2 % 2;
            int i2 = f886 + 1;
            f887 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), KeyEvent.normalizeMetaState(0) + IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, 48 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), activity);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f887 + 91;
                f886 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    chartboostDelegate.getClass().getDeclaredMethod(m6504((char) (ViewConfiguration.getEdgeSlop() >> 16), 758 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L) + 28).intern(), Activity.class).invoke(this.f891, activity);
                } catch (Throwable unused) {
                }
            }
        }

        public boolean shouldDisplayRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f887 + 107;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 786 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 46 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate == null) {
                return false;
            }
            boolean shouldDisplayRewardedVideo = chartboostDelegate.shouldDisplayRewardedVideo(str);
            int i4 = f887 + 75;
            f886 = i4 % 128;
            int i5 = i4 % 2;
            return shouldDisplayRewardedVideo;
        }

        public void didCacheRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f887 + 37;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (ViewConfiguration.getTapTimeout() >> 16), 831 - TextUtils.indexOf("", "", 0), Gravity.getAbsoluteGravity(0, 0) + 40).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f887 + 55;
                f886 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCacheRewardedVideo(str);
            }
        }

        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) View.MeasureSpec.getSize(0), 871 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f886 + 99;
                f887 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
                int i4 = f887 + 19;
                f886 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didDismissRewardedVideo(String str) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) Color.alpha(0), Color.rgb(0, 0, 0) + 16778132, (ViewConfiguration.getLongPressTimeout() >> 16) + 42).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f886 + 29;
                f887 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didDismissRewardedVideo(str);
                int i4 = f887 + 111;
                f886 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didCloseRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f887 + 67;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) TextUtils.getOffsetBefore("", 0), 958 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 41).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                chartboostDelegate.didCloseRewardedVideo(str);
            }
            int i4 = f887 + 105;
            f886 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void didClickRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f887 + 71;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) TextUtils.indexOf("", "", 0, 0), 998 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f886 + 13;
                f887 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didClickRewardedVideo(str);
                if (i5 != 0) {
                    int i6 = 63 / 0;
                }
            }
        }

        public void didCompleteRewardedVideo(String str, int i) {
            int i2 = 2 % 2;
            int i3 = f886 + 21;
            f887 = i3 % 128;
            int i4 = i3 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (KeyEvent.getMaxKeyCode() >> 16), 1038 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 43).intern(), str, Integer.valueOf(i));
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i5 = f886 + 17;
                f887 = i5 % 128;
                int i6 = i5 % 2;
                chartboostDelegate.didCompleteRewardedVideo(str, i);
            }
        }

        public void didDisplayRewardedVideo(String str) {
            int i = 2 % 2;
            int i2 = f886 + 21;
            f887 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Process.getGidForName("") + 1082, 41 - Process.getGidForName("")).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f886 + 83;
                f887 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didDisplayRewardedVideo(str);
            }
        }

        public void willDisplayVideo(String str) {
            int i = 2 % 2;
            int i2 = f887 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) View.MeasureSpec.getSize(0), 1122 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 34).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                chartboostDelegate.willDisplayVideo(str);
                int i4 = f886 + 9;
                f887 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public void didCacheInPlay(String str) {
            int i = 2 % 2;
            int i2 = f886 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f887 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11108), Drawable.resolveOpacity(0, 0) + 1158, View.getDefaultSize(0, 0) + 33).intern(), str);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f887 + 1;
                f886 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didCacheInPlay(str);
                if (i5 == 0) {
                    int i6 = 63 / 0;
                }
            }
        }

        public void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
            int i = 2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) (KeyEvent.getDeadChar(0, 0) + 21245), 1239 - AndroidCharacter.getMirror('0'), 38 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), str, cBImpressionError);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i2 = f887 + 55;
                f886 = i2 % 128;
                int i3 = i2 % 2;
                chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
            }
            int i4 = f886 + 39;
            f887 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void didInitialize() {
            int i = 2 % 2;
            int i2 = f887 + 63;
            f886 = i2 % 128;
            int i3 = i2 % 2;
            bk.this.m6382(this, this.f892, m6504((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (-16775987) - Color.rgb(0, 0, 0), KeyEvent.keyCodeFromString("") + 32).intern(), new Object[0]);
            ChartboostDelegate chartboostDelegate = this.f891;
            if (chartboostDelegate != null) {
                int i4 = f886 + 113;
                f887 = i4 % 128;
                int i5 = i4 % 2;
                chartboostDelegate.didInitialize();
                if (i5 != 0) {
                    throw null;
                }
            }
            int i6 = f887 + 77;
            f886 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 57 / 0;
            }
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m6504(char c, int i, int i2) {
            String str;
            synchronized (c.f1197) {
                char[] cArr = new char[i2];
                c.f1198 = 0;
                while (c.f1198 < i2) {
                    cArr[c.f1198] = (char) ((f888[c.f1198 + i] ^ (c.f1198 * f889)) ^ c);
                    c.f1198++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6491(int[] iArr, int i) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f873.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f83 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f83] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f83];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f83 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f84 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f85 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f84 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f84 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f85 = com.ironsource.adqualitysdk.sdk.i.a.m5774(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f85;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                    com.ironsource.adqualitysdk.sdk.i.a.f84 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                    com.ironsource.adqualitysdk.sdk.i.a.f85 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                com.ironsource.adqualitysdk.sdk.i.a.f84 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                com.ironsource.adqualitysdk.sdk.i.a.f85 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f85 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f84 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f84;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f85;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f84 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f84;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f85 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f85;
                com.ironsource.adqualitysdk.sdk.i.a.m5773(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f83 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f83 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6497(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f872[c.f1198 + i] ^ (c.f1198 * f875)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
