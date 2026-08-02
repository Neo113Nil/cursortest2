package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.small;

import Ij.C3261b;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/small/SmallAllProductsBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "", "textBackgroundColor", "<init>", "(II)V", "backgroundPaint", "Landroid/graphics/Paint;", "textBackgroundPaint", "backgroundPath", "Landroid/graphics/Path;", "radius", "", "transparentCircleRadius", "textCircleRadius", "width", "height", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "draw", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "setTextWidth", "textWidth", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallAllProductsBackgroundDrawable extends Drawable {

    @NotNull
    private final Paint backgroundPaint;
    private float height;

    @NotNull
    private final Paint textBackgroundPaint;
    private float textCircleRadius;
    private float transparentCircleRadius;
    private float width;

    @NotNull
    private final Path backgroundPath = new Path();
    private final float radius = ResourceExtKt.toPx(12);

    public SmallAllProductsBackgroundDrawable(int i11, int i12) {
        this.backgroundPaint = C3261b.b(1, i11);
        this.textBackgroundPaint = C3261b.b(1, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.backgroundPath.reset();
        this.backgroundPath.moveTo(this.radius, 0.0f);
        this.backgroundPath.lineTo(this.width - this.radius, 0.0f);
        Path path = this.backgroundPath;
        float f7 = this.width;
        float f11 = this.radius;
        float f12 = 2;
        path.arcTo(f7 - (f11 * f12), 0.0f, f7, f11 * f12, 0.0f, -90.0f, false);
        this.backgroundPath.lineTo(this.width, this.radius);
        this.backgroundPath.lineTo(this.width, this.height - this.transparentCircleRadius);
        float f13 = this.width;
        float f14 = this.textCircleRadius;
        float f15 = f13 - f14;
        float f16 = this.height - f14;
        Path path2 = this.backgroundPath;
        float f17 = this.transparentCircleRadius;
        path2.arcTo(f15 - f17, f16 - f17, f15 + f17, f16 + f17, 0.0f, -270.0f, false);
        this.backgroundPath.lineTo(this.width - this.transparentCircleRadius, this.height);
        this.backgroundPath.lineTo(this.radius, this.height);
        Path path3 = this.backgroundPath;
        float f18 = this.height;
        float f19 = this.radius;
        path3.arcTo(0.0f, f18 - (f19 * f12), f19 * f12, f18, -270.0f, 90.0f, false);
        this.backgroundPath.lineTo(0.0f, this.height - this.radius);
        this.backgroundPath.lineTo(0.0f, this.radius);
        Path path4 = this.backgroundPath;
        float f21 = this.radius;
        path4.arcTo(0.0f, 0.0f, f21 * f12, f21 * f12, -180.0f, 90.0f, false);
        this.backgroundPath.close();
        canvas.drawPath(this.backgroundPath, this.backgroundPaint);
        float f22 = this.width;
        float f23 = this.textCircleRadius;
        canvas.drawCircle(f22 - f23, this.height - f23, f23, this.textBackgroundPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.width = bounds.width();
        this.height = bounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(alpha);
        this.textBackgroundPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.backgroundPaint.setColorFilter(colorFilter);
        this.textBackgroundPaint.setColorFilter(colorFilter);
    }

    public final void setTextWidth(int textWidth) {
        float f7 = textWidth / 2;
        this.textCircleRadius = f7;
        this.transparentCircleRadius = f7 + ResourceExtKt.toPx(2);
    }
}
