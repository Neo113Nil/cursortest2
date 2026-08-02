package io.sentry;

import java.util.Locale;

/* loaded from: classes9.dex */
public enum SentryAttributeType {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
