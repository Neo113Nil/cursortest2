package ru.ozon.app.android.travel.utils.animator;

import Xc.a;
import Xc.b;
import android.view.Choreographer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u000bR\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/utils/animator/LinearFloatAnimator;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "()V", "", "finishAnimation", "cancelInternal", "postFrameCallback", "", "frameTimeNanos", "doFrame", "(J)V", "start", "cancel", "Lru/ozon/app/android/travel/utils/animator/AnimatorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/travel/utils/animator/AnimatorListener;", "getListener", "()Lru/ozon/app/android/travel/utils/animator/AnimatorListener;", "setListener", "(Lru/ozon/app/android/travel/utils/animator/AnimatorListener;)V", "duration", "J", "getDuration", "()J", "setDuration", "startTimeNanos", "remainingTimeNanos", "Lru/ozon/app/android/travel/utils/animator/LinearFloatAnimator$State;", "state", "Lru/ozon/app/android/travel/utils/animator/LinearFloatAnimator$State;", "getDurationNanos", "durationNanos", "Companion", "State", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LinearFloatAnimator implements Choreographer.FrameCallback {
    private AnimatorListener listener;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private long duration = 100;
    private long startTimeNanos = -1;
    private long remainingTimeNanos = -1;

    @NotNull
    private State state = State.CANCELED;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/utils/animator/LinearFloatAnimator$Companion;", "", "<init>", "()V", "DEFAULT_DURATION", "", "NANOS_PER_MS", "MAX_VALUE", "", "NO_TIME", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/utils/animator/LinearFloatAnimator$State;", "", "<init>", "(Ljava/lang/String;I)V", "CANCELED", "RUNNING", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CANCELED = new State("CANCELED", 0);
        public static final State RUNNING = new State("RUNNING", 1);

        private static final /* synthetic */ State[] $values() {
            return new State[]{CANCELED, RUNNING};
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

    private final void cancelInternal() {
        this.state = State.CANCELED;
        this.startTimeNanos = -1L;
        Choreographer.getInstance().removeFrameCallback(this);
    }

    private final void finishAnimation() {
        if (this.state == State.CANCELED) {
            return;
        }
        cancelInternal();
        AnimatorListener animatorListener = this.listener;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd();
        }
    }

    private final long getDurationNanos() {
        return this.duration * 1000000;
    }

    private final void postFrameCallback() {
        Choreographer.getInstance().postFrameCallback(this);
    }

    public final void cancel() {
        cancelInternal();
        AnimatorListener animatorListener = this.listener;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.state == State.CANCELED) {
            return;
        }
        if (this.duration <= 0) {
            cancel();
            return;
        }
        postFrameCallback();
        if (this.startTimeNanos == -1) {
            this.startTimeNanos = frameTimeNanos;
            return;
        }
        long durationNanos = getDurationNanos() - (frameTimeNanos - this.startTimeNanos);
        this.remainingTimeNanos = durationNanos;
        if (durationNanos <= 0) {
            AnimatorListener animatorListener = this.listener;
            if (animatorListener != null) {
                animatorListener.onAnimationUpdate(1.0f);
            }
            finishAnimation();
            return;
        }
        AnimatorListener animatorListener2 = this.listener;
        if (animatorListener2 != null) {
            animatorListener2.onAnimationUpdate((frameTimeNanos - r4) / getDurationNanos());
        }
    }

    public final void setDuration(long j11) {
        this.duration = j11;
    }

    public final void setListener(AnimatorListener animatorListener) {
        this.listener = animatorListener;
    }

    public final void start() {
        State state = this.state;
        this.state = State.RUNNING;
        if (state == State.CANCELED) {
            postFrameCallback();
        }
    }
}
