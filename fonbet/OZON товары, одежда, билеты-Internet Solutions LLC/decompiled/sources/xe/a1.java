package xe;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a1 {
    @NotNull
    public static final C10745r0 a(final int i11, @NotNull final String str) {
        if (i11 < 1) {
            throw new IllegalArgumentException(T7.E.a(i11, "Expected at least one thread, but ", " specified").toString());
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        return new C10745r0(Executors.newScheduledThreadPool(i11, new ThreadFactory() { // from class: xe.b1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i12 = i11;
                String str2 = str;
                if (i12 != 1) {
                    str2 = str2 + '-' + atomicInteger.incrementAndGet();
                }
                Thread thread = new Thread(runnable, str2);
                thread.setDaemon(true);
                return thread;
            }
        }));
    }
}
