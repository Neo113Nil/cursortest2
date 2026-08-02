package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import tv.superawesome.sdk.publisher.AwesomeAds;

/* loaded from: classes6.dex */
public final class hc extends gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2302 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2303 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2304 = 17502;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2305 = 61929;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2306 = 59286;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2307 = 1644;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2302 + 33;
        f2303 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7828("箑ꎘ࣓퍸䅡䉩褯荁\ue501\ueea3\udd3b\u0dd7⠧⠹䢕ᛔ侷퀖ử㟯郶䣕猻야莗\ue0faꈆ䧣ᔣ퓑ꌀ왿\udd3b\u0dd7⠧⠹쭣\udfc1駰澭", Color.red(0) + 40).intern();
        int i4 = f2303 + 37;
        f2302 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2302 + 75;
        f2303 = i2 % 128;
        if (i2 % 2 == 0) {
            return AwesomeAds.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        cd cdVar = new cd(mo7797());
        int i2 = f2303 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2302 = i2 % 128;
        int i3 = i2 % 2;
        return cdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2303 + 39;
        f2302 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7828("勿⥺琳﬩嫞\uf675䓕嬲廣诉諛ᡮ", 11 - ExpandableListView.getPackedPositionChild(0L)).intern();
        int i4 = f2302 + 45;
        f2303 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return intern;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7828(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2304)) ^ ((c2 >>> 5) + f2305)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2306) ^ ((c3 + i2) ^ ((c3 << 4) + f2307))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
