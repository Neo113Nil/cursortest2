package ru.ozon.app.android.fresh.unsorted.utils.timer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerState;", "", "", "timeLeftMs", "", "progressPercent", "<init>", "(Ljava/lang/Long;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getTimeLeftMs", "()Ljava/lang/Long;", "F", "getProgressPercent", "()F", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimerState {
    private final float progressPercent;
    private final Long timeLeftMs;

    public TimerState(Long l11, float f7) {
        this.timeLeftMs = l11;
        this.progressPercent = f7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerState)) {
            return false;
        }
        TimerState timerState = (TimerState) other;
        return Intrinsics.d(this.timeLeftMs, timerState.timeLeftMs) && Float.compare(this.progressPercent, timerState.progressPercent) == 0;
    }

    public final float getProgressPercent() {
        return this.progressPercent;
    }

    public final Long getTimeLeftMs() {
        return this.timeLeftMs;
    }

    public int hashCode() {
        Long l11 = this.timeLeftMs;
        return Float.hashCode(this.progressPercent) + ((l11 == null ? 0 : l11.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "TimerState(timeLeftMs=" + this.timeLeftMs + ", progressPercent=" + this.progressPercent + ")";
    }
}
