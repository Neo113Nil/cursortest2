package ru.ozon.fintech.ui.shimmer;

import E30.g;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0017J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/fintech/ui/shimmer/ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "shimmerWidth", "", "interpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "viewBackgroundPaint", "Landroid/graphics/Paint;", "gradientBackgroundPaint", "viewBackgroundRect", "Landroid/graphics/Rect;", "gradientBackgroundRect", "timed", "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "onBoundsChange", "bounds", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmerDrawable extends Drawable {
    private static final int ANIMATION_DURATION = 1000;

    @NotNull
    private final Context context;
    private Paint gradientBackgroundPaint;
    private Rect gradientBackgroundRect;

    @NotNull
    private AccelerateDecelerateInterpolator interpolator;
    private float shimmerWidth;
    private long timed;

    @NotNull
    private final Paint viewBackgroundPaint;
    private Rect viewBackgroundRect;

    public ShimmerDrawable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.interpolator = new AccelerateDecelerateInterpolator();
        Paint paint = new Paint();
        paint.setColor(androidx.core.content.a.getColor(context, R.color.fintech_shimmer_back));
        paint.setStyle(Paint.Style.FILL);
        this.viewBackgroundPaint = paint;
        this.timed = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit draw$lambda$1(ShimmerDrawable shimmerDrawable, Canvas canvas, Paint gradientBackgroundPaint, Rect viewBackgroundRect, Rect gradientBackgroundRect) {
        Intrinsics.checkNotNullParameter(gradientBackgroundPaint, "gradientBackgroundPaint");
        Intrinsics.checkNotNullParameter(viewBackgroundRect, "viewBackgroundRect");
        Intrinsics.checkNotNullParameter(gradientBackgroundRect, "gradientBackgroundRect");
        long currentTimeMillis = System.currentTimeMillis() - shimmerDrawable.timed;
        if (currentTimeMillis > 1000) {
            shimmerDrawable.timed = System.currentTimeMillis();
        }
        float width = ((shimmerDrawable.shimmerWidth * 2) + viewBackgroundRect.width()) * shimmerDrawable.interpolator.getInterpolation(currentTimeMillis / 1000.0f);
        canvas.drawRect(viewBackgroundRect, shimmerDrawable.viewBackgroundPaint);
        canvas.translate(-shimmerDrawable.shimmerWidth, 0.0f);
        canvas.translate(width, 0.0f);
        canvas.drawRect(gradientBackgroundRect, gradientBackgroundPaint);
        shimmerDrawable.invalidateSelf();
        return Unit.f71690a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull final Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        g.b(new InterfaceC6511n() { // from class: ru.ozon.fintech.ui.shimmer.a
            @Override // fd.InterfaceC6511n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit draw$lambda$1;
                draw$lambda$1 = ShimmerDrawable.draw$lambda$1(ShimmerDrawable.this, canvas, (Paint) obj, (Rect) obj2, (Rect) obj3);
                return draw$lambda$1;
            }
        }, this.gradientBackgroundPaint, this.viewBackgroundRect, this.gradientBackgroundRect);
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
        this.viewBackgroundRect = bounds;
        this.shimmerWidth = bounds.width() * 0.7f;
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, this.shimmerWidth / 2.0f, 0.0f, androidx.core.content.a.getColor(this.context, R.color.transparent), androidx.core.content.a.getColor(this.context, R.color.fintech_shimmer_front), Shader.TileMode.MIRROR));
        paint.setStyle(Paint.Style.FILL);
        this.gradientBackgroundPaint = paint;
        this.gradientBackgroundRect = new Rect(bounds.left, bounds.top, (int) this.shimmerWidth, bounds.bottom);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.viewBackgroundPaint.setAlpha(alpha);
        Paint paint = this.gradientBackgroundPaint;
        if (paint != null) {
            paint.setAlpha(alpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.viewBackgroundPaint.setColorFilter(colorFilter);
        Paint paint = this.gradientBackgroundPaint;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
