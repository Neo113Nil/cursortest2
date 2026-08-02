package io.sentry.metrics;

/* loaded from: classes9.dex */
public final class NoOpMetricsApi implements IMetricsApi {
    private static final NoOpMetricsApi instance = new NoOpMetricsApi();

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d, String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d, String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d, String str2) {
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters) {
    }

    private NoOpMetricsApi() {
    }

    public static NoOpMetricsApi getInstance() {
        return instance;
    }
}
