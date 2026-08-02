package io.sentry.android.core;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import io.sentry.logger.ILoggerBatchProcessor;
import io.sentry.logger.ILoggerBatchProcessorFactory;

/* loaded from: classes9.dex */
public final class AndroidLoggerBatchProcessorFactory implements ILoggerBatchProcessorFactory {
    @Override // io.sentry.logger.ILoggerBatchProcessorFactory
    public ILoggerBatchProcessor create(SentryOptions sentryOptions, SentryClient sentryClient) {
        return new AndroidLoggerBatchProcessor(sentryOptions, sentryClient);
    }
}
