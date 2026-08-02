package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/appsflyer/internal/AFc1jSDK;", "Ljava/util/concurrent/ThreadPoolExecutor;", "", "p0", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "p4", "Ljava/util/Queue;", "p5", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/Queue;)V", "", "d", "()V", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "AFKeystoreWrapper", "Ljava/util/Queue;", "unregisterClient"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFc1jSDK extends ThreadPoolExecutor implements AutoCloseable {

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    private final Queue<Runnable> unregisterClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFc1jSDK(int i, int i2, long j, @NotNull TimeUnit timeUnit, @NotNull BlockingQueue<Runnable> blockingQueue, @NotNull final Queue<Runnable> queue) {
        super(i, i2, j, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.l
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFc1jSDK.d(queue, runnable, threadPoolExecutor);
            }
        });
        timeUnit.getClass();
        blockingQueue.getClass();
        queue.getClass();
        this.unregisterClient = queue;
    }

    private final void d() {
        synchronized (this) {
            try {
                int size = this.unregisterClient.size();
                for (int i = 0; i < size; i++) {
                    Runnable poll = this.unregisterClient.poll();
                    if (poll == null) {
                        break;
                    }
                    execute(poll);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(@NotNull Runnable p0, @Nullable Throwable p1) {
        p0.getClass();
        super.afterExecute(p0, p1);
        p0.getClass();
        if (p1 == null) {
            try {
                d();
                return;
            } catch (Throwable th) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.AF_EXECUTOR, "Error while executing rejected tasks", th, true, true, true, false, 64, null);
                return;
            }
        }
        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.AF_EXECUTOR, "Error while executing task: " + p0, p1, true, true, true, false, 64, null);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public /* synthetic */ AFc1jSDK(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, timeUnit, blockingQueue, (i3 & 32) != 0 ? new ConcurrentLinkedQueue() : queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        runnable.getClass();
        threadPoolExecutor.getClass();
        queue.add(runnable);
    }
}
