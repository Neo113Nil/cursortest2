package com.ironsource.adqualitysdk.sdk.i;

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
import com.google.android.exoplayer2.C;
import com.ironsource.B5;
import com.ironsource.adqualitysdk.sdk.i.ec;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class dv {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f1836 = 0;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1837 = null;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1838 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1839;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1840;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f1841;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static final List<String> f1842;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f1843;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1844;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1845;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1846;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1847;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1848;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1849;

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m7612() {
        f1836 = (char) 7;
        f1840 = new char[]{B5.U, '+', 'L', 'e', 'x', 'r', FileSystemKt.UnixPathSeparator, 'E', 'o', ' ', 'p', 'a', GMTDateParser.SECONDS, 'i', 'n', 'g', 't', AbstractJsonLexerKt.UNICODE_ESC, 'U', 'c', GMTDateParser.ZONE, GMTDateParser.DAY_OF_MONTH, GMTDateParser.HOURS, '^', '\"', '(', '?', AbstractJsonLexerKt.COLON, '\\', '|', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, ')', GMTDateParser.ANY, '\'', '-', 'A', 'Z', Typography.dollar, '_', '0', '9', '.', 'l', Typography.amp, 'f', 'y', Typography.greater, '@'};
        f1837 = new char[]{22, '-', 16, 'G', 'k', 'D', 'n', 218, 221, 230, 227, 16, '@', 'j', 'J', 'H', 'o', 'q', 'n', 'n', 'n', 'l', 'n', 'G', 21, 'C', '^', 'A', '.', '3', '.', 'E', 'C', '7', AbstractJsonLexerKt.END_LIST, 'S', 'G', '^', '\\', '^', 'A', '?', 'C', '7', AbstractJsonLexerKt.END_LIST, 'S', 'G', '^', '\\', FileSystemKt.UnixPathSeparator, '\\', 'E', '.', '3', 'K', 'D', 'C', 'E', 'D', 'E', '.', '3', 'K', 'D', GMTDateParser.DAY_OF_MONTH, 207, 231, 224, 224, 248, 225, '2', 'l', 'o', GMTDateParser.HOURS, 137, 274, 278, 279};
    }

    static {
        m7612();
        f1846 = Pattern.compile(m7610("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{24, 25, 0, 0}, true).intern());
        f1845 = Pattern.compile(m7609(TextUtils.lastIndexOf("", '0', 0) + 17, "\u0018\u0019\u001a\u001b\u0015\"\u001f\u0015\u001e\u001f\u0018\u0019 !\u001f\u001a", (byte) (104 - KeyEvent.keyCodeFromString(""))).intern());
        f1849 = Pattern.compile(m7609(TextUtils.lastIndexOf("", '0') + 17, "\u001b\u001e\u001a\u001b\u0015\"\u001d\u001c\u001e\u001f\u001b\u001e !\"\u001c", (byte) (TextUtils.indexOf("", "", 0, 0) + Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)).intern());
        f1848 = Pattern.compile(m7610("\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000", new int[]{49, 15, 0, 0}, false).intern());
        f1847 = Pattern.compile(m7610("\u0001\u0000\u0000\u0000\u0001\u0001\u0001", new int[]{64, 7, 156, 4}, false).intern());
        f1844 = Pattern.compile(m7609((ViewConfiguration.getScrollBarSize() >> 8) + 33, "\u001e%\u0007'\u000f)$&'( \u001f\u0007'\u000f)$&)$#'#. \"#\u0000\u000f/\f\rë", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 120)).intern());
        f1843 = Pattern.compile(m7609((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, "\u001e\u0002\u0094", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 109)).intern());
        f1841 = Pattern.compile(m7609(5 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0015\u001e\u001e\u001d©", (byte) (45 - View.resolveSize(0, 0))).intern());
        f1842 = Arrays.asList(m7609(2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\n0", (byte) (10 - (ViewConfiguration.getTouchSlop() >> 8))).intern(), m7610("\u0001\u0000\u0001\u0001", new int[]{71, 4, 0, 0}, true).intern(), m7610("\u0000\u0000\u0001\u0001", new int[]{75, 4, 166, 0}, true).intern(), m7609(View.MeasureSpec.getSize(0) + 6, "\u0006\u0004\u0011\u0012\u0000\u0013", (byte) (Drawable.resolveOpacity(0, 0) + 71)).intern(), m7609((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4, "\n\u0013\u0011\n§", (byte) ((Process.myPid() >> 22) + 53)).intern(), m7609((ViewConfiguration.getLongPressTimeout() >> 16) + 3, "\u0013\u0002£", (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42)).intern(), m7609(5 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0012\f\u0011\u0014Ã", (byte) (91 - View.getDefaultSize(0, 0))).intern());
        int i = f1839 + 61;
        f1838 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x030b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012e A[SYNTHETIC] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<ec> m7608(String str, String str2, String str3) {
        boolean z;
        int i;
        long j;
        int length;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < str3.length()) {
            int i6 = i5 + 1;
            if (i6 < str3.length()) {
                z = true;
            } else {
                int i7 = f1838 + 7;
                f1839 = i7 % 128;
                int i8 = i7 % i3;
                z = false;
            }
            char charAt = z ? str3.charAt(i6) : (char) 0;
            char charAt2 = str3.charAt(i5);
            if (charAt2 != '\n') {
                if (charAt2 != '%' && charAt2 != '[' && charAt2 != ']' && charAt2 != '{' && charAt2 != '}') {
                    if (charAt2 != '!') {
                        j = 0;
                        if (charAt2 != '\"') {
                            switch (charAt2) {
                                case '\'':
                                    String m7607 = m7607(m7611(f1849, str3, i5));
                                    if (m7607.length() == 1) {
                                        arrayList.add(new ec(ec.d.f1933, String.valueOf((int) m7607.charAt(0))));
                                    } else {
                                        arrayList.add(new ec(ec.d.f1934, m7607));
                                    }
                                    length = m7607.length();
                                    i5 += length + 2;
                                    break;
                                case '(':
                                case ')':
                                case '*':
                                case ',':
                                case '.':
                                case '/':
                                    break;
                                case '+':
                                    if (charAt != '+') {
                                        arrayList.add(new ec(ec.d.f1931, m7609(3 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), "55", (byte) (10 - (Process.myTid() >> 22))).intern()));
                                        i5 += 2;
                                        break;
                                    } else if (charAt != '-') {
                                        i = 2;
                                        arrayList.add(new ec(ec.d.f1931, m7610("\u0001\u0000", new int[]{0, 2, 0, 2}, true).intern()));
                                        i5 += 2;
                                        i3 = i;
                                        break;
                                    } else {
                                        i = 2;
                                        arrayList.add(new ec(ec.d.f1931, new StringBuilder().append(str3.charAt(i5)).toString()));
                                        i5 = i6;
                                        i3 = i;
                                    }
                                case '-':
                                    if (charAt != '-') {
                                    }
                                    break;
                                default:
                                    switch (charAt2) {
                                        case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                                        case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                                            break;
                                        case '<':
                                        case '=':
                                        case '>':
                                            break;
                                        default:
                                            if (!Character.isWhitespace(str3.charAt(i5))) {
                                                ec.d dVar = ec.d.f1929;
                                                String m7611 = m7611(f1844, str3, i5);
                                                if (TextUtils.isEmpty(m7611)) {
                                                    dVar = ec.d.f1935;
                                                    m7611 = m7611(f1846, str3, i5);
                                                    if (!TextUtils.isEmpty(m7611)) {
                                                        i2 = i3;
                                                        if (!m7611.equals(m7609((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, "\u0013\u0002\u0018\n", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)).intern())) {
                                                            int i9 = f1838 + 73;
                                                            f1839 = i9 % 128;
                                                            int i10 = i9 % 2;
                                                            if (!m7611.equals(m7610("\u0001\u0001\u0001\u0001\u0000", new int[]{6, 5, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 0}, false).intern())) {
                                                                if (f1842.contains(m7611)) {
                                                                    dVar = ec.d.f1932;
                                                                }
                                                                if (TextUtils.isEmpty(m7611)) {
                                                                    dVar = ec.d.f1930;
                                                                    m7611 = m7611(f1848, str3, i5);
                                                                }
                                                                if (TextUtils.isEmpty(m7611)) {
                                                                    int i11 = f1838 + 95;
                                                                    f1839 = i11 % 128;
                                                                    int i12 = i11 % 2;
                                                                    dVar = ec.d.f1933;
                                                                    m7611 = m7611(f1847, str3, i5);
                                                                }
                                                                if (TextUtils.isEmpty(m7611)) {
                                                                    dVar = ec.d.f1931;
                                                                    m7611 = m7611(f1841, str3, i5);
                                                                }
                                                                if (TextUtils.isEmpty(m7611)) {
                                                                    dVar = ec.d.f1931;
                                                                    m7611 = m7611(f1843, str3, i5);
                                                                }
                                                                if (!TextUtils.isEmpty(m7611)) {
                                                                    arrayList.add(new ec(dVar, m7611));
                                                                    i5 += m7611.length();
                                                                    i3 = i2;
                                                                    break;
                                                                } else {
                                                                    cn.m7273(new StringBuilder().append(m7609(View.MeasureSpec.getMode(0) + 6, "\u0003\u0004\u0005\u0004\u0006\u0000", (byte) (52 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern()).append(str).toString(), new StringBuilder().append(m7609(Gravity.getAbsoluteGravity(0, 0) + 18, "\u0013\u000f\u0006\u0004\u000f\f\u0010\u000f\u0014\u001b\u0000\u0018\f\u0010\u0019\b\u0002\f", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1)).intern()).append(str3.charAt(i5)).append(m7610("\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{11, 13, 0, 0}, false).intern()).append(i5).append(m7610("\u0000\u0000\u0001\u0001", new int[]{i2, 4, 0, 4}, true).intern()).append(str2).toString());
                                                                }
                                                            }
                                                        }
                                                        dVar = ec.d.f1927;
                                                        if (TextUtils.isEmpty(m7611)) {
                                                        }
                                                        if (TextUtils.isEmpty(m7611)) {
                                                        }
                                                        if (TextUtils.isEmpty(m7611)) {
                                                        }
                                                        if (TextUtils.isEmpty(m7611)) {
                                                        }
                                                        if (!TextUtils.isEmpty(m7611)) {
                                                        }
                                                    }
                                                }
                                                i2 = i3;
                                                if (TextUtils.isEmpty(m7611)) {
                                                }
                                                if (TextUtils.isEmpty(m7611)) {
                                                }
                                                if (TextUtils.isEmpty(m7611)) {
                                                }
                                                if (TextUtils.isEmpty(m7611)) {
                                                }
                                                if (!TextUtils.isEmpty(m7611)) {
                                                }
                                            } else {
                                                int i13 = f1838 + 105;
                                                f1839 = i13 % 128;
                                                int i14 = i13 % 2;
                                            }
                                            i5 = i6;
                                            break;
                                    }
                            }
                        } else {
                            String m76112 = m7611(f1845, str3, i5);
                            if (m76112 == null) {
                                cn.m7273(new StringBuilder().append(m7609(6 - TextUtils.indexOf("", ""), "\u0003\u0004\u0005\u0004\u0006\u0000", (byte) (AndroidCharacter.getMirror('0') + 4)).intern()).append(str).toString(), new StringBuilder().append(m7609(33 - KeyEvent.normalizeMetaState(0), "\f\u0000\u0001\f\u0002\f\u000b\f\f\u0013\u0007\u0014\u0010\b\t\u0013\u0006\f\u000f\u0010\n\f\u0017\u0010\u000b\t\r\u0007\u0014\t\u0007\u000fl", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 76)).intern()).append(i5).append(m7610("\u0000\u0000\u0001\u0001", new int[]{2, 4, 0, 4}, true).intern()).append(str2).toString());
                                i5 = i6;
                            } else {
                                String m76072 = m7607(m76112);
                                arrayList.add(new ec(ec.d.f1934, m76072));
                                length = m76072.length();
                                i5 += length + 2;
                            }
                        }
                        i3 = 2;
                    } else {
                        j = 0;
                    }
                    if (charAt == '=') {
                        arrayList.add(new ec(ec.d.f1931, new StringBuilder().append(str3.charAt(i5)).append(m7609((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), "F", (byte) ((Process.myPid() >> 22) + 9)).intern()).toString()));
                        i5 += 2;
                        i3 = 2;
                    }
                    if (charAt != '+') {
                    }
                }
                i = i3;
                arrayList.add(new ec(ec.d.f1931, new StringBuilder().append(str3.charAt(i5)).toString()));
                i5 = i6;
                i3 = i;
            } else {
                i5 = i6;
            }
        }
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7607(String str) {
        int i = 2 % 2;
        int i2 = f1838 + 93;
        f1839 = i2 % 128;
        int i3 = i2 % 2;
        String substring = str.substring(1, str.length() - 1);
        int i4 = f1838 + 15;
        f1839 = i4 % 128;
        if (i4 % 2 == 0) {
            return substring;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7611(Pattern pattern, String str, int i) {
        int i2 = 2 % 2;
        int i3 = f1838 + 99;
        f1839 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Matcher matcher = pattern.matcher(str);
            matcher.region(i, str.length());
            if (!matcher.find()) {
                return null;
            }
            String substring = str.substring(matcher.start(), matcher.end());
            int i4 = f1838 + 71;
            f1839 = i4 % 128;
            int i5 = i4 % 2;
            return substring;
        }
        Matcher matcher2 = pattern.matcher(str);
        matcher2.region(i, str.length());
        matcher2.find();
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7609(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f1840;
            char c = f1836;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7610(String str, int[] iArr, boolean z) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        synchronized (h.f2286) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f1837, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                h.f2287 = 0;
                char c = 0;
                while (h.f2287 < i2) {
                    if (bArr2[h.f2287] == 1) {
                        cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                    } else {
                        cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                    }
                    c = cArr2[h.f2287];
                    h.f2287++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                    h.f2287++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                    h.f2287++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
