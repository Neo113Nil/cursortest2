package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import K00.b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002J\f\u0010\u0010\u001a\u00020\u000e*\u00020\u000eH\u0002J\f\u0010\u0011\u001a\u00020\u000e*\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformation;", "", "transformationConfig", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformation$TransformationConfig;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformation$TransformationConfig;)V", "paint", "Landroid/graphics/Paint;", "clearPaint", "rectF", "Landroid/graphics/RectF;", "path", "Landroid/graphics/Path;", "invoke", "Landroid/graphics/Bitmap;", "source", "resize", "roundCorners", "TransformationConfig", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrandLogoTransformation {

    @NotNull
    private final Paint clearPaint;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final TransformationConfig transformationConfig;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformation$TransformationConfig;", "", "", "minWidth", "maxWidth", "maxHeight", "cornerRadius", "maskColor", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMinWidth", "getMaxWidth", "getMaxHeight", "getCornerRadius", "getMaskColor", "", "getCornerRadiusF", "()F", "cornerRadiusF", "getMaxHeightF", "maxHeightF", "", "getCornersRadiuses", "()[F", "cornersRadiuses", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TransformationConfig {
        private final int cornerRadius;
        private final int maskColor;
        private final int maxHeight;
        private final int maxWidth;
        private final int minWidth;

        public TransformationConfig(int i11, int i12, int i13, int i14, int i15) {
            this.minWidth = i11;
            this.maxWidth = i12;
            this.maxHeight = i13;
            this.cornerRadius = i14;
            this.maskColor = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransformationConfig)) {
                return false;
            }
            TransformationConfig transformationConfig = (TransformationConfig) other;
            return this.minWidth == transformationConfig.minWidth && this.maxWidth == transformationConfig.maxWidth && this.maxHeight == transformationConfig.maxHeight && this.cornerRadius == transformationConfig.cornerRadius && this.maskColor == transformationConfig.maskColor;
        }

        public final float getCornerRadiusF() {
            return this.cornerRadius;
        }

        @NotNull
        public final float[] getCornersRadiuses() {
            return new float[]{getCornerRadiusF(), getCornerRadiusF(), getCornerRadiusF(), getCornerRadiusF(), getCornerRadiusF(), getCornerRadiusF(), 0.0f, 0.0f};
        }

        public final int getMaskColor() {
            return this.maskColor;
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final float getMaxHeightF() {
            return this.maxHeight;
        }

        public final int getMaxWidth() {
            return this.maxWidth;
        }

        public final int getMinWidth() {
            return this.minWidth;
        }

        public int hashCode() {
            return Integer.hashCode(this.maskColor) + C2454a.a(this.cornerRadius, C2454a.a(this.maxHeight, C2454a.a(this.maxWidth, Integer.hashCode(this.minWidth) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.minWidth;
            int i12 = this.maxWidth;
            int i13 = this.maxHeight;
            int i14 = this.cornerRadius;
            int i15 = this.maskColor;
            StringBuilder a11 = C2438a.a("TransformationConfig(minWidth=", i11, ", maxWidth=", ", maxHeight=", i12);
            a.f(i13, i14, ", cornerRadius=", ", maskColor=", a11);
            return b.e(i15, ")", a11);
        }
    }

    public BrandLogoTransformation(@NotNull TransformationConfig transformationConfig) {
        Intrinsics.checkNotNullParameter(transformationConfig, "transformationConfig");
        this.transformationConfig = transformationConfig;
        Paint paint = new Paint(1);
        paint.setColor(transformationConfig.getMaskColor());
        this.paint = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.clearPaint = paint2;
        this.rectF = new RectF();
        this.path = new Path();
    }

    private final Bitmap resize(Bitmap bitmap) {
        float width = bitmap.getWidth() / bitmap.getHeight();
        Pair pair = bitmap.getWidth() > this.transformationConfig.getMaxWidth() ? new Pair(Integer.valueOf(this.transformationConfig.getMaxWidth()), Integer.valueOf((int) (this.transformationConfig.getMaxWidth() / width))) : bitmap.getWidth() < this.transformationConfig.getMinWidth() ? new Pair(Integer.valueOf(this.transformationConfig.getMinWidth()), Integer.valueOf((int) (this.transformationConfig.getMinWidth() / width))) : new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        if (intValue2 > this.transformationConfig.getMaxHeight()) {
            intValue2 = this.transformationConfig.getMaxHeight();
            intValue = (int) (intValue2 * width);
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, intValue, intValue2, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        return createScaledBitmap;
    }

    private final Bitmap roundCorners(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), this.transformationConfig.getMaxHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        this.rectF.set(0.0f, 0.0f, bitmap.getWidth(), this.transformationConfig.getMaxHeightF());
        this.path.reset();
        this.path.addRoundRect(this.rectF, this.transformationConfig.getCornersRadiuses(), Path.Direction.CCW);
        canvas.drawPath(this.path, this.paint);
        canvas.drawBitmap(bitmap, 0.0f, (this.transformationConfig.getMaxHeight() - bitmap.getHeight()) / 2.0f, this.clearPaint);
        return createBitmap;
    }

    @NotNull
    public final Bitmap invoke(@NotNull Bitmap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return roundCorners(resize(source));
    }
}
