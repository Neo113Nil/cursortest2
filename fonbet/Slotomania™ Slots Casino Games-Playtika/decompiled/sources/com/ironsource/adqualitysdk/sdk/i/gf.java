package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* loaded from: classes4.dex */
public final class gf extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2181 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2182 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2183 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2184 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2185 = -1330576333536084783L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ, reason: contains not printable characters */
    public final String mo7798() {
        char green;
        int alpha;
        int i = 2 % 2;
        int i2 = f2181 + 29;
        f2183 = i2 % 128;
        if (i2 % 2 == 0) {
            green = (char) Color.green(1);
            alpha = 241007937 << Color.alpha(0);
        } else {
            green = (char) Color.green(0);
            alpha = 241007937 - Color.alpha(0);
        }
        String intern = m7795(green, "㳑픊ퟟ\ued88", "䅵嵽餎Ꮃ", "၆䪦듦䆊䨖葌䐃淩샥帣麆죸ꮞᣴ䶌⥢䬢\ue706\ue55dꑩ꺜\ua95c挰韼氾焧ᕌꖁ椝㞐䐅㲋顯浪펟\ueada鍎꧵ࢀ䗭ぞ繰\ue94bꛖ漜ვﮢ粷ঊ霹袜", alpha).intern();
        int i3 = f2183 + 7;
        f2181 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Class mo7796() {
        Class<IronSourceAdQuality> cls;
        int i = 2 % 2;
        int i2 = f2181;
        int i3 = i2 + 81;
        f2183 = i3 % 128;
        if (i3 % 2 == 0) {
            cls = IronSourceAdQuality.class;
            int i4 = 88 / 0;
        } else {
            cls = IronSourceAdQuality.class;
        }
        int i5 = i2 + 69;
        f2183 = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final be mo7799() {
        int i = 2 % 2;
        bh bhVar = new bh(mo7797());
        int i2 = f2181 + 3;
        f2183 = i2 % 128;
        int i3 = i2 % 2;
        return bhVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2181 + 37;
        f2183 = i2 % 128;
        int i3 = i2 % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        return m7795(i3 == 0 ? (char) (35313 << (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))) : (char) (35313 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))), "㳑픊ퟟ\ued88", "ઍ˱\uf062\ue189", "\ue094扊﨣䳵ꔘ럜쨧የ縬鵍牽⛗砨\ud926\u0895", ExpandableListView.getPackedPositionChild(0L) + 1644359947).intern();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7795(char c, String str, String str2, String str3, int i) {
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
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2185) ^ f2182) ^ f2184);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
