package com.swmansion.enriched.markdown.renderer;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.spans.ImageSpan;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NodeRenderer.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\bJ\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'J,\u0010(\u001a\u00020\t2\u0006\u0010&\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007Jo\u0010-\u001a\u00020\t2\u0006\u0010)\u001a\u00020*2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0/2K\u00100\u001aG\u0012\u0013\u0012\u001102¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0013\u0012\u001102¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0013\u0012\u001107¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\t01H\u0086\bø\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/RendererFactory;", "", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/swmansion/enriched/markdown/renderer/RendererConfig;", "context", "Landroid/content/Context;", "onImageSpanCreated", "Lkotlin/Function1;", "Lcom/swmansion/enriched/markdown/spans/ImageSpan;", "", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/RendererConfig;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "blockStyleContext", "Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext;", "getBlockStyleContext", "()Lcom/swmansion/enriched/markdown/renderer/BlockStyleContext;", "styleCache", "Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "getStyleCache", "()Lcom/swmansion/enriched/markdown/renderer/SpanStyleCache;", "resetForNewRender", "textRenderer", "Lcom/swmansion/enriched/markdown/renderer/TextRenderer;", "lineBreakRenderer", "Lcom/swmansion/enriched/markdown/renderer/LineBreakRenderer;", "renderers", "", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode$NodeType;", "Lcom/swmansion/enriched/markdown/renderer/NodeRenderer;", "getRenderers", "()Ljava/util/Map;", "renderers$delegate", "Lkotlin/Lazy;", "registerImageSpan", TtmlNode.TAG_SPAN, "getRenderer", "node", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "renderChildren", "builder", "Landroid/text/SpannableStringBuilder;", LinkPressEvent.EVENT_NAME, "", "renderWithSpan", "renderContent", "Lkotlin/Function0;", "applySpan", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "start", "end", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "blockStyle", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RendererFactory {
    private final BlockStyleContext blockStyleContext;
    private final RendererConfig config;
    private final Context context;
    private final LineBreakRenderer lineBreakRenderer;
    private final Function1<ImageSpan, Unit> onImageSpanCreated;

    /* renamed from: renderers$delegate, reason: from kotlin metadata */
    private final Lazy renderers;
    private final SpanStyleCache styleCache;
    private final TextRenderer textRenderer;

    /* JADX WARN: Multi-variable type inference failed */
    public RendererFactory(RendererConfig config, Context context, Function1<? super ImageSpan, Unit> onImageSpanCreated) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onImageSpanCreated, "onImageSpanCreated");
        this.config = config;
        this.context = context;
        this.onImageSpanCreated = onImageSpanCreated;
        this.blockStyleContext = new BlockStyleContext();
        this.styleCache = new SpanStyleCache(config.getStyle());
        this.textRenderer = new TextRenderer();
        this.lineBreakRenderer = new LineBreakRenderer();
        this.renderers = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.renderer.RendererFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map renderers_delegate$lambda$0;
                renderers_delegate$lambda$0 = RendererFactory.renderers_delegate$lambda$0(RendererFactory.this);
                return renderers_delegate$lambda$0;
            }
        });
    }

    public final Context getContext() {
        return this.context;
    }

    public final BlockStyleContext getBlockStyleContext() {
        return this.blockStyleContext;
    }

    public final SpanStyleCache getStyleCache() {
        return this.styleCache;
    }

    public final void resetForNewRender() {
        this.blockStyleContext.resetForNewRender();
    }

    private final Map<MarkdownASTNode.NodeType, NodeRenderer> getRenderers() {
        return (Map) this.renderers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map renderers_delegate$lambda$0(RendererFactory rendererFactory) {
        return MapsKt.mapOf(TuplesKt.to(MarkdownASTNode.NodeType.Document, new DocumentRenderer()), TuplesKt.to(MarkdownASTNode.NodeType.Paragraph, new ParagraphRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.Heading, new HeadingRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.Blockquote, new BlockquoteRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.CodeBlock, new CodeBlockRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.UnorderedList, new ListRenderer(rendererFactory.config, false)), TuplesKt.to(MarkdownASTNode.NodeType.OrderedList, new ListRenderer(rendererFactory.config, true)), TuplesKt.to(MarkdownASTNode.NodeType.ListItem, new ListItemRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.Text, rendererFactory.textRenderer), TuplesKt.to(MarkdownASTNode.NodeType.Link, new LinkRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.Strong, new StrongRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.Emphasis, new EmphasisRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.Code, new CodeRenderer(rendererFactory.config)), TuplesKt.to(MarkdownASTNode.NodeType.Image, new ImageRenderer(rendererFactory.config, rendererFactory.context)), TuplesKt.to(MarkdownASTNode.NodeType.LineBreak, rendererFactory.lineBreakRenderer), TuplesKt.to(MarkdownASTNode.NodeType.ThematicBreak, new ThematicBreakRenderer(rendererFactory.config)));
    }

    public final void registerImageSpan(ImageSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        this.onImageSpanCreated.invoke(span);
    }

    public final NodeRenderer getRenderer(MarkdownASTNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        NodeRenderer nodeRenderer = getRenderers().get(node.getType());
        if (nodeRenderer != null) {
            return nodeRenderer;
        }
        Log.w("RendererFactory", "No renderer for: " + node.getType());
        return this.textRenderer;
    }

    public final void renderChildren(MarkdownASTNode node, SpannableStringBuilder builder, Function1<? super String, Unit> onLinkPress) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (MarkdownASTNode markdownASTNode : node.getChildren()) {
            getRenderer(markdownASTNode).render(markdownASTNode, builder, onLinkPress, this);
        }
    }

    public final void renderWithSpan(SpannableStringBuilder builder, Function0<Unit> renderContent, Function3<? super Integer, ? super Integer, ? super BlockStyle, Unit> applySpan) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(renderContent, "renderContent");
        Intrinsics.checkNotNullParameter(applySpan, "applySpan");
        int length = builder.length();
        renderContent.invoke();
        int length2 = builder.length();
        if (length2 > length) {
            applySpan.invoke(Integer.valueOf(length), Integer.valueOf(length2), getBlockStyleContext().requireBlockStyle());
        }
    }
}
