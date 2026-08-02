package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* loaded from: classes6.dex */
public final class gk extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2200 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2201 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2203 = {'c', 20046, 39983, 59981, 14573, 34519, 54441, 8841, 29051, 48966, 3391, 23321, 43503, 63432, 17888, 37774, 57972, 12352, 32295, 52242, 6904, 26844, 46754, 1166, 21355, 41309, 61233, 15701, 35823, 55769, 10165, 30161, 50281, 4659, 24589, 44781, 64759, 19114, 39059, 59253, 13643, 33580, 53547, 8175, 28157, 48056, 2447, 22627, 42585, 62501, 16907, 'a', 20037, 39987, 59920, 14572, 34500, 54452, 8834, 29036, 48988, 3390, 23298, 43488, 63454};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2202 = -1853987895417221599L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2200 + 103;
        f2201 = i2 % 128;
        String intern = (i2 % 2 == 0 ? m7805((char) (Process.myTid() - 15), 1 << (ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1)), 81 / (ViewConfiguration.getPressedStateDuration() + 22)) : m7805((char) (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (ViewConfiguration.getPressedStateDuration() >> 16) + 51)).intern();
        int i3 = f2201 + 31;
        f2200 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2201;
        int i3 = i2 + 49;
        f2200 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 89;
        f2200 = i4 % 128;
        if (i4 % 2 == 0) {
            return IronSourceAdQuality.class;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bd bdVar = new bd(mo7797());
        int i2 = f2200 + 91;
        f2201 = i2 % 128;
        int i3 = i2 % 2;
        return bdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2200 + 1;
        f2201 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7805((char) KeyEvent.keyCodeFromString(""), 51 - KeyEvent.getDeadChar(0, 0), KeyEvent.normalizeMetaState(0) + 14).intern();
        int i4 = f2200 + 47;
        f2201 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7805(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f2203[c.f1198 + i] ^ (c.f1198 * f2202)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
