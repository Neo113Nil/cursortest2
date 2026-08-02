package com.vk.feed.design.view.newsfeed.adaptive_discrete_text;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.text.VkText;
import com.vk.typography.a;
import com.vk.typography.b;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VkFeedAdaptiveDiscreteTextView.kt */
/* loaded from: classes18.dex */
public final class VkFeedAdaptiveDiscreteTextView extends VkText {
    public final TextPaint b;
    public List<a> c;

    public VkFeedAdaptiveDiscreteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new TextPaint();
        this.c = EmptyList.b;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        getText();
        int mode = View.MeasureSpec.getMode(i);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : Integer.MAX_VALUE;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE;
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        int size3 = this.c.size();
        a aVar = null;
        for (int i3 = 0; i3 < size3; i3++) {
            aVar = this.c.get(i3);
            TextPaint textPaint = this.b;
            b.d(textPaint, aVar, 0);
            if (getPaddingTop() + getPaddingBottom() + StaticLayout.Builder.obtain(getText(), 0, getText().length(), textPaint, paddingStart).setEllipsize(getEllipsize()).setMaxLines(getMaxLines()).build().getHeight() < size2) {
                break;
            }
        }
        if (aVar != null) {
            b.h(this, aVar, 0);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void setFontStyles(List<a> list) {
        this.c = list;
    }
}
