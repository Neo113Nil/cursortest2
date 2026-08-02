package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
public final class Token extends TokenBase {
    @CalledByNative
    public Token(long j11, long j12) {
        super(j11, j12);
    }

    public final String toString() {
        return String.format("%016X%016X", Long.valueOf(this.f78521a), Long.valueOf(this.f78522b));
    }
}
