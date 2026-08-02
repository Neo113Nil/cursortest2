package ru.ozon.app.android.fresh.unsorted.utils.timer;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerApiImpl;", "", "Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;", "timerService", "<init>", "(Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;)V", "getTimerService", "()Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;", "Lru/ozon/app/android/fresh/unsorted/utils/timer/TimerService;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimerApiImpl implements InterfaceC6958a {

    @NotNull
    private final TimerService timerService;

    public TimerApiImpl(@NotNull TimerService timerService) {
        Intrinsics.checkNotNullParameter(timerService, "timerService");
        this.timerService = timerService;
    }

    @NotNull
    public TimerService getTimerService() {
        return this.timerService;
    }
}
