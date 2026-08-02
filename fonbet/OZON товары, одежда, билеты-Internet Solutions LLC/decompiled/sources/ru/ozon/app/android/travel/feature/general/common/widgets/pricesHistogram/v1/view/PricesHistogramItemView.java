package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010%\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R*\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010 R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/view/PricesHistogramItemView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "width", "height", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "bgColor", "I", "getBgColor", "()I", "setBgColor", "(I)V", "textColor", "getTextColor", "setTextColor", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "", "xText", "F", "yText", "radius", "baselinePositionCorrection", "", "corners", "[F", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramItemView extends View {
    private final int baselinePositionCorrection;
    private int bgColor;

    @NotNull
    private final Paint bgPaint;

    @NotNull
    private final float[] corners;

    @NotNull
    private final Path path;
    private final float radius;

    @NotNull
    private String text;
    private int textColor;

    @NotNull
    private final TextPaint textPaint;
    private float xText;
    private float yText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PricesHistogramItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.bgPaint);
        if (this.text.length() > 0) {
            canvas.drawText(this.text, this.xText, this.yText, this.textPaint);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.text.length() > 0) {
            float f7 = 2;
            this.xText = (getWidth() / 2) - (this.textPaint.measureText(this.text) / f7);
            this.yText = (getHeight() - ((this.textPaint.ascent() + this.textPaint.descent()) / f7)) - this.baselinePositionCorrection;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        float strokeWidth = this.bgPaint.getStrokeWidth() / 2;
        float paddingTop = getPaddingTop() + strokeWidth;
        Path path = this.path;
        path.rewind();
        path.addRoundRect(getPaddingLeft() + strokeWidth, paddingTop, (width - getPaddingRight()) - strokeWidth, (height - getPaddingBottom()) - strokeWidth, this.corners, Path.Direction.CW);
    }

    public final void setBgColor(int i11) {
        this.bgColor = i11;
        this.bgPaint.setColor(i11);
        invalidate();
    }

    public final void setText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.text = value;
        invalidate();
    }

    public final void setTextColor(int i11) {
        this.textColor = i11;
        this.textPaint.setColor(i11);
        invalidate();
    }

    public /* synthetic */ PricesHistogramItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PricesHistogramItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        this.textColor = ThemeExtKt.themeColor(context, R$attr.textOriginalpriceAvailable);
        this.text = "";
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        float pxF = ResourceExtKt.toPxF(3, context);
        this.radius = pxF;
        this.baselinePositionCorrection = ResourceExtKt.toPx(8, context);
        this.corners = new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f};
        this.path = new Path();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(this.bgColor);
        paint.setStrokeWidth(ResourceExtKt.toPxF(2, context));
        textPaint.setTypeface(g.e(R$font.onest_regular, context));
        textPaint.setTextSize(ResourceExtKt.toSpF(14));
        textPaint.setColor(this.textColor);
    }
}
