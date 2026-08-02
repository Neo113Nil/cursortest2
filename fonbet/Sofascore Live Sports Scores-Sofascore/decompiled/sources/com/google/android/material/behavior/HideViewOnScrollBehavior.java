package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.aa9;
import defpackage.e80;
import defpackage.fz7;
import defpackage.lnb;
import defpackage.oyn;
import defpackage.us3;
import defpackage.x2a;
import defpackage.xs3;
import defpackage.y00;
import defpackage.yfa;
import defpackage.z99;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends us3 {
    public oyn a;
    public AccessibilityManager b;
    public z99 c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;
    public int l = 0;
    public int m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.us3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
            this.b = accessibilityManager;
        }
        if (accessibilityManager != null && this.c == null) {
            z99 z99Var = new z99(this, view, 1);
            this.c = z99Var;
            accessibilityManager.addTouchExplorationStateChangeListener(z99Var);
            view.addOnAttachStateChangeListener(new y00(this, 5));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((xs3) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.H(view, marginLayoutParams);
        this.e = x2a.M(view.getContext(), R.attr.motionDurationLong2, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f = x2a.M(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = yfa.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, e80.d);
        this.h = yfa.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, e80.c);
        return false;
    }

    @Override // defpackage.us3
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                x(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            y(1, view);
            this.k = this.a.J(this.i, view).setInterpolator(this.h).setDuration(this.f).setListener(new fz7(this, view, false, 2));
        }
    }

    @Override // defpackage.us3
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(int i) {
        oyn oynVar = this.a;
        if (oynVar == null || oynVar.I() != i) {
            if (i == 0) {
                this.a = new aa9(2);
                return;
            }
            if (i == 1) {
                this.a = new aa9(0);
            } else if (i == 2) {
                this.a = new aa9(1);
            } else {
                a70.p(lnb.k(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
        }
    }

    public final void x(View view) {
        if (this.j == 2) {
            return;
        }
        y(2, view);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.a.getClass();
        this.k = this.a.J(0, view).setInterpolator(this.g).setDuration(this.e).setListener(new fz7(this, view, false, 2));
    }

    public final void y(int i, View view) {
        this.j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }

    public HideViewOnScrollBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
