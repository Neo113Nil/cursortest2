package com.vk.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.ui.R$styleable;

@Deprecated
/* loaded from: classes17.dex */
public class ConstrainedFrameLayout extends FrameLayout {
    public int b;
    public int c;

    public ConstrainedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d);
        try {
            this.c = (int) obtainStyledAttributes.getDimension(0, 2.1474836E9f);
            this.b = (int) obtainStyledAttributes.getDimension(1, 2.1474836E9f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int getMaxHeight() {
        return this.c;
    }

    public int getMaxWidth() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i) == 1073741824) {
            i = View.MeasureSpec.getMode(i) | Math.min(View.MeasureSpec.getSize(i), this.b);
        }
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i2) == 1073741824) {
            i2 = View.MeasureSpec.getMode(i2) | Math.min(View.MeasureSpec.getSize(i2), this.c);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.c = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        this.b = i;
        requestLayout();
    }
}
