package io.sentry;

import io.sentry.protocol.SentryTransaction;

/* loaded from: classes9.dex */
public interface EventProcessor {
    default Long getOrder() {
        return null;
    }

    default SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        return sentryEvent;
    }

    default SentryLogEvent process(SentryLogEvent sentryLogEvent) {
        return sentryLogEvent;
    }

    default SentryMetricsEvent process(SentryMetricsEvent sentryMetricsEvent, Hint hint) {
        return sentryMetricsEvent;
    }

    default SentryReplayEvent process(SentryReplayEvent sentryReplayEvent, Hint hint) {
        return sentryReplayEvent;
    }

    default SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return sentryTransaction;
    }
}
