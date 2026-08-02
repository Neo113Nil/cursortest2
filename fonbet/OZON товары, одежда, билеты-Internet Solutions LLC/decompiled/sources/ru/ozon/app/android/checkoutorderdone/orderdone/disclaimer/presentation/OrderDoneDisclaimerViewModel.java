package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation;

import B0.A0;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.timer.OneSecondTimer;
import ru.ozon.app.android.utils.timer.TimerManager;
import ru.ozon.app.android.utils.timer.TimerTick;
import ru.ozon.app.android.utils.timer.TimerUtilsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel;", "Lh20/a;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "", "timeLeft", "", "onTimerTick", "(J)V", "onTimerComplete", "()V", "onCleared", "deadline", "startTimer", "stopTimer", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lru/ozon/app/android/utils/timer/TimerManager;", "timerManager", "Lru/ozon/app/android/utils/timer/TimerManager;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel$Timer;", "_timer", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", DynamicElementDTO.TIMER, "Landroidx/lifecycle/P;", "getTimer", "()Landroidx/lifecycle/P;", "Timer", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneDisclaimerViewModel implements InterfaceC6786a {

    @NotNull
    private final V<Timer> _timer;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final P<Timer> timer;

    @NotNull
    private final TimerManager timerManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel$Timer;", "", "Done", "Tick", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel$Timer$Done;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel$Timer$Tick;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Timer {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel$Timer$Done;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel$Timer;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Done implements Timer {

            @NotNull
            public static final Done INSTANCE = new Done();

            private Done() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Done);
            }

            public int hashCode() {
                return 802777624;
            }

            @NotNull
            public String toString() {
                return "Done";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel$Timer$Tick;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel$Timer;", "", "output", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOutput", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tick implements Timer {

            @NotNull
            private final String output;

            public Tick(@NotNull String output) {
                Intrinsics.checkNotNullParameter(output, "output");
                this.output = output;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Tick) && Intrinsics.d(this.output, ((Tick) other).output);
            }

            @NotNull
            public final String getOutput() {
                return this.output;
            }

            public int hashCode() {
                return this.output.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Tick(output=", this.output, ")");
            }
        }
    }

    public OrderDoneDisclaimerViewModel(@NotNull StartupArgsService startupArgsService) {
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.startupArgsService = startupArgsService;
        this.timerManager = new OneSecondTimer.Builder().onTick(new OrderDoneDisclaimerViewModel$timerManager$1(this)).onComplete(new OrderDoneDisclaimerViewModel$timerManager$2(this)).build();
        V<Timer> v11 = new V<>();
        this._timer = v11;
        this.timer = v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerComplete() {
        this._timer.setValue(Timer.Done.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimerTick(long timeLeft) {
        this._timer.setValue(new Timer.Tick(TimerUtilsKt.formatTime(new TimerTick(timeLeft))));
        if (this.startupArgsService.getArgValue("STATIC_TIMERS")) {
            stopTimer();
        }
    }

    @NotNull
    public final P<Timer> getTimer() {
        return this.timer;
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        this.timerManager.clear();
        stopTimer();
    }

    public final void startTimer(long deadline) {
        this.timerManager.startTimer(deadline);
    }

    public final void stopTimer() {
        this.timerManager.stopTimer();
    }
}
