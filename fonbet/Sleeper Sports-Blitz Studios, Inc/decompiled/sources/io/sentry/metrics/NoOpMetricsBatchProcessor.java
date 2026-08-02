package io.sentry.metrics;

import io.sentry.SentryMetricsEvent;

/* loaded from: classes9.dex */
public final class NoOpMetricsBatchProcessor implements IMetricsBatchProcessor {
    private static final NoOpMetricsBatchProcessor instance = new NoOpMetricsBatchProcessor();

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void add(SentryMetricsEvent sentryMetricsEvent) {
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void close(boolean z) {
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void flush(long j) {
    }

    private NoOpMetricsBatchProcessor() {
    }

    public static NoOpMetricsBatchProcessor getInstance() {
        return instance;
    }
}
