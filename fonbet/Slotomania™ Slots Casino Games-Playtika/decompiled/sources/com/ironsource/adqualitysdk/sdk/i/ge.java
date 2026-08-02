package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class ge extends gb {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2176 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2177 = {20, Typography.dollar, 'B', GMTDateParser.HOURS, 'j', GMTDateParser.HOURS, 'o', 140, 149};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2178;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final ef f2179;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final gb f2180;

    public ge(ef efVar, gb gbVar) {
        this.f2179 = efVar;
        this.f2180 = gbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:2:0x0003->B:16:?, LOOP_END, SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ea mo7776(ee eeVar, cl clVar) {
        ea m7788;
        int i = 2 % 2;
        while (!(!this.f2179.m7721(eeVar, clVar).m7682())) {
            int i2 = f2178 + 53;
            f2176 = i2 % 128;
            if (i2 % 2 == 0) {
                m7788 = this.f2180.m7788(eeVar, clVar);
                int i3 = 95 / 0;
                if (m7788.m7679()) {
                    break;
                }
                if (!m7788.m7683()) {
                    int i4 = f2176 + 23;
                    int i5 = i4 % 128;
                    f2178 = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 55;
                    f2176 = i7 % 128;
                    if (i7 % 2 != 0) {
                        return m7788;
                    }
                    throw null;
                }
            } else {
                m7788 = this.f2180.m7788(eeVar, clVar);
                if (m7788.m7679()) {
                    break;
                }
                if (!m7788.m7683()) {
                }
            }
        }
        return new ea(null);
    }

    public final String toString() {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7794("\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{0, 7, 0, 7}, true).intern()).append(this.f2179).append(m7794(null, new int[]{7, 2, 108, 2}, true).intern()).append(this.f2180).toString();
        int i2 = f2176 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f2178 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2176 + 85;
            f2178 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (obj != null) {
            int i3 = f2176 + 25;
            f2178 = i3 % 128;
            if (i3 % 2 != 0) {
                obj.getClass();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                ge geVar = (ge) obj;
                ef efVar = this.f2179;
                if (efVar == null ? geVar.f2179 != null : !efVar.equals(geVar.f2179)) {
                    int i4 = f2178 + 101;
                    f2176 = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                gb gbVar = this.f2180;
                gb gbVar2 = geVar.f2180;
                if (gbVar != null) {
                    return gbVar.equals(gbVar2);
                }
                if (gbVar2 != null) {
                    return false;
                }
                int i6 = f2176 + 41;
                f2178 = i6 % 128;
                return i6 % 2 == 0;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        r1 = r5.f2179.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r5.f2179 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r5.f2179 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int hashCode;
        int i = 2 % 2;
        int i2 = f2178 + 113;
        f2176 = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = hashCode * 31;
        gb gbVar = this.f2180;
        if (gbVar != null) {
            i3 = gbVar.hashCode();
            int i6 = f2178 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f2176 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 5;
            }
        }
        int i8 = i5 + i3;
        int i9 = f2178 + 5;
        f2176 = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7794(String str, int[] iArr, boolean z) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        synchronized (h.f2286) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f2177, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                h.f2287 = 0;
                char c = 0;
                while (h.f2287 < i2) {
                    if (bArr2[h.f2287] == 1) {
                        cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                    } else {
                        cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                    }
                    c = cArr2[h.f2287];
                    h.f2287++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                    h.f2287++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                    h.f2287++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
