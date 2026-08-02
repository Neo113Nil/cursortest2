package com.google.android.material.appbar;

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
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.libuilight.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.df6;
import xsna.e3m;
import xsna.epx;
import xsna.lhg;
import xsna.q570;
import xsna.too0;

/* compiled from: NonBouncedAppBarShadowView.kt */
/* loaded from: classes13.dex */
public final class NonBouncedAppBarShadowView extends AppCompatImageView implements CoordinatorLayout.b, too0 {
    public static final /* synthetic */ int h = 0;
    public Integer b;
    public int c;
    public boolean d;
    public Drawable e;
    public Drawable f;
    public a g;

    /* compiled from: NonBouncedAppBarShadowView.kt */
    public interface b {
    }

    public NonBouncedAppBarShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Integer num;
        this.c = 1;
        this.d = true;
        this.f = e3m.e(R.attr.vk_toolbar_shadow, getContext());
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
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.FIT_XY);
        setImportantForAccessibility(2);
        setContentDescription(null);
        this.e = this.d ? e3m.e(R.attr.vk_toolbar_separator, getContext()) : null;
        V();
    }

    public static final void U(NonBouncedAppBarShadowView nonBouncedAppBarShadowView, View view) {
        boolean canScrollVertically = view.canScrollVertically(-1);
        boolean z = !canScrollVertically;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && linearLayoutManager.b == 1) {
            z = !canScrollVertically || linearLayoutManager.s() == 0;
        }
        nonBouncedAppBarShadowView.setBehaviorMode(z ? 1 : 2);
    }

    private final void setBehaviorMode(int i) {
        if (this.c != i) {
            this.c = i;
            V();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, xsna.too0
    public final void Ng() {
        this.e = this.d ? e3m.e(R.attr.vk_toolbar_separator, getContext()) : null;
        this.f = e3m.e(R.attr.vk_toolbar_shadow, getContext());
        V();
    }

    public final void V() {
        Drawable drawable;
        Integer num = this.b;
        int intValue = num != null ? num.intValue() : this.c;
        if (intValue == 0) {
            drawable = null;
        } else if (intValue == 1) {
            drawable = this.e;
        } else {
            if (intValue != 2) {
                throw new IllegalStateException(lhg.a(intValue, "Unexpected mode: "));
            }
            drawable = this.f;
        }
        setImageDrawable(drawable);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<?> getBehavior() {
        if (this.g == null) {
            this.g = new a(this);
        }
        return this.g;
    }

    public final Integer getForceMode() {
        return this.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.g;
        if (aVar != null) {
            aVar.L();
        }
        this.g = null;
    }

    public final void setForceMode(Integer num) {
        if (epx.f(this.b, num)) {
            return;
        }
        this.b = num;
        V();
    }

    public final void setSeparatorAllowed(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.e = z ? e3m.e(R.attr.vk_toolbar_separator, getContext()) : null;
            V();
        }
    }

    private static /* synthetic */ void getBehaviorMode$annotations() {
    }

    public static /* synthetic */ void getForceMode$annotations() {
    }

    /* compiled from: NonBouncedAppBarShadowView.kt */
    public final class a extends NonBouncedAppBarLayout.ScrollingViewBehavior {
        public final df6 i;
        public CoordinatorLayout l;
        public NonBouncedAppBarLayout m;
        public View n;
        public final Handler h = new Handler();
        public final q570 j = new q570(this);
        public final ViewOnAttachStateChangeListenerC0116a k = new ViewOnAttachStateChangeListenerC0116a();

        public a(NonBouncedAppBarShadowView nonBouncedAppBarShadowView) {
            this.i = new df6(4, this, nonBouncedAppBarShadowView);
        }

        public static void M(a aVar, CoordinatorLayout coordinatorLayout, View view) {
            NonBouncedAppBarLayout nonBouncedAppBarLayout;
            ViewTreeObserver viewTreeObserver;
            q570 q570Var = aVar.j;
            ViewOnAttachStateChangeListenerC0116a viewOnAttachStateChangeListenerC0116a = aVar.k;
            int i = NonBouncedAppBarShadowView.h;
            int childCount = coordinatorLayout.getChildCount();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    nonBouncedAppBarLayout = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt instanceof NonBouncedAppBarLayout) {
                    nonBouncedAppBarLayout = (NonBouncedAppBarLayout) childAt;
                    break;
                }
                i2++;
            }
            View k = awt0.k(view);
            if (k != null && (viewTreeObserver = k.getViewTreeObserver()) != null) {
                z = viewTreeObserver.isAlive();
            }
            if (nonBouncedAppBarLayout == null || k == null || !z) {
                return;
            }
            coordinatorLayout.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0116a);
            aVar.l = coordinatorLayout;
            nonBouncedAppBarLayout.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0116a);
            aVar.m = nonBouncedAppBarLayout;
            k.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0116a);
            k.getViewTreeObserver().addOnScrollChangedListener(q570Var);
            aVar.n = k;
            q570Var.onScrollChanged();
        }

        public final void L() {
            View view = this.n;
            ViewOnAttachStateChangeListenerC0116a viewOnAttachStateChangeListenerC0116a = this.k;
            if (view != null) {
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnScrollChangedListener(this.j);
                }
                view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0116a);
            }
            this.n = null;
            NonBouncedAppBarLayout nonBouncedAppBarLayout = this.m;
            if (nonBouncedAppBarLayout != null) {
                nonBouncedAppBarLayout.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0116a);
            }
            this.m = null;
            CoordinatorLayout coordinatorLayout = this.l;
            if (coordinatorLayout != null) {
                coordinatorLayout.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0116a);
            }
            this.l = null;
            this.h.removeCallbacksAndMessages(null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            L();
            M(this, coordinatorLayout, view3);
            return super.z(coordinatorLayout, view, view2, view3, i, i2);
        }

        /* compiled from: NonBouncedAppBarShadowView.kt */
        /* renamed from: com.google.android.material.appbar.NonBouncedAppBarShadowView$a$a, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0116a implements View.OnAttachStateChangeListener {
            public ViewOnAttachStateChangeListenerC0116a() {
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

    public final void setOnModeChangedListener(b bVar) {
    }
}
