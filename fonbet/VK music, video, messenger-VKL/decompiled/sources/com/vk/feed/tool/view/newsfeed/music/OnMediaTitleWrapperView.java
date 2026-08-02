package com.vk.feed.tool.view.newsfeed.music;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: OnMediaTitleWrapperView.kt */
/* loaded from: classes18.dex */
public final class OnMediaTitleWrapperView extends LinearLayout {
    public Integer b;
    public Integer c;
    public boolean d;

    public OnMediaTitleWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b = null;
        this.c = null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num = this.b;
        Integer num2 = this.c;
        if (this.d && num != null) {
            i = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (this.d && num2 != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(num2.intValue(), 1073741824);
        }
        super.onMeasure(i, i2);
        this.b = Integer.valueOf(getMeasuredWidth());
        this.c = Integer.valueOf(getMeasuredHeight());
    }

    public final void setSizeFrozen(boolean z) {
        this.d = z;
        if (z) {
            return;
        }
        this.b = null;
        this.c = null;
    }
}
