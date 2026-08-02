package io.sentry.android.core.internal.tombstone;

import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public enum a {
    TOMBSTONE("Tombstone"),
    SIGNAL_HANDLER("signalhandler"),
    TOMBSTONE_MERGED("TombstoneMerged");


    @NonNull
    private final String value;

    a(@NonNull String str) {
        this.value = str;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }
}
