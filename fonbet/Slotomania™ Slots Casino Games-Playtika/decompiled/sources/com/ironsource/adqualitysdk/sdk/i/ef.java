package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public abstract class ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1949 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1950;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1952 = {12946, 39276, 26750};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1951 = 7287536451586993138L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract ea mo7722(ee eeVar, cl clVar);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return r1;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ea m7721(ee eeVar, cl clVar) {
        int i = 2 % 2;
        ef efVar = this;
        while (true) {
            ea mo7722 = efVar.mo7722(eeVar, clVar);
            if (mo7722 == null || !(mo7722.m7684() instanceof ef)) {
                break;
            }
            int i2 = f1950 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f1949 = i2 % 128;
            if (i2 % 2 != 0) {
                efVar = (ef) mo7722.m7684();
                int i3 = f1950 + 69;
                f1949 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static String m7720(Object[] objArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        boolean z = true;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f1949 + 71;
            f1950 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = objArr[i2];
                throw null;
            }
            Object obj2 = objArr[i2];
            if (!z) {
                sb.append(m7719((char) (((Process.getThreadPriority(0) + 20) >> 6) + 12990), ViewConfiguration.getMaximumFlingVelocity() >> 16, 1 - TextUtils.indexOf((CharSequence) "", '0')).intern());
            }
            if (obj2 instanceof String) {
                int i4 = f1949 + 31;
                f1950 = i4 % 128;
                int i5 = i4 % 2;
                sb.append(m7719((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 26716), Process.getGidForName("") + 3, (-16777215) - Color.rgb(0, 0, 0)).intern());
                sb.append(obj2);
                sb.append(m7719((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 26716), 2 - View.MeasureSpec.getSize(0), ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern());
                int i6 = f1949 + 75;
                f1950 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                sb.append(obj2);
            }
            i2++;
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m7719(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1952[c.f1198 + i] ^ (c.f1198 * f1951)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
