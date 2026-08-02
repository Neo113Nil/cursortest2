package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.view;

import Ij.C3261b;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0003H\u0017J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/view/HotelsPageButtonV5BorderedBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "", "strokeColor", "borderWidth", "", "radius", "<init>", "(IIFF)V", "paint", "Landroid/graphics/Paint;", "strokePaint", "path", "Landroid/graphics/Path;", "strokePath", "strokeRect", "Landroid/graphics/RectF;", "halfBorderWidth", "radii", "", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "draw", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "preparePaths", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonV5BorderedBackgroundDrawable extends Drawable {
    private final int backgroundColor;
    private final float borderWidth;
    private final float halfBorderWidth;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final float[] radii;
    private final float radius;
    private final int strokeColor;

    @NotNull
    private final Paint strokePaint;

    @NotNull
    private final Path strokePath;

    @NotNull
    private final RectF strokeRect;

    public HotelsPageButtonV5BorderedBackgroundDrawable(int i11, int i12, float f7, float f11) {
        this.backgroundColor = i11;
        this.strokeColor = i12;
        this.borderWidth = f7;
        this.radius = f11;
        Paint b11 = C3261b.b(1, i11);
        b11.setStyle(Paint.Style.FILL);
        this.paint = b11;
        Paint b12 = C3261b.b(1, i12);
        b12.setStyle(Paint.Style.STROKE);
        b12.setStrokeWidth(f7);
        this.strokePaint = b12;
        this.path = new Path();
        this.strokePath = new Path();
        this.strokeRect = new RectF();
        this.halfBorderWidth = f7 * 0.5f;
        this.radii = new float[]{f11, f11, f11, f11, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private final void preparePaths(Rect bounds) {
        this.path.rewind();
        Path path = this.path;
        float f7 = bounds.left;
        float f11 = bounds.top;
        float f12 = bounds.right;
        float f13 = bounds.bottom;
        float[] fArr = this.radii;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(f7, f11, f12, f13, fArr, direction);
        RectF rectF = this.strokeRect;
        float f14 = bounds.left;
        float f15 = this.halfBorderWidth;
        rectF.set(f14 - f15, bounds.top + f15, bounds.right + f15, bounds.bottom + f15);
        this.strokePath.rewind();
        this.strokePath.addRoundRect(this.strokeRect, this.radii, direction);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.path, this.paint);
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
        this.paint.setAlpha(alpha);
        this.strokePaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        this.strokePaint.setColorFilter(colorFilter);
    }
}
