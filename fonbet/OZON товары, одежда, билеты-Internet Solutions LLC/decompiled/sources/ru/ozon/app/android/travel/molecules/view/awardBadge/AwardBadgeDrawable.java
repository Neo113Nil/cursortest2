package ru.ozon.app.android.travel.molecules.view.awardBadge;

import Sc.InterfaceC3999a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u0016R*\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeDrawable;", "Landroid/graphics/drawable/Drawable;", "", "bottomCornerRadius", "apexRadius", "<init>", "(FF)V", "", "updatePath", "()V", "buildRoundedPolygonPath", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "bgColor", "I", "getBgColor", "setBgColor", "notchHeight", "F", "getNotchHeight", "()F", "setNotchHeight", "(F)V", "Landroid/graphics/Paint;", "fillPaint", "Landroid/graphics/Paint;", "", "Landroid/graphics/PointF;", "points", "[Landroid/graphics/PointF;", "", "radii", "[F", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AwardBadgeDrawable extends Drawable {
    private int bgColor = UniColors.GRAPHIC_PREMIUM_BLUE.getResId();

    @NotNull
    private final Paint fillPaint;
    private float notchHeight;

    @NotNull
    private final Path path;

    @NotNull
    private final PointF[] points;

    @NotNull
    private final float[] radii;

    public AwardBadgeDrawable(float f7, float f11) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.bgColor);
        this.fillPaint = paint;
        PointF[] pointFArr = new PointF[5];
        for (int i11 = 0; i11 < 5; i11++) {
            pointFArr[i11] = new PointF(0.0f, 0.0f);
        }
        this.points = pointFArr;
        this.radii = new float[]{0.0f, 0.0f, f7, f11, f7};
        this.path = new Path();
    }

    private final void buildRoundedPolygonPath() {
        this.path.reset();
        int length = this.points.length;
        if (length != this.radii.length) {
            return;
        }
        int i11 = 0;
        while (i11 < length) {
            PointF[] pointFArr = this.points;
            PointF pointF = pointFArr[i11];
            PointF pointF2 = pointFArr[((i11 - 1) + length) % length];
            int i12 = i11 + 1;
            PointF pointF3 = pointFArr[i12 % length];
            float f7 = pointF2.x - pointF.x;
            float f11 = pointF2.y - pointF.y;
            float hypot = (float) Math.hypot(f7, f11);
            float f12 = pointF3.x - pointF.x;
            float f13 = pointF3.y - pointF.y;
            float hypot2 = (float) Math.hypot(f12, f13);
            float min = Math.min(this.radii[i11], Math.min(hypot, hypot2) / 2.0f);
            float f14 = pointF.x;
            float f15 = ((f7 / hypot) * min) + f14;
            float f16 = pointF.y;
            float f17 = ((f11 / hypot) * min) + f16;
            float f18 = ((f12 / hypot2) * min) + f14;
            float f19 = ((f13 / hypot2) * min) + f16;
            if (i11 == 0) {
                this.path.moveTo(f15, f17);
            } else {
                this.path.lineTo(f15, f17);
            }
            this.path.quadTo(pointF.x, pointF.y, f18, f19);
            i11 = i12;
        }
        this.path.close();
    }

    private final void updatePath() {
        float width = getBounds().width();
        float height = getBounds().height();
        this.points[0].set(0.0f, 0.0f);
        this.points[1].set(width, 0.0f);
        this.points[2].set(width, height);
        this.points[3].set(width / 2.0f, height - this.notchHeight);
        this.points[4].set(0.0f, height);
        buildRoundedPolygonPath();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        canvas.drawPath(this.path, this.fillPaint);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC3999a
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        updatePath();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.fillPaint.setAlpha(alpha);
    }

    public final void setBgColor(int i11) {
        this.bgColor = i11;
        this.fillPaint.setColor(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.fillPaint.setColorFilter(colorFilter);
    }

    public final void setNotchHeight(float f7) {
        this.notchHeight = f7;
        updatePath();
        invalidateSelf();
    }
}
