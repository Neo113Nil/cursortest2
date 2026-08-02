package com.vk.attachpicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import xsna.iah0;

/* loaded from: classes15.dex */
public class CustomSpinner extends AppCompatSpinner {
    public static final int l = iah0.a(400);
    public boolean k;

    public CustomSpinner(Context context) {
        super(context);
        this.k = true;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = l;
        if (size > i3 && this.k) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setUseMaxWidthLogic(boolean z) {
        this.k = z;
    }

    public CustomSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = true;
    }
}
