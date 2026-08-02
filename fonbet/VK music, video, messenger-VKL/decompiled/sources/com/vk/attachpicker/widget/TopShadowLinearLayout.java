package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.m33;

/* loaded from: classes15.dex */
public class TopShadowLinearLayout extends LinearLayout {
    public final int b;
    public final Drawable c;
    public boolean d;

    public TopShadowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = iah0.a(8);
        this.d = true;
        Drawable a = m33.a(R.drawable.picker_bg_attach_toolbar, getContext());
        this.c = a;
        a.setCallback(this);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.c;
        if (drawable == null || !this.d) {
            return;
        }
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.c == null || !this.d) {
            return;
        }
        int dimension = (int) getResources().getDimension(R.dimen.picker_toolbar_height);
        this.c.setBounds(0, dimension, i, this.b + dimension);
    }

    public void setShadowEnabled(boolean z) {
        this.d = z;
        invalidate();
    }
}
