package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0002\f\rJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage;", "", "translationX", "", "view", "Landroid/view/View;", "start", "", "end", "translationY", "rotation", "alpha", "Animators", "Base", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Stage {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage$Animators;", "", "animatorSet", "Landroid/animation/AnimatorSet;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Animators {
        @NotNull
        AnimatorSet animatorSet();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage$Base;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage$Animators;", "startDelay", "", "duration", "<init>", "(JJ)V", "animators", "", "Landroid/animation/Animator;", "translationX", "", "view", "Landroid/view/View;", "start", "", "end", "translationY", "rotation", "alpha", "animatorSet", "Landroid/animation/AnimatorSet;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Base implements Stage, Animators {

        @NotNull
        private final List<Animator> animators = new ArrayList();
        private final long duration;
        private final long startDelay;

        public Base(long j11, long j12) {
            this.startDelay = j11;
            this.duration = j12;
        }

        @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.Stage
        public void alpha(@NotNull View view, float start, float end) {
            Intrinsics.checkNotNullParameter(view, "view");
            List<Animator> list = this.animators;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", start, end);
            Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
            list.add(ofFloat);
        }

        @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.Stage.Animators
        @NotNull
        public AnimatorSet animatorSet() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(this.startDelay);
            animatorSet.setDuration(this.duration);
            animatorSet.playTogether(this.animators);
            return animatorSet;
        }

        @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.Stage
        public void rotation(@NotNull View view, float start, float end) {
            Intrinsics.checkNotNullParameter(view, "view");
            List<Animator> list = this.animators;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", start, end);
            Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
            list.add(ofFloat);
        }

        @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.Stage
        public void translationX(@NotNull View view, float start, float end) {
            Intrinsics.checkNotNullParameter(view, "view");
            List<Animator> list = this.animators;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", start, end);
            Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
            list.add(ofFloat);
        }

        @Override // ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.Stage
        public void translationY(@NotNull View view, float start, float end) {
            Intrinsics.checkNotNullParameter(view, "view");
            List<Animator> list = this.animators;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", start, end);
            Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
            list.add(ofFloat);
        }
    }

    void alpha(@NotNull View view, float start, float end);

    void rotation(@NotNull View view, float start, float end);

    void translationX(@NotNull View view, float start, float end);

    void translationY(@NotNull View view, float start, float end);
}
