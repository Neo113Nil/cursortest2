package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/RoundedProgressBarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "progressLineRadius", "progressBarHeight", "trackColor", "progressColor", "customize", "(FIII)V", "setColors", "Landroid/graphics/Paint;", "trackPaint", "Landroid/graphics/Paint;", "progressPaint", "Landroid/graphics/RectF;", "trackRect", "Landroid/graphics/RectF;", "progressRect", "barHeightPx", "I", "progressRadiusPx", "F", AppMeasurementSdk.ConditionalUserProperty.VALUE, "progress", "getProgress", "()I", "setProgress", "(I)V", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RoundedProgressBarView extends View {
    private int barHeightPx;
    private int progress;

    @NotNull
    private final Paint progressPaint;
    private float progressRadiusPx;

    @NotNull
    private final RectF progressRect;

    @NotNull
    private final Paint trackPaint;

    @NotNull
    private final RectF trackRect;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/RoundedProgressBarView$Companion;", "", "<init>", "()V", "MAX_PROGRESS", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ RoundedProgressBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void customize(float progressLineRadius, int progressBarHeight, int trackColor, int progressColor) {
        this.progressRadiusPx = Math.max(0.0f, progressLineRadius);
        this.barHeightPx = progressBarHeight;
        this.trackPaint.setColor(trackColor);
        this.progressPaint.setColor(progressColor);
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float width = getWidth() - getPaddingRight();
        float paddingTop = getPaddingTop();
        float f7 = width - paddingLeft;
        float height = (getHeight() - getPaddingBottom()) - paddingTop;
        if (f7 <= 0.0f || height <= 0.0f) {
            return;
        }
        float min = Math.min(this.barHeightPx, height);
        float f11 = 2;
        float f12 = ((height / f11) + paddingTop) - (min / f11);
        float f13 = min + f12;
        this.trackRect.set(paddingLeft, f12, width, f13);
        RectF rectF = this.trackRect;
        float f14 = this.progressRadiusPx;
        canvas.drawRoundRect(rectF, f14, f14, this.trackPaint);
        float d11 = h.d(this.progress / 100.0f, 0.0f, 1.0f);
        if (d11 == 0.0f) {
            return;
        }
        this.progressRect.set(paddingLeft, f12, (f7 * d11) + paddingLeft, f13);
        RectF rectF2 = this.progressRect;
        float f15 = this.progressRadiusPx;
        canvas.drawRoundRect(rectF2, f15, f15, this.progressPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), widthMeasureSpec), View.resolveSize(getPaddingBottom() + getPaddingTop() + this.barHeightPx, heightMeasureSpec));
    }

    public final void setColors(int trackColor, int progressColor) {
        boolean z11;
        boolean z12 = true;
        if (this.trackPaint.getColor() != trackColor) {
            this.trackPaint.setColor(trackColor);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.progressPaint.getColor() != progressColor) {
            this.progressPaint.setColor(progressColor);
        } else {
            z12 = z11;
        }
        if (z12) {
            invalidate();
        }
    }

    public final void setProgress(int i11) {
        int e11 = h.e(i11, 0, 100);
        if (this.progress == e11) {
            return;
        }
        this.progress = e11;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedProgressBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.trackPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.progressPaint = paint2;
        this.trackRect = new RectF();
        this.progressRect = new RectF();
    }
}
