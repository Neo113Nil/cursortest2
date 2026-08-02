package com.swmansion.enriched.markdown.renderer;

import android.text.SpannableStringBuilder;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.spans.CodeBackgroundSpan;
import com.swmansion.enriched.markdown.spans.CodeSpan;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeRenderer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/CodeRenderer;", "Lcom/swmansion/enriched/markdown/renderer/NodeRenderer;", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/swmansion/enriched/markdown/renderer/RendererConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/RendererConfig;)V", "render", "", "node", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "builder", "Landroid/text/SpannableStringBuilder;", LinkPressEvent.EVENT_NAME, "Lkotlin/Function1;", "", "factory", "Lcom/swmansion/enriched/markdown/renderer/RendererFactory;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CodeRenderer implements NodeRenderer {
    private final RendererConfig config;

    public CodeRenderer(RendererConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // com.swmansion.enriched.markdown.renderer.NodeRenderer
    public void render(MarkdownASTNode node, SpannableStringBuilder builder, Function1<? super String, Unit> onLinkPress, RendererFactory factory) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (node.getChildren().isEmpty()) {
            return;
        }
        List<MarkdownASTNode> children = node.getChildren();
        if ((children instanceof Collection) && children.isEmpty()) {
            return;
        }
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            if (((MarkdownASTNode) it.next()).getContent().length() != 0) {
                int length = builder.length();
                Iterator<T> it2 = node.getChildren().iterator();
                while (it2.hasNext()) {
                    builder.append((CharSequence) ((MarkdownASTNode) it2.next()).getContent());
                }
                int length2 = builder.length();
                if (length2 > length) {
                    builder.setSpan(new CodeSpan(factory.getStyleCache(), factory.getBlockStyleContext().requireBlockStyle()), length, length2, 33);
                    builder.setSpan(new CodeBackgroundSpan(this.config.getStyle()), length, length2, 33);
                    return;
                }
                return;
            }
        }
    }
}
