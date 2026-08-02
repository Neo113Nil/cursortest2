package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes6.dex */
public final class hd extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2308 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2309 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2310 = 4467967161972385851L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2309 + 45;
        f2308 = i2 % 128;
        String intern = m7829("ﶅ쇛\ufdeb괰ⅇꦅ紲᧘崙좉\udc30\uf8b4밼殼뼗宸ἤ謊Ṧ㩛繁⩕露鵕\ud97d䵧堌籂㡴\uec5a㢧\udf1a", (i2 % 2 == 0 ? KeyEvent.getDeadChar(1, 1) : KeyEvent.getDeadChar(0, 0)) + 1).intern();
        int i3 = f2309 + 1;
        f2308 = i3 % 128;
        if (i3 % 2 != 0) {
            return intern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2308 + 27;
        f2309 = i2 % 128;
        if (i2 % 2 == 0) {
            return HyBid.class;
        }
        int i3 = 2 / 0;
        return HyBid.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        by byVar = new by(mo7797());
        int i2 = f2308 + 111;
        f2309 = i2 % 128;
        int i3 = i2 % 2;
        return byVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2309 + 113;
        f2308 = i2 % 128;
        return m7829("淮\ue74b涞�첤輅\u2fe9\uf47b쵣\uee18軶ᕏⱓ", i2 % 2 == 0 ? KeyEvent.keyCodeFromString("") : 1 - KeyEvent.keyCodeFromString("")).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7829(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2310, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2310));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
