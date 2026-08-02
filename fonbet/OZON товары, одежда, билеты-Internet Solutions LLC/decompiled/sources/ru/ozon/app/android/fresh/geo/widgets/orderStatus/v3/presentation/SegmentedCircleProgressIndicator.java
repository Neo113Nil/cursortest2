package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.geo.R$styleable;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/SegmentedCircleProgressIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressValue", "", "color", "backgroundColor", "rectF", "Landroid/graphics/RectF;", "backgroundPaint", "Landroid/graphics/Paint;", "foregroundPaint", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setProgress", "progress", "setRingProgressColor", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SegmentedCircleProgressIndicator extends View {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private int backgroundColor;

    @NotNull
    private final Paint backgroundPaint;
    private int color;

    @NotNull
    private final Paint foregroundPaint;
    private float progressValue;

    @NotNull
    private final RectF rectF;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/SegmentedCircleProgressIndicator$Companion;", "", "<init>", "()V", "DEFAULT_CIRCLE_WIDTH", "", "PROGRESS_SWEEP_ANGLE", "PROGRESS_ANGLE_STEP", "PROGRESS_START_ANGLE", "PROGRESS_SECTIONS", "", "CIRCLE_DEGREE", "START_SECTION_GAP", "SECTION_GAP_STEP", "START_GAP", "FILL_GAP", "FILL_PROGRESS_GAP", "DEFAULT_GAP", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedCircleProgressIndicator(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f7 = this.progressValue;
        float f11 = 360 * f7;
        float f12 = 0.0f;
        float f13 = f7 == 0.0f ? 0.0f : f7 < 1.0f ? 6.0f : 4.0f;
        if (f7 != 0.0f && f7 < 1.0f) {
            f12 = 10.0f;
        }
        float f14 = f12;
        float f15 = 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            canvas.drawArc(this.rectF, 2.0f + f15, 75.0f, false, this.backgroundPaint);
            f15 += 90.0f;
        }
        canvas.drawArc(this.rectF, f13 - 90.0f, f11 - f14, false, this.foregroundPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        if (defaultSize2 <= defaultSize) {
            defaultSize = defaultSize2;
        }
        setMeasuredDimension(defaultSize, defaultSize);
        float f7 = defaultSize - 8.0f;
        this.rectF.set(8.0f, 8.0f, f7, f7);
    }

    public final void setProgress(float progress) {
        this.progressValue = progress;
        invalidate();
    }

    public final void setRingProgressColor(int color) {
        this.color = color;
        this.foregroundPaint.setColor(color);
        invalidate();
    }

    public /* synthetic */ SegmentedCircleProgressIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedCircleProgressIndicator(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.color = -12303292;
        this.backgroundColor = a.getColor(context, R$color.graphic_neutral);
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        paint.setColor(this.backgroundColor);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(16.0f);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(paint2.getColor());
        paint2.setStyle(style);
        paint2.setStrokeWidth(16.0f);
        paint2.setStrokeCap(cap);
        this.foregroundPaint = paint2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CircleProgressBar, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.progressValue = obtainStyledAttributes.getFloat(R$styleable.CircleProgressBar_progress, this.progressValue);
            this.color = obtainStyledAttributes.getInt(R$styleable.CircleProgressBar_progressBarColor, this.color);
            this.backgroundColor = obtainStyledAttributes.getColor(R$styleable.CircleProgressBar_backgroundColor, this.backgroundColor);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
