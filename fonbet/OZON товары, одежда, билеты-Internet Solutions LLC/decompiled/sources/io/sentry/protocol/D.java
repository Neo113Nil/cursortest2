package io.sentry.protocol;

import java.util.Locale;

/* loaded from: classes10.dex */
public enum D {
    CUSTOM,
    URL,
    ROUTE,
    VIEW,
    COMPONENT,
    TASK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
