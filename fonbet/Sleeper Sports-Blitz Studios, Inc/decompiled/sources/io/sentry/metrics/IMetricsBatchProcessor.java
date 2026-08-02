package io.sentry.metrics;

import io.sentry.SentryMetricsEvent;

/* loaded from: classes9.dex */
public interface IMetricsBatchProcessor {
    void add(SentryMetricsEvent sentryMetricsEvent);

    void close(boolean z);

    void flush(long j);
}
