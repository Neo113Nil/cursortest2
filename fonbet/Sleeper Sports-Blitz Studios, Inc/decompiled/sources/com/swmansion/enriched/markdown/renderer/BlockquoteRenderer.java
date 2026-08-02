package com.swmansion.enriched.markdown.renderer;

import android.text.SpannableStringBuilder;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.spans.BlockquoteSpan;
import com.swmansion.enriched.markdown.spans.MarginBottomSpan;
import com.swmansion.enriched.markdown.styles.BlockquoteStyle;
import com.swmansion.enriched.markdown.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockquoteRenderer.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016JB\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/BlockquoteRenderer;", "Lcom/swmansion/enriched/markdown/renderer/NodeRenderer;", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/swmansion/enriched/markdown/renderer/RendererConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/RendererConfig;)V", "render", "", "node", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "builder", "Landroid/text/SpannableStringBuilder;", LinkPressEvent.EVENT_NAME, "Lkotlin/Function1;", "", "factory", "Lcom/swmansion/enriched/markdown/renderer/RendererFactory;", "applySpansExcludingNested", "nestedRanges", "", "Lkotlin/Pair;", "", "start", "end", TtmlNode.TAG_SPAN, "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlockquoteRenderer implements NodeRenderer {
    private final RendererConfig config;

    public BlockquoteRenderer(RendererConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // com.swmansion.enriched.markdown.renderer.NodeRenderer
    public void render(MarkdownASTNode node, SpannableStringBuilder builder, Function1<? super String, Unit> onLinkPress, RendererFactory factory) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(factory, "factory");
        int length = builder.length();
        BlockquoteStyle blockquoteStyle = this.config.getStyle().getBlockquoteStyle();
        BlockStyleContext blockStyleContext = factory.getBlockStyleContext();
        int blockquoteDepth = blockStyleContext.getBlockquoteDepth();
        int i = blockquoteDepth + 1;
        blockStyleContext.setBlockquoteDepth(i);
        blockStyleContext.setBlockquoteStyle(blockquoteStyle);
        try {
            factory.renderChildren(node, builder, onLinkPress);
            blockStyleContext.clearBlockStyle();
            blockStyleContext.setBlockquoteDepth(blockquoteDepth);
            if (builder.length() == length) {
                return;
            }
            int length2 = builder.length();
            Object[] spans = builder.getSpans(length, length2, BlockquoteSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : spans) {
                if (((BlockquoteSpan) obj).getDepth() == i) {
                    arrayList.add(obj);
                }
            }
            ArrayList<BlockquoteSpan> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (BlockquoteSpan blockquoteSpan : arrayList2) {
                arrayList3.add(TuplesKt.to(Integer.valueOf(builder.getSpanStart(blockquoteSpan)), Integer.valueOf(builder.getSpanEnd(blockquoteSpan))));
            }
            List<Pair<Integer, Integer>> sortedWith = CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.swmansion.enriched.markdown.renderer.BlockquoteRenderer$render$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Integer) ((Pair) t).getFirst(), (Integer) ((Pair) t2).getFirst());
                }
            });
            builder.setSpan(new BlockquoteSpan(blockquoteStyle, blockquoteDepth, factory.getContext(), factory.getStyleCache()), length, length2, 33);
            applySpansExcludingNested(builder, sortedWith, length, length2, UtilsKt.createLineHeightSpan(blockquoteStyle.getLineHeight()));
            if (blockquoteDepth != 0 || blockquoteStyle.getMarginBottom() <= 0.0f) {
                return;
            }
            int length3 = builder.length();
            builder.append("\n");
            builder.setSpan(new MarginBottomSpan(blockquoteStyle.getMarginBottom()), length3, builder.length(), 33);
        } catch (Throwable th) {
            blockStyleContext.clearBlockStyle();
            blockStyleContext.setBlockquoteDepth(blockquoteDepth);
            throw th;
        }
    }

    private final void applySpansExcludingNested(SpannableStringBuilder builder, List<Pair<Integer, Integer>> nestedRanges, int start, int end, Object span) {
        for (Pair<Integer, Integer> pair : nestedRanges) {
            int intValue = pair.component1().intValue();
            int intValue2 = pair.component2().intValue();
            if (start < intValue) {
                builder.setSpan(span, start, intValue, 33);
            }
            start = intValue2;
        }
        if (start < end) {
            builder.setSpan(span, start, end, 33);
        }
    }
}
