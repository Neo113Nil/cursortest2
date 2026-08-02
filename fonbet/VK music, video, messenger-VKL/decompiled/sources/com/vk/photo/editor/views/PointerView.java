package com.vk.photo.editor.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.vk.photo.editor.api.R$styleable;
import xsna.alk;
import xsna.n8g;
import xsna.x9;

/* compiled from: PointerView.kt */
/* loaded from: classes4.dex */
public final class PointerView extends View {
    public final Paint b;
    public final Paint c;
    public int d;
    public float e;
    public float f;

    public PointerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint c = x9.c(true);
        c.setColor(n8g.l(-1, 191));
        Paint.Style style = Paint.Style.FILL;
        c.setStyle(style);
        this.b = c;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setColor(n8g.l(-1, 127));
        this.c = paint;
        this.d = -1;
        float f = 11;
        this.e = alk.p(f);
        this.f = alk.p(28);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
        setInnerCircleRadius(obtainStyledAttributes.getDimension(1, alk.p(f)));
        setOuterCircleRadius(obtainStyledAttributes.getDimension(2, alk.p(f)));
        setColor(obtainStyledAttributes.getColor(0, -1));
        obtainStyledAttributes.recycle();
    }

    public final int getColor() {
        return this.d;
    }

    public final float getInnerCircleRadius() {
        return this.e;
    }

    public final float getOuterCircleRadius() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.f, this.c);
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.e, this.b);
    }

    public final void setColor(int i) {
        this.d = i;
        this.b.setColor(n8g.l(-1, 191));
        this.c.setColor(n8g.l(-1, 127));
        invalidate();
    }

    public final void setInnerCircleRadius(float f) {
        this.e = f;
        invalidate();
    }

    public final void setOuterCircleRadius(float f) {
        this.f = f;
        invalidate();
    }
}
