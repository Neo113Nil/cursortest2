package io.sentry.android.core;

import io.sentry.ISentryClient;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AppState;
import io.sentry.logger.LoggerBatchProcessor;

/* loaded from: classes9.dex */
public final class AndroidLoggerBatchProcessor extends LoggerBatchProcessor implements AppState.AppStateListener {
    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
    }

    public AndroidLoggerBatchProcessor(SentryOptions sentryOptions, ISentryClient iSentryClient) {
        super(sentryOptions, iSentryClient);
        AppState.getInstance().addAppStateListener(this);
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.AndroidLoggerBatchProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    AndroidLoggerBatchProcessor.this.flush(5000L);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.logger.LoggerBatchProcessor, io.sentry.logger.ILoggerBatchProcessor
    public void close(boolean z) {
        AppState.getInstance().removeAppStateListener(this);
        super.close(z);
    }
}
