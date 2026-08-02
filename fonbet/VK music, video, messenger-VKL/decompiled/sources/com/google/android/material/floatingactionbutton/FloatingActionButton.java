package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bdl;
import xsna.d33;
import xsna.fpo0;
import xsna.g33;
import xsna.g9q;
import xsna.h9q;
import xsna.iut0;
import xsna.j1m;
import xsna.l6j0;
import xsna.lv1;
import xsna.m18;
import xsna.mb30;
import xsna.qm10;
import xsna.s4u0;
import xsna.t1u0;
import xsna.x38;
import xsna.yqr;
import xsna.zm10;
import xsna.zqr;

/* loaded from: classes13.dex */
public class FloatingActionButton extends s4u0 implements g9q, l6j0, CoordinatorLayout.b {
    public static final int r = R$style.Widget_Design_FloatingActionButton;

    @Nullable
    public ColorStateList c;

    @Nullable
    public PorterDuff.Mode d;

    @Nullable
    public ColorStateList e;

    @Nullable
    public PorterDuff.Mode f;

    @Nullable
    public ColorStateList g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public final Rect m;
    public final Rect n;

    @NonNull
    public final g33 o;

    @NonNull
    public final h9q p;
    public zqr q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.f {
        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            throw null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = R$attr.floatingActionButtonStyle;
        int i2 = r;
        this.m = new Rect();
        this.n = new Rect();
        Context context2 = getContext();
        TypedArray d = fpo0.d(context2, attributeSet, R$styleable.FloatingActionButton, i, i2, new int[0]);
        this.c = qm10.a(context2, d, R$styleable.FloatingActionButton_backgroundTint);
        this.d = t1u0.e(d.getInt(R$styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.g = qm10.a(context2, d, R$styleable.FloatingActionButton_rippleColor);
        this.h = d.getInt(R$styleable.FloatingActionButton_fabSize, -1);
        this.i = d.getDimensionPixelSize(R$styleable.FloatingActionButton_fabCustomSize, 0);
        int dimensionPixelSize = d.getDimensionPixelSize(R$styleable.FloatingActionButton_borderWidth, 0);
        float dimension = d.getDimension(R$styleable.FloatingActionButton_elevation, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = d.getDimension(R$styleable.FloatingActionButton_hoveredFocusedTranslationZ, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = d.getDimension(R$styleable.FloatingActionButton_pressedTranslationZ, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = d.getBoolean(R$styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(d.getDimensionPixelSize(R$styleable.FloatingActionButton_maxImageSize, 0));
        mb30 a2 = mb30.a(context2, d, R$styleable.FloatingActionButton_showMotionSpec);
        mb30 a3 = mb30.a(context2, d, R$styleable.FloatingActionButton_hideMotionSpec);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        com.google.android.material.shape.a a4 = com.google.android.material.shape.a.b(context2, resourceId, resourceId2, com.google.android.material.shape.a.m).a();
        boolean z = d.getBoolean(R$styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(d.getBoolean(R$styleable.FloatingActionButton_android_enabled, true));
        d.recycle();
        g33 g33Var = new g33(this);
        this.o = g33Var;
        g33Var.b(attributeSet, i);
        this.p = new h9q(this);
        getImpl().n(a4);
        getImpl().g(this.c, this.d, this.g, dimensionPixelSize);
        getImpl().k = dimensionPixelSize2;
        d impl = getImpl();
        if (impl.h != dimension) {
            impl.h = dimension;
            impl.k(dimension, impl.i, impl.j);
        }
        d impl2 = getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.k(impl2.h, dimension2, impl2.j);
        }
        d impl3 = getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.k(impl3.h, impl3.i, dimension3);
        }
        getImpl().m = a2;
        getImpl().n = a3;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private d getImpl() {
        if (this.q == null) {
            this.q = new zqr(this, new b());
        }
        return this.q;
    }

    @Override // xsna.g9q
    public final boolean M() {
        return this.p.b;
    }

    public final void c() {
        d impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList<>();
        }
        impl.t.add(null);
    }

    public final void d(@NonNull lv1 lv1Var) {
        d impl = getImpl();
        if (impl.s == null) {
            impl.s = new ArrayList<>();
        }
        impl.s.add(lv1Var);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e() {
        d impl = getImpl();
        c cVar = new c();
        if (impl.u == null) {
            impl.u = new ArrayList<>();
        }
        impl.u.add(cVar);
    }

    public final int f(int i) {
        int i2 = this.i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R$dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R$dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(@Nullable a aVar, boolean z) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        FloatingActionButton floatingActionButton = impl.v;
        FloatingActionButton floatingActionButton2 = impl.v;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.r == 1) {
                return;
            }
        } else if (impl.r != 2) {
            return;
        }
        Animator animator = impl.l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.a(z ? 8 : 4, z);
            if (aVar2 != null) {
                aVar2.a.a(aVar2.b);
                return;
            }
            return;
        }
        mb30 mb30Var = impl.n;
        AnimatorSet b2 = mb30Var != null ? impl.b(mb30Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : impl.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4f, 0.4f, d.F, d.G);
        b2.addListener(new com.google.android.material.floatingactionbutton.b(impl, z, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b2.addListener(it.next());
            }
        }
        b2.start();
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.c;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        return this.p.c;
    }

    @Nullable
    public mb30 getHideMotionSpec() {
        return getImpl().n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.g;
    }

    @Override // xsna.l6j0
    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        com.google.android.material.shape.a aVar = getImpl().a;
        aVar.getClass();
        return aVar;
    }

    @Nullable
    public mb30 getShowMotionSpec() {
        return getImpl().m;
    }

    public int getSize() {
        return this.h;
    }

    public int getSizeDimension() {
        return f(this.h);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.e;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f;
    }

    public boolean getUseCompatPadding() {
        return this.l;
    }

    public final boolean h() {
        d impl = getImpl();
        if (impl.v.getVisibility() == 0) {
            if (impl.r != 1) {
                return false;
            }
        } else if (impl.r == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        d impl = getImpl();
        if (impl.v.getVisibility() != 0) {
            if (impl.r != 2) {
                return false;
            }
        } else if (impl.r == 1) {
            return false;
        }
        return true;
    }

    public final void j(@NonNull Rect rect) {
        int i = rect.left;
        Rect rect2 = this.m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.e;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(d33.c(colorForState, mode));
    }

    public final void l(@Nullable x38.a aVar, boolean z) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        FloatingActionButton floatingActionButton = impl.v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.v;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.r == 2) {
                return;
            }
        } else if (impl.r != 1) {
            return;
        }
        Animator animator = impl.l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.m == null;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.a.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            floatingActionButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            if (z2) {
                f = 0.4f;
            }
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        mb30 mb30Var = impl.m;
        AnimatorSet b2 = mb30Var != null ? impl.b(mb30Var, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, d.D, d.E);
        b2.addListener(new com.google.android.material.floatingactionbutton.c(impl, z, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b2.addListener(it.next());
            }
        }
        b2.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        FloatingActionButton floatingActionButton = impl.v;
        MaterialShapeDrawable materialShapeDrawable = impl.b;
        if (materialShapeDrawable != null) {
            bdl.e(floatingActionButton, materialShapeDrawable);
        }
        if (impl instanceof zqr) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.B == null) {
            impl.B = new yqr(impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.B);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.v.getViewTreeObserver();
        yqr yqrVar = impl.B;
        if (yqrVar != null) {
            viewTreeObserver.removeOnPreDrawListener(yqrVar);
            impl.B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.j = (sizeDimension - this.k) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.b);
        Bundle bundle = extendableSavedState.d.get("expandableWidgetHelper");
        bundle.getClass();
        h9q h9qVar = this.p;
        h9qVar.getClass();
        h9qVar.b = bundle.getBoolean("expanded", false);
        h9qVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (h9qVar.b) {
            FloatingActionButton floatingActionButton = h9qVar.a;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).B(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        h9q h9qVar = this.p;
        h9qVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", h9qVar.b);
        bundle.putInt("expandedComponentIdHint", h9qVar.c);
        extendableSavedState.d.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.n;
            rect.set(0, 0, measuredWidth, measuredHeight);
            j(rect);
            zqr zqrVar = this.q;
            int i = -(zqrVar.f ? Math.max((zqrVar.k - zqrVar.v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.c != colorStateList) {
            this.c = colorStateList;
            d impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            m18 m18Var = impl.d;
            if (m18Var != null) {
                if (colorStateList != null) {
                    m18Var.m = colorStateList.getColorForState(m18Var.getState(), m18Var.m);
                }
                m18Var.p = colorStateList;
                m18Var.n = true;
                m18Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.d != mode) {
            this.d = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        d impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.k(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.k(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.k(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = getImpl().b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.p.c = i;
    }

    public void setHideMotionSpec(@Nullable mb30 mb30Var) {
        getImpl().n = mb30Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(mb30.b(i, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
            if (this.e != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.o.c(i);
        k();
    }

    public void setMaxImageSize(int i) {
        this.k = i;
        d impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<d.f> arrayList = getImpl().u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<d.f> arrayList = getImpl().u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        d impl = getImpl();
        impl.g = z;
        impl.q();
    }

    @Override // xsna.l6j0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        getImpl().n(aVar);
    }

    public void setShowMotionSpec(@Nullable mb30 mb30Var) {
        getImpl().m = mb30Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(mb30.b(i, getContext()));
    }

    public void setSize(int i) {
        this.i = 0;
        if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.l != z) {
            this.l = z;
            getImpl().i();
        }
    }

    @Override // xsna.s4u0, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect b;
        public final boolean c;

        public BaseBehavior() {
            this.c = true;
        }

        public final boolean D(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.c || fVar.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.b == null) {
                this.b = new Rect();
            }
            Rect rect = this.b;
            j1m.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean E(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.c || fVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean f(@NonNull Rect rect, @NonNull View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void i(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean j(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    E(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList E = coordinatorLayout.E(floatingActionButton);
            int size = E.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) E.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && E(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.R(i, floatingActionButton);
            Rect rect = floatingActionButton.m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            getImpl().m(this.g);
        }
    }

    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }
}
