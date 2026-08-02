package com.swmansion.enriched.markdown.renderer;

import android.text.SpannableStringBuilder;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.renderer.BlockStyleContext;
import com.swmansion.enriched.markdown.renderer.ListContextManager;
import com.swmansion.enriched.markdown.spans.MarginBottomSpan;
import com.swmansion.enriched.markdown.styles.BaseBlockStyle;
import com.swmansion.enriched.markdown.styles.ListStyle;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ListRenderer.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/ListRenderer;", "Lcom/swmansion/enriched/markdown/renderer/NodeRenderer;", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/swmansion/enriched/markdown/renderer/RendererConfig;", "isOrdered", "", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/RendererConfig;Z)V", "render", "", "node", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "builder", "Landroid/text/SpannableStringBuilder;", LinkPressEvent.EVENT_NAME, "Lkotlin/Function1;", "", "factory", "Lcom/swmansion/enriched/markdown/renderer/RendererFactory;", "applyListSpacing", "start", "", "depth", "style", "Lcom/swmansion/enriched/markdown/styles/BaseBlockStyle;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ListRenderer implements NodeRenderer {
    private final RendererConfig config;
    private final boolean isOrdered;

    public ListRenderer(RendererConfig config, boolean z) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.isOrdered = z;
    }

    @Override // com.swmansion.enriched.markdown.renderer.NodeRenderer
    public void render(MarkdownASTNode node, SpannableStringBuilder builder, Function1<? super String, Unit> onLinkPress, RendererFactory factory) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(factory, "factory");
        int length = builder.length();
        ListStyle listStyle = this.config.getStyle().getListStyle();
        BlockStyleContext.ListType listType = this.isOrdered ? BlockStyleContext.ListType.ORDERED : BlockStyleContext.ListType.UNORDERED;
        ListContextManager listContextManager = new ListContextManager(factory.getBlockStyleContext(), this.config.getStyle());
        ListContextManager.ListEntryState enterList = listContextManager.enterList(listType, listStyle);
        if (enterList.getPreviousDepth() > 0) {
            SpannableStringBuilder spannableStringBuilder = builder;
            if (spannableStringBuilder.length() > 0 && StringsKt.last(spannableStringBuilder) != '\n') {
                builder.append("\n");
            }
        }
        try {
            factory.renderChildren(node, builder, onLinkPress);
            listContextManager.exitList(enterList);
            if (builder.length() > length) {
                applyListSpacing(builder, length, enterList.getPreviousDepth(), listStyle);
            }
        } catch (Throwable th) {
            listContextManager.exitList(enterList);
            throw th;
        }
    }

    private final void applyListSpacing(SpannableStringBuilder builder, int start, int depth, BaseBlockStyle style) {
        builder.setSpan(UtilsKt.createLineHeightSpan(style.getLineHeight()), start, builder.length(), 33);
        if (depth != 0 || style.getMarginBottom() <= 0.0f) {
            return;
        }
        builder.append("\n");
        builder.setSpan(new MarginBottomSpan(style.getMarginBottom()), builder.length() - 1, builder.length(), 33);
    }
}
