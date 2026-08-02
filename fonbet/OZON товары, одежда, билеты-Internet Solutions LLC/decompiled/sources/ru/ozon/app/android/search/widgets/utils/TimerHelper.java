package ru.ozon.app.android.search.widgets.utils;

import android.os.CountDownTimer;
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
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JI\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011JG\u0010\u0013\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u000fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/utils/TimerHelper;", "", "Landroidx/lifecycle/v;", "lifecycle", "<init>", "(Landroidx/lifecycle/v;)V", "", "maxRetries", "pollingIntervalMs", "Lkotlin/Function0;", "", "onTimerFinish", "Lkotlin/Function1;", "onTimerTick", "createAndStartTimer", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "stopAndRemoveTimer", "()V", "removeObserver", "startTimer", "stopTimer", "Landroidx/lifecycle/v;", "Landroid/os/CountDownTimer;", DynamicElementDTO.TIMER, "Landroid/os/CountDownTimer;", "Landroidx/lifecycle/I;", "lifecycleObserver", "Landroidx/lifecycle/I;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TimerHelper {

    @NotNull
    private final AbstractC5434v lifecycle;
    private I lifecycleObserver;
    private CountDownTimer timer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/utils/TimerHelper$Companion;", "", "<init>", "()V", "DEFAULT_INTERVAL", "", "DEFAULT_RETRIES", "DEFAULT_DEADLINE_DURATION", "COUNT_RETRIES_BEFORE_ERROR", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public final void createAndStartTimer(Long maxRetries, Long pollingIntervalMs, final Function0<Unit> onTimerFinish, final Function1<? super Long, Unit> onTimerTick) {
        stopAndRemoveTimer();
        final long longValue = maxRetries != null ? (maxRetries.longValue() - 1) * (pollingIntervalMs != null ? pollingIntervalMs.longValue() : 60000L) : 600000L;
        if (longValue <= 0) {
            onTimerFinish.invoke();
            removeObserver();
        } else {
            final long longValue2 = pollingIntervalMs != null ? pollingIntervalMs.longValue() : 60000L;
            CountDownTimer countDownTimer = new CountDownTimer(longValue, longValue2) { // from class: ru.ozon.app.android.search.widgets.utils.TimerHelper$createAndStartTimer$1
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopAndRemoveTimer() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void startTimer(final Long maxRetries, final Long pollingIntervalMs, @NotNull final Function0<Unit> onTimerFinish, final Function1<? super Long, Unit> onTimerTick) {
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.widgets.utils.TimerHelper$startTimer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                TimerHelper.this.createAndStartTimer(maxRetries, pollingIntervalMs, onTimerFinish, onTimerTick);
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
}
