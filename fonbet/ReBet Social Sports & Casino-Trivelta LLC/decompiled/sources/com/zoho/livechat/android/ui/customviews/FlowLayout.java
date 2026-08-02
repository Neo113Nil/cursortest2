package com.zoho.livechat.android.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import rd.C6218a;

/* loaded from: classes4.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f44319a;

    /* renamed from: b, reason: collision with root package name */
    public int f44320b;

    public static class a extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f44321a;

        /* renamed from: b, reason: collision with root package name */
        public int f44322b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f44321a = i10;
            this.f44322b = i11;
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44319a = C6218a.b(6.0f);
        this.f44320b = C6218a.b(6.0f);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                boolean z11 = measuredHeight > i15;
                int max = Math.max(measuredHeight, i15);
                if (measuredWidth + paddingLeft + getPaddingRight() > i14) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = z11 ? paddingTop + this.f44319a + i15 : paddingTop + this.f44319a + max;
                    i15 = measuredHeight;
                } else {
                    i15 = max;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
                paddingLeft += measuredWidth + this.f44320b;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int resolveSize = View.resolveSize(1000, i10);
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), childAt.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i11, 0, childAt.getLayoutParams().height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                boolean z10 = measuredHeight > i12;
                int max = Math.max(measuredHeight, i12);
                if (measuredWidth + paddingLeft + getPaddingRight() > resolveSize) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = z10 ? paddingTop + this.f44319a + i12 : paddingTop + this.f44319a + max;
                    i12 = measuredHeight;
                } else {
                    i12 = max;
                }
                paddingLeft += measuredWidth + this.f44320b;
            }
        }
        setMeasuredDimension(resolveSize, View.resolveSize(paddingTop + i12 + getPaddingBottom(), i11));
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
