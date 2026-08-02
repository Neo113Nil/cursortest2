package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class ClimaxSegment {
    public int endTimeMs;
    public int startTimeMs;

    @CalledByNative
    public ClimaxSegment(int i10, int i11) {
        this.startTimeMs = i10;
        this.endTimeMs = i11;
    }

    @CalledByNative
    public int getEndTimeMs() {
        return this.endTimeMs;
    }

    @CalledByNative
    public int getStartTimeMs() {
        return this.startTimeMs;
    }
}
