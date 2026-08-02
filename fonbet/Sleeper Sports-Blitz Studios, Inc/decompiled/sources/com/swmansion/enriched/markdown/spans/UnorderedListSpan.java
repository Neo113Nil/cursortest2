package com.swmansion.enriched.markdown.spans;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.braze.models.BrazeGeofence;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.renderer.SpanStyleCache;
import com.swmansion.enriched.markdown.styles.ListStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnorderedListSpan.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0014JR\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/UnorderedListSpan;", "Lcom/swmansion/enriched/markdown/spans/BaseListSpan;", "listStyle", "Lcom/swmansion/enriched/markdown/styles/ListStyle;", "depth", "", "context", "Landroid/content/Context;", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "<init>", "(Lcom/swmansion/enriched/markdown/styles/ListStyle;ILandroid/content/Context;Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;)V", BrazeGeofence.RADIUS_METERS, "", "configureBulletPaint", "Landroid/graphics/Paint;", "getMarkerWidth", "drawMarker", "", "c", "Landroid/graphics/Canvas;", "p", "x", "dir", "top", "baseline", "bottom", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "start", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnorderedListSpan extends BaseListSpan {
    private static final Paint sharedBulletPaint;
    private final ListStyle listStyle;
    private final float radius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnorderedListSpan(ListStyle listStyle, int i, Context context, SpanStyleCache styleCache) {
        super(i, context, styleCache, new BlockStyle(listStyle.getFontSize(), listStyle.getFontFamily(), listStyle.getFontWeight(), listStyle.getColor()), listStyle.getMarginLeft(), listStyle.getGapWidth());
        Intrinsics.checkNotNullParameter(listStyle, "listStyle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleCache, "styleCache");
        this.listStyle = listStyle;
        this.radius = listStyle.getBulletSize() / 2.0f;
    }

    static {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        sharedBulletPaint = paint;
    }

    private final Paint configureBulletPaint() {
        Paint paint = sharedBulletPaint;
        paint.setColor(this.listStyle.getBulletColor());
        return paint;
    }

    @Override // com.swmansion.enriched.markdown.spans.BaseListSpan
    /* renamed from: getMarkerWidth, reason: from getter */
    protected float getRadius() {
        return this.radius;
    }

    @Override // com.swmansion.enriched.markdown.spans.BaseListSpan
    protected void drawMarker(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, Layout layout, int start) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(p, "p");
        Paint configureBulletPaint = configureBulletPaint();
        float depth = ((getDepth() * getMarginLeft()) + this.radius) * dir;
        Paint.FontMetrics fontMetrics = p.getFontMetrics();
        c.drawCircle(depth, baseline + ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.radius, configureBulletPaint);
    }
}
