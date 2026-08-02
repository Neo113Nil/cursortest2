package ru.ozon.fintech.ui.progress.horizontal;

import C.D;
import E30.i;
import H30.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0014J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressStrokeWidth", "progressHeight", "", "cornersRadius", "DEFAULT_START_COORDINATE", "PERCENT_DELIMETER", "horizontalBackgroundColor", "horizontalProgressColor", "horizontalPercentageViewRect", "Landroid/graphics/RectF;", "horizontalBackViewRect", "percentage", "currentPercentage", "currentPaddings", "Landroid/graphics/Rect;", "backgroundHorizontalPaint", "Landroid/graphics/Paint;", "progressPaint", "bindState", "", "state", "Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressState;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HorizontalProgressView extends View {
    private final float DEFAULT_START_COORDINATE;
    private int PERCENT_DELIMETER;

    @NotNull
    private final Paint backgroundHorizontalPaint;
    private float cornersRadius;

    @NotNull
    private Rect currentPaddings;
    private float currentPercentage;

    @NotNull
    private RectF horizontalBackViewRect;
    private int horizontalBackgroundColor;

    @NotNull
    private RectF horizontalPercentageViewRect;
    private int horizontalProgressColor;
    private int percentage;
    private float progressHeight;

    @NotNull
    private final Paint progressPaint;
    private int progressStrokeWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull HorizontalProgressState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, state.getPercentLineColor(), R.color.oz_text_action);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor2 = styleParser.parseColor(context2, state.getPercentBackgroundColor(), R.color.oz_parandja);
        this.percentage = state.getPercentage();
        float percentage = state.getPercentage() / this.PERCENT_DELIMETER;
        if (this.horizontalProgressColor == parseColor && this.currentPercentage == percentage && this.horizontalBackgroundColor == parseColor2 && Intrinsics.d(this.currentPaddings, state.getPaddings())) {
            int i11 = this.progressStrokeWidth;
            Integer progressStrokeWidth = state.getProgressStrokeWidth();
            if (progressStrokeWidth != null && i11 == progressStrokeWidth.intValue()) {
                return;
            }
        }
        this.horizontalProgressColor = parseColor;
        this.horizontalBackgroundColor = parseColor2;
        this.progressPaint.setColor(parseColor);
        this.backgroundHorizontalPaint.setColor(this.horizontalBackgroundColor);
        this.currentPercentage = percentage;
        this.currentPaddings = state.getPaddings();
        Integer progressStrokeWidth2 = state.getProgressStrokeWidth();
        this.progressStrokeWidth = progressStrokeWidth2 != null ? progressStrokeWidth2.intValue() : 4;
        this.progressHeight = D.d(r6);
        this.cornersRadius = D.c(this.progressStrokeWidth / 2.0f);
        z.a(this, this.currentPaddings);
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        this.horizontalPercentageViewRect.set(this.DEFAULT_START_COORDINATE + getPaddingLeft(), this.DEFAULT_START_COORDINATE + getPaddingTop(), (this.currentPercentage * width) - getPaddingRight(), this.progressHeight + getPaddingBottom());
        this.horizontalBackViewRect.set(this.DEFAULT_START_COORDINATE + getPaddingLeft(), this.DEFAULT_START_COORDINATE + getPaddingTop(), width - getPaddingRight(), this.progressHeight + getPaddingBottom());
        RectF rectF = this.horizontalBackViewRect;
        float f7 = this.cornersRadius;
        canvas.drawRoundRect(rectF, f7, f7, this.backgroundHorizontalPaint);
        RectF rectF2 = this.horizontalPercentageViewRect;
        float f11 = this.cornersRadius;
        canvas.drawRoundRect(rectF2, f11, f11, this.progressPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + ((int) this.progressHeight), 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HorizontalProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.progressStrokeWidth = 4;
        this.progressHeight = D.d(4);
        this.cornersRadius = D.d(2);
        this.PERCENT_DELIMETER = 100;
        this.horizontalBackgroundColor = a.getColor(context, R.color.oz_parandja);
        this.horizontalProgressColor = a.getColor(context, R.color.oz_text_positive);
        this.horizontalPercentageViewRect = new RectF();
        this.horizontalBackViewRect = new RectF();
        this.currentPaddings = i.a();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(this.horizontalBackgroundColor);
        this.backgroundHorizontalPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(this.horizontalProgressColor);
        this.progressPaint = paint2;
    }
}
