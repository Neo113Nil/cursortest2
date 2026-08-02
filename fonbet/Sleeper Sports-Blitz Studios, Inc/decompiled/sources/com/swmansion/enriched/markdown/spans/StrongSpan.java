package com.swmansion.enriched.markdown.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.renderer.SpanStyleCache;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrongSpan.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/StrongSpan;", "Landroid/text/style/MetricAffectingSpan;", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "blockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;Lcom/swmansion/enriched/markdown/renderer/BlockStyle;)V", "strongColor", "", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "updateMeasureState", "applyStrongStyle", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StrongSpan extends MetricAffectingSpan {
    private final BlockStyle blockStyle;
    private final int strongColor;
    private final SpanStyleCache styleCache;

    public StrongSpan(SpanStyleCache styleCache, BlockStyle blockStyle) {
        Intrinsics.checkNotNullParameter(styleCache, "styleCache");
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        this.styleCache = styleCache;
        this.blockStyle = blockStyle;
        this.strongColor = styleCache.getStrongColorFor(blockStyle.getColor());
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyStrongStyle(tp);
        int i = this.strongColor;
        int[] colorsToPreserve = this.styleCache.getColorsToPreserve();
        UtilsKt.applyColorPreserving(tp, i, Arrays.copyOf(colorsToPreserve, colorsToPreserve.length));
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyStrongStyle(tp);
    }

    private final void applyStrongStyle(TextPaint tp) {
        if (Math.abs(tp.getTextSize() - (this.blockStyle.getFontSize() * 0.85f)) > 0.1f) {
            tp.setTextSize(this.blockStyle.getFontSize());
        }
        Typeface typeface = tp.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        tp.setTypeface(Typeface.create(typeface, (typeface.getStyle() & 2) != 0 ? 3 : 1));
    }
}
