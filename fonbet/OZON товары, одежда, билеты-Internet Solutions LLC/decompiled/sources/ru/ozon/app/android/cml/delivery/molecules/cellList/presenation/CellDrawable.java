package ru.ozon.app.android.cml.delivery.molecules.cellList.presenation;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellDrawable;", "Landroid/graphics/drawable/Drawable;", "islandColor", "", "cellColor", "islandCorners", "", "cellCorners", "topPadding", "", "bottomPadding", "<init>", "(II[F[FFF)V", "cellPaint", "Landroid/graphics/Paint;", "islandPaint", "cellPath", "Landroid/graphics/Path;", "islandPath", "width", "height", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "drawIsland", "drawCellBackground", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellDrawable extends Drawable {
    private final float bottomPadding;

    @NotNull
    private final float[] cellCorners;

    @NotNull
    private final Paint cellPaint;

    @NotNull
    private final Path cellPath;
    private float height;

    @NotNull
    private final float[] islandCorners;

    @NotNull
    private final Paint islandPaint;

    @NotNull
    private final Path islandPath;
    private final float topPadding;
    private float width;

    public CellDrawable(int i11, int i12, @NotNull float[] islandCorners, @NotNull float[] cellCorners, float f7, float f11) {
        Intrinsics.checkNotNullParameter(islandCorners, "islandCorners");
        Intrinsics.checkNotNullParameter(cellCorners, "cellCorners");
        this.islandCorners = islandCorners;
        this.cellCorners = cellCorners;
        this.topPadding = f7;
        this.bottomPadding = f11;
        Paint paint = new Paint();
        paint.setColor(i12);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.cellPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(i11);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.islandPaint = paint2;
        this.cellPath = new Path();
        this.islandPath = new Path();
    }

    private final void drawCellBackground(Canvas canvas) {
        this.cellPath.addRoundRect(0.0f, this.topPadding, this.width, this.height - this.bottomPadding, this.cellCorners, Path.Direction.CW);
        canvas.drawPath(this.cellPath, this.cellPaint);
    }

    private final void drawIsland(Canvas canvas) {
        this.islandPath.addRoundRect(0.0f, 0.0f, this.width, this.height, this.islandCorners, Path.Direction.CW);
        canvas.drawPath(this.islandPath, this.islandPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.islandPath.reset();
        this.cellPath.reset();
        this.width = getBounds().width();
        this.height = getBounds().height();
        drawIsland(canvas);
        drawCellBackground(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.cellPaint.setAlpha(alpha);
        this.islandPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.cellPaint.setColorFilter(colorFilter);
        this.islandPaint.setColorFilter(colorFilter);
    }
}
