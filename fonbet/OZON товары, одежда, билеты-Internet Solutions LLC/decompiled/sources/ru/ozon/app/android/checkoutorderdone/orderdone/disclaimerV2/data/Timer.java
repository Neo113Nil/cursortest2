package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;", "", "timeLeft", "", "timerPosition", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;", "<init>", "(JLru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;)V", "getTimeLeft", "()J", "getTimerPosition", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TimerPosition", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Timer {
    public static final int $stable = 0;
    private final long timeLeft;

    @NotNull
    private final TimerPosition timerPosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer$TimerPosition;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimerPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TimerPosition[] $VALUES;
        public static final TimerPosition TITLE = new TimerPosition(SelectionItemDescriptionDTO.TITLE, 0);
        public static final TimerPosition SUBTITLE = new TimerPosition("SUBTITLE", 1);

        private static final /* synthetic */ TimerPosition[] $values() {
            return new TimerPosition[]{TITLE, SUBTITLE};
        }

        static {
            TimerPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TimerPosition(String str, int i11) {
        }

        public static TimerPosition valueOf(String str) {
            return (TimerPosition) Enum.valueOf(TimerPosition.class, str);
        }

        public static TimerPosition[] values() {
            return (TimerPosition[]) $VALUES.clone();
        }
    }

    public Timer(long j11, @NotNull TimerPosition timerPosition) {
        Intrinsics.checkNotNullParameter(timerPosition, "timerPosition");
        this.timeLeft = j11;
        this.timerPosition = timerPosition;
    }

    public static /* synthetic */ Timer copy$default(Timer timer, long j11, TimerPosition timerPosition, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = timer.timeLeft;
        }
        if ((i11 & 2) != 0) {
            timerPosition = timer.timerPosition;
        }
        return timer.copy(j11, timerPosition);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeLeft() {
        return this.timeLeft;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TimerPosition getTimerPosition() {
        return this.timerPosition;
    }

    @NotNull
    public final Timer copy(long timeLeft, @NotNull TimerPosition timerPosition) {
        Intrinsics.checkNotNullParameter(timerPosition, "timerPosition");
        return new Timer(timeLeft, timerPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Timer)) {
            return false;
        }
        Timer timer = (Timer) other;
        return this.timeLeft == timer.timeLeft && this.timerPosition == timer.timerPosition;
    }

    public final long getTimeLeft() {
        return this.timeLeft;
    }

    @NotNull
    public final TimerPosition getTimerPosition() {
        return this.timerPosition;
    }

    public int hashCode() {
        return this.timerPosition.hashCode() + (Long.hashCode(this.timeLeft) * 31);
    }

    @NotNull
    public String toString() {
        return "Timer(timeLeft=" + this.timeLeft + ", timerPosition=" + this.timerPosition + ")";
    }

    public /* synthetic */ Timer(long j11, TimerPosition timerPosition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? TimerPosition.SUBTITLE : timerPosition);
    }
}
