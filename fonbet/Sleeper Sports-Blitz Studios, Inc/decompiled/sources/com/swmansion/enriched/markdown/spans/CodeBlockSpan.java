package com.swmansion.enriched.markdown.spans;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineBackgroundSpan;
import android.text.style.MetricAffectingSpan;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.renderer.SpanStyleCache;
import com.swmansion.enriched.markdown.styles.CodeBlockStyle;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeBlockSpan.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016Jp\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.H\u0016J`\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0019H\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/CodeBlockSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/style/LineBackgroundSpan;", "Landroid/text/style/LeadingMarginSpan;", "codeBlockStyle", "Lcom/swmansion/enriched/markdown/styles/CodeBlockStyle;", "context", "Landroid/content/Context;", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "<init>", "(Lcom/swmansion/enriched/markdown/styles/CodeBlockStyle;Landroid/content/Context;Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;)V", "blockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "path", "Landroid/graphics/Path;", "rect", "Landroid/graphics/RectF;", "arcRect", "radiiArray", "", "configureBackgroundPaint", "Landroid/graphics/Paint;", "configureBorderPaint", "getLeadingMargin", "", "first", "", "drawLeadingMargin", "", "c", "Landroid/graphics/Canvas;", "p", "x", "dir", "top", "baseline", "bottom", "text", "", "start", "end", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "updateMeasureState", "tp", "Landroid/text/TextPaint;", "updateDrawState", "drawBackground", "canvas", "left", "right", "lineNum", "applyTextStyle", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CodeBlockSpan extends MetricAffectingSpan implements LineBackgroundSpan, LeadingMarginSpan {
    private static final Paint sharedBackgroundPaint;
    private static final Paint sharedBorderPaint;
    private final RectF arcRect;
    private final BlockStyle blockStyle;
    private final CodeBlockStyle codeBlockStyle;
    private final Context context;
    private final Path path;
    private final float[] radiiArray;
    private final RectF rect;
    private final SpanStyleCache styleCache;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
    }

    public CodeBlockSpan(CodeBlockStyle codeBlockStyle, Context context, SpanStyleCache styleCache) {
        Intrinsics.checkNotNullParameter(codeBlockStyle, "codeBlockStyle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleCache, "styleCache");
        this.codeBlockStyle = codeBlockStyle;
        this.context = context;
        this.styleCache = styleCache;
        this.blockStyle = new BlockStyle(codeBlockStyle.getFontSize(), codeBlockStyle.getFontFamily(), codeBlockStyle.getFontWeight(), codeBlockStyle.getColor());
        this.path = new Path();
        this.rect = new RectF();
        this.arcRect = new RectF();
        this.radiiArray = new float[8];
    }

    static {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        sharedBackgroundPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.BUTT);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        sharedBorderPaint = paint2;
    }

    private final Paint configureBackgroundPaint() {
        Paint paint = sharedBackgroundPaint;
        paint.setColor(this.codeBlockStyle.getBackgroundColor());
        return paint;
    }

    private final Paint configureBorderPaint() {
        Paint paint = sharedBorderPaint;
        paint.setStrokeWidth(this.codeBlockStyle.getBorderWidth());
        paint.setColor(this.codeBlockStyle.getBorderColor());
        return paint;
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        return (int) this.codeBlockStyle.getPadding();
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyTextStyle(tp);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyTextStyle(tp);
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint p, int left, int right, int top, int baseline, int bottom, CharSequence text, int start, int end, int lineNum) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(text, "text");
        if (!(text instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) text;
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        if (spanStart < 0 || spanStart >= spanEnd) {
            return;
        }
        boolean z = start == spanStart;
        boolean z2 = end == spanEnd || (spanEnd <= end && (spanEnd == text.length() || text.charAt(spanEnd - 1) == '\n'));
        float borderWidth = this.codeBlockStyle.getBorderWidth() / 2.0f;
        this.rect.set(left + borderWidth, top + (z ? borderWidth : 0.0f), right - borderWidth, bottom - (z2 ? borderWidth : 0.0f));
        float borderRadius = this.codeBlockStyle.getBorderRadius();
        if (borderRadius > borderWidth) {
            borderRadius -= borderWidth;
        }
        ArraysKt.fill$default(this.radiiArray, 0.0f, 0, 0, 6, (Object) null);
        if (z) {
            float[] fArr = this.radiiArray;
            fArr[0] = borderRadius;
            fArr[1] = borderRadius;
            fArr[2] = borderRadius;
            fArr[3] = borderRadius;
        }
        if (z2) {
            float[] fArr2 = this.radiiArray;
            fArr2[4] = borderRadius;
            fArr2[5] = borderRadius;
            fArr2[6] = borderRadius;
            fArr2[7] = borderRadius;
        }
        this.path.reset();
        this.path.addRoundRect(this.rect, this.radiiArray, Path.Direction.CW);
        Paint configureBackgroundPaint = configureBackgroundPaint();
        Paint configureBorderPaint = configureBorderPaint();
        int save = canvas.save();
        try {
            canvas.drawPath(this.path, configureBackgroundPaint);
            if (this.codeBlockStyle.getBorderWidth() > 0.0f) {
                float f = this.rect.left;
                float f2 = this.rect.right;
                float f3 = this.rect.top;
                float f4 = this.rect.bottom;
                try {
                    if (z && z2) {
                        canvas.drawPath(this.path, configureBorderPaint);
                    } else if (z) {
                        canvas.drawLine(f + borderRadius, f3, f2 - borderRadius, f3, configureBorderPaint);
                        float f5 = f3 + borderRadius;
                        canvas.drawLine(f, f5, f, f4, configureBorderPaint);
                        canvas.drawLine(f2, f5, f2, f4, configureBorderPaint);
                        float f6 = 2 * borderRadius;
                        float f7 = f3 + f6;
                        this.arcRect.set(f, f3, f + f6, f7);
                        canvas.drawArc(this.arcRect, 180.0f, 90.0f, false, configureBorderPaint);
                        this.arcRect.set(f2 - f6, f3, f2, f7);
                        canvas.drawArc(this.arcRect, 270.0f, 90.0f, false, configureBorderPaint);
                    } else if (z2) {
                        canvas.drawLine(f + borderRadius, f4, f2 - borderRadius, f4, configureBorderPaint);
                        float f8 = f4 - borderRadius;
                        canvas.drawLine(f, f3, f, f8, configureBorderPaint);
                        canvas.drawLine(f2, f3, f2, f8, configureBorderPaint);
                        float f9 = 2 * borderRadius;
                        float f10 = f4 - f9;
                        this.arcRect.set(f, f10, f + f9, f4);
                        canvas.drawArc(this.arcRect, 90.0f, 90.0f, false, configureBorderPaint);
                        this.arcRect.set(f2 - f9, f10, f2, f4);
                        canvas.drawArc(this.arcRect, 0.0f, 90.0f, false, configureBorderPaint);
                    } else {
                        canvas.drawLine(f, f3, f, f4, configureBorderPaint);
                        canvas.drawLine(f2, f3, f2, f4, configureBorderPaint);
                    }
                } catch (Throwable th) {
                    th = th;
                    canvas.restoreToCount(save);
                    throw th;
                }
            }
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void applyTextStyle(TextPaint tp) {
        tp.setTextSize(this.blockStyle.getFontSize());
        UtilsKt.applyBlockStyleFont(tp, this.blockStyle, this.context);
        int color = this.blockStyle.getColor();
        int[] colorsToPreserve = this.styleCache.getColorsToPreserve();
        UtilsKt.applyColorPreserving(tp, color, Arrays.copyOf(colorsToPreserve, colorsToPreserve.length));
    }
}
