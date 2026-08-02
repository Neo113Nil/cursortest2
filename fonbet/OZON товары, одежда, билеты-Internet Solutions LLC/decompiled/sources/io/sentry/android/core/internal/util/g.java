package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final long f67200a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f67201b;

    /* renamed from: d, reason: collision with root package name */
    private final int f67203d;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f67202c = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicLong f67204e = new AtomicLong(0);

    public g(@NotNull b bVar, long j11, int i11) {
        this.f67201b = bVar;
        this.f67200a = j11;
        this.f67203d = i11 <= 0 ? 1 : i11;
    }

    public final boolean a() {
        this.f67201b.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.f67204e;
        long j11 = atomicLong.get();
        AtomicInteger atomicInteger = this.f67202c;
        if (j11 == 0 || atomicLong.get() + this.f67200a <= uptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(uptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.f67203d) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }
}
