package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;

/* compiled from: NonBouncedAppBarLayout.java */
/* loaded from: classes13.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout b;
    public final /* synthetic */ NonBouncedAppBarLayout c;
    public final /* synthetic */ NonBouncedAppBarLayout.Behavior d;

    public d(NonBouncedAppBarLayout.Behavior behavior, CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout) {
        this.d = behavior;
        this.b = coordinatorLayout;
        this.c = nonBouncedAppBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.d.M(this.b, this.c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
