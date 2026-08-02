package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5305a;
import androidx.core.view.C5353y0;
import androidx.core.view.InterfaceC5352y;
import androidx.core.view.Y;
import i7.C7017a;
import j7.C7292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ru.ozon.app.android.R;
import s7.C9619n;
import y2.q;
import y7.C10856g;
import y7.C10857h;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    private int f57882a;

    /* renamed from: b, reason: collision with root package name */
    private int f57883b;

    /* renamed from: c, reason: collision with root package name */
    private int f57884c;

    /* renamed from: d, reason: collision with root package name */
    private int f57885d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f57886e;

    /* renamed from: f, reason: collision with root package name */
    private int f57887f;

    /* renamed from: g, reason: collision with root package name */
    private C5353y0 f57888g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f57889h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f57890i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57891j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f57892k;

    /* renamed from: l, reason: collision with root package name */
    private int f57893l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<View> f57894m;

    /* renamed from: n, reason: collision with root package name */
    private ValueAnimator f57895n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f57896o;

    /* renamed from: p, reason: collision with root package name */
    private int[] f57897p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f57898q;

    /* renamed from: r, reason: collision with root package name */
    private Behavior f57899r;

    /* JADX INFO: Access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends h<T> {

        /* renamed from: j, reason: collision with root package name */
        private int f57900j;

        /* renamed from: k, reason: collision with root package name */
        private int f57901k;

        /* renamed from: l, reason: collision with root package name */
        private ValueAnimator f57902l;

        /* renamed from: m, reason: collision with root package name */
        private b f57903m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference<View> f57904n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f57905o;

        final class a extends C5305a {
            a() {
            }

            @Override // androidx.core.view.C5305a
            public final void onInitializeAccessibilityNodeInfo(View view, @NonNull q qVar) {
                super.onInitializeAccessibilityNodeInfo(view, qVar);
                qVar.m0(BaseBehavior.this.f57905o);
                qVar.K(ScrollView.class.getName());
            }
        }

        public BaseBehavior() {
        }

        private void n(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i11) {
            int abs = Math.abs(c() - i11);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int c11 = c();
            if (c11 == i11) {
                ValueAnimator valueAnimator = this.f57902l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f57902l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f57902l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f57902l = valueAnimator3;
                valueAnimator3.setInterpolator(C7292a.f69467e);
                this.f57902l.addUpdateListener(new com.google.android.material.appbar.c(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f57902l.setDuration(Math.min(round, 600));
            this.f57902l.setIntValues(c11, i11);
            this.f57902l.start();
        }

        private static View o(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt instanceof InterfaceC5352y) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private void s(CoordinatorLayout coordinatorLayout, @NonNull T t2) {
            int paddingTop = t2.getPaddingTop() + t2.j();
            int c11 = c() - paddingTop;
            int childCount = t2.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    i11 = -1;
                    break;
                }
                View childAt = t2.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if ((dVar.f57914a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -c11;
                if (top <= i12 && bottom >= i12) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 >= 0) {
                View childAt2 = t2.getChildAt(i11);
                d dVar2 = (d) childAt2.getLayoutParams();
                int i13 = dVar2.f57914a;
                if ((i13 & 17) == 17) {
                    int i14 = -childAt2.getTop();
                    int i15 = -childAt2.getBottom();
                    if (i11 == 0) {
                        int i16 = Y.f42258g;
                        if (t2.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            i14 -= t2.j();
                        }
                    }
                    if ((i13 & 2) == 2) {
                        int i17 = Y.f42258g;
                        i15 += childAt2.getMinimumHeight();
                    } else if ((i13 & 5) == 5) {
                        int i18 = Y.f42258g;
                        int minimumHeight = childAt2.getMinimumHeight() + i15;
                        if (c11 < minimumHeight) {
                            i14 = minimumHeight;
                        } else {
                            i15 = minimumHeight;
                        }
                    }
                    if ((i13 & 32) == 32) {
                        i14 += ((LinearLayout.LayoutParams) dVar2).topMargin;
                        i15 -= ((LinearLayout.LayoutParams) dVar2).bottomMargin;
                    }
                    if (c11 < (i15 + i14) / 2) {
                        i14 = i15;
                    }
                    n(coordinatorLayout, t2, com.google.common.primitives.e.b(i14 + paddingTop, -t2.k(), 0));
                }
            }
        }

        private void t(CoordinatorLayout coordinatorLayout, @NonNull T t2) {
            View view;
            BaseBehavior<T> baseBehavior;
            Y.x(q.a.f105945h.b(), coordinatorLayout);
            Y.x(q.a.f105946i.b(), coordinatorLayout);
            if (t2.k() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        view = null;
                        break;
                    }
                    view = coordinatorLayout.getChildAt(i11);
                    if (((CoordinatorLayout.f) view.getLayoutParams()).c() instanceof ScrollingViewBehavior) {
                        break;
                    } else {
                        i11++;
                    }
                }
                View view2 = view;
                if (view2 != null) {
                    int childCount2 = t2.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        if (((d) t2.getChildAt(i12).getLayoutParams()).f57914a != 0) {
                            if (!Y.r(coordinatorLayout)) {
                                Y.C(coordinatorLayout, new a());
                            }
                            boolean z12 = true;
                            if (c() != (-t2.k())) {
                                Y.z(coordinatorLayout, q.a.f105945h, new com.google.android.material.appbar.e(t2, false));
                                z11 = true;
                            }
                            if (c() != 0) {
                                if (view2.canScrollVertically(-1)) {
                                    int i13 = -t2.f();
                                    if (i13 != 0) {
                                        baseBehavior = this;
                                        Y.z(coordinatorLayout, q.a.f105946i, new com.google.android.material.appbar.d(baseBehavior, coordinatorLayout, t2, view2, i13));
                                    }
                                } else {
                                    baseBehavior = this;
                                    Y.z(coordinatorLayout, q.a.f105946i, new com.google.android.material.appbar.e(t2, true));
                                }
                                baseBehavior.f57905o = z12;
                                return;
                            }
                            baseBehavior = this;
                            z12 = z11;
                            baseBehavior.f57905o = z12;
                            return;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i11, int i12, boolean z11) {
            View view;
            boolean z12;
            int abs = Math.abs(i11);
            int childCount = appBarLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i13);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (view != null) {
                int i14 = ((d) view.getLayoutParams()).f57914a;
                if ((i14 & 1) != 0) {
                    int i15 = Y.f42258g;
                    int minimumHeight = view.getMinimumHeight();
                    if (i12 <= 0 || (i14 & 12) == 0 ? !((i14 & 2) == 0 || (-i11) < (view.getBottom() - minimumHeight) - appBarLayout.j()) : (-i11) >= (view.getBottom() - minimumHeight) - appBarLayout.j()) {
                        z12 = true;
                        if (appBarLayout.n()) {
                            z12 = appBarLayout.x(o(coordinatorLayout));
                        }
                        boolean w11 = appBarLayout.w(z12);
                        if (!z11) {
                            if (w11) {
                                List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
                                int size = dependents.size();
                                for (int i16 = 0; i16 < size; i16++) {
                                    CoordinatorLayout.c c11 = ((CoordinatorLayout.f) dependents.get(i16).getLayoutParams()).c();
                                    if (c11 instanceof ScrollingViewBehavior) {
                                        if (((ScrollingViewBehavior) c11).i() == 0) {
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        appBarLayout.jumpDrawablesToCurrentState();
                    }
                }
            }
            z12 = false;
            if (appBarLayout.n()) {
            }
            boolean w112 = appBarLayout.w(z12);
            if (!z11) {
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        @Override // com.google.android.material.appbar.j
        final int c() {
            return b() + this.f57900j;
        }

        @Override // com.google.android.material.appbar.h
        final boolean f(View view) {
            WeakReference<View> weakReference = this.f57904n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.h
        final int g(@NonNull View view) {
            return -((AppBarLayout) view).g();
        }

        @Override // com.google.android.material.appbar.h
        final int h(@NonNull View view) {
            return ((AppBarLayout) view).k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.h
        final void i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            s(coordinatorLayout, appBarLayout);
            if (appBarLayout.n()) {
                appBarLayout.w(appBarLayout.x(o(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.h
        final int j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13) {
            int i14;
            int i15;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int c11 = c();
            int i16 = 0;
            if (i12 == 0 || c11 < i12 || c11 > i13) {
                this.f57900j = 0;
            } else {
                int b11 = com.google.common.primitives.e.b(i11, i12, i13);
                if (c11 != b11) {
                    if (appBarLayout.l()) {
                        int abs = Math.abs(b11);
                        int childCount = appBarLayout.getChildCount();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i17);
                            d dVar = (d) childAt.getLayoutParams();
                            Interpolator interpolator = dVar.f57916c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i17++;
                            } else if (interpolator != null) {
                                int i18 = dVar.f57914a;
                                if ((i18 & 1) != 0) {
                                    i15 = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                                    if ((i18 & 2) != 0) {
                                        int i19 = Y.f42258g;
                                        i15 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i15 = 0;
                                }
                                int i21 = Y.f42258g;
                                if (childAt.getFitsSystemWindows()) {
                                    i15 -= appBarLayout.j();
                                }
                                if (i15 > 0) {
                                    float f7 = i15;
                                    i14 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f7) * f7)) * Integer.signum(b11);
                                }
                            }
                        }
                    }
                    i14 = b11;
                    boolean e11 = e(i14);
                    int i22 = c11 - b11;
                    this.f57900j = b11 - i14;
                    if (e11) {
                        for (int i23 = 0; i23 < appBarLayout.getChildCount(); i23++) {
                            d dVar2 = (d) appBarLayout.getChildAt(i23).getLayoutParams();
                            b a11 = dVar2.a();
                            if (a11 != null && (dVar2.f57914a & 1) != 0) {
                                a11.a(appBarLayout, appBarLayout.getChildAt(i23), b());
                            }
                        }
                    }
                    if (!e11 && appBarLayout.l()) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.o(b());
                    u(coordinatorLayout, appBarLayout, b11, b11 < c11 ? -1 : 1, false);
                    i16 = i22;
                }
            }
            t(coordinatorLayout, appBarLayout);
            return i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.j, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i11);
            int i12 = appBarLayout.i();
            b bVar = this.f57903m;
            if (bVar == null || (i12 & 8) != 0) {
                if (i12 != 0) {
                    boolean z11 = (i12 & 4) != 0;
                    if ((i12 & 2) != 0) {
                        int i13 = -appBarLayout.k();
                        if (z11) {
                            n(coordinatorLayout, appBarLayout, i13);
                        } else {
                            k(coordinatorLayout, appBarLayout, i13);
                        }
                    } else if ((i12 & 1) != 0) {
                        if (z11) {
                            n(coordinatorLayout, appBarLayout, 0);
                        } else {
                            k(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (bVar.f57907c) {
                k(coordinatorLayout, appBarLayout, -appBarLayout.k());
            } else if (bVar.f57908d) {
                k(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(bVar.f57909e);
                int i14 = -childAt.getBottom();
                if (this.f57903m.f57911g) {
                    int i15 = Y.f42258g;
                    round = childAt.getMinimumHeight() + appBarLayout.j();
                } else {
                    round = Math.round(childAt.getHeight() * this.f57903m.f57910f);
                }
                k(coordinatorLayout, appBarLayout, round + i14);
            }
            appBarLayout.r();
            this.f57903m = null;
            e(com.google.common.primitives.e.b(b(), -appBarLayout.k(), 0));
            u(coordinatorLayout, appBarLayout, b(), 0, true);
            appBarLayout.o(b());
            t(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13, int i14) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i11, i12, i13, i14);
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i11, i12, View.MeasureSpec.makeMeasureSpec(0, 0), i14);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i11, int i12, int[] iArr, int i13) {
            p(coordinatorLayout, (AppBarLayout) view, view2, i12, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i14 < 0) {
                int i16 = -appBarLayout.g();
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = j(coordinatorLayout2, appBarLayout, c() - i14, i16, 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i14 == 0) {
                t(coordinatorLayout2, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                q((b) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, this.f57903m.a());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
                this.f57903m = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            b r11 = r(onSaveInstanceState, appBarLayout);
            return r11 == null ? onSaveInstanceState : r11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, View view3, int i11, int i12) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z11 = (i11 & 2) != 0 && (appBarLayout.n() || (appBarLayout.k() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z11 && (valueAnimator = this.f57902l) != null) {
                valueAnimator.cancel();
            }
            this.f57904n = null;
            this.f57901k = i12;
            return z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f57901k == 0 || i11 == 1) {
                s(coordinatorLayout, appBarLayout);
                if (appBarLayout.n()) {
                    appBarLayout.w(appBarLayout.x(view2));
                }
            }
            this.f57904n = new WeakReference<>(view2);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void p(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i12;
            int i13;
            if (i11 != 0) {
                if (i11 < 0) {
                    i12 = -appBarLayout.k();
                    i13 = appBarLayout.f() + i12;
                } else {
                    i12 = -appBarLayout.k();
                    i13 = 0;
                }
                int i14 = i12;
                int i15 = i13;
                if (i14 != i15) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = j(coordinatorLayout, appBarLayout2, c() - i11, i14, i15);
                    if (appBarLayout2.n()) {
                        return;
                    }
                    appBarLayout2.w(appBarLayout2.x(view));
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (appBarLayout2.n()) {
            }
        }

        final void q(b bVar, boolean z11) {
            if (this.f57903m == null || z11) {
                this.f57903m = bVar;
            }
        }

        final b r(Parcelable parcelable, @NonNull T t2) {
            int b11 = b();
            int childCount = t2.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t2.getChildAt(i11);
                int bottom = childAt.getBottom() + b11;
                if (childAt.getTop() + b11 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = O2.a.f19867b;
                    }
                    b bVar = new b(parcelable);
                    boolean z11 = b11 == 0;
                    bVar.f57908d = z11;
                    bVar.f57907c = !z11 && (-b11) >= t2.k();
                    bVar.f57909e = i11;
                    int i12 = Y.f42258g;
                    bVar.f57911g = bottom == childAt.getMinimumHeight() + t2.j();
                    bVar.f57910f = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class b extends O2.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            boolean f57907c;

            /* renamed from: d, reason: collision with root package name */
            boolean f57908d;

            /* renamed from: e, reason: collision with root package name */
            int f57909e;

            /* renamed from: f, reason: collision with root package name */
            float f57910f;

            /* renamed from: g, reason: collision with root package name */
            boolean f57911g;

            final class a implements Parcelable.ClassLoaderCreator<b> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public final b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                public final Object[] newArray(int i11) {
                    return new b[i11];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(@NonNull Parcel parcel) {
                    return new b(parcel, null);
                }
            }

            public b(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f57907c = parcel.readByte() != 0;
                this.f57908d = parcel.readByte() != 0;
                this.f57909e = parcel.readInt();
                this.f57910f = parcel.readFloat();
                this.f57911g = parcel.readByte() != 0;
            }

            @Override // O2.a, android.os.Parcelable
            public final void writeToParcel(@NonNull Parcel parcel, int i11) {
                super.writeToParcel(parcel, i11);
                parcel.writeByte(this.f57907c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f57908d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f57909e);
                parcel.writeFloat(this.f57910f);
                parcel.writeByte(this.f57911g ? (byte) 1 : (byte) 0);
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends i {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.i
        final AppBarLayout f(@NonNull List list) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) list.get(i11);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.i
        final float h(View view) {
            int i11;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int k11 = appBarLayout.k();
            int f7 = appBarLayout.f();
            CoordinatorLayout.c c11 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).c();
            int c12 = c11 instanceof BaseBehavior ? ((BaseBehavior) c11).c() : 0;
            if ((f7 == 0 || k11 + c12 > f7) && (i11 = k11 - f7) != 0) {
                return (c12 / i11) + 1.0f;
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.i
        final int j(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).k() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            CoordinatorLayout.c c11 = ((CoordinatorLayout.f) view2.getLayoutParams()).c();
            if (c11 instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) c11).f57900j) + k()) - g(view2);
                int i11 = Y.f42258g;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.n()) {
                return false;
            }
            appBarLayout.w(appBarLayout.x(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                Y.x(q.a.f105945h.b(), coordinatorLayout);
                Y.x(q.a.f105946i.b(), coordinatorLayout);
                Y.C(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z11) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i11);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i11++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f57979c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.t(false, !z11);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65925I);
            l(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public interface a<T extends AppBarLayout> {
        void onOffsetChanged(T t2, int i11);
    }

    /* loaded from: classes9.dex */
    public static abstract class b {
        public abstract void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f7);
    }

    /* loaded from: classes9.dex */
    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f57912a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f57913b = new Rect();

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f7) {
            Rect rect = this.f57912a;
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.j());
            float abs = rect.top - Math.abs(f7);
            if (abs > 0.0f) {
                int i11 = Y.f42258g;
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                return;
            }
            float abs2 = Math.abs(abs / rect.height());
            float f11 = 1.0f - (abs2 >= 0.0f ? abs2 > 1.0f ? 1.0f : abs2 : 0.0f);
            float height = (-abs) - ((rect.height() * 0.3f) * (1.0f - (f11 * f11)));
            view.setTranslationY(height);
            Rect rect2 = this.f57913b;
            view.getDrawingRect(rect2);
            rect2.offset(0, (int) (-height));
            int i12 = Y.f42258g;
            view.setClipBounds(rect2);
        }
    }

    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        int f57914a;

        /* renamed from: b, reason: collision with root package name */
        private c f57915b;

        /* renamed from: c, reason: collision with root package name */
        Interpolator f57916c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f57914a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65936b);
            this.f57914a = obtainStyledAttributes.getInt(1, 0);
            this.f57915b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new c();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f57916c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public final b a() {
            return this.f57915b;
        }

        public final void b(int i11) {
            this.f57914a = i11;
        }
    }

    /* loaded from: classes9.dex */
    public interface e {
        void onUpdate();
    }

    public interface f extends a<AppBarLayout> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        boolean z11 = false;
        this.f57883b = -1;
        this.f57884c = -1;
        this.f57885d = -1;
        this.f57887f = 0;
        this.f57896o = new ArrayList();
        Context context2 = getContext();
        super.setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        l.a(this, attributeSet);
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65935a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        Drawable drawable = e11.getDrawable(0);
        int i11 = Y.f42258g;
        setBackground(drawable);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C10856g c10856g = new C10856g();
            c10856g.B(ColorStateList.valueOf(colorDrawable.getColor()));
            c10856g.v(context2);
            setBackground(c10856g);
        }
        if (e11.hasValue(4)) {
            u(e11.getBoolean(4, false), false, false);
        }
        if (e11.hasValue(3)) {
            float dimensionPixelSize = e11.getDimensionPixelSize(3, 0);
            int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
            StateListAnimator stateListAnimator = new StateListAnimator();
            long j11 = integer;
            stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130970591}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j11));
            stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", dimensionPixelSize).setDuration(j11));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
            setStateListAnimator(stateListAnimator);
        }
        if (e11.hasValue(2)) {
            setKeyboardNavigationCluster(e11.getBoolean(2, false));
        }
        if (e11.hasValue(1)) {
            setTouchscreenBlocksFocus(e11.getBoolean(1, false));
        }
        this.f57892k = e11.getBoolean(5, false);
        this.f57893l = e11.getResourceId(6, -1);
        Drawable drawable2 = e11.getDrawable(7);
        Drawable drawable3 = this.f57898q;
        if (drawable3 != drawable2) {
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
            this.f57898q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f57898q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.h(this.f57898q, getLayoutDirection());
                this.f57898q.setVisible(getVisibility() == 0, false);
                this.f57898q.setCallback(this);
            }
            if (this.f57898q != null && j() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            postInvalidateOnAnimation();
        }
        e11.recycle();
        Y.J(this, new com.google.android.material.appbar.a(this));
    }

    protected static d e(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            d dVar = new d((LinearLayout.LayoutParams) layoutParams);
            dVar.f57914a = 1;
            return dVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar2 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar2.f57914a = 1;
            return dVar2;
        }
        d dVar3 = new d(layoutParams);
        dVar3.f57914a = 1;
        return dVar3;
    }

    private void m() {
        Behavior behavior = this.f57899r;
        BaseBehavior.b r11 = (behavior == null || this.f57883b == -1 || this.f57887f != 0) ? null : behavior.r(O2.a.f19867b, this);
        this.f57883b = -1;
        this.f57884c = -1;
        this.f57885d = -1;
        if (r11 != null) {
            this.f57899r.q(r11, false);
        }
    }

    private void u(boolean z11, boolean z12, boolean z13) {
        this.f57887f = (z11 ? 1 : 2) | (z12 ? 4 : 0) | (z13 ? 8 : 0);
        requestLayout();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public final CoordinatorLayout.c<AppBarLayout> a() {
        Behavior behavior = new Behavior();
        this.f57899r = behavior;
        return behavior;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(f fVar) {
        if (this.f57889h == null) {
            this.f57889h = new ArrayList();
        }
        if (fVar == null || this.f57889h.contains(fVar)) {
            return;
        }
        this.f57889h.add(fVar);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f57898q == null || j() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, -this.f57882a);
        this.f57898q.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f57898q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int f() {
        int i11;
        int minimumHeight;
        int i12 = this.f57884c;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = dVar.f57914a;
            if ((i14 & 5) != 5) {
                if (i13 > 0) {
                    break;
                }
            } else {
                int i15 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((i14 & 8) != 0) {
                    int i16 = Y.f42258g;
                    minimumHeight = childAt.getMinimumHeight();
                } else if ((i14 & 2) != 0) {
                    int i17 = Y.f42258g;
                    minimumHeight = measuredHeight - childAt.getMinimumHeight();
                } else {
                    i11 = i15 + measuredHeight;
                    if (childCount == 0) {
                        int i18 = Y.f42258g;
                        if (childAt.getFitsSystemWindows()) {
                            i11 = Math.min(i11, measuredHeight - j());
                        }
                    }
                    i13 += i11;
                }
                i11 = minimumHeight + i15;
                if (childCount == 0) {
                }
                i13 += i11;
            }
        }
        int max = Math.max(0, i13);
        this.f57884c = max;
        return max;
    }

    final int g() {
        int i11 = this.f57885d;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + childAt.getMeasuredHeight();
            int i14 = dVar.f57914a;
            if ((i14 & 1) == 0) {
                break;
            }
            i13 += measuredHeight;
            if ((i14 & 2) != 0) {
                int i15 = Y.f42258g;
                i13 -= childAt.getMinimumHeight();
                break;
            }
            i12++;
        }
        int max = Math.max(0, i13);
        this.f57885d = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -2);
        dVar.f57914a = 1;
        return dVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    public final int h() {
        int j11 = j();
        int i11 = Y.f42258g;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + j11;
    }

    final int i() {
        return this.f57887f;
    }

    final int j() {
        C5353y0 c5353y0 = this.f57888g;
        if (c5353y0 != null) {
            return c5353y0.l();
        }
        return 0;
    }

    public final int k() {
        int i11 = this.f57883b;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = dVar.f57914a;
            if ((i14 & 1) == 0) {
                break;
            }
            int i15 = measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + i13;
            if (i12 == 0) {
                int i16 = Y.f42258g;
                if (childAt.getFitsSystemWindows()) {
                    i15 -= j();
                }
            }
            i13 = i15;
            if ((i14 & 2) != 0) {
                int i17 = Y.f42258g;
                i13 -= childAt.getMinimumHeight();
                break;
            }
            i12++;
        }
        int max = Math.max(0, i13);
        this.f57883b = max;
        return max;
    }

    final boolean l() {
        return this.f57886e;
    }

    public final boolean n() {
        return this.f57892k;
    }

    final void o(int i11) {
        this.f57882a = i11;
        if (!willNotDraw()) {
            int i12 = Y.f42258g;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f57889h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f57889h.get(i13);
                if (aVar != null) {
                    aVar.onOffsetChanged(this, i11);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10857h.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i11) {
        if (this.f57897p == null) {
            this.f57897p = new int[4];
        }
        int[] iArr = this.f57897p;
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + iArr.length);
        boolean z11 = this.f57890i;
        iArr[0] = z11 ? R.attr.state_liftable : -2130970590;
        iArr[1] = (z11 && this.f57891j) ? R.attr.state_lifted : -2130970591;
        iArr[2] = z11 ? R.attr.state_collapsible : -2130970586;
        iArr[3] = (z11 && this.f57891j) ? R.attr.state_collapsed : -2130970585;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f57894m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f57894m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12 = true;
        super.onLayout(z11, i11, i12, i13, i14);
        int i15 = Y.f42258g;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int j11 = j();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(j11);
                }
            }
        }
        m();
        this.f57886e = false;
        int childCount2 = getChildCount();
        int i16 = 0;
        while (true) {
            if (i16 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i16).getLayoutParams()).f57916c != null) {
                this.f57886e = true;
                break;
            }
            i16++;
        }
        Drawable drawable = this.f57898q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), j());
        }
        if (!this.f57892k) {
            int childCount3 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount3) {
                    z12 = false;
                    break;
                }
                int i18 = ((d) getChildAt(i17).getLayoutParams()).f57914a;
                if ((i18 & 1) == 1 && (i18 & 10) != 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (this.f57890i != z12) {
            this.f57890i = z12;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != 1073741824) {
            int i13 = Y.f42258g;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = com.google.common.primitives.e.b(getMeasuredHeight() + j(), 0, View.MeasureSpec.getSize(i12));
                    } else if (mode == 0) {
                        measuredHeight += j();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        m();
    }

    final void p(C5353y0 c5353y0) {
        int i11 = Y.f42258g;
        if (!getFitsSystemWindows()) {
            c5353y0 = null;
        }
        if (Objects.equals(this.f57888g, c5353y0)) {
            return;
        }
        this.f57888g = c5353y0;
        setWillNotDraw(!(this.f57898q != null && j() > 0));
        requestLayout();
    }

    public final void q(f fVar) {
        ArrayList arrayList = this.f57889h;
        if (arrayList == null || fVar == null) {
            return;
        }
        arrayList.remove(fVar);
    }

    final void r() {
        this.f57887f = 0;
    }

    public final void s(boolean z11) {
        int i11 = Y.f42258g;
        u(z11, isLaidOut(), true);
    }

    @Override // android.view.View
    public final void setElevation(float f7) {
        super.setElevation(f7);
        C10857h.b(f7, this);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i11) {
        if (i11 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i11);
    }

    @Override // android.view.View
    public final void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f57898q;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
    }

    public final void t(boolean z11, boolean z12) {
        u(z11, z12, true);
    }

    public final void v() {
        this.f57892k = false;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f57898q;
    }

    final boolean w(boolean z11) {
        if (this.f57891j == z11) {
            return false;
        }
        this.f57891j = z11;
        refreshDrawableState();
        if (this.f57892k && (getBackground() instanceof C10856g)) {
            C10856g c10856g = (C10856g) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f7 = z11 ? 0.0f : dimension;
            if (!z11) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f57895n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, dimension);
            this.f57895n = ofFloat;
            ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f57895n.setInterpolator(C7292a.f69463a);
            this.f57895n.addUpdateListener(new com.google.android.material.appbar.b(this, c10856g));
            this.f57895n.start();
        }
        return true;
    }

    final boolean x(View view) {
        int i11;
        if (this.f57894m == null && (i11 = this.f57893l) != -1) {
            View findViewById = view != null ? view.findViewById(i11) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(i11);
            }
            if (findViewById != null) {
                this.f57894m = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f57894m;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -2);
        dVar.f57914a = 1;
        return dVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }
}
