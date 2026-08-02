package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class fw extends gb {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2134 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2135 = 7859804800989236600L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2136 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final ea mo7776(ee eeVar, cl clVar) {
        int i = 2 % 2;
        Object obj = null;
        ea eaVar = new ea(null);
        eaVar.m7677();
        int i2 = f2136 + 105;
        f2134 = i2 % 128;
        if (i2 % 2 == 0) {
            return eaVar;
        }
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f2136 + 49;
        f2134 = i2 % 128;
        String intern = m7779("㖐昇铘㗳\ueb10蹆紆픚\u0019ꔱ쑽ଷ幫", i2 % 2 != 0 ? KeyEvent.getDeadChar(1, 0) : KeyEvent.getDeadChar(0, 0)).intern();
        int i3 = f2134 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2136 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7779(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2135, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2135));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
