package com.vk.feed.tool.view.newsfeed.tab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vk.feed.design.R$styleable;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;

/* compiled from: TabTextView.kt */
/* loaded from: classes18.dex */
public final class TabTextView extends WrapContentAutoSizingTextView {
    public Drawable e;
    public int f;

    public TabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e);
        setOverlayDrawableEndSize(obtainStyledAttributes.getDimensionPixelSize(0, this.f));
        obtainStyledAttributes.recycle();
    }

    public final Drawable getOverlayDrawableEnd() {
        return this.e;
    }

    public final int getOverlayDrawableEndSize() {
        return this.f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        Drawable drawable = this.e;
        if (drawable != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (getLayoutDirection() != 1) {
                i2 = getMeasuredWidth() - this.f;
                i = getMeasuredWidth();
            } else {
                i = this.f;
                i2 = 0;
            }
            drawable.setBounds(i2, (getMeasuredHeight() / 2) - (this.f / 2), i, (this.f / 2) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
    }

    public final void setOverlayDrawableEnd(Drawable drawable) {
        if (this.e != drawable) {
            this.e = drawable;
            invalidate();
        }
    }

    public final void setOverlayDrawableEndSize(int i) {
        if (this.f != i) {
            this.f = i;
            invalidate();
        }
    }
}
