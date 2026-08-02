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
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ach;
import defpackage.bsk;
import defpackage.by4;
import defpackage.cc0;
import defpackage.cwc;
import defpackage.ewk;
import defpackage.gm6;
import defpackage.iz1;
import defpackage.ji6;
import defpackage.l4a;
import defpackage.m6k;
import defpackage.n88;
import defpackage.oyn;
import defpackage.pjf;
import defpackage.pp4;
import defpackage.q88;
import defpackage.r88;
import defpackage.rfo;
import defpackage.t9d;
import defpackage.ts3;
import defpackage.us3;
import defpackage.vha;
import defpackage.w3a;
import defpackage.xah;
import defpackage.xb0;
import defpackage.xs3;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class FloatingActionButton extends ewk implements ji6, ach, ts3 {
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final Rect l;
    public final Rect m;
    public final cc0 n;
    public final pp4 o;
    public r88 p;

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(oyn.U(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        FloatingActionButton floatingActionButton;
        Drawable drawable;
        Drawable drawable2;
        this.a = getVisibility();
        this.l = new Rect();
        this.m = new Rect();
        Context context2 = getContext();
        TypedArray Y = m6k.Y(context2, attributeSet, pjf.o, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.b = w3a.x(context2, Y, 1);
        this.c = vha.F(Y.getInt(2, -1), null);
        this.f = w3a.x(context2, Y, 12);
        this.g = Y.getInt(7, -1);
        this.h = Y.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = Y.getDimensionPixelSize(3, 0);
        float dimension = Y.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = Y.getDimension(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = Y.getDimension(11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.k = Y.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(Y.getDimensionPixelSize(10, 0));
        cwc a = cwc.a(context2, Y, 15);
        cwc a2 = cwc.a(context2, Y, 8);
        xah a3 = xah.i(context2, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, xah.m).a();
        boolean z = Y.getBoolean(5, false);
        setEnabled(Y.getBoolean(0, true));
        Y.recycle();
        cc0 cc0Var = new cc0(this);
        this.n = cc0Var;
        cc0Var.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.o = new pp4(this);
        getImpl().g(a3);
        r88 impl = getImpl();
        ColorStateList colorStateList2 = this.b;
        PorterDuff.Mode mode = this.c;
        ColorStateList colorStateList3 = this.f;
        FloatingActionButton floatingActionButton2 = impl.s;
        xah xahVar = impl.a;
        xahVar.getClass();
        q88 q88Var = new q88(xahVar);
        impl.b = q88Var;
        q88Var.setTintList(colorStateList2);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.p(floatingActionButton2.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton2.getContext();
            xah xahVar2 = impl.a;
            xahVar2.getClass();
            iz1 iz1Var = new iz1(xahVar2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            colorStateList = colorStateList3;
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            floatingActionButton = floatingActionButton2;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            iz1Var.i = color;
            iz1Var.j = color2;
            iz1Var.k = color3;
            iz1Var.l = color4;
            float f = dimensionPixelSize;
            if (iz1Var.h != f) {
                iz1Var.h = f;
                iz1Var.b.setStrokeWidth(f * 1.3333f);
                iz1Var.n = true;
                iz1Var.invalidateSelf();
            }
            if (colorStateList2 != null) {
                iz1Var.m = colorStateList2.getColorForState(iz1Var.getState(), iz1Var.m);
            }
            iz1Var.p = colorStateList2;
            iz1Var.n = true;
            iz1Var.invalidateSelf();
            impl.d = iz1Var;
            iz1 iz1Var2 = impl.d;
            iz1Var2.getClass();
            q88 q88Var2 = impl.b;
            q88Var2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{iz1Var2, q88Var2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            floatingActionButton = floatingActionButton2;
            drawable = null;
            impl.d = null;
            drawable2 = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(rfo.J(colorStateList), drawable2, drawable);
        impl.c = rippleDrawable;
        FocusRingDrawable.f(floatingActionButton.getContext(), rippleDrawable, impl.b);
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        r88 impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        r88 impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        r88 impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = a;
        getImpl().o = a2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private r88 getImpl() {
        r88 r88Var = this.p;
        if (r88Var != null) {
            return r88Var;
        }
        r88 r88Var2 = new r88(this, new t9d(this));
        this.p = r88Var2;
        return r88Var2;
    }

    public final int c(int i) {
        int i2 = this.h;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d(boolean z) {
        r88 impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(z ? 8 : 4, z);
            return;
        }
        cwc cwcVar = impl.o;
        AnimatorSet b = cwcVar != null ? impl.b(cwcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : impl.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4f, 0.4f, r88.B, r88.C);
        b.addListener(new n88(impl, z));
        b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final boolean e() {
        r88 impl = getImpl();
        int visibility = impl.s.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    public final void f() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(xb0.c(colorForState, mode));
    }

    public final void g(boolean z) {
        r88 impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        Matrix matrix = impl.x;
        FloatingActionButton floatingActionButton2 = impl.s;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
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
        cwc cwcVar = impl.n;
        AnimatorSet b = cwcVar != null ? impl.b(cwcVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, r88.z, r88.A);
        b.addListener(new gm6(impl, z));
        b.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // defpackage.ts3
    @NonNull
    public us3 getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().s.getElevation();
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
        return this.h;
    }

    public int getExpandedComponentIdHint() {
        return this.o.c;
    }

    @Nullable
    public cwc getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    @NonNull
    public xah getShapeAppearanceModel() {
        xah xahVar = getImpl().a;
        xahVar.getClass();
        return xahVar;
    }

    @Nullable
    public cwc getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.g;
    }

    public int getSizeDimension() {
        return c(this.g);
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
        return this.d;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r88 impl = getImpl();
        q88 q88Var = impl.b;
        if (q88Var != null) {
            l4a.I(impl.s, q88Var);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.i = (sizeDimension - this.j) / 2;
        getImpl().h();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.l;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a);
        Bundle bundle = (Bundle) extendableSavedState.c.get("expandableWidgetHelper");
        bundle.getClass();
        pp4 pp4Var = this.o;
        pp4Var.getClass();
        pp4Var.b = bundle.getBoolean("expanded", false);
        pp4Var.c = bundle.getInt("expandedComponentIdHint", 0);
        if (pp4Var.b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) pp4Var.d;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).f(floatingActionButton);
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
        pp4 pp4Var = this.o;
        pp4Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", pp4Var.b);
        bundle.putInt("expandedComponentIdHint", pp4Var.c);
        extendableSavedState.c.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.m;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.l;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            r88 r88Var = this.p;
            int i2 = -(r88Var.f ? Math.max((r88Var.k - r88Var.s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i2, i2);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            r88 impl = getImpl();
            q88 q88Var = impl.b;
            if (q88Var != null) {
                q88Var.setTintList(colorStateList);
            }
            iz1 iz1Var = impl.d;
            if (iz1Var != null) {
                if (colorStateList != null) {
                    iz1Var.m = colorStateList.getColorForState(iz1Var.getState(), iz1Var.m);
                }
                iz1Var.p = colorStateList;
                iz1Var.n = true;
                iz1Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            q88 q88Var = getImpl().b;
            if (q88Var != null) {
                q88Var.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCompatElevation(float f) {
        r88 impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        r88 impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        r88 impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            a70.p("Custom size must be non-negative");
        } else if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        q88 q88Var = getImpl().b;
        if (q88Var != null) {
            q88Var.s(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.o.c = i;
    }

    public void setHideMotionSpec(@Nullable cwc cwcVar) {
        getImpl().o = cwcVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(cwc.b(i, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            r88 impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
            if (this.d != null) {
                f();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.n.c(i);
        f();
    }

    public void setMaxImageSize(int i) {
        this.j = i;
        r88 impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            r88 impl = getImpl();
            ColorStateList colorStateList2 = this.f;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(rfo.J(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(rfo.J(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z) {
        r88 impl = getImpl();
        impl.g = z;
        impl.h();
    }

    @Override // defpackage.ach
    public void setShapeAppearanceModel(@NonNull xah xahVar) {
        getImpl().g(xahVar);
    }

    public void setShowMotionSpec(@Nullable cwc cwcVar) {
        getImpl().n = cwcVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(cwc.b(i, getContext()));
    }

    public void setSize(int i) {
        this.h = 0;
        if (i != this.g) {
            this.g = i;
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
        if (this.d != colorStateList) {
            this.d = colorStateList;
            f();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            f();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.k != z) {
            this.k = z;
            getImpl().h();
        }
    }

    @Override // defpackage.ewk, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class BaseBehavior<T extends FloatingActionButton> extends us3 {
        public Rect a;
        public final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.p);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // defpackage.us3
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // defpackage.us3
        public final void g(xs3 xs3Var) {
            if (xs3Var.h == 0) {
                xs3Var.h = 80;
            }
        }

        @Override // defpackage.us3
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof xs3 ? ((xs3) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // defpackage.us3
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList k = coordinatorLayout.k(floatingActionButton);
            int size = k.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) k.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof xs3 ? ((xs3) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.p(i, floatingActionButton);
            Rect rect = floatingActionButton.l;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                xs3 xs3Var = (xs3) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) xs3Var).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) xs3Var).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) xs3Var).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) xs3Var).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = bsk.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = bsk.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            xs3 xs3Var = (xs3) floatingActionButton.getLayoutParams();
            if (!this.b || xs3Var.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            Rect rect = this.a;
            if (rect == null) {
                rect = new Rect();
                this.a = rect;
            }
            by4.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.g(false);
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            xs3 xs3Var = (xs3) floatingActionButton.getLayoutParams();
            if (!this.b || xs3Var.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((xs3) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.g(false);
            return true;
        }

        public BaseBehavior() {
            this.b = true;
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

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }
}
