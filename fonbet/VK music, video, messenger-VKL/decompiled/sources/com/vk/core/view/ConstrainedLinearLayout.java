package com.vk.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.libuilight.R$styleable;

/* loaded from: classes17.dex */
public class ConstrainedLinearLayout extends LinearLayout {
    public int b;
    public int c;

    public ConstrainedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
            try {
                this.b = obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE);
                this.c = obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i) == 1073741824) {
            i = View.MeasureSpec.getMode(i) | Math.min(View.MeasureSpec.getSize(i), this.b);
        }
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i2) == 1073741824) {
            i2 = View.MeasureSpec.getMode(i2) | Math.min(View.MeasureSpec.getSize(i2), this.c);
        }
        super.onMeasure(i, i2);
    }
}
