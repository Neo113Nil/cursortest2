package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view;

import UN.a;
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
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\bJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010)\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u0016\u0010*\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010$R\u0016\u0010+\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010$R\u0016\u0010,\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010$R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u0016\u0010?\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010$R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersProgressBarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "startAnimation", "()V", "cancelAnimation", "", "endColor", "calculateGradientStartColor", "(I)I", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;)V", "", "viewRadius", "F", "loaderWidth", "I", "loaderHeight", "loaderRadius", "startXCanvas", "endXCanvas", "endYCanvas", "loaderTopY", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "backgroundColor", "Landroid/graphics/Paint;", "trackPaint", "Landroid/graphics/Paint;", "loaderPaint", "", "shaderColors", "[I", "Landroid/graphics/LinearGradient;", "linearGradient", "Landroid/graphics/LinearGradient;", "Landroid/graphics/Matrix;", "gradientMatrix", "Landroid/graphics/Matrix;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;", "loaderHeadPosition", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "", "isAnimationRunning", "Z", "Landroidx/core/view/G;", "preDrawListener", "Landroidx/core/view/G;", "getLoaderTailPosition", "()F", "loaderTailPosition", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersProgressBarView extends View {
    private ValueAnimator animator;
    private int backgroundColor;

    @NotNull
    private final Path clipPath;
    private float endXCanvas;
    private float endYCanvas;

    @NotNull
    private final Matrix gradientMatrix;
    private boolean isAnimationRunning;
    private QuickFiltersVO.Loader item;
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
    private final float viewRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickFiltersProgressBarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewRadius = ResourceExtKt.toPxF(16, context);
        this.loaderWidth = ResourceExtKt.toPx(132, context);
        int px = ResourceExtKt.toPx(4, context);
        this.loaderHeight = px;
        this.loaderRadius = px / 2.0f;
        this.clipPath = new Path();
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
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
        int i11 = 0;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, getWidth() + this.loaderWidth).setDuration(1000L);
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.setRepeatMode(1);
            duration.setRepeatCount(-1);
            duration.setStartDelay(700L);
            duration.addUpdateListener(new a(i11, duration, this));
            duration.start();
            this.animator = duration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$6$lambda$5(ValueAnimator valueAnimator, QuickFiltersProgressBarView quickFiltersProgressBarView, ValueAnimator valueAnimator2) {
        float floatValue = ((Float) Bi.a.b(valueAnimator2, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (valueAnimator.isRunning()) {
            quickFiltersProgressBarView.loaderHeadPosition = floatValue;
            if (quickFiltersProgressBarView.linearGradient != null) {
                quickFiltersProgressBarView.gradientMatrix.setTranslate(quickFiltersProgressBarView.getLoaderTailPosition(), 0.0f);
                LinearGradient linearGradient = quickFiltersProgressBarView.linearGradient;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(quickFiltersProgressBarView.gradientMatrix);
                }
            }
            quickFiltersProgressBarView.invalidate();
        }
    }

    public final void bind(@NotNull QuickFiltersVO.Loader item) {
        Intrinsics.checkNotNullParameter(item, "item");
        cancelAnimation();
        this.item = item;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.backgroundColor = styleParser.parseColor(context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
        G g10 = this.preDrawListener;
        if (g10 != null) {
            g10.b();
        }
        this.isAnimationRunning = false;
        if (item.getIsProgressBarShown()) {
            this.loaderHeadPosition = 0.0f;
            this.linearGradient = null;
            this.loaderPaint.setShader(null);
            if (item.getSolidColor() != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context2, item.getSolidColor());
                if (parseColor != null) {
                    this.loaderPaint.setColor(parseColor.intValue());
                }
            } else if (item.getGradientAccentColor() != null) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Integer parseColor2 = styleParser.parseColor(context3, item.getGradientAccentColor());
                if (parseColor2 != null) {
                    this.shaderColors[0] = calculateGradientStartColor(parseColor2.intValue());
                    this.shaderColors[1] = parseColor2.intValue();
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.loaderWidth, 0.0f, this.shaderColors, (float[]) null, Shader.TileMode.CLAMP);
                    this.linearGradient = linearGradient;
                    this.loaderPaint.setShader(linearGradient);
                }
            }
            this.preDrawListener = G.a(this, new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view.QuickFiltersProgressBarView$bind$$inlined$doOnPreDraw$1
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
            canvas.drawColor(this.backgroundColor);
            QuickFiltersVO.Loader loader = this.item;
            if (loader != null && loader.getIsProgressBarShown()) {
                canvas.drawRect(this.startXCanvas, this.loaderTopY, getLoaderTailPosition(), this.endYCanvas, this.trackPaint);
                float loaderTailPosition = getLoaderTailPosition();
                float f7 = this.loaderTopY;
                float f11 = this.loaderHeadPosition;
                float f12 = this.endYCanvas;
                float f13 = this.loaderRadius;
                canvas.drawRoundRect(loaderTailPosition, f7, f11, f12, f13, f13, this.loaderPaint);
                canvas.drawRect(this.loaderHeadPosition, this.loaderTopY, this.endXCanvas, this.endYCanvas, this.trackPaint);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(this.loaderWidth, widthMeasureSpec), View.resolveSize(C6915b.c(this.viewRadius), heightMeasureSpec));
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
        path.quadTo(f7, f11, this.viewRadius + f7, f11);
        path.lineTo(this.endXCanvas - this.viewRadius, this.endYCanvas);
        float f12 = this.endXCanvas;
        path.quadTo(f12, this.endYCanvas, f12, paddingTop);
        path.close();
    }
}
