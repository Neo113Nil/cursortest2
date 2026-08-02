package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class cf extends be {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1286 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1287;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1292 = {'G', 5596, 11108, 16521, 22020, 27563, 33268, 38723, 46596, 41872, 40250, 63105, 57462, 56814, 14297, 8490, 6793, 29790, 25075, 23452, 46441, 44702, 39027, 62926, 61316, 55563, 12990, 11353, 6638, 29547, 27918, 62101, 59137, 55723, 45584, 42215, 39295, 29512, 26043, 24088, 12495, 9570, 7949, 61944, 59914, 56527, 45439, 43802, 40321, 30241, 26879, 23925, 14330, 10639, 552, 62687, 59738, 50175, 'L', 5625, 11102, 16556, 22035, 27547, 33265, 38744, 44197, 49689, 55220, 60873, 835, 6348, 11833, 17310, 23017, 28524, 33993, 'c', 5623, 11101, 16614, 22033, 27529, 33214, 38733, 44270, 49721, 55188, 60923, 782, 6388, 11825, 17286, 23012, 28523, 34003, 39465, 44944, 50461, 56145, 61676, 1537, 7099, 12548, 18273, 23766, 29265, 34724, 40209, 'R', 5629, 11079, 16553, 22034, 27548, 33254, 38721, 44196, 49725, 55199, 60868, 833, 6358, 11828, 17307, 23011, 28537, 33984, 39469, 44961, 50492, 56145, 61643, 1588, 7089, 12550, 18273, 23764, 29249, 'R', 5629, 11079, 16553, 22034, 27548, 33222, 38721, 44196, 49725, 55199, 60873, 868, 35375, 40832, 41274, 51924, 56431, 57825, 3003, 7484, 9945, 18496, 24034, 26548, 35097, 37513, 42052, 51686, 54153, 58624, 3747, 4176, 9711, 4758, 1837, 14731, 21110, 17659, 31046, 37658, 34195, 48744, 53475, 50503, 65313, 'U', 5622, 11097, 16558, 22025, 27549, 33268, 38762, 44193, 49718, 55198, 60909, 850, 6393, 11796, 17316, 23017, 28523, 33988, 39469, 44942, 50461, 56162, 'A', 5576, 11104, 16539, 22036, 27545, 33252, 38749, 44211, 'A', 5595, 11108, 16524, 'A', 5596, 11132, 16545, 22035, 27532, 33269, 38726, 44197, 49706, 'g', 5629, 11076, 16527, 22052, 27564, 33233, 38732, 44173, 49721, 55198, 60911, 837, 6346, 'g', 5629, 11076, 16521, 22032, 27528, 33241, 38732, 52950, 56140, 58869, 36395, 39092, 42302, 20288, 23019, 25109, 3212, 6437, 9084, 52713, 54909, 57490, 43531, 49041, 33064, 60141, 64610, 49632, 11161, 15670, 1759, 26688, 32245, 18320, 43301, 45749, 33872, 59841, 62356, 50432};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1293 = 8752808991988061592L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1290 = 57824;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1291 = 6883;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f1288 = 1418;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1289 = 47729;

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ IGDTAdManager m7056() {
        int i = 2 % 2;
        int i2 = f1286 + 83;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        IGDTAdManager m7057 = m7057();
        int i4 = f1287 + 11;
        f1286 = i4 % 128;
        int i5 = i4 % 2;
        return m7057;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m7060(LiteAbstractAD liteAbstractAD) {
        int i = 2 % 2;
        int i2 = f1287 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1286 = i2 % 128;
        if (i2 % 2 != 0) {
            return m7059(liteAbstractAD);
        }
        m7059(liteAbstractAD);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ Map m7066(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f1286 + 97;
        f1287 = i2 % 128;
        if (i2 % 2 == 0) {
            return m7062(rewardVideoAD);
        }
        m7062(rewardVideoAD);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ int m7067(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f1286 + 27;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        int m7058 = m7058(rewardVideoAD);
        int i4 = f1287 + 19;
        f1286 = i4 % 128;
        int i5 = i4 % 2;
        return m7058;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m7068(APPStatus aPPStatus) {
        int i = 2 % 2;
        int i2 = f1286 + 13;
        f1287 = i2 % 128;
        if (i2 % 2 != 0) {
            m7064(aPPStatus);
            throw null;
        }
        String m7064 = m7064(aPPStatus);
        int i3 = f1287 + 111;
        f1286 = i3 % 128;
        int i4 = i3 % 2;
        return m7064;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m7069(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = 2 % 2;
        int i2 = f1286 + 103;
        f1287 = i2 % 128;
        if (i2 % 2 != 0) {
            m7065(unifiedInterstitialAD);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Map m7065 = m7065(unifiedInterstitialAD);
        int i3 = f1287 + 113;
        f1286 = i3 % 128;
        int i4 = i3 % 2;
        return m7065;
    }

    public cf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1287 + 23;
        f1286 = i2 % 128;
        int i3 = i2 % 2;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        int i4 = f1286 + 67;
        f1287 = i4 % 128;
        if (i4 % 2 == 0) {
            return integrationSDKVersion;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0363, code lost:
    
        if (r24.equals(m7063((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 221 - android.widget.ExpandableListView.getPackedPositionType(0), android.graphics.Color.argb(0, 0, 0, 0) + 10).intern()) != false) goto L84;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        char c;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1950656211:
                if (str.equals(m7063((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) + 58, 18 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1537668511:
                if (str.equals(m7061("廽꼍鈣쀽祥긐葟䍱\u0a54㱴䶨ޛ郌뱱瑪ﱭ깘ꌦ䴳Ꙩ鍢맰", ImageFormat.getBitsPerPixel(0) + 22).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1192770783:
                if (str.equals(m7063((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 109 - Gravity.getAbsoluteGravity(0, 0), 30 - (Process.myPid() >> 22)).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1125491209:
                break;
            case -1040623465:
                if (str.equals(m7061("룃妢靖ꥑ핦ꯟ\ud9d0\uf6fd뿽㥈\ud9bc\uf844香翶", ExpandableListView.getPackedPositionType(0L) + 14).intern())) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -839956733:
                if (str.equals(m7061("廽꼍鈣쀽祥긐뎩遏殿薩뫖\ud8ef츁㣭祥긐\ue8f2\uebcf", (ViewConfiguration.getEdgeSlop() >> 16) + 17).intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -570955421:
                if (str.equals(m7063((char) (35452 - ExpandableListView.getPackedPositionChild(0L)), 151 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getTrimmedLength("") + 21).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -427681737:
                if (str.equals(m7061("㼾鴘툾\uea6f⣥岈뼺\uf6b5", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -358530385:
                if (str.equals(m7063((char) ((-16772390) - Color.rgb(0, 0, 0)), Color.red(0) + 173, (KeyEvent.getMaxKeyCode() >> 16) + 12).intern())) {
                    int i2 = f1286 + 53;
                    f1287 = i2 % 128;
                    int i3 = i2 % 2;
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -311779863:
                if (str.equals(m7061("叝\uf109\uf444膌\uf52c뾳훻휷﮻Ძ狀㮾諣\ud949簜읽\ued7c⫆\u1ccb\ue8aa浓\udab5谓뺘ĵ昲搙ቆ쒑竛ౘ\u0d0d涏뻷帕彋嘾掟\ue91d筍瑪ﱭ꣼Ψ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -301299368:
                if (str.equals(m7061("㼾鴘냣\uf61c郌뱱⣥岈䶨ޛ៓㥳ౘ\u0d0d⃚犪두Պ", 17 - KeyEvent.keyCodeFromString("")).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -287046183:
                if (str.equals(m7061("눙˶윳ꦱ䠹楛\ud9bc\uf844꼈\ue61d랑퉎㔹豗퓡❩▭櫥⌚\uecfa帕彋嘾掟\ue91d筍瑪ﱭ꣼Ψ", 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -207731435:
                if (!(!str.equals(m7061("叝\uf109\uf444膌\uf52c뾳훻휷﮻Ძ狀㮾⋫½㔹豗퓡❩▭櫥⌚\uecfa帕彋嘾掟\ue91d筍瑪ﱭ꣼Ψ", ExpandableListView.getPackedPositionGroup(0L) + 31).intern()))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2003474:
                if (str.equals(m7063((char) Color.argb(0, 0, 0, 0), 216 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf("", "") + 4).intern())) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 167349330:
                if (str.equals(m7061("㼾鴘\ud9d0\uf6fd뿽㥈\ud9bc\uf844香翶", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 555831221:
                if (str.equals(m7063((char) KeyEvent.keyCodeFromString(""), 185 - TextUtils.indexOf("", ""), 23 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 796884557:
                if (str.equals(m7061("踃稬⮉∽ᶪ狛瑪ﱭ㼾鴘\ud9d0\uf6fd뿽㥈\ud9bc\uf844香翶", 18 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 814717722:
                if (str.equals(m7063((char) (46695 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.getDefaultSize(0, 0) + 8, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 937653587:
                if (str.equals(m7063((char) View.resolveSizeAndState(0, 0, 0), 207 - TextUtils.lastIndexOf("", '0', 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9).intern())) {
                    int i4 = f1287 + 93;
                    f1286 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1265986405:
                if (str.equals(m7063((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 77 - (Process.myTid() >> 22), Color.green(0) + 32).intern())) {
                    int i6 = f1286 + 105;
                    f1287 = i6 % 128;
                    if (i6 % 2 == 0) {
                        c = 6;
                        break;
                    } else {
                        c = 'P';
                        break;
                    }
                }
                c = 65535;
                break;
            case 1305853839:
                if (str.equals(m7063((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 139, 13 - KeyEvent.normalizeMetaState(0)).intern())) {
                    int i7 = f1287 + 95;
                    f1286 = i7 % 128;
                    if (i7 % 2 != 0) {
                        c = 15;
                        break;
                    } else {
                        c = '%';
                        break;
                    }
                }
                c = 65535;
                break;
            case 1336889139:
                if (str.equals(m7061("냣\uf61c⃚犪튴\ue26e郌뱱ᶪ狛嘾掟㼾鴘", 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1773421109:
                if (str.equals(m7061("廽꼍鈣쀽祥긐葟䍱\u0a54㱴䶨ޛ郌뱱瑪ﱭ깘ꌦ䴳Ꙩᖵ䇌泵棛⃚犪뫖\ud8ef두Պ", TextUtils.getTrimmedLength("") + 29).intern())) {
                    int i8 = f1287 + 91;
                    f1286 = i8 % 128;
                    if (i8 % 2 != 0) {
                        c = 14;
                        break;
                    }
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1874129984:
                if (str.equals(m7063((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 9).intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1958130193:
                if (str.equals(m7061("叝\uf109\uf444膌\uf52c뾳훻휷﮻Ძ狀㮾諣\ud949簜읽\ued7c⫆\u1ccb\ue8aa浓\udab5谓뺘踃稬⮉∽ᶪ狛瑪ﱭ㼾鴘\ud9d0\uf6fd뿽㥈\ud9bc\uf844香翶", Color.rgb(0, 0, 0) + 16777258).intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2111488863:
                if (str.equals(m7063((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 62197), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, 27 - TextUtils.indexOf("", "", 0)).intern())) {
                    int i9 = f1286 + 67;
                    f1287 = i9 % 128;
                    int i10 = i9 % 2;
                    c = 4;
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
                break;
            case 1:
            case 2:
                break;
            case 3:
            case 4:
                break;
            case 5:
            case 6:
                break;
            case 7:
            case '\b':
                break;
            case '\t':
            case '\n':
                break;
            case 11:
            case '\f':
                break;
            case '\r':
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            default:
                int i11 = f1286 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f1287 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 43 / 0;
                    break;
                }
                break;
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m7063((char) TextUtils.getOffsetBefore("", 0), 231 - Color.alpha(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cf.m7056();
            }
        });
        hashMap.put(m7063((char) View.resolveSize(0, 0), 245 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 8).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cf.m7068((APPStatus) list.get(0));
            }
        });
        hashMap.put(m7061("傸㲃᪦\uee44谏龫ᶪ狛醐굻娲檲", 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cf.m7060((LiteAbstractAD) list.get(0));
            }
        });
        hashMap.put(m7061("傸㲃體䙰簜읽\ued7c⫆옍폏ፂꨏ欌족︡ꔶ", TextUtils.indexOf("", "", 0, 0) + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return Integer.valueOf(cf.m7067((RewardVideoAD) list.get(0)));
            }
        });
        hashMap.put(m7063((char) (52913 - Color.argb(0, 0, 0, 0)), 252 - TextUtils.indexOf((CharSequence) "", '0', 0), 15 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cf.m7066((RewardVideoAD) list.get(0));
            }
        });
        hashMap.put(m7063((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43628), (ViewConfiguration.getScrollBarSize() >> 8) + 268, 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return cf.m7069((UnifiedInterstitialAD) list.get(0));
            }
        });
        int i2 = f1287 + 63;
        f1286 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static IGDTAdManager m7057() {
        int i = 2 % 2;
        int i2 = f1286 + 73;
        f1287 = i2 % 128;
        if (i2 % 2 == 0) {
            return GDTAdSdk.getGDTAdManger();
        }
        GDTAdSdk.getGDTAdManger();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7064(APPStatus aPPStatus) {
        int i = 2 % 2;
        int i2 = f1287 + 73;
        f1286 = i2 % 128;
        int i3 = i2 % 2;
        String appid = aPPStatus.getAPPID();
        int i4 = f1287 + 51;
        f1286 = i4 % 128;
        if (i4 % 2 != 0) {
            return appid;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, Object> m7059(LiteAbstractAD liteAbstractAD) {
        int i = 2 % 2;
        int i2 = f1286 + 13;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        int i4 = f1287 + 61;
        f1286 = i4 % 128;
        int i5 = i4 % 2;
        return extraInfo;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int m7058(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f1286 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1287 = i2 % 128;
        int i3 = i2 % 2;
        int rewardAdType = rewardVideoAD.getRewardAdType();
        int i4 = f1287 + 71;
        f1286 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return rewardAdType;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Map<String, String> m7062(RewardVideoAD rewardVideoAD) {
        int i = 2 % 2;
        int i2 = f1286 + 29;
        f1287 = i2 % 128;
        if (i2 % 2 != 0) {
            rewardVideoAD.getExts();
            throw null;
        }
        Map<String, String> exts = rewardVideoAD.getExts();
        int i3 = f1286 + 59;
        f1287 = i3 % 128;
        int i4 = i3 % 2;
        return exts;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map m7065(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = 2 % 2;
        int i2 = f1286 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1287 = i2 % 128;
        if (i2 % 2 != 0) {
            unifiedInterstitialAD.getExt();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Map ext = unifiedInterstitialAD.getExt();
        int i3 = f1286 + 55;
        f1287 = i3 % 128;
        int i4 = i3 % 2;
        return ext;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7063(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1292[c.f1198 + i] ^ (c.f1198 * f1293)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7061(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1290)) ^ ((c2 >>> 5) + f1288)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1291) ^ ((c3 + i2) ^ ((c3 << 4) + f1289))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
