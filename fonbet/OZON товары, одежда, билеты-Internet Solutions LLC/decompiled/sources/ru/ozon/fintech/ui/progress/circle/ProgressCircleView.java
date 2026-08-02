package ru.ozon.fintech.ui.progress.circle;

import C.D;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0019\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/fintech/ui/progress/circle/ProgressCircleView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "START_ANGLE_DELTA", "progressStrokeWidth", "rectCoordinatesDelta", "", "percentColor", "", "percentBackgroundColor", "transparentColor", "circleViewRect", "Landroid/graphics/RectF;", "percentage", "backgroundCirclePaint", "Landroid/graphics/Paint;", "progressPaint", "startProgressPaint", "updateProgressCircleData", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressCircleView extends View {
    private static final float END_ANGLE = 360.0f;
    private static final float START_ANGLE = -90.0f;
    private static final float START_ANGLES_PAINT_PERCENT_DELIMITER = 10.0f;
    private final int START_ANGLE_DELTA;

    @NotNull
    private final Paint backgroundCirclePaint;

    @NotNull
    private RectF circleViewRect;
    private String percentBackgroundColor;
    private String percentColor;
    private int percentage;

    @NotNull
    private final Paint progressPaint;
    private int progressStrokeWidth;
    private float rectCoordinatesDelta;

    @NotNull
    private final Paint startProgressPaint;
    private final int transparentColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressCircleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.circleViewRect.set((this.rectCoordinatesDelta / 2.0f) + getPaddingLeft(), (this.rectCoordinatesDelta / 2.0f) + getPaddingTop(), (getWidth() - (this.rectCoordinatesDelta / 2.0f)) + getPaddingRight(), (getHeight() - (this.rectCoordinatesDelta / 2.0f)) + getPaddingBottom());
        canvas.drawArc(this.circleViewRect, START_ANGLE, END_ANGLE, false, this.backgroundCirclePaint);
        RectF rectF = this.circleViewRect;
        float f7 = (this.percentage / 100) * END_ANGLE;
        canvas.drawArc(rectF, START_ANGLE, f7 / 10.0f, false, this.startProgressPaint);
        canvas.drawArc(this.circleViewRect, this.START_ANGLE_DELTA + START_ANGLE, f7, false, this.progressPaint);
    }

    public final void updateProgressCircleData(String percentColor, String percentBackgroundColor, int percentage, Integer progressStrokeWidth) {
        if (Intrinsics.d(percentColor, this.percentColor) && Intrinsics.d(percentBackgroundColor, this.percentBackgroundColor) && percentage == this.percentage) {
            int i11 = this.progressStrokeWidth;
            if (progressStrokeWidth != null && progressStrokeWidth.intValue() == i11) {
                return;
            }
        }
        if (percentColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int parseColor = styleParser.parseColor(context, percentColor, R.color.oz_text_action);
            this.progressPaint.setColor(parseColor);
            this.startProgressPaint.setColor(parseColor);
        } else {
            this.progressPaint.setColor(this.transparentColor);
            this.startProgressPaint.setColor(this.transparentColor);
        }
        if (percentBackgroundColor != null) {
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.backgroundCirclePaint.setColor(styleParser2.parseColor(context2, percentBackgroundColor, R.color.oz_text_action));
        } else {
            this.backgroundCirclePaint.setColor(this.transparentColor);
        }
        float d11 = D.d(progressStrokeWidth != null ? progressStrokeWidth.intValue() : 2);
        this.progressPaint.setStrokeWidth(d11);
        this.startProgressPaint.setStrokeWidth(d11);
        this.backgroundCirclePaint.setStrokeWidth(d11);
        this.rectCoordinatesDelta = d11;
        this.percentColor = percentColor;
        this.percentBackgroundColor = percentBackgroundColor;
        this.percentage = percentage;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressCircleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ProgressCircleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressCircleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.START_ANGLE_DELTA = 4;
        this.progressStrokeWidth = 2;
        this.rectCoordinatesDelta = 2;
        int color = a.getColor(context, R.color.transparent);
        this.transparentColor = color;
        this.circleViewRect = new RectF();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(color);
        paint.setStrokeWidth(D.d(this.progressStrokeWidth));
        this.backgroundCirclePaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(color);
        paint2.setStrokeWidth(D.d(this.progressStrokeWidth));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.progressPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(color);
        paint3.setStrokeWidth(D.d(this.progressStrokeWidth));
        this.startProgressPaint = paint3;
    }
}
