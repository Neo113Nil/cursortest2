package com.vk.story.viewer.impl.presentation.stories.view.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: AspectRatioWrapperFrameLayout.kt */
/* loaded from: classes6.dex */
public final class AspectRatioWrapperFrameLayout extends FrameLayout {
    public float b;

    public AspectRatioWrapperFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 1.0f;
    }

    public final float getAspectRatio() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = size;
        float f2 = size2;
        float f3 = f / f2;
        float f4 = this.b;
        if (f3 > f4) {
            size = (int) (f2 * f4);
        } else {
            size2 = (int) (f / f4);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void setAspectRatio(float f) {
        if (this.b == f) {
            return;
        }
        this.b = f;
        requestLayout();
    }
}
