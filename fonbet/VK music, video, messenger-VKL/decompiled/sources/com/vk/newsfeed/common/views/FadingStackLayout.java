package com.vk.newsfeed.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.common.R$styleable;
import defpackage.j0;
import xsna.bwt0;
import xsna.epx;

/* compiled from: FadingStackLayout.kt */
/* loaded from: classes4.dex */
public final class FadingStackLayout extends ViewGroup {
    public final Paint b;
    public final Paint c;
    public final Rect d;
    public final RectF e;
    public final LinearGradient f;
    public LinearGradient g;
    public Integer h;
    public final Matrix i;
    public boolean j;
    public Integer k;
    public int l;
    public View m;

    /* compiled from: FadingStackLayout.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
        public int a;
    }

    public FadingStackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        this.d = new Rect();
        this.e = new RectF();
        LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0, -1, Shader.TileMode.CLAMP);
        this.f = linearGradient;
        this.i = new Matrix();
        this.l = Integer.MAX_VALUE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        setClipChildren(true);
        setClipToPadding(true);
    }

    public final Rect a(LinearGradient linearGradient) {
        Rect rect = this.d;
        getDrawingRect(rect);
        rect.left = getPaddingLeft() + rect.left;
        rect.right -= getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        Matrix matrix = this.i;
        matrix.setScale(1.0f, measuredHeight);
        linearGradient.setLocalMatrix(matrix);
        return rect;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num = this.k;
        boolean z = this.j;
        if (z && num != null) {
            super.dispatchDraw(canvas);
            LinearGradient linearGradient = this.g;
            if (linearGradient != null) {
                canvas.drawRect(a(linearGradient), this.c);
                return;
            }
            return;
        }
        if (!z) {
            super.dispatchDraw(canvas);
            return;
        }
        Rect a2 = a(this.f);
        RectF rectF = this.e;
        rectF.set(a2);
        int saveLayer = canvas.saveLayer(rectF, null);
        super.dispatchDraw(canvas);
        canvas.drawRect(a2, this.b);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-2, -2);
        aVar.a = 8388659;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            a aVar = new a((a) layoutParams);
            aVar.a = 8388659;
            return aVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar2 = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar2.a = 8388659;
            return aVar2;
        }
        if (layoutParams != null) {
            a aVar3 = new a(layoutParams);
            aVar3.a = 8388659;
            return aVar3;
        }
        a aVar4 = new a(-2, -2);
        aVar4.a = 8388659;
        return aVar4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int a2;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != null && childAt.getVisibility() == 0 && childAt.getVisibility() == 0) {
                a aVar = (a) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > 0) {
                    int i9 = aVar.a;
                    if (i9 == 0) {
                        i9 = 8388659;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i9, childAt.getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        a2 = j0.a(paddingRight, paddingLeft, measuredWidth, 2, paddingLeft) + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                        i5 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i6 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        int i10 = i7 + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        int i11 = i10 + measuredHeight;
                        childAt.layout(i6, i10, measuredWidth + i6, i11);
                        i7 = i11;
                    } else {
                        a2 = paddingRight - measuredWidth;
                        i5 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                    }
                    i6 = a2 - i5;
                    int i102 = i7 + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    int i112 = i102 + measuredHeight;
                    childAt.layout(i6, i102, measuredWidth + i6, i112);
                    i7 = i112;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        if (r2 < r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fe, code lost:
    
        if (r2 < r12) goto L66;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        this.j = false;
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt != null) {
                bwt0.p0(childAt, !this.j);
                if (!this.j) {
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), childAt.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight = childAt.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i4 = measuredHeight + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    int i5 = i4 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + paddingBottom;
                    if (i5 > this.l) {
                        this.j = true;
                    }
                    paddingBottom = i5;
                }
            }
            i3++;
        }
        View view = this.m;
        if (this.j && view != null) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i6 = marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            view.measure(ViewGroup.getChildMeasureSpec(i, i6 + (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0), getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight2 = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            int i7 = measuredHeight2 + (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0);
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            marginLayoutParams = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            r1 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + i7;
        }
        if (mode == 0) {
            suggestedMinimumHeight = getSuggestedMinimumHeight();
        } else if (mode != 1073741824) {
            int i8 = this.l - r1;
            if (paddingBottom > i8) {
                paddingBottom = i8;
            }
            suggestedMinimumHeight = getSuggestedMinimumHeight();
        } else {
            paddingBottom = this.l - r1;
        }
        setMeasuredDimension(size, paddingBottom);
    }

    public final void setCutView(View view) {
        this.m = view;
    }

    public final void setFadingColor(Integer num) {
        if (epx.f(this.k, num)) {
            return;
        }
        this.k = num;
        if (num != null && !epx.f(this.h, num)) {
            this.h = num;
            LinearGradient linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0, num.intValue(), Shader.TileMode.CLAMP);
            this.g = linearGradient;
            this.c.setShader(linearGradient);
        }
        invalidate();
    }

    public final void setMaxHeight(int i) {
        this.l = i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.a = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d);
        aVar.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return aVar;
    }
}
