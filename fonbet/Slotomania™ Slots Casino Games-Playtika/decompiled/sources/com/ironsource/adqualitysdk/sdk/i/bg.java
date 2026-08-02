package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.be;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bg extends be {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f803 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f804 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f806 = {6701, 17735, 42219, 1033, 26528, 50888, 9834};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f805 = -8131907541057118367L;

    public bg(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final String mo6357() {
        int i = 2 % 2;
        int i2 = f804 + 115;
        f803 = i2 % 128;
        return (i2 % 2 != 0 ? m6388((char) (20020 << (ViewConfiguration.getMaximumFlingVelocity() % 113)), 0 % (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)), 27 >>> (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1))) : m6388((char) (6760 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final Class mo6356(String str) {
        int i = 2 % 2;
        int i2 = f804;
        int i3 = i2 + 69;
        f803 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 41;
        f803 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final Map<String, be.c> mo6358() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        int i2 = f803 + 53;
        f804 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻏ */
    public final boolean mo6370() {
        int i = 2 % 2;
        int i2 = f804 + 67;
        f803 = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﺙ */
    public final boolean mo6378() {
        int i = 2 % 2;
        int i2 = f804 + 107;
        int i3 = i2 % 128;
        f803 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        f804 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m6388(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f806[c.f1198 + i] ^ (c.f1198 * f805)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
