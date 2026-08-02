package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class dk extends cw implements ch {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1754 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1756 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1757 = 228;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f1758 = true;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1760 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1763;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1765;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1766;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1759 = {330, 345, 336, 343, 327, 342, 329, 338, 337, 328, 333, 325, 344, 339, 274, 331, 305, 306, 347, 335, 293, 310, 346, 301, 298, 308, 294, 297, 302, 296, 267};

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f1753 = 6;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static char[] f1755 = {'b', 'a', 'n', 'e', 'r', GMTDateParser.SECONDS, 't', 'C', 'o', 'c', 'N', GMTDateParser.MINUTES, 'g', GMTDateParser.MONTH, GMTDateParser.DAY_OF_MONTH, 'i', 'w', 'k', 'A', 'R', 'v', AbstractJsonLexerKt.UNICODE_ESC, 'I', 'F', 'l', 'P', 'E', ' ', GMTDateParser.HOURS, 'x', 'D', '\'', 'f', 'j', 'p', 'q'};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1762 = "";

    /* renamed from: ｋ, reason: contains not printable characters */
    private double f1764 = -1.0d;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private boolean f1761 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m7568(String str) {
        int i = 2 % 2;
        int i2 = f1756;
        int i3 = i2 + 21;
        f1754 = i3 % 128;
        int i4 = i3 % 2;
        this.f1765 = str;
        if (i4 != 0) {
            int i5 = 79 / 0;
        }
        int i6 = i2 + 67;
        f1754 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m7560() {
        int i = 2 % 2;
        int i2 = f1754 + 97;
        f1756 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1765;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7565(String str) {
        int i = 2 % 2;
        int i2 = f1756 + 59;
        int i3 = i2 % 128;
        f1754 = i3;
        int i4 = i2 % 2;
        this.f1762 = str;
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        int i6 = i3 + 25;
        f1756 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m7561() {
        int i = 2 % 2;
        int i2 = f1756 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        int i3 = i2 % 128;
        f1754 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        String str = this.f1762;
        int i4 = i3 + 17;
        f1756 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m7569(Double d) {
        int i = 2 % 2;
        int i2 = f1754 + 75;
        f1756 = i2 % 128;
        int i3 = i2 % 2;
        this.f1764 = d.doubleValue();
        int i4 = f1754 + 109;
        f1756 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Double m7564() {
        int i = 2 % 2;
        int i2 = f1754 + 97;
        f1756 = i2 % 128;
        if (i2 % 2 != 0) {
            return Double.valueOf(this.f1764);
        }
        Double.valueOf(this.f1764);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m7566(boolean z) {
        int i = 2 % 2;
        int i2 = f1754 + 9;
        f1756 = i2 % 128;
        int i3 = i2 % 2;
        this.f1763 = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m7571(boolean z) {
        int i = 2 % 2;
        int i2 = f1756;
        int i3 = i2 + 43;
        f1754 = i3 % 128;
        int i4 = i3 % 2;
        this.f1761 = z;
        int i5 = i2 + 81;
        f1754 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean m7567() {
        boolean z;
        int i = 2 % 2;
        int i2 = f1754;
        int i3 = i2 + 21;
        f1756 = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.f1761;
            int i4 = 49 / 0;
        } else {
            z = this.f1761;
        }
        int i5 = i2 + 113;
        f1756 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean m7559() {
        boolean z;
        int i = 2 % 2;
        int i2 = f1756 + 17;
        int i3 = i2 % 128;
        f1754 = i3;
        if (i2 % 2 != 0) {
            z = this.f1763;
            int i4 = 3 / 0;
        } else {
            z = this.f1763;
        }
        int i5 = i3 + 71;
        f1756 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return z;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m7570(String str) {
        int i = 2 % 2;
        int i2 = f1756 + 65;
        int i3 = i2 % 128;
        f1754 = i3;
        int i4 = i2 % 2;
        this.f1766 = str;
        int i5 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1756 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m7558() {
        int i = 2 % 2;
        int i2 = f1754;
        int i3 = i2 + 101;
        f1756 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1766;
        int i5 = i2 + 75;
        f1756 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m7557() {
        String intern;
        int i = 2 % 2;
        int i2 = f1754 + 7;
        f1756 = i2 % 128;
        int i3 = i2 % 2;
        if (!m7559()) {
            intern = m7562(ImageFormat.getBitsPerPixel(0) + 7, "\u0001\u0002½½\u0004\u0005", (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 79)).intern();
        } else {
            int i4 = f1756 + 87;
            f1754 = i4 % 128;
            int i5 = i4 % 2;
            intern = m7563(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u0088\u0087\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern();
        }
        String obj = new StringBuilder().append(m7563(null, (ViewConfiguration.getTouchSlop() >> 8) + 127, null, "\u008f\u0088\u008e\u008b\u008d\u008c\u008b\u008a\u0087\u0089").intern()).append(this.f1762).append(m7563(null, 127 - TextUtils.getOffsetAfter("", 0), null, "\u008f").intern()).append(intern).toString();
        int i6 = f1756 + 81;
        f1754 = i6 % 128;
        if (i6 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m7572() {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit2.put(is.f2635, this.f1765);
            if (this.f1764 > -1.0d) {
                int i2 = f1754 + 73;
                f1756 = i2 % 128;
                int i3 = i2 % 2;
                jsonObjectInit2.put(is.f2587, this.f1764);
            }
            jsonObjectInit2.put(is.f2585, this.f1766);
            int i4 = f1754 + 83;
            f1756 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
        try {
            if (jsonObjectInit2.length() > 0) {
                if (this.f1761) {
                    int i6 = f1754 + 69;
                    f1756 = i6 % 128;
                    int i7 = i6 % 2;
                    jsonObjectInit2.put(is.f2586, true);
                }
                jsonObjectInit.put(is.f2584, jsonObjectInit2);
            }
        } catch (JSONException unused2) {
        }
        return jsonObjectInit;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        char c = 2;
        int i = 2 % 2;
        try {
            switch (str.hashCode()) {
                case -2010356102:
                    if (str.equals(m7563(null, TextUtils.indexOf((CharSequence) "", '0') + 128, null, "\u0087\u0089\u008c\u0092\u008d\u0088\u0087\u0097\u009c\u008d\u0084\u008c\u0085\u008a\u008c\u008e\u0086\u009b\u008d\u0087\u0090").intern())) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1679773410:
                    if (str.equals(m7562(ExpandableListView.getPackedPositionGroup(0L) + 14, "\u0000\u0004\u0007\u0018\u0019\u0000\u000f\t\t\u0005\u0000\b\u0014\u0010", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 51)).intern())) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1457409854:
                    if (str.equals(m7562(16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u000f\u0000\u0007\b\u000e\b\u0003\u0004\n\u0007\n\u0002\u0007\u0004\t\u0005", (byte) (39 - Color.alpha(0))).intern())) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1033133001:
                    if (str.equals(m7563(null, 127 - ExpandableListView.getPackedPositionType(0L), null, "\u0087\u0082\u0088\u0087\u0097\u0087\u0096\u008a\u0095\u008d\u0087\u0084").intern())) {
                        int i2 = f1756 + 101;
                        int i3 = i2 % 128;
                        f1754 = i3;
                        int i4 = i2 % 2;
                        int i5 = i3 + 99;
                        f1756 = i5 % 128;
                        int i6 = i5 % 2;
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -869156349:
                    if (str.equals(m7563(null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, "\u0088\u008e\u0084\u009d\u008e\u008d").intern())) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -303276684:
                    if (str.equals(m7563(null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, "\u0087\u0089\u008c\u0092\u0094\u0086\u008e\u0093\u008d\u0087\u0092\u008a\u0087\u008d\u008c\u008b\u008a\u0087\u0091\u008d\u0087\u0090").intern())) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 91962794:
                    if (str.equals(m7563(null, 126 - TextUtils.lastIndexOf("", '0', 0), null, "\u008a\u0098\u008d\u0088\u0087\u0089\u0087\u0085\u008c\u0083\u009a\u008d\u0087\u0090").intern())) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 701278346:
                    if (str.equals(m7563(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), null, "\u008a\u0095\u0088\u0087\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0099\u0084\u0098\u008d\u0087\u0084").intern())) {
                        int i7 = f1756 + 41;
                        f1754 = i7 % 128;
                        int i8 = i7 % 2;
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1006114614:
                    if (str.equals(m7562(17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0000\u0004\u0007\b\u000e\b\u0003\u0004\n\u0007\n\u0002\u0007\u0004\t\u0005", (byte) (TextUtils.lastIndexOf("", '0', 0) + 40)).intern())) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1009851624:
                    if (str.equals(m7562(TextUtils.indexOf("", "", 0, 0) + 22, "\u0000\u0004\u0007\f\u0002\u000f\r\u0003\t\u0000\u0010\b\u0000\t\u000e\n\u0005\u0010\u0007\u0004\t\u0005", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)).intern())) {
                        break;
                    }
                    c = 65535;
                    break;
                case 1314266045:
                    if (str.equals(m7562(ExpandableListView.getPackedPositionChild(0L) + 12, "\u0000\u0004\n\u0012\u0001\u000b\u0017\u0003\u0007\tÇ", (byte) (TextUtils.indexOf((CharSequence) "", '0') + 91)).intern())) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1402845873:
                    if (str.equals(m7562((ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, "\u000f\u0000\n\u0012\u0001\u000b\u0017\u0003\u0007\t\u0090", (byte) (35 - (ViewConfiguration.getTapTimeout() >> 16))).intern())) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1641431166:
                    if (str.equals(m7562(17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u000f\u0000\n\u0012\u000b\u001d\u0012\u001b\u001d\u0000\n\u0003\u0088\u0088\u0000\u0014\u0087", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35)).intern())) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1712841667:
                    if (str.equals(m7562(12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u000f\u0000\f\u0018\r\u0014\u0002\u0015\u0004\u0003\u001b\t", (byte) (88 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Exception e) {
            cn.m7268(clVar.m7203(), new StringBuilder().append(m7562(ExpandableListView.getPackedPositionGroup(0L) + 51, "\u001c\u0002\u0002\n\u0003\u001c\u0016\"\f\u001b\t!\u0005\u001b\t\u000f\u0012\t\u000e\u0003\u000f\u0018\u000f\u0001\u000f\u0010\u0000\u0007\u000e\t\u0000 \u0000\u0007\u0003\u0019\u0003\u0002\t\f\u0015\u0002\u001d\t\u0000\t\u001a\n\u000f\u001a¤", (byte) (125 - (KeyEvent.getMaxKeyCode() >> 16))).intern()).append(str).append(m7563(null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, "\u009f").intern()).toString(), e);
        }
        switch (c) {
            case 0:
                m7568((String) m7365(list, 0, String.class));
                return null;
            case 1:
                return m7560();
            case 2:
                m7565((String) m7365(list, 0, String.class));
                return null;
            case 3:
                return m7561();
            case 4:
                m7569((Double) m7365(list, 0, Double.class));
                return null;
            case 5:
                return m7564();
            case 6:
                m7566(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                return null;
            case 7:
                return Boolean.valueOf(m7559());
            case '\b':
                m7570((String) m7365(list, 0, String.class));
                return null;
            case '\t':
                return m7558();
            case '\n':
                m7571(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
            case 11:
                return Boolean.valueOf(m7567());
            case '\f':
                return m7557();
            case '\r':
                return m7572();
            default:
                new ds(clVar, eeVar, m7563(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u008c\u008d\u008c\u009e\u0088\u008e\u008b\u008d\u008c\u008b\u008a\u0087\u0091").intern(), str).m7593(clVar.m7203());
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7563(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f1759;
            int i2 = f1757;
            if (f1760) {
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
            if (f1758) {
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7562(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f1755;
            char c = f1753;
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
