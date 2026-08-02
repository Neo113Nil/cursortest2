package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.my.target.common.MyTargetManager;
import io.ktor.util.date.GMTDateParser;

/* loaded from: classes6.dex */
public final class gz extends gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2283 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2285 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2284 = {'c', 3427, 6773, 9994, 13405, 16709, 20070, 23328, 26625, 29982, 33311, 36833, 40164, 43442, 46795, 50139, 53421, 56737, 60087, 63370, 1246, 4529, 8049, 11328, 14657, 18014, 21343, 24609, 27940, 31249, 34569, 37914, 41441, 44779, 48125, 51414, GMTDateParser.MINUTES, 3445, 6764, 10053, 13378, 16731, 20013, 23328};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2282 = 4068735238103108876L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        char c;
        int offsetAfter;
        int trimmedLength;
        int i = 2 % 2;
        int i2 = f2283 + 99;
        f2285 = i2 % 128;
        int i3 = i2 % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        if (i3 == 0) {
            c = (char) ((-1) >> (globalActionKeyTimeout > 1L ? 1 : (globalActionKeyTimeout == 1L ? 0 : -1)));
            offsetAfter = TextUtils.getOffsetAfter("", 0);
            trimmedLength = 87 / TextUtils.getTrimmedLength("");
        } else {
            c = (char) ((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) - 1);
            offsetAfter = TextUtils.getOffsetAfter("", 0);
            trimmedLength = 36 - TextUtils.getTrimmedLength("");
        }
        return m7823(c, offsetAfter, trimmedLength).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2285 + 71;
        f2283 = i2 % 128;
        if (i2 % 2 == 0) {
            return MyTargetManager.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bx bxVar = new bx(mo7797());
        int i2 = f2283 + 51;
        f2285 = i2 % 128;
        if (i2 % 2 != 0) {
            return bxVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2283 + 59;
        f2285 = i2 % 128;
        return (i2 % 2 == 0 ? m7823((char) (1 >> TextUtils.indexOf((CharSequence) "", '5')), 55 >>> (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 106 / (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))) : m7823((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7823(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f2284[c.f1198 + i] ^ (c.f1198 * f2282)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
