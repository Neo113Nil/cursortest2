package ru.ozon.app.android.storefront.stories.story.presentation;

import Xc.a;
import Xc.b;
import android.view.Choreographer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0003R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\tR\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/FloatAnimator;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "()V", "", "postFrameCallback", "", "frameTimeNanos", "doFrame", "(J)V", "start", "pause", "stop", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "duration", "J", "getDuration", "()J", "setDuration", "durationNanos", "startTimeNanos", "pausedTimeNanos", "remainingTimeNanos", "Lru/ozon/app/android/storefront/stories/story/presentation/FloatAnimator$State;", "state", "Lru/ozon/app/android/storefront/stories/story/presentation/FloatAnimator$State;", "Companion", "State", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FloatAnimator implements Choreographer.FrameCallback {
    private Function1<? super Float, Unit> listener;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private long duration = 100;
    private long durationNanos = 100000000;
    private long startTimeNanos = -1;
    private long pausedTimeNanos = -1;
    private long remainingTimeNanos = -1;

    @NotNull
    private State state = State.STOPPED;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/FloatAnimator$Companion;", "", "<init>", "()V", "DEFAULT_DURATION", "", "MAX_VALUE", "", "NO_TIME", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/FloatAnimator$State;", "", "<init>", "(Ljava/lang/String;I)V", "STOPPED", "RUNNING", "PAUSED", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State STOPPED = new State("STOPPED", 0);
        public static final State RUNNING = new State("RUNNING", 1);
        public static final State PAUSED = new State("PAUSED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STOPPED, RUNNING, PAUSED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    private final void postFrameCallback() {
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.state == State.STOPPED) {
            return;
        }
        if (this.duration <= 0) {
            stop();
            return;
        }
        postFrameCallback();
        long j11 = this.startTimeNanos;
        if (j11 == -1) {
            this.startTimeNanos = frameTimeNanos;
            return;
        }
        if (this.state == State.PAUSED) {
            if (this.pausedTimeNanos == -1) {
                this.pausedTimeNanos = frameTimeNanos - j11;
            }
            this.startTimeNanos = frameTimeNanos - this.pausedTimeNanos;
            return;
        }
        long j12 = this.durationNanos;
        long j13 = j12 - (frameTimeNanos - j11);
        this.remainingTimeNanos = j13;
        if (j13 <= 0) {
            Function1<? super Float, Unit> function1 = this.listener;
            if (function1 != null) {
                function1.invoke(Float.valueOf(1.0f));
            }
            stop();
            return;
        }
        Function1<? super Float, Unit> function12 = this.listener;
        if (function12 != null) {
            function12.invoke(Float.valueOf((frameTimeNanos - j11) / j12));
        }
    }

    public final void pause() {
        if (this.state == State.RUNNING) {
            this.state = State.PAUSED;
            this.pausedTimeNanos = -1L;
        }
    }

    public final void setDuration(long j11) {
        this.duration = j11;
        this.durationNanos = j11 * 1000000;
    }

    public final void setListener(Function1<? super Float, Unit> function1) {
        this.listener = function1;
    }

    public final void start() {
        State state = this.state;
        this.state = State.RUNNING;
        if (state == State.STOPPED) {
            postFrameCallback();
        }
    }

    public final void stop() {
        this.state = State.STOPPED;
        this.startTimeNanos = -1L;
        this.pausedTimeNanos = -1L;
        Choreographer.getInstance().removeFrameCallback(this);
    }
}
