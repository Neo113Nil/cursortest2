package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.plaid.internal.EnumC3631g;
import ia.c;
import ja.AbstractC5104a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l0.AbstractC5338c;
import la.d;
import la.f;
import za.h;

/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: o, reason: collision with root package name */
    public static final int f34869o = c.f48214S;

    /* renamed from: p, reason: collision with root package name */
    public static final int f34870p = c.f48217V;

    /* renamed from: q, reason: collision with root package name */
    public static final int f34871q = c.f48225b0;

    /* renamed from: a, reason: collision with root package name */
    public f f34872a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f34873b;

    /* renamed from: c, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f34874c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34875d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f34876e;

    /* renamed from: f, reason: collision with root package name */
    public int f34877f;

    /* renamed from: g, reason: collision with root package name */
    public int f34878g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f34879h;

    /* renamed from: i, reason: collision with root package name */
    public TimeInterpolator f34880i;

    /* renamed from: j, reason: collision with root package name */
    public int f34881j;

    /* renamed from: k, reason: collision with root package name */
    public int f34882k;

    /* renamed from: l, reason: collision with root package name */
    public int f34883l;

    /* renamed from: m, reason: collision with root package name */
    public ViewPropertyAnimator f34884m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34885n;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f34874c == null || HideViewOnScrollBehavior.this.f34873b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f34873b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f34874c);
            HideViewOnScrollBehavior.this.f34874c = null;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f34884m = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f34875d = true;
        this.f34876e = new LinkedHashSet();
        this.f34881j = 0;
        this.f34882k = 2;
        this.f34883l = 0;
        this.f34885n = false;
    }

    public static /* synthetic */ void I(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z10) {
        if (hideViewOnScrollBehavior.f34875d && z10 && hideViewOnScrollBehavior.S()) {
            hideViewOnScrollBehavior.V(view);
        }
    }

    private void N(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f34884m = this.f34872a.d(view, i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    private void O(final View view) {
        if (this.f34873b == null) {
            this.f34873b = (AccessibilityManager) AbstractC5338c.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f34873b == null || this.f34874c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: la.e
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideViewOnScrollBehavior.I(HideViewOnScrollBehavior.this, view, z10);
            }
        };
        this.f34874c = touchExplorationStateChangeListener;
        this.f34873b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private void Z(View view, int i10) {
        this.f34882k = i10;
        Iterator it = this.f34876e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public final boolean P(int i10) {
        return i10 == 80 || i10 == 81;
    }

    public final boolean Q(int i10) {
        return i10 == 3 || i10 == 19;
    }

    public boolean R() {
        return this.f34882k == 2;
    }

    public boolean S() {
        return this.f34882k == 1;
    }

    public final void T(View view, int i10) {
        if (this.f34885n) {
            return;
        }
        int i11 = ((CoordinatorLayout.f) view.getLayoutParams()).f18782c;
        if (P(i11)) {
            U(1);
        } else {
            U(Q(Gravity.getAbsoluteGravity(i11, i10)) ? 2 : 0);
        }
    }

    public final void U(int i10) {
        f fVar = this.f34872a;
        if (fVar == null || fVar.c() != i10) {
            if (i10 == 0) {
                this.f34872a = new d();
                return;
            }
            if (i10 == 1) {
                this.f34872a = new la.b();
                return;
            }
            if (i10 == 2) {
                this.f34872a = new la.c();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i10 + ". Must be 0, 1 or 2.");
        }
    }

    public void V(View view) {
        W(view, true);
    }

    public void W(View view, boolean z10) {
        if (R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34884m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Z(view, 2);
        int b10 = this.f34872a.b();
        if (z10) {
            N(view, b10, this.f34877f, this.f34879h);
        } else {
            this.f34872a.e(view, b10);
        }
    }

    public void X(View view) {
        Y(view, true);
    }

    public void Y(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (S()) {
            return;
        }
        if (this.f34875d && (accessibilityManager = this.f34873b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34884m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Z(view, 1);
        int i10 = this.f34881j + this.f34883l;
        if (z10) {
            N(view, i10, this.f34878g, this.f34880i);
        } else {
            this.f34872a.e(view, i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        O(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        T(view, i10);
        this.f34881j = this.f34872a.a(view, marginLayoutParams);
        this.f34877f = h.f(view.getContext(), f34869o, 225);
        this.f34878g = h.f(view.getContext(), f34870p, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
        Context context = view.getContext();
        int i11 = f34871q;
        this.f34879h = h.g(context, i11, AbstractC5104a.f53861d);
        this.f34880i = h.g(view.getContext(), i11, AbstractC5104a.f53860c);
        return super.p(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            X(view);
        } else if (i11 < 0) {
            V(view);
        }
    }

    public HideViewOnScrollBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34875d = true;
        this.f34876e = new LinkedHashSet();
        this.f34881j = 0;
        this.f34882k = 2;
        this.f34883l = 0;
        this.f34885n = false;
    }
}
