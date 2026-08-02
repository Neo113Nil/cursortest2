package com.vk.voip.ui.call_invite.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.dhr0;
import xsna.too0;

/* compiled from: AnonymCallJoinScrollView.kt */
/* loaded from: classes7.dex */
public final class AnonymCallJoinScrollView extends ScrollView implements too0 {
    public Drawable b;
    public final int c;

    public AnonymCallJoinScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = dhr0.t.d(R.attr.vk_toolbar_shadow);
        this.c = cn70.b(12);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b = dhr0.t.d(R.attr.vk_toolbar_shadow);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        super.dispatchDraw(canvas);
        if (getScrollY() <= 0 || (drawable = this.b) == null) {
            return;
        }
        if (drawable != null) {
            drawable.setBounds(0, getScrollY(), getWidth(), getScrollY() + this.c);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        measureChild(childAt, makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, 0));
        int measuredHeight = childAt.getMeasuredHeight();
        super.onMeasure(i, i2);
        if (measuredHeight < size) {
            childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
    }
}
