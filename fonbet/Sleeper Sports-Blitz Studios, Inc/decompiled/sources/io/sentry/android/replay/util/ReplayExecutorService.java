package io.sentry.android.replay.util;

import androidx.exifinterface.media.ExifInterface;
import io.sentry.ILogger;
import io.sentry.MonitorConfig;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ReplayExecutorService.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u000e\u0010\b\u001a\n \f*\u0004\u0018\u00010\u000f0\u000fH\u0096\u0001JÝ\u0001\u0010\u0010\u001a^\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00120\u0012 \f*.\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00120\u0012\u0018\u00010\u00140\u0011\"\u0010\b\u0000\u0010\u0013*\n \f*\u0004\u0018\u00010\u00150\u00152d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017 \f*.\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017\u0018\u00010\u00180\u0016H\u0096\u0001Jõ\u0001\u0010\u0010\u001a^\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00120\u0012 \f*.\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00120\u0012\u0018\u00010\u00140\u0011\"\u0010\b\u0000\u0010\u0013*\n \f*\u0004\u0018\u00010\u00150\u00152d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017 \f*.\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017\u0018\u00010\u00180\u00162\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u0019\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001J\u008e\u0001\u0010\u001a\u001a\n \f*\u0004\u0018\u0001H\u0013H\u0013\"\u0010\b\u0000\u0010\u0013*\n \f*\u0004\u0018\u00010\u00150\u00152d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017 \f*.\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017\u0018\u00010\u00180\u0016H\u0096\u0001¢\u0006\u0002\u0010\u001bJ¦\u0001\u0010\u001a\u001a\n \f*\u0004\u0018\u0001H\u0013H\u0013\"\u0010\b\u0000\u0010\u0013*\n \f*\u0004\u0018\u00010\u00150\u00152d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017 \f*.\u0012(\u0012&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017\u0018\u00010\u00180\u00162\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u0019\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001¢\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u0007H\u0096\u0001J\t\u0010\u001e\u001a\u00020\u0007H\u0096\u0001JA\u0010\u001f\u001a\u0012\u0012\u0002\b\u0003 \f*\b\u0012\u0002\b\u0003\u0018\u00010 0 2\u000e\u0010\b\u001a\n \f*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u0019\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001J\u0083\u0001\u0010\u001f\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u0001H!H! \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H!H!\u0018\u00010 0 \"\u0010\b\u0000\u0010!*\n \f*\u0004\u0018\u00010\u00150\u00152*\u0010\b\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u0001H!H! \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H!H!\u0018\u00010\u00170\u00172\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u0019\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001JI\u0010\"\u001a\u0012\u0012\u0002\b\u0003 \f*\b\u0012\u0002\b\u0003\u0018\u00010 0 2\u000e\u0010\b\u001a\n \f*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u000e\u0010#\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001JI\u0010$\u001a\u0012\u0012\u0002\b\u0003 \f*\b\u0012\u0002\b\u0003\u0018\u00010 0 2\u000e\u0010\b\u001a\n \f*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u000e\u0010#\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001J\b\u0010%\u001a\u00020\u000eH\u0016J-\u0010&\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000f0\u000f \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00140\u0011H\u0096\u0001J\u0016\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010(\u001a\u00020\u000fH\u0016Jd\u0010'\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00120\u0012\"\u0010\b\u0000\u0010\u0013*\n \f*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\b\u001a\n \f*\u0004\u0018\u00010\u000f0\u000f2\u000e\u0010\n\u001a\n \f*\u0004\u0018\u0001H\u0013H\u0013H\u0096\u0001¢\u0006\u0002\u0010)Jk\u0010'\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00120\u0012\"\u0010\b\u0000\u0010\u0013*\n \f*\u0004\u0018\u00010\u00150\u00152*\u0010\b\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u0001H\u0013H\u0013\u0018\u00010\u00170\u0017H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lio/sentry/android/replay/util/ReplayExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "delegate", "options", "Lio/sentry/SentryOptions;", "(Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/SentryOptions;)V", "awaitTermination", "", "p0", "", "p1", "Ljava/util/concurrent/TimeUnit;", "kotlin.jvm.PlatformType", "execute", "", "Ljava/lang/Runnable;", "invokeAll", "", "Ljava/util/concurrent/Future;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "", "Ljava/util/concurrent/Callable;", "", "p2", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isShutdown", "isTerminated", MonitorConfig.JsonKeys.SCHEDULE, "Ljava/util/concurrent/ScheduledFuture;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "scheduleAtFixedRate", "p3", "scheduleWithFixedDelay", "shutdown", "shutdownNow", "submit", "task", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ReplayExecutorService implements ScheduledExecutorService, AutoCloseable {
    public static final int $stable = 8;
    private final ScheduledExecutorService delegate;
    private final SentryOptions options;

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long p0, TimeUnit p1) {
        return this.delegate.awaitTermination(p0, p1);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        UByte$$ExternalSyntheticBackport0.m((ExecutorService) this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable p0) {
        this.delegate.execute(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p0) {
        return this.delegate.invokeAll(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p0, long p1, TimeUnit p2) {
        return this.delegate.invokeAll(p0, p1, p2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p0) {
        return (T) this.delegate.invokeAny(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p0, long p1, TimeUnit p2) {
        return (T) this.delegate.invokeAny(p0, p1, p2);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable p0, long p1, TimeUnit p2) {
        return this.delegate.schedule(p0, p1, p2);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> p0, long p1, TimeUnit p2) {
        return this.delegate.schedule(p0, p1, p2);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable p0, long p1, long p2, TimeUnit p3) {
        return this.delegate.scheduleAtFixedRate(p0, p1, p2, p3);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable p0, long p1, long p2, TimeUnit p3) {
        return this.delegate.scheduleWithFixedDelay(p0, p1, p2, p3);
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.delegate.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable p0, T p1) {
        return this.delegate.submit(p0, p1);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> p0) {
        return this.delegate.submit(p0);
    }

    public ReplayExecutorService(ScheduledExecutorService delegate, SentryOptions options) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(options, "options");
        this.delegate = delegate;
        this.options = options;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt.startsWith$default(name, "SentryReplayIntegration", false, 2, (Object) null)) {
            task.run();
            return null;
        }
        try {
            return this.delegate.submit(new Runnable() { // from class: io.sentry.android.replay.util.ReplayExecutorService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ReplayExecutorService.submit$lambda$0(task, this);
                }
            });
        } catch (Throwable th) {
            ILogger logger = this.options.getLogger();
            SentryLevel sentryLevel = SentryLevel.ERROR;
            StringBuilder sb = new StringBuilder("Failed to submit task ");
            sb.append(task instanceof ReplayRunnable ? ((ReplayRunnable) task).getTaskName() : "");
            sb.append(" to executor");
            logger.log(sentryLevel, sb.toString(), th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submit$lambda$0(Runnable runnable, ReplayExecutorService replayExecutorService) {
        try {
            runnable.run();
        } catch (Throwable th) {
            ILogger logger = replayExecutorService.options.getLogger();
            SentryLevel sentryLevel = SentryLevel.ERROR;
            StringBuilder sb = new StringBuilder("Failed to execute task ");
            sb.append(runnable instanceof ReplayRunnable ? ((ReplayRunnable) runnable).getTaskName() : "");
            logger.log(sentryLevel, sb.toString(), th);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this) {
            if (!isShutdown()) {
                this.delegate.shutdown();
            }
            try {
                if (!awaitTermination(this.options.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    shutdownNow();
                }
            } catch (InterruptedException unused) {
                shutdownNow();
                Thread.currentThread().interrupt();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
