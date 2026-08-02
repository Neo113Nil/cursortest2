package com.vk.auth.utils.stats;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrackableError.kt */
/* loaded from: classes15.dex */
public final class TrackableError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TrackableError[] $VALUES;
    public static final TrackableError INTERNAL_SERVER_ERROR;
    public static final TrackableError INVALID_REQUEST_ERROR;

    static {
        TrackableError trackableError = new TrackableError("INTERNAL_SERVER_ERROR", 0);
        INTERNAL_SERVER_ERROR = trackableError;
        TrackableError trackableError2 = new TrackableError("INVALID_REQUEST_ERROR", 1);
        INVALID_REQUEST_ERROR = trackableError2;
        TrackableError[] trackableErrorArr = {trackableError, trackableError2};
        $VALUES = trackableErrorArr;
        $ENTRIES = new asp(trackableErrorArr);
    }

    public TrackableError() {
        throw null;
    }

    public static TrackableError valueOf(String str) {
        return (TrackableError) Enum.valueOf(TrackableError.class, str);
    }

    public static TrackableError[] values() {
        return (TrackableError[]) $VALUES.clone();
    }
}
