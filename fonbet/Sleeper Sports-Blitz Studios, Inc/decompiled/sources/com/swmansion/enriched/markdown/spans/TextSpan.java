package com.swmansion.enriched.markdown.spans;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSpan.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/TextSpan;", "Landroid/text/style/MetricAffectingSpan;", "blockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "context", "Landroid/content/Context;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/BlockStyle;Landroid/content/Context;)V", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "updateMeasureState", "applyBlockStyle", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextSpan extends MetricAffectingSpan {
    private final BlockStyle blockStyle;
    private final Context context;

    public TextSpan(BlockStyle blockStyle, Context context) {
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        Intrinsics.checkNotNullParameter(context, "context");
        this.blockStyle = blockStyle;
        this.context = context;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyBlockStyle(tp);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        applyBlockStyle(tp);
    }

    private final void applyBlockStyle(TextPaint tp) {
        tp.setTextSize(this.blockStyle.getFontSize());
        tp.setColor(this.blockStyle.getColor());
        UtilsKt.applyBlockStyleFont(tp, this.blockStyle, this.context);
    }
}
