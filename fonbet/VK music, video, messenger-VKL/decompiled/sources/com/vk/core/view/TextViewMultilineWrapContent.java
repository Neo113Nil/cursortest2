package com.vk.core.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextViewMultilineWrapContent.kt */
/* loaded from: classes17.dex */
public final class TextViewMultilineWrapContent extends AppCompatTextView {
    public TextViewMultilineWrapContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && layout.getLineCount() >= 2) {
            int lineCount = layout.getLineCount();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i3 = 0; i3 < lineCount; i3++) {
                float lineMax = layout.getLineMax(i3);
                if (lineMax > f) {
                    f = lineMax;
                }
            }
            setMeasuredDimension(getCompoundPaddingRight() + getCompoundPaddingLeft() + ((int) Math.ceil(f)), getMeasuredHeight());
        }
    }
}
