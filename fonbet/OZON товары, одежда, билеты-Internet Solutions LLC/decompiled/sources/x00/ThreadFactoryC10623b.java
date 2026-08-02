package x00;

import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

/* renamed from: x00.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class ThreadFactoryC10623b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "ComposerSingleThread");
        thread.getId();
        thread.setPriority(5);
        return thread;
    }
}
