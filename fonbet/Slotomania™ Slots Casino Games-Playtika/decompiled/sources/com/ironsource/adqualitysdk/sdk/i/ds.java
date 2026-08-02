package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class ds extends dr {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1822 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1823 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1824 = 882839348;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1825 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1826;

    public ds(cl clVar, ee eeVar, String str, String str2) {
        super(clVar, eeVar, new StringBuilder().append(m7603((char) (12505 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "찶싛\ud8c4锰", "ᢻᎻ魰죯币汆繒᷸—섾鲂鯊邽\u0a12ꄓ僂", TextUtils.getCapsMode("", 0, 0)).intern()).append(str).append(m7603((char) (Color.rgb(0, 0, 0) + 16809224), "\u0000\u0000\u0000\u0000", "魦\uec32ࠁᙽ", "ꬽ倸榆㢞᷷\ue016浶ᡍ奆Ɯ碮轔ꔎ硩䰨䏸㳵䘜咑걚瑙힐龤倵\ueba8㕍碒豺礪䠕伄", 32256667 - TextUtils.getOffsetBefore("", 0)).intern()).append(str2).toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.dn
    /* renamed from: ﻛ */
    public final String mo7592() {
        int i = 2 % 2;
        int i2 = f1825 + 107;
        f1826 = i2 % 128;
        return (i2 % 2 != 0 ? m7603((char) (3224 % (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ﯡ堏嗗㴸", "㟀飞䟉닊햁魵颋屉땬鵚㜆㊑涹砆子\uf640Ã\ue039鿰ꛮꄿ鿇ꩭᮦ\uece3楊㗶䒕썪醦菞궥本땖䎈靆婴\ud9ac笄ꋜ뉸", (-682094597) % (ViewConfiguration.getDoubleTapTimeout() << 20)) : m7603((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14421), "\u0000\u0000\u0000\u0000", "ﯡ堏嗗㴸", "㟀飞䟉닊햁魵颋屉땬鵚㜆㊑涹砆子\uf640Ã\ue039鿰ꛮꄿ鿇ꩭᮦ\uece3楊㗶䒕썪醦菞궥本땖䎈靆婴\ud9ac笄ꋜ뉸", (ViewConfiguration.getDoubleTapTimeout() >> 16) - 682094597)).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7603(char c, String str, String str2, String str3, int i) {
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
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f1822) ^ f1824) ^ f1823);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
