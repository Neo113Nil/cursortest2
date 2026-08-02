package com.swmansion.enriched.markdown.renderer;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.spans.ImageSpan;
import com.swmansion.enriched.markdown.spans.MarginBottomSpan;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Renderer.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tJ&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J6\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\fH\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0!R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/Renderer;", "", "<init>", "()V", "cachedFactory", "Lcom/swmansion/enriched/markdown/renderer/RendererFactory;", "cachedStyle", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "cachedContext", "Landroid/content/Context;", "collectedImageSpans", "", "Lcom/swmansion/enriched/markdown/spans/ImageSpan;", "configure", "", "style", "context", "renderDocument", "Landroid/text/SpannableString;", "document", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", LinkPressEvent.EVENT_NAME, "Lkotlin/Function1;", "", "removeTrailingMargin", "builder", "Landroid/text/SpannableStringBuilder;", "renderNode", "node", "factory", "reportImageSpan", TtmlNode.TAG_SPAN, "getCollectedImageSpans", "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Renderer {
    private Context cachedContext;
    private RendererFactory cachedFactory;
    private StyleConfig cachedStyle;
    private final List<ImageSpan> collectedImageSpans = new ArrayList();

    public final void configure(StyleConfig style, Context context) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.cachedStyle == style && this.cachedContext == context) {
            return;
        }
        this.cachedStyle = style;
        this.cachedContext = context;
        this.cachedFactory = new RendererFactory(new RendererConfig(style), context, new Function1() { // from class: com.swmansion.enriched.markdown.renderer.Renderer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit configure$lambda$0;
                configure$lambda$0 = Renderer.configure$lambda$0(Renderer.this, (ImageSpan) obj);
                return configure$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configure$lambda$0(Renderer renderer, ImageSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        renderer.reportImageSpan(span);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpannableString renderDocument$default(Renderer renderer, MarkdownASTNode markdownASTNode, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return renderer.renderDocument(markdownASTNode, function1);
    }

    public final SpannableString renderDocument(MarkdownASTNode document, Function1<? super String, Unit> onLinkPress) {
        Intrinsics.checkNotNullParameter(document, "document");
        RendererFactory rendererFactory = this.cachedFactory;
        if (rendererFactory == null) {
            throw new IllegalArgumentException("Renderer must be configured with a style before calling renderDocument.".toString());
        }
        rendererFactory.resetForNewRender();
        this.collectedImageSpans.clear();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        renderNode(document, spannableStringBuilder, onLinkPress, rendererFactory);
        removeTrailingMargin(spannableStringBuilder);
        return new SpannableString(spannableStringBuilder);
    }

    private final void removeTrailingMargin(SpannableStringBuilder builder) {
        MarginBottomSpan marginBottomSpan;
        SpannableStringBuilder spannableStringBuilder = builder;
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        MarginBottomSpan[] marginBottomSpanArr = (MarginBottomSpan[]) builder.getSpans(0, builder.length(), MarginBottomSpan.class);
        Intrinsics.checkNotNull(marginBottomSpanArr);
        if (marginBottomSpanArr.length == 0) {
            return;
        }
        if (marginBottomSpanArr.length == 0) {
            marginBottomSpan = null;
        } else {
            MarginBottomSpan marginBottomSpan2 = marginBottomSpanArr[0];
            int lastIndex = ArraysKt.getLastIndex(marginBottomSpanArr);
            if (lastIndex != 0) {
                int spanEnd = builder.getSpanEnd(marginBottomSpan2);
                if (1 <= lastIndex) {
                    int i = 1;
                    while (true) {
                        MarginBottomSpan marginBottomSpan3 = marginBottomSpanArr[i];
                        int spanEnd2 = builder.getSpanEnd(marginBottomSpan3);
                        if (spanEnd < spanEnd2) {
                            marginBottomSpan2 = marginBottomSpan3;
                            spanEnd = spanEnd2;
                        }
                        if (i == lastIndex) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            marginBottomSpan = marginBottomSpan2;
        }
        if (marginBottomSpan == null) {
            return;
        }
        int spanEnd3 = builder.getSpanEnd(marginBottomSpan);
        while (spannableStringBuilder.length() > 0 && StringsKt.last(spannableStringBuilder) == '\n') {
            builder.delete(builder.length() - 1, builder.length());
        }
        if (spanEnd3 >= builder.length()) {
            builder.removeSpan(marginBottomSpan);
        }
    }

    private final void renderNode(MarkdownASTNode node, SpannableStringBuilder builder, Function1<? super String, Unit> onLinkPress, RendererFactory factory) {
        factory.getRenderer(node).render(node, builder, onLinkPress, factory);
    }

    private final void reportImageSpan(ImageSpan span) {
        this.collectedImageSpans.add(span);
    }

    public final List<ImageSpan> getCollectedImageSpans() {
        return this.collectedImageSpans;
    }
}
