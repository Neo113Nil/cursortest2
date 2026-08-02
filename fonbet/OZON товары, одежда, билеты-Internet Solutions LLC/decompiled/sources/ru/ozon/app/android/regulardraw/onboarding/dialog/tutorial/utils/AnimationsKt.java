package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000\u001a,\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¨\u0006\n"}, d2 = {"fadeInWithCallback", "", "Landroid/view/View;", "duration", "", "onEndAction", "Lkotlin/Function0;", "fadeOutAndRemove", "rootView", "Landroid/view/ViewGroup;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimationsKt {
    public static final void fadeInWithCallback(@NotNull View view, long j11, @NotNull final Function0<Unit> onEndAction) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onEndAction, "onEndAction");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(j11);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt$fadeInWithCallback$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                onEndAction.invoke();
            }
        });
        ofFloat.start();
    }

    public static /* synthetic */ void fadeInWithCallback$default(View view, long j11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 250;
        }
        fadeInWithCallback(view, j11, function0);
    }

    public static final void fadeOutAndRemove(@NotNull final View view, long j11, @NotNull final ViewGroup rootView, @NotNull final Function0<Unit> onEndAction) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(onEndAction, "onEndAction");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(j11);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt$fadeOutAndRemove$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                rootView.removeView(view);
                onEndAction.invoke();
            }
        });
        ofFloat.start();
    }

    public static /* synthetic */ void fadeOutAndRemove$default(View view, long j11, ViewGroup viewGroup, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 500;
        }
        fadeOutAndRemove(view, j11, viewGroup, function0);
    }
}
