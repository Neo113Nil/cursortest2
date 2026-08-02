package com.swmansion.enriched.markdown.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import com.swmansion.enriched.markdown.styles.CodeStyle;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeBackgroundSpan.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J`\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000fH\u0002J \u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J \u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J \u0010(\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/CodeBackgroundSpan;", "Landroid/text/style/LineBackgroundSpan;", "styleConfig", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/styles/StyleConfig;)V", "rect", "Landroid/graphics/RectF;", "path", "Landroid/graphics/Path;", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "left", "", "right", "top", "baseline", "bottom", "text", "", "start", "end", "lineNum", "getHorizontalOffset", "", "lineStart", "lineEnd", "index", "paint", "drawShapes", "isFirst", "", "isLast", "drawOpenBorders", "createRadii", "", "adjustBottomForMargin", "Landroid/text/Spanned;", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CodeBackgroundSpan implements LineBackgroundSpan {
    private static final float BORDER_WIDTH = 1.0f;
    private static final float CORNER_RADIUS = 6.0f;
    private static final Paint sharedBackgroundPaint;
    private static final Paint sharedBorderPaint;
    private final Path path;
    private final RectF rect;
    private final StyleConfig styleConfig;

    public CodeBackgroundSpan(StyleConfig styleConfig) {
        Intrinsics.checkNotNullParameter(styleConfig, "styleConfig");
        this.styleConfig = styleConfig;
        this.rect = new RectF();
        this.path = new Path();
    }

    static {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        sharedBackgroundPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        sharedBorderPaint = paint2;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint p, int left, int right, int top, int baseline, int bottom, CharSequence text, int start, int end, int lineNum) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(this);
            int spanEnd = spanned.getSpanEnd(this);
            if (spanStart < 0 || spanStart >= spanEnd) {
                return;
            }
            boolean z = spanStart >= start;
            boolean z2 = spanEnd <= end;
            int adjustBottomForMargin = adjustBottomForMargin(spanned, end, bottom);
            float horizontalOffset = z ? getHorizontalOffset(text, start, end, spanStart, p) + left : left;
            float horizontalOffset2 = z2 ? getHorizontalOffset(text, start, end, spanEnd, p) + left : right;
            this.rect.set(Math.min(horizontalOffset, horizontalOffset2), top, Math.max(horizontalOffset, horizontalOffset2), adjustBottomForMargin);
            CodeStyle codeStyle = this.styleConfig.getCodeStyle();
            sharedBackgroundPaint.setColor(codeStyle.getBackgroundColor());
            sharedBorderPaint.setColor(codeStyle.getBorderColor());
            drawShapes(canvas, z, z2);
        }
    }

    private final float getHorizontalOffset(CharSequence text, int lineStart, int lineEnd, int index, Paint paint) {
        if (index <= lineStart) {
            return 0.0f;
        }
        CharSequence subSequence = text.subSequence(lineStart, lineEnd);
        TextPaint textPaint = paint instanceof TextPaint ? (TextPaint) paint : null;
        if (textPaint == null) {
            textPaint = new TextPaint(paint);
        }
        StaticLayout build = StaticLayout.Builder.obtain(subSequence, 0, subSequence.length(), textPaint, 10000).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build.getPrimaryHorizontal(index - lineStart);
    }

    private final void drawShapes(Canvas canvas, boolean isFirst, boolean isLast) {
        float[] createRadii = createRadii(isFirst, isLast);
        this.path.reset();
        this.path.addRoundRect(this.rect, createRadii, Path.Direction.CW);
        canvas.drawPath(this.path, sharedBackgroundPaint);
        if (isFirst && isLast) {
            canvas.drawPath(this.path, sharedBorderPaint);
        } else {
            drawOpenBorders(canvas, isFirst, isLast);
        }
    }

    private final void drawOpenBorders(Canvas canvas, boolean isFirst, boolean isLast) {
        this.path.reset();
        if (isFirst) {
            this.path.moveTo(this.rect.right, this.rect.top);
            this.path.lineTo(this.rect.left + CORNER_RADIUS, this.rect.top);
            this.path.quadTo(this.rect.left, this.rect.top, this.rect.left, this.rect.top + CORNER_RADIUS);
            this.path.lineTo(this.rect.left, this.rect.bottom - CORNER_RADIUS);
            this.path.quadTo(this.rect.left, this.rect.bottom, this.rect.left + CORNER_RADIUS, this.rect.bottom);
            this.path.lineTo(this.rect.right, this.rect.bottom);
        } else if (isLast) {
            this.path.moveTo(this.rect.left, this.rect.top);
            this.path.lineTo(this.rect.right - CORNER_RADIUS, this.rect.top);
            this.path.quadTo(this.rect.right, this.rect.top, this.rect.right, this.rect.top + CORNER_RADIUS);
            this.path.lineTo(this.rect.right, this.rect.bottom - CORNER_RADIUS);
            this.path.quadTo(this.rect.right, this.rect.bottom, this.rect.right - CORNER_RADIUS, this.rect.bottom);
            this.path.lineTo(this.rect.left, this.rect.bottom);
        } else {
            this.path.moveTo(this.rect.left, this.rect.top);
            this.path.lineTo(this.rect.right, this.rect.top);
            this.path.moveTo(this.rect.left, this.rect.bottom);
            this.path.lineTo(this.rect.right, this.rect.bottom);
        }
        canvas.drawPath(this.path, sharedBorderPaint);
    }

    private final float[] createRadii(boolean isFirst, boolean isLast) {
        if (isFirst && isLast) {
            return new float[]{CORNER_RADIUS, CORNER_RADIUS, CORNER_RADIUS, CORNER_RADIUS, CORNER_RADIUS, CORNER_RADIUS, CORNER_RADIUS, CORNER_RADIUS};
        }
        if (isFirst) {
            return new float[]{CORNER_RADIUS, CORNER_RADIUS, 0.0f, 0.0f, 0.0f, 0.0f, CORNER_RADIUS, CORNER_RADIUS};
        }
        if (isLast) {
            return new float[]{0.0f, 0.0f, CORNER_RADIUS, CORNER_RADIUS, CORNER_RADIUS, CORNER_RADIUS, 0.0f, 0.0f};
        }
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private final int adjustBottomForMargin(Spanned text, int lineEnd, int bottom) {
        if (lineEnd > 0 && lineEnd <= text.length()) {
            int i = lineEnd - 1;
            if (text.charAt(i) == '\n') {
                Iterator it = ArrayIteratorKt.iterator((MarginBottomSpan[]) text.getSpans(i, lineEnd, MarginBottomSpan.class));
                while (it.hasNext()) {
                    MarginBottomSpan marginBottomSpan = (MarginBottomSpan) it.next();
                    if (text.getSpanEnd(marginBottomSpan) == lineEnd) {
                        bottom -= (int) marginBottomSpan.getMarginBottom();
                    }
                }
            }
        }
        return bottom;
    }
}
