package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: MaxHeightSaveFrameLayout.kt */
/* loaded from: classes17.dex */
public final class MaxHeightSaveFrameLayout extends FrameLayout {
    public MaxHeightSaveFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i3 = layoutParams != null ? layoutParams.height : 0;
        if (size > i3) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = size;
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
