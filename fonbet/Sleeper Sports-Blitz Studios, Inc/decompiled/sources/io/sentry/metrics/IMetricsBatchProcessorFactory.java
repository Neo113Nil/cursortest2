package io.sentry.metrics;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;

/* loaded from: classes9.dex */
public interface IMetricsBatchProcessorFactory {
    IMetricsBatchProcessor create(SentryOptions sentryOptions, SentryClient sentryClient);
}
