package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TJWebView;
import com.tapjoy.Tapjoy;
import com.tapjoy.mraid.view.ActionHandler;
import com.tapjoy.mraid.view.Browser;
import com.tapjoy.mraid.view.MraidView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class ce extends be {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1271 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1272 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1274 = 218;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1275 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1276 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1277 = {302, 292, 283, 318, 303, 328, 323, 334, 317, 336, 339, 329, 327, 264, 315, 330, 324, 285, 319, 332, 337, 290, 326, 295, 304, 305, 316, 298, 294, 333, 301, 321, 296, 300};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1273 = 3012471481700159311L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m7041(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1271 + 27;
        f1272 = i2 % 128;
        int i3 = i2 % 2;
        String m7051 = m7051(tJPlacementData);
        int i4 = f1271 + 51;
        f1272 = i4 % 128;
        int i5 = i4 % 2;
        return m7051;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m7042(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = 2 % 2;
        int i2 = f1272 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1271 = i2 % 128;
        int i3 = i2 % 2;
        m7049(tJPlacement, tJPlacementVideoListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m7043(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1271 + 29;
        f1272 = i2 % 128;
        if (i2 % 2 != 0) {
            return m7050(tJPlacement);
        }
        m7050(tJPlacement);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementVideoListener m7045(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1271 + 13;
        f1272 = i2 % 128;
        if (i2 % 2 == 0) {
            m7039(tJPlacement);
            throw null;
        }
        TJPlacementVideoListener m7039 = m7039(tJPlacement);
        int i3 = f1272 + 37;
        f1271 = i3 % 128;
        int i4 = i3 % 2;
        return m7039;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m7046(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1272 + 63;
        f1271 = i2 % 128;
        if (i2 % 2 == 0) {
            return m7038(tJPlacementData);
        }
        m7038(tJPlacementData);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementListener m7052(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1272 + 65;
        f1271 = i2 % 128;
        if (i2 % 2 != 0) {
            m7040(tJPlacement);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        TJPlacementListener m7040 = m7040(tJPlacement);
        int i3 = f1271 + 53;
        f1272 = i3 % 128;
        int i4 = i3 % 2;
        return m7040;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m7053(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1271 + 19;
        f1272 = i2 % 128;
        if (i2 % 2 != 0) {
            return m7044(tJPlacementData);
        }
        m7044(tJPlacementData);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ String m7054(TJSplitWebView tJSplitWebView) {
        int i = 2 % 2;
        int i2 = f1271 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1272 = i2 % 128;
        int i3 = i2 % 2;
        String m7047 = m7047(tJSplitWebView);
        int i4 = f1272 + 13;
        f1271 = i4 % 128;
        if (i4 % 2 == 0) {
            return m7047;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public ce(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        if (r13.equals(m7055("輬曏峼㊬⢇ẅ\uf4a5\ueaac쁘뙑갷艞砱渭䐹㨛ᇑ߹ﷵ펳즀뾠閬譀慎坬䵰", android.view.KeyEvent.getDeadChar(0, 0) + 59887).intern()) != false) goto L97;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        int i = 2 % 2;
        char c = 1;
        switch (str.hashCode()) {
            case -1983375197:
                if (str.equals(m7055("輛ퟴ㻬藿\uecff㎓骆\ue1b6䢕꽓\uf654嵡ꑦଁ刕", KeyEvent.keyCodeFromString("") + 22769).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1687314074:
                if (str.equals(m7055("輬䟙Ố햊곟揳㫩\uf1ea죨鿷四ⶑ\ue491뮋犸䦼ñힰ꺤救㱌\uf30c쩫腢塸⽩\ue676뵩琁", Gravity.getAbsoluteGravity(0, 0) + 51449).intern())) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1640254126:
                if (str.equals(m7055("輛䚒ᰢ폥\ua97d惈㚠ఀ쎃饁僊♆ﰲ뎒襤䃢ᙆ", TextUtils.getOffsetAfter("", 0) + 51607).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1628534628:
                if (str.equals(m7055("輂源䱴⨡ট\ue778씨꒑艐", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57773).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1429063965:
                if (str.equals(m7048(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u0094\u0093\u0086\u0093\u0088\u009e\u0087\u009d\u0088\u0086\u0093\u008d\u0093\u0089\u008f\u0097\u009c\u0082\u0081").intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1414965228:
                if (str.equals(m7055("輎痵窉羭摄検渑品姩床䍙䡹䴑", ExpandableListView.getPackedPositionChild(0L) + 64218).intern())) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1147119309:
                if (str.equals(m7048(null, Color.red(0) + 127, null, "\u0095\u0093\u0087\u0099\u009b\u0093\u009a\u0082\u0081\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
                    int i2 = f1272 + 43;
                    f1271 = i2 % 128;
                    int i3 = i2 % 2;
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -872754855:
                if (str.equals(m7055("輛쀺ᅡ択돒̗呐ꖛ\uf6d2䘖靍\ue8be㧚褈\uda5c", (ViewConfiguration.getTouchSlop() >> 8) + 20287).intern())) {
                    int i4 = f1272 + 1;
                    f1271 = i4 % 128;
                    int i5 = i4 % 2;
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -721136035:
                if (str.equals(m7055("輛览芔魌鐮괠\ua7e8ꂠ", 1741 - Color.red(0)).intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -668579974:
                if (str.equals(m7048(null, TextUtils.getTrimmedLength("") + 127, null, "\u0095\u0093\u0087\u0099\u0084\u0087\u008f\u0094\u0098\u008e\u0095\u0093\u0087\u008a\u008e\u0084\u0087\u008f\u0094\u008d\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
                    int i6 = f1271 + 99;
                    f1272 = i6 % 128;
                    if (i6 % 2 != 0) {
                        c = '\n';
                        break;
                    } else {
                        c = 'G';
                        break;
                    }
                }
                c = 65535;
                break;
            case -593336436:
                if (str.equals(m7055("輛䬲ݠ쎝鿲娮ᙡ튍꺂櫒┛\ue177붵秧㐴\uf03a챖袛䓥Ἷ\udb6d鞩厇", 50231 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -217417742:
                if (str.equals(m7048(null, ExpandableListView.getPackedPositionChild(0L) + 128, null, "\u0094\u0093\u0097\u0084\u0086\u008f\u0096\u0086\u008c\u0087\u0088\u0089\u0083\u008e\u0095\u0093\u0087\u008a\u008e\u0084\u0087\u008f\u0094\u008d\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 178410181:
                if (str.equals(m7048(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, null, "\u0095\u0093\u0087\u0099\u009b\u0093\u009a\u0088\u0087\u0097\u0090\u009f\u0082\u0081\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
                    int i7 = f1271 + 9;
                    f1272 = i7 % 128;
                    if (i7 % 2 != 0) {
                        c = 25;
                        break;
                    } else {
                        c = Typography.greater;
                        break;
                    }
                }
                c = 65535;
                break;
            case 206635148:
                if (str.equals(m7048(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u008b\u0088\u0087\u008a\u0087\u0088\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 268330895:
                if (str.equals(m7055("輛匢㝀᭞ﾆ쏢\ua7cc訪渽㉃ᚋ敖\udef2ꋐ蔊楣", 56359 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    int i8 = f1272 + 9;
                    f1271 = i8 % 128;
                    int i9 = i8 % 2;
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 327820672:
                if (str.equals(m7048(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u0094\u0093\u0086\u0093\u0088\u009e\u0087\u009d\u008c\u0093\u0084\u0087\u0099\u0088\u0086\u0093\u008d\u0093\u0089\u008f\u0097\u009c\u0082\u0081").intern())) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 705136807:
                if (str.equals(m7055("輛靐뾦쟅\uee69\uf694Ổ╲䶄嗋", 6229 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 741045788:
                break;
            case 832039888:
                if (str.equals(m7048(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u0094\u0093\u0086\u0093\u0088\u009e\u0087\u009d\u0095\u0093\u0087\u0099\u009b\u0093\u009a\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    int i10 = f1272 + 75;
                    f1271 = i10 % 128;
                    if (i10 % 2 == 0) {
                        c = 16;
                        break;
                    } else {
                        c = '9';
                        break;
                    }
                }
                c = 65535;
                break;
            case 906946425:
                if (str.equals(m7048(null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, "\u0094\u0093\u0086\u0093\u0088\u009e\u0087\u009d\u008c\u0093\u0084\u0087\u0099\u0082\u0081").intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1317517621:
                if (str.equals(m7048(null, Process.getGidForName("") + 128, null, "\u0095\u0093\u0087\u0099\u009b\u0093\u009a\u0088\u0087\u0097\u0090\u009f\u0082\u0081").intern())) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1504750787:
                if (str.equals(m7055("輛Ϙ隢⦽뱙佈숈唡\ue9d0", (Process.myPid() >> 22) + 36061).intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1519750415:
                if (str.equals(m7055("輛ᬺꝡ㎞\udfd2樗\uf650芛⻒뤖䕍", 37951 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    int i11 = f1272 + 85;
                    f1271 = i11 % 128;
                    int i12 = i11 % 2;
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1815593736:
                if (str.equals(m7055("輍檞䑦㿑ᦰ\uf305\ueeef", 58787 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1891461874:
                if (str.equals(m7055("輛뤾\ue378\u2d9a埶耆쩄\uf4a6㻁朵酥\udba3פ俼砜ꉉ\uec8bᛁ弇襋뎡", 13883 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    int i13 = f1272 + 115;
                    f1271 = i13 % 128;
                    if (i13 % 2 == 0) {
                        c = 17;
                        break;
                    } else {
                        c = 'y';
                        break;
                    }
                }
                c = 65535;
                break;
            case 2041573826:
                if (str.equals(m7048(null, 127 - View.combineMeasuredStates(0, 0), null, "\u008b\u0088\u0087\u008a\u0087\u0088\u0089\u0083\u0088\u0086\u0093\u0088\u0086\u008c\u0092\u0082\u0081\u008e\u008b\u008c\u0091\u0090\u008f\u0088\u008e\u008d\u008c\u0089").intern())) {
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
            case 1:
                return TJAdUnitActivity.class;
            case 2:
            case 3:
                return TJContentActivity.class;
            case 4:
                return TJPlacementData.class;
            case 5:
            case 6:
                return ActionHandler.class;
            case 7:
            case '\b':
                return Browser.class;
            case '\t':
            case '\n':
                return MraidView.class;
            case 11:
            case '\f':
                return TJWebView.class;
            case '\r':
                return TJAdUnit.class;
            case 14:
                return TJPlacementListener.class;
            case 15:
                return TJVideoListener.class;
            case 16:
                return TJAdUnit.TJAdUnitWebViewListener.class;
            case 17:
                return TJAdUnit.TJAdUnitVideoListener.class;
            case 18:
                return TJPlacementVideoListener.class;
            case 19:
                return TJAdUnitJSBridge.class;
            case 20:
                return TJCurrency.class;
            case 21:
                return TJPlacement.class;
            case 22:
                return TJActionRequest.class;
            case 23:
                return TJAwardCurrencyListener.class;
            case 24:
            case 25:
                return TJSplitWebView.class;
            default:
                int i14 = f1271 + 77;
                f1272 = i14 % 128;
                int i15 = i14 % 2;
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f1272 + 37;
        f1271 = i2 % 128;
        int i3 = i2 % 2;
        String version = Tapjoy.getVersion();
        int i4 = f1271 + 55;
        f1272 = i4 % 128;
        int i5 = i4 % 2;
        return version;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m7048(null, MotionEvent.axisFromString("") + 128, null, "\u0093\u008d\u008f¡\u0088\u0086\u0093\u008d\u0093\u0089\u008f\u0097\u009c\u0088\u0093 ").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ce.m7041((TJPlacementData) list.get(0));
            }
        });
        hashMap.put(m7055("輨頙ꅝ쪃폱ﳜ", 5939 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ce.m7053((TJPlacementData) list.get(0));
            }
        });
        hashMap.put(m7048(null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, "\u0093\u009e\u0086\u008c\u0090\u009e\u0093¢\u0090\u0088\u0088\u0096\u0088\u0093 ").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ce.m7046((TJPlacementData) list.get(0));
            }
        });
        hashMap.put(m7055("輨爛留碒篪绗怌", Process.getGidForName("") + 64818).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ce.m7043((TJPlacement) list.get(0));
            }
        });
        hashMap.put(m7048(null, 127 - (Process.myTid() >> 22), null, "\u0094\u0093\u0086\u0093\u0088\u009e\u0087\u009d\u0088\u0093 ").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ce.m7052((TJPlacement) list.get(0));
            }
        });
        hashMap.put(m7048(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u0094\u0093\u0086\u0093\u0088\u009e\u0087\u009d\u008c\u0093\u0084\u0087\u0099\u0088\u0093 ").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ce.m7045((TJPlacement) list.get(0));
            }
        });
        hashMap.put(m7055("輼唕㭅Ƥ\ue7da찐鉐碙廻⌑ॊ\uef8e뗞騒恘䚌", TextUtils.indexOf("", "", 0, 0) + 55871).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                ce.m7042((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m7048(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u0097\u0094\u0085\u0088\u009e\u008f\u009d\u0088\u0093 ").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return ce.m7054((TJSplitWebView) list.get(0));
            }
        });
        int i2 = f1271 + 83;
        f1272 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7051(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1271 + 27;
        f1272 = i2 % 128;
        if (i2 % 2 != 0) {
            return tJPlacementData.getPlacementName();
        }
        tJPlacementData.getPlacementName();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7044(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1271 + 31;
        f1272 = i2 % 128;
        int i3 = i2 % 2;
        String url = tJPlacementData.getUrl();
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return url;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static String m7038(TJPlacementData tJPlacementData) {
        int i = 2 % 2;
        int i2 = f1271 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1272 = i2 % 128;
        int i3 = i2 % 2;
        String httpResponse = tJPlacementData.getHttpResponse();
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return httpResponse;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7050(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1272 + 97;
        f1271 = i2 % 128;
        if (i2 % 2 != 0) {
            tJPlacement.getName();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String name = tJPlacement.getName();
        int i3 = f1271 + 51;
        f1272 = i3 % 128;
        int i4 = i3 % 2;
        return name;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static TJPlacementListener m7040(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1272 + 103;
        f1271 = i2 % 128;
        int i3 = i2 % 2;
        TJPlacementListener listener = tJPlacement.getListener();
        int i4 = f1271 + 27;
        f1272 = i4 % 128;
        int i5 = i4 % 2;
        return listener;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static TJPlacementVideoListener m7039(TJPlacement tJPlacement) {
        int i = 2 % 2;
        int i2 = f1271 + 95;
        f1272 = i2 % 128;
        int i3 = i2 % 2;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        int i4 = f1272 + 51;
        f1271 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return videoListener;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m7049(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = 2 % 2;
        int i2 = f1271 + 53;
        f1272 = i2 % 128;
        int i3 = i2 % 2;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = f1272 + 61;
        f1271 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7047(TJSplitWebView tJSplitWebView) {
        int i = 2 % 2;
        int i2 = f1272 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1271 = i2 % 128;
        if (i2 % 2 != 0) {
            tJSplitWebView.getLastUrl();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String lastUrl = tJSplitWebView.getLastUrl();
        int i3 = f1271 + 99;
        f1272 = i3 % 128;
        int i4 = i3 % 2;
        return lastUrl;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7048(String str, int i, int[] iArr, String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (k.f2956) {
            char[] cArr3 = f1277;
            int i2 = f1274;
            if (f1276) {
                int length = bArr2.length;
                k.f2955 = length;
                char[] cArr4 = new char[length];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                    k.f2957++;
                }
                return new String(cArr4);
            }
            if (f1275) {
                int length2 = cArr2.length;
                k.f2955 = length2;
                char[] cArr5 = new char[length2];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                    k.f2957++;
                }
                return new String(cArr5);
            }
            int length3 = iArr.length;
            k.f2955 = length3;
            char[] cArr6 = new char[length3];
            k.f2957 = 0;
            while (k.f2957 < k.f2955) {
                cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                k.f2957++;
            }
            return new String(cArr6);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7055(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1273);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
