package net.cachapa.expandablelayout;

import android.animation.ValueAnimator;

/* loaded from: classes10.dex */
final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ExpandableLayout f77096a;

    a(ExpandableLayout expandableLayout) {
        this.f77096a = expandableLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f77096a.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
