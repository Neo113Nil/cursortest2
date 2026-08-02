package com.vk.channels.impl.list.domain;

import xsna.vu5;

/* compiled from: PinnedChannelsLimitExceededException.kt */
/* loaded from: classes16.dex */
public final class PinnedChannelsLimitExceededException extends IllegalStateException {
    private final int limit;

    public PinnedChannelsLimitExceededException() {
        super("Pinned channels limit (5) exceeded.");
        this.limit = 5;
    }

    public final int d() {
        return this.limit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PinnedChannelsLimitExceededException) && this.limit == ((PinnedChannelsLimitExceededException) obj).limit;
    }

    public final int hashCode() {
        return Integer.hashCode(this.limit);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return vu5.b(new StringBuilder("PinnedChannelsLimitExceededException(limit="), this.limit, ')');
    }
}
