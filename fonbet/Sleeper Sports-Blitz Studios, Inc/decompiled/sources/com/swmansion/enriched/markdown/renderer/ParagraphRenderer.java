package com.swmansion.enriched.markdown.renderer;

import android.text.SpannableStringBuilder;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.styles.ParagraphStyle;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParagraphRenderer.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\u0011\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/ParagraphRenderer;", "Lcom/swmansion/enriched/markdown/renderer/NodeRenderer;", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/swmansion/enriched/markdown/renderer/RendererConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/RendererConfig;)V", "render", "", "node", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "builder", "Landroid/text/SpannableStringBuilder;", LinkPressEvent.EVENT_NAME, "Lkotlin/Function1;", "", "factory", "Lcom/swmansion/enriched/markdown/renderer/RendererFactory;", "applySpans", "style", "Lcom/swmansion/enriched/markdown/styles/ParagraphStyle;", "start", "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ParagraphRenderer implements NodeRenderer {
    private final RendererConfig config;

    public ParagraphRenderer(RendererConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // com.swmansion.enriched.markdown.renderer.NodeRenderer
    public void render(MarkdownASTNode node, SpannableStringBuilder builder, Function1<? super String, Unit> onLinkPress, RendererFactory factory) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(factory, "factory");
        BlockStyleContext blockStyleContext = factory.getBlockStyleContext();
        if (blockStyleContext.isInsideBlockElement()) {
            factory.renderChildren(node, builder, onLinkPress);
            builder.append("\n");
            return;
        }
        int length = builder.length();
        ParagraphStyle paragraphStyle = this.config.getStyle().getParagraphStyle();
        blockStyleContext.setParagraphStyle(paragraphStyle);
        try {
            factory.renderChildren(node, builder, onLinkPress);
            blockStyleContext.clearBlockStyle();
            if (builder.length() > length) {
                applySpans(builder, node, paragraphStyle, length);
            }
        } catch (Throwable th) {
            blockStyleContext.clearBlockStyle();
            throw th;
        }
    }

    private final void applySpans(SpannableStringBuilder spannableStringBuilder, MarkdownASTNode markdownASTNode, ParagraphStyle paragraphStyle, int i) {
        int length = spannableStringBuilder.length();
        if (!UtilsKt.containsBlockImage(markdownASTNode)) {
            spannableStringBuilder.setSpan(UtilsKt.createLineHeightSpan(paragraphStyle.getLineHeight()), i, length, 33);
        }
        UtilsKt.applyMarginBottom(spannableStringBuilder, i, UtilsKt.getMarginBottomForParagraph(markdownASTNode, paragraphStyle, this.config.getStyle()));
    }
}
