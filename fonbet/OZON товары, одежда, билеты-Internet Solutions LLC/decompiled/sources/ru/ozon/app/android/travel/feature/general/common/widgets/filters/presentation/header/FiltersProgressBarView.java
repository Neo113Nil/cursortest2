package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header;

import Bi.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersProgressBarView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010\bJ\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\bR\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00100\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010,R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersProgressBarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "startAnimation", "()V", "cancelAnimation", "", "endColor", "calculateGradientStartColor", "(I)I", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "bind", "loaderWidth", "I", "loaderHeight", "", "loaderRadius", "F", "startXCanvas", "endXCanvas", "endYCanvas", "loaderTopY", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "trackPaint", "Landroid/graphics/Paint;", "loaderPaint", "", "shaderColors", "[I", "Landroid/graphics/LinearGradient;", "linearGradient", "Landroid/graphics/LinearGradient;", "Landroid/graphics/Matrix;", "gradientMatrix", "Landroid/graphics/Matrix;", "loaderHeadPosition", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "isAnimationRunning", "Z", "Landroidx/core/view/G;", "preDrawListener", "Landroidx/core/view/G;", "getLoaderTailPosition", "()F", "loaderTailPosition", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersProgressBarView extends View {
    private ValueAnimator animator;

    @NotNull
    private final Path clipPath;
    private float endXCanvas;
    private float endYCanvas;

    @NotNull
    private final Matrix gradientMatrix;
    private boolean isAnimationRunning;
    private LinearGradient linearGradient;
    private float loaderHeadPosition;
    private final int loaderHeight;

    @NotNull
    private final Paint loaderPaint;
    private final float loaderRadius;
    private float loaderTopY;
    private final int loaderWidth;
    private G preDrawListener;

    @NotNull
    private final int[] shaderColors;
    private float startXCanvas;

    @NotNull
    private final Paint trackPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersProgressBarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.loaderWidth = ResourceExtKt.toPx(132, context);
        int px = ResourceExtKt.toPx(4, context);
        this.loaderHeight = px;
        this.loaderRadius = px / 2.0f;
        this.clipPath = new Path();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.trackPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.loaderPaint = paint2;
        this.shaderColors = new int[2];
        this.gradientMatrix = new Matrix();
    }

    private final int calculateGradientStartColor(int endColor) {
        return Color.argb(0, Color.red(endColor), Color.green(endColor), Color.blue(endColor));
    }

    private final void cancelAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
    }

    private final float getLoaderTailPosition() {
        return this.loaderHeadPosition - this.loaderWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, getWidth() + this.loaderWidth).setDuration(1000L);
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.setRepeatMode(1);
            duration.setRepeatCount(-1);
            duration.setStartDelay(700L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: HO.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    FiltersProgressBarView.startAnimation$lambda$6$lambda$5(duration, this, valueAnimator2);
                }
            });
            duration.start();
            this.animator = duration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$6$lambda$5(ValueAnimator valueAnimator, FiltersProgressBarView filtersProgressBarView, ValueAnimator valueAnimator2) {
        float floatValue = ((Float) a.b(valueAnimator2, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (valueAnimator.isRunning()) {
            filtersProgressBarView.loaderHeadPosition = floatValue;
            if (filtersProgressBarView.linearGradient != null) {
                filtersProgressBarView.gradientMatrix.setTranslate(filtersProgressBarView.getLoaderTailPosition(), 0.0f);
                LinearGradient linearGradient = filtersProgressBarView.linearGradient;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(filtersProgressBarView.gradientMatrix);
                }
            }
            filtersProgressBarView.invalidate();
        }
    }

    public final void bind() {
        cancelAnimation();
        G g10 = this.preDrawListener;
        if (g10 != null) {
            g10.b();
        }
        this.isAnimationRunning = false;
        if (getVisibility() == 0) {
            this.loaderHeadPosition = 0.0f;
            this.linearGradient = null;
            this.loaderPaint.setShader(null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int themeColor = ThemeExtKt.themeColor(context, R$attr.textAction);
            this.shaderColors[0] = calculateGradientStartColor(themeColor);
            this.shaderColors[1] = themeColor;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.loaderWidth, 0.0f, this.shaderColors, (float[]) null, Shader.TileMode.CLAMP);
            this.linearGradient = linearGradient;
            this.loaderPaint.setShader(linearGradient);
            this.preDrawListener = G.a(this, new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersProgressBarView$bind$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.startAnimation();
                    this.isAnimationRunning = true;
                }
            });
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isAnimationRunning) {
            startAnimation();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        cancelAnimation();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.clipPath;
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            canvas.drawRect(this.startXCanvas, this.loaderTopY, getLoaderTailPosition(), this.endYCanvas, this.trackPaint);
            float loaderTailPosition = getLoaderTailPosition();
            float f7 = this.loaderTopY;
            float f11 = this.loaderHeadPosition;
            float f12 = this.endYCanvas;
            float f13 = this.loaderRadius;
            canvas.drawRoundRect(loaderTailPosition, f7, f11, f12, f13, f13, this.loaderPaint);
            canvas.drawRect(this.loaderHeadPosition, this.loaderTopY, this.endXCanvas, this.endYCanvas, this.trackPaint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.isAnimationRunning) {
            return;
        }
        bind();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(this.loaderWidth, widthMeasureSpec), View.resolveSize(this.loaderHeight, heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        this.startXCanvas = getPaddingStart();
        float paddingTop = getPaddingTop();
        this.endXCanvas = width - getPaddingEnd();
        float paddingBottom = height - getPaddingBottom();
        this.endYCanvas = paddingBottom;
        this.loaderTopY = paddingBottom - this.loaderHeight;
        Path path = this.clipPath;
        path.rewind();
        path.addRoundRect(this.startXCanvas, paddingTop, this.endXCanvas, paddingTop, 0.0f, 0.0f, Path.Direction.CW);
        path.moveTo(this.startXCanvas, paddingTop);
        float f7 = this.startXCanvas;
        float f11 = this.endYCanvas;
        path.quadTo(f7, f11, f7, f11);
        path.lineTo(this.endXCanvas, this.endYCanvas);
        float f12 = this.endXCanvas;
        path.quadTo(f12, this.endYCanvas, f12, paddingTop);
        path.close();
    }
}
