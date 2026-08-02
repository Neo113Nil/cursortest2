package org.maplibre.android.style.layers;

import B4.V;
import androidx.annotation.Keep;

/* loaded from: classes10.dex */
public class TransitionOptions {

    @Keep
    private long delay;

    @Keep
    private long duration;

    @Keep
    private boolean enablePlacementTransitions;

    public TransitionOptions(long j11, long j12, boolean z11) {
        this.duration = j11;
        this.delay = j12;
        this.enablePlacementTransitions = z11;
    }

    @Keep
    @Deprecated
    public static TransitionOptions fromTransitionOptions(long j11, long j12) {
        return new TransitionOptions(j11, j12, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TransitionOptions transitionOptions = (TransitionOptions) obj;
            if (this.duration == transitionOptions.duration && this.delay == transitionOptions.delay && this.enablePlacementTransitions == transitionOptions.enablePlacementTransitions) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.duration;
        int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
        long j12 = this.delay;
        return ((i11 + ((int) ((j12 >>> 32) ^ j12))) * 31) + (this.enablePlacementTransitions ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionOptions{duration=");
        sb2.append(this.duration);
        sb2.append(", delay=");
        sb2.append(this.delay);
        sb2.append(", enablePlacementTransitions=");
        return V.d(sb2, this.enablePlacementTransitions, '}');
    }

    @Keep
    static TransitionOptions fromTransitionOptions(long j11, long j12, boolean z11) {
        return new TransitionOptions(j11, j12, z11);
    }
}
