package com.swmansion.enriched.markdown.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.swmansion.enriched.markdown.styles.HeadingStyle;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeadingSpan.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/HeadingSpan;", "Landroid/text/style/MetricAffectingSpan;", "level", "", "styleConfig", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "<init>", "(ILcom/swmansion/enriched/markdown/styles/StyleConfig;)V", "getLevel", "()I", "fontSize", "", "color", "cachedTypeface", "Landroid/graphics/Typeface;", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "updateMeasureState", "applyHeadingStyle", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HeadingSpan extends MetricAffectingSpan {
    private static final int BOLD_ITALIC_MASK = 3;
    private final Typeface cachedTypeface;
    private final int color;
    private final float fontSize;
    private final int level;

    public final int getLevel() {
        return this.level;
    }

    public HeadingSpan(int i, StyleConfig styleConfig) {
        Intrinsics.checkNotNullParameter(styleConfig, "styleConfig");
        this.level = i;
        HeadingStyle headingStyle = styleConfig.getHeadingStyles()[i];
        Intrinsics.checkNotNull(headingStyle);
        this.fontSize = headingStyle.getFontSize();
        HeadingStyle headingStyle2 = styleConfig.getHeadingStyles()[i];
        Intrinsics.checkNotNull(headingStyle2);
        this.color = headingStyle2.getColor();
        this.cachedTypeface = styleConfig.getHeadingTypefaces()[i];
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyHeadingStyle(tp);
        tp.setColor(this.color);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyHeadingStyle(tp);
    }

    private final void applyHeadingStyle(TextPaint tp) {
        tp.setTextSize(this.fontSize);
        Typeface typeface = this.cachedTypeface;
        if (typeface != null) {
            Typeface typeface2 = tp.getTypeface();
            int style = (typeface2 != null ? typeface2.getStyle() : 0) & 3;
            if (style != 0) {
                typeface = Typeface.create(typeface, style);
            }
            tp.setTypeface(typeface);
        }
    }
}
