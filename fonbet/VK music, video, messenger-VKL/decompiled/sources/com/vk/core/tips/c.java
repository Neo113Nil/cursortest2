package com.vk.core.tips;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: WindowBackground.kt */
/* loaded from: classes17.dex */
public final class c extends Drawable {
    public final a a;
    public float b;

    /* compiled from: WindowBackground.kt */
    public static abstract class a {
        public final Paint a;
        public final Paint b;
        public float c;
        public float d;
        public float e;
        public float f;

        public a(int i) {
            new RectF();
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            paint.setColor(i);
            this.a = paint;
            this.b = new Paint();
        }

        public void a(Canvas canvas, Rect rect, float f) {
            canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, this.b);
        }

        public void b(RectF rectF) {
            this.c = rectF.width();
            this.d = rectF.height();
            this.e = rectF.centerX();
            this.f = rectF.centerY();
        }
    }

    /* compiled from: WindowBackground.kt */
    public static final class b extends a {
        public float g;

        @Override // com.vk.core.tips.c.a
        public final void a(Canvas canvas, Rect rect, float f) {
            super.a(canvas, rect, f);
            canvas.drawCircle(this.e, this.f, this.g * f, this.a);
        }

        @Override // com.vk.core.tips.c.a
        public final void b(RectF rectF) {
            super.b(rectF);
            this.g = rectF.height() / 2;
        }
    }

    /* compiled from: WindowBackground.kt */
    public static final class d extends a {
        public final float g;

        public d(float f) {
            super(0);
            this.g = f;
        }

        @Override // com.vk.core.tips.c.a
        public final void a(Canvas canvas, Rect rect, float f) {
            super.a(canvas, rect, f);
            float f2 = this.c * f;
            float f3 = this.d * f;
            float f4 = this.g * f;
            float f5 = 2;
            float f6 = this.e - (f2 / f5);
            float f7 = this.f - (f3 / f5);
            canvas.drawRoundRect(f6, f7, f6 + f2, f7 + f3, f4, f4, this.a);
        }
    }

    public c(RectF rectF, a aVar) {
        this.a = aVar;
        aVar.getClass();
        aVar.b(rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.a(canvas, getBounds(), this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
    }

    /* compiled from: WindowBackground.kt */
    /* renamed from: com.vk.core.tips.c$c, reason: collision with other inner class name */
    public static final class C0781c extends a {
        @Override // com.vk.core.tips.c.a
        public final void a(Canvas canvas, Rect rect, float f) {
        }
    }
}
