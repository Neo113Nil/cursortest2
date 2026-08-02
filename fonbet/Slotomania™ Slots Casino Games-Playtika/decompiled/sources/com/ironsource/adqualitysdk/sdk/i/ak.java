package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.Collections;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ak {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f318 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f319;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final av f323;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f324;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f322 = {8900, 9223, 12050, 13835, 14654, AbstractJsonLexerKt.COLON, 2856, 4663, 5422, 7248, 26494, 28240, 29022, 30817, 17266, 19048, 19776, 21648, 24473, 42636, 43404, 45217, 48052, 33450, 34211, 36071, 38872, 40659, 57800, 59643, 62440, 64224, 42774, 41420, 43723, 45978, 48321, 34221, 36598, 38904, 37115, 39305, 58053, 60318, 62592, 64958, 50865, 53170, 51384, 53517, 55880, 9048, 11345, 13668, 15972, 1897, '|', 2306, 4619, 7005, 25607, 27944, 30259, 32568, 30779, 17112, 19392, 21639, 23957, 42720, 45036, 43246, 45542, 47748, 33675, 35994, 38357, 40608, 59296, 57529, 59836, 62028, 64337, 50260, 52570, 54883, 57125, 55411, 8560, 10777, 13074, 15378, 1287, 3622, 4895, 5602, 7907, 2041, 2300, 48973, 47538, 45746, 43953, 42153, 40346, 38559, GMTDateParser.HOURS, 1693, 3484, 5249, 7061, 8885, 'a', 1672, 3456, 5252, 7055, 8878, 10681, 12454, 40985, 42746, 44533, 46320, 48117, 33493, 35288, 37079};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f321 = -3108519436261128456L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f320 = 87;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ boolean m5988(ak akVar) {
        int i = 2 % 2;
        int i2 = f318;
        int i3 = i2 + 19;
        f319 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = akVar.f324;
        int i5 = i2 + 25;
        f319 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ av m5989(ak akVar) {
        int i = 2 % 2;
        int i2 = f318 + 7;
        int i3 = i2 % 128;
        f319 = i3;
        int i4 = i2 % 2;
        av avVar = akVar.f323;
        int i5 = i3 + 9;
        f318 = i5 % 128;
        if (i5 % 2 != 0) {
            return avVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ boolean m5991(ak akVar, boolean z) {
        int i = 2 % 2;
        int i2 = f318 + 73;
        int i3 = i2 % 128;
        f319 = i3;
        int i4 = i2 % 2;
        akVar.f324 = z;
        if (i4 != 0) {
            int i5 = 19 / 0;
        }
        int i6 = i3 + 19;
        f318 = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m5992(ak akVar, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        int i2 = f318 + 55;
        f319 = i2 % 128;
        if (i2 % 2 == 0) {
            return m5986(iSAdQualityCustomMediationRevenue);
        }
        m5986(iSAdQualityCustomMediationRevenue);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public ak(av avVar) {
        this.f323 = avVar;
        jt.m8290().m8295(new js() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.2
            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                p.m8552(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.2.5

                    /* renamed from: ﱟ, reason: contains not printable characters */
                    private static int f331 = 0;

                    /* renamed from: ﱡ, reason: contains not printable characters */
                    private static int f332 = 1;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static char f333 = 47972;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static char f334 = 64565;

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static char f335 = 16420;

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static char f336 = 20377;

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
                    
                        if (com.ironsource.adqualitysdk.sdk.i.ak.m5988(r5.f337.f330) != false) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
                    
                        if (com.ironsource.adqualitysdk.sdk.i.ak.m5988(r5.f337.f330) != false) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
                    
                        com.ironsource.adqualitysdk.sdk.i.ak.m5989(r5.f337.f330).m6211(m5999("ᅞ麴輵⅍猅⎎\uf79c辨壂꤅Ư鱞蜨뼓罂儠㒺\ueba0Ꚁᵘ\ue272勺䰢捬", 24 - android.text.TextUtils.indexOf("", "", 0)).intern());
                        com.ironsource.adqualitysdk.sdk.i.ak.m5991(r5.f337.f330, false);
                     */
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void mo5828() throws Exception {
                        int i = 2 % 2;
                        int i2 = f332 + 89;
                        f331 = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 76 / 0;
                        }
                        int i4 = f332 + 19;
                        f331 = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static String m5999(String str, int i) {
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
                                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f334)) ^ ((c2 >>> 5) + f333)));
                                    cArr4[1] = c3;
                                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f336) ^ ((c3 + i2) ^ ((c3 << 4) + f335))));
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
                });
            }
        });
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5997(final ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        if (m5994(iSAdQualityCustomMediationRevenue)) {
            p.m8553(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.1

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static int[] f325 = {-1738085822, 1959422427, 750096908, 1527960541, -2119128435, -850569628, 1901614559, 1954503865, 984734577, 192646998, 931260527, -270404433, 2025150088, 1117469606, -2110533408, 1321589429, -1584618456, -1292505397};

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static int f326 = 1;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static int f327;

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    av m5989;
                    String m5998;
                    int i2 = 2 % 2;
                    int i3 = f326 + 33;
                    f327 = i3 % 128;
                    if (i3 % 2 != 0) {
                        m5989 = ak.m5989(ak.this);
                        m5998 = m5998(new int[]{220835106, -1820950828, 709593607, -99138094, -1791054619, -2029387669, 198366397, 1834715282, 948431667, -437140029, 1470928267, 567674473}, 91 >>> (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    } else {
                        m5989 = ak.m5989(ak.this);
                        m5998 = m5998(new int[]{220835106, -1820950828, 709593607, -99138094, -1791054619, -2029387669, 198366397, 1834715282, 948431667, -437140029, 1470928267, 567674473}, 22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    }
                    m5989.m6212(m5998.intern(), Collections.singletonList(ak.m5992(ak.this, iSAdQualityCustomMediationRevenue)));
                    ak.m5991(ak.this, true);
                    int i4 = f327 + 65;
                    f326 = i4 % 128;
                    int i5 = i4 % 2;
                }

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static String m5998(int[] iArr, int i2) {
                    String str;
                    synchronized (a.f86) {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f325.clone();
                        a.f83 = 0;
                        while (a.f83 < iArr.length) {
                            cArr[0] = (char) (iArr[a.f83] >> 16);
                            cArr[1] = (char) iArr[a.f83];
                            cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                            cArr[3] = (char) iArr[a.f83 + 1];
                            a.f84 = (cArr[0] << 16) + cArr[1];
                            a.f85 = (cArr[2] << 16) + cArr[3];
                            a.m5773(iArr2);
                            for (int i3 = 0; i3 < 16; i3++) {
                                int i4 = a.f84 ^ iArr2[i3];
                                a.f84 = i4;
                                a.f85 = a.m5774(i4) ^ a.f85;
                                int i5 = a.f84;
                                a.f84 = a.f85;
                                a.f85 = i5;
                            }
                            int i6 = a.f84;
                            a.f84 = a.f85;
                            a.f85 = i6;
                            a.f85 = i6 ^ iArr2[16];
                            a.f84 ^= iArr2[17];
                            int i7 = a.f84;
                            int i8 = a.f85;
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
                        str = new String(cArr2, 0, i2);
                    }
                    return str;
                }
            }, ar.m6041().mo6058());
            int i2 = f318 + 29;
            f319 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = f318 + 89;
        f319 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m5994(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        if (iSAdQualityCustomMediationRevenue != null) {
            int i2 = f318 + 1;
            f319 = i2 % 128;
            if (i2 % 2 == 0 ? iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d : iSAdQualityCustomMediationRevenue.getRevenue() < 1.0d) {
                m.m8523(m5996((char) (Drawable.resolveOpacity(0, 0) + 8845), KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(0) + 32).intern(), m5990(67 - (ViewConfiguration.getPressedStateDuration() >> 16), false, 182 - TextUtils.getCapsMode("", 0, 0), "ￎ\u000f\u0006\b\u0002\u0015\n\u0017\u0006￤\u0002\u000f\uffc8\u0015\uffc1\u0014\u0006\u000f\u0005\uffc1\u0004\u0016\u0014\u0015\u0010\u000e\uffc1\u000e\u0006\u0005\n\u0002\u0015\n\u0010\u000f\uffc1\u0013\u0006\u0017\u0006\u000f\u0016\u0006ￛ\uffc1\u0013\u0006\u0017\u0006\u000f\u0016\u0006\uffc1\u0014\t\u0010\u0016\r\u0005\uffc1\u0003\u0006\uffc1\u000f\u0010\u000f", ((byte) KeyEvent.getModifierMetaStateMask()) + 10).intern());
                int i3 = f318 + 103;
                f319 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!m5987(iSAdQualityCustomMediationRevenue.getMediationNetwork())) {
                m.m8523(m5996((char) (8845 - View.resolveSize(0, 0)), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 32 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m5996((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42837), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 32, 62 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                int i5 = f318 + 67;
                f319 = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (!(!m5993(iSAdQualityCustomMediationRevenue.getAdType()))) {
                return true;
            }
            m.m8523(m5996((char) (((Process.getThreadPriority(0) + 20) >> 6) + 8845), ExpandableListView.getPackedPositionChild(0L) + 1, (Process.myTid() >> 22) + 32).intern(), m5990((ViewConfiguration.getTapTimeout() >> 16) + 108, false, 181 - MotionEvent.axisFromString(""), "\u0014\u0006\u000f\u0005\uffc1\u0004\u0016\u0014\u0015\u0010\u000e\uffc1\u000e\u0006\u0005\n\u0002\u0015\n\u0010\u000f\uffc1\u0013\u0006\u0017\u0006\u000f\u0016\u0006ￛ\uffc1\u0014\u0016\u0011\u0011\u0010\u0013\u0015\u0006\u0005\uffc1\u0002\u0005\uffc1\u0015\u001a\u0011\u0006\u0014\uffc1\u0002\u0013\u0006\uffc1\n\u000f\u0015\u0006\u0013\u0014\u0015\n\u0015\n\u0002\rￍ\uffc1\u0017\n\u0005\u0006\u0010ￍ\uffc1\u0013\u0006\u0018\u0002\u0013\u0005\u0006\u0005\uffc1\u0017\n\u0005\u0006\u0010\uffc1\u0002\u000f\u0005\uffc1\u0013\u0006\u0018\u0002\u0013\u0005\u0006\u0005￤\u0002\u000f\uffc8\u0015\uffc1", 102 - TextUtils.getCapsMode("", 0, 0)).intern());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r4 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r4 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.ak.f318 + 49;
        com.ironsource.adqualitysdk.sdk.i.ak.f319 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        return true;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m5987(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        int i = 2 % 2;
        if (iSAdQualityMediationNetwork != null) {
            int i2 = f319 + 17;
            f318 = i2 % 128;
            int i3 = i2 % 2;
            boolean isEmpty = TextUtils.isEmpty(m5995(iSAdQualityMediationNetwork));
            if (i3 == 0) {
                int i4 = 19 / 0;
            }
        }
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m5993(ISAdQualityAdType iSAdQualityAdType) {
        int i = 2 % 2;
        if (iSAdQualityAdType != ISAdQualityAdType.INTERSTITIAL && iSAdQualityAdType != ISAdQualityAdType.VIDEO && iSAdQualityAdType != ISAdQualityAdType.REWARDED_VIDEO) {
            int i2 = f319 + 27;
            f318 = i2 % 128;
            int i3 = i2 % 2;
            if (iSAdQualityAdType != ISAdQualityAdType.REWARDED) {
                return false;
            }
        }
        int i4 = f318 + 61;
        f319 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return true;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m5986(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        dk dkVar = new dk();
        dkVar.m7571(true);
        dkVar.m7569(Double.valueOf(iSAdQualityCustomMediationRevenue.getRevenue()));
        dkVar.m7568(m5995(iSAdQualityCustomMediationRevenue.getMediationNetwork()));
        dkVar.m7570(iSAdQualityCustomMediationRevenue.getPlacement());
        JSONObject m7572 = dkVar.m7572();
        int i2 = f318 + 51;
        f319 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return m7572;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m5995(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        int i = 2 % 2;
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return m5996((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 4990), 94 - KeyEvent.normalizeMetaState(0), 5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            return m5996((char) (48939 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 99 - (ViewConfiguration.getJumpTapTimeout() >> 16), 7 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return m5996((char) TextUtils.indexOf("", ""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 106, 6 - View.resolveSize(0, 0)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            return m5990(10 - (Process.myPid() >> 22), true, (ViewConfiguration.getTapTimeout() >> 16) + 196, "\u0003\b\u0006\ufff6￼\u0001\u0002\u0006\u0005\ufff8", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2).intern();
        }
        if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.MAX) {
            if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
                int i2 = f319 + 11;
                f318 = i2 % 128;
                int i3 = i2 % 2;
                return m5996((char) (41068 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 120, KeyEvent.normalizeMetaState(0) + 8).intern();
            }
            if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
                return m5990(12 - TextUtils.indexOf("", ""), false, 191 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\f�￼\u000b�\u0004\ufffe\u0005�￼\u0001\ufff9", 4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern();
            }
            return iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.OTHER ? m5990(5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 195, "\u0007\u0002\u0005\ufff8\ufffb", 2 - (KeyEvent.getMaxKeyCode() >> 16)).intern() : "";
        }
        int i4 = f318 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f319 = i4 % 128;
        return i4 % 2 != 0 ? m5996((char) KeyEvent.getDeadChar(1, 1), 58 >>> (ViewConfiguration.getScrollDefaultDelay() % 104), 65 >> (Process.myPid() * 42)).intern() : m5996((char) KeyEvent.getDeadChar(0, 0), 112 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 8 - (Process.myPid() >> 22)).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m5996(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f322[c.f1198 + i] ^ (c.f1198 * f321)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m5990(int i, boolean z, int i2, String str, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (d.f1644) {
            char[] cArr3 = new char[i];
            d.f1641 = 0;
            while (d.f1641 < i) {
                d.f1643 = cArr2[d.f1641];
                cArr3[d.f1641] = (char) (d.f1643 + i2);
                int i4 = d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f320);
                d.f1641++;
            }
            if (i3 > 0) {
                d.f1642 = i3;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
            }
            if (z) {
                char[] cArr5 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                    d.f1641++;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
