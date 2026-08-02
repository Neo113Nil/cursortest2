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

/* compiled from: EmphasisSpan.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/EmphasisSpan;", "Landroid/text/style/MetricAffectingSpan;", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "blockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;Lcom/swmansion/enriched/markdown/renderer/BlockStyle;)V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "updateMeasureState", "applyEmphasisStyle", "applyEmphasisColor", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmphasisSpan extends MetricAffectingSpan {
    private final BlockStyle blockStyle;
    private final SpanStyleCache styleCache;

    public EmphasisSpan(SpanStyleCache styleCache, BlockStyle blockStyle) {
        Intrinsics.checkNotNullParameter(styleCache, "styleCache");
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        this.styleCache = styleCache;
        this.blockStyle = blockStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyEmphasisStyle(tp);
        applyEmphasisColor(tp);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyEmphasisStyle(tp);
    }

    private final void applyEmphasisStyle(TextPaint tp) {
        Typeface typeface = tp.getTypeface();
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        tp.setTypeface(Typeface.create(typeface, (typeface.getStyle() & 1) != 0 ? 3 : 2));
    }

    private final void applyEmphasisColor(TextPaint tp) {
        int emphasisColorFor = this.styleCache.getEmphasisColorFor(this.blockStyle.getColor(), tp.getColor());
        int[] colorsToPreserve = this.styleCache.getColorsToPreserve();
        UtilsKt.applyColorPreserving(tp, emphasisColorFor, Arrays.copyOf(colorsToPreserve, colorsToPreserve.length));
    }
}
