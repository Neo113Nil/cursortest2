package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import xsna.e830;
import xsna.zsn;

@zsn
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements e830 {
    public static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @zsn
    public static RealtimeSinceBootClock get() {
        return a;
    }

    @Override // xsna.e830
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // xsna.e830
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
