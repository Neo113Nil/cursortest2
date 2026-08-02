package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.utils.TextPaintStyleParser;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR.\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/RangeFilterTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "suffix", "Ljava/lang/String;", "getSuffix", "()Ljava/lang/String;", "setSuffix", "(Ljava/lang/String;)V", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "", "xText", "F", "yText", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RangeFilterTextInputEditText extends TextInputEditText {
    private String suffix;

    @NotNull
    private final TextPaint textPaint;
    private float xText;
    private float yText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterTextInputEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextPaint textPaint = new TextPaint(1);
        TextPaintStyleParser.applyStyle$default(new TextPaintStyleParser(context), textPaint, R$style.TextStyle_Body_L, null, 4, null);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(getCurrentTextColor());
        this.textPaint = textPaint;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        String valueOf = String.valueOf(getText());
        this.xText = valueOf.length() > 0 ? this.textPaint.measureText(valueOf) + getCompoundPaddingStart() : getCompoundPaddingStart();
        float lineBounds = getLineBounds(0, null);
        this.yText = lineBounds;
        String str = this.suffix;
        if (str != null) {
            canvas.drawText(str, this.xText, lineBounds, this.textPaint);
        }
    }

    public final void setSuffix(String str) {
        this.suffix = str;
        invalidate();
    }
}
