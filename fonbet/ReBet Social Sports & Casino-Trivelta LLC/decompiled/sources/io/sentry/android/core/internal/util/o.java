package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f51139a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.o f51140b;

    /* renamed from: d, reason: collision with root package name */
    public final int f51142d;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f51141c = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f51143e = new AtomicLong(0);

    public o(io.sentry.transport.o oVar, long j10, int i10) {
        this.f51140b = oVar;
        this.f51139a = j10;
        this.f51142d = i10 <= 0 ? 1 : i10;
    }

    public boolean a() {
        long a10 = this.f51140b.a();
        if (this.f51143e.get() == 0 || this.f51143e.get() + this.f51139a <= a10) {
            this.f51141c.set(0);
            this.f51143e.set(a10);
            return false;
        }
        if (this.f51141c.incrementAndGet() < this.f51142d) {
            return false;
        }
        this.f51141c.set(0);
        return true;
    }
}
