package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final a f52711a;

    public static final class a extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 5970133580157457018L;

        public a(int i10) {
            setState(i10);
        }

        public final void d() {
            releaseShared(1);
        }

        public final int e() {
            return getState();
        }

        public final void f() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i10) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i10) {
            int state;
            int i11;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i11 = state - 1;
            } while (!compareAndSetState(state, i11));
            return i11 == 0;
        }
    }

    public A(int i10) {
        if (i10 >= 0) {
            this.f52711a = new a(i10);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i10 + "' is not allowed");
    }

    public void a() {
        this.f52711a.d();
    }

    public int b() {
        return this.f52711a.e();
    }

    public void c() {
        this.f52711a.f();
    }

    public boolean d(long j10, TimeUnit timeUnit) {
        return this.f52711a.tryAcquireSharedNanos(1, timeUnit.toNanos(j10));
    }

    public A() {
        this(0);
    }
}
