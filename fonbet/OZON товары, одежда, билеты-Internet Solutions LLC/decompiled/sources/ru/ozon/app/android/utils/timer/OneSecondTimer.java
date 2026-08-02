package ru.ozon.app.android.utils.timer;

import De.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/utils/timer/OneSecondTimer;", "Lru/ozon/app/android/utils/timer/TimerManager;", "<init>", "()V", "", "deadline", "", "startTimer", "(J)V", "stopTimer", "clear", "Lxe/B0;", "timerJob", "Lxe/B0;", "Lxe/M;", "scope", "Lxe/M;", "getScope$utils_prodGoogleAllVendorsRelease", "()Lxe/M;", "setScope$utils_prodGoogleAllVendorsRelease", "(Lxe/M;)V", "Lkotlin/Function1;", "onTick", "Lkotlin/jvm/functions/Function1;", "getOnTick$utils_prodGoogleAllVendorsRelease", "()Lkotlin/jvm/functions/Function1;", "setOnTick$utils_prodGoogleAllVendorsRelease", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onComplete", "Lkotlin/jvm/functions/Function0;", "getOnComplete$utils_prodGoogleAllVendorsRelease", "()Lkotlin/jvm/functions/Function0;", "setOnComplete$utils_prodGoogleAllVendorsRelease", "(Lkotlin/jvm/functions/Function0;)V", "Companion", "Builder", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneSecondTimer implements TimerManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private Function0<Unit> onComplete;

    @NotNull
    private Function1<? super Long, Unit> onTick;

    @NotNull
    private M scope;
    private B0 timerJob;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/utils/timer/OneSecondTimer$Builder;", "", "<init>", "()V", "Lru/ozon/app/android/utils/timer/TimerManager;", "build", "()Lru/ozon/app/android/utils/timer/TimerManager;", "Lxe/M;", "scope", "scopeIn", "(Lxe/M;)Lru/ozon/app/android/utils/timer/OneSecondTimer$Builder;", "Lkotlin/Function1;", "", "", "onTick", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/utils/timer/OneSecondTimer$Builder;", "Lkotlin/Function0;", "onComplete", "(Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/utils/timer/OneSecondTimer$Builder;", "Lru/ozon/app/android/utils/timer/OneSecondTimer;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/utils/timer/OneSecondTimer;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final OneSecondTimer timer = new OneSecondTimer();

        @NotNull
        public TimerManager build() {
            return this.timer;
        }

        @NotNull
        public Builder onComplete(@NotNull Function0<Unit> onComplete) {
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            this.timer.setOnComplete$utils_prodGoogleAllVendorsRelease(onComplete);
            return this;
        }

        @NotNull
        public Builder onTick(@NotNull Function1<? super Long, Unit> onTick) {
            Intrinsics.checkNotNullParameter(onTick, "onTick");
            this.timer.setOnTick$utils_prodGoogleAllVendorsRelease(onTick);
            return this;
        }

        @NotNull
        public Builder scopeIn(@NotNull M scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.timer.setScope$utils_prodGoogleAllVendorsRelease(scope);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/utils/timer/OneSecondTimer$Companion;", "", "<init>", "()V", "TIMER_TICK", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OneSecondTimer() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(s.f6650a.x().plus(X0.b()));
        this.onTick = OneSecondTimer$onTick$1.INSTANCE;
        this.onComplete = OneSecondTimer$onComplete$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.utils.timer.TimerManager
    public void clear() {
        N.c(this.scope, null);
    }

    @NotNull
    public final Function0<Unit> getOnComplete$utils_prodGoogleAllVendorsRelease() {
        return this.onComplete;
    }

    @NotNull
    public final Function1<Long, Unit> getOnTick$utils_prodGoogleAllVendorsRelease() {
        return this.onTick;
    }

    public final void setOnComplete$utils_prodGoogleAllVendorsRelease(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onComplete = function0;
    }

    public final void setOnTick$utils_prodGoogleAllVendorsRelease(@NotNull Function1<? super Long, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTick = function1;
    }

    public final void setScope$utils_prodGoogleAllVendorsRelease(@NotNull M m11) {
        Intrinsics.checkNotNullParameter(m11, "<set-?>");
        this.scope = m11;
    }

    @Override // ru.ozon.app.android.utils.timer.TimerManager
    public void startTimer(long deadline) {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.timerJob = C10727i.c(this.scope, null, null, new OneSecondTimer$startTimer$1(deadline, this, null), 3);
    }

    @Override // ru.ozon.app.android.utils.timer.TimerManager
    public void stopTimer() {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
    }
}
