package com.vk.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.libuilight.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.e3m;
import xsna.epx;
import xsna.l8;
import xsna.lhg;
import xsna.ozl;
import xsna.r13;
import xsna.too0;
import xsna.vo2;

/* compiled from: AppBarShadowView.kt */
@ozl
/* loaded from: classes.dex */
public final class AppBarShadowView extends AppCompatImageView implements CoordinatorLayout.b, too0 {
    public static final /* synthetic */ int j = 0;
    public Integer b;
    public int c;
    public boolean d;
    public final boolean e;
    public Drawable f;
    public Drawable g;
    public a h;
    public b i;

    /* compiled from: AppBarShadowView.kt */
    /* loaded from: classes17.dex */
    public interface b {
    }

    public AppBarShadowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static final void U(AppBarShadowView appBarShadowView, View view) {
        boolean canScrollVertically = view.canScrollVertically(-1);
        boolean z = !canScrollVertically;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && linearLayoutManager.b == 1) {
            z = !canScrollVertically || linearLayoutManager.s() == 0;
        }
        if (linearLayoutManager != null && linearLayoutManager.b == 0 && appBarShadowView.e) {
            return;
        }
        appBarShadowView.setBehaviorMode(z ? 1 : 2);
    }

    private final void setBehaviorMode(int i) {
        if (this.c != i) {
            this.c = i;
            W();
            b bVar = this.i;
            if (bVar != null) {
                ((l8) bVar).a(i);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, xsna.too0
    public final void Ng() {
        this.f = this.d ? e3m.e(R.attr.vk_toolbar_separator, getContext()) : null;
        this.g = e3m.e(R.attr.vk_toolbar_shadow, getContext());
        W();
    }

    public final void V(View view) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.N(view);
        }
    }

    public final void W() {
        Drawable drawable;
        Integer num = this.b;
        int intValue = num != null ? num.intValue() : this.c;
        if (intValue == 0) {
            drawable = null;
        } else if (intValue == 1) {
            drawable = this.f;
        } else {
            if (intValue != 2) {
                throw new IllegalStateException(lhg.a(intValue, "Unexpected mode: "));
            }
            drawable = this.g;
        }
        setImageDrawable(drawable);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<?> getBehavior() {
        if (this.h == null) {
            this.h = new a(this);
        }
        return this.h;
    }

    public final Integer getForceMode() {
        return this.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.h;
        if (aVar != null) {
            aVar.L();
        }
        this.h = null;
    }

    public final void setForceMode(Integer num) {
        if (epx.f(this.b, num)) {
            return;
        }
        this.b = num;
        W();
    }

    public final void setOnModeChangedListener(b bVar) {
        this.i = bVar;
    }

    public final void setSeparatorAllowed(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.f = z ? e3m.e(R.attr.vk_toolbar_separator, getContext()) : null;
            W();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarShadowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        Integer num;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.c = 1;
        this.d = true;
        this.g = e3m.e(R.attr.vk_toolbar_shadow, getContext());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            num = Integer.valueOf(obtainStyledAttributes.getInt(1, 1));
        } else {
            if (hasValue) {
                throw new NoWhenBranchMatchedException();
            }
            num = null;
        }
        setForceMode(num);
        this.d = obtainStyledAttributes.getBoolean(0, true);
        this.e = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.FIT_XY);
        setImportantForAccessibility(2);
        setContentDescription(null);
        this.f = this.d ? e3m.e(R.attr.vk_toolbar_separator, getContext()) : null;
        W();
    }

    private static /* synthetic */ void getBehaviorMode$annotations() {
    }

    public static /* synthetic */ void getForceMode$annotations() {
    }

    /* compiled from: AppBarShadowView.kt */
    /* loaded from: classes17.dex */
    public final class a extends AppBarLayout.ScrollingViewBehavior {
        public final vo2 i;
        public CoordinatorLayout l;
        public AppBarLayout m;
        public View n;
        public final Handler h = new Handler();
        public final r13 j = new r13(this);
        public final ViewOnAttachStateChangeListenerC0799a k = new ViewOnAttachStateChangeListenerC0799a();

        public a(AppBarShadowView appBarShadowView) {
            this.i = new vo2(1, this, appBarShadowView);
        }

        public static void M(a aVar, CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout;
            ViewTreeObserver viewTreeObserver;
            r13 r13Var = aVar.j;
            ViewOnAttachStateChangeListenerC0799a viewOnAttachStateChangeListenerC0799a = aVar.k;
            int i = AppBarShadowView.j;
            int childCount = coordinatorLayout.getChildCount();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    appBarLayout = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) childAt;
                    break;
                }
                i2++;
            }
            View k = awt0.k(view);
            if (k != null && (viewTreeObserver = k.getViewTreeObserver()) != null) {
                z = viewTreeObserver.isAlive();
            }
            if (appBarLayout == null || k == null || !z) {
                return;
            }
            coordinatorLayout.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0799a);
            aVar.l = coordinatorLayout;
            appBarLayout.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0799a);
            aVar.m = appBarLayout;
            k.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0799a);
            k.getViewTreeObserver().addOnScrollChangedListener(r13Var);
            aVar.n = k;
            r13Var.onScrollChanged();
        }

        public final void L() {
            View view = this.n;
            ViewOnAttachStateChangeListenerC0799a viewOnAttachStateChangeListenerC0799a = this.k;
            if (view != null) {
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnScrollChangedListener(this.j);
                }
                view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0799a);
            }
            this.n = null;
            AppBarLayout appBarLayout = this.m;
            if (appBarLayout != null) {
                appBarLayout.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0799a);
            }
            this.m = null;
            CoordinatorLayout coordinatorLayout = this.l;
            if (coordinatorLayout != null) {
                coordinatorLayout.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0799a);
            }
            this.l = null;
            this.h.removeCallbacksAndMessages(null);
        }

        public final void N(View view) {
            CoordinatorLayout coordinatorLayout = this.l;
            if (coordinatorLayout == null) {
                return;
            }
            L();
            M(this, coordinatorLayout, view);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (i == 2) {
                L();
                M(this, coordinatorLayout, view3);
            }
            return super.z(coordinatorLayout, view, view2, view3, i, i2);
        }

        /* compiled from: AppBarShadowView.kt */
        /* renamed from: com.vk.core.view.AppBarShadowView$a$a, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0799a implements View.OnAttachStateChangeListener {
            public ViewOnAttachStateChangeListenerC0799a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                a.this.L();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }
        }
    }
}
