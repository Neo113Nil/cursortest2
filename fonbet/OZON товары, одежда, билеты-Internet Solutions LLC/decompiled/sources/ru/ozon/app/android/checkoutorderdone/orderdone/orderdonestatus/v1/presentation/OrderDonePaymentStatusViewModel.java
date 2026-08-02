package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation;

import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation.TimerState;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.timer.OneSecondTimer;
import ru.ozon.app.android.utils.timer.TimerManager;
import ru.ozon.app.android.utils.timer.TimerTick;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "", "timeLeft", "", "onTimerTick", "(J)V", "onTimerComplete", "()V", "Lru/ozon/app/android/utils/timer/TimerTick;", "tick", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/TimerState;", "formatTime", "(Lru/ozon/app/android/utils/timer/TimerTick;)Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/TimerState;", "onCleared", "timerStopsAt", "startTimer", "stopTimer", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Landroidx/lifecycle/V;", "timerState", "Landroidx/lifecycle/V;", "getTimerState", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/timer/TimerManager;", "timerManager", "Lru/ozon/app/android/utils/timer/TimerManager;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDonePaymentStatusViewModel extends w0 {

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private TimerManager timerManager;

    @NotNull
    private final V<TimerState> timerState;

    public OrderDonePaymentStatusViewModel(@NotNull StartupArgsService startupArgsService) {
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.startupArgsService = startupArgsService;
        this.timerState = new V<>();
        this.timerManager = new OneSecondTimer.Builder().scopeIn(x0.a(this)).onTick(new OrderDonePaymentStatusViewModel$timerManager$1(this)).onComplete(new OrderDonePaymentStatusViewModel$timerManager$2(this)).build();
    }

    private final TimerState formatTime(TimerTick tick) {
        return tick.getDays() > 0 ? new TimerState.Tick.Days(tick.getDays()) : tick.getHours() > 0 ? new TimerState.Tick.Time(tick.timeWithHours()) : new TimerState.Tick.Time(tick.time());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerComplete() {
        this.timerState.postValue(TimerState.Stop.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerTick(long timeLeft) {
        this.timerState.setValue(formatTime(new TimerTick(timeLeft)));
        if (this.startupArgsService.getArgValue("STATIC_TIMERS")) {
            stopTimer();
        }
    }

    @NotNull
    public final V<TimerState> getTimerState() {
        return this.timerState;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        stopTimer();
    }

    public final void startTimer(long timerStopsAt) {
        this.timerManager.startTimer(timerStopsAt);
    }

    public final void stopTimer() {
        this.timerManager.stopTimer();
    }
}
