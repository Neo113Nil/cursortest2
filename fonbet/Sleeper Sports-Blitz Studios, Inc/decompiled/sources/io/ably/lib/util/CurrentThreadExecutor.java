package io.ably.lib.util;

import io.ably.lib.http.CloseableExecutor;

/* loaded from: classes9.dex */
public class CurrentThreadExecutor implements CloseableExecutor {
    public static CurrentThreadExecutor INSTANCE = new CurrentThreadExecutor();

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
