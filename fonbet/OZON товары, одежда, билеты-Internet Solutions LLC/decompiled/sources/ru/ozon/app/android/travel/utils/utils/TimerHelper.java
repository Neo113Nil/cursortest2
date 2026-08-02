package ru.ozon.app.android.travel.utils.utils;

import android.os.CountDownTimer;
import android.os.SystemClock;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u000e\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J=\u0010\u0015\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ=\u0010\u0015\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0011J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "", "Landroidx/lifecycle/v;", "lifecycle", "<init>", "(Landroidx/lifecycle/v;)V", "Lorg/joda/time/DateTime;", "timeLimit", "Lkotlin/Function0;", "", "onTimerFinish", "Lkotlin/Function1;", "", "onTimerTick", "createAndStartTimer", "(Lorg/joda/time/DateTime;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "deadline", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "stopAndRemoveTimer", "()V", "removeObserver", "startTimer", "stopTimer", "Landroidx/lifecycle/v;", "Landroid/os/CountDownTimer;", DynamicElementDTO.TIMER, "Landroid/os/CountDownTimer;", "Landroidx/lifecycle/I;", "lifecycleObserver", "Landroidx/lifecycle/I;", "Companion", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerHelper {

    @NotNull
    private final AbstractC5434v lifecycle;
    private I lifecycleObserver;
    private CountDownTimer timer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/utils/utils/TimerHelper$Companion;", "", "<init>", "()V", "DEF_UPDATE_INTERVAL", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TimerHelper(@NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.lifecycle = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndStartTimer(DateTime timeLimit, final Function0<Unit> onTimerFinish, final Function1<? super Long, Unit> onTimerTick) {
        stopAndRemoveTimer();
        DateTime dateTime = new DateTime();
        if (timeLimit == null || timeLimit.b(dateTime)) {
            onTimerFinish.invoke();
            removeObserver();
        } else {
            final long millis = new Duration(dateTime, timeLimit).getMillis();
            CountDownTimer countDownTimer = new CountDownTimer(millis) { // from class: ru.ozon.app.android.travel.utils.utils.TimerHelper$createAndStartTimer$1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    onTimerFinish.invoke();
                    this.stopAndRemoveTimer();
                    this.removeObserver();
                }

                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                    Function1<Long, Unit> function1 = onTimerTick;
                    if (function1 != null) {
                        function1.invoke(Long.valueOf(millisUntilFinished));
                    }
                }
            };
            this.timer = countDownTimer;
            countDownTimer.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeObserver() {
        I i11 = this.lifecycleObserver;
        if (i11 != null) {
            this.lifecycle.e(i11);
        }
        this.lifecycleObserver = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startTimer$default(TimerHelper timerHelper, DateTime dateTime, Function0 function0, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        timerHelper.startTimer(dateTime, (Function0<Unit>) function0, (Function1<? super Long, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopAndRemoveTimer() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void startTimer(final DateTime timeLimit, @NotNull final Function0<Unit> onTimerFinish, final Function1<? super Long, Unit> onTimerTick) {
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.utils.utils.TimerHelper$startTimer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                TimerHelper.this.createAndStartTimer(timeLimit, (Function0<Unit>) onTimerFinish, (Function1<? super Long, Unit>) onTimerTick);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                TimerHelper.this.stopAndRemoveTimer();
            }
        };
        this.lifecycle.a(defaultLifecycleObserver);
        this.lifecycleObserver = defaultLifecycleObserver;
    }

    public final void stopTimer() {
        stopAndRemoveTimer();
        removeObserver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startTimer$default(TimerHelper timerHelper, Long l11, Function0 function0, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        timerHelper.startTimer(l11, (Function0<Unit>) function0, (Function1<? super Long, Unit>) function1);
    }

    public final void startTimer(final Long deadline, @NotNull final Function0<Unit> onTimerFinish, final Function1<? super Long, Unit> onTimerTick) {
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.utils.utils.TimerHelper$startTimer$3
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                TimerHelper.this.createAndStartTimer(deadline, (Function0<Unit>) onTimerFinish, (Function1<? super Long, Unit>) onTimerTick);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                TimerHelper.this.stopAndRemoveTimer();
            }
        };
        this.lifecycle.a(defaultLifecycleObserver);
        this.lifecycleObserver = defaultLifecycleObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndStartTimer(Long deadline, final Function0<Unit> onTimerFinish, final Function1<? super Long, Unit> onTimerTick) {
        stopAndRemoveTimer();
        final long longValue = (deadline != null ? deadline.longValue() : 0L) - SystemClock.elapsedRealtime();
        if (longValue <= 0) {
            onTimerFinish.invoke();
            removeObserver();
        } else {
            CountDownTimer countDownTimer = new CountDownTimer(longValue) { // from class: ru.ozon.app.android.travel.utils.utils.TimerHelper$createAndStartTimer$2
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    onTimerFinish.invoke();
                    this.stopAndRemoveTimer();
                    this.removeObserver();
                }

                @Override // android.os.CountDownTimer
                public void onTick(long millisUntilFinished) {
                    Function1<Long, Unit> function1 = onTimerTick;
                    if (function1 != null) {
                        function1.invoke(Long.valueOf(millisUntilFinished));
                    }
                }
            };
            this.timer = countDownTimer;
            countDownTimer.start();
        }
    }
}
