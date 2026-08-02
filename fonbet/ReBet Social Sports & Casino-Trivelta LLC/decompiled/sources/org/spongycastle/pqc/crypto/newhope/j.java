package org.spongycastle.pqc.crypto.newhope;

import kotlin.UShort;

/* loaded from: classes5.dex */
public abstract class j {
    public static short a(short s10) {
        int i10 = s10 & UShort.MAX_VALUE;
        return (short) (i10 - (((i10 * 5) >>> 16) * 12289));
    }

    public static short b(int i10) {
        return (short) (((((i10 * 12287) & 262143) * 12289) + i10) >>> 18);
    }
}
