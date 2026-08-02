package com.vk.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.design.ui.themehelper.R$styleable;
import kotlin.NoWhenBranchMatchedException;
import xsna.gp10;
import xsna.ozl;
import xsna.tr;

/* compiled from: OverSizeChildLayout.kt */
@ozl
/* loaded from: classes17.dex */
public final class OverSizeChildLayout extends ViewGroup {
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;

    public OverSizeChildLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = true;
        this.c = true;
        this.e = 17;
        this.f = 17;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.j, 0, 0);
        setLimitSizeByWidth(obtainStyledAttributes.getBoolean(4, true));
        setLimitSizeByHeight(obtainStyledAttributes.getBoolean(3, true));
        setDisableChangingSize(obtainStyledAttributes.getBoolean(0, false));
        setGravityFitSize(obtainStyledAttributes.getInt(1, 17));
        setGravityOverSize(obtainStyledAttributes.getInt(2, 17));
        obtainStyledAttributes.recycle();
        setClipToPadding(false);
    }

    public final boolean getDisableChangingSize() {
        return this.d;
    }

    public final int getGravityFitSize() {
        return this.e;
    }

    public final int getGravityOverSize() {
        return this.f;
    }

    public final boolean getLimitSizeByHeight() {
        return this.c;
    }

    public final boolean getLimitSizeByWidth() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010c A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int max = Math.max(0, (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd());
        int max2 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int marginStart = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int marginEnd = marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i11 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                int i12 = i11 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                boolean z2 = marginEnd < max;
                if (z2) {
                    i5 = this.e;
                } else {
                    if (z2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = this.f;
                }
                int i13 = i5 & 7;
                boolean z3 = i12 < max2;
                if (z3) {
                    i6 = this.e;
                } else {
                    if (z3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = this.f;
                }
                int i14 = i13 | (i6 & 112);
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int max3 = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                int max4 = Math.max(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                int measuredWidth3 = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i15 = i14 & 7;
                if (i15 != 1) {
                    if (i15 == 3) {
                        paddingLeft = getPaddingLeft();
                        i7 = paddingLeft + measuredWidth3;
                        i8 = i14 & 112;
                        if (i8 != 16) {
                        }
                        paddingTop = getPaddingTop() + ((max4 / 2) - (measuredHeight3 / 2));
                        i9 = paddingTop + measuredHeight3;
                        childAt.layout(paddingLeft, paddingTop, i7, i9);
                    } else if (i15 != 17) {
                        i7 = measuredWidth2 - getPaddingRight();
                        paddingLeft = i7 - measuredWidth3;
                        i8 = i14 & 112;
                        if (i8 != 16 || i8 == 17) {
                            paddingTop = getPaddingTop() + ((max4 / 2) - (measuredHeight3 / 2));
                        } else if (i8 != 48) {
                            i9 = measuredHeight2 - getPaddingBottom();
                            paddingTop = i9 - measuredHeight3;
                            childAt.layout(paddingLeft, paddingTop, i7, i9);
                        } else {
                            paddingTop = getPaddingTop();
                        }
                        i9 = paddingTop + measuredHeight3;
                        childAt.layout(paddingLeft, paddingTop, i7, i9);
                    }
                }
                paddingLeft = ((max3 / 2) - (measuredWidth3 / 2)) + getPaddingLeft();
                i7 = paddingLeft + measuredWidth3;
                i8 = i14 & 112;
                if (i8 != 16) {
                }
                paddingTop = getPaddingTop() + ((max4 / 2) - (measuredHeight3 / 2));
                i9 = paddingTop + measuredHeight3;
                childAt.layout(paddingLeft, paddingTop, i7, i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (getChildCount() == 0) {
            setMeasuredDimension(paddingEnd, paddingBottom);
            return;
        }
        int i3 = 0;
        int a = gp10.a(i, 0, Integer.MAX_VALUE, paddingEnd);
        int a2 = gp10.a(i2, 0, Integer.MAX_VALUE, paddingBottom);
        int a3 = this.d ? tr.a(a, 1073741823, 0, 1073741824) : this.b ? tr.a(a, 1073741823, 0, Integer.MIN_VALUE) : tr.a(0, 1073741823, 0, 0);
        int a4 = this.d ? tr.a(a2, 1073741823, 0, 1073741824) : this.c ? tr.a(a2, 1073741823, 0, Integer.MIN_VALUE) : tr.a(0, 1073741823, 0, 0);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < getChildCount()) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : i3;
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int marginEnd = marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : i3);
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i7 = marginLayoutParams != null ? marginLayoutParams.topMargin : i3;
                ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                int i8 = i7 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
                childAt.measure(ViewGroup.getChildMeasureSpec(a3, marginEnd, layoutParams5.width), ViewGroup.getChildMeasureSpec(a4, i8, layoutParams5.height));
                i5 = Math.max(i5, childAt.getMeasuredWidth() + marginEnd);
                i6 = Math.max(i6, childAt.getMeasuredHeight() + i8);
            }
            i4++;
            i3 = 0;
        }
        setMeasuredDimension(gp10.b(i, 0, Integer.MAX_VALUE, paddingEnd, getPaddingEnd() + getPaddingStart() + i5), gp10.b(i2, 0, Integer.MAX_VALUE, paddingBottom, getPaddingBottom() + getPaddingTop() + i6));
    }

    public final void setDisableChangingSize(boolean z) {
        this.d = z;
        requestLayout();
        invalidate();
    }

    public final void setGravityFitSize(int i) {
        this.e = i;
        requestLayout();
        invalidate();
    }

    public final void setGravityOverSize(int i) {
        this.f = i;
        requestLayout();
        invalidate();
    }

    public final void setLimitSizeByHeight(boolean z) {
        this.c = z;
        requestLayout();
        invalidate();
    }

    public final void setLimitSizeByWidth(boolean z) {
        this.b = z;
        requestLayout();
        invalidate();
    }
}
