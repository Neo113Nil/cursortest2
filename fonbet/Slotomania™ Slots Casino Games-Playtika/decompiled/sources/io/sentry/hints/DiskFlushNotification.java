package io.sentry.hints;

import io.sentry.protocol.SentryId;

/* loaded from: classes8.dex */
public interface DiskFlushNotification {
    boolean isFlushable(SentryId sentryId);

    void markFlushed();

    void setFlushable(SentryId sentryId);
}
