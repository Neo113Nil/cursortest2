package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.progressView;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/progressView/MainDrawMajorScreenProgressViewPalette;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "shadowInnerBlurRadius", "", "getShadowInnerBlurRadius", "()F", "cornerRadius", "getCornerRadius", "defaultGradientColorStart", "", "defaultGradientColorEnd", "gradientProgress", "Landroid/graphics/drawable/GradientDrawable;", "getGradientProgress", "()Landroid/graphics/drawable/GradientDrawable;", "innerShadowPaint", "Landroid/graphics/Paint;", "getInnerShadowPaint", "()Landroid/graphics/Paint;", "outerShadowPaint", "getOuterShadowPaint", "progressShadowPaint", "getProgressShadowPaint", "bgPaint", "getBgPaint", "bgCorners", "", "getBgCorners", "()[F", "progressShadowCorners", "getProgressShadowCorners", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenProgressViewPalette {

    @NotNull
    private final float[] bgCorners;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final Context context;
    private final float cornerRadius;
    private final int defaultGradientColorEnd;
    private final int defaultGradientColorStart;

    @NotNull
    private final GradientDrawable gradientProgress;

    @NotNull
    private final Paint innerShadowPaint;

    @NotNull
    private final Paint outerShadowPaint;

    @NotNull
    private final float[] progressShadowCorners;

    @NotNull
    private final Paint progressShadowPaint;
    private final float shadowInnerBlurRadius;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float shadowOuterBlurRadius = ResourceExtKt.toPxF(1);
    private static final float paintWidth = ResourceExtKt.toPxF(2);
    private static final float progressShadowWidth = ResourceExtKt.toPxF(8);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/progressView/MainDrawMajorScreenProgressViewPalette$Companion;", "", "<init>", "()V", "", "PAINT_OUTER_SHADOW_WIDTH", "F", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MainDrawMajorScreenProgressViewPalette(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        float pxF = ResourceExtKt.toPxF(4);
        this.shadowInnerBlurRadius = pxF;
        float pxF2 = ResourceExtKt.toPxF(11);
        this.cornerRadius = pxF2;
        int color = context.getColor(R$color.prize_progress_gradient_start);
        this.defaultGradientColorStart = color;
        int color2 = context.getColor(R$color.prize_progress_gradient_end);
        this.defaultGradientColorEnd = color2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{color, color2});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        this.gradientProgress = gradientDrawable;
        Paint paint = new Paint(1);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(pxF, blur));
        paint.setColor(UtilKt.parseColor(R$color.prize_progress_view_bg_inner_shadow_color, context));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(paintWidth);
        this.innerShadowPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setMaskFilter(new BlurMaskFilter(shadowOuterBlurRadius, blur));
        paint2.setColor(UtilKt.parseColor(R$color.prize_progress_view_bg_outer_shadow_color, context));
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.0f);
        this.outerShadowPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setMaskFilter(new BlurMaskFilter(pxF, blur));
        paint3.setColor(UtilKt.parseColor(R$color.prize_progress_shadow, context));
        paint3.setStyle(style);
        paint3.setStrokeWidth(progressShadowWidth);
        this.progressShadowPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(UtilKt.parseColor(R$color.prize_progress_view_bg_main_color, context));
        this.bgPaint = paint4;
        this.bgCorners = new float[]{pxF2, pxF2, pxF2, pxF2, pxF2, pxF2, pxF2, pxF2};
        this.progressShadowCorners = new float[]{0.0f, 0.0f, pxF2, pxF2, pxF2, pxF2, 0.0f, 0.0f};
    }

    @NotNull
    public final float[] getBgCorners() {
        return this.bgCorners;
    }

    @NotNull
    public final Paint getBgPaint() {
        return this.bgPaint;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final GradientDrawable getGradientProgress() {
        return this.gradientProgress;
    }

    @NotNull
    public final Paint getInnerShadowPaint() {
        return this.innerShadowPaint;
    }

    @NotNull
    public final Paint getOuterShadowPaint() {
        return this.outerShadowPaint;
    }

    @NotNull
    public final float[] getProgressShadowCorners() {
        return this.progressShadowCorners;
    }

    @NotNull
    public final Paint getProgressShadowPaint() {
        return this.progressShadowPaint;
    }

    public final float getShadowInnerBlurRadius() {
        return this.shadowInnerBlurRadius;
    }
}
