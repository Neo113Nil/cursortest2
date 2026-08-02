package k5;

import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class Q2 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            runnable.run();
        } catch (NullPointerException unused) {
        }
    }
}
