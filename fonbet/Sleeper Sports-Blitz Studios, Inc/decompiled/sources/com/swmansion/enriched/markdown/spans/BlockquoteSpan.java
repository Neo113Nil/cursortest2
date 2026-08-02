package com.swmansion.enriched.markdown.spans;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.renderer.SpanStyleCache;
import com.swmansion.enriched.markdown.styles.BlockquoteStyle;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockquoteSpan.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH\u0016Jl\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00142\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\b\u0010/\u001a\u00020#H\u0002J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u0006H\u0002J\u001a\u00102\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010\u00142\u0006\u0010*\u001a\u00020\u0006H\u0002J*\u00103\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/BlockquoteSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/style/LeadingMarginSpan;", "blockquoteStyle", "Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle;", "depth", "", "context", "Landroid/content/Context;", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "<init>", "(Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle;ILandroid/content/Context;Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;)V", "getDepth", "()I", "levelSpacing", "", "blockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "cachedText", "", "cachedMaxDepthByPosition", "", "updateMeasureState", "", "tp", "Landroid/text/TextPaint;", "updateDrawState", "getLeadingMargin", "first", "", "drawLeadingMargin", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "x", "dir", "top", "baseline", "bottom", "text", "start", "end", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "applyTextStyle", "configureBorderPaint", "configureBackgroundPaint", "bgColor", "shouldSkipDrawing", "drawBackground", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlockquoteSpan extends MetricAffectingSpan implements LeadingMarginSpan {
    private static final int BOLD_ITALIC_MASK = 3;
    private static final Paint sharedBackgroundPaint;
    private static final Paint sharedBorderPaint;
    private final BlockStyle blockStyle;
    private final BlockquoteStyle blockquoteStyle;
    private Map<Integer, Integer> cachedMaxDepthByPosition;
    private CharSequence cachedText;
    private final Context context;
    private final int depth;
    private final float levelSpacing;
    private final SpanStyleCache styleCache;

    public final int getDepth() {
        return this.depth;
    }

    public BlockquoteSpan(BlockquoteStyle blockquoteStyle, int i, Context context, SpanStyleCache styleCache) {
        Intrinsics.checkNotNullParameter(blockquoteStyle, "blockquoteStyle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleCache, "styleCache");
        this.blockquoteStyle = blockquoteStyle;
        this.depth = i;
        this.context = context;
        this.styleCache = styleCache;
        this.levelSpacing = blockquoteStyle.getBorderWidth() + blockquoteStyle.getGapWidth();
        this.blockStyle = new BlockStyle(blockquoteStyle.getFontSize(), blockquoteStyle.getFontFamily(), blockquoteStyle.getFontWeight(), blockquoteStyle.getColor());
        this.cachedMaxDepthByPosition = new LinkedHashMap();
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

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        return (int) this.levelSpacing;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(p, "p");
        if (shouldSkipDrawing(text, start)) {
            return;
        }
        drawBackground(c, top, bottom, layout);
        Paint configureBorderPaint = configureBorderPaint();
        float f = top;
        float f2 = bottom;
        int i = 0;
        float lineLeft = layout != null ? layout.getLineLeft(0) : 0.0f;
        int i2 = this.depth;
        if (i2 < 0) {
            return;
        }
        while (true) {
            float f3 = dir;
            float f4 = (this.levelSpacing * i * f3) + lineLeft;
            float borderWidth = f4 + (this.blockquoteStyle.getBorderWidth() * f3);
            float f5 = f;
            Canvas canvas = c;
            canvas.drawRect(f4, f5, borderWidth, f2, configureBorderPaint);
            if (i == i2) {
                return;
            }
            i++;
            c = canvas;
            f = f5;
        }
    }

    private final void applyTextStyle(TextPaint tp) {
        tp.setTextSize(this.blockStyle.getFontSize());
        Typeface typeface = tp.getTypeface();
        int style = (typeface != null ? typeface.getStyle() : 0) & 3;
        UtilsKt.applyBlockStyleFont(tp, this.blockStyle, this.context);
        if (style != 0) {
            Typeface typeface2 = tp.getTypeface();
            if (typeface2 == null) {
                typeface2 = Typeface.DEFAULT;
            }
            tp.setTypeface(Typeface.create(typeface2, style));
        }
        int color = this.blockStyle.getColor();
        int[] colorsToPreserve = this.styleCache.getColorsToPreserve();
        UtilsKt.applyColorPreserving(tp, color, Arrays.copyOf(colorsToPreserve, colorsToPreserve.length));
    }

    static {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        sharedBorderPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        sharedBackgroundPaint = paint2;
    }

    private final Paint configureBorderPaint() {
        Paint paint = sharedBorderPaint;
        paint.setColor(this.blockquoteStyle.getBorderColor());
        return paint;
    }

    private final Paint configureBackgroundPaint(int bgColor) {
        Paint paint = sharedBackgroundPaint;
        paint.setColor(bgColor);
        return paint;
    }

    private final boolean shouldSkipDrawing(CharSequence text, int start) {
        Integer num;
        if (!(text instanceof Spanned)) {
            return false;
        }
        if (this.cachedText != text) {
            this.cachedText = text;
            this.cachedMaxDepthByPosition.clear();
        }
        Map<Integer, Integer> map = this.cachedMaxDepthByPosition;
        Integer valueOf = Integer.valueOf(start);
        Integer num2 = map.get(valueOf);
        if (num2 == null) {
            BlockquoteSpan[] blockquoteSpanArr = (BlockquoteSpan[]) ((Spanned) text).getSpans(start, start + 1, BlockquoteSpan.class);
            Intrinsics.checkNotNull(blockquoteSpanArr);
            if (blockquoteSpanArr.length == 0) {
                num = null;
            } else {
                Integer valueOf2 = Integer.valueOf(blockquoteSpanArr[0].depth);
                int lastIndex = ArraysKt.getLastIndex(blockquoteSpanArr);
                if (1 <= lastIndex) {
                    int i = 1;
                    while (true) {
                        Integer valueOf3 = Integer.valueOf(blockquoteSpanArr[i].depth);
                        if (valueOf2.compareTo(valueOf3) < 0) {
                            valueOf2 = valueOf3;
                        }
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    }
                }
                num = valueOf2;
            }
            Integer num3 = num;
            num2 = Integer.valueOf(num3 != null ? num3.intValue() : -1);
            map.put(valueOf, num2);
        }
        return num2.intValue() > this.depth;
    }

    private final void drawBackground(Canvas c, int top, int bottom, Layout layout) {
        Integer backgroundColor = this.blockquoteStyle.getBackgroundColor();
        if (backgroundColor != null) {
            if (backgroundColor.intValue() == 0) {
                backgroundColor = null;
            }
            if (backgroundColor != null) {
                c.drawRect(0.0f, top, layout != null ? layout.getWidth() : 0.0f, bottom, configureBackgroundPaint(backgroundColor.intValue()));
            }
        }
    }
}
