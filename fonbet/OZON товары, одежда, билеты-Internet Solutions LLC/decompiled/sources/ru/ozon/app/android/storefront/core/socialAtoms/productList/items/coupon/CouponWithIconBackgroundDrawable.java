package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.coupon;

import Ij.C3261b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import androidx.core.graphics.drawable.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.gradient.OzGradient;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001cH\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0005H\u0016J\u0012\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\f\u0010*\u001a\u00020\u0015*\u00020\u0015H\u0002J\f\u0010+\u001a\u00020\u0015*\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/coupon/CouponWithIconBackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "outerColor", "", "gradient", "Lru/ozon/uni/android/uikit/common/gradient/OzGradient;", "<init>", "(Landroid/content/Context;ILru/ozon/uni/android/uikit/common/gradient/OzGradient;)V", "outerRadius", "", "innerPaint", "Landroid/graphics/Paint;", "innerRadius", "innerPadding", "innerColors", "", "outerPaint", "imageSize", "iconBitmap", "Landroid/graphics/Bitmap;", "bitmapPaint", "bitmapDstRect", "Landroid/graphics/RectF;", "width", "height", "bufferCanvas", "Landroid/graphics/Canvas;", "bufferBitmap", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "draw", "canvas", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "setGradient", "rotateIcon", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CouponWithIconBackgroundDrawable extends Drawable {

    @NotNull
    private final RectF bitmapDstRect;

    @NotNull
    private final Paint bitmapPaint;
    private Bitmap bufferBitmap;
    private Canvas bufferCanvas;

    @NotNull
    private final OzGradient gradient;
    private float height;
    private final Bitmap iconBitmap;
    private final int imageSize;
    private final int[] innerColors;
    private final float innerPadding;

    @NotNull
    private final Paint innerPaint;
    private final float innerRadius;

    @NotNull
    private final Paint outerPaint;
    private final float outerRadius;
    private float width;

    public CouponWithIconBackgroundDrawable(@NotNull Context context, int i11, @NotNull OzGradient gradient) {
        Bitmap a11;
        Bitmap rotateIcon;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.gradient = gradient;
        this.outerRadius = ResourceExtKt.toPx(12);
        this.innerPaint = new Paint(1);
        this.innerRadius = ResourceExtKt.toPx(8);
        float px = ResourceExtKt.toPx(4);
        this.innerPadding = px;
        this.innerColors = gradient.getColors(context);
        Paint b11 = C3261b.b(1, i11);
        b11.setStyle(Paint.Style.STROKE);
        b11.setStrokeWidth(px);
        this.outerPaint = b11;
        int px2 = ResourceExtKt.toPx(40);
        this.imageSize = px2;
        Drawable drawable = a.getDrawable(context, R$drawable.ic_s_gift_filled);
        this.iconBitmap = (drawable == null || (a11 = b.a(drawable, px2, px2, Bitmap.Config.ARGB_8888)) == null || (rotateIcon = rotateIcon(a11)) == null) ? null : setGradient(rotateIcon);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.bitmapPaint = paint;
        this.bitmapDstRect = new RectF();
    }

    private final Bitmap rotateIcon(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(-12.0f);
        Unit unit = Unit.f71690a;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    private final Bitmap setGradient(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, bitmap.getHeight(), -1, 0, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setAlpha(127);
        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
        return bitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Canvas canvas3 = this.bufferCanvas;
        if (canvas3 != null) {
            float f7 = this.innerPadding;
            float f11 = this.width - f7;
            float f12 = this.height - f7;
            float f13 = this.innerRadius;
            canvas3.drawRoundRect(f7, f7, f11, f12, f13, f13, this.innerPaint);
        }
        Bitmap bitmap = this.iconBitmap;
        if (bitmap != null && (canvas2 = this.bufferCanvas) != null) {
            RectF rectF = this.bitmapDstRect;
            canvas2.drawBitmap(bitmap, rectF.left, rectF.top, this.bitmapPaint);
        }
        Canvas canvas4 = this.bufferCanvas;
        if (canvas4 != null) {
            float f14 = this.innerPadding;
            float f15 = 2;
            float f16 = this.width - (f14 / f15);
            float f17 = this.height - (f14 / f15);
            float f18 = this.outerRadius;
            canvas4.drawRoundRect(f14 / f15, f14 / f15, f16, f17, f18, f18, this.outerPaint);
        }
        Bitmap bitmap2 = this.bufferBitmap;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.width = bounds.width();
        float height = bounds.height();
        this.height = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) this.width, (int) height, Bitmap.Config.ARGB_8888);
        this.bufferBitmap = createBitmap;
        if (createBitmap != null) {
            this.bufferCanvas = new Canvas(createBitmap);
        }
        if (this.iconBitmap != null) {
            this.bitmapDstRect.set(this.width - (r0.getWidth() * 0.82f), this.height - (this.iconBitmap.getHeight() * 0.78f), this.width, this.height);
        }
        if (this.innerColors != null) {
            int i11 = ((int) this.innerPadding) * 2;
            float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(this.gradient.getOrientation(), new Rect(0, 0, bounds.width() - i11, bounds.height() - i11));
            this.innerPaint.setShader(new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], this.innerColors, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.innerPaint.setAlpha(alpha);
        this.outerPaint.setAlpha(alpha);
        this.bitmapPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.innerPaint.setColorFilter(colorFilter);
        this.outerPaint.setColorFilter(colorFilter);
        this.bitmapPaint.setColorFilter(colorFilter);
    }
}
