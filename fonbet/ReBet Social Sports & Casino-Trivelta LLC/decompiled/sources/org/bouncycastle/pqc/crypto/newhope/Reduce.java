package org.bouncycastle.pqc.crypto.newhope;

import kotlin.UShort;

/* loaded from: classes5.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    public static short barrett(short s10) {
        int i10 = s10 & UShort.MAX_VALUE;
        return (short) (i10 - (((i10 * 5) >>> 16) * 12289));
    }

    public static short montgomery(int i10) {
        return (short) (((((i10 * QInv) & RMask) * 12289) + i10) >>> 18);
    }
}
