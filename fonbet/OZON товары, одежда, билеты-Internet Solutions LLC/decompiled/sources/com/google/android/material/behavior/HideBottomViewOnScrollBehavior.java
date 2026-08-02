package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j7.C7292a;

/* loaded from: classes9.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    private int f57990a;

    /* renamed from: b, reason: collision with root package name */
    private int f57991b;

    /* renamed from: c, reason: collision with root package name */
    private ViewPropertyAnimator f57992c;

    public HideBottomViewOnScrollBehavior() {
        this.f57990a = 0;
        this.f57991b = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        this.f57990a = v11.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v11.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v11, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        if (i12 > 0) {
            if (this.f57991b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f57992c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v11.clearAnimation();
            }
            this.f57991b = 1;
            this.f57992c = v11.animate().translationY(this.f57990a).setInterpolator(C7292a.f69465c).setDuration(175L).setListener(new a(this));
            return;
        }
        if (i12 >= 0 || this.f57991b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f57992c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v11.clearAnimation();
        }
        this.f57991b = 2;
        this.f57992c = v11.animate().translationY(0).setInterpolator(C7292a.f69466d).setDuration(225L).setListener(new a(this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        return i11 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57990a = 0;
        this.f57991b = 2;
    }
}
