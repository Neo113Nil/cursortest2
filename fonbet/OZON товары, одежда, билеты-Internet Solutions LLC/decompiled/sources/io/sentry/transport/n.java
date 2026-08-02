package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f68547a = new a();

    private static final class a extends AbstractQueuedSynchronizer {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f68548a = 0;

        a() {
            setState(0);
        }

        static int a(a aVar) {
            return aVar.getState();
        }

        static void b(a aVar) {
            int state;
            do {
                state = aVar.getState();
            } while (!aVar.compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final int tryAcquireShared(int i11) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final boolean tryReleaseShared(int i11) {
            int state;
            int i12;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i12 = state - 1;
            } while (!compareAndSetState(state, i12));
            return i12 == 0;
        }
    }

    public final void a() {
        int i11 = a.f68548a;
        this.f68547a.releaseShared(1);
    }

    public final int b() {
        return a.a(this.f68547a);
    }

    public final void c() {
        a.b(this.f68547a);
    }

    public final void d(long j11) throws InterruptedException {
        this.f68547a.tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j11));
    }
}
