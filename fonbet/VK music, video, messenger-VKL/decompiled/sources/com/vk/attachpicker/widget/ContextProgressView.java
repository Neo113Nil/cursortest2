package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.iah0;

/* loaded from: classes15.dex */
public class ContextProgressView extends View {
    public int b;
    public long c;
    public final RectF d;
    public final Paint e;
    public final int f;
    public int g;

    public ContextProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.d = new RectF();
        Paint paint = new Paint(1);
        this.e = paint;
        int a = iah0.a(2);
        this.f = a;
        paint.setColor(dhr0.t.c(R.attr.colorAccent));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(a);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = System.currentTimeMillis();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.c;
        this.c = currentTimeMillis;
        this.b = (int) (((j * 360) / 1000.0f) + this.b);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight()) - this.f;
        int i = min / 2;
        float measuredWidth = (getMeasuredWidth() / 2) - i;
        float measuredHeight = (getMeasuredHeight() / 2) - i;
        float measuredWidth2 = (getMeasuredWidth() / 2) + i;
        float measuredHeight2 = (getMeasuredHeight() / 2) + i;
        RectF rectF = this.d;
        rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
        int i2 = this.g;
        Paint paint = this.e;
        if (i2 != min) {
            this.g = min;
            paint.setShader(new SweepGradient(canvas.getWidth() / 2, canvas.getHeight() / 2, 0, paint.getColor()));
        }
        canvas.save();
        canvas.rotate(this.b, canvas.getWidth() / 2, canvas.getHeight() / 2);
        canvas.drawArc(rectF, -90.0f, 360.0f, false, paint);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.c = System.currentTimeMillis();
        invalidate();
    }
}
