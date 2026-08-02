package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public abstract class gb {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2165 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2166 = 14;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2167 = 1;

    /* renamed from: ﾒ */
    public abstract ea mo7776(ee eeVar, cl clVar);

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ea m7788(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f2167 + 89;
        f2165 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                eeVar.m7708(this);
                ea mo7776 = mo7776(eeVar, clVar);
                eeVar.m7715(this);
                int i3 = f2165 + 95;
                f2167 = i3 % 128;
                int i4 = i3 % 2;
                return mo7776;
            }
            eeVar.m7708(this);
            mo7776(eeVar, clVar);
            eeVar.m7715(this);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (dn e) {
            throw e;
        } catch (Throwable th) {
            throw new dr(clVar, eeVar, m7787(18 - (ViewConfiguration.getTouchSlop() >> 8), false, 116 - ((Process.getThreadPriority(0) + 20) >> 6), "\u000e\u0003\t\b\uffef\b�\ufffb\u000f\u0001\u0002\u000eﾺ\uffff\u0012�\uffff\n", 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th);
        }
    }

    /* renamed from: ﻛ */
    public int mo7775(ee eeVar) {
        int i = 2 % 2;
        int i2 = f2167;
        int i3 = i2 + 61;
        f2165 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2165 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return 1;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7787(int i, boolean z, int i2, String str, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (d.f1644) {
            char[] cArr3 = new char[i];
            d.f1641 = 0;
            while (d.f1641 < i) {
                d.f1643 = cArr2[d.f1641];
                cArr3[d.f1641] = (char) (d.f1643 + i2);
                int i4 = d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f2166);
                d.f1641++;
            }
            if (i3 > 0) {
                d.f1642 = i3;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
            }
            if (z) {
                char[] cArr5 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                    d.f1641++;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
