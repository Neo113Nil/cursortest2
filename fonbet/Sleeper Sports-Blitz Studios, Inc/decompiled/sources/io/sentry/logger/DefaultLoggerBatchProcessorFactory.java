package io.sentry.logger;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;

/* loaded from: classes9.dex */
public final class DefaultLoggerBatchProcessorFactory implements ILoggerBatchProcessorFactory {
    @Override // io.sentry.logger.ILoggerBatchProcessorFactory
    public ILoggerBatchProcessor create(SentryOptions sentryOptions, SentryClient sentryClient) {
        return new LoggerBatchProcessor(sentryOptions, sentryClient);
    }
}
