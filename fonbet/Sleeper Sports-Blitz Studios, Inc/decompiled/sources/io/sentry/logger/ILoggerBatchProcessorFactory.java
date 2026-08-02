package io.sentry.logger;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;

/* loaded from: classes9.dex */
public interface ILoggerBatchProcessorFactory {
    ILoggerBatchProcessor create(SentryOptions sentryOptions, SentryClient sentryClient);
}
