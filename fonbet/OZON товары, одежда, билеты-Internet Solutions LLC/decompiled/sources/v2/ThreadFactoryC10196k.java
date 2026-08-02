package v2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: v2.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class ThreadFactoryC10196k implements ThreadFactory {

    /* renamed from: v2.k$a */
    private static class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final int f101712a;

        a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.f101712a = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f101712a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
