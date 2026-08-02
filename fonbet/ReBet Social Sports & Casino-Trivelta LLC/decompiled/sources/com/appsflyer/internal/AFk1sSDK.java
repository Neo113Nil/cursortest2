package com.appsflyer.internal;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AFk1sSDK {
    public static long[] getCurrencyIso4217Code(int i10, int i11) {
        long[] jArr = new long[4];
        jArr[0] = (i11 & BodyPartID.bodyIdMax) | ((i10 & BodyPartID.bodyIdMax) << 32);
        for (int i12 = 1; i12 < 4; i12++) {
            long j10 = jArr[i12 - 1];
            jArr[i12] = ((j10 ^ (j10 >> 30)) * 1812433253) + i12;
        }
        return jArr;
    }
}
