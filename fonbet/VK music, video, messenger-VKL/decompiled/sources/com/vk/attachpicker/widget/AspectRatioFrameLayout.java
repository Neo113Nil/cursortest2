package com.vk.attachpicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.attachpicker.widget.a;

/* loaded from: classes15.dex */
public class AspectRatioFrameLayout extends FrameLayout {
    public int b;
    public float c;
    public boolean d;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 1.0f;
        this.d = true;
    }

    public float getAspectRatio() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a.C0396a a = a.a(this.c, i, i2, this.b, this.d);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(a.a, 1073741824), View.MeasureSpec.makeMeasureSpec(a.b, 1073741824));
    }

    public void setAspectRatio(float f) {
        this.c = f;
        requestLayout();
    }

    public void setCheckAvailableAspectRatio(boolean z) {
        this.d = z;
    }

    public void setMaxWidth(int i) {
        this.b = i;
    }
}
