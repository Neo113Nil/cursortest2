package ru.ozon.app.android.fresh.main.utils;

import De.s;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.c;
import org.joda.time.format.m;
import org.joda.time.format.n;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.N;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/utils/OrderLifecycleTimer;", "", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "", "", "onTimerTick", "Lkotlin/Function0;", "onTimerFinished", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "startTimer", "()V", "validateTimerState", "stopTimer", "", "endTime", "bind", "(J)V", "Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lxe/B0;", "timerJob", "Lxe/B0;", "mEndTimeStamp", "Ljava/lang/Long;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderLifecycleTimer {
    private static m formatter;

    @NotNull
    private final J lifecycleOwner;
    private Long mEndTimeStamp;

    @NotNull
    private final Function0<Unit> onTimerFinished;

    @NotNull
    private final Function1<String, Unit> onTimerTick;
    private B0 timerJob;

    static {
        n nVar = new n();
        nVar.s();
        nVar.q();
        nVar.d();
        nVar.j();
        nVar.r();
        nVar.q();
        nVar.f();
        nVar.j();
        nVar.r();
        nVar.q();
        nVar.h();
        formatter = nVar.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderLifecycleTimer(@NotNull J lifecycleOwner, @NotNull Function1<? super String, Unit> onTimerTick, @NotNull Function0<Unit> onTimerFinished) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onTimerTick, "onTimerTick");
        Intrinsics.checkNotNullParameter(onTimerFinished, "onTimerFinished");
        this.lifecycleOwner = lifecycleOwner;
        this.onTimerTick = onTimerTick;
        this.onTimerFinished = onTimerFinished;
        lifecycleOwner.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.main.utils.OrderLifecycleTimer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (OrderLifecycleTimer.this.mEndTimeStamp != null) {
                    B0 b02 = OrderLifecycleTimer.this.timerJob;
                    if (b02 == null || b02.isActive()) {
                        OrderLifecycleTimer.this.startTimer();
                    }
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OrderLifecycleTimer.this.stopTimer();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer() {
        stopTimer();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.timerJob = C10727i.c(N.a(s.f6650a), null, null, new OrderLifecycleTimer$startTimer$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTimer() {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateTimerState() {
        if (this.mEndTimeStamp == null) {
            return;
        }
        Instant instant = new Instant();
        Instant instant2 = new Instant(this.mEndTimeStamp);
        if (instant.getMillis() > c.c(instant2)) {
            stopTimer();
            this.onTimerFinished.invoke();
            return;
        }
        String e11 = formatter.e(new Period(instant, instant2, PeriodType.l()));
        Function1<String, Unit> function1 = this.onTimerTick;
        Intrinsics.f(e11);
        function1.invoke(e11);
    }

    public final void bind(long endTime) {
        stopTimer();
        this.mEndTimeStamp = Long.valueOf(endTime);
        validateTimerState();
        startTimer();
    }
}
