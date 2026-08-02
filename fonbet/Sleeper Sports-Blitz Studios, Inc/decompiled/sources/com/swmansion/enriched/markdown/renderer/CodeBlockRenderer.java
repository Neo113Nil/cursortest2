package com.swmansion.enriched.markdown.renderer;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.spans.CodeBlockSpan;
import com.swmansion.enriched.markdown.spans.MarginBottomSpan;
import com.swmansion.enriched.markdown.styles.CodeBlockStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeBlockRenderer.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/CodeBlockRenderer;", "Lcom/swmansion/enriched/markdown/renderer/NodeRenderer;", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/swmansion/enriched/markdown/renderer/RendererConfig;", "<init>", "(Lcom/swmansion/enriched/markdown/renderer/RendererConfig;)V", "render", "", "node", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "builder", "Landroid/text/SpannableStringBuilder;", LinkPressEvent.EVENT_NAME, "Lkotlin/Function1;", "", "factory", "Lcom/swmansion/enriched/markdown/renderer/RendererFactory;", "CodeBlockBoundaryPaddingSpan", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CodeBlockRenderer implements NodeRenderer {
    private final RendererConfig config;

    public CodeBlockRenderer(RendererConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // com.swmansion.enriched.markdown.renderer.NodeRenderer
    public void render(MarkdownASTNode node, SpannableStringBuilder builder, Function1<? super String, Unit> onLinkPress, RendererFactory factory) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(factory, "factory");
        int length = builder.length();
        CodeBlockStyle codeBlockStyle = this.config.getStyle().getCodeBlockStyle();
        BlockStyleContext blockStyleContext = factory.getBlockStyleContext();
        blockStyleContext.setCodeBlockStyle(codeBlockStyle);
        try {
            factory.renderChildren(node, builder, onLinkPress);
            blockStyleContext.clearBlockStyle();
            if (builder.length() == length) {
                return;
            }
            int length2 = builder.length();
            int padding = (int) codeBlockStyle.getPadding();
            builder.setSpan(new CodeBlockSpan(codeBlockStyle, factory.getContext(), factory.getStyleCache()), length, length2, 33);
            builder.setSpan(new CodeBlockBoundaryPaddingSpan(padding), length, length2, 33);
            if (codeBlockStyle.getMarginBottom() > 0.0f) {
                int length3 = builder.length();
                builder.append("\n");
                builder.setSpan(new MarginBottomSpan(codeBlockStyle.getMarginBottom()), length3, builder.length(), 33);
            }
        } catch (Throwable th) {
            blockStyleContext.clearBlockStyle();
            throw th;
        }
    }

    /* compiled from: CodeBlockRenderer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/swmansion/enriched/markdown/renderer/CodeBlockRenderer$CodeBlockBoundaryPaddingSpan;", "Landroid/text/style/LineHeightSpan;", ViewProps.PADDING, "", "<init>", "(I)V", "chooseHeight", "", "text", "", "startLine", "endLine", "spanstartv", "v", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class CodeBlockBoundaryPaddingSpan implements LineHeightSpan {
        private final int padding;

        public CodeBlockBoundaryPaddingSpan(int i) {
            this.padding = i;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence text, int startLine, int endLine, int spanstartv, int v, Paint.FontMetricsInt fm) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(fm, "fm");
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                int spanStart = spanned.getSpanStart(this);
                int spanEnd = spanned.getSpanEnd(this);
                if (startLine == spanStart) {
                    fm.ascent -= this.padding;
                    fm.top -= this.padding;
                }
                if (endLine == spanEnd || (spanEnd <= endLine && text.charAt(spanEnd - 1) == '\n')) {
                    fm.descent += this.padding;
                    fm.bottom += this.padding;
                }
            }
        }
    }
}
