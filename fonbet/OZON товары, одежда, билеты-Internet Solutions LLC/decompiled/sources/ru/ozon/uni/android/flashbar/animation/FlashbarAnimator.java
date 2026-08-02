package ru.ozon.uni.android.flashbar.animation;

import Ak0.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.animation.FlashbarAnimator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/flashbar/animation/FlashbarAnimator;", "", "compositeAnim", "Landroid/animation/AnimatorSet;", "<init>", "(Landroid/animation/AnimatorSet;)V", "start", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/uni/android/flashbar/animation/FlashbarAnimator$InternalAnimListener;", "start$uni_release", "Companion", "InternalAnimListener", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashbarAnimator {

    @NotNull
    private final AnimatorSet compositeAnim;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/flashbar/animation/FlashbarAnimator$Companion;", "", "<init>", "()V", "with", "Lru/ozon/uni/android/flashbar/animation/FlashbarAnimationBuilder;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FlashbarAnimationBuilder with() {
            return new FlashbarAnimationBuilder();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/flashbar/animation/FlashbarAnimator$InternalAnimListener;", "", "onStart", "", "onUpdate", "progress", "", "onStop", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InternalAnimListener {
        void onStart();

        void onStop();

        void onUpdate(float progress);
    }

    public FlashbarAnimator(@NotNull AnimatorSet compositeAnim) {
        Intrinsics.checkNotNullParameter(compositeAnim, "compositeAnim");
        this.compositeAnim = compositeAnim;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1$lambda$0(InternalAnimListener internalAnimListener, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internalAnimListener.onUpdate(it.getAnimatedFraction());
    }

    public final void start$uni_release(final InternalAnimListener listener) {
        if (listener != null) {
            Animator animator = this.compositeAnim.getChildAnimations().get(0);
            Intrinsics.g(animator, "null cannot be cast to non-null type android.animation.ObjectAnimator");
            final ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.uni.android.flashbar.animation.FlashbarAnimator$start$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                    Intrinsics.checkNotNullParameter(animator2, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    Intrinsics.checkNotNullParameter(animator2, "animator");
                    FlashbarAnimator.InternalAnimListener.this.onStop();
                    objectAnimator.removeAllListeners();
                    objectAnimator.removeAllUpdateListeners();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator2) {
                    Intrinsics.checkNotNullParameter(animator2, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    Intrinsics.checkNotNullParameter(animator2, "animator");
                    FlashbarAnimator.InternalAnimListener.this.onStart();
                }
            });
            objectAnimator.addUpdateListener(new a(listener, 0));
        }
        this.compositeAnim.start();
    }
}
