package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import androidx.core.view.E;
import androidx.core.view.F0;
import androidx.core.view.J;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.i;
import com.google.android.material.shape.j;
import ia.l;
import ia.m;
import ja.AbstractC5104a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import ka.h;
import n.AbstractC5596a;
import n0.AbstractC5597a;
import s0.AbstractC6307a;
import sa.AbstractC6344a;
import x0.AbstractC6773b;
import y0.z;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: A, reason: collision with root package name */
    public static final int f34696A = l.f48573l;

    /* renamed from: a, reason: collision with root package name */
    public int f34697a;

    /* renamed from: b, reason: collision with root package name */
    public int f34698b;

    /* renamed from: c, reason: collision with root package name */
    public int f34699c;

    /* renamed from: d, reason: collision with root package name */
    public int f34700d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34701e;

    /* renamed from: f, reason: collision with root package name */
    public int f34702f;

    /* renamed from: g, reason: collision with root package name */
    public F0 f34703g;

    /* renamed from: h, reason: collision with root package name */
    public List f34704h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f34705i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34706j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34707k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f34708l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f34709m;

    /* renamed from: n, reason: collision with root package name */
    public int f34710n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f34711o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f34712p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f34713q;

    /* renamed from: r, reason: collision with root package name */
    public final List f34714r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f34715s;

    /* renamed from: t, reason: collision with root package name */
    public final long f34716t;
    private int[] tmpStatesArray;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f34717u;

    /* renamed from: v, reason: collision with root package name */
    public int f34718v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f34719w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f34720x;

    /* renamed from: y, reason: collision with root package name */
    public final float f34721y;

    /* renamed from: z, reason: collision with root package name */
    public Behavior f34722z;

    public static class BaseBehavior<T extends AppBarLayout> extends ka.d {

        /* renamed from: k, reason: collision with root package name */
        public int f34723k;

        /* renamed from: l, reason: collision with root package name */
        public int f34724l;

        /* renamed from: m, reason: collision with root package name */
        public ValueAnimator f34725m;

        /* renamed from: n, reason: collision with root package name */
        public SavedState f34726n;

        /* renamed from: o, reason: collision with root package name */
        public WeakReference f34727o;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f34733a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f34734b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f34733a = coordinatorLayout;
                this.f34734b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f34733a, this.f34734b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b extends C2075a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f34736a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f34737b;

            public b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f34736a = appBarLayout;
                this.f34737b = coordinatorLayout;
            }

            @Override // androidx.core.view.C2075a
            public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
                View j02;
                super.onInitializeAccessibilityNodeInfo(view, zVar);
                zVar.w0(ScrollView.class.getName());
                if (this.f34736a.getTotalScrollRange() == 0 || (j02 = BaseBehavior.this.j0(this.f34737b)) == null || !BaseBehavior.this.f0(this.f34736a)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.f34736a.getTotalScrollRange())) {
                    zVar.b(z.a.f68231q);
                    zVar.T0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!j02.canScrollVertically(-1)) {
                        zVar.b(z.a.f68232r);
                        zVar.T0(true);
                    } else if ((-this.f34736a.getDownNestedPreScrollRange()) != 0) {
                        zVar.b(z.a.f68232r);
                        zVar.T0(true);
                    }
                }
            }

            @Override // androidx.core.view.C2075a
            public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f34736a.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.performAccessibilityAction(view, i10, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View j02 = BaseBehavior.this.j0(this.f34737b);
                    if (!j02.canScrollVertically(-1)) {
                        this.f34736a.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f34736a.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.u(this.f34737b, this.f34736a, j02, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        public static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        public static View h0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int Q10 = Q() - topInset;
            int i02 = i0(appBarLayout, Q10);
            if (i02 >= 0) {
                View childAt = appBarLayout.getChildAt(i02);
                e eVar = (e) childAt.getLayoutParams();
                int c10 = eVar.c();
                if ((c10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (i02 == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        i10 -= appBarLayout.getTopInset();
                    }
                    if (e0(c10, 2)) {
                        i11 += childAt.getMinimumHeight();
                    } else if (e0(c10, 5)) {
                        int minimumHeight = childAt.getMinimumHeight() + i11;
                        if (Q10 < minimumHeight) {
                            i10 = minimumHeight;
                        } else {
                            i11 = minimumHeight;
                        }
                    }
                    if (e0(c10, 32)) {
                        i10 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    Z(coordinatorLayout, appBarLayout, AbstractC6307a.b(b0(Q10, i11, i10) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View h02 = h0(appBarLayout, i10);
            boolean z11 = false;
            if (h02 != null) {
                int c10 = ((e) h02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int minimumHeight = h02.getMinimumHeight();
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (h02.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i10) >= (h02.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (appBarLayout.q()) {
                z11 = appBarLayout.G(g0(coordinatorLayout));
            }
            boolean D10 = appBarLayout.D(z11);
            if (z10 || (D10 && z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // ka.d
        public int Q() {
            return I() + this.f34723k;
        }

        public final void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (AbstractC2082d0.N(coordinatorLayout)) {
                return;
            }
            AbstractC2082d0.l0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        public final void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int abs = Math.abs(Q() - i10);
            float abs2 = Math.abs(f10);
            a0(coordinatorLayout, appBarLayout, i10, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        public final void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int Q10 = Q();
            if (Q10 == i10) {
                ValueAnimator valueAnimator = this.f34725m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f34725m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f34725m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f34725m = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC5104a.f53862e);
                this.f34725m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f34725m.setDuration(Math.min(i11, 600));
            this.f34725m.setIntValues(Q10, i10);
            this.f34725m.start();
        }

        public final int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        @Override // ka.d
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f34727o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.m() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        public final boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f34742a != 0) {
                    return true;
                }
            }
            return false;
        }

        public final View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof E) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int i0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (e0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        public final View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // ka.d
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        @Override // ka.d
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        public final int m0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d10 = eVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (d10 != null) {
                    int c10 = eVar.c();
                    if ((c10 & 1) != 0) {
                        i11 = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((c10 & 2) != 0) {
                            i11 -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        i11 -= appBarLayout.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation((abs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        @Override // ka.d
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.q()) {
                appBarLayout.D(appBarLayout.G(g0(coordinatorLayout)));
            }
        }

        @Override // ka.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean p10 = super.p(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f34726n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            Z(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f34728c) {
                T(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f34729d) {
                T(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f34730e);
                T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f34726n.f34732g ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f34726n.f34731f)));
            }
            appBarLayout.z();
            this.f34726n = null;
            K(AbstractC6307a.b(I(), -appBarLayout.getTotalScrollRange(), 0));
            B0(coordinatorLayout, appBarLayout, I(), 0, true);
            appBarLayout.v(I());
            Y(coordinatorLayout, appBarLayout);
            return p10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.F(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            AppBarLayout appBarLayout2;
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    i14 = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                int i15 = i13;
                int i16 = i14;
                if (i15 != i16) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = S(coordinatorLayout, appBarLayout2, i11, i15, i16);
                    if (appBarLayout2.q()) {
                        return;
                    }
                    appBarLayout2.D(appBarLayout2.G(view));
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (appBarLayout2.q()) {
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
                iArr[1] = S(coordinatorLayout2, appBarLayout2, i15, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
            }
            if (i15 == 0) {
                Y(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                w0((SavedState) parcelable, true);
                super.B(coordinatorLayout, appBarLayout, this.f34726n.a());
            } else {
                super.B(coordinatorLayout, appBarLayout, parcelable);
                this.f34726n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable C10 = super.C(coordinatorLayout, appBarLayout);
            SavedState x02 = x0(C10, appBarLayout);
            return x02 == null ? C10 : x02;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.q() || appBarLayout.s() || d0(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f34725m) != null) {
                valueAnimator.cancel();
            }
            this.f34727o = null;
            this.f34724l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f34724l == 0 || i10 == 1) {
                A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.q()) {
                    appBarLayout.D(appBarLayout.G(view));
                }
            }
            this.f34727o = new WeakReference(view);
        }

        public void w0(SavedState savedState, boolean z10) {
            if (this.f34726n == null || z10) {
                this.f34726n = savedState;
            }
        }

        public SavedState x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int I10 = I();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + I10;
                if (childAt.getTop() + I10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f19354b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = I10 == 0;
                    savedState.f34729d = z10;
                    savedState.f34728c = !z10 && (-I10) >= appBarLayout.getTotalScrollRange();
                    savedState.f34730e = i10;
                    savedState.f34732g = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    savedState.f34731f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // ka.d
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int Q10 = Q();
            int i13 = 0;
            if (i11 == 0 || Q10 < i11 || Q10 > i12) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f34723k = 0;
            } else {
                int b10 = AbstractC6307a.b(i10, i11, i12);
                if (Q10 != b10) {
                    int m02 = appBarLayout.k() ? m0(appBarLayout, b10) : b10;
                    boolean K10 = K(m02);
                    int i14 = Q10 - b10;
                    this.f34723k = b10 - m02;
                    if (K10) {
                        while (i13 < appBarLayout.getChildCount()) {
                            e eVar = (e) appBarLayout.getChildAt(i13).getLayoutParams();
                            c b11 = eVar.b();
                            if (b11 != null && (eVar.c() & 1) != 0) {
                                b11.a(appBarLayout, appBarLayout.getChildAt(i13), I());
                            }
                            i13++;
                        }
                    }
                    if (!K10 && appBarLayout.k()) {
                        coordinatorLayout.g(appBarLayout);
                    }
                    appBarLayout.v(I());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    B0(coordinatorLayout2, appBarLayout2, b10, b10 < Q10 ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            Y(coordinatorLayout2, appBarLayout2);
            return i13;
        }

        public final boolean z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List n10 = coordinatorLayout.n(appBarLayout);
            int size = n10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) ((View) n10.get(i10)).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).O() != 0;
                }
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            public boolean f34728c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f34729d;

            /* renamed from: e, reason: collision with root package name */
            public int f34730e;

            /* renamed from: f, reason: collision with root package name */
            public float f34731f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f34732g;

            public class a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f34728c = parcel.readByte() != 0;
                this.f34729d = parcel.readByte() != 0;
                this.f34730e = parcel.readInt();
                this.f34731f = parcel.readFloat();
                this.f34732g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f34728c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f34729d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f34730e);
                parcel.writeFloat(this.f34731f);
                parcel.writeByte(this.f34732g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // ka.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // ka.f
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // ka.f
        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        @Override // ka.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends ka.e {
        public ScrollingViewBehavior() {
        }

        public static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).Q();
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout L10 = L(coordinatorLayout.m(view));
            if (L10 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f54356d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    L10.A(false, !z10);
                    return true;
                }
            }
            return false;
        }

        @Override // ka.e
        public float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int V10 = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + V10 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (V10 / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // ka.e
        public int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        @Override // ka.e
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void W(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                AbstractC2082d0.W(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f34723k) + Q()) - M(view2));
            }
        }

        public final void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.q()) {
                    appBarLayout.D(appBarLayout.G(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC2082d0.l0(coordinatorLayout, null);
            }
        }

        @Override // ka.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // ka.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.ScrollingViewBehavior_Layout);
            S(obtainStyledAttributes.getDimensionPixelSize(m.f49046u5, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public class a implements J {
        public a() {
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            return AppBarLayout.this.w(f02);
        }
    }

    public interface b {
        void a(AppBarLayout appBarLayout, int i10);
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f34740a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f34741b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f34740a, appBarLayout, view);
            float abs = this.f34740a.top - Math.abs(f10);
            if (abs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float a10 = 1.0f - AbstractC6307a.a(Math.abs(abs / this.f34740a.height()), 0.0f, 1.0f);
            float height = (-abs) - ((this.f34740a.height() * 0.3f) * (1.0f - (a10 * a10)));
            view.setTranslationY(height);
            view.getDrawingRect(this.f34741b);
            this.f34741b.offset(0, (int) (-height));
            if (height >= this.f34741b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f34741b);
        }
    }

    public interface f extends b {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, i iVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        iVar.e0(floatValue);
        Drawable drawable = appBarLayout.f34719w;
        if (drawable instanceof i) {
            ((i) drawable).e0(floatValue);
        }
        Iterator it = appBarLayout.f34714r.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            iVar.E();
            throw null;
        }
        Iterator it2 = appBarLayout.f34715s.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            iVar.E();
            throw null;
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, i iVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int j10 = AbstractC6344a.j(appBarLayout.f34718v, colorStateList.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        iVar.f0(ColorStateList.valueOf(j10));
        if (appBarLayout.f34719w != null && (num2 = appBarLayout.f34720x) != null && num2.equals(num)) {
            appBarLayout.f34719w.setTint(j10);
        }
        if (!appBarLayout.f34714r.isEmpty()) {
            Iterator it = appBarLayout.f34714r.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                if (iVar.B() != null) {
                    throw null;
                }
            }
        }
        if (appBarLayout.f34715s.isEmpty()) {
            return;
        }
        Iterator it2 = appBarLayout.f34715s.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            throw null;
        }
    }

    public void A(boolean z10, boolean z11) {
        B(z10, z11, true);
    }

    public final void B(boolean z10, boolean z11, boolean z12) {
        this.f34702f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    public final boolean C(boolean z10) {
        if (this.f34706j == z10) {
            return false;
        }
        this.f34706j = z10;
        refreshDrawableState();
        return true;
    }

    public boolean D(boolean z10) {
        return E(z10, !this.f34705i);
    }

    public boolean E(boolean z10, boolean z11) {
        if (!z11 || this.f34707k == z10) {
            return false;
        }
        this.f34707k = z10;
        refreshDrawableState();
        if (!r()) {
            return true;
        }
        if (this.f34709m != null) {
            I(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f34708l) {
            return true;
        }
        I(z10 ? 0.0f : this.f34721y, z10 ? this.f34721y : 0.0f);
        return true;
    }

    public final boolean F() {
        return this.f34719w != null && getTopInset() > 0;
    }

    public boolean G(View view) {
        View g10 = g(view);
        if (g10 != null) {
            view = g10;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean H() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    public final void I(float f10, float f11) {
        ValueAnimator valueAnimator = this.f34712p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f34712p = ofFloat;
        ofFloat.setDuration(this.f34716t);
        this.f34712p.setInterpolator(this.f34717u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f34713q;
        if (animatorUpdateListener != null) {
            this.f34712p.addUpdateListener(animatorUpdateListener);
        }
        this.f34712p.start();
    }

    public final void J() {
        setWillNotDraw(!F());
    }

    public void c(b bVar) {
        if (this.f34704h == null) {
            this.f34704h = new ArrayList();
        }
        if (bVar == null || this.f34704h.contains(bVar)) {
            return;
        }
        this.f34704h.add(bVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(f fVar) {
        c(fVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (F()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f34697a);
            this.f34719w.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f34719w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e() {
        WeakReference weakReference = this.f34711o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f34711o = null;
    }

    public final Integer f() {
        Drawable drawable = this.f34719w;
        if (drawable instanceof i) {
            return Integer.valueOf(((i) drawable).E());
        }
        ColorStateList f10 = ua.d.f(drawable);
        if (f10 != null) {
            return Integer.valueOf(f10.getDefaultColor());
        }
        return null;
    }

    public final View g(View view) {
        int i10;
        if (this.f34711o == null && (i10 = this.f34710n) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f34710n);
            }
            if (findViewById != null) {
                this.f34711o = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.f34711o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f34722z = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i10;
        int minimumHeight;
        int i11 = this.f34699c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f34742a;
                if ((i13 & 5) != 5) {
                    if (i12 > 0) {
                        break;
                    }
                } else {
                    int i14 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i13 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i13 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i10 = i14 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i10 = Math.min(i10, measuredHeight - getTopInset());
                        }
                        i12 += i10;
                    }
                    i10 = i14 + minimumHeight;
                    if (childCount == 0) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
            }
        }
        int max = Math.max(0, i12);
        this.f34699c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f34700d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i13 = eVar.f34742a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    i12 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f34700d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f34710n;
    }

    public i getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof i) {
            return (i) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            return i10 < getHeight() ? i10 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i11 = (minimumHeight2 * 2) + topInset;
        return i11 < getHeight() ? i11 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f34702f;
    }

    public Drawable getStatusBarForeground() {
        return this.f34719w;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        F0 f02 = this.f34703g;
        if (f02 != null) {
            return f02.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f34698b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f34742a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    i12 -= getTopInset();
                }
                if ((i13 & 2) != 0) {
                    i12 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f34698b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public boolean k() {
        return this.f34701e;
    }

    public final boolean l() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        return getTotalScrollRange() != 0;
    }

    public final void n(final i iVar, final ColorStateList colorStateList) {
        final Integer f10 = AbstractC6344a.f(getContext(), ia.c.f48260t);
        this.f34713q = new ValueAnimator.AnimatorUpdateListener() { // from class: ka.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(AppBarLayout.this, colorStateList, iVar, f10, valueAnimator);
            }
        };
    }

    public final void o(Context context, final i iVar) {
        iVar.T(context);
        this.f34713q = new ValueAnimator.AnimatorUpdateListener() { // from class: ka.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(AppBarLayout.this, iVar, valueAnimator);
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f34706j;
        int i11 = ia.c.f48257r0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f34707k) ? ia.c.f48259s0 : -ia.c.f48259s0;
        int i12 = ia.c.f48251o0;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f34707k) ? ia.c.f48249n0 : -ia.c.f48249n0;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && H()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                AbstractC2082d0.W(getChildAt(childCount), topInset);
            }
        }
        p();
        this.f34701e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f34701e = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f34719w;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f34705i) {
            return;
        }
        if (!this.f34708l && !l()) {
            z11 = false;
        }
        C(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && H()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = AbstractC6307a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        p();
    }

    public final void p() {
        Behavior behavior = this.f34722z;
        BaseBehavior.SavedState x02 = (behavior == null || this.f34698b == -1 || this.f34702f != 0) ? null : behavior.x0(AbsSavedState.f19354b, this);
        this.f34698b = -1;
        this.f34699c = -1;
        this.f34700d = -1;
        if (x02 != null) {
            this.f34722z.w0(x02, false);
        }
    }

    public boolean q() {
        return this.f34708l;
    }

    public final boolean r() {
        return getBackground() instanceof i;
    }

    public boolean s() {
        return this.f34707k;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(u(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        j.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        A(z10, isLaidOut());
    }

    public void setLiftOnScroll(boolean z10) {
        this.f34708l = z10;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f34709m != colorStateList) {
            this.f34709m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f34710n = -1;
        if (view == null) {
            e();
        } else {
            this.f34711o = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f34710n = i10;
        e();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f34705i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setPendingAction(int i10) {
        this.f34702f = i10;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f34719w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f34719w = drawable != null ? drawable.mutate() : null;
            this.f34720x = f();
            Drawable drawable3 = this.f34719w;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f34719w.setState(getDrawableState());
                }
                AbstractC5597a.m(this.f34719w, getLayoutDirection());
                this.f34719w.setVisible(getVisibility() == 0, false);
                this.f34719w.setCallback(this);
            }
            J();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(AbstractC5596a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        h.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f34719w;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final i t(Drawable drawable) {
        if (drawable instanceof i) {
            return (i) drawable;
        }
        ColorStateList f10 = ua.d.f(drawable);
        if (f10 == null) {
            return null;
        }
        i iVar = new i();
        iVar.f0(f10);
        return iVar;
    }

    public final Drawable u(Context context, Drawable drawable) {
        i t10 = t(drawable);
        if (t10 == null || t10.B() == null) {
            return drawable;
        }
        this.f34718v = t10.B().getDefaultColor();
        ColorStateList colorStateList = this.f34709m;
        if (colorStateList != null) {
            n(t10, colorStateList);
            return t10;
        }
        o(context, t10);
        return t10;
    }

    public void v(int i10) {
        this.f34697a = i10;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f34704h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f34704h.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f34719w;
    }

    public F0 w(F0 f02) {
        F0 f03 = getFitsSystemWindows() ? f02 : null;
        if (!AbstractC6773b.a(this.f34703g, f03)) {
            this.f34703g = f03;
            J();
            requestLayout();
        }
        return f02;
    }

    public void x(b bVar) {
        List list = this.f34704h;
        if (list == null || bVar == null) {
            return;
        }
        list.remove(bVar);
    }

    public void y(f fVar) {
        x(fVar);
    }

    public void z() {
        this.f34702f = 0;
    }

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48222a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f34696A;
        this.f34698b = -1;
        this.f34699c = -1;
        this.f34700d = -1;
        this.f34702f = 0;
        this.f34714r = new ArrayList();
        this.f34715s = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            h.a(this);
        }
        h.c(this, attributeSet, i10, i11);
        TypedArray i12 = xa.l.i(context2, attributeSet, m.AppBarLayout, i10, i11, new int[0]);
        this.f34709m = Ca.c.a(context2, i12, m.f48900g);
        this.f34716t = za.h.f(context2, ia.c.f48216U, getResources().getInteger(ia.h.f48461a));
        this.f34717u = za.h.g(context2, ia.c.f48231e0, AbstractC5104a.f53858a);
        if (i12.hasValue(m.f48880e)) {
            B(i12.getBoolean(m.f48880e, false), false, false);
        }
        if (i12.hasValue(m.f48870d)) {
            h.b(this, i12.getDimensionPixelSize(m.f48870d, 0));
        }
        setBackground(i12.getDrawable(m.f48840a));
        if (Build.VERSION.SDK_INT >= 26) {
            if (i12.hasValue(m.f48860c)) {
                setKeyboardNavigationCluster(i12.getBoolean(m.f48860c, false));
            }
            if (i12.hasValue(m.f48850b)) {
                setTouchscreenBlocksFocus(i12.getBoolean(m.f48850b, false));
            }
        }
        this.f34721y = getResources().getDimension(ia.e.f48334c);
        this.f34708l = i12.getBoolean(m.f48890f, false);
        this.f34710n = i12.getResourceId(m.f48910h, -1);
        setStatusBarForeground(i12.getDrawable(m.f48920i));
        i12.recycle();
        AbstractC2082d0.x0(this, new a());
    }

    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f34742a;

        /* renamed from: b, reason: collision with root package name */
        public c f34743b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f34744c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34742a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.AppBarLayout_Layout);
            this.f34742a = obtainStyledAttributes.getInt(m.f48940k, 0);
            f(obtainStyledAttributes.getInt(m.f48930j, 0));
            if (obtainStyledAttributes.hasValue(m.f48950l)) {
                this.f34744c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(m.f48950l, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public final c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f34743b;
        }

        public int c() {
            return this.f34742a;
        }

        public Interpolator d() {
            return this.f34744c;
        }

        public boolean e() {
            int i10 = this.f34742a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f34743b = a(i10);
        }

        public void g(int i10) {
            this.f34742a = i10;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f34742a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34742a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f34742a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34742a = 1;
        }
    }
}
