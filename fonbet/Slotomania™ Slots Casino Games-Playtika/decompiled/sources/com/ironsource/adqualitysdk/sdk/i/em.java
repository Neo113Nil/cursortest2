package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public abstract class em extends ef {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1984 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1985 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1986 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1987 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1988 = -2765212177004768628L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final ef f1989;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final ef f1990;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract String mo7734();

    public em(ef efVar, ef efVar2) {
        this.f1990 = efVar;
        this.f1989 = efVar2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ef m7735() {
        int i = 2 % 2;
        int i2 = f1984 + 89;
        int i3 = i2 % 128;
        f1985 = i3;
        int i4 = i2 % 2;
        ef efVar = this.f1990;
        int i5 = i3 + 67;
        f1984 = i5 % 128;
        int i6 = i5 % 2;
        return efVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ef m7736() {
        int i = 2 % 2;
        int i2 = f1984;
        int i3 = i2 + 111;
        f1985 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        ef efVar = this.f1989;
        int i4 = i2 + 29;
        f1985 = i4 % 128;
        int i5 = i4 % 2;
        return efVar;
    }

    public String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f1990).append(m7733((char) (TextUtils.indexOf("", "", 0) + 64780), "튌ﴋ︬\ud99f", "\ueeaf襤\u0cffࣽ", "ֽ", (-449297) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern()).append(mo7734()).append(m7733((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 64780), "튌ﴋ︬\ud99f", "\ueeaf襤\u0cffࣽ", "ֽ", (-449298) - (ViewConfiguration.getScrollBarSize() >> 8)).intern()).append(this.f1989).toString();
        int i2 = f1984 + 29;
        f1985 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r3.equals(r7.f1990) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r3 = r6.f1989;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.em.f1984 + 3;
        com.ironsource.adqualitysdk.sdk.i.em.f1985 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r3.equals(r7.f1989);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r7.f1989 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r3.equals(r7.f1990) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r7.f1990 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f1984 + 73;
            f1985 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            em emVar = (em) obj;
            ef efVar = this.f1990;
            if (efVar != null) {
                int i4 = f1985 + 31;
                f1984 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        ef efVar = this.f1990;
        int i3 = 0;
        if (efVar != null) {
            int i4 = f1984 + 107;
            f1985 = i4 % 128;
            if (i4 % 2 != 0) {
                i = efVar.hashCode();
                int i5 = 39 / 0;
            } else {
                i = efVar.hashCode();
            }
        } else {
            i = 0;
        }
        int i6 = i * 31;
        ef efVar2 = this.f1989;
        if (efVar2 != null) {
            int i7 = f1984 + 69;
            f1985 = i7 % 128;
            int i8 = i7 % 2;
            i3 = efVar2.hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7733(char c, String str, String str2, String str3, int i) {
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
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f1988) ^ f1987) ^ f1986);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
