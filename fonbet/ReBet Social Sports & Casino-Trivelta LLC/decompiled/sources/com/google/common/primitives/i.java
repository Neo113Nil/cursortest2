package com.google.common.primitives;

import Ra.n;
import kotlin.UByte;

/* loaded from: classes3.dex */
public abstract class i {
    public static byte a(long j10) {
        n.g((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int b(byte b10) {
        return b10 & UByte.MAX_VALUE;
    }
}
