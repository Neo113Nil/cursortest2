package com.vk.stories.design.view.viewer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.iah0;

/* compiled from: LineProgress.kt */
/* loaded from: classes6.dex */
public final class LineProgress extends View {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public float j;
    public float k;

    public LineProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = iah0.a(5);
        float a = iah0.a(3);
        this.c = a;
        float a2 = iah0.a(1.5f);
        this.d = a2;
        this.e = iah0.a(16);
        Paint paint = new Paint();
        paint.setStrokeWidth(a);
        paint.setColor(context.getColor(R.color.vk_white_alpha12));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.f = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(a);
        paint2.setColor(dhr0.Y(R.attr.vk_ui_icon_tertiary_alpha, context));
        paint2.setStrokeCap(cap);
        this.g = paint2;
        Paint paint3 = new Paint();
        paint3.setStrokeWidth(a);
        paint3.setColor(context.getColor(R.color.vk_white));
        paint3.setStrokeCap(cap);
        this.h = paint3;
        Paint paint4 = new Paint();
        paint4.setStrokeWidth(a2);
        paint4.setColor(context.getColor(R.color.vk_white));
        paint4.setStrokeCap(cap);
        this.i = paint4;
        setWillNotDraw(false);
    }

    public final float getCurPercent() {
        return this.j;
    }

    public final float getSelectedPercent() {
        return this.k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (getWidth() > 0) {
            float f = this.b;
            float f2 = this.e;
            float f3 = f + f2 + this.c;
            canvas.drawLine(f2, f3, getWidth() - this.e, f3, this.f);
            canvas2 = canvas;
            float width = getWidth();
            float f4 = 2;
            float f5 = this.e;
            float f6 = this.j;
            float f7 = ((width - (f5 * f4)) * f6) + f5;
            if (f6 > 0.001d) {
                canvas2.drawLine(f5, f3, f7, f3, this.g);
            }
            float width2 = getWidth();
            float f8 = this.e;
            float f9 = this.k;
            float f10 = ((width2 - (f8 * f4)) * f9) + f8;
            if (f9 > 0.001d) {
                canvas2.drawLine(f8, f3, f10, f3, this.h);
            }
            float f11 = (this.d * f4) + f;
            Paint paint = this.i;
            canvas2.drawLine(f10 - f, f11 - f, f10, f11, paint);
            canvas2.drawLine(f10, f11, f10 + f, f11 - f, paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }
}
