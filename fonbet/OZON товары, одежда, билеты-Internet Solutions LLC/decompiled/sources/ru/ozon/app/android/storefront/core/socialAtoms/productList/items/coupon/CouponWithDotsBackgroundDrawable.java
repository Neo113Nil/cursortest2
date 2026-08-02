package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon;

import Ij.C3261b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.gradient.OzGradient;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0005H\u0016J\u0012\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponWithDotsBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "outerColor", "", "gradient", "Lru/ozon/uni/android/uikit/common/gradient/OzGradient;", "<init>", "(Landroid/content/Context;ILru/ozon/uni/android/uikit/common/gradient/OzGradient;)V", "freeVerticalSpace", "", "distanceBetweenHoles", "holeX", "innerPaint", "Landroid/graphics/Paint;", "innerPath", "Landroid/graphics/Path;", "outerPaint", "outerBounds", "Landroid/graphics/RectF;", "innerBackgroundPadding", "innerColors", "", "horizontalHoleRadius", "verticalHoleRadius", "verticalHoleDiameter", "verticalHoleEndPadding", "segmentsBetweenHolesCount", "outerRadius", "innerRadius", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "draw", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "drawInnerBackgroundWithHoles", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CouponWithDotsBackgroundDrawable extends Drawable {
    private float distanceBetweenHoles;
    private float freeVerticalSpace;

    @NotNull
    private final OzGradient gradient;
    private float holeX;
    private final float horizontalHoleRadius;
    private final int innerBackgroundPadding;
    private final int[] innerColors;

    @NotNull
    private final Paint innerPaint;

    @NotNull
    private final Path innerPath;
    private final float innerRadius;

    @NotNull
    private final RectF outerBounds;

    @NotNull
    private final Paint outerPaint;
    private final float outerRadius;
    private final int segmentsBetweenHolesCount;
    private final float verticalHoleDiameter;
    private final int verticalHoleEndPadding;
    private final float verticalHoleRadius;

    public CouponWithDotsBackgroundDrawable(@NotNull Context context, int i11, @NotNull OzGradient gradient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.gradient = gradient;
        this.innerPaint = new Paint(1);
        this.innerPath = new Path();
        this.outerPaint = C3261b.b(1, i11);
        this.outerBounds = new RectF();
        this.innerBackgroundPadding = ResourceExtKt.toPx(4);
        this.innerColors = gradient.getColors(context);
        this.horizontalHoleRadius = ResourceExtKt.toPx(5);
        float px = ResourceExtKt.toPx(3);
        this.verticalHoleRadius = px;
        this.verticalHoleDiameter = 2 * px;
        this.verticalHoleEndPadding = ResourceExtKt.toPx(12);
        this.segmentsBetweenHolesCount = 5;
        this.outerRadius = ResourceExtKt.toPx(12);
        this.innerRadius = ResourceExtKt.toPx(8);
    }

    private final void drawInnerBackgroundWithHoles(Canvas canvas) {
        this.innerPath.reset();
        float height = getBounds().height();
        float f7 = height - (r2 * 2);
        float f11 = this.innerBackgroundPadding;
        float width = getBounds().width();
        int i11 = this.innerBackgroundPadding;
        float f12 = width - i11;
        float f13 = i11;
        float f14 = f7 + i11;
        Path path = this.innerPath;
        float f15 = this.innerRadius;
        path.addRoundRect(f11, f13, f12, f14, f15, f15, Path.Direction.CW);
        Path path2 = this.innerPath;
        float f16 = this.horizontalHoleRadius;
        float f17 = 2;
        float f18 = f7 / f17;
        path2.addArc(f11 - f16, f18, f11 + f16, (f16 * f17) + f18, 90.0f, -180.0f);
        Path path3 = this.innerPath;
        float f19 = this.horizontalHoleRadius;
        path3.addArc(f12 - f19, f18, f12 + f19, (f19 * f17) + f18, 270.0f, -180.0f);
        Path path4 = this.innerPath;
        float f21 = this.holeX;
        float f22 = this.verticalHoleRadius;
        path4.addArc(f21 - f22, f13 - f22, f21 + f22, f13 + f22, 180.0f, -180.0f);
        Path path5 = this.innerPath;
        float f23 = this.holeX;
        float f24 = this.verticalHoleRadius;
        path5.addArc(f23 - f24, f14 - f24, f23 + f24, f14 + f24, 0.0f, -180.0f);
        int i12 = 0;
        while (i12 < 4) {
            i12++;
            this.innerPath.addCircle(this.holeX, ((this.distanceBetweenHoles + this.verticalHoleDiameter) * i12) + f13, this.verticalHoleRadius, Path.Direction.CCW);
        }
        canvas.drawPath(this.innerPath, this.innerPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.outerBounds;
        float f7 = this.outerRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.outerPaint);
        drawInnerBackgroundWithHoles(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.outerBounds.set(bounds);
        int height = bounds.height() - (this.innerBackgroundPadding * 2);
        int width = bounds.width() - (this.innerBackgroundPadding * 2);
        float f7 = (height - (2 * this.verticalHoleRadius)) - (4 * this.verticalHoleDiameter);
        this.freeVerticalSpace = f7;
        this.distanceBetweenHoles = f7 / this.segmentsBetweenHolesCount;
        this.holeX = ((bounds.width() - this.innerBackgroundPadding) - this.verticalHoleEndPadding) - this.verticalHoleRadius;
        if (this.innerColors != null) {
            float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(this.gradient.getOrientation(), new Rect(0, 0, width, height));
            this.innerPaint.setShader(new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], this.innerColors, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.innerPaint.setAlpha(alpha);
        this.outerPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.innerPaint.setColorFilter(colorFilter);
        this.outerPaint.setColorFilter(colorFilter);
    }
}
