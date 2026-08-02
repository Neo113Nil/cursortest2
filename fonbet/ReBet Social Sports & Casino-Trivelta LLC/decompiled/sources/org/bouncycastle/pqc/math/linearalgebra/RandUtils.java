package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class RandUtils {
    public static int nextInt(SecureRandom secureRandom, int i10) {
        int nextInt;
        int i11;
        if (((-i10) & i10) == i10) {
            return (int) ((i10 * (secureRandom.nextInt() >>> 1)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() >>> 1;
            i11 = nextInt % i10;
        } while ((nextInt - i11) + (i10 - 1) < 0);
        return i11;
    }
}
