package ru.ozon.app.android.fresh.unsorted.utils.timer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerTick;", "", "", "deadlineMs", "timeLeftMs", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getDeadlineMs", "()Ljava/lang/Long;", "getTimeLeftMs", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TimerTick {
    private final Long deadlineMs;
    private final Long timeLeftMs;

    public TimerTick(Long l11, Long l12) {
        this.deadlineMs = l11;
        this.timeLeftMs = l12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerTick)) {
            return false;
        }
        TimerTick timerTick = (TimerTick) other;
        return Intrinsics.d(this.deadlineMs, timerTick.deadlineMs) && Intrinsics.d(this.timeLeftMs, timerTick.timeLeftMs);
    }

    public final Long getDeadlineMs() {
        return this.deadlineMs;
    }

    public final Long getTimeLeftMs() {
        return this.timeLeftMs;
    }

    public int hashCode() {
        Long l11 = this.deadlineMs;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.timeLeftMs;
        return hashCode + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TimerTick(deadlineMs=" + this.deadlineMs + ", timeLeftMs=" + this.timeLeftMs + ")";
    }
}
