package ru.ozon.app.android.travel.utils.drawable;

import Sc.InterfaceC3999a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0005H\u0017J&\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/utils/drawable/TopRoundedBorderDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "backgroundColor", "", "strokeColor", "borderWidth", "", "radius", "paint", "Landroid/graphics/Paint;", "strokePaint", "path", "Landroid/graphics/Path;", "strokePath", "strokeRect", "Landroid/graphics/RectF;", "radii", "", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "draw", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "bind", "borderColor", "cornerRadius", "preparePaths", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRoundedBorderDrawable extends Drawable {
    private int backgroundColor;
    private float borderWidth;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private float[] radii;
    private float radius;
    private int strokeColor;

    @NotNull
    private final Paint strokePaint;

    @NotNull
    private final Path strokePath;

    @NotNull
    private final RectF strokeRect;

    public TopRoundedBorderDrawable() {
        Paint paint = new Paint(1);
        paint.setColor(this.backgroundColor);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.strokeColor);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.borderWidth);
        this.strokePaint = paint2;
        this.path = new Path();
        this.strokePath = new Path();
        this.strokeRect = new RectF();
        float f7 = this.radius;
        this.radii = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private final void preparePaths(Rect bounds) {
        float f7 = this.borderWidth * 0.5f;
        this.path.rewind();
        float f11 = bounds.right;
        float f12 = bounds.bottom;
        float[] fArr = this.radii;
        Path.Direction direction = Path.Direction.CW;
        this.path.addRoundRect(bounds.left, bounds.top + f7, f11, f12, fArr, direction);
        this.strokeRect.set(bounds.left - f7, bounds.top + f7, bounds.right + f7, bounds.bottom);
        this.strokePath.rewind();
        this.strokePath.addRoundRect(this.strokeRect, this.radii, direction);
    }

    public final void bind(int borderColor, float borderWidth, float cornerRadius, int backgroundColor) {
        boolean z11;
        boolean z12 = true;
        if (this.borderWidth == borderWidth) {
            z11 = false;
        } else {
            this.borderWidth = borderWidth;
            this.strokePaint.setStrokeWidth(borderWidth);
            z11 = true;
        }
        if (this.strokeColor != borderColor) {
            this.strokeColor = borderColor;
            this.strokePaint.setColor(borderColor);
            z11 = true;
        }
        if (this.backgroundColor != backgroundColor) {
            this.backgroundColor = backgroundColor;
            this.paint.setColor(backgroundColor);
            z11 = true;
        }
        if (this.radius == cornerRadius) {
            z12 = z11;
        } else {
            this.radius = cornerRadius;
            this.radii = new float[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        if (z12) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.path, this.paint);
        if (this.borderWidth > 0.0f) {
            float f7 = getBounds().left;
            float f11 = getBounds().top;
            float f12 = getBounds().right;
            float f13 = getBounds().top + this.radius + this.borderWidth;
            int save = canvas.save();
            canvas.clipRect(f7, f11, f12, f13);
            try {
                canvas.drawPath(this.strokePath, this.strokePaint);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC3999a
    public int getOpacity() {
        return this.radius == 0.0f ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        preparePaths(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (this.paint.getAlpha() == alpha && this.strokePaint.getAlpha() == alpha) {
            return;
        }
        this.paint.setAlpha(alpha);
        this.strokePaint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (Intrinsics.d(this.paint.getColorFilter(), colorFilter) && Intrinsics.d(this.strokePaint.getColorFilter(), colorFilter)) {
            return;
        }
        this.paint.setColorFilter(colorFilter);
        this.strokePaint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
