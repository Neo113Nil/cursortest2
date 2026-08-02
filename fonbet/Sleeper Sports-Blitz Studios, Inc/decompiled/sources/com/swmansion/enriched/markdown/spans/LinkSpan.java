package com.swmansion.enriched.markdown.spans;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.enriched.markdown.EnrichedMarkdownText;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.renderer.SpanStyleCache;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkSpan.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/LinkSpan;", "Landroid/text/style/ClickableSpan;", "url", "", LinkPressEvent.EVENT_NAME, "Lkotlin/Function1;", "", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "blockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "context", "Landroid/content/Context;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;Lcom/swmansion/enriched/markdown/renderer/BlockStyle;Landroid/content/Context;)V", "getUrl", "()Ljava/lang/String;", ViewProps.ON_CLICK, "widget", "Landroid/view/View;", "updateDrawState", "textPaint", "Landroid/text/TextPaint;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LinkSpan extends ClickableSpan {
    private final BlockStyle blockStyle;
    private final Context context;
    private final Function1<String, Unit> onLinkPress;
    private final SpanStyleCache styleCache;
    private final String url;

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkSpan(String url, Function1<? super String, Unit> function1, SpanStyleCache styleCache, BlockStyle blockStyle, Context context) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(styleCache, "styleCache");
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        Intrinsics.checkNotNullParameter(context, "context");
        this.url = url;
        this.onLinkPress = function1;
        this.styleCache = styleCache;
        this.blockStyle = blockStyle;
        this.context = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Function1<String, Unit> function1 = this.onLinkPress;
        if (function1 != null) {
            function1.invoke(this.url);
        } else if (widget instanceof EnrichedMarkdownText) {
            ((EnrichedMarkdownText) widget).emitOnLinkPress(this.url);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setTextSize(this.blockStyle.getFontSize());
        UtilsKt.applyBlockStyleFont(textPaint, this.blockStyle, this.context);
        textPaint.setColor(this.styleCache.getLinkColor());
        textPaint.setUnderlineText(this.styleCache.getLinkUnderline());
    }
}
