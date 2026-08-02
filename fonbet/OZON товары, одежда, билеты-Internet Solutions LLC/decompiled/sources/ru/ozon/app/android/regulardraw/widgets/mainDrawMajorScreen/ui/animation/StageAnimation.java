package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.Stage;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation;", "", "start", "", "doOnCompleted", "Lkotlin/Function0;", "Builder", "Default", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface StageAnimation {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation$Builder;", "", "", "startDelay", "duration", "Lkotlin/Function1;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage;", "", "buildStage", "addStage", "(JJLkotlin/jvm/functions/Function1;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation$Builder;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation;", "build", "()Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder {
        @NotNull
        Builder addStage(long startDelay, long duration, @NotNull Function1<? super Stage, Unit> buildStage);

        @NotNull
        StageAnimation build();
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation$Default;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation$Builder;", "<init>", "()V", "", "startDelay", "duration", "Lkotlin/Function1;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage;", "", "buildStage", "addStage", "(JJLkotlin/jvm/functions/Function1;)Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation$Builder;", "build", "()Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation;", "Lkotlin/Function0;", "doOnCompleted", "start", "(Lkotlin/jvm/functions/Function0;)V", "", "Landroid/animation/AnimatorSet;", "listOfStages", "Ljava/util/List;", "animation", "Landroid/animation/AnimatorSet;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements StageAnimation, Builder {

        @NotNull
        private final List<AnimatorSet> listOfStages = new ArrayList();

        @NotNull
        private final AnimatorSet animation = new AnimatorSet();

        @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.StageAnimation.Builder
        @NotNull
        public Builder addStage(long startDelay, long duration, @NotNull Function1<? super Stage, Unit> buildStage) {
            Intrinsics.checkNotNullParameter(buildStage, "buildStage");
            Stage.Base base = new Stage.Base(startDelay, duration);
            buildStage.invoke(base);
            this.listOfStages.add(base.animatorSet());
            return this;
        }

        @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.StageAnimation.Builder
        @NotNull
        public StageAnimation build() {
            AnimatorSet animatorSet = this.animation;
            List<AnimatorSet> list = this.listOfStages;
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
            animatorSet.playSequentially(list);
            return this;
        }

        @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.StageAnimation
        public void start(final Function0<Unit> doOnCompleted) {
            AnimatorSet animatorSet = this.animation;
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.StageAnimation$Default$start$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    animation.removeListener(this);
                    Function0<Unit> function0 = doOnCompleted;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }
            });
            animatorSet.start();
        }
    }

    void start(Function0<Unit> doOnCompleted);
}
