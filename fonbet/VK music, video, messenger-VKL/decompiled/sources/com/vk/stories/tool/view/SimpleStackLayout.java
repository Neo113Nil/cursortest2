package com.vk.stories.tool.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: SimpleStackLayout.kt */
/* loaded from: classes6.dex */
public final class SimpleStackLayout extends ViewGroup {
    public SimpleStackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = ((i3 - i) - paddingLeft) - getPaddingRight();
        int paddingBottom = ((i4 - i2) - paddingTop) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int min = childAt.getLayoutParams().width > 0 ? Math.min(childAt.getLayoutParams().width, paddingRight) : paddingRight;
                int min2 = childAt.getLayoutParams().height > 0 ? Math.min(childAt.getLayoutParams().height, paddingBottom) : paddingBottom;
                int i6 = ((paddingRight - min) / 2) + paddingLeft;
                int i7 = ((paddingBottom - min2) / 2) + paddingTop;
                childAt.layout(i6, i7, min + i6, min2 + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), layoutParams.height));
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(size, i, 0), View.resolveSizeAndState(size2, i2, 0));
    }
}
