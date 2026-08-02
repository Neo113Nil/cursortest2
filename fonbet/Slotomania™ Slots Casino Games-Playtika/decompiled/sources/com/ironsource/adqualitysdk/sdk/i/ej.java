package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class ej extends ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1969 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1970 = 119;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1971;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final eq f1972;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final ef f1973;

    public ej(eq eqVar, ef efVar) {
        this.f1972 = eqVar;
        this.f1973 = efVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        int i2 = f1969 + 25;
        f1971 = i2 % 128;
        if (i2 % 2 != 0) {
            ea m7721 = this.f1973.m7721(eeVar, clVar);
            eeVar.m7713(this.f1972.m7746(), m7721.m7684());
            int i3 = 57 / 0;
            return m7721;
        }
        ea m77212 = this.f1973.m7721(eeVar, clVar);
        eeVar.m7713(this.f1972.m7746(), m77212.m7684());
        return m77212;
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(this.f1972).append(m7726(3 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, 160 - Gravity.getAbsoluteGravity(0, 0), "\u0014\ufff7\ufff7", TextUtils.getOffsetBefore("", 0) + 2).intern()).append(this.f1973).toString();
        int i2 = f1969 + 85;
        f1971 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r3.equals(r7.f1972) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r3 = r6.f1973;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ej.f1969 + 47;
        com.ironsource.adqualitysdk.sdk.i.ej.f1971 = r1 % 128;
        r1 = r1 % 2;
        r7 = r7.f1973;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r1 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        return r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r7.f1973 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ej.f1971 + 91;
        com.ironsource.adqualitysdk.sdk.i.ej.f1969 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if ((r7 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002f, code lost:
    
        if (r7.f1972 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ej ejVar = (ej) obj;
            eq eqVar = this.f1972;
            if (eqVar != null) {
                int i2 = f1971 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f1969 = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = f1971 + 107;
        int i4 = i3 % 128;
        f1969 = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        eq eqVar = this.f1972;
        int i5 = 0;
        if (eqVar != null) {
            i = eqVar.hashCode();
        } else {
            int i6 = i4 + 61;
            f1971 = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        int i8 = i * 31;
        ef efVar = this.f1973;
        if (efVar != null) {
            i5 = efVar.hashCode();
            int i9 = f1971 + 49;
            f1969 = i9 % 128;
            int i10 = i9 % 2;
        }
        return i8 + i5;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final eq m7727() {
        int i = 2 % 2;
        int i2 = f1969 + 11;
        f1971 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1972;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7726(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f1970);
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
