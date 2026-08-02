package com.vk.superapp.advertisement.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: FitFromBottomVerticalLayout.kt */
/* loaded from: classes6.dex */
public final class FitFromBottomVerticalLayout extends LinearLayout {
    public FitFromBottomVerticalLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i2) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childCount = getChildCount() - 1;
        int i4 = size;
        while (-1 < childCount) {
            View childAt = getChildAt(childCount);
            if (childAt == null || childAt.getVisibility() == 8) {
                i3 = i;
            } else {
                i3 = i;
                measureChildWithMargins(childAt, i3, paddingRight, View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), paddingBottom);
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                i4 -= measuredHeight + (layoutParams2 == null ? 0 : layoutParams2.bottomMargin + layoutParams2.topMargin);
            }
            childCount--;
            i = i3;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size - i4);
    }
}
