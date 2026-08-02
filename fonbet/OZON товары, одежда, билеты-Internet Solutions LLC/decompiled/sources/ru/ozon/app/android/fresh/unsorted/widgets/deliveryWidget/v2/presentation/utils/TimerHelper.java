package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/TimerHelper;", "", "Lxe/M;", "coroutineScope", "<init>", "(Lxe/M;)V", "Lkotlin/Function0;", "", "onFinish", "launchTimer", "(Lkotlin/jvm/functions/Function0;)V", "", "seconds", "start", "(JLkotlin/jvm/functions/Function0;)V", "pause", "()V", "resume", "stop", "Lxe/M;", "Lxe/B0;", "timerJob", "Lxe/B0;", "remainingTime", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPaused", "Ljava/util/concurrent/atomic/AtomicBoolean;", "finishJob", "Lkotlin/jvm/functions/Function0;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimerHelper {

    @NotNull
    private final M coroutineScope;
    private Function0<Unit> finishJob;

    @NotNull
    private final AtomicBoolean isPaused;
    private long remainingTime;
    private B0 timerJob;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/TimerHelper$Companion;", "", "<init>", "()V", "DEFAULT_LIFETIME_SECONDS", "", "MILLISECOND", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TimerHelper(@NotNull M coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.isPaused = new AtomicBoolean(false);
    }

    private final void launchTimer(Function0<Unit> onFinish) {
        this.timerJob = C10727i.c(this.coroutineScope, null, null, new TimerHelper$launchTimer$1(this, onFinish, null), 3);
    }

    public final void pause() {
        this.isPaused.set(true);
    }

    public final void resume() {
        if (this.isPaused.get()) {
            this.isPaused.set(false);
            Function0<Unit> function0 = this.finishJob;
            if (function0 != null) {
                launchTimer(function0);
            }
            this.finishJob = null;
        }
    }

    public final void start(long seconds, @NotNull Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        stop();
        this.remainingTime = seconds * 1000;
        this.isPaused.set(false);
        launchTimer(onFinish);
    }

    public final void stop() {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = null;
        this.finishJob = null;
        this.isPaused.set(false);
        this.remainingTime = 0L;
    }
}
