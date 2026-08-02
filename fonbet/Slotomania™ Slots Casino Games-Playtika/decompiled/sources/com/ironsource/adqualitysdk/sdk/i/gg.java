package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class gg extends gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2186 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2187 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2188 = -1404568807357103665L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2186 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2187 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7800("磸䆽꺌喯碛耝⵿წ羭裄\u2439ᥨ盳醕㳯ظ洯陛㟰\u0eef摬齳\u0e77㞓岸ꐯल㱏口곮ǡ╔䨯떪ᢥⶐ䅑멠\u139d⪌㦷䌹橃퍔ッ䯿攻\ud80e㜽傫緟샂⹁奖璛", Drawable.resolveOpacity(0, 0) + 1).intern();
        int i4 = f2186 + 29;
        f2187 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2186 + 109;
        int i3 = i2 % 128;
        f2187 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        f2186 = i5 % 128;
        int i6 = i5 % 2;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bf bfVar = new bf(mo7797());
        int i2 = f2186 + 49;
        f2187 = i2 % 128;
        int i3 = i2 % 2;
        return bfVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int keyRepeatTimeout;
        int i = 2 % 2;
        int i2 = f2186 + 83;
        f2187 = i2 % 128;
        if (i2 % 2 == 0) {
            ViewConfiguration.getKeyRepeatTimeout();
            keyRepeatTimeout = 0;
        } else {
            keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1;
        }
        String intern = m7800("麶톻䎞毝黗တ쁱⻃駢ᣑ줶✑邪Ɩ퇻", keyRepeatTimeout).intern();
        int i3 = f2186 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2187 = i3 % 128;
        if (i3 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7800(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2188, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2188));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
