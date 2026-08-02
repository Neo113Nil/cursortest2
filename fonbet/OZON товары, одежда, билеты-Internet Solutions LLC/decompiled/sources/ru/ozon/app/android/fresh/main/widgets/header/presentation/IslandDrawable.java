package ru.ozon.app.android.fresh.main.widgets.header.presentation;

import Sc.InterfaceC3999a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0017J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/header/presentation/IslandDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "", "islandColor", "islandCorners", "", "leftPadding", "", "topPadding", "rightPadding", "bottomPadding", "<init>", "(II[FFFFF)V", "bgPaint", "Landroid/graphics/Paint;", "islandPaint", "islandPath", "Landroid/graphics/Path;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "drawIsland", "drawBackground", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IslandDrawable extends Drawable {

    @NotNull
    private final Paint bgPaint;
    private final float bottomPadding;

    @NotNull
    private final float[] islandCorners;

    @NotNull
    private final Paint islandPaint;

    @NotNull
    private final Path islandPath;
    private final float leftPadding;
    private final float rightPadding;
    private final float topPadding;

    public IslandDrawable(int i11, int i12, @NotNull float[] islandCorners, float f7, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(islandCorners, "islandCorners");
        this.islandCorners = islandCorners;
        this.leftPadding = f7;
        this.topPadding = f11;
        this.rightPadding = f12;
        this.bottomPadding = f13;
        Paint paint = new Paint();
        paint.setColor(i11);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.bgPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(i12);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.islandPaint = paint2;
        this.islandPath = new Path();
    }

    private final void drawBackground(Canvas canvas) {
        canvas.drawRect(getBounds(), this.bgPaint);
    }

    private final void drawIsland(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        rectF.left += this.leftPadding;
        rectF.top += this.topPadding;
        rectF.right -= this.rightPadding;
        rectF.bottom -= this.bottomPadding;
        Path path = this.islandPath;
        path.reset();
        path.addRoundRect(rectF, this.islandCorners, Path.Direction.CW);
        canvas.drawPath(this.islandPath, this.islandPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawBackground(canvas);
        drawIsland(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC3999a
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.bgPaint.setAlpha(alpha);
        this.islandPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.bgPaint.setColorFilter(colorFilter);
        this.islandPaint.setColorFilter(colorFilter);
    }
}
