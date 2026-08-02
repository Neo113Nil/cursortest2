package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.ar;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* loaded from: classes3.dex */
public final class at extends ar.AnonymousClass5 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f431 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f432 = 48859;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f433 = 28214;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f434 = 22270;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f435 = 39689;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f436;

    public at(aw awVar) {
        m6077(awVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m6130() {
        int i = 2 % 2;
        int i2 = f436 + 3;
        f431 = i2 % 128;
        int i3 = i2 % 2;
        List<String> m6237 = m6076().m6237();
        int i4 = f436 + 7;
        f431 = i4 % 128;
        int i5 = i4 % 2;
        return m6237;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m6132() {
        int i = 2 % 2;
        int i2 = f436 + 65;
        f431 = i2 % 128;
        int i3 = i2 % 2;
        int m6233 = m6076().m6233();
        int i4 = f431 + 77;
        f436 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6233;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m6133() {
        int i = 2 % 2;
        int i2 = f431 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f436 = i2 % 128;
        int i3 = i2 % 2;
        List<String> m6236 = m6076().m6236();
        int i4 = f436 + 109;
        f431 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6236;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m6134() {
        int i = 2 % 2;
        int i2 = f436 + 93;
        f431 = i2 % 128;
        int i3 = i2 % 2;
        int m6234 = m6076().m6234();
        int i4 = f436 + 57;
        f431 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6234;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m6131() {
        int i = 2 % 2;
        int i2 = f431 + 29;
        f436 = i2 % 128;
        int i3 = i2 % 2;
        boolean optBoolean = m6075().optBoolean(m6128("\uf1b6⛀狩楎", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4).intern(), true);
        int i4 = f431 + 53;
        f436 = i4 % 128;
        int i5 = i4 % 2;
        return optBoolean;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m6129() {
        int i = 2 % 2;
        int i2 = f436 + 115;
        f431 = i2 % 128;
        return i2 % 2 == 0 ? m6075().optBoolean(m6128("\uf1b6⛀솎\uf4e7", 4 >>> View.combineMeasuredStates(1, 0)).intern(), false) : m6075().optBoolean(m6128("\uf1b6⛀솎\uf4e7", View.combineMeasuredStates(0, 0) + 4).intern(), true);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6128(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f434)) ^ ((c2 >>> 5) + f432)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f433) ^ ((c3 + i2) ^ ((c3 << 4) + f435))));
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
