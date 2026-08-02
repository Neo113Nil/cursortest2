package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f30440a = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    public final Path f30441b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final RectF f30442c = new RectF();

    /* renamed from: d, reason: collision with root package name */
    public int f30443d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f30444e = -2147450625;

    /* renamed from: f, reason: collision with root package name */
    public int f30445f = 10;

    /* renamed from: g, reason: collision with root package name */
    public int f30446g = 20;

    /* renamed from: h, reason: collision with root package name */
    public int f30447h;

    /* renamed from: i, reason: collision with root package name */
    public int f30448i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30449j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30450k;

    public final void a(Canvas canvas, int i10) {
        this.f30440a.setColor(i10);
        this.f30440a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f30441b.reset();
        this.f30441b.setFillType(Path.FillType.EVEN_ODD);
        this.f30441b.addRoundRect(this.f30442c, (float) Math.min(this.f30448i, this.f30446g / 2), (float) Math.min(this.f30448i, this.f30446g / 2), Path.Direction.CW);
        canvas.drawPath(this.f30441b, this.f30440a);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int width = bounds.width();
        int i12 = this.f30445f;
        int i13 = ((width - (i12 * 2)) * i10) / 10000;
        this.f30442c.set(bounds.left + i12, (bounds.bottom - i12) - this.f30446g, r8 + i13, r0 + r2);
        a(canvas, i11);
    }

    public final void c(Canvas canvas, int i10, int i11) {
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int height = bounds.height();
        int i12 = this.f30445f;
        int i13 = ((height - (i12 * 2)) * i10) / 10000;
        this.f30442c.set(bounds.left + i12, bounds.top + i12, r8 + this.f30446g, r0 + i13);
        a(canvas, i11);
    }

    public final void d(int i10) {
        if (this.f30444e != i10) {
            this.f30444e = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f30449j && this.f30447h == 0) {
            return;
        }
        if (this.f30450k) {
            c(canvas, 10000, this.f30443d);
            c(canvas, this.f30447h, this.f30444e);
        } else {
            b(canvas, 10000, this.f30443d);
            b(canvas, this.f30447h, this.f30444e);
        }
    }

    public final void e(int i10) {
        if (this.f30445f != i10) {
            this.f30445f = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C3014e.b(this.f30440a.getColor());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        int i10 = this.f30445f;
        padding.set(i10, i10, i10, i10);
        return this.f30445f != 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        this.f30447h = i10;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f30440a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30440a.setColorFilter(colorFilter);
    }
}
