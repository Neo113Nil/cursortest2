package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public final class kn {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3063 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3064 = 61;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3065 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static int m8470(String str, String str2) {
        int i = 2 % 2;
        String[] split = str.replaceAll(m8472(7 - Color.blue(0), true, 128 - (ViewConfiguration.getEdgeSlop() >> 16), "￪￭\u001b\u0018\u001a￫\ufff6", TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern(), "").split(m8472((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2, true, 131 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "￩\u0017", 2 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
        String[] split2 = str2.replaceAll(m8472(7 - (ViewConfiguration.getWindowTouchSlop() >> 8), true, 128 - TextUtils.getOffsetBefore("", 0), "￪￭\u001b\u0018\u001a￫\ufff6", 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), "").split(m8472(1 - TextUtils.indexOf((CharSequence) "", '0'), true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 129, "￩\u0017", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1).intern());
        int i2 = 0;
        while (i2 < split.length && i2 < split2.length && split[i2].equals(split2[i2])) {
            int i3 = f3063 + 95;
            f3065 = i3 % 128;
            int i4 = i3 % 2;
            i2++;
        }
        if (i2 < split.length) {
            int i5 = f3063 + 107;
            int i6 = i5 % 128;
            f3065 = i6;
            if (i5 % 2 == 0) {
                int length = split2.length;
                throw null;
            }
            if (i2 < split2.length) {
                int i7 = i6 + 97;
                f3063 = i7 % 128;
                if (i7 % 2 == 0) {
                    return Integer.signum(Integer.valueOf(split[i2]).compareTo(Integer.valueOf(split2[i2])));
                }
                int signum = Integer.signum(Integer.valueOf(split[i2]).compareTo(Integer.valueOf(split2[i2])));
                int i8 = 72 / 0;
                return signum;
            }
        }
        int signum2 = Integer.signum(split.length - split2.length);
        int i9 = f3063 + 55;
        f3065 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 58 / 0;
        }
        return signum2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List<String> m8480(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3063 + 49;
        f3065 = i2 % 128;
        int i3 = i2 % 2;
        List<String> m8469 = m8469(str, str2, false);
        int i4 = f3065 + 103;
        f3063 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return m8469;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m8475(String str, JSONArray jSONArray) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = f3063 + 39;
            f3065 = i3 % 128;
            int i4 = i3 % 2;
            arrayList.addAll(m8469(str, jSONArray.optString(i2), false));
        }
        int i5 = f3065 + 85;
        f3063 = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m8474(String str, JSONArray jSONArray, boolean z) {
        int i = 2 % 2;
        int i2 = f3063 + 69;
        f3065 = i2 % 128;
        for (int i3 = i2 % 2 == 0 ? 1 : 0; i3 < jSONArray.length(); i3++) {
            String m8479 = m8479(str, jSONArray.optString(i3), z);
            if (m8479 != null) {
                int i4 = f3063 + 3;
                f3065 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 68 / 0;
                }
                return m8479;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m8479(String str, String str2, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = f3063 + 65;
            f3065 = i2 % 128;
            int i3 = i2 % 2;
            str2 = m8468(str2);
        }
        List<String> m8469 = m8469(str, str2, true);
        if (m8469.size() <= 0) {
            return null;
        }
        String str3 = m8469.get(0);
        int i4 = f3065 + 65;
        f3063 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return str3;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static List<String> m8469(String str, String str2, boolean z) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        loop0: while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z) {
                    int i2 = f3065 + 63;
                    f3063 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return arrayList;
                    }
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
            } else {
                int i3 = f3063 + 15;
                f3065 = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 1; i5 <= matcher.groupCount(); i5++) {
                    arrayList.add(matcher.group(i5));
                    if (z) {
                        break loop0;
                    }
                }
                int i6 = f3065 + 111;
                f3063 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m8473(String str, String str2) {
        int i = 2 % 2;
        int i2 = f3063 + 5;
        f3065 = i2 % 128;
        int i3 = i2 % 2;
        String substring = str.substring(0, str.length() - str2.length());
        int i4 = f3065 + 67;
        f3063 = i4 % 128;
        if (i4 % 2 == 0) {
            return substring;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m8471(String str) {
        int i = 2 % 2;
        if (!(!TextUtils.isEmpty(str))) {
            int i2 = f3065 + 83;
            f3063 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean matches = str.matches(m8472(14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), true, 130 - View.MeasureSpec.getSize(0), "\u0019\uffdf￥\u0018\ufff4￨￫\u0015￨￼5￨\u001c\u0016", 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        int i4 = f3065 + 109;
        f3063 = i4 % 128;
        int i5 = i4 % 2;
        return matches;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m8477(String str, int i) {
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i3 = f3063 + 103;
        f3065 = i3 % 128;
        int i4 = i3 % 2;
        if (str.length() <= 0 || str.length() > i) {
            return false;
        }
        int i5 = f3065 + 37;
        f3063 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        r12 = new java.lang.StringBuilder().append(m8472(7 - android.graphics.ImageFormat.getBitsPerPixel(0), false, android.text.TextUtils.getOffsetBefore("", 0) + 148, "\u0004\u0005\u001c\u0005￼\u0006ￓ\u0007", (-16777209) - android.graphics.Color.rgb(0, 0, 0)).intern()).append(r12).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r12.startsWith(m8472(1 - android.widget.ExpandableListView.getPackedPositionType(0), true, 154 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r12.startsWith(m8472(0, true, r1, org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 0).intern()) == false) goto L11;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m8468(String str) {
        int i = 2 % 2;
        int i2 = f3063 + 5;
        f3065 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i4 = f3063 + 59;
        f3065 = i4 % 128;
        if (i4 % 2 == 0) {
            ExpandableListView.getPackedPositionType(1L);
            int indexOf = 6042 >>> TextUtils.indexOf((CharSequence) "", 'g');
            ViewConfiguration.getMaximumDrawingCacheSize();
        }
        return !str.endsWith(m8472(-TextUtils.indexOf((CharSequence) "", '0'), true, TextUtils.getCapsMode("", 0, 0) + 97, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, -MotionEvent.axisFromString("")).intern()) ? new StringBuilder().append(str).append(m8472(KeyEvent.keyCodeFromString("") + 7, false, (Process.myPid() >> 22) + 147, "\u001d\u0006�\u0007ￔ\u0005\u0006", 4 - ExpandableListView.getPackedPositionChild(0L)).intern()).toString() : str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m8476(String str) {
        int i = 2 % 2;
        int i2 = f3065 + 7;
        f3063 = i2 % 128;
        int i3 = i2 % 2;
        if (!p.m8555()) {
            try {
                new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                int i4 = f3063 + 105;
                f3065 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        int i6 = f3065 + 5;
        f3063 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.p.m8555() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.p.m8555() != true) goto L11;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m8478(String str) {
        int i = 2 % 2;
        int i2 = f3063;
        int i3 = i2 + 101;
        f3065 = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            int i5 = i2 + 25;
            f3065 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 24 / 0;
            }
            if (m8476(str)) {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    int i7 = 0;
                    while (true) {
                        int read = gZIPInputStream.read(bArr, i7, 8192 - i7);
                        if (read == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, m8472((ViewConfiguration.getLongPressTimeout() >> 16) + 5, false, View.getDefaultSize(0, 0) + 129, "\u0002￩\ufff4\u0011\u0010", 3 - View.getDefaultSize(0, 0)).intern());
                        }
                        i7 += read;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8472(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f3064);
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
