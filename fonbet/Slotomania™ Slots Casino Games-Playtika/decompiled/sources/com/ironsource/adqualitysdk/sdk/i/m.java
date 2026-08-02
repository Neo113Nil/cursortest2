package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3081 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3082 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f3083 = {-113, 106, -82, -76, -90, -76, -107, -51, -106, -52, -54, 100, -85, -102, -90, -81, -59, -114, -88, -90, -46, 0, 0};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3084 = -1047196710;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3085 = -719865405;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3086 = 27;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static short[] f3087;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static ISAdQualityLogLevel m8532() {
        int i = 2 % 2;
        int i2 = f3082 + 13;
        f3081 = i2 % 128;
        if (i2 % 2 == 0) {
            s.m8592().m8617();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        ISAdQualityLogLevel m8617 = s.m8592().m8617();
        int i3 = f3081 + 89;
        f3082 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return m8617;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m8545() {
        int i = 2 % 2;
        int i2 = f3082 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        boolean m8615 = s.m8592().m8615();
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return m8615;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8523(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3082 + 73;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        m8530(str, str2, (Throwable) null);
        int i4 = f3081 + 97;
        f3082 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8530(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f3082 + 49;
        f3081 = i2 % 128;
        if (i2 % 2 == 0) {
            m8544(str, str, str2, th, null, false);
        } else {
            m8544(str, str, str2, th, null, true);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8527(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3082 + 111;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        m8535(str, str2, null);
        int i4 = f3081 + 9;
        f3082 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8535(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f3081 + 95;
        f3082 = i2 % 128;
        if (i2 % 2 != 0) {
            m8544(str, str, str2, th, null, true);
        } else {
            m8544(str, str, str2, th, null, false);
        }
        int i3 = f3081 + 49;
        f3082 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8531(String str, String str2, boolean z) {
        int i = 2 % 2;
        int i2 = f3082 + 77;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        m8525(str, str, str2, z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8525(String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        int i2 = f3082 + 91;
        f3081 = i2 % 128;
        if (i2 % 2 != 0) {
            m8544(str, str2, str3, null, null, z);
        } else {
            m8544(str, str2, str3, null, null, z);
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8526(String str, String str2, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f3081 + 115;
        f3082 = i2 % 128;
        int i3 = i2 % 2;
        m8544(str, str, str2, th, null, z);
        int i4 = f3082 + 89;
        f3081 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8536(String str, String str2, Throwable th, dn dnVar, boolean z) {
        int i = 2 % 2;
        int i2 = f3081 + 83;
        f3082 = i2 % 128;
        int i3 = i2 % 2;
        m8544(str, str, str2, th, dnVar, z);
        int i4 = f3081 + 19;
        f3082 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8544(String str, String str2, String str3, Throwable th, dn dnVar, boolean z) {
        int i = 2 % 2;
        if (m8545()) {
            Log.e(m8537(str), m8522(str3, dnVar), th);
            return;
        }
        if (z) {
            int i2 = f3082 + 115;
            f3081 = i2 % 128;
            if (i2 % 2 == 0) {
                m8532().shouldPrintLog(ISAdQualityLogLevel.ERROR);
                throw null;
            }
            if (m8532().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
                Log.e(m8537(str2), m8522(str3, dnVar), th);
                int i3 = f3082 + 107;
                f3081 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8522(String str, dn dnVar) {
        int i = 2 % 2;
        int i2 = f3082;
        int i3 = i2 + 87;
        f3081 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        if (dnVar == null) {
            int i4 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f3081 = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }
        return new StringBuilder().append(str).append(m8540(1047196719 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 719865405, (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (MotionEvent.axisFromString("") - 55), Process.getGidForName("") - 25).intern()).append(dnVar).toString();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8533(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3082 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m8542(str, str, str2);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f3082 + 107;
        f3081 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8542(String str, String str2, String str3) {
        int i = 2 % 2;
        if (m8545()) {
            Log.w(m8537(str), str3);
            return;
        }
        if (m8532().shouldPrintLog(ISAdQualityLogLevel.WARNING)) {
            int i2 = f3082 + 37;
            f3081 = i2 % 128;
            int i3 = i2 % 2;
            Log.w(m8537(str2), str3);
            int i4 = f3081 + 15;
            f3082 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8538(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3082 + 95;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        m8534(str, str, str2, true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8541(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3082 + 83;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        m8534(str, str, str2, false);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m8534(String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        if (m8545()) {
            int i2 = f3082 + 1;
            f3081 = i2 % 128;
            int i3 = i2 % 2;
            Log.i(m8537(str), str3);
            return;
        }
        if (z) {
            int i4 = f3082 + 25;
            f3081 = i4 % 128;
            int i5 = i4 % 2;
            if (m8532().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
                Log.i(m8537(str2), str3);
            }
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static void m8519(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3081 + 65;
        f3082 = i2 % 128;
        int i3 = i2 % 2;
        m8543(str, str, str2, null);
        int i4 = f3081 + 85;
        f3082 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8528(String str, String str2, Object obj) {
        int i = 2 % 2;
        int i2 = f3081 + 5;
        f3082 = i2 % 128;
        int i3 = i2 % 2;
        m8543(str, str, str2, obj);
        int i4 = f3081 + 79;
        f3082 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8543(String str, String str2, String str3, Object obj) {
        int i = 2 % 2;
        int i2 = f3081 + 1;
        f3082 = i2 % 128;
        int i3 = i2 % 2;
        m8529(str, str2, str3, obj, true);
        int i4 = f3081 + 51;
        f3082 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static void m8520(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3082 + 3;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        m8524(str, str2, null);
        int i4 = f3082 + 87;
        f3081 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8524(String str, String str2, Object obj) {
        int i = 2 % 2;
        int i2 = f3082 + 115;
        f3081 = i2 % 128;
        m8529(str, str, str2, obj, i2 % 2 == 0);
        int i3 = f3081 + 111;
        f3082 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8529(String str, String str2, String str3, Object obj, boolean z) {
        int i = 2 % 2;
        int i2 = f3082 + 43;
        f3081 = i2 % 128;
        int i3 = i2 % 2;
        if (obj != null) {
            str3 = new StringBuilder().append(str3).append(m8540(TextUtils.getOffsetAfter("", 0) + 1047196720, 719865405 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), (short) ((-57) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) - 26).intern()).append(obj.toString()).toString();
        }
        if (m8545()) {
            Log.d(m8537(str), str3);
            return;
        }
        if (!z) {
            return;
        }
        int i4 = f3081 + 29;
        f3082 = i4 % 128;
        int i5 = i4 % 2;
        if (m8532().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
            Log.d(m8537(str2), str3);
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static void m8521(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3081 + 43;
        f3082 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m8539(str, str, str2);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f3082 + 69;
        f3081 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8539(String str, String str2, String str3) {
        int i = 2 % 2;
        if (m8545()) {
            int i2 = f3082 + 113;
            f3081 = i2 % 128;
            if (i2 % 2 != 0) {
                Log.v(m8537(str), str3);
                return;
            } else {
                Log.v(m8537(str), str3);
                int i3 = 46 / 0;
                return;
            }
        }
        if (m8532().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
            int i4 = f3081 + 43;
            f3082 = i4 % 128;
            if (i4 % 2 == 0) {
                Log.v(m8537(str2), str3);
            } else {
                Log.v(m8537(str2), str3);
                int i5 = 95 / 0;
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8537(String str) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m8540(1047196783 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 719865405, (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (TextUtils.indexOf("", "", 0, 0) + 87), View.MeasureSpec.makeMeasureSpec(0, 0) - 5).intern()).append(str).toString();
        int i2 = f3081 + 67;
        f3082 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8540(int i, int i2, byte b, short s, int i3) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f3086;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f3083;
                if (bArr != null) {
                    i5 = (byte) (bArr[f3085 + i2] + i4);
                } else {
                    i5 = (short) (f3087[f3085 + i2] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i2 + i5) - 2) + f3085 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f3084);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f3083;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f3087;
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
