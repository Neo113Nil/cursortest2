package com.swmansion.enriched.markdown.utils;

import android.text.Spannable;
import android.widget.TextView;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.swmansion.enriched.markdown.EnrichedMarkdownText;
import com.swmansion.enriched.markdown.spans.BlockquoteSpan;
import com.swmansion.enriched.markdown.spans.CodeBlockSpan;
import com.swmansion.enriched.markdown.spans.CodeSpan;
import com.swmansion.enriched.markdown.spans.EmphasisSpan;
import com.swmansion.enriched.markdown.spans.HeadingSpan;
import com.swmansion.enriched.markdown.spans.ImageSpan;
import com.swmansion.enriched.markdown.spans.LinkSpan;
import com.swmansion.enriched.markdown.spans.OrderedListSpan;
import com.swmansion.enriched.markdown.spans.StrongSpan;
import com.swmansion.enriched.markdown.spans.ThematicBreakSpan;
import com.swmansion.enriched.markdown.spans.UnorderedListSpan;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MarkdownExtractor.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002+,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJD\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J<\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u001f\u001a\u00020\u001b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J4\u0010 \u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J*\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J*\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J(\u0010%\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010)\u001a\u00020\u001b*\u00060\u0014j\u0002`\u0015H\u0002J\u0010\u0010*\u001a\u00020\u000f*\u00060\u0014j\u0002`\u0015H\u0002¨\u0006-"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/MarkdownExtractor;", "", "<init>", "()V", "getMarkdownForSelection", "", "textView", "Landroid/widget/TextView;", "extractFromSpannable", "spannable", "Landroid/text/Spannable;", "start", "", "end", "processSegment", "", "segmentText", "segmentStart", "segmentEnd", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "state", "Lcom/swmansion/enriched/markdown/utils/MarkdownExtractor$ExtractionState;", "headingAccumulator", "Lcom/swmansion/enriched/markdown/utils/MarkdownExtractor$HeadingAccumulator;", "appendFormattedSegment", "", "appendImage", "img", "Lcom/swmansion/enriched/markdown/spans/ImageSpan;", "appendThematicBreak", "handleNewline", "appendCodeBlock", "text", "detectBlockquote", "detectList", "applyInlineFormatting", "buildBlockPrefix", "blockquotePrefix", "listPrefix", "ensureBlankLine", "isAtLineStart", "ExtractionState", "HeadingAccumulator", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MarkdownExtractor {
    public static final MarkdownExtractor INSTANCE = new MarkdownExtractor();

    private MarkdownExtractor() {
    }

    public final String getMarkdownForSelection(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0 || selectionStart >= selectionEnd) {
            return null;
        }
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return null;
        }
        if (selectionStart == 0 && selectionEnd >= textView.getText().length() - 1 && (textView instanceof EnrichedMarkdownText)) {
            String currentMarkdown = ((EnrichedMarkdownText) textView).getCurrentMarkdown();
            if (currentMarkdown.length() > 0) {
                return currentMarkdown;
            }
        }
        return extractFromSpannable(spannable, selectionStart, selectionEnd);
    }

    public final String extractFromSpannable(Spannable spannable, int start, int end) {
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        StringBuilder sb = new StringBuilder();
        ExtractionState extractionState = new ExtractionState(0, 0, false, 7, null);
        HeadingAccumulator headingAccumulator = new HeadingAccumulator();
        int i = start;
        while (i < end) {
            int nextSpanTransition = spannable.nextSpanTransition(i, end, Object.class);
            String obj = spannable.subSequence(i, nextSpanTransition).toString();
            Spannable spannable2 = spannable;
            if (!processSegment(spannable2, obj, i, nextSpanTransition, sb, extractionState, headingAccumulator)) {
                appendFormattedSegment(spannable2, obj, i, nextSpanTransition, sb, extractionState);
            }
            spannable = spannable2;
            i = nextSpanTransition;
        }
        headingAccumulator.flush(sb, extractionState);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final boolean processSegment(Spannable spannable, String segmentText, int segmentStart, int segmentEnd, StringBuilder result, ExtractionState state, HeadingAccumulator headingAccumulator) {
        ThematicBreakSpan[] thematicBreakSpanArr = (ThematicBreakSpan[]) spannable.getSpans(segmentStart, segmentEnd, ThematicBreakSpan.class);
        Intrinsics.checkNotNull(thematicBreakSpanArr);
        if (!(thematicBreakSpanArr.length == 0)) {
            appendThematicBreak(result, state);
            return true;
        }
        if (Intrinsics.areEqual(segmentText, "￼") || Intrinsics.areEqual(segmentText, "\u200b")) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) spannable.getSpans(segmentStart, segmentEnd, ImageSpan.class);
            Intrinsics.checkNotNull(imageSpanArr);
            if (!(imageSpanArr.length == 0)) {
                ImageSpan imageSpan = imageSpanArr[0];
                Intrinsics.checkNotNullExpressionValue(imageSpan, "get(...)");
                appendImage(imageSpan, result, state);
                return true;
            }
        }
        if (segmentText.length() == 0) {
            return true;
        }
        if (Intrinsics.areEqual(segmentText, "\n") || Intrinsics.areEqual(segmentText, "\n\n")) {
            handleNewline(spannable, segmentStart, segmentEnd, result, state);
            return true;
        }
        HeadingSpan[] headingSpanArr = (HeadingSpan[]) spannable.getSpans(segmentStart, segmentEnd, HeadingSpan.class);
        Intrinsics.checkNotNull(headingSpanArr);
        if (!(headingSpanArr.length == 0)) {
            headingAccumulator.accumulate(headingSpanArr[0].getLevel(), segmentText, result, state);
            return true;
        }
        headingAccumulator.flush(result, state);
        CodeBlockSpan[] codeBlockSpanArr = (CodeBlockSpan[]) spannable.getSpans(segmentStart, segmentEnd, CodeBlockSpan.class);
        Intrinsics.checkNotNull(codeBlockSpanArr);
        if (codeBlockSpanArr.length == 0) {
            return false;
        }
        appendCodeBlock(segmentText, result, state);
        return true;
    }

    private final void appendFormattedSegment(Spannable spannable, String segmentText, int segmentStart, int segmentEnd, StringBuilder result, ExtractionState state) {
        String detectBlockquote = detectBlockquote(spannable, segmentStart, segmentEnd, state);
        String detectList = detectList(spannable, segmentStart, segmentEnd, state);
        String applyInlineFormatting = applyInlineFormatting(spannable, segmentText, segmentStart, segmentEnd);
        if (isAtLineStart(result) && !StringsKt.startsWith$default(segmentText, "\n", false, 2, (Object) null)) {
            applyInlineFormatting = buildBlockPrefix(detectBlockquote, detectList) + applyInlineFormatting;
        }
        if (state.getNeedsBlankLine() && result.length() > 0) {
            ensureBlankLine(result);
            state.setNeedsBlankLine(false);
        }
        result.append(applyInlineFormatting);
    }

    private final void appendImage(ImageSpan img, StringBuilder result, ExtractionState state) {
        if (img.getIsInline()) {
            result.append("![image](" + img.getImageUrl() + ")");
            return;
        }
        ensureBlankLine(result);
        result.append("![image](" + img.getImageUrl() + ")\n");
        state.setNeedsBlankLine(true);
        state.setBlockquoteDepth(-1);
        state.setListDepth(-1);
    }

    private final void appendThematicBreak(StringBuilder result, ExtractionState state) {
        ensureBlankLine(result);
        result.append("---\n");
        state.setNeedsBlankLine(true);
        state.setBlockquoteDepth(-1);
        state.setListDepth(-1);
    }

    private final void handleNewline(Spannable spannable, int start, int end, StringBuilder result, ExtractionState state) {
        Object[] spans = spannable.getSpans(start, end, BlockquoteSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        boolean z = true;
        boolean z2 = spans.length == 0;
        Object[] spans2 = spannable.getSpans(start, end, OrderedListSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans2, "getSpans(...)");
        if (spans2.length == 0) {
            Object[] spans3 = spannable.getSpans(start, end, UnorderedListSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans3, "getSpans(...)");
            if (spans3.length == 0) {
                z = false;
            }
        }
        if (z2 && state.getBlockquoteDepth() >= 0) {
            ensureBlankLine(result);
            state.setBlockquoteDepth(-1);
            return;
        }
        if (!z && state.getListDepth() >= 0) {
            ensureBlankLine(result);
            state.setListDepth(-1);
        } else {
            if (!z2 || z) {
                if (StringsKt.endsWith$default((CharSequence) result, (CharSequence) "\n", false, 2, (Object) null)) {
                    return;
                }
                result.append("\n");
                return;
            }
            ensureBlankLine(result);
        }
    }

    private final void appendCodeBlock(String text, StringBuilder result, ExtractionState state) {
        if (state.getNeedsBlankLine()) {
            ensureBlankLine(result);
            state.setNeedsBlankLine(false);
        }
        StringBuilder sb = result;
        if (sb.length() == 0 || StringsKt.endsWith$default((CharSequence) sb, (CharSequence) "\n\n", false, 2, (Object) null)) {
            result.append("```\n");
        }
        result.append(text);
        if (StringsKt.endsWith$default(text, "\n", false, 2, (Object) null)) {
            result.append("```\n");
            state.setNeedsBlankLine(true);
        }
    }

    private final String detectBlockquote(Spannable spannable, int start, int end, ExtractionState state) {
        Integer valueOf;
        BlockquoteSpan[] blockquoteSpanArr = (BlockquoteSpan[]) spannable.getSpans(start, end, BlockquoteSpan.class);
        Intrinsics.checkNotNull(blockquoteSpanArr);
        if (blockquoteSpanArr.length == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(blockquoteSpanArr[0].getDepth());
            int lastIndex = ArraysKt.getLastIndex(blockquoteSpanArr);
            if (1 <= lastIndex) {
                int i = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(blockquoteSpanArr[i].getDepth());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        Integer num = valueOf;
        int intValue = num != null ? num.intValue() : -1;
        if (intValue >= 0) {
            state.setBlockquoteDepth(intValue);
            return StringsKt.repeat("> ", intValue + 1);
        }
        if (state.getBlockquoteDepth() >= 0) {
            state.setBlockquoteDepth(-1);
        }
        return null;
    }

    private final String detectList(Spannable spannable, int start, int end, ExtractionState state) {
        Integer valueOf;
        Integer valueOf2;
        OrderedListSpan[] orderedListSpanArr = (OrderedListSpan[]) spannable.getSpans(start, end, OrderedListSpan.class);
        UnorderedListSpan[] unorderedListSpanArr = (UnorderedListSpan[]) spannable.getSpans(start, end, UnorderedListSpan.class);
        Intrinsics.checkNotNull(orderedListSpanArr);
        if (orderedListSpanArr.length == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(orderedListSpanArr[0].getDepth());
            int lastIndex = ArraysKt.getLastIndex(orderedListSpanArr);
            if (1 <= lastIndex) {
                int i = 1;
                while (true) {
                    Integer valueOf3 = Integer.valueOf(orderedListSpanArr[i].getDepth());
                    if (valueOf.compareTo(valueOf3) < 0) {
                        valueOf = valueOf3;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        Integer num = valueOf;
        int intValue = num != null ? num.intValue() : -1;
        Intrinsics.checkNotNull(unorderedListSpanArr);
        if (unorderedListSpanArr.length == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(unorderedListSpanArr[0].getDepth());
            int lastIndex2 = ArraysKt.getLastIndex(unorderedListSpanArr);
            if (1 <= lastIndex2) {
                int i2 = 1;
                while (true) {
                    Integer valueOf4 = Integer.valueOf(unorderedListSpanArr[i2].getDepth());
                    if (valueOf2.compareTo(valueOf4) < 0) {
                        valueOf2 = valueOf4;
                    }
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num2 = valueOf2;
        int max = Math.max(intValue, num2 != null ? num2.intValue() : -1);
        if (max >= 0) {
            state.setListDepth(max);
            String repeat = StringsKt.repeat("  ", max);
            if (!(orderedListSpanArr.length == 0)) {
                return repeat + orderedListSpanArr[0].getItemNumber() + ". ";
            }
            return repeat + "- ";
        }
        if (state.getListDepth() >= 0) {
            state.setListDepth(-1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String applyInlineFormatting(Spannable spannable, String text, int start, int end) {
        String str;
        Object[] spans = spannable.getSpans(start, end, StrongSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        boolean z = spans.length == 0;
        Object[] spans2 = spannable.getSpans(start, end, EmphasisSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans2, "getSpans(...)");
        boolean z2 = spans2.length == 0;
        Object[] spans3 = spannable.getSpans(start, end, CodeSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans3, "getSpans(...)");
        boolean z3 = spans3.length == 0;
        LinkSpan[] linkSpanArr = (LinkSpan[]) spannable.getSpans(start, end, LinkSpan.class);
        if (!z3) {
            Intrinsics.checkNotNull(linkSpanArr);
            if (linkSpanArr.length == 0) {
                str = "`" + text + "`";
                if (!z2) {
                    str = "*" + str + "*";
                }
                if (!z) {
                    str = "**" + str + "**";
                }
                Intrinsics.checkNotNull(linkSpanArr);
                if (!(linkSpanArr.length == 0)) {
                    return str;
                }
                return "[" + text + "](" + linkSpanArr[0].getUrl() + ")";
            }
        }
        str = text;
        if (!z2) {
        }
        if (!z) {
        }
        Intrinsics.checkNotNull(linkSpanArr);
        if (!(linkSpanArr.length == 0)) {
        }
    }

    private final String buildBlockPrefix(String blockquotePrefix, String listPrefix) {
        StringBuilder sb = new StringBuilder();
        if (blockquotePrefix != null) {
            sb.append(blockquotePrefix);
        }
        if (listPrefix != null) {
            sb.append(listPrefix);
        }
        return sb.toString();
    }

    /* compiled from: MarkdownExtractor.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/MarkdownExtractor$ExtractionState;", "", "blockquoteDepth", "", "listDepth", "needsBlankLine", "", "<init>", "(IIZ)V", "getBlockquoteDepth", "()I", "setBlockquoteDepth", "(I)V", "getListDepth", "setListDepth", "getNeedsBlankLine", "()Z", "setNeedsBlankLine", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class ExtractionState {
        private int blockquoteDepth;
        private int listDepth;
        private boolean needsBlankLine;

        public ExtractionState() {
            this(0, 0, false, 7, null);
        }

        public static /* synthetic */ ExtractionState copy$default(ExtractionState extractionState, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = extractionState.blockquoteDepth;
            }
            if ((i3 & 2) != 0) {
                i2 = extractionState.listDepth;
            }
            if ((i3 & 4) != 0) {
                z = extractionState.needsBlankLine;
            }
            return extractionState.copy(i, i2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getBlockquoteDepth() {
            return this.blockquoteDepth;
        }

        /* renamed from: component2, reason: from getter */
        public final int getListDepth() {
            return this.listDepth;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getNeedsBlankLine() {
            return this.needsBlankLine;
        }

        public final ExtractionState copy(int blockquoteDepth, int listDepth, boolean needsBlankLine) {
            return new ExtractionState(blockquoteDepth, listDepth, needsBlankLine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtractionState)) {
                return false;
            }
            ExtractionState extractionState = (ExtractionState) other;
            return this.blockquoteDepth == extractionState.blockquoteDepth && this.listDepth == extractionState.listDepth && this.needsBlankLine == extractionState.needsBlankLine;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.blockquoteDepth) * 31) + Integer.hashCode(this.listDepth)) * 31) + Boolean.hashCode(this.needsBlankLine);
        }

        public String toString() {
            return "ExtractionState(blockquoteDepth=" + this.blockquoteDepth + ", listDepth=" + this.listDepth + ", needsBlankLine=" + this.needsBlankLine + ")";
        }

        public ExtractionState(int i, int i2, boolean z) {
            this.blockquoteDepth = i;
            this.listDepth = i2;
            this.needsBlankLine = z;
        }

        public /* synthetic */ ExtractionState(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? false : z);
        }

        public final int getBlockquoteDepth() {
            return this.blockquoteDepth;
        }

        public final void setBlockquoteDepth(int i) {
            this.blockquoteDepth = i;
        }

        public final int getListDepth() {
            return this.listDepth;
        }

        public final void setListDepth(int i) {
            this.listDepth = i;
        }

        public final boolean getNeedsBlankLine() {
            return this.needsBlankLine;
        }

        public final void setNeedsBlankLine(boolean z) {
            this.needsBlankLine = z;
        }
    }

    /* compiled from: MarkdownExtractor.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\bj\u0002`\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\bj\u0002`\t2\u0006\u0010\u0010\u001a\u00020\u0011R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/MarkdownExtractor$HeadingAccumulator;", "", "<init>", "()V", "level", "", "Ljava/lang/Integer;", "content", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "accumulate", "", "newLevel", "text", "", "result", "state", "Lcom/swmansion/enriched/markdown/utils/MarkdownExtractor$ExtractionState;", "flush", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class HeadingAccumulator {
        private final StringBuilder content = new StringBuilder();
        private Integer level;

        public final void accumulate(int newLevel, String text, StringBuilder result, ExtractionState state) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(state, "state");
            Integer num = this.level;
            if (num == null || num.intValue() != newLevel) {
                flush(result, state);
                this.level = Integer.valueOf(newLevel);
            }
            this.content.append(StringsKt.trim(text, '\n'));
        }

        public final void flush(StringBuilder result, ExtractionState state) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(state, "state");
            Integer num = this.level;
            if (num != null) {
                int intValue = num.intValue();
                if (this.content.length() == 0) {
                    return;
                }
                MarkdownExtractor.INSTANCE.ensureBlankLine(result);
                result.append(StringsKt.repeat("#", intValue));
                result.append(" ");
                String sb = this.content.toString();
                Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
                result.append(StringsKt.trim((CharSequence) sb).toString());
                result.append("\n");
                this.level = null;
                StringsKt.clear(this.content);
                state.setNeedsBlankLine(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureBlankLine(StringBuilder sb) {
        StringBuilder sb2 = sb;
        if (sb2.length() == 0) {
            return;
        }
        if (StringsKt.endsWith$default((CharSequence) sb2, (CharSequence) "\n\n", false, 2, (Object) null)) {
            return;
        }
        sb.append(StringsKt.endsWith$default((CharSequence) sb2, (CharSequence) "\n", false, 2, (Object) null) ? "\n" : "\n\n");
    }

    private final boolean isAtLineStart(StringBuilder sb) {
        StringBuilder sb2 = sb;
        return sb2.length() == 0 || StringsKt.endsWith$default((CharSequence) sb2, (CharSequence) "\n", false, 2, (Object) null);
    }
}
