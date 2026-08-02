package io.sentry.android.core.internal.tombstone;

import io.sentry.android.core.cache.AndroidEnvelopeCache;

/* loaded from: classes9.dex */
public enum NativeExceptionMechanism {
    TOMBSTONE(AndroidEnvelopeCache.LAST_TOMBSTONE_MARKER_LABEL),
    SIGNAL_HANDLER("signalhandler"),
    TOMBSTONE_MERGED("TombstoneMerged");

    private final String value;

    NativeExceptionMechanism(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
