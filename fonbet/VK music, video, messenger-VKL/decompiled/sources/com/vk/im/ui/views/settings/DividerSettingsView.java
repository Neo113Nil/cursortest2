package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.too0;

/* compiled from: DividerSettingsView.kt */
/* loaded from: classes2.dex */
public final class DividerSettingsView extends View implements too0 {
    public final Paint b;
    public int c;

    public DividerSettingsView(Context context) {
        super(context);
        this.b = new Paint(1);
        this.c = 1;
        a(context, null, 0, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.setColor(dhr0.t.c(R.attr.vk_legacy_separator_alpha));
        invalidate();
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.j, i, i2);
        setLineSize(obtainStyledAttributes.getDimensionPixelSize(1, 1));
        setLineColor(obtainStyledAttributes.getColor(0, -16777216));
        obtainStyledAttributes.recycle();
    }

    public final int getLineColor() {
        return this.b.getColor();
    }

    public final int getLineSize() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom(), this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), getPaddingBottom() + getPaddingTop() + this.c);
    }

    public final void setLineColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public final void setLineSize(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public DividerSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Paint(1);
        this.c = 1;
        a(context, attributeSet, 0, 0);
    }

    public DividerSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Paint(1);
        this.c = 1;
        a(context, attributeSet, i, 0);
    }

    public DividerSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new Paint(1);
        this.c = 1;
        a(context, attributeSet, i, i2);
    }
}
