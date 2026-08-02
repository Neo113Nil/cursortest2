package ru.ozon.app.android.fresh.unsorted.utils.timer;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.s;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\rR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;", "", "<init>", "()V", "", "deadlineMs", "finalValue", "", "clearDeadline", "", "finalizeCountdown", "(Ljava/lang/Long;Ljava/lang/Long;Z)V", "startTimer", "(J)V", "timeLeftMs", "", "formatCountdownTime", "(J)Ljava/lang/String;", "deadline", "markDeadlineAsCompleted", "(Ljava/lang/Long;)Z", "durationFromStart", "J", "getDurationFromStart", "()J", "setDurationFromStart", "Lxe/M;", "scope", "Lxe/M;", "Lxe/B0;", "timerJob", "Lxe/B0;", "currentDeadline", "Ljava/lang/Long;", "LAe/x0;", "Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerTick;", "_tick", "LAe/x0;", "LAe/M0;", "tick", "LAe/M0;", "getTick", "()LAe/M0;", "", "completedDeadlinesSet", "Ljava/util/Set;", "isRunning", "()Z", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimerService {

    @NotNull
    private final x0<TimerTick> _tick;

    @NotNull
    private final Set<Long> completedDeadlinesSet;
    private Long currentDeadline;
    private long durationFromStart;

    @NotNull
    private final M scope;

    @NotNull
    private final M0<TimerTick> tick;
    private B0 timerJob;
    public static final int $stable = 8;

    public TimerService() {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11));
        x0<TimerTick> a11 = O0.a(new TimerTick(null, null));
        this._tick = a11;
        this.tick = C2399j.b(a11);
        this.completedDeadlinesSet = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finalizeCountdown(Long deadlineMs, Long finalValue, boolean clearDeadline) {
        x0<TimerTick> x0Var = this._tick;
        while (!x0Var.b(x0Var.getValue(), new TimerTick(deadlineMs, finalValue))) {
        }
        this.timerJob = null;
        if (clearDeadline) {
            this.currentDeadline = null;
            this.durationFromStart = 0L;
        }
    }

    static /* synthetic */ void finalizeCountdown$default(TimerService timerService, Long l11, Long l12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        timerService.finalizeCountdown(l11, l12, z11);
    }

    @NotNull
    public final String formatCountdownTime(long timeLeftMs) {
        if (timeLeftMs <= 0) {
            return StringProvider.getString(R$string.finished_time);
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(timeLeftMs);
        long j11 = seconds / 3600;
        long j12 = (seconds % 3600) / 60;
        long j13 = seconds % 60;
        return j11 > 0 ? StringProvider.getString(R$string.time_format_hours_minutes_seconds, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13)) : StringProvider.getString(R$string.time_format_minutes_seconds, Long.valueOf(j12), Long.valueOf(j13));
    }

    public final long getDurationFromStart() {
        return this.durationFromStart;
    }

    @NotNull
    public final M0<TimerTick> getTick() {
        return this.tick;
    }

    public final boolean isRunning() {
        B0 b02 = this.timerJob;
        return (b02 == null || !b02.isActive() || this.currentDeadline == null) ? false : true;
    }

    public final boolean markDeadlineAsCompleted(Long deadline) {
        if (deadline == null) {
            return false;
        }
        return this.completedDeadlinesSet.add(Long.valueOf(deadline.longValue()));
    }

    public final void startTimer(long deadlineMs) {
        B0 b02;
        Long l11 = this.currentDeadline;
        boolean z11 = true;
        if (l11 != null && l11.longValue() == deadlineMs && (b02 = this.timerJob) != null && b02.isActive()) {
            return;
        }
        B0 b03 = this.timerJob;
        if (b03 != null) {
            b03.j(null);
        }
        Long l12 = this.currentDeadline;
        if (l12 != null && l12.longValue() == deadlineMs) {
            z11 = false;
        }
        this.currentDeadline = Long.valueOf(deadlineMs);
        long currentTimeMillis = deadlineMs - System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        if (z11) {
            this.durationFromStart = currentTimeMillis;
        }
        x0<TimerTick> x0Var = this._tick;
        while (!x0Var.b(x0Var.getValue(), new TimerTick(Long.valueOf(deadlineMs), null))) {
        }
        this.timerJob = C10727i.c(this.scope, null, null, new TimerService$startTimer$2(currentTimeMillis, this, deadlineMs, null), 3);
    }
}
