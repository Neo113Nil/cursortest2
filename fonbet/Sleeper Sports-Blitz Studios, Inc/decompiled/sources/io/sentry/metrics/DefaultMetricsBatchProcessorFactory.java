package io.sentry.metrics;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;

/* loaded from: classes9.dex */
public final class DefaultMetricsBatchProcessorFactory implements IMetricsBatchProcessorFactory {
    @Override // io.sentry.metrics.IMetricsBatchProcessorFactory
    public IMetricsBatchProcessor create(SentryOptions sentryOptions, SentryClient sentryClient) {
        return new MetricsBatchProcessor(sentryOptions, sentryClient);
    }
}
