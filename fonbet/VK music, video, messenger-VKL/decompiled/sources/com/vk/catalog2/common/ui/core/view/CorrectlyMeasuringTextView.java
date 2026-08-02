package com.vk.catalog2.common.ui.core.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import com.vk.core.view.links.LinkedTextView;

/* loaded from: classes16.dex */
public class CorrectlyMeasuringTextView extends LinkedTextView {
    public CorrectlyMeasuringTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null) {
            float minWidth = (getMinWidth() - getPaddingLeft()) - getPaddingRight();
            int lineCount = layout.getLineCount();
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getLineWidth(i3) > minWidth) {
                    minWidth = layout.getLineWidth(i3);
                }
            }
            setMeasuredDimension(getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(minWidth)), getMeasuredHeight());
        }
    }
}
