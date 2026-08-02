package com.google.common.primitives;

import Ra.n;

/* loaded from: classes3.dex */
public abstract class j {
    public static int a(long j10) {
        n.g((j10 >> 32) == 0, "out of range: %s", j10);
        return (int) j10;
    }
}
