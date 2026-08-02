package com.appsflyer.internal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFk1sSDK {
    public static long[] getCurrencyIso4217Code(int i5, int i10) {
        long[] jArr = new long[4];
        jArr[0] = (i10 & 4294967295L) | ((i5 & 4294967295L) << 32);
        for (int i11 = 1; i11 < 4; i11++) {
            long j = jArr[i11 - 1];
            jArr[i11] = ((j ^ (j >> 30)) * 1812433253) + i11;
        }
        return jArr;
    }
}
