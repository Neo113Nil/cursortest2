package io.sentry.android.core;

import io.sentry.ISentryClient;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AppState;
import io.sentry.metrics.MetricsBatchProcessor;

/* loaded from: classes9.dex */
public final class AndroidMetricsBatchProcessor extends MetricsBatchProcessor implements AppState.AppStateListener {
    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
    }

    public AndroidMetricsBatchProcessor(SentryOptions sentryOptions, ISentryClient iSentryClient) {
        super(sentryOptions, iSentryClient);
        AppState.getInstance().addAppStateListener(this);
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.AndroidMetricsBatchProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    AndroidMetricsBatchProcessor.this.flush(5000L);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.metrics.MetricsBatchProcessor, io.sentry.metrics.IMetricsBatchProcessor
    public void close(boolean z) {
        AppState.getInstance().removeAppStateListener(this);
        super.close(z);
    }
}
