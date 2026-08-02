package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes9.dex */
final class p {
    static void a(a aVar, long j11) {
        LockSupport.parkNanos(aVar, Math.min(j11, 2147483647999999999L));
    }
}
