package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.i.bc;

/* loaded from: classes6.dex */
public final class gh extends gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2189 = 152;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2190 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2191;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int maximumDrawingCacheSize;
        int lastIndexOf;
        int size;
        int i = 2 % 2;
        int i2 = f2190 + 109;
        f2191 = i2 % 128;
        if (i2 % 2 != 0) {
            maximumDrawingCacheSize = 44 << (ViewConfiguration.getMaximumDrawingCacheSize() % 25);
            lastIndexOf = 12834 >> TextUtils.lastIndexOf("", 'o', 1);
            size = 28 << View.MeasureSpec.getSize(1);
        } else {
            maximumDrawingCacheSize = 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            lastIndexOf = 246 - TextUtils.lastIndexOf("", '0', 0);
            size = View.MeasureSpec.getSize(0) + 10;
        }
        return m7802(maximumDrawingCacheSize, false, lastIndexOf, "ￏ￮\u0010\u0003\n\r\u0006￢\u0005\u0014\u0004\u0010\u000eￏ\b\u0010\u0010\b\r\u0006ￏ\u0002\u000f\u0005\u0013\u0010\n\u0005ￏ\b\u000e\u0014ￏ\u0002\u0005\u0014", size).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2190;
        int i3 = i2 + 73;
        f2191 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        f2191 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        if (!m7801()) {
            bc bcVar = new bc(mo7797());
            int i2 = f2190 + 73;
            f2191 = i2 % 128;
            int i3 = i2 % 2;
            return bcVar;
        }
        bc.e eVar = new bc.e(mo7797());
        int i4 = f2191 + 103;
        f2190 = i4 % 128;
        if (i4 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static boolean m7801() {
        int i = 2 % 2;
        int i2 = f2191 + 93;
        f2190 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                if (!Prode.m5772()) {
                    Class.forName(m7802(38 - KeyEvent.normalizeMetaState(0), true, Color.argb(0, 0, 0, 0) + 249, "\u000b\u0006\u000e\u000e\u0006ￍ\f\u000e\u0002\u000e\u0005\r￨\r\u000e\b\u0012\u0011\u0004\ufff5ￍ\u0012\u0003\u0000ￍ\u0012\f\u0006ￍ\u0003\b\u000e\u0011\u0003\r\u0000ￍ\u0004", 9 - TextUtils.getCapsMode("", 0, 0)).intern());
                    return true;
                }
                int i3 = f2190;
                int i4 = i3 + 19;
                f2191 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 97;
                f2191 = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                super.hashCode();
                throw null;
            }
            Prode.m5772();
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2190 + 61;
        f2191 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7802((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, true, Color.rgb(0, 0, 0) + 16777471, "\ufffb\b\u0006�\ufffa", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5).intern();
        int i4 = f2191 + 87;
        f2190 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7802(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f2189);
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
