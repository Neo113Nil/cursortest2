package androidx.media3.common;

import xsna.ewo0;

/* loaded from: classes12.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final ewo0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(ewo0 ewo0Var, int i, long j) {
        this.timeline = ewo0Var;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
