package com.vk.feed.tool.view.newsfeed.photo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import xsna.an10;
import xsna.ccr0;
import xsna.epx;
import xsna.f5h0;
import xsna.gp10;
import xsna.ktc0;
import xsna.n8g;
import xsna.tr;
import xsna.x9g0;
import xsna.xso0;

/* compiled from: BlurredImageWrapper.kt */
/* loaded from: classes18.dex */
public final class BlurredImageWrapper extends ViewGroup {
    public static final /* synthetic */ int m = 0;
    public int b;
    public int c;
    public final ccr0 d;
    public ColorDrawable e;
    public String f;
    public boolean g;
    public final RectF h;
    public xso0 i;
    public Float j;
    public final Rect k;
    public final Rect l;

    public BlurredImageWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getUsedHeight() {
        return getPaddingBottom() + getPaddingTop();
    }

    private final int getUsedWidth() {
        return getPaddingRight() + getPaddingLeft();
    }

    public final void a(String str) {
        if (epx.f(this.f, str)) {
            return;
        }
        this.f = str;
        this.g = true;
    }

    public final void b(int i) {
        if (this.e == null) {
            this.e = new ColorDrawable();
        }
        ColorDrawable colorDrawable = this.e;
        if (colorDrawable != null) {
            colorDrawable.setColor(n8g.l(i, an10.b(255 * 0.24f)));
        }
        this.d.g.r(this.e, 0);
    }

    public final boolean c() {
        return this.b < getMeasuredWidth() - getUsedWidth() || this.c < getMeasuredHeight() - getUsedHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (c()) {
            int save = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int measuredWidth = getMeasuredWidth() - getUsedWidth();
            int measuredHeight = getMeasuredHeight() - getUsedHeight();
            ccr0 ccr0Var = this.d;
            ccr0Var.setBounds(0, 0, measuredWidth, measuredHeight);
            ccr0Var.m = measuredWidth;
            ccr0Var.n = measuredHeight;
            ccr0Var.draw(canvas);
            canvas.restoreToCount(save);
        }
        super.dispatchDraw(canvas);
        if (this.i != null) {
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth2 = getMeasuredWidth() - getPaddingRight();
            float measuredHeight2 = getMeasuredHeight() - getPaddingBottom();
            RectF rectF = this.h;
            rectF.set(paddingLeft, paddingTop, measuredWidth2, measuredHeight2);
            xso0 xso0Var = this.i;
            if (xso0Var != null) {
                xso0Var.b(canvas, rectF, xso0.i);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = new a(getContext(), attributeSet);
        aVar.a = 17;
        return aVar;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable == this.d) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.d.t();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.d.s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((a) childAt.getLayoutParams()).a;
                Rect rect = this.k;
                rect.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
                int i7 = rect.top;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                rect.top = i7 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                int i8 = rect.left;
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                rect.left = i8 + (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
                int i9 = rect.right;
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                rect.right = i9 - (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0);
                int i10 = rect.bottom;
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                rect.bottom = i10 - (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
                Gravity.apply(i6, measuredWidth, measuredHeight, this.k, this.l, layoutDirection);
                Rect rect2 = this.l;
                childAt.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(View.MeasureSpec.getSize(i), 1073741823)), 1073741824);
        int usedWidth = getUsedWidth();
        int usedHeight = getUsedHeight();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int a2 = gp10.a(makeMeasureSpec, suggestedMinimumWidth, Integer.MAX_VALUE, 0);
        int a3 = gp10.a(i2, suggestedMinimumHeight, Integer.MAX_VALUE, 0);
        int a4 = tr.a(a2, 1073741823, 0, Integer.MIN_VALUE);
        int a5 = tr.a(a3, 1073741823, 0, Integer.MIN_VALUE);
        this.b = 0;
        this.c = 0;
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            int i4 = a4;
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i4, 0, a5, 0);
                if (!((a) childAt.getLayoutParams()).b) {
                    this.b = Math.max(this.b, childAt.getMeasuredWidth());
                    this.c = Math.max(this.c, childAt.getMeasuredHeight());
                }
            }
            i3++;
            a4 = i4;
        }
        int b = gp10.b(makeMeasureSpec, suggestedMinimumWidth, Integer.MAX_VALUE, usedWidth, this.b);
        int b2 = gp10.b(i2, suggestedMinimumHeight, Integer.MAX_VALUE, usedHeight, this.c);
        Float f = this.j;
        if (f != null && !epx.d(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            b2 = an10.b(b / f.floatValue());
        }
        setMeasuredDimension(b, b2);
        if (c() && this.g) {
            this.g = false;
            this.d.r(this.f);
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        this.d.t();
        super.onStartTemporaryDetach();
    }

    public final void setBlurPlaceholderColor(int i) {
        this.d.u(new ColorDrawable(i));
    }

    public final void setBlurPostprocessor(ktc0 ktc0Var) {
        this.d.i = ktc0Var;
    }

    public final void setBlurResizeOptions(x9g0 x9g0Var) {
        this.d.j = x9g0Var;
    }

    public final void setCornersPainter(xso0 xso0Var) {
        this.i = xso0Var;
        invalidate();
    }

    public final void setViewRatio(Float f) {
        if (epx.e(this.j, f) || epx.d(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return;
        }
        this.j = f;
        requestLayout();
    }

    /* compiled from: BlurredImageWrapper.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
        public int a;
        public boolean b;

        public a(int i, int i2) {
            super(i, i2);
            this.a = 17;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 17;
        }
    }

    public BlurredImageWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        ccr0 ccr0Var = new ccr0(context);
        this.d = ccr0Var;
        this.h = new RectF();
        this.k = new Rect();
        this.l = new Rect();
        ccr0Var.g.o(f5h0.m.a);
        ccr0Var.setCallback(this);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            a aVar = (a) layoutParams;
            a aVar2 = new a((ViewGroup.MarginLayoutParams) aVar);
            aVar2.a = 17;
            aVar2.a = aVar.a;
            aVar2.b = aVar.b;
            return aVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar3 = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar3.a = 17;
            return aVar3;
        }
        if (layoutParams != null) {
            return new a(layoutParams);
        }
        return generateDefaultLayoutParams();
    }
}
