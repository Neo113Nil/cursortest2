package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$styleable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/utils/CircleProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "strokeWidth", "", "progressValue", "progressMin", "progressMax", "startAngle", "color", "backgroundColor", "rectF", "Landroid/graphics/RectF;", "backgroundPaint", "Landroid/graphics/Paint;", "foregroundPaint", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setStrokeWidth", "setProgress", "progress", "setRingProgressColor", "setRingBackgroundColor", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CircleProgressView extends View {
    private int backgroundColor;

    @NotNull
    private final Paint backgroundPaint;
    private int color;

    @NotNull
    private final Paint foregroundPaint;
    private int progressMax;
    private int progressMin;
    private float progressValue;

    @NotNull
    private final RectF rectF;
    private float startAngle;
    private float strokeWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawOval(this.rectF, this.backgroundPaint);
        canvas.drawArc(this.rectF, this.startAngle, (360 * this.progressValue) / this.progressMax, false, this.foregroundPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        if (defaultSize2 <= defaultSize) {
            defaultSize = defaultSize2;
        }
        setMeasuredDimension(defaultSize, defaultSize);
        float f7 = this.strokeWidth / 2;
        float f11 = defaultSize - f7;
        this.rectF.set(f7, f7, f11, f11);
    }

    public final void setProgress(float progress) {
        this.progressValue = progress;
        invalidate();
    }

    public final void setRingBackgroundColor(int color) {
        this.backgroundColor = color;
        this.backgroundPaint.setColor(color);
        invalidate();
        requestLayout();
    }

    public final void setRingProgressColor(int color) {
        this.color = color;
        this.foregroundPaint.setColor(color);
        invalidate();
        requestLayout();
    }

    public final void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
        this.backgroundPaint.setStrokeWidth(strokeWidth);
        this.foregroundPaint.setStrokeWidth(strokeWidth);
        invalidate();
        requestLayout();
    }

    public /* synthetic */ CircleProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.strokeWidth = 4.0f;
        this.progressMax = 100;
        this.startAngle = -90.0f;
        this.color = -12303292;
        this.backgroundColor = -12303292;
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.foregroundPaint = paint2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CircleProgressBar, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.strokeWidth = obtainStyledAttributes.getDimension(R$styleable.CircleProgressBar_progressBarThickness, this.strokeWidth);
            this.progressValue = obtainStyledAttributes.getFloat(R$styleable.CircleProgressBar_progress, this.progressValue);
            this.progressMin = obtainStyledAttributes.getInt(R$styleable.CircleProgressBar_min, this.progressMin);
            this.progressMax = obtainStyledAttributes.getInt(R$styleable.CircleProgressBar_max, this.progressMax);
            this.color = obtainStyledAttributes.getInt(R$styleable.CircleProgressBar_progressBarColor, this.color);
            this.backgroundColor = obtainStyledAttributes.getColor(R$styleable.CircleProgressBar_backgroundColor, this.backgroundColor);
            obtainStyledAttributes.recycle();
            paint2.setColor(paint2.getColor());
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setStrokeWidth(paint2.getStrokeWidth());
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(this.backgroundColor);
            paint.setStyle(style);
            paint.setStrokeWidth(paint.getStrokeWidth());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
