package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.plaid.internal.EnumC3631g;
import ia.c;
import ja.AbstractC5104a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l0.AbstractC5338c;
import za.h;

@Deprecated
/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: m, reason: collision with root package name */
    public static final int f34852m = c.f48214S;

    /* renamed from: n, reason: collision with root package name */
    public static final int f34853n = c.f48217V;

    /* renamed from: o, reason: collision with root package name */
    public static final int f34854o = c.f48225b0;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f34855a;

    /* renamed from: b, reason: collision with root package name */
    public int f34856b;

    /* renamed from: c, reason: collision with root package name */
    public int f34857c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f34858d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f34859e;

    /* renamed from: f, reason: collision with root package name */
    public int f34860f;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f34861g;

    /* renamed from: h, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f34862h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f34863i;

    /* renamed from: j, reason: collision with root package name */
    public int f34864j;

    /* renamed from: k, reason: collision with root package name */
    public int f34865k;

    /* renamed from: l, reason: collision with root package name */
    public ViewPropertyAnimator f34866l;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f34862h == null || HideBottomViewOnScrollBehavior.this.f34861g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f34861g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f34862h);
            HideBottomViewOnScrollBehavior.this.f34862h = null;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f34866l = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f34855a = new LinkedHashSet();
        this.f34860f = 0;
        this.f34863i = true;
        this.f34864j = 2;
        this.f34865k = 0;
    }

    public static /* synthetic */ void I(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z10) {
        if (!z10) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.P()) {
            hideBottomViewOnScrollBehavior.T(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public final void N(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f34866l = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    public final void O(final View view) {
        if (this.f34861g == null) {
            this.f34861g = (AccessibilityManager) AbstractC5338c.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f34861g == null || this.f34862h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: la.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideBottomViewOnScrollBehavior.I(HideBottomViewOnScrollBehavior.this, view, z10);
            }
        };
        this.f34862h = touchExplorationStateChangeListener;
        this.f34861g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    public boolean P() {
        return this.f34864j == 1;
    }

    public boolean Q() {
        return this.f34864j == 2;
    }

    public void R(View view) {
        S(view, true);
    }

    public void S(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (P()) {
            return;
        }
        if (this.f34863i && (accessibilityManager = this.f34861g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34866l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        V(view, 1);
        int i10 = this.f34860f + this.f34865k;
        if (z10) {
            N(view, i10, this.f34857c, this.f34859e);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void T(View view) {
        U(view, true);
    }

    public void U(View view, boolean z10) {
        if (Q()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34866l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        V(view, 2);
        if (z10) {
            N(view, 0, this.f34856b, this.f34858d);
        } else {
            view.setTranslationY(0);
        }
    }

    public final void V(View view, int i10) {
        this.f34864j = i10;
        Iterator it = this.f34855a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f34860f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f34856b = h.f(view.getContext(), f34852m, 225);
        this.f34857c = h.f(view.getContext(), f34853n, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
        Context context = view.getContext();
        int i11 = f34854o;
        this.f34858d = h.g(context, i11, AbstractC5104a.f53861d);
        this.f34859e = h.g(view.getContext(), i11, AbstractC5104a.f53860c);
        O(view);
        return super.p(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            R(view);
        } else if (i11 < 0) {
            T(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34855a = new LinkedHashSet();
        this.f34860f = 0;
        this.f34863i = true;
        this.f34864j = 2;
        this.f34865k = 0;
    }
}
