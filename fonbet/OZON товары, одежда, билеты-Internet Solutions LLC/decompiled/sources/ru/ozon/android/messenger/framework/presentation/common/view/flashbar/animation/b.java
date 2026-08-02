package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AnimatorSet f91164a;

    public interface a {
        void onStart();

        void onStop();

        void onUpdate();
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b$b, reason: collision with other inner class name */
    public static final class C1702b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f91165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f91166b;

        C1702b(a aVar, ObjectAnimator objectAnimator) {
            this.f91165a = aVar;
            this.f91166b = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f91165a.onStop();
            ObjectAnimator objectAnimator = this.f91166b;
            objectAnimator.removeAllListeners();
            objectAnimator.removeAllUpdateListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f91165a.onStart();
        }
    }

    public b(@NotNull AnimatorSet compositeAnim) {
        Intrinsics.checkNotNullParameter(compositeAnim, "compositeAnim");
        this.f91164a = compositeAnim;
    }

    public final void a(a aVar) {
        AnimatorSet animatorSet = this.f91164a;
        Animator animator = animatorSet.getChildAnimations().get(0);
        Intrinsics.g(animator, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        ObjectAnimator objectAnimator = (ObjectAnimator) animator;
        objectAnimator.addListener(new C1702b(aVar, objectAnimator));
        objectAnimator.addUpdateListener(new CF.a(aVar, 1));
        animatorSet.start();
    }
}
