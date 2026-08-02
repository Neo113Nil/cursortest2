package com.facebook.common.time;

import D6.d;
import K6.b;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

@d
/* loaded from: classes2.dex */
public class RealtimeSinceBootClock implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final RealtimeSinceBootClock f30355a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f30355a;
    }

    @Override // K6.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // K6.b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
