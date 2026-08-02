package com.google.common.base;

import j$.time.Duration;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class Internal {
    static long toNanosSaturated(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    private Internal() {
    }
}
