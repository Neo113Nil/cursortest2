package io.sentry.metrics;

/* loaded from: classes9.dex */
public interface IMetricsApi {
    void count(String str);

    void count(String str, Double d);

    void count(String str, Double d, String str2);

    void count(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters);

    void count(String str, String str2);

    void distribution(String str, Double d);

    void distribution(String str, Double d, String str2);

    void distribution(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters);

    void gauge(String str, Double d);

    void gauge(String str, Double d, String str2);

    void gauge(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters);
}
