package com.google.common.primitives;

import Bl0.k0;

/* loaded from: classes.dex */
public final class e {
    public static byte a(long j11) {
        k0.c(j11, "out of range: %s", (j11 >> 8) == 0);
        return (byte) j11;
    }

    public static int b(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }
}
