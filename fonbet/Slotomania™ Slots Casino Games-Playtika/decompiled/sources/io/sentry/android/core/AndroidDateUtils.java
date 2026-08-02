package io.sentry.android.core;

import io.sentry.SentryDate;
import io.sentry.SentryDateProvider;

/* loaded from: classes8.dex */
public final class AndroidDateUtils {
    private static final SentryDateProvider dateProvider = new SentryAndroidDateProvider();

    public static SentryDate getCurrentSentryDateTime() {
        return dateProvider.now();
    }
}
