package Ta;

import Ta.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class e extends j {

    public static abstract class a extends e implements a.h {
        @Override // Ta.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // Ta.a, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // Ta.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // Ta.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // Ta.a, Ta.o
        public final void l(Runnable runnable, Executor executor) {
            super.l(runnable, executor);
        }

        @Override // Ta.a, java.util.concurrent.Future
        public final Object get(long j10, TimeUnit timeUnit) {
            return super.get(j10, timeUnit);
        }
    }
}
