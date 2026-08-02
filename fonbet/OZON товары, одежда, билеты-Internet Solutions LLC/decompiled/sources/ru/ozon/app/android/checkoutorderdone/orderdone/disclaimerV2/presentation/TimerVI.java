package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data.Timer;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;", "", "", "deadline", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;", "position", "<init>", "(JLru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDeadline", "()J", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;", "getPosition", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TimerVI {
    private final long deadline;

    @NotNull
    private final Timer.TimerPosition position;

    public TimerVI(long j11, @NotNull Timer.TimerPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.deadline = j11;
        this.position = position;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerVI)) {
            return false;
        }
        TimerVI timerVI = (TimerVI) other;
        return this.deadline == timerVI.deadline && this.position == timerVI.position;
    }

    public final long getDeadline() {
        return this.deadline;
    }

    @NotNull
    public final Timer.TimerPosition getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.position.hashCode() + (Long.hashCode(this.deadline) * 31);
    }

    @NotNull
    public String toString() {
        return "TimerVI(deadline=" + this.deadline + ", position=" + this.position + ")";
    }
}
