package com.facebook.common.time;

import D6.d;
import K6.c;

@d
/* loaded from: classes2.dex */
public class AwakeTimeSinceBootClock implements c {

    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // K6.c, K6.b
    @d
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // K6.c, K6.b
    @d
    public long nowNanos() {
        return System.nanoTime();
    }
}
