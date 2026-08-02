package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class fg extends ey {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2070 = -4066686193613752618L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2071 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2072;

    public fg(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 57;
        com.ironsource.adqualitysdk.sdk.i.fg.f2072 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if ((r7 instanceof java.lang.Double) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if ((r6 instanceof java.lang.Long) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if ((r7 instanceof java.lang.Long) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r6 = java.lang.Integer.valueOf(r6.intValue() % r7.intValue());
        r7 = com.ironsource.adqualitysdk.sdk.i.fg.f2071 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        com.ironsource.adqualitysdk.sdk.i.fg.f2072 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if ((r7 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        return java.lang.Long.valueOf(r6.longValue() % r7.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x001a, code lost:
    
        if ((r6 instanceof java.lang.Double) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if ((r6 instanceof java.lang.Double) == false) goto L9;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Number mo7756(Number number, Number number2) {
        int i = 2 % 2;
        int i2 = f2071;
        int i3 = i2 + 27;
        f2072 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
        Double valueOf = Double.valueOf(number.doubleValue() % number2.doubleValue());
        int i5 = f2072 + 45;
        f2071 = i5 % 128;
        if (i5 % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final String mo7734() {
        int i = 2 % 2;
        int i2 = f2072 + 109;
        f2071 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7764("ᖅᖠ嘮ܖ້", ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)).intern();
        int i4 = f2072 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2071 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7764(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2070, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2070));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }
}
