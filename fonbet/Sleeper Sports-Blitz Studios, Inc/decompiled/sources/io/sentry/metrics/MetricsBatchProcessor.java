package io.sentry.metrics;

import io.sentry.DataCategory;
import io.sentry.ISentryClient;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryMetricsEvents;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.transport.ReusableCountLatch;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class MetricsBatchProcessor implements IMetricsBatchProcessor {
    public static final int FLUSH_AFTER_MS = 5000;
    public static final int MAX_BATCH_SIZE = 1000;
    public static final int MAX_QUEUE_SIZE = 10000;
    private final ISentryClient client;
    private final ISentryExecutorService executorService;
    protected final SentryOptions options;
    private volatile Future<?> scheduledFlush;
    private final AutoClosableReentrantLock scheduleLock = new AutoClosableReentrantLock();
    private volatile boolean hasScheduled = false;
    private volatile boolean isShuttingDown = false;
    private final ReusableCountLatch pendingCount = new ReusableCountLatch();
    private final Queue<SentryMetricsEvent> queue = new ConcurrentLinkedQueue();

    public MetricsBatchProcessor(SentryOptions sentryOptions, ISentryClient iSentryClient) {
        this.options = sentryOptions;
        this.client = iSentryClient;
        this.executorService = new SentryExecutorService(sentryOptions);
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void add(SentryMetricsEvent sentryMetricsEvent) {
        if (this.isShuttingDown) {
            return;
        }
        if (this.pendingCount.getCount() >= 10000) {
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.QUEUE_OVERFLOW, DataCategory.TraceMetric);
            return;
        }
        this.pendingCount.increment();
        this.queue.offer(sentryMetricsEvent);
        maybeSchedule(false, false);
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void close(boolean z) {
        this.isShuttingDown = true;
        if (z) {
            maybeSchedule(true, true);
            this.executorService.submit(new Runnable() { // from class: io.sentry.metrics.MetricsBatchProcessor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MetricsBatchProcessor.this.m13439lambda$close$0$iosentrymetricsMetricsBatchProcessor();
                }
            });
        } else {
            this.executorService.close(this.options.getShutdownTimeoutMillis());
            while (!this.queue.isEmpty()) {
                flushBatch();
            }
        }
    }

    /* renamed from: lambda$close$0$io-sentry-metrics-MetricsBatchProcessor, reason: not valid java name */
    /* synthetic */ void m13439lambda$close$0$iosentrymetricsMetricsBatchProcessor() {
        this.executorService.close(this.options.getShutdownTimeoutMillis());
    }

    private void maybeSchedule(boolean z, boolean z2) {
        if (!this.hasScheduled || z) {
            ISentryLifecycleToken acquire = this.scheduleLock.acquire();
            try {
                Future<?> future = this.scheduledFlush;
                if (z || future == null || future.isDone() || future.isCancelled()) {
                    this.hasScheduled = true;
                    try {
                        this.scheduledFlush = this.executorService.schedule(new BatchRunnable(), z2 ? 0 : 5000);
                    } catch (RejectedExecutionException e) {
                        this.hasScheduled = false;
                        this.options.getLogger().log(SentryLevel.WARNING, "Metrics batch processor flush task rejected", e);
                    }
                }
                if (acquire != null) {
                    acquire.close();
                }
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void flush(long j) {
        maybeSchedule(true, true);
        try {
            this.pendingCount.waitTillZero(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to flush metrics events", e);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush() {
        flushInternal();
        ISentryLifecycleToken acquire = this.scheduleLock.acquire();
        try {
            if (!this.queue.isEmpty()) {
                maybeSchedule(true, false);
            } else {
                this.hasScheduled = false;
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void flushInternal() {
        do {
            flushBatch();
        } while (this.queue.size() >= 1000);
    }

    private void flushBatch() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            SentryMetricsEvent poll = this.queue.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
            if (this.queue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        this.client.captureBatchedMetricsEvents(new SentryMetricsEvents(arrayList));
        for (int i = 0; i < arrayList.size(); i++) {
            this.pendingCount.decrement();
        }
    }

    private class BatchRunnable implements Runnable {
        private BatchRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsBatchProcessor.this.flush();
        }
    }
}
