package com.swmansion.enriched.markdown.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThematicBreakSpan.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016JR\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J+\u0010\u001b\u001a\u00020\u0014*\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fH\u0082\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/swmansion/enriched/markdown/spans/ThematicBreakSpan;", "Landroid/text/style/ReplacementSpan;", "lineColor", "", ViewProps.LINE_HEIGHT, "", ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, "<init>", "(IFFF)V", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "top", "y", "bottom", "withStyle", "color", "width", "action", "Lkotlin/Function0;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThematicBreakSpan extends ReplacementSpan {
    private final int lineColor;
    private final float lineHeight;
    private final float marginBottom;
    private final float marginTop;

    public ThematicBreakSpan(int i, float f, float f2, float f3) {
        this.lineColor = i;
        this.lineHeight = f;
        this.marginTop = f2;
        this.marginBottom = f3;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        int i = (int) (this.marginTop + this.lineHeight + this.marginBottom);
        if (fm != null) {
            int i2 = -i;
            fm.ascent = i2;
            fm.top = i2;
            fm.descent = 0;
            fm.bottom = 0;
        }
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        int i = this.lineColor;
        float f = this.lineHeight;
        int color = paint.getColor();
        float strokeWidth = paint.getStrokeWidth();
        Paint.Style style = paint.getStyle();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = top + this.marginTop + (this.lineHeight / 2.0f);
        canvas.drawLine(0.0f, f2, canvas.getWidth(), f2, paint);
        paint.setColor(color);
        paint.setStrokeWidth(strokeWidth);
        paint.setStyle(style);
    }

    private final void withStyle(Paint paint, int i, float f, Function0<Unit> function0) {
        int color = paint.getColor();
        float strokeWidth = paint.getStrokeWidth();
        Paint.Style style = paint.getStyle();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        function0.invoke();
        paint.setColor(color);
        paint.setStrokeWidth(strokeWidth);
        paint.setStyle(style);
    }
}
