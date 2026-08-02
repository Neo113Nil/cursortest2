package com.vk.superapp.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.text.VkText;
import xsna.iah0;

/* compiled from: FixTextView.kt */
/* loaded from: classes6.dex */
public final class FixTextView extends VkText {
    public FixTextView(Context context) {
        this(context, null, 6, 0);
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return getEllipsize() == TextUtils.TruncateAt.MARQUEE || super.isSelected();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int compoundPaddingEnd = getCompoundPaddingEnd() + getCompoundPaddingStart();
        int measuredWidth = getMeasuredWidth();
        if (getLayout() instanceof StaticLayout) {
            Layout layout = getLayout();
            float spacingAdd = layout.getSpacingAdd() * 2;
            int lineCount = layout.getLineCount();
            int i3 = 0;
            for (int i4 = 0; i4 < lineCount; i4++) {
                int ceil = (int) Math.ceil((layout.getLineRight(i4) - layout.getLineLeft(i4)) + spacingAdd);
                boolean z = layout.getEllipsisCount(i4) > 0;
                i3 = Math.max(i3, ceil);
                if (z) {
                    break;
                }
            }
            measuredWidth = Math.min(i3, layout.getEllipsizedWidth()) + compoundPaddingEnd;
        }
        Typeface typeface = getTypeface();
        if (typeface != null ? typeface.isItalic() : false) {
            measuredWidth += iah0.a(1);
        }
        if (measuredWidth != getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, View.MeasureSpec.getMode(i)), i2);
        }
    }

    public FixTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public FixTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setEmojiCompatEnabled(false);
    }
}
