package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import com.ironsource.adqualitysdk.sdk.i.ar;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ap extends ar.AnonymousClass5 {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f359 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f361 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f363 = 105;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final int f364 = (int) TimeUnit.SECONDS.toMillis(120);

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f362 = {'e', 28601, 57295, 20252, 48928, 12123, 40593, 3773, 32475, GMTDateParser.MINUTES, 28579, 57305, 22846, 14073, 34442, AbstractJsonLexerKt.UNICODE_ESC, 28583, 57286, 'e', AbstractJsonLexerKt.UNICODE_ESC, 28577};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f360 = -8318762192229666859L;

    public ap(aw awVar) {
        m6025((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7, false, 217 - View.resolveSizeAndState(0, 0, 0), "\uffff\u0004\uffff\ufffe\u0003\u0000\u0002", 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
        m6024((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ExpandableListView.getPackedPositionType(0L), AndroidCharacter.getMirror('0') - '\'').intern();
        m6077(awVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m6035() {
        int i = 2 % 2;
        int i2 = f361 + 115;
        f359 = i2 % 128;
        return i2 % 2 == 0 ? m6075().optInt(m6025((ViewConfiguration.getTouchSlop() % 60) * 3, false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12568, "\ufff7\u0005\u0006", 2 << (Process.myTid() * 96)).intern(), this.f364) : m6075().optInt(m6025(3 - (ViewConfiguration.getTouchSlop() >> 8), false, 216 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\ufff7\u0005\u0006", (Process.myTid() >> 22) + 3).intern(), this.f364);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m6032() {
        JSONObject m6075;
        String intern;
        int i;
        int i2 = 2 % 2;
        int i3 = f359 + 79;
        f361 = i3 % 128;
        if (i3 % 2 != 0) {
            m6075 = m6075();
            intern = m6025(3 << MotionEvent.axisFromString(""), true, 4806 - TextUtils.lastIndexOf("", 'g', 1), "\ufffa\u0005\u0002", 2 - (ViewConfiguration.getMinimumFlingVelocity() << 86)).intern();
            i = 25;
        } else {
            m6075 = m6075();
            intern = m6025(MotionEvent.axisFromString("") + 4, false, 211 - TextUtils.lastIndexOf("", '0', 0), "\ufffa\u0005\u0002", 2 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
            i = 40;
        }
        return m6075.optInt(intern, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ap.f361 + 95;
        com.ironsource.adqualitysdk.sdk.i.ap.f359 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        return m6023();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m6041().mo6059() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m6041().mo6059() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (m6022() == false) goto L13;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m6034() {
        int i = 2 % 2;
        int i2 = f361 + 57;
        f359 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return m6075().optInt(m6024((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 9 - Color.alpha(0), (Process.myTid() >> 22) + 3).intern(), 9850);
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private boolean m6022() {
        int i = 2 % 2;
        int i2 = f359 + 83;
        f361 = i2 % 128;
        return i2 % 2 != 0 ? m6075().optBoolean(m6025(KeyEvent.keyCodeFromString("") + 3, true, (TypedValue.complexToFloat(1) > 0.0f ? 1 : (TypedValue.complexToFloat(1) == 0.0f ? 0 : -1)) * 23926, "\u0002￼\u0004\uffff", 3 << (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1))).intern(), true) : m6075().optBoolean(m6025(4 - KeyEvent.keyCodeFromString(""), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 206, "\u0002￼\u0004\uffff", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3).intern(), false);
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private int m6023() {
        JSONObject m6075;
        String m6025;
        int i = 2 % 2;
        int i2 = f359 + 53;
        f361 = i2 % 128;
        if (i2 % 2 != 0) {
            m6075 = m6075();
            m6025 = m6025(21 >>> TextUtils.getOffsetBefore("", 1), true, (ViewConfiguration.getTapTimeout() % 108) + 19049, "\u0003\f\t\ufffa\uffff\ufff7�", 2 % (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)));
        } else {
            m6075 = m6075();
            m6025 = m6025(7 - TextUtils.getOffsetBefore("", 0), false, 211 - (ViewConfiguration.getTapTimeout() >> 16), "\u0003\f\t\ufffa\uffff\ufff7�", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2);
        }
        int optInt = m6075.optInt(m6025.intern(), 1000000);
        int i3 = f359 + 75;
        f361 = i3 % 128;
        if (i3 % 2 == 0) {
            return optInt;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m6033() {
        int i = 2 % 2;
        List<String> m6235 = m6076().m6235();
        m6235.addAll(kj.m8416(m6075(), m6024((char) (MotionEvent.axisFromString("") + 22873), 12 - Gravity.getAbsoluteGravity(0, 0), 3 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new ArrayList()));
        int i2 = f361 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f359 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return m6235;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m6031() {
        int i = 2 % 2;
        List<String> m6232 = m6076().m6232();
        m6232.addAll(kj.m8416(m6075(), m6025((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, true, 217 - View.MeasureSpec.getSize(0), "\b\u0004\ufff5", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3).intern(), new ArrayList()));
        int i2 = f359 + 81;
        f361 = i2 % 128;
        if (i2 % 2 == 0) {
            return m6232;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String m6029() {
        int i = 2 % 2;
        int i2 = f359 + 55;
        f361 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject optJSONObject = m6075().optJSONObject(m6024((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - TextUtils.lastIndexOf("", '0', 0), 3 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
        if (optJSONObject == null) {
            return m6025((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, false, ImageFormat.getBitsPerPixel(0) + Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, "\uffff\u0004\uffff\ufffe\u0003\u0000\u0002", TextUtils.indexOf("", "", 0) + 5).intern();
        }
        int i4 = f361 + 45;
        f359 = i4 % 128;
        int i5 = i4 % 2;
        return optJSONObject.optString(m6025((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, false, KeyEvent.normalizeMetaState(0) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m6025(Color.rgb(0, 0, 0) + 16777223, false, 217 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\uffff\u0004\uffff\ufffe\u0003\u0000\u0002", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 5).intern());
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m6030() {
        int i = 2 % 2;
        int i2 = f361 + 105;
        f359 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject optJSONObject = m6075().optJSONObject(m6024((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 15 - Color.alpha(0), 2 - ImageFormat.getBitsPerPixel(0)).intern());
        if (optJSONObject != null) {
            return optJSONObject.optString(m6024((char) (Process.myPid() >> 22), 18 - (Process.myPid() >> 22), -TextUtils.lastIndexOf("", '0', 0)).intern(), m6024((char) (Process.getGidForName("") + 1), 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
        }
        String intern = m6024((char) View.resolveSize(0, 0), ViewConfiguration.getTapTimeout() >> 16, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9).intern();
        int i4 = f361 + 107;
        f359 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final long m6028() {
        int i = 2 % 2;
        int i2 = f359 + 53;
        f361 = i2 % 128;
        int i3 = i2 % 2;
        long optLong = m6075().optLong(m6025(View.MeasureSpec.getSize(0) + 3, false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, "\u0000\u0000\u0001", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), 0L);
        int i4 = f361 + 21;
        f359 = i4 % 128;
        if (i4 % 2 != 0) {
            return optLong;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final long m6026() {
        int i = 2 % 2;
        int i2 = f359 + 91;
        f361 = i2 % 128;
        int i3 = i2 % 2;
        long optLong = m6075().optLong(m6025(2 - TextUtils.getTrimmedLength(""), true, 219 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0001\u0000", 1 - Color.green(0)).intern(), 0L);
        int i4 = f361 + 103;
        f359 = i4 % 128;
        int i5 = i4 % 2;
        return optLong;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final long m6027() {
        int i = 2 % 2;
        int i2 = f361 + 113;
        f359 = i2 % 128;
        int i3 = i2 % 2;
        long optLong = m6075().optLong(m6024((char) (ViewConfiguration.getLongPressTimeout() >> 16), 18 - TextUtils.indexOf((CharSequence) "", '0'), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2).intern(), 0L);
        int i4 = f359 + 29;
        f361 = i4 % 128;
        int i5 = i4 % 2;
        return optLong;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6025(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f363);
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6024(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f362[c.f1198 + i] ^ (c.f1198 * f360)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
