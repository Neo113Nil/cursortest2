package com.vk.im.tool.view.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: ImMaxHeightSaveFrameLayout.kt */
/* loaded from: classes2.dex */
public final class ImMaxHeightSaveFrameLayout extends FrameLayout {
    public int b;
    public int c;

    public ImMaxHeightSaveFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = getResources().getConfiguration().orientation;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = getResources().getConfiguration().orientation;
        int size = View.MeasureSpec.getSize(i2);
        if (i3 != this.c) {
            this.b = size;
            this.c = i3;
        } else if (size > this.b) {
            this.b = size;
        }
        int i4 = this.b;
        if (i4 > size) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
