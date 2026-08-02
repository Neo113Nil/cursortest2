package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.inmobi.sdk.InMobiSdk;

/* loaded from: classes6.dex */
public final class gu extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2261 = 57740;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2262 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2263;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2264;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2265;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2263 + 31;
        f2262 = i2 % 128;
        return m7818(i2 % 2 == 0 ? (char) ((-1) >>> (ExpandableListView.getPackedPositionForChild(0, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 1) == 1L ? 0 : -1))) : (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "☍唻욥줐", "얚袋점籄\ue099音䵦⪖ᮝ앧興襊랁홰늄ᶧᕪ\uf6fb꽿é\ue1a0꜃\ue97a码", KeyEvent.keyCodeFromString("")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2263 + 9;
        int i3 = i2 % 128;
        f2262 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        f2263 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return InMobiSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bp bpVar = new bp(mo7797());
        int i2 = f2262 + 71;
        f2263 = i2 % 128;
        int i3 = i2 % 2;
        return bpVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        char indexOf;
        int threadPriority;
        int i = 2 % 2;
        int i2 = f2263 + 7;
        f2262 = i2 % 128;
        if (i2 % 2 == 0) {
            indexOf = (char) (8740 - TextUtils.indexOf((CharSequence) "", 'F', 0));
            threadPriority = Process.getThreadPriority(1) >>> 31;
        } else {
            indexOf = (char) (24734 - TextUtils.indexOf((CharSequence) "", '0', 0));
            threadPriority = (Process.getThreadPriority(0) + 20) >> 6;
        }
        return m7818(indexOf, "\u0000\u0000\u0000\u0000", "♩ꮉ鼿쁠", "Ꚅ唉㥾\ue9b7㈃⅟", threadPriority).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7818(char c, String str, String str2, String str3, int i) {
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
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2265) ^ f2264) ^ f2261);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
