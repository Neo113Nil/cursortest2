package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;

/* loaded from: classes5.dex */
public class jl {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2802 = {23, '4', '2', 'i', 'g', '1', 'H', 'P', 'k', 'i', 'n', 'q', 'l', GMTDateParser.DAY_OF_MONTH, 23, 'R', 'r', 'i'};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2803 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2804 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f2805;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f2806;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f2807;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2808;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2809;

    /* synthetic */ jl(String str, String str2, String str3, String str4, byte b) {
        this(str, str2, str3, str4);
    }

    private jl(String str, String str2, String str3, String str4) {
        this.f2805 = str;
        this.f2808 = str2;
        this.f2806 = str3;
        this.f2807 = str4;
        this.f2809 = true;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static String m8210() {
        int i = 2 % 2;
        int i2 = f2803 + 49;
        f2804 = i2 % 128;
        int i3 = i2 % 2;
        String mo6056 = ar.m6041().mo6056();
        int i4 = f2804 + 83;
        f2803 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return mo6056;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    protected final String m8219() {
        int i = 2 % 2;
        int i2 = f2804 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        int i3 = i2 % 128;
        f2803 = i3;
        int i4 = i2 % 2;
        String str = this.f2805;
        int i5 = i3 + 83;
        f2804 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m8212() {
        int i = 2 % 2;
        int i2 = f2804 + 95;
        f2803 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2808;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    protected final String m8216() {
        int i = 2 % 2;
        int i2 = f2804 + 95;
        f2803 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2806;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m8209() {
        int i = 2 % 2;
        int i2 = f2804;
        int i3 = i2 + 35;
        f2803 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f2807;
        int i5 = i2 + 67;
        f2803 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8214() {
        int i = 2 % 2;
        int i2 = f2804 + 107;
        int i3 = i2 % 128;
        f2803 = i3;
        int i4 = i2 % 2;
        this.f2809 = false;
        int i5 = i3 + 79;
        f2804 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public String mo8217() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m8211()).append(this.f2805).append(m8213("\u0001", new int[]{0, 1, 0, 1}, true).intern()).append(this.f2808).append(m8213("\u0001", new int[]{1, 1, 59, 0}, true).intern()).append(m8213("\u0000\u0000\u0001", new int[]{2, 3, 0, 0}, true).intern()).append(m8213("\u0001", new int[]{1, 1, 59, 0}, true).intern()).append(this.f2806).append(m8213("\u0001", new int[]{1, 1, 59, 0}, true).intern()).append(this.f2807).toString();
        int i2 = f2804 + 89;
        f2803 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    protected final String m8218(String str) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m8211()).append(m8219()).append(m8213("\u0001", new int[]{0, 1, 0, 1}, true).intern()).append(m8213("\u0000\u0000\u0001", new int[]{2, 3, 0, 0}, true).intern()).append(m8213("\u0001", new int[]{0, 1, 0, 1}, true).intern()).append(str).append(m8213("\u0001", new int[]{0, 1, 0, 1}, true).intern()).append(m8212()).append(m8213("\u0001", new int[]{1, 1, 59, 0}, true).intern()).append(m8213("\u0000\u0000\u0001", new int[]{2, 3, 0, 0}, true).intern()).append(m8213("\u0001", new int[]{1, 1, 59, 0}, true).intern()).append(m8216()).append(m8213("\u0001", new int[]{1, 1, 59, 0}, true).intern()).append(m8209()).toString();
        int i2 = f2803 + 57;
        f2804 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m8215() {
        int i = 2 % 2;
        int i2 = f2804 + 81;
        f2803 = i2 % 128;
        int i3 = i2 % 2;
        String replace = mo8217().replace(m8213("\u0001", new int[]{0, 1, 0, 1}, true).intern(), m8213("\u0001", new int[]{1, 1, 59, 0}, true).intern());
        int i4 = f2804 + 53;
        f2803 = i4 % 128;
        int i5 = i4 % 2;
        return replace;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m8211() {
        int i = 2 % 2;
        String intern = m8213("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{5, 9, 0, 2}, false).intern();
        String m8210 = m8210();
        if (this.f2809) {
            int i2 = f2804 + 69;
            f2803 = i2 % 128;
            int i3 = i2 % 2;
            if (!TextUtils.isEmpty(m8210)) {
                intern = new StringBuilder().append(intern).append(m8213("\u0001\u0001\u0000\u0001", new int[]{14, 4, 0, 0}, true).intern()).append(m8210).append(m8213("\u0001", new int[]{0, 1, 0, 1}, true).intern()).toString();
            }
        }
        int i4 = f2803 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2804 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    public static class d extends jl {

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2812 = {135, 274, 278, 273, '1', GMTDateParser.HOURS, 'i', 'I', 'N', 'n', 'q', 'n'};

        public d(String str, String str2) {
            super(str, m8220("\u0000\u0000\u0001\u0000", new int[]{0, 4, 168, 0}, true).intern(), str2, m8220("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{4, 8, 0, 0}, true).intern(), (byte) 0);
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m8220(String str, int[] iArr, boolean z) {
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
                System.arraycopy(f2812, i, cArr, 0, i2);
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

    public static class c extends d {

        /* renamed from: ｋ, reason: contains not printable characters */
        private final String f2811;

        public c(String str, String str2, String str3) {
            super(str, str2);
            this.f2811 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jl
        /* renamed from: ﾇ */
        public final String mo8217() {
            return m8218(this.f2811);
        }
    }

    public static class e extends jl {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f2813 = 3;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2814 = {'c', 'o', 'n', 'j', GMTDateParser.SECONDS, '.', 'e', GMTDateParser.DAY_OF_MONTH, 'f'};

        public e(String str, String str2) {
            super(str, m8221(3 - TextUtils.lastIndexOf("", '0'), "\u0001\u0002\u0096\u0096", (byte) (View.getDefaultSize(0, 0) + 40)).intern(), str2, m8221(8 - KeyEvent.normalizeMetaState(0), "\u0004\u0005\u0002\u0000\u0003\b\u0000\u0001", (byte) (64 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), (byte) 0);
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m8221(int i, String str, byte b) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (j.f2674) {
                char[] cArr3 = f2814;
                char c = f2813;
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

    public static class a extends e {

        /* renamed from: ﾒ, reason: contains not printable characters */
        private final String f2810;

        public a(String str, String str2, String str3) {
            super(str, str2);
            this.f2810 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jl
        /* renamed from: ﾇ */
        public final String mo8217() {
            return m8218(this.f2810);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8213(String str, int[] iArr, boolean z) {
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
            System.arraycopy(f2802, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                h.f2287 = 0;
                char c2 = 0;
                while (h.f2287 < i2) {
                    if (bArr2[h.f2287] == 1) {
                        cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c2);
                    } else {
                        cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c2);
                    }
                    c2 = cArr2[h.f2287];
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
