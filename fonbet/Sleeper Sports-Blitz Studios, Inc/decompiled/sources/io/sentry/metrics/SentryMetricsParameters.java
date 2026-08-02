package io.sentry.metrics;

import io.sentry.Hint;
import io.sentry.SentryAttributes;
import io.sentry.SentryDate;
import io.sentry.SpanContext;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SentryMetricsParameters {
    private SentryAttributes attributes;
    private SentryDate timestamp;
    private String origin = SpanContext.DEFAULT_ORIGIN;
    private Hint hint = null;

    public SentryDate getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(SentryDate sentryDate) {
        this.timestamp = sentryDate;
    }

    public SentryAttributes getAttributes() {
        return this.attributes;
    }

    public void setAttributes(SentryAttributes sentryAttributes) {
        this.attributes = sentryAttributes;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public Hint getHint() {
        return this.hint;
    }

    public void setHint(Hint hint) {
        this.hint = hint;
    }

    public static SentryMetricsParameters create(SentryDate sentryDate, SentryAttributes sentryAttributes) {
        SentryMetricsParameters sentryMetricsParameters = new SentryMetricsParameters();
        sentryMetricsParameters.setTimestamp(sentryDate);
        sentryMetricsParameters.setAttributes(sentryAttributes);
        return sentryMetricsParameters;
    }

    public static SentryMetricsParameters create(SentryAttributes sentryAttributes) {
        return create(null, sentryAttributes);
    }

    public static SentryMetricsParameters create(Map<String, Object> map) {
        return create(null, SentryAttributes.fromMap(map));
    }
}
