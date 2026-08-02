package com.vk.catalog2.common.ui.core.design.tools.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.catalog2.common.ui.core.R$styleable;
import com.vk.log.L;
import xsna.iah0;

/* compiled from: BannersFrameLayout.kt */
/* loaded from: classes16.dex */
public final class BannersFrameLayout extends FrameLayout {
    public int b;
    public int c;

    public BannersFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = iah0.a(400);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            setWidthPadding(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setMaxWidthValue(obtainStyledAttributes.getDimensionPixelSize(0, this.b));
        } catch (Throwable th) {
            try {
                L.i(th);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final int getMaxWidthValue() {
        return this.b;
    }

    public final int getWidthPadding() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.b;
        super.onMeasure((size <= i3 || i3 < 0) ? View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - this.c, View.MeasureSpec.getMode(i)) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public final void setMaxWidthValue(int i) {
        if (this.b != i) {
            this.b = i;
            if (isAttachedToWindow()) {
                requestLayout();
            }
        }
    }

    public final void setWidthPadding(int i) {
        if (this.c != i) {
            this.c = i;
            if (isAttachedToWindow()) {
                requestLayout();
            }
        }
    }
}
