package ru.ozon.app.android.cart.ui.thermometer.presentation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/presentation/view/CircleProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "backgroundColor", "strokeWidth", "", "progressValue", "angle", "rectF", "Landroid/graphics/RectF;", "backgroundPaint", "Landroid/graphics/Paint;", "foregroundPaint", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setStrokeWidth", "setStrokeWidth$cart_prodGoogleAllVendorsRelease", "setProgress", "progress", "setProgress$cart_prodGoogleAllVendorsRelease", "setRingProgressColor", "setRingProgressColor$cart_prodGoogleAllVendorsRelease", "setRingBackgroundColor", "setRingBackgroundColor$cart_prodGoogleAllVendorsRelease", "calculateAngle", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CircleProgressView extends View {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private float angle;
    private int backgroundColor;

    @NotNull
    private final Paint backgroundPaint;
    private int color;

    @NotNull
    private final Paint foregroundPaint;
    private float progressValue;

    @NotNull
    private final RectF rectF;
    private float strokeWidth;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/presentation/view/CircleProgressView$Companion;", "", "<init>", "()V", "ANGLE_START", "", "ANGLE_MAX", "", "COLOR_DEFAULT", "PROGRESS_MAX", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CircleProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final float calculateAngle() {
        return (360 * this.progressValue) / 100;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawOval(this.rectF, this.backgroundPaint);
        canvas.drawArc(this.rectF, -90.0f, this.angle, false, this.foregroundPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + View.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        int paddingLeft = getPaddingLeft() + getPaddingRight() + View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        if (paddingLeft <= paddingBottom) {
            paddingBottom = paddingLeft;
        }
        setMeasuredDimension(paddingBottom, paddingBottom);
        float f7 = this.strokeWidth / 2;
        float f11 = paddingBottom - f7;
        this.rectF.set(getPaddingLeft() + f7, getPaddingTop() + f7, f11 - getPaddingRight(), f11 - getPaddingBottom());
    }

    public final void setProgress$cart_prodGoogleAllVendorsRelease(float progress) {
        this.progressValue = progress;
        this.angle = calculateAngle();
        invalidate();
    }

    public final void setRingBackgroundColor$cart_prodGoogleAllVendorsRelease(int color) {
        this.backgroundColor = color;
        this.backgroundPaint.setColor(color);
        invalidate();
    }

    public final void setRingProgressColor$cart_prodGoogleAllVendorsRelease(int color) {
        this.color = color;
        this.foregroundPaint.setColor(color);
        invalidate();
    }

    public final void setStrokeWidth$cart_prodGoogleAllVendorsRelease(float strokeWidth) {
        this.strokeWidth = strokeWidth;
        this.backgroundPaint.setStrokeWidth(strokeWidth);
        this.foregroundPaint.setStrokeWidth(strokeWidth);
        invalidate();
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.color = -12303292;
        this.backgroundColor = -12303292;
        this.strokeWidth = 4.0f;
        this.angle = calculateAngle();
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        paint.setColor(this.backgroundColor);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(paint.getStrokeWidth());
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(paint2.getColor());
        paint2.setStyle(style);
        paint2.setStrokeWidth(paint2.getStrokeWidth());
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.foregroundPaint = paint2;
    }
}
