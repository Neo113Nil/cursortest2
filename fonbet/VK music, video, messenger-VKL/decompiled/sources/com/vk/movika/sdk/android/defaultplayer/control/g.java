package com.vk.movika.sdk.android.defaultplayer.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import xsna.x9;

/* loaded from: classes3.dex */
public final class g extends View {
    public static final a Companion = new a();
    public static final RectF d = new RectF(-0.025f, -0.04f, 0.05f, 0.08f);
    public final Paint b;
    public final Paint c;

    public static final class a {
    }

    public g(Context context) {
        super(context);
        Paint c = x9.c(true);
        Paint.Style style = Paint.Style.STROKE;
        c.setStyle(style);
        c.setStrokeWidth(1.0f);
        c.setColor(Color.parseColor("#FFFFFF"));
        this.b = c;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        paint.setColor(Color.parseColor("#FFFFFF"));
        this.c = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() - 40.0f;
        float height = getHeight() - 40.0f;
        canvas.drawRoundRect(40.0f, 40.0f, width, height, 14.0f, 14.0f, this.b);
        for (int i = 1; i < 41; i++) {
            float f = i;
            int i2 = (int) (128 - (3.2f * f));
            Integer valueOf = Integer.valueOf(i2);
            if (i2 < 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            Paint paint = this.c;
            paint.setAlpha(intValue);
            float f2 = (((i * 2) / 100.0f) + 1.0f) * 14.0f;
            float f3 = 40.0f - f;
            canvas.drawRoundRect(f3, f3, width + f, height + f, f2, f2, paint);
        }
    }
}
