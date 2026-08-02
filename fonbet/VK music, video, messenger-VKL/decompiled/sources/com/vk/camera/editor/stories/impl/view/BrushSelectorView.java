package com.vk.camera.editor.stories.impl.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.vk.camera.editor.stories.impl.R$styleable;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.iah0;
import xsna.m33;
import xsna.n8g;

/* loaded from: classes16.dex */
public class BrushSelectorView extends View {
    public static final int f = iah0.a(20);
    public static final Paint g;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public int e;

    static {
        Paint paint = new Paint(1);
        g = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    public BrushSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, R.drawable.pen_marker_color_48);
        int resourceId2 = obtainStyledAttributes.getResourceId(2, R.drawable.pen_marker_color_white_48);
        int resourceId3 = obtainStyledAttributes.getResourceId(0, R.drawable.pen_marker_chrome_48);
        obtainStyledAttributes.recycle();
        setBackgroundResource(R.drawable.white_ripple_unbounded);
        setTopDrawableResId(resourceId);
        setTopWhiteDrawableResId(resourceId2);
        setBottomDrawableResId(resourceId3);
        Drawable drawable = this.b;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(-5460562, mode);
        this.c.setColorFilter(-5460562, mode);
        this.e = 0;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = canvas.getWidth() / 2;
        int height = canvas.getHeight() / 2;
        int i = this.e;
        if (i != 0) {
            boolean z = false;
            boolean z2 = Color.red(i) == 255 && Color.green(this.e) == 255 && Color.blue(this.e) == 255;
            if (Color.red(this.e) == 0 && Color.green(this.e) == 0 && Color.blue(this.e) == 0) {
                z = true;
            }
            Paint paint = g;
            if (z2 || z) {
                paint.setColor(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha));
            } else {
                paint.setColor(this.e);
            }
            canvas.drawCircle(width, height, f, paint);
        }
        if (Color.red(this.e) == 255 && Color.green(this.e) == 255 && Color.blue(this.e) == 255) {
            this.c.draw(canvas);
        } else {
            this.b.draw(canvas);
        }
        this.d.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b.setBounds(0, 0, i, i2);
        this.c.setBounds(0, 0, i, i2);
        this.d.setBounds(0, 0, i, i2);
    }

    public void setBottomDrawableResId(int i) {
        this.d = m33.a(i, getContext());
        invalidate();
    }

    public void setColor(int i) {
        Drawable drawable = this.b;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(i, mode);
        this.c.setColorFilter(i, mode);
        this.e = n8g.l(i, 51);
        invalidate();
    }

    public void setTopDrawableResId(int i) {
        this.b = m33.a(i, getContext());
        invalidate();
    }

    public void setTopWhiteDrawableResId(int i) {
        this.c = m33.a(i, getContext());
        invalidate();
    }
}
