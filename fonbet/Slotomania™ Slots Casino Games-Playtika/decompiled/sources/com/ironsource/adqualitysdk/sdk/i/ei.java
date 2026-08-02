package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class ei extends ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1965 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1966 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1967 = 96;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final String f1968;

    public ei(String str) {
        this.f1968 = eb.m7685(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        int i = 2 % 2;
        ea eaVar = new ea(clVar.m7206().m6383(kn.m8473(this.f1968, m7725(6 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, Color.red(0) + PsExtractor.AUDIO_STREAM, "\u0013ￎ\u0003\f\u0001\u0013", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())));
        int i2 = f1965 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1966 = i2 % 128;
        int i3 = i2 % 2;
        return eaVar;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f1965;
        int i3 = i2 + 85;
        f1966 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f1968;
        int i5 = i2 + 71;
        f1966 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return r0.equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.ei.f1966 + 5;
        com.ironsource.adqualitysdk.sdk.i.ei.f1965 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r6 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        r2 = r2 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        com.ironsource.adqualitysdk.sdk.i.ei.f1965 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (getClass() == r6.getClass()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r0 = r5.f1968;
        r6 = ((com.ironsource.adqualitysdk.sdk.i.ei) r6).f1968;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f1965 + 59;
        int i3 = i2 % 128;
        f1966 = i3;
        if (i2 % 2 != 0) {
            int i4 = 15 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1965 + 23;
        f1966 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f1968;
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        int i4 = f1966 + 111;
        f1965 = i4 % 128;
        if (i4 % 2 != 0) {
            return hashCode;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7725(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f1967);
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
