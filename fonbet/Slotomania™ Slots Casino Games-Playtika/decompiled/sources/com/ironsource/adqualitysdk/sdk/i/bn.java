package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.be;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.io.encoding.Base64;

/* loaded from: classes.dex */
public final class bn extends be {

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f928 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f931 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f933 = null;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f934 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f935 = 250;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f937 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f938 = {315, 350, 336, 355, 351, 369, 318, 365, 362, 358, 347, 371, 317, 361, 360, 366, 364, 323, 326, 332, 367, 349, 328, 357, 368, 359, 296, 352, 348, 316, 353, 330, 320, 334, 325, 319, 327};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f936 = -2104149795;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f932 = 35;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f930 = -2104095812;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] f929 = {-26, -3, -31, -12, -1, -19, 19, -51, 19, -28, 77, 71, 74, 119, 43, 109, -25, -14, -36, -18, -42, -26, -17, 2, -51, 8, -12, Ascii.RS, 8, Ascii.US, -2, 47, Ascii.US, -57, Ascii.ESC, Ascii.SI, 63, -49, 8, Ascii.FF, Ascii.EM, 9, Ascii.SO, Ascii.SO, 7, 68, -51, 10, Ascii.CAN, -20, -125, -123, -77, 110, -108, -105, -122, -106, -112, -112, -125, -86, 122, -79, -21, -119, 59, 113, 94, 91, 113, 91, 103, 103, 115, 87, 108, -117, -12, 85, 63, 81, 57, 73, 82, 101, 48, 107, Ascii.SUB, 82, 73, 67, 91, 58, 71, 73, 58, 89, 50, 90, 91, -15, 112, 108, 100, 122, 107, -124, Base64.padSymbol, 118, 106, 108, 91, -116, 82, 99, 101, 117, 92, 94, -98, -21, 85, 1, 63, 41, 50, 63, 81, Ascii.SI, 33, 63, 39, 69, 69, -27, 115, 44, 63, 93, 69, 99, 99, -23, Ascii.DC4, -2, Ascii.NAK, -12, 37, -34, -15, Ascii.SI, -9, Ascii.NAK, Ascii.NAK, -19, -11, -33, -15, -39, -23, -14, 5, -48, Ascii.VT, -60, -41, -11, -35, -5, -5, -15, Ascii.FF, -10, Ascii.CR, -35, -6, 8, -19, 5, -14, -9, Ascii.FS, -40, Ascii.VT, -17, -15, Ascii.FF, -21, 3, 32, -14, -122, -117, 92, 108, -119, -112, 84, -127, 115, -123, 106, -102, 83, 102, -124, 108, -118, -118, -125, 101, -14, -99, -114, -106, -125, -99, -92, 105, -111, -94, -114, -113, -109, -126, -115, -64, 102, -101, -114, -124, -77, -15, -94, 83, 125, 124, -85, 97, -102, 84, -123, -120, 119, -121, -127, -127, 116, -101, 91, -114, 125, 7, -84, -78, 115, -109, -94, -111, -87, -84, -127, -118, -87, -74, 119, -114, -63, 100, -99, -93, -117, -91, -115, -87, -70, 110, -111, -101, -112, -101, -89, -81, -127, -102, -115, -95, -108, -99, -121, -52, 101, -89, -106, -11, 117, 95, 113, 89, 105, 114, -123, 80, -117, Base64.padSymbol, 115, 85, 115, 93, 105, 105, 117, 89, 110, -115, Base64.padSymbol, 119, 90, -19, -49, -61, -59, -76, -27, -85, -68, -66, -50, -75, -73, -9, -110, -47, -64, -19, Ascii.DC4, Ascii.SYN, 68, -1, 37, 40, Ascii.ETB, 39, 33, 33, Ascii.DC4, 59, -5, 46, Ascii.GS, -8, -97, -92, 117, -123, -94, -87, 109, -102, -116, -98, -125, -77, 108, Byte.MAX_VALUE, -99, -123, -93, -93, -100, 126, Byte.MAX_VALUE, -127, -93, -116, -125, -97, -24, Ascii.CAN, Ascii.US, -22, 75, -26, 36, Ascii.GS, 19, 36, Ascii.SUB};

    /* renamed from: ﮉ, reason: contains not printable characters */
    static /* synthetic */ DynamicLoader m6563() {
        int i = 2 % 2;
        int i2 = f928 + 79;
        f931 = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader m6562 = m6562();
        int i4 = f931 + 41;
        f928 = i4 % 128;
        int i5 = i4 % 2;
        return m6562;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ String m6565() {
        int i = 2 % 2;
        int i2 = f928 + 67;
        f931 = i2 % 128;
        int i3 = i2 % 2;
        String m6561 = m6561();
        int i4 = f931 + 15;
        f928 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return m6561;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ String m6566() {
        int i = 2 % 2;
        int i2 = f931 + 11;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        String m6564 = m6564();
        int i4 = f928 + 109;
        f931 = i4 % 128;
        int i5 = i4 % 2;
        return m6564;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m6567(AdView adView) {
        int i = 2 % 2;
        int i2 = f928 + 45;
        f931 = i2 % 128;
        if (i2 % 2 != 0) {
            m6570(adView);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String m6570 = m6570(adView);
        int i3 = f928 + 33;
        f931 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return m6570;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m6569(AdView adView, AdListener adListener) {
        int i = 2 % 2;
        int i2 = f931 + 105;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m6578(adView, adListener);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f931 + 65;
        f928 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ WeakHashMap m6571(bn bnVar, WeakHashMap weakHashMap, ck ckVar) {
        int i = 2 % 2;
        int i2 = f931 + 3;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        WeakHashMap<View, WeakReference<Object>> m6577 = bnVar.m6577((WeakHashMap<View, WeakReference<Object>>) weakHashMap, ckVar);
        int i4 = f931 + 89;
        f928 = i4 % 128;
        int i5 = i4 % 2;
        return m6577;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m6572(Ad ad) {
        int i = 2 % 2;
        int i2 = f931 + 111;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        String m6575 = m6575(ad);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        int i5 = f931 + 91;
        f928 = i5 % 128;
        int i6 = i5 % 2;
        return m6575;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m6573(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i = 2 % 2;
        int i2 = f928 + 19;
        f931 = i2 % 128;
        int i3 = i2 % 2;
        m6580(interstitialAd, interstitialAdListener);
        int i4 = f931 + 95;
        f928 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ AdPlacementType m6579(AdAdapter adAdapter) {
        int i = 2 % 2;
        int i2 = f928 + 83;
        f931 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6574(adAdapter);
        }
        m6574(adAdapter);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public bn(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0340, code lost:
    
        if (r20.equals(m6576(null, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 128, null, "\u0082\u0081").intern()) != false) goto L82;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Class mo6356(String str) {
        int i = 2 % 2;
        int i2 = f931 + 39;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        char c = 0;
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(m6568((short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2104095889, TextUtils.indexOf("", "", 0) - 36, 2104149950 - TextUtils.getTrimmedLength(""), (byte) TextUtils.indexOf("", "")).intern())) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -1585374524:
                if (str.equals(m6568((short) (Process.getGidForName("") - 71), ExpandableListView.getPackedPositionGroup(0L) + 2104095894, ImageFormat.getBitsPerPixel(0) - 35, 2104149872 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern())) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1513928064:
                if (str.equals(m6576(null, TextUtils.indexOf("", "", 0) + 127, null, "\u008c\u0090\u0084\u0099\u0084\u0090\u0096\u0081\u0098\u0091\u008e\u0086\u0090\u0085\u0097\u0085\u0096\u008f\u0085\u0084\u0082\u0095\u0081\u009b\u0088\u0082\u008b\u009b\u0098\u008e\u008e\u009d\u0085\u0096\u008b\u009c\u009b\u009a\u008e\u0096").intern())) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1256969519:
                if (str.equals(m6568((short) ((ViewConfiguration.getScrollBarSize() >> 8) + 6), 2104095879 - TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getMode(0) - 36, 2104149966 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) Color.argb(0, 0, 0, 0)).intern())) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -501313640:
                if (str.equals(m6568((short) ((-105) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.getOffsetBefore("", 0) + 2104095880, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 36, KeyEvent.getDeadChar(0, 0) + 2104149896, (byte) ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -498709917:
                if (str.equals(m6576(null, ExpandableListView.getPackedPositionGroup(0L) + 127, null, "\u0091\u0085\u008f\u0085\u0090\u0088\u0084\u0093\u0082\u0081\u008a\u008b\u0084\u0090\u0084\u0090\u0088\u0091\u0085\u0090\u008f\u0092").intern())) {
                    int i4 = f928 + 45;
                    f931 = i4 % 128;
                    if (i4 % 2 == 0) {
                        c = '\b';
                        break;
                    } else {
                        c = '?';
                        break;
                    }
                }
                c = 65535;
                break;
            case -105717264:
                if (str.equals(m6576(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u0082\u0081\u008e\u0085\u0082\u0084\u0083\u0082\u0085\u0082\u0091\u008b\u0086\u0085\u0094").intern())) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2115:
                break;
            case 289409084:
                if (str.equals(m6568((short) (114 - View.MeasureSpec.getMode(0)), 2104095877 - Color.alpha(0), (-36) - ExpandableListView.getPackedPositionGroup(0L), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2104149844, (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern())) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 320151695:
                if (str.equals(m6568((short) ((ViewConfiguration.getEdgeSlop() >> 16) - 102), 2104095885 - Color.alpha(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 36, TextUtils.lastIndexOf("", '0', 0, 0) + 2104149860, (byte) Drawable.resolveOpacity(0, 0)).intern())) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 435867927:
                if (str.equals(m6568((short) (111 - ((byte) KeyEvent.getModifierMetaStateMask())), ExpandableListView.getPackedPositionType(0L) + 2104095888, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 36, 2104150007 - TextUtils.getCapsMode("", 0, 0), (byte) TextUtils.indexOf("", "")).intern())) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 488344453:
                if (str.equals(m6568((short) (TextUtils.indexOf("", "") - 74), 2104095877 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0) - 36, Gravity.getAbsoluteGravity(0, 0) + 2104149804, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern())) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 535330969:
                if (str.equals(m6576(null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, "\u008c\u0090\u0084\u0099\u0084\u0090\u0096\u0081\u0098\u0091\u008e\u0086\u0090\u0085\u0097\u0085\u0096\u008f\u0085\u0084\u0082\u0095\u0081").intern())) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 553704929:
                if (str.equals(m6576(null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, "\u0091\u0085\u008a\u008a\u008e\u0091\u0090\u008f\u008e\u008d\u0082\u0081\u008c\u008b\u008a\u0089\u0088\u0084\u0087").intern())) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1165508119:
                if (str.equals(m6568((short) (27 - TextUtils.indexOf("", "")), ((byte) KeyEvent.getModifierMetaStateMask()) + 2104095878, (-36) - View.combineMeasuredStates(0, 0), 2104149811 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    int i5 = f931;
                    int i6 = i5 + 5;
                    f928 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 33;
                    f928 = i8 % 128;
                    int i9 = i8 % 2;
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1237162638:
                if (str.equals(m6568((short) ((ViewConfiguration.getTapTimeout() >> 16) - 119), 2104095896 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-37) - TextUtils.indexOf((CharSequence) "", '0', 0), 2104149986 - Color.alpha(0), (byte) TextUtils.getOffsetAfter("", 0)).intern())) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1476063628:
                if (str.equals(m6568((short) (16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 2104095877 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-36) - KeyEvent.keyCodeFromString(""), 2104149795 - View.MeasureSpec.getSize(0), (byte) (Process.myTid() >> 22)).intern())) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1838933446:
                if (str.equals(m6568((short) ((-49) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 2104095891, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 36, 2104149916 - Gravity.getAbsoluteGravity(0, 0), (byte) View.getDefaultSize(0, 0)).intern())) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1908493505:
                if (str.equals(m6568((short) (ExpandableListView.getPackedPositionGroup(0L) - 12), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2104095911, (Process.myTid() >> 22) - 36, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2104149820, (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    int i10 = f928 + 61;
                    f931 = i10 % 128;
                    int i11 = i10 % 2;
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1955913096:
                if (str.equals(m6576(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2035065003:
                if (str.equals(m6576(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u0085\u0088\u008b\u009e\u0082\u0081\u0085\u0099\u0084\u0090\u008b\u0097").intern())) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2035668095:
                if (!(!str.equals(m6568((short) ((-2) - ExpandableListView.getPackedPositionType(0L)), 2104095889 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getJumpTapTimeout() >> 16) - 36, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2104149937, (byte) TextUtils.indexOf("", "", 0, 0)).intern()))) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2110329530:
                if (str.equals(m6568((short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 80), 2104095890 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetAfter("", 0) - 36, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2104149930, (byte) TextUtils.getTrimmedLength("")).intern())) {
                    int i12 = f928 + 29;
                    f931 = i12 % 128;
                    if (i12 % 2 == 0) {
                        c = 17;
                        break;
                    } else {
                        c = 'L';
                        break;
                    }
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case '\b':
                return InterstitialAdListener.class;
            case '\t':
                return InterstitialAd.class;
            case '\n':
                int i13 = f928 + 35;
                f931 = i13 % 128;
                if (i13 % 2 == 0) {
                    return RewardedVideoAdListener.class;
                }
                throw null;
            case 11:
                return RewardedVideoAd.class;
            case '\f':
            case '\r':
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                return CircularProgressView.class;
            case 21:
                return e.class;
            case 22:
                return an.m6016();
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put(m6576(null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, "\u0086\u0085\u0084\u0083\u0082\u0081\u009a\u008e\u0091¡\u0082\u0092\u0090\u008f\u0085\u009a\u0085\u0096\u008b\u008a \u0090\u0085\u009f").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bn.m6567((AdView) list.get(0));
            }
        });
        hashMap.put(m6568((short) ((ViewConfiguration.getTouchSlop() >> 8) - 127), 2104095915 - (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionChild(0L) - 35, (ViewConfiguration.getEdgeSlop() >> 16) + 2104150028, (byte) View.getDefaultSize(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bn.m6572((Ad) list.get(0));
            }
        });
        hashMap.put(m6576(null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, "\u0091\u0085\u008f\u0085\u0090\u0088\u0084\u0093\u0082\u0081\u0090\u0085\u0088").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bn.m6569((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6576(null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, "\u008c\u0085£\u0085\u0089\u008c¢\u0086\u0085\u0084\u0083\u008c\u0090\u0084\u0099\u0084\u0090\u0096\u0081\u0098\u0091\u008e\u0086\u0090\u0085\u0097\u0085\u0096\u008f\u0085\u0084\u0082\u0095\u0081\u0090\u0085\u009f").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bn.m6566();
            }
        });
        hashMap.put(m6568((short) (TextUtils.indexOf("", "", 0, 0) + 104), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2104095915, (-36) - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2104150048, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bn.m6565();
            }
        });
        hashMap.put(m6568((short) (Color.blue(0) - 104), (Process.myTid() >> 22) + 2104095927, (-36) - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2104150089, (byte) (ViewConfiguration.getTouchSlop() >> 8)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                bn.m6573((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        hashMap.put(m6568((short) ('n' - AndroidCharacter.getMirror('0')), 2104095915 - Color.alpha(0), (-35) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2104150115 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (Process.myPid() >> 22)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bn.m6563();
            }
        });
        hashMap.put(m6568((short) ((-31) - TextUtils.indexOf("", "")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2104095914, (-36) - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 2104150131, (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bn.m6579((AdAdapter) list.get(0));
            }
        });
        hashMap.put(m6568((short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 111), 2104095911 - View.MeasureSpec.makeMeasureSpec(0, 0), Process.getGidForName("") - 35, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2104150146, (byte) KeyEvent.getDeadChar(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* renamed from: ﻐ */
            public final Object mo6359(List<Object> list, ck ckVar) {
                return bn.m6571(bn.this, (WeakHashMap) list.get(0), ckVar);
            }
        });
        int i2 = f931 + 57;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f928 + 61;
        f931 = i2 % 128;
        Object obj = null;
        try {
            try {
                try {
                    if (i2 % 2 == 0) {
                        String str = (String) id.m7937().m7940().m7869(AdSdkVersion.class, String.class).get(null);
                        int i3 = f931 + 61;
                        f928 = i3 % 128;
                        if (i3 % 2 != 0) {
                            return str;
                        }
                        super.hashCode();
                        throw null;
                    }
                    throw null;
                } catch (Throwable unused) {
                    return null;
                }
            } catch (Throwable unused2) {
                return id.m7937().m7939().m8046(BuildConfig.class, m6568((short) ((-28) - TextUtils.indexOf("", "")), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2104095906, (-36) - TextUtils.getTrimmedLength(""), 2104150173 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) KeyEvent.getDeadChar(0, 0)).intern());
            }
        } catch (Throwable unused3) {
            return (String) id.m7937().m7940().m7869(AdSdkVersion.class, String.class).get(null);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6570(AdView adView) {
        int i = 2 % 2;
        int i2 = f931 + 51;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = adView.getPlacementId();
        int i4 = f931 + 75;
        f928 = i4 % 128;
        if (i4 % 2 != 0) {
            return placementId;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6575(Ad ad) {
        int i = 2 % 2;
        int i2 = f931 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        String placementId = ad.getPlacementId();
        int i4 = f931 + 83;
        f928 = i4 % 128;
        if (i4 % 2 != 0) {
            return placementId;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m6578(AdView adView, AdListener adListener) {
        int i = 2 % 2;
        int i2 = f928 + 91;
        f931 = i2 % 128;
        int i3 = i2 % 2;
        adView.setAdListener(adListener);
        int i4 = f928 + 105;
        f931 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static String m6564() {
        int i = 2 % 2;
        int i2 = f928 + 115;
        f931 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m6576(null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, "\u0085\u0089\u008c¢\u0086\u0085\u0084\u0099").intern();
        int i4 = f928 + 33;
        f931 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static String m6561() {
        int i = 2 % 2;
        int i2 = f928 + 9;
        f931 = i2 % 128;
        String intern = m6576(null, i2 % 2 != 0 ? (PointF.length(2.0f, 1.0f) > 1.0f ? 1 : (PointF.length(2.0f, 1.0f) == 1.0f ? 0 : -1)) + 82 : (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u0089\u0095\u0098\u0091\u008b¥\u0082\u0091\u008b\u008d\u0082\u008f¤\u008e\u0085\u0082\u0084\u0083\u0082\u0085\u0082\u0091\u008b\u0086\u0085\u0094\u0098\u008e\u008e\u009d\u0085\u0096\u008b\u009c").intern();
        int i3 = f928 + 59;
        f931 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m6580(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i = 2 % 2;
        int i2 = f928 + 95;
        f931 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setAdListener(interstitialAdListener);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static DynamicLoader m6562() {
        int i = 2 % 2;
        int i2 = f931 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f928 = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        int i4 = f928 + 109;
        f931 = i4 % 128;
        int i5 = i4 % 2;
        return dynamicLoader;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static AdPlacementType m6574(AdAdapter adAdapter) {
        int i = 2 % 2;
        int i2 = f928 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f931 = i2 % 128;
        int i3 = i2 % 2;
        AdPlacementType placementType = adAdapter.getPlacementType();
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return placementType;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private WeakHashMap<View, WeakReference<Object>> m6577(WeakHashMap<View, WeakReference<Object>> weakHashMap, ck ckVar) {
        int i = 2 % 2;
        e eVar = new e(weakHashMap, ckVar);
        int i2 = f928 + 51;
        f931 = i2 % 128;
        int i3 = i2 % 2;
        return eVar;
    }

    class e extends WeakHashMap<View, WeakReference<Object>> implements hj<WeakHashMap<View, WeakReference<Object>>> {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f948 = 1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f949 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static byte[] f950 = {-94, -14, -8, 53, -79, 2, 7, -40, -24, 5, Ascii.FF, -48, -3, -17, 1, -26, Ascii.SYN, -49, -30, 0, -24, 6, 6};

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static short[] f951 = null;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f952 = 117;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f953 = -476785445;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f954 = -705633562;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private ck f956;

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = f948 + 37;
            f949 = i2 % 128;
            int i3 = i2 % 2;
            WeakReference<Object> m6582 = m6582((View) obj, (WeakReference) obj2);
            int i4 = f949 + 99;
            f948 = i4 % 128;
            if (i4 % 2 != 0) {
                return m6582;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* renamed from: ﻐ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo6363() {
            int i = 2 % 2;
            int i2 = f948 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f949 = i2 % 128;
            int i3 = i2 % 2;
            WeakHashMap<View, WeakReference<Object>> m6583 = m6583();
            int i4 = f949 + 7;
            f948 = i4 % 128;
            if (i4 % 2 != 0) {
                return m6583;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public e(WeakHashMap<View, WeakReference<Object>> weakHashMap, ck ckVar) {
            super(weakHashMap);
            this.f956 = ckVar;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private WeakReference<Object> m6582(View view, WeakReference<Object> weakReference) {
            int i = 2 % 2;
            int i2 = f949 + 5;
            f948 = i2 % 128;
            int i3 = i2 % 2;
            bn.this.m6382(this, this.f956, m6581((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13), ExpandableListView.getPackedPositionGroup(0L) + 476785523, (-118) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 705633563 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            int i4 = f949 + 31;
            f948 = i4 % 128;
            int i5 = i4 % 2;
            return weakReference2;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private WeakHashMap<View, WeakReference<Object>> m6583() {
            int i = 2 % 2;
            int i2 = f948 + 95;
            f949 = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m6581(short s, int i, int i2, int i3, byte b) {
            String obj;
            synchronized (n.f3088) {
                StringBuilder sb = new StringBuilder();
                int i4 = f952;
                int i5 = i2 + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f950;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f954 + i3] + i4);
                    } else {
                        i5 = (short) (f951[f954 + i3] + i4);
                    }
                }
                if (i5 > 0) {
                    n.f3090 = ((i3 + i5) - 2) + f954 + i6;
                    n.f3091 = b;
                    n.f3092 = (char) (i + f953);
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089 = 1;
                    while (n.f3089 < i5) {
                        byte[] bArr2 = f950;
                        if (bArr2 != null) {
                            int i7 = n.f3090;
                            n.f3090 = i7 - 1;
                            n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                        } else {
                            short[] sArr = f951;
                            int i8 = n.f3090;
                            n.f3090 = i8 - 1;
                            n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                        }
                        sb.append(n.f3092);
                        n.f3093 = n.f3092;
                        n.f3089++;
                    }
                }
                obj = sb.toString();
            }
            return obj;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6576(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f938;
            int i2 = f935;
            if (f937) {
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
            if (f934) {
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

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6568(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f932;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f929;
                if (bArr != null) {
                    i5 = (byte) (bArr[f936 + i3] + i4);
                } else {
                    i5 = (short) (f933[f936 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f936 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f930);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f929;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f933;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
