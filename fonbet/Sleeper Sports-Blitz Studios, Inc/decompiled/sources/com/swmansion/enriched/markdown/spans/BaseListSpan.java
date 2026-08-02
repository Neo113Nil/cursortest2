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
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.renderer.SpanStyleCache;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;

/* compiled from: BaseListSpan.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\r\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010 \u001a\u00020\fH$J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001fH\u0016J\b\u0010(\u001a\u00020\fH\u0004Jl\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001f2\b\u00106\u001a\u0004\u0018\u000107H\u0016JR\u00108\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00104\u001a\u00020\u0004H$J\u0010\u00109\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0003J\"\u0010:\u001a\u00020\u001f2\b\u00103\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004H\u0002J\u001a\u0010;\u001a\u00020\u001f2\b\u00103\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u00020\u0004H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/swmansion/enriched/markdown/spans/BaseListSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/style/LeadingMarginSpan;", "depth", "", "context", "Landroid/content/Context;", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "blockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", ViewProps.MARGIN_LEFT, "", "gapWidth", "<init>", "(ILandroid/content/Context;Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;Lcom/swmansion/enriched/markdown/renderer/BlockStyle;FF)V", "getDepth", "()I", "getContext", "()Landroid/content/Context;", "getStyleCache", "()Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "getBlockStyle", "()Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "getMarginLeft", "()F", "getGapWidth", "cachedText", "", "cachedHasDeeperSpanByPosition", "", "", "getMarkerWidth", "updateMeasureState", "", "tp", "Landroid/text/TextPaint;", "updateDrawState", "getLeadingMargin", "first", "getEffectiveGapWidth", "drawLeadingMargin", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "x", "dir", "top", "baseline", "bottom", "text", "start", "end", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "drawMarker", "applyTextStyle", "hasContent", "shouldSkipDrawing", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseListSpan extends MetricAffectingSpan implements LeadingMarginSpan {
    private static final int BOLD_ITALIC_MASK = 3;
    private static final float DEFAULT_MIN_GAP = 4.0f;
    private final BlockStyle blockStyle;
    private Map<Integer, Boolean> cachedHasDeeperSpanByPosition;
    private CharSequence cachedText;
    private final Context context;
    private final int depth;
    private final float gapWidth;
    private final float marginLeft;
    private final SpanStyleCache styleCache;

    protected abstract void drawMarker(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, Layout layout, int start);

    protected abstract float getMarkerWidth();

    public final int getDepth() {
        return this.depth;
    }

    protected final Context getContext() {
        return this.context;
    }

    protected final SpanStyleCache getStyleCache() {
        return this.styleCache;
    }

    protected final BlockStyle getBlockStyle() {
        return this.blockStyle;
    }

    protected final float getMarginLeft() {
        return this.marginLeft;
    }

    protected final float getGapWidth() {
        return this.gapWidth;
    }

    public BaseListSpan(int i, Context context, SpanStyleCache styleCache, BlockStyle blockStyle, float f, float f2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleCache, "styleCache");
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        this.depth = i;
        this.context = context;
        this.styleCache = styleCache;
        this.blockStyle = blockStyle;
        this.marginLeft = f;
        this.gapWidth = f2;
        this.cachedHasDeeperSpanByPosition = new LinkedHashMap();
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
        if (this.depth == 0) {
            return (int) (getMarkerWidth() + RangesKt.coerceAtLeast(this.gapWidth, 4.0f));
        }
        return (int) this.marginLeft;
    }

    protected final float getEffectiveGapWidth() {
        return RangesKt.coerceAtLeast(this.gapWidth, 4.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(p, "p");
        if (first && !shouldSkipDrawing(text, start) && hasContent(text, start, end)) {
            Paint.Style style = p.getStyle();
            int color = p.getColor();
            drawMarker(c, p, x, dir, top, baseline, bottom, layout, start);
            p.setStyle(style);
            p.setColor(color);
        }
    }

    private final void applyTextStyle(TextPaint tp) {
        Typeface typeface;
        tp.setTextSize(this.blockStyle.getFontSize());
        Typeface typeface2 = tp.getTypeface();
        int style = (typeface2 != null ? typeface2.getStyle() : 0) & 3;
        UtilsKt.applyBlockStyleFont(tp, this.blockStyle, this.context);
        if (style != 0 && (typeface = tp.getTypeface()) != null) {
            tp.setTypeface(Typeface.create(typeface, style));
        }
        int color = this.blockStyle.getColor();
        int[] colorsToPreserve = this.styleCache.getColorsToPreserve();
        UtilsKt.applyColorPreserving(tp, color, Arrays.copyOf(colorsToPreserve, colorsToPreserve.length));
    }

    private final boolean hasContent(CharSequence text, int start, int end) {
        if (text != null && end > start) {
            Iterable until = RangesKt.until(start, end);
            if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
                return false;
            }
            Iterator it = until.iterator();
            while (it.hasNext()) {
                if (!CharsKt.isWhitespace(text.charAt(((IntIterator) it).nextInt()))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean shouldSkipDrawing(CharSequence text, int start) {
        boolean z = false;
        if (!(text instanceof Spanned)) {
            return false;
        }
        if (this.cachedText != text) {
            this.cachedText = text;
            this.cachedHasDeeperSpanByPosition.clear();
        }
        Map<Integer, Boolean> map = this.cachedHasDeeperSpanByPosition;
        Integer valueOf = Integer.valueOf(start);
        Boolean bool = map.get(valueOf);
        if (bool == null) {
            BaseListSpan[] baseListSpanArr = (BaseListSpan[]) ((Spanned) text).getSpans(start, start + 1, BaseListSpan.class);
            Intrinsics.checkNotNull(baseListSpanArr);
            int length = baseListSpanArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (baseListSpanArr[i].depth > this.depth) {
                    z = true;
                    break;
                }
                i++;
            }
            bool = Boolean.valueOf(z);
            map.put(valueOf, bool);
        }
        return bool.booleanValue();
    }
}
