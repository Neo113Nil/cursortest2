package com.vk.attachpicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import xsna.iah0;

/* loaded from: classes15.dex */
public class MaxWidthFrameLayout extends FrameLayout {
    public int b;

    public MaxWidthFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = iah0.a(400);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.b;
        if (size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxWidth(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }
}
