package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class jj {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2742 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2743 = 170;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2744;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2745 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final jg f2746;

    interface a {
        /* renamed from: ｋ */
        jd mo8187();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ jg m8180(jj jjVar) {
        int i = 2 % 2;
        int i2 = f2744 + 59;
        int i3 = i2 % 128;
        f2742 = i3;
        int i4 = i2 % 2;
        jg jgVar = jjVar.f2746;
        int i5 = i3 + 25;
        f2744 = i5 % 128;
        int i6 = i5 % 2;
        return jgVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m8182(jj jjVar, ji jiVar, a aVar) {
        int i = 2 % 2;
        int i2 = f2744 + 11;
        f2742 = i2 % 128;
        int i3 = i2 % 2;
        jjVar.m8181(jiVar, aVar);
        int i4 = f2742 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2744 = i4 % 128;
        int i5 = i4 % 2;
    }

    public jj(Context context) {
        this.f2746 = new jg(context.getApplicationContext());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final jg m8184() {
        jg jgVar;
        int i = 2 % 2;
        int i2 = f2744;
        int i3 = i2 + 87;
        f2742 = i3 % 128;
        if (i3 % 2 == 0) {
            jgVar = this.f2746;
            int i4 = 71 / 0;
        } else {
            jgVar = this.f2746;
        }
        int i5 = i2 + 95;
        f2742 = i5 % 128;
        if (i5 % 2 != 0) {
            return jgVar;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8185() {
        int i = 2 % 2;
        int i2 = f2742 + 73;
        f2744 = i2 % 128;
        int i3 = i2 % 2;
        this.f2746.m8161();
        this.f2745 = true;
        int i4 = f2744 + 87;
        f2742 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8186(final String str, final JSONObject jSONObject, ji jiVar) {
        int i = 2 % 2;
        int i2 = f2744 + 67;
        f2742 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i4 = f2744 + 31;
            f2742 = i4 % 128;
            int i5 = i4 % 2;
            m.m8521(m8183(((Process.getThreadPriority(0) + 20) >> 6) + 14, true, Gravity.getAbsoluteGravity(0, 0) + 273, "\ufffa￦\u0004\u000b\b\u0010\r\ufffe\uffe7\u000b\ufffe\u0000\ufffa\u0007", ImageFormat.getBitsPerPixel(0) + 10).intern(), m8183(TextUtils.indexOf("", "", 0) + 77, true, 266 - KeyEvent.getDeadChar(0, 0), "\u0012\uffc0\u0012\u000f\uffc0￬\ufff2\ufff5\uffc0\u0012\u0005\b\u0014\t\u0005\uffc0\u0014\u0013\u0005\u0015\u0011\u0005\u0012\uffc0\r\u000f\u0014\u0013\u0015\u0003\uffc0\u0014\u0013\u000f\u0010\uffc0\u000f\u0014\uffc0\u0005\f\u0002\u0001\u000e\ufff5\u0004\u0005\u0004\t\u0016\u000f\u0012\u0010\uffc0\u0014\u000f\u000e\uffc0\u0005\u0012\u0005\u0017\uffc0\u0012\u0005\f\u0004\u000e\u0001￨\u0005\u0013\u000e\u000f\u0010\u0013\u0005", Color.red(0) + 45).intern());
            return;
        }
        m8181(jiVar, new a() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jj.a
            /* renamed from: ｋ, reason: contains not printable characters */
            public final jd mo8187() {
                return jf.m8138(jSONObject, str);
            }
        });
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m8181(final ji jiVar, final a aVar) {
        int i = 2 % 2;
        int i2 = f2744 + 79;
        int i3 = i2 % 128;
        f2742 = i3;
        int i4 = i2 % 2;
        if (this.f2745) {
            int i5 = i3 + 93;
            f2744 = i5 % 128;
            int i6 = i5 % 2;
            m.m8527(m8183(View.getDefaultSize(0, 0) + 14, true, 273 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\ufffa￦\u0004\u000b\b\u0010\r\ufffe\uffe7\u000b\ufffe\u0000\ufffa\u0007", Color.alpha(0) + 9).intern(), m8183(View.combineMeasuredStates(0, 0) + 63, true, View.resolveSizeAndState(0, 0, 0) + 268, "\u0012\u0003￬ﾾ\f\u0003\u0006\u0015ﾾ\u0012\u0011\u0003\u0013\u000f\u0003\ufff0\u0003\t\r\u0014\f\u0007ﾾ\r\u0012ﾾ\u0002\u0003\u0007\u0010\u0012ﾾ\u0003\f\r\u0003\u000b\r\ufff1\f\u0015\r\u0002\u0012\u0013\u0006\u0011ﾾ\u0011\uffff\u0015ﾾ\u0010\u0003\u0005\uffff\f\uffff￫\t\u0010\r\u0015", 39 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
            return;
        }
        ke.m8356(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.2

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f2749 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f2750 = {GMTDateParser.YEAR, 172, Typography.section, 165, 168, 168, 152, 157, 175, Typography.plusMinus, 180, Typography.paragraph, 173, 154, '9', 'p', 'n', 'F', 'I', 'l', 'k', 't', GMTDateParser.MINUTES, 'k', 'I', 'K', 'p', 'n', 'n', 'D', 'B', 'b', 'j', 'j', GMTDateParser.MONTH, '-', '3', AbstractJsonLexerKt.BEGIN_LIST, 'q', 'J', '@', '@', 'I', 't', 'l', 'c', GMTDateParser.DAY_OF_MONTH, 'l', GMTDateParser.SECONDS, 'I', 'I', 'k', 'l', 'q', 'o', 'n', 'p', 'l', 'B', 'C', AbstractJsonLexerKt.COLON, GMTDateParser.SECONDS, 'k', 'k', 'I', 'F', 'n', 'q', GMTDateParser.SECONDS, 't', 'l', 'A', 'B', 'i', 'i', 'l', 'I', 'G', 'q', 'J', 'B', GMTDateParser.HOURS, 'g', 'a', 'g', 'a', AbstractJsonLexerKt.COLON, 'J', GMTDateParser.SECONDS, 'l'};

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f2751;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                int i7 = 2 % 2;
                int i8 = f2751 + 77;
                f2749 = i8 % 128;
                int i9 = i8 % 2;
                m8189(jiVar, aVar);
                int i10 = f2751 + 9;
                f2749 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 53 / 0;
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private void m8189(final ji jiVar2, a aVar2) {
                int i7 = 2 % 2;
                int i8 = f2751 + 43;
                f2749 = i8 % 128;
                Object obj = null;
                if (i8 % 2 != 0) {
                    if (jj.m8180(jj.this).m8158()) {
                        try {
                            final jd mo8187 = aVar2.mo8187();
                            if (mo8187 != null) {
                                m.m8520(m8190("\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{0, 14, 65, 0}, true).intern(), new StringBuilder().append(m8190("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{14, 46, 0, 22}, false).intern()).append(jf.m8139(mo8187)).toString());
                                p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.2.5
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* renamed from: ｋ */
                                    public final void mo5828() throws Exception {
                                        ji.this.mo5973(mo8187);
                                    }
                                });
                                return;
                            }
                            p.m8554(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.2.2

                                /* renamed from: ﮐ, reason: contains not printable characters */
                                private static int f2755 = 1;

                                /* renamed from: ﱟ, reason: contains not printable characters */
                                private static int f2756 = 0;

                                /* renamed from: ﱡ, reason: contains not printable characters */
                                private static byte[] f2757 = {34, 17, 46, 65, 59, 59, 57, 74, 47, -114, -19, Base64.padSymbol, -118, -22, 63, -117, 44, 60, 58, 78, -18, 73, 53, 48, -112, -24, 66, 69, 47, 73, 59, 60, 57, 65, Byte.MIN_VALUE, -9, Base64.padSymbol, 49, 72, Byte.MAX_VALUE, -23, 58, Base64.padSymbol, 79, 41, Base64.padSymbol, -113, -22, 63, -117, -22, 63, 57, 60, 73, -127, -22, 73, 43, SignedBytes.MAX_POWER_OF_TWO, 73, 46, -113, -5, 125, -24, 65, 100, 0};

                                /* renamed from: ﻏ, reason: contains not printable characters */
                                private static short[] f2758 = null;

                                /* renamed from: ﻐ, reason: contains not printable characters */
                                private static int f2759 = -2100384281;

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static int f2760 = 69;

                                /* renamed from: ﾒ, reason: contains not printable characters */
                                private static int f2761 = -398863579;

                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5828() throws Exception {
                                    int i9;
                                    int i10 = 2 % 2;
                                    jd jdVar = jd.this;
                                    if (jdVar != null) {
                                        int i11 = f2756 + 79;
                                        f2755 = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            jdVar.m8128().m8131();
                                            throw null;
                                        }
                                        i9 = jdVar.m8128().m8131();
                                        int i12 = f2755 + 83;
                                        f2756 = i12 % 128;
                                        int i13 = i12 % 2;
                                    } else {
                                        i9 = -1;
                                    }
                                    jiVar2.mo5974(jd.this, new StringBuilder().append(m8191((short) ((ViewConfiguration.getTapTimeout() >> 16) - 60), 398863650 - View.MeasureSpec.makeMeasureSpec(0, 0), ViewConfiguration.getKeyRepeatTimeout() >> 16, 2100384281 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern()).append(i9).toString());
                                    int i14 = f2755 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                                    f2756 = i14 % 128;
                                    int i15 = i14 % 2;
                                }

                                /* renamed from: ﾇ, reason: contains not printable characters */
                                private static String m8191(short s, int i9, int i10, int i11, byte b) {
                                    String obj2;
                                    synchronized (n.f3088) {
                                        StringBuilder sb = new StringBuilder();
                                        int i12 = f2760;
                                        int i13 = i10 + i12;
                                        int i14 = i13 == -1 ? 1 : 0;
                                        if (i14 != 0) {
                                            byte[] bArr = f2757;
                                            if (bArr != null) {
                                                i13 = (byte) (bArr[f2759 + i11] + i12);
                                            } else {
                                                i13 = (short) (f2758[f2759 + i11] + i12);
                                            }
                                        }
                                        if (i13 > 0) {
                                            n.f3090 = ((i11 + i13) - 2) + f2759 + i14;
                                            n.f3091 = b;
                                            n.f3092 = (char) (i9 + f2761);
                                            sb.append(n.f3092);
                                            n.f3093 = n.f3092;
                                            n.f3089 = 1;
                                            while (n.f3089 < i13) {
                                                byte[] bArr2 = f2757;
                                                if (bArr2 != null) {
                                                    int i15 = n.f3090;
                                                    n.f3090 = i15 - 1;
                                                    n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i15] + s)) ^ n.f3091));
                                                } else {
                                                    short[] sArr = f2758;
                                                    int i16 = n.f3090;
                                                    n.f3090 = i16 - 1;
                                                    n.f3092 = (char) (n.f3093 + (((short) (sArr[i16] + s)) ^ n.f3091));
                                                }
                                                sb.append(n.f3092);
                                                n.f3093 = n.f3092;
                                                n.f3089++;
                                            }
                                        }
                                        obj2 = sb.toString();
                                    }
                                    return obj2;
                                }
                            });
                            return;
                        } catch (Exception e) {
                            jiVar2.mo5974(null, new StringBuilder().append(m8190("\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{60, 30, 0, 26}, true).intern()).append(e.getLocalizedMessage()).toString());
                            return;
                        }
                    }
                    int i9 = f2749 + 67;
                    f2751 = i9 % 128;
                    if (i9 % 2 == 0) {
                        m8188(jiVar2, aVar2);
                        return;
                    } else {
                        m8188(jiVar2, aVar2);
                        int i10 = 23 / 0;
                        return;
                    }
                }
                jj.m8180(jj.this).m8158();
                super.hashCode();
                throw null;
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private void m8188(final ji jiVar2, final a aVar2) {
                int i7 = 2 % 2;
                jj.m8180(jj.this).m8160(new jb() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.jb
                    /* renamed from: ﻐ */
                    public final void mo5981() {
                        jj.m8180(jj.this).m8162(this);
                        jj.m8182(jj.this, jiVar2, aVar2);
                    }
                });
                int i8 = f2749 + 51;
                f2751 = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m8190(String str, int[] iArr, boolean z) {
                String str2;
                byte[] bArr = str;
                if (str != null) {
                    bArr = str.getBytes(C.ISO88591_NAME);
                }
                byte[] bArr2 = bArr;
                synchronized (h.f2286) {
                    int i7 = iArr[0];
                    int i8 = iArr[1];
                    int i9 = iArr[2];
                    int i10 = iArr[3];
                    char[] cArr = new char[i8];
                    System.arraycopy(f2750, i7, cArr, 0, i8);
                    if (bArr2 != null) {
                        char[] cArr2 = new char[i8];
                        h.f2287 = 0;
                        char c = 0;
                        while (h.f2287 < i8) {
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
                    if (i10 > 0) {
                        char[] cArr3 = new char[i8];
                        System.arraycopy(cArr, 0, cArr3, 0, i8);
                        int i11 = i8 - i10;
                        System.arraycopy(cArr3, 0, cArr, i11, i10);
                        System.arraycopy(cArr3, i10, cArr, 0, i11);
                    }
                    if (z) {
                        char[] cArr4 = new char[i8];
                        h.f2287 = 0;
                        while (h.f2287 < i8) {
                            cArr4[h.f2287] = cArr[(i8 - h.f2287) - 1];
                            h.f2287++;
                        }
                        cArr = cArr4;
                    }
                    if (i9 > 0) {
                        h.f2287 = 0;
                        while (h.f2287 < i8) {
                            cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                            h.f2287++;
                        }
                    }
                    str2 = new String(cArr);
                }
                return str2;
            }
        });
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8183(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f2743);
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
