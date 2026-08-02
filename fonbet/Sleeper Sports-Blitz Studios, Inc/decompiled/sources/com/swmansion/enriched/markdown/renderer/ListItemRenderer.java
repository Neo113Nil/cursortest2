package com.swmansion.enriched.markdown.renderer;

import android.text.SpannableStringBuilder;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.renderer.BlockStyleContext;
import com.swmansion.enriched.markdown.spans.OrderedListSpan;
import com.swmansion.enriched.markdown.spans.UnorderedListSpan;
import com.swmansion.enriched.markdown.styles.ListStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ListItemRenderer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/ListItemRenderer;", "Lcom/swmansion/enriched/markdown/renderer/NodeRenderer;", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/swmansion/enriched/markdown/renderer/RendererConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/RendererConfig;)V", "render", "", "node", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "builder", "Landroid/text/SpannableStringBuilder;", LinkPressEvent.EVENT_NAME, "Lkotlin/Function1;", "", "factory", "Lcom/swmansion/enriched/markdown/renderer/RendererFactory;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ListItemRenderer implements NodeRenderer {
    private final RendererConfig config;

    /* compiled from: ListItemRenderer.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockStyleContext.ListType.values().length];
            try {
                iArr[BlockStyleContext.ListType.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockStyleContext.ListType.ORDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ListItemRenderer(RendererConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // com.swmansion.enriched.markdown.renderer.NodeRenderer
    public void render(MarkdownASTNode node, SpannableStringBuilder builder, Function1<? super String, Unit> onLinkPress, RendererFactory factory) {
        UnorderedListSpan unorderedListSpan;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(factory, "factory");
        BlockStyleContext blockStyleContext = factory.getBlockStyleContext();
        int length = builder.length();
        BlockStyleContext.ListType listType = blockStyleContext.getListType();
        if (listType == null) {
            return;
        }
        if (listType == BlockStyleContext.ListType.ORDERED) {
            blockStyleContext.incrementListItemNumber();
        }
        factory.renderChildren(node, builder, onLinkPress);
        if (builder.length() != length) {
            SpannableStringBuilder spannableStringBuilder = builder;
            if (StringsKt.isBlank(spannableStringBuilder.subSequence(length, spannableStringBuilder.length()).toString())) {
                return;
            }
            while (builder.length() > length && StringsKt.last(spannableStringBuilder) == '\n') {
                builder.delete(builder.length() - 1, builder.length());
            }
            builder.append("\n");
            int listDepth = blockStyleContext.getListDepth() - 1;
            ListStyle listStyle = this.config.getStyle().getListStyle();
            int i = WhenMappings.$EnumSwitchMapping$0[listType.ordinal()];
            if (i == 1) {
                unorderedListSpan = new UnorderedListSpan(listStyle, listDepth, factory.getContext(), factory.getStyleCache());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                OrderedListSpan orderedListSpan = new OrderedListSpan(listStyle, listDepth, factory.getContext(), factory.getStyleCache());
                orderedListSpan.setItemNumber(blockStyleContext.getListItemNumber());
                unorderedListSpan = orderedListSpan;
            }
            builder.setSpan(unorderedListSpan, length, builder.length(), 33);
        }
    }
}
