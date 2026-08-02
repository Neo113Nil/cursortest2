package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.text.Typography;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class au {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f437 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f438 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f439 = true;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f443 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f444 = 145;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f446;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private e f447;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<String> f448;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f445 = {261, 266, 257, 246, 265, 242, 244, 243, 256, 263, 253, 264, Typography.half, 214, 259, Typography.plusMinus, 250, 255, 260, 249, 262, 245, 213};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f442 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f441 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f440 = 31383;

    enum e {
        f455,
        f457,
        f454,
        f453;


        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f450 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f451 = 1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f452;

        /* renamed from: ﾒ, reason: contains not printable characters */
        static void m6143() {
            f452 = 95;
        }

        public static e valueOf(String str) {
            int i = 2 % 2;
            int i2 = f451 + 79;
            f450 = i2 % 128;
            int i3 = i2 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            int i4 = f450 + 9;
            f451 = i4 % 128;
            if (i4 % 2 != 0) {
                return eVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f450 + 45;
            f451 = i2 % 128;
            int i3 = i2 % 2;
            e[] eVarArr = (e[]) values().clone();
            int i4 = f450 + 75;
            f451 = i4 % 128;
            if (i4 % 2 != 0) {
                return eVarArr;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        static {
            m6143();
            int i = f451 + 61;
            f450 = i % 128;
            int i2 = i % 2;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m6142(int i, boolean z, int i2, String str, int i3) {
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
                    cArr3[i4] = (char) (cArr3[i4] - f452);
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

    public au(JSONObject jSONObject) {
        this.f447 = m6136(jSONObject.optString(m6138(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u0084\u0083\u0082\u0081").intern()));
        this.f448 = m6139(jSONObject.optString(m6137((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23200), "\u0000\u0000\u0000\u0000", "얈\ue493ꁘꑚ", "䍄\ue58d", TextUtils.indexOf("", "", 0, 0)).intern()));
        this.f446 = m6135(jSONObject.optString(m6137((char) (16857 - MotionEvent.axisFromString("")), "\u0000\u0000\u0000\u0000", "멨鏮\uda93왁", "⸁늪샧ꕗ플픍", (-1) - MotionEvent.axisFromString("")).intern()));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static e m6136(String str) {
        int i = 2 % 2;
        int i2 = f437 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f438 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            str.hashCode();
            super.hashCode();
            throw null;
        }
        int hashCode = str.hashCode();
        char c = 65535;
        if (hashCode != 92611485) {
            if (hashCode != 93621297) {
                if (hashCode == 96946943 && !(!str.equals(m6138(null, 127 - Gravity.getAbsoluteGravity(0, 0), null, "\u0081\u0087\u0086\u0085\u0084").intern()))) {
                    int i3 = f437 + 13;
                    f438 = i3 % 128;
                    int i4 = i3 % 2;
                    c = 0;
                }
            } else if (str.equals(m6138(null, 127 - TextUtils.getCapsMode("", 0, 0), null, "\u008c\u0089\u008b\u0084\u0088").intern())) {
                c = 2;
            }
        } else if (str.equals(m6138(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0084\u008a\u0089\u0088\u0086").intern())) {
            c = 1;
        }
        if (c == 0) {
            return e.f453;
        }
        if (c == 1) {
            return e.f457;
        }
        if (c == 2) {
            e eVar = e.f454;
            int i5 = f438 + 35;
            f437 = i5 % 128;
            int i6 = i5 % 2;
            return eVar;
        }
        e eVar2 = e.f455;
        int i7 = f437 + 7;
        f438 = i7 % 128;
        if (i7 % 2 != 0) {
            return eVar2;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<String> m6139(String str) {
        int i = 2 % 2;
        List<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            int i2 = f438 + 9;
            f437 = i2 % 128;
            int i3 = i2 % 2;
            arrayList = Arrays.asList(str.split(m6138(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u008d").intern()));
        }
        int i4 = f437 + 29;
        f438 = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m6135(String str) {
        int i = 2 % 2;
        int i2 = f437 + 115;
        f438 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (TextUtils.isEmpty(str) || !(!str.equals(m6137((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44422), "\u0000\u0000\u0000\u0000", "꒞❜蘶ᾭ", "䜣জ樄月", (-1) - TextUtils.lastIndexOf("", '0', 0, 0)).intern()))) {
                return null;
            }
            int i3 = f438 + 105;
            f437 = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        TextUtils.isEmpty(str);
        super.hashCode();
        throw null;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.au$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: ﾒ, reason: contains not printable characters */
        static final /* synthetic */ int[] f449;

        static {
            int[] iArr = new int[e.valuesCustom().length];
            f449 = iArr;
            try {
                iArr[e.f455.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f449[e.f453.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f449[e.f454.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f449[e.f457.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m6141(String str) {
        int i;
        int i2 = 2 % 2;
        try {
            i = AnonymousClass4.f449[this.f447.ordinal()];
        } catch (Exception e2) {
            kl.m8458(m6137((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "\uea2c斂聉\uf291", "슄ꊚ届\uf5e8ሜ᪔㣁돀\ude2cထ㵜뻢씫ʑ㜆\uf090悤놶ô炳辧襧", ViewConfiguration.getTouchSlop() >> 8).intern(), m6138(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, "\u0084\u008b\u0088\u0086\u0093\u0091\u0097\u0096\u008b\u0095\u0089\u0094\u0093\u0090\u0092\u0091\u0090\u008f\u0089\u008f\u008f\u008e").intern(), (Throwable) e2, false);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.f448.contains(str);
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
        } else if (this.f448.size() > 0) {
            int i3 = f437 + 87;
            f438 = i3 % 128;
            int i4 = i3 % 2;
            if (kn.m8470(str, this.f448.get(0)) >= 0) {
                return false;
            }
            int i5 = f437 + 31;
            f438 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (this.f448.size() <= 0 || kn.m8470(str, this.f448.get(0)) < 0) {
            return false;
        }
        int i7 = f438 + 91;
        f437 = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m6140() {
        int i = 2 % 2;
        int i2 = f438 + 79;
        int i3 = i2 % 128;
        f437 = i3;
        int i4 = i2 % 2;
        String str = this.f446;
        int i5 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f438 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6138(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f445;
            int i2 = f444;
            if (f443) {
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
            if (f439) {
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6137(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f442) ^ f441) ^ f440);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
