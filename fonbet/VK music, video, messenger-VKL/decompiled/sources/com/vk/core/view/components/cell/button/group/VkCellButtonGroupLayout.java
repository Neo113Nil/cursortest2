package com.vk.core.view.components.cell.button.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.hbh0;
import xsna.m33;
import xsna.swe0;
import xsna.too0;
import xsna.vev0;

/* compiled from: VkCellButtonGroupLayout.kt */
/* loaded from: classes17.dex */
public final class VkCellButtonGroupLayout extends LinearLayout implements too0 {
    public VkCellButtonGroupLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        setDividerDrawable(m33.a(R.drawable.ds_internal_cell_button_group_divider, context));
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            int i3 = (int) vev0.i;
            setPadding(i3, getPaddingTop(), i3, getPaddingBottom());
        } else if (childCount != 1) {
            View childAt = getChildAt(swe0.q(0, getChildCount()).b);
            int i4 = (int) vev0.i;
            childAt.setPadding(i4, childAt.getPaddingTop(), childAt.getPaddingRight(), childAt.getPaddingBottom());
            View childAt2 = getChildAt(swe0.q(0, getChildCount()).c);
            childAt2.setPadding(childAt2.getPaddingLeft(), childAt2.getPaddingTop(), i4, childAt2.getPaddingBottom());
        } else {
            View childAt3 = getChildAt(swe0.q(0, getChildCount()).b);
            int i5 = (int) vev0.i;
            childAt3.setPadding(i5, childAt3.getPaddingTop(), i5, childAt3.getPaddingBottom());
        }
        super.measureChild(view, i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = (getMeasuredHeight() - hbh0.b(28, getContext())) / 2;
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        setDividerPadding(measuredHeight);
    }

    public VkCellButtonGroupLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setOrientation(0);
        setShowDividers(2);
        e3m.a aVar = e3m.a;
        setDividerDrawable(m33.a(R.drawable.ds_internal_cell_button_group_divider, context));
        setGravity(16);
        setDividerPadding(hbh0.b(10, context));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(0, -2, 1.0f);
    }
}
