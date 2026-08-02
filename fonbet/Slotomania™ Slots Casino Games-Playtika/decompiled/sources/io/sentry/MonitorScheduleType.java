package io.sentry;

import java.util.Locale;

/* loaded from: classes8.dex */
public enum MonitorScheduleType {
    CRONTAB,
    INTERVAL;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
