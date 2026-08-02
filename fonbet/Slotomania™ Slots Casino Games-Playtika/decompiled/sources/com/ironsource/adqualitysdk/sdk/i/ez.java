package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class ez extends ef {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2037 = -6156424127764729233L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2038 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2039 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private eq f2040;

    public ez(eq eqVar) {
        this.f2040 = eqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2039 + 7;
        f2038 = i2 % 128;
        int i3 = i2 % 2;
        ea m7721 = this.f2040.m7721(eeVar, clVar);
        eeVar.m7713(this.f2040.m7746(), Integer.valueOf(m7721.m7680().intValue() + 1));
        int i4 = f2038 + 87;
        f2039 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return m7721;
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f2040.toString()).append(m7757("牄싵", 45234 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()).toString();
        int i2 = f2039 + 23;
        f2038 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7757(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2037);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
