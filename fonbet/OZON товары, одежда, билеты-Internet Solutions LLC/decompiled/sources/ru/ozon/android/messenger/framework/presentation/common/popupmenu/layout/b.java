package ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout;

import android.animation.Animator;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f90934a;

    public b(View view) {
        this.f90934a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@NotNull Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animator) {
        this.f90934a.setVisibility(0);
    }
}
