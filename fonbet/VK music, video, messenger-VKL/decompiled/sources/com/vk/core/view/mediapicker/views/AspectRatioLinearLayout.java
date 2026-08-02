package com.vk.core.view.mediapicker.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import xsna.iah0;

/* compiled from: AspectRatioLinearLayout.kt */
/* loaded from: classes17.dex */
public final class AspectRatioLinearLayout extends LinearLayout {
    public float b;

    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 1.0f;
    }

    public final float getAspectRation() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (View.MeasureSpec.getSize(i) / this.b), iah0.f().widthPixels), 1073741824));
    }

    public final void setAspectRation(float f) {
        if (this.b == f) {
            return;
        }
        this.b = f;
        requestLayout();
    }
}
