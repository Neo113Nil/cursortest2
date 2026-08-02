package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f15717a;

    /* renamed from: d, reason: collision with root package name */
    public final int f15720d;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f15719c = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f15721e = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    public final d f15718b = d.f15711a;

    public g(long j, int i5) {
        this.f15717a = j;
        this.f15720d = i5 <= 0 ? 1 : i5;
    }

    public final boolean a() {
        this.f15718b.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.f15721e;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.f15719c;
        if (j == 0 || atomicLong.get() + this.f15717a <= uptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(uptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.f15720d) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }
}
