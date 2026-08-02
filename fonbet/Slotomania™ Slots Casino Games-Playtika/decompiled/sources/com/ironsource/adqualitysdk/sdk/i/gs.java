package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;

/* loaded from: classes6.dex */
public final class gs extends gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2252 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2253 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2254 = 8256350376084531591L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2253 + 37;
        f2252 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7815("\uf5bcꋱ㖭\uf5df쬙\ue6ce傇氼叆괫䳥軨맶ᝠ⪂\ue49fކ累\uf0bd䊴涯ꍲ庺륏쭕ૌ⑄\u1779ᅿ\uecf0艾䵹缌囟栍ꬋ씽㣺㙭Ā⌮\ue21c鿂翟装䐍旿헸훾ⸯ쎮㎑㲡遇ꦝ榸骷穧瞥", (KeyEvent.getMaxKeyCode() >> 16) + 1).intern();
        int i4 = f2253 + 37;
        f2252 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2252 + 73;
        int i3 = i2 % 128;
        f2253 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        f2252 = i5 % 128;
        int i6 = i5 % 2;
        return InneractiveAdManager.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bt btVar = new bt(mo7797());
        int i2 = f2253 + 1;
        f2252 = i2 % 128;
        int i3 = i2 % 2;
        return btVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2253 + 57;
        f2252 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7815("Ϧ磒걗Ώᄻ缷銒깢ꖈ眐픞䲧侷촛덴", -TextUtils.indexOf((CharSequence) "", '0')).intern();
        int i4 = f2253 + 97;
        f2252 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7815(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2254, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2254));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
