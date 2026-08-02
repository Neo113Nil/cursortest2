package com.swmansion.enriched.markdown.spans;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.renderer.SpanStyleCache;
import com.swmansion.enriched.markdown.styles.ListStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderedListSpan.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0014JR\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0005H\u0014J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/OrderedListSpan;", "Lcom/swmansion/enriched/markdown/spans/BaseListSpan;", "listStyle", "Lcom/swmansion/enriched/markdown/styles/ListStyle;", "depth", "", "context", "Landroid/content/Context;", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "<init>", "(Lcom/swmansion/enriched/markdown/styles/ListStyle;ILandroid/content/Context;Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;)V", "markerTypeface", "Landroid/graphics/Typeface;", "configureMarkerPaint", "Landroid/text/TextPaint;", "getMarkerWidth", "", "value", "itemNumber", "getItemNumber", "()I", "drawMarker", "", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "x", "dir", "top", "baseline", "bottom", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "start", "setItemNumber", "number", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderedListSpan extends BaseListSpan {
    private static final TextPaint sharedMarkerPaint;
    private int itemNumber;
    private final ListStyle listStyle;
    private final Typeface markerTypeface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderedListSpan(ListStyle listStyle, int i, Context context, SpanStyleCache styleCache) {
        super(i, context, styleCache, new BlockStyle(listStyle.getFontSize(), listStyle.getFontFamily(), listStyle.getFontWeight(), listStyle.getColor()), listStyle.getMarginLeft(), listStyle.getGapWidth());
        Intrinsics.checkNotNullParameter(listStyle, "listStyle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleCache, "styleCache");
        this.listStyle = listStyle;
        String fontFamily = this.listStyle.getFontFamily();
        fontFamily = fontFamily.length() <= 0 ? null : fontFamily;
        int parseFontWeight = ReactTypefaceUtils.parseFontWeight(this.listStyle.getMarkerFontWeight());
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        this.markerTypeface = ReactTypefaceUtils.applyStyles(null, -1, parseFontWeight, fontFamily, assets);
        this.itemNumber = 1;
    }

    static {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        sharedMarkerPaint = textPaint;
    }

    private final TextPaint configureMarkerPaint() {
        TextPaint textPaint = sharedMarkerPaint;
        textPaint.setTextSize(this.listStyle.getFontSize());
        textPaint.setColor(this.listStyle.getMarkerColor());
        textPaint.setTypeface(this.markerTypeface);
        return textPaint;
    }

    @Override // com.swmansion.enriched.markdown.spans.BaseListSpan
    /* renamed from: getMarkerWidth */
    protected float getRadius() {
        return configureMarkerPaint().measureText("99.");
    }

    public final int getItemNumber() {
        return this.itemNumber;
    }

    @Override // com.swmansion.enriched.markdown.spans.BaseListSpan
    protected void drawMarker(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, Layout layout, int start) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(p, "p");
        TextPaint configureMarkerPaint = configureMarkerPaint();
        String str = this.itemNumber + ".";
        float f = dir;
        c.drawText(str, (((getDepth() * getMarginLeft()) + getRadius()) * f) - (configureMarkerPaint.measureText(str) * f), baseline, configureMarkerPaint);
    }

    public final void setItemNumber(int number) {
        this.itemNumber = number;
    }
}
