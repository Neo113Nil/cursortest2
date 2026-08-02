package ru.ozon.app.android.travel.molecules.view.searchPreloader.animator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.List;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/searchPreloader/animator/SearchPreloaderAnimator;", "", "", "", "titles", "", "durationAllocation", "<init>", "([Ljava/lang/String;[F)V", "Lxe/M;", "scope", "progressPoints", "", "Landroid/animation/Animator;", "getAnimations", "(Lxe/M;[F)Ljava/util/List;", "", "start", "end", "Landroid/animation/ValueAnimator;", "newAnimator", "(Lxe/M;FF)Landroid/animation/ValueAnimator;", "", "width", "getProgressPoints", "(I)[F", "coroutineScope", "progressEndPoint", "", "startAnimation", "(Lxe/M;I)V", "stopAnimation", "()V", "[Ljava/lang/String;", "[F", "Landroidx/lifecycle/V;", "titleProgress", "Landroidx/lifecycle/V;", "getTitleProgress", "()Landroidx/lifecycle/V;", "animationProgress", "getAnimationProgress", "Lxe/B0;", "animationJob", "Lxe/B0;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchPreloaderAnimator {
    private B0 animationJob;

    @NotNull
    private final V<Float> animationProgress;

    @NotNull
    private final float[] durationAllocation;

    @NotNull
    private final V<String> titleProgress;

    @NotNull
    private final String[] titles;

    public SearchPreloaderAnimator(@NotNull String[] titles, @NotNull float[] durationAllocation) {
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(durationAllocation, "durationAllocation");
        this.titles = titles;
        this.durationAllocation = durationAllocation;
        this.titleProgress = new V<>();
        this.animationProgress = new V<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Animator> getAnimations(M scope, float[] progressPoints) {
        Intrinsics.checkNotNullParameter(progressPoints, "<this>");
        IntRange intRange = new IntRange(0, progressPoints.length - 2, 1);
        ArrayList arrayList = new ArrayList(C7714v.z(intRange, 10));
        C7665d it = intRange.iterator();
        while (it.hasNext()) {
            int b11 = it.b();
            arrayList.add(newAnimator(scope, progressPoints[b11], progressPoints[b11 + 1]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float[] getProgressPoints(int width) {
        int length = this.durationAllocation.length;
        float[] fArr = new float[length];
        for (int i11 = 0; i11 < length; i11++) {
            fArr[i11] = this.durationAllocation[i11] * width;
        }
        return fArr;
    }

    private final ValueAnimator newAnimator(final M scope, float start, float end) {
        final ValueAnimator duration = ValueAnimator.ofFloat(start, end).setDuration(1500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.travel.molecules.view.searchPreloader.animator.SearchPreloaderAnimator$newAnimator$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!N.f(M.this)) {
                    duration.removeUpdateListener(this);
                    return;
                }
                V<Float> animationProgress = this.getAnimationProgress();
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                animationProgress.setValue((Float) animatedValue);
            }
        });
        Intrinsics.checkNotNullExpressionValue(duration, "apply(...)");
        return duration;
    }

    @NotNull
    public V<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    @NotNull
    public V<String> getTitleProgress() {
        return this.titleProgress;
    }

    public final void startAnimation(@NotNull M coroutineScope, int progressEndPoint) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        if (this.animationJob != null) {
            return;
        }
        this.animationJob = C10727i.c(coroutineScope, null, null, new SearchPreloaderAnimator$startAnimation$1(this, progressEndPoint, coroutineScope, null), 3);
    }

    public final void stopAnimation() {
        B0 b02 = this.animationJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.animationJob = null;
    }
}
