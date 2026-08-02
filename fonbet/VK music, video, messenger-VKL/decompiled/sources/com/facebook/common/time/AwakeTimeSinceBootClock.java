package com.facebook.common.time;

import xsna.j830;
import xsna.zsn;

@zsn
/* loaded from: classes12.dex */
public class AwakeTimeSinceBootClock implements j830 {

    @zsn
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @zsn
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // xsna.j830, xsna.e830
    @zsn
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // xsna.j830, xsna.e830
    @zsn
    public long nowNanos() {
        return System.nanoTime();
    }
}
