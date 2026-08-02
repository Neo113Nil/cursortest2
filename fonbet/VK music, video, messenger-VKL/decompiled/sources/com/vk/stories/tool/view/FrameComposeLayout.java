package com.vk.stories.tool.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: FrameComposeLayout.kt */
/* loaded from: classes6.dex */
public final class FrameComposeLayout extends FrameLayout {
    public FrameComposeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        super.onMeasure(i, i2);
        if (childAt == null || childAt.getVisibility() == 8) {
            setMeasuredDimension(View.resolveSize(0, i), View.resolveSize(0, i2));
            return;
        }
        measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), 0, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824), 0);
        setMeasuredDimension(View.resolveSize(getPaddingRight() + childAt.getMeasuredWidth() + getPaddingLeft(), i), View.resolveSize(getPaddingBottom() + childAt.getMeasuredHeight() + getPaddingTop(), i2));
    }
}
