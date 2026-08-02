package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.B5;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class al {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f338 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f339;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f340;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f341;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f342 = m6002((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 34, "\u0001\u0002\u0002\u0003\u0004\u0005\u0084\u0084\u0007\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\rÂ", (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 84)).intern();

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f343 = m6002((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 34, "\u0001\u0002\u0002\u0003\u0004\u0005ll\r\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\rª", (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 61)).intern();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f344 = m6002(Color.red(0) + 35, "\u0001\u0002\u0002\u0003\u0004\u0005ss\t\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\r±", (byte) (ExpandableListView.getPackedPositionGroup(0) + 68)).intern();

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m6000() {
        f341 = (char) 6;
        f340 = new char[]{GMTDateParser.HOURS, 't', 'p', GMTDateParser.SECONDS, AbstractJsonLexerKt.COLON, FileSystemKt.UnixPathSeparator, 'i', '-', 'a', GMTDateParser.DAY_OF_MONTH, 'q', '.', GMTDateParser.MINUTES, 'e', 'o', 'n', AbstractJsonLexerKt.UNICODE_ESC, 'y', '3', 'c', 'r', 'b', 'k', 'v', '1', 'E', 'C', 'w', B5.U, 'O', 'R', '7', 'D', '!', AbstractJsonLexerKt.COMMA, 'j'};
    }

    public al() {
        m6002(15 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0002\u0013\u0007\u0014\u000f\u0013\u0007\u0014\u0017\n\u0017\u0012\u0006\n\u008e", (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44)).intern();
    }

    static {
        m6000();
        m6002(15 - ExpandableListView.getPackedPositionGroup(0L), "\u001b\u0006\u001a\u0007\b\u001b\u000f\u001a\u001d\u0018\u001f !\"\u008e", (byte) (98 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern();
        int i = f339 + 39;
        f338 = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m6005(String str) {
        int i = 2 % 2;
        int i2 = f339 + 57;
        f338 = i2 % 128;
        int i3 = i2 % 2;
        String m6003 = m6003(this.f342, str);
        int i4 = f339 + 49;
        f338 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6003;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m6004(String str) {
        int i = 2 % 2;
        int i2 = f338 + 39;
        f339 = i2 % 128;
        int i3 = i2 % 2;
        String m6003 = m6003(this.f343, str);
        int i4 = f339 + 57;
        f338 = i4 % 128;
        int i5 = i4 % 2;
        return m6003;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6003(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            int i2 = f338 + 29;
            f339 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } else {
            str = "";
        }
        StringBuilder append = sb.append(str).append(m6002((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "_", (byte) (48 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern());
        if (str2 != null) {
            int i3 = f338 + 53;
            f339 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 97 / 0;
            }
        } else {
            str2 = "";
        }
        String obj = append.append(str2).toString();
        int i5 = f339 + 33;
        f338 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m6006() {
        int i = 2 % 2;
        int i2 = f339;
        int i3 = i2 + 65;
        f338 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f344;
        int i4 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f338 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m6007() {
        int i = 2 % 2;
        int i2 = f339 + 49;
        int i3 = i2 % 128;
        f338 = i3;
        int i4 = i2 % 2;
        String str = this.f342;
        int i5 = i3 + 79;
        f339 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m6001() {
        int i;
        int argb;
        int i2 = 2 % 2;
        int i3 = f339 + 63;
        f338 = i3 % 128;
        int i4 = i3 % 2;
        long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
        if (i4 == 0) {
            i = 48 - (zoomControlsTimeout > 1L ? 1 : (zoomControlsTimeout == 1L ? 0 : -1));
            argb = 38 >> Color.argb(1, 0, 0, 0);
        } else {
            i = (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 14;
            argb = Color.argb(0, 0, 0, 0) + 44;
        }
        String intern = m6002(i, "\u0002\u0013\u0007\u0014\u000f\u0013\u0007\u0014\u0017\n\u0017\u0012\u0006\n\u008e", (byte) argb).intern();
        int i5 = f338 + 97;
        f339 = i5 % 128;
        int i6 = i5 % 2;
        return intern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6002(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f340;
            char c = f341;
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
}
