package io.sentry.metrics;

import com.braze.Constants;

/* loaded from: classes7.dex */
public enum MetricType {
    Counter("c"),
    Gauge("g"),
    Distribution(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE),
    Set(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);

    final String statsdCode;

    MetricType(String str) {
        this.statsdCode = str;
    }
}
