package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFj1uSDK {
    static long[] valueOf(int i11, int i12) {
        long[] jArr = new long[4];
        jArr[0] = (i12 & 4294967295L) | ((i11 & 4294967295L) << 32);
        for (int i13 = 1; i13 < 4; i13++) {
            long j11 = jArr[i13 - 1];
            jArr[i13] = ((j11 ^ (j11 >> 30)) * 1812433253) + i13;
        }
        return jArr;
    }
}
