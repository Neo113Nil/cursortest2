package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import V4.C4073b;
import V4.C4075d;
import V4.l;
import V4.n;
import V4.p;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.view.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0013JW\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/TransitionAnimator;", "", "<init>", "()V", "", "fadeDuration", "changeBoundsDuration", "Landroid/view/animation/Interpolator;", "transitionInterpolator", "LV4/l;", "configureTransitionWithDurations", "(JJLandroid/view/animation/Interpolator;)LV4/l;", "Landroid/view/ViewGroup;", "rootView", "Lkotlin/Function0;", "", "goToNewState", "transition", "animateInstantly", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;LV4/l;)V", "animateWhenRootIsReady", "onAnimationCompleted", "interpolator", "", "animate", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JJLandroid/view/animation/Interpolator;Z)V", "stopAnimation", "(Landroid/view/ViewGroup;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransitionAnimator {

    @NotNull
    public static final TransitionAnimator INSTANCE = new TransitionAnimator();

    private TransitionAnimator() {
    }

    public static /* synthetic */ void animate$default(TransitionAnimator transitionAnimator, ViewGroup viewGroup, Function0 function0, Function0 function02, long j11, long j12, Interpolator interpolator, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function02 = null;
        }
        transitionAnimator.animate(viewGroup, function0, function02, j11, j12, interpolator, (i11 & 64) != 0 ? false : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInstantly(ViewGroup rootView, Function0<Unit> goToNewState, l transition) {
        n.a(rootView, transition);
        goToNewState.invoke();
    }

    private final void animateWhenRootIsReady(final ViewGroup rootView, final Function0<Unit> goToNewState, final l transition) {
        G.a(rootView, new Runnable() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.TransitionAnimator$animateWhenRootIsReady$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                TransitionAnimator.INSTANCE.animateInstantly(rootView, goToNewState, transition);
            }
        });
    }

    private final l configureTransitionWithDurations(long fadeDuration, long changeBoundsDuration, Interpolator transitionInterpolator) {
        p pVar = new p();
        pVar.f(0);
        C4075d c4075d = new C4075d();
        c4075d.setDuration(fadeDuration);
        c4075d.setInterpolator(transitionInterpolator);
        C4073b c4073b = new C4073b();
        c4073b.setDuration(changeBoundsDuration);
        c4073b.setInterpolator(transitionInterpolator);
        pVar.a(c4075d);
        pVar.a(c4073b);
        return pVar;
    }

    public final void animate(@NotNull ViewGroup rootView, @NotNull Function0<Unit> goToNewState, final Function0<Unit> onAnimationCompleted, long fadeDuration, long changeBoundsDuration, @NotNull Interpolator interpolator, boolean animateInstantly) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(goToNewState, "goToNewState");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        l configureTransitionWithDurations = configureTransitionWithDurations(fadeDuration, changeBoundsDuration, interpolator);
        configureTransitionWithDurations.addListener(new l.f() { // from class: ru.ozon.app.android.search.searchscreen.presentation.fragment.TransitionAnimator$animate$1
            @Override // V4.l.f
            public void onTransitionCancel(l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
            }

            @Override // V4.l.f
            public void onTransitionEnd(l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                Function0<Unit> function0 = onAnimationCompleted;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // V4.l.f
            public void onTransitionPause(l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
            }

            @Override // V4.l.f
            public void onTransitionResume(l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
            }

            @Override // V4.l.f
            public void onTransitionStart(l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
            }
        });
        if (animateInstantly) {
            animateInstantly(rootView, goToNewState, configureTransitionWithDurations);
        } else {
            animateWhenRootIsReady(rootView, goToNewState, configureTransitionWithDurations);
        }
    }

    public final void stopAnimation(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        n.b(rootView);
    }
}
