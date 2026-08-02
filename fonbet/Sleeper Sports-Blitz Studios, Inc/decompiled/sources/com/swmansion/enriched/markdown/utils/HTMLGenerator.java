package com.swmansion.enriched.markdown.utils;

import android.text.Spannable;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.braze.models.Banner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.swmansion.enriched.markdown.spans.BlockquoteSpan;
import com.swmansion.enriched.markdown.spans.CodeBlockSpan;
import com.swmansion.enriched.markdown.spans.CodeSpan;
import com.swmansion.enriched.markdown.spans.EmphasisSpan;
import com.swmansion.enriched.markdown.spans.HeadingSpan;
import com.swmansion.enriched.markdown.spans.ImageSpan;
import com.swmansion.enriched.markdown.spans.LinkSpan;
import com.swmansion.enriched.markdown.spans.OrderedListSpan;
import com.swmansion.enriched.markdown.spans.StrongSpan;
import com.swmansion.enriched.markdown.spans.UnorderedListSpan;
import com.swmansion.enriched.markdown.styles.BlockquoteStyle;
import com.swmansion.enriched.markdown.styles.CodeBlockStyle;
import com.swmansion.enriched.markdown.styles.CodeStyle;
import com.swmansion.enriched.markdown.styles.HeadingStyle;
import com.swmansion.enriched.markdown.styles.ImageStyle;
import com.swmansion.enriched.markdown.styles.ListStyle;
import com.swmansion.enriched.markdown.styles.ParagraphStyle;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import io.sentry.ProfilingTraceData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: HTMLGenerator.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003?@AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J4\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002J*\u0010$\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0&2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J4\u0010'\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J4\u0010(\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J4\u0010)\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J,\u0010+\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J$\u0010,\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010-\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\u001c\u0010.\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010 \u001a\u00020!H\u0002J$\u0010/\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J0\u00100\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00103\u001a\u000204H\u0002J,\u00105\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0002JD\u00107\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00103\u001a\u000204H\u0002J \u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001d09j\b\u0012\u0004\u0012\u00020\u001d`:2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010;\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0007H\u0002J \u0010<\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0002J\u001c\u0010=\u001a\u00020\u00182\n\u0010>\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/HTMLGenerator;", "", "<init>", "()V", "OBJECT_REPLACEMENT_CHAR", "", "TYPE_NORMAL", "", "TYPE_H1", "TYPE_H6", "TYPE_CODE_BLOCK", "TYPE_BLOCKQUOTE", "TYPE_ORDERED_LIST", "TYPE_UNORDERED_LIST", "generateHTML", "", "text", "Landroid/text/Spannable;", "style", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "scaledDensity", "", "density", "processParagraph", "", Banner.HTML, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "para", "Lcom/swmansion/enriched/markdown/utils/HTMLGenerator$ParagraphInfo;", "styles", "Lcom/swmansion/enriched/markdown/utils/HTMLGenerator$CachedStyles;", "state", "Lcom/swmansion/enriched/markdown/utils/HTMLGenerator$GeneratorState;", "handleCodeBlock", "content", "outputCodeBlock", "lines", "", "handleBlockquote", "handleList", "handleHeading", "type", "handleNormalParagraph", "closeCodeBlockIfOpen", "closeAllBlockquotes", "closeListsIfOpen", "closeRemainingContainers", "generateInlineHTML", "start", "end", "isCodeBlock", "", "appendImageIfPresent", "pos", "appendStyledSegment", "collectParagraphs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getParagraphType", "getDepthForType", "escapeHTMLTo", AgentOptions.OUTPUT, "CachedStyles", "GeneratorState", "ParagraphInfo", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HTMLGenerator {
    public static final HTMLGenerator INSTANCE = new HTMLGenerator();
    private static final char OBJECT_REPLACEMENT_CHAR = 65532;
    private static final int TYPE_BLOCKQUOTE = 8;
    private static final int TYPE_CODE_BLOCK = 7;
    private static final int TYPE_H1 = 1;
    private static final int TYPE_H6 = 6;
    private static final int TYPE_NORMAL = 0;
    private static final int TYPE_ORDERED_LIST = 9;
    private static final int TYPE_UNORDERED_LIST = 10;

    private HTMLGenerator() {
    }

    /* compiled from: HTMLGenerator.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\b\u0002\u0018\u0000 i2\u00020\u0001:\u0001iB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0018\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u001e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010 \u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\"\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0010R\u0011\u0010$\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010R\u0011\u0010&\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0010R\u0011\u0010(\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0010R\u0011\u0010*\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0010R\u0011\u0010,\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0013R\u0011\u0010.\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0013R\u0011\u00100\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0013R\u0011\u00102\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0013R\u0011\u00104\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0010R\u0011\u00106\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0013R\u0011\u00108\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0013R\u0011\u0010:\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0013R\u0011\u0010<\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0010R\u0011\u0010>\u001a\u00020?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0010R\u0013\u0010D\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0010R\u0011\u0010F\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0013R\u0011\u0010H\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0013R\u0014\u0010J\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0010R\u0014\u0010L\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0010R\u0014\u0010N\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0010R\u0014\u0010P\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0010R\u0014\u0010R\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0010R\u0014\u0010T\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0010R\u0014\u0010V\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0010R\u0014\u0010X\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\u0010R\u0014\u0010Z\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\u0010R\u0011\u0010\\\u001a\u00020]¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0019\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000e0a¢\u0006\n\n\u0002\u0010d\u001a\u0004\bb\u0010cR\u0019\u0010e\u001a\b\u0012\u0004\u0012\u00020\u000e0a¢\u0006\n\n\u0002\u0010d\u001a\u0004\bf\u0010cR\u0011\u0010g\u001a\u00020]¢\u0006\b\n\u0000\u001a\u0004\bh\u0010_¨\u0006j"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/HTMLGenerator$CachedStyles;", "", "style", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "fontDensity", "", "dimDensity", "<init>", "(Lcom/swmansion/enriched/markdown/styles/StyleConfig;FF)V", "fontPx", "", "px", "dimPx", "paragraphColor", "", "getParagraphColor", "()Ljava/lang/String;", "paragraphFontSize", "getParagraphFontSize", "()I", "paragraphMarginBottom", "getParagraphMarginBottom", "codeBlockColor", "getCodeBlockColor", "codeBlockBgColor", "getCodeBlockBgColor", "codeBlockFontSize", "getCodeBlockFontSize", "codeBlockPadding", "getCodeBlockPadding", "codeBlockBorderRadius", "getCodeBlockBorderRadius", "codeBlockMarginBottom", "getCodeBlockMarginBottom", "codeColor", "getCodeColor", "codeBgColor", "getCodeBgColor", "blockquoteColor", "getBlockquoteColor", "blockquoteBgColor", "getBlockquoteBgColor", "blockquoteBorderColor", "getBlockquoteBorderColor", "blockquoteBorderWidth", "getBlockquoteBorderWidth", "blockquoteGapWidth", "getBlockquoteGapWidth", "blockquoteMarginBottom", "getBlockquoteMarginBottom", "blockquoteFontSize", "getBlockquoteFontSize", "listColor", "getListColor", "listFontSize", "getListFontSize", "listMarginBottom", "getListMarginBottom", "listMarginLeft", "getListMarginLeft", "linkColor", "getLinkColor", "linkUnderline", "", "getLinkUnderline", "()Z", "strongColor", "getStrongColor", "emphasisColor", "getEmphasisColor", "imageMarginBottom", "getImageMarginBottom", "imageBorderRadius", "getImageBorderRadius", "blockquotePaddingVertical", "getBlockquotePaddingVertical", "blockquoteBorderRadiusCorners", "getBlockquoteBorderRadiusCorners", "blockquoteNestedMargin", "getBlockquoteNestedMargin", "blockquoteParagraphMargin", "getBlockquoteParagraphMargin", "inlineImageHeight", "getInlineImageHeight", "inlineImageVerticalAlign", "getInlineImageVerticalAlign", "codePadding", "getCodePadding", "codeBorderRadius", "getCodeBorderRadius", "codeFontSize", "getCodeFontSize", "headingFontSizes", "", "getHeadingFontSizes", "()[I", "headingFontWeights", "", "getHeadingFontWeights", "()[Ljava/lang/String;", "[Ljava/lang/String;", "headingColors", "getHeadingColors", "headingMarginBottoms", "getHeadingMarginBottoms", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class CachedStyles {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String blockquoteBgColor;
        private final String blockquoteBorderColor;
        private final String blockquoteBorderRadiusCorners;
        private final int blockquoteBorderWidth;
        private final String blockquoteColor;
        private final int blockquoteFontSize;
        private final int blockquoteGapWidth;
        private final int blockquoteMarginBottom;
        private final String blockquoteNestedMargin;
        private final String blockquotePaddingVertical;
        private final String blockquoteParagraphMargin;
        private final String codeBgColor;
        private final String codeBlockBgColor;
        private final int codeBlockBorderRadius;
        private final String codeBlockColor;
        private final int codeBlockFontSize;
        private final int codeBlockMarginBottom;
        private final int codeBlockPadding;
        private final String codeBorderRadius;
        private final String codeColor;
        private final String codeFontSize;
        private final String codePadding;
        private final float dimDensity;
        private final String emphasisColor;
        private final float fontDensity;
        private final String[] headingColors;
        private final int[] headingFontSizes;
        private final String[] headingFontWeights;
        private final int[] headingMarginBottoms;
        private final int imageBorderRadius;
        private final int imageMarginBottom;
        private final String inlineImageHeight;
        private final String inlineImageVerticalAlign;
        private final String linkColor;
        private final boolean linkUnderline;
        private final String listColor;
        private final int listFontSize;
        private final int listMarginBottom;
        private final int listMarginLeft;
        private final String paragraphColor;
        private final int paragraphFontSize;
        private final int paragraphMarginBottom;
        private final String strongColor;

        public CachedStyles(StyleConfig style, float f, float f2) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.fontDensity = f;
            this.dimDensity = f2;
            this.blockquotePaddingVertical = "8px";
            this.blockquoteBorderRadiusCorners = "0 8px 8px 0";
            this.blockquoteNestedMargin = "8px 0 0 0";
            this.blockquoteParagraphMargin = "0 0 4px 0";
            this.inlineImageHeight = "1.2em";
            this.inlineImageVerticalAlign = "-0.2em";
            this.codePadding = "2px 4px";
            this.codeBorderRadius = "4px";
            this.codeFontSize = "0.7em";
            ParagraphStyle paragraphStyle = style.getParagraphStyle();
            Companion companion = INSTANCE;
            this.paragraphColor = companion.colorToCSS(paragraphStyle.getColor());
            this.paragraphFontSize = fontPx(paragraphStyle.getFontSize());
            this.paragraphMarginBottom = dimPx(paragraphStyle.getMarginBottom());
            CodeBlockStyle codeBlockStyle = style.getCodeBlockStyle();
            this.codeBlockColor = companion.colorToCSS(codeBlockStyle.getColor());
            this.codeBlockBgColor = companion.colorToCSS(codeBlockStyle.getBackgroundColor());
            this.codeBlockFontSize = fontPx(codeBlockStyle.getFontSize());
            this.codeBlockPadding = dimPx(codeBlockStyle.getPadding());
            this.codeBlockBorderRadius = dimPx(codeBlockStyle.getBorderRadius());
            this.codeBlockMarginBottom = dimPx(codeBlockStyle.getMarginBottom());
            CodeStyle codeStyle = style.getCodeStyle();
            this.codeColor = companion.colorToCSS(codeStyle.getColor());
            this.codeBgColor = companion.colorToCSS(codeStyle.getBackgroundColor());
            BlockquoteStyle blockquoteStyle = style.getBlockquoteStyle();
            this.blockquoteColor = companion.colorToCSS(blockquoteStyle.getColor());
            Integer backgroundColor = blockquoteStyle.getBackgroundColor();
            this.blockquoteBgColor = companion.colorToCSS(backgroundColor != null ? backgroundColor.intValue() : 0);
            this.blockquoteBorderColor = companion.colorToCSS(blockquoteStyle.getBorderColor());
            this.blockquoteBorderWidth = dimPx(blockquoteStyle.getBorderWidth());
            this.blockquoteGapWidth = dimPx(blockquoteStyle.getGapWidth());
            this.blockquoteMarginBottom = dimPx(blockquoteStyle.getMarginBottom());
            this.blockquoteFontSize = fontPx(blockquoteStyle.getFontSize());
            ListStyle listStyle = style.getListStyle();
            this.listColor = companion.colorToCSS(listStyle.getColor());
            this.listFontSize = fontPx(listStyle.getFontSize());
            this.listMarginBottom = dimPx(listStyle.getMarginBottom());
            this.listMarginLeft = dimPx(listStyle.getMarginLeft());
            this.linkColor = companion.colorToCSS(style.getLinkStyle().getColor());
            this.linkUnderline = style.getLinkStyle().getUnderline();
            Integer color = style.getStrongStyle().getColor();
            String str = null;
            this.strongColor = (color == null || color.intValue() == 0) ? null : companion.colorToCSS(color.intValue());
            Integer color2 = style.getEmphasisStyle().getColor();
            if (color2 != null && color2.intValue() != 0) {
                str = companion.colorToCSS(color2.intValue());
            }
            this.emphasisColor = str;
            ImageStyle imageStyle = style.getImageStyle();
            this.imageMarginBottom = dimPx(imageStyle.getMarginBottom());
            this.imageBorderRadius = dimPx(imageStyle.getBorderRadius());
            this.headingFontSizes = new int[6];
            String[] strArr = new String[6];
            for (int i = 0; i < 6; i++) {
                strArr[i] = "";
            }
            this.headingFontWeights = strArr;
            String[] strArr2 = new String[6];
            for (int i2 = 0; i2 < 6; i2++) {
                strArr2[i2] = "";
            }
            this.headingColors = strArr2;
            this.headingMarginBottoms = new int[6];
            for (int i3 = 1; i3 < 7; i3++) {
                HeadingStyle headingStyle = style.getHeadingStyles()[i3];
                Intrinsics.checkNotNull(headingStyle);
                int i4 = i3 - 1;
                this.headingFontSizes[i4] = fontPx(headingStyle.getFontSize());
                String[] strArr3 = this.headingFontWeights;
                Companion companion2 = INSTANCE;
                strArr3[i4] = companion2.fontWeightToCSS(headingStyle.getFontWeight());
                this.headingColors[i4] = companion2.colorToCSS(headingStyle.getColor());
                this.headingMarginBottoms[i4] = dimPx(headingStyle.getMarginBottom());
            }
        }

        private final int fontPx(float px) {
            return (int) (px / this.fontDensity);
        }

        private final int dimPx(float px) {
            return (int) (px / this.dimDensity);
        }

        public final String getParagraphColor() {
            return this.paragraphColor;
        }

        public final int getParagraphFontSize() {
            return this.paragraphFontSize;
        }

        public final int getParagraphMarginBottom() {
            return this.paragraphMarginBottom;
        }

        public final String getCodeBlockColor() {
            return this.codeBlockColor;
        }

        public final String getCodeBlockBgColor() {
            return this.codeBlockBgColor;
        }

        public final int getCodeBlockFontSize() {
            return this.codeBlockFontSize;
        }

        public final int getCodeBlockPadding() {
            return this.codeBlockPadding;
        }

        public final int getCodeBlockBorderRadius() {
            return this.codeBlockBorderRadius;
        }

        public final int getCodeBlockMarginBottom() {
            return this.codeBlockMarginBottom;
        }

        public final String getCodeColor() {
            return this.codeColor;
        }

        public final String getCodeBgColor() {
            return this.codeBgColor;
        }

        public final String getBlockquoteColor() {
            return this.blockquoteColor;
        }

        public final String getBlockquoteBgColor() {
            return this.blockquoteBgColor;
        }

        public final String getBlockquoteBorderColor() {
            return this.blockquoteBorderColor;
        }

        public final int getBlockquoteBorderWidth() {
            return this.blockquoteBorderWidth;
        }

        public final int getBlockquoteGapWidth() {
            return this.blockquoteGapWidth;
        }

        public final int getBlockquoteMarginBottom() {
            return this.blockquoteMarginBottom;
        }

        public final int getBlockquoteFontSize() {
            return this.blockquoteFontSize;
        }

        public final String getListColor() {
            return this.listColor;
        }

        public final int getListFontSize() {
            return this.listFontSize;
        }

        public final int getListMarginBottom() {
            return this.listMarginBottom;
        }

        public final int getListMarginLeft() {
            return this.listMarginLeft;
        }

        public final String getLinkColor() {
            return this.linkColor;
        }

        public final boolean getLinkUnderline() {
            return this.linkUnderline;
        }

        public final String getStrongColor() {
            return this.strongColor;
        }

        public final String getEmphasisColor() {
            return this.emphasisColor;
        }

        public final int getImageMarginBottom() {
            return this.imageMarginBottom;
        }

        public final int getImageBorderRadius() {
            return this.imageBorderRadius;
        }

        public final String getBlockquotePaddingVertical() {
            return this.blockquotePaddingVertical;
        }

        public final String getBlockquoteBorderRadiusCorners() {
            return this.blockquoteBorderRadiusCorners;
        }

        public final String getBlockquoteNestedMargin() {
            return this.blockquoteNestedMargin;
        }

        public final String getBlockquoteParagraphMargin() {
            return this.blockquoteParagraphMargin;
        }

        public final String getInlineImageHeight() {
            return this.inlineImageHeight;
        }

        public final String getInlineImageVerticalAlign() {
            return this.inlineImageVerticalAlign;
        }

        public final String getCodePadding() {
            return this.codePadding;
        }

        public final String getCodeBorderRadius() {
            return this.codeBorderRadius;
        }

        public final String getCodeFontSize() {
            return this.codeFontSize;
        }

        public final int[] getHeadingFontSizes() {
            return this.headingFontSizes;
        }

        public final String[] getHeadingFontWeights() {
            return this.headingFontWeights;
        }

        public final String[] getHeadingColors() {
            return this.headingColors;
        }

        public final int[] getHeadingMarginBottoms() {
            return this.headingMarginBottoms;
        }

        /* compiled from: HTMLGenerator.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002¨\u0006\n"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/HTMLGenerator$CachedStyles$Companion;", "", "<init>", "()V", "colorToCSS", "", "color", "", "fontWeightToCSS", "fontWeight", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String colorToCSS(int color) {
                if (color == 0) {
                    return "inherit";
                }
                int i = (color >> 24) & 255;
                int i2 = (color >> 16) & 255;
                int i3 = (color >> 8) & 255;
                int i4 = color & 255;
                if (i < 255) {
                    return "rgba(" + i2 + ", " + i3 + ", " + i4 + ", " + (i / 255.0f) + ")";
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, 3));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String fontWeightToCSS(String fontWeight) {
                return StringsKt.equals(fontWeight, TtmlNode.BOLD, true) ? "700" : StringsKt.equals(fontWeight, "semibold", true) ? "600" : StringsKt.equals(fontWeight, "medium", true) ? "500" : (fontWeight.length() == 0 || StringsKt.equals(fontWeight, ProfilingTraceData.TRUNCATION_REASON_NORMAL, true)) ? ProfilingTraceData.TRUNCATION_REASON_NORMAL : fontWeight;
            }
        }
    }

    /* compiled from: HTMLGenerator.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR!\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000ej\b\u0012\u0004\u0012\u00020\u0005`\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012¨\u0006$"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/HTMLGenerator$GeneratorState;", "", "<init>", "()V", "inCodeBlock", "", "getInCodeBlock", "()Z", "setInCodeBlock", "(Z)V", "previousWasCodeBlock", "getPreviousWasCodeBlock", "setPreviousWasCodeBlock", "codeBlockLines", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getCodeBlockLines", "()Ljava/util/ArrayList;", "inBlockquote", "getInBlockquote", "setInBlockquote", "blockquoteDepth", "", "getBlockquoteDepth", "()I", "setBlockquoteDepth", "(I)V", "previousWasBlockquote", "getPreviousWasBlockquote", "setPreviousWasBlockquote", "listDepth", "getListDepth", "setListDepth", "openListTypes", "getOpenListTypes", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class GeneratorState {
        private boolean inBlockquote;
        private boolean inCodeBlock;
        private boolean previousWasBlockquote;
        private boolean previousWasCodeBlock;
        private final ArrayList<String> codeBlockLines = new ArrayList<>(16);
        private int blockquoteDepth = -1;
        private int listDepth = -1;
        private final ArrayList<Boolean> openListTypes = new ArrayList<>(4);

        public final boolean getInCodeBlock() {
            return this.inCodeBlock;
        }

        public final void setInCodeBlock(boolean z) {
            this.inCodeBlock = z;
        }

        public final boolean getPreviousWasCodeBlock() {
            return this.previousWasCodeBlock;
        }

        public final void setPreviousWasCodeBlock(boolean z) {
            this.previousWasCodeBlock = z;
        }

        public final ArrayList<String> getCodeBlockLines() {
            return this.codeBlockLines;
        }

        public final boolean getInBlockquote() {
            return this.inBlockquote;
        }

        public final void setInBlockquote(boolean z) {
            this.inBlockquote = z;
        }

        public final int getBlockquoteDepth() {
            return this.blockquoteDepth;
        }

        public final void setBlockquoteDepth(int i) {
            this.blockquoteDepth = i;
        }

        public final boolean getPreviousWasBlockquote() {
            return this.previousWasBlockquote;
        }

        public final void setPreviousWasBlockquote(boolean z) {
            this.previousWasBlockquote = z;
        }

        public final int getListDepth() {
            return this.listDepth;
        }

        public final void setListDepth(int i) {
            this.listDepth = i;
        }

        public final ArrayList<Boolean> getOpenListTypes() {
            return this.openListTypes;
        }
    }

    /* compiled from: HTMLGenerator.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/swmansion/enriched/markdown/utils/HTMLGenerator$ParagraphInfo;", "", "start", "", "end", "type", "depth", "<init>", "(IIII)V", "getStart", "()I", "getEnd", "getType", "getDepth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class ParagraphInfo {
        private final int depth;
        private final int end;
        private final int start;
        private final int type;

        public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = paragraphInfo.start;
            }
            if ((i5 & 2) != 0) {
                i2 = paragraphInfo.end;
            }
            if ((i5 & 4) != 0) {
                i3 = paragraphInfo.type;
            }
            if ((i5 & 8) != 0) {
                i4 = paragraphInfo.depth;
            }
            return paragraphInfo.copy(i, i2, i3, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component3, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final int getDepth() {
            return this.depth;
        }

        public final ParagraphInfo copy(int start, int end, int type, int depth) {
            return new ParagraphInfo(start, end, type, depth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParagraphInfo)) {
                return false;
            }
            ParagraphInfo paragraphInfo = (ParagraphInfo) other;
            return this.start == paragraphInfo.start && this.end == paragraphInfo.end && this.type == paragraphInfo.type && this.depth == paragraphInfo.depth;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.depth);
        }

        public String toString() {
            return "ParagraphInfo(start=" + this.start + ", end=" + this.end + ", type=" + this.type + ", depth=" + this.depth + ")";
        }

        public ParagraphInfo(int i, int i2, int i3, int i4) {
            this.start = i;
            this.end = i2;
            this.type = i3;
            this.depth = i4;
        }

        public /* synthetic */ ParagraphInfo(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, (i5 & 8) != 0 ? 0 : i4);
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getType() {
            return this.type;
        }

        public final int getDepth() {
            return this.depth;
        }
    }

    public static /* synthetic */ String generateHTML$default(HTMLGenerator hTMLGenerator, Spannable spannable, StyleConfig styleConfig, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        return hTMLGenerator.generateHTML(spannable, styleConfig, f, f2);
    }

    public final String generateHTML(Spannable text, StyleConfig style, float scaledDensity, float density) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        if (text.length() == 0) {
            return "<html></html>";
        }
        CachedStyles cachedStyles = new CachedStyles(style, scaledDensity, density);
        GeneratorState generatorState = new GeneratorState();
        StringBuilder sb = new StringBuilder(text.length() * 2);
        sb.append("<html>");
        Iterator<ParagraphInfo> it = collectParagraphs(text).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ParagraphInfo next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            processParagraph(sb, text, next, cachedStyles, generatorState);
        }
        closeRemainingContainers(sb, generatorState, cachedStyles);
        sb.append("</html>");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final void processParagraph(StringBuilder html, Spannable text, ParagraphInfo para, CachedStyles styles, GeneratorState state) {
        if (StringsKt.trimEnd(text.subSequence(para.getStart(), para.getEnd()).toString(), '\n').length() == 0 && para.getType() == 0) {
            closeAllBlockquotes(html, state);
            state.setPreviousWasBlockquote(false);
            return;
        }
        String generateInlineHTML = generateInlineHTML(text, para.getStart(), (para.getEnd() <= para.getStart() || text.charAt(para.getEnd() - 1) != '\n') ? para.getEnd() : para.getEnd() - 1, styles, para.getType() == 7);
        int type = para.getType();
        if (type == 7) {
            handleCodeBlock(generateInlineHTML, state);
            return;
        }
        if (type == 8) {
            handleBlockquote(html, generateInlineHTML, para, styles, state);
            return;
        }
        if (type == 9 || type == 10) {
            handleList(html, generateInlineHTML, para, styles, state);
        } else if (1 <= type && type < 7) {
            handleHeading(html, generateInlineHTML, para.getType(), styles, state);
        } else {
            handleNormalParagraph(html, generateInlineHTML, styles, state);
        }
    }

    private final void handleCodeBlock(String content, GeneratorState state) {
        if (!state.getInCodeBlock()) {
            state.setInCodeBlock(true);
            state.getCodeBlockLines().clear();
        }
        state.getCodeBlockLines().add(StringsKt.trimStart((CharSequence) content).toString());
        state.setPreviousWasCodeBlock(true);
        state.setPreviousWasBlockquote(false);
    }

    private final void outputCodeBlock(StringBuilder html, List<String> lines, CachedStyles styles) {
        if (lines.isEmpty()) {
            return;
        }
        html.append("<pre style=\"background-color: ");
        html.append(styles.getCodeBlockBgColor());
        html.append("; padding: ");
        html.append(styles.getCodeBlockPadding());
        html.append("px; border-radius: ");
        html.append(styles.getCodeBlockBorderRadius());
        html.append("px; margin: 0 0 ");
        html.append(styles.getCodeBlockMarginBottom());
        html.append("px 0; overflow-x: auto;\"><code style=\"font-family: Menlo, Monaco, Consolas, monospace; font-size: ");
        html.append(styles.getCodeBlockFontSize());
        html.append("px; color: ");
        html.append(styles.getCodeBlockColor());
        html.append(";\">");
        int size = lines.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                html.append('\n');
            }
            html.append(lines.get(i));
        }
        html.append("</code></pre>");
    }

    private final void handleBlockquote(StringBuilder html, String content, ParagraphInfo para, CachedStyles styles, GeneratorState state) {
        closeCodeBlockIfOpen(html, state, styles);
        int depth = para.getDepth();
        if (!state.getPreviousWasBlockquote() && state.getInBlockquote()) {
            closeAllBlockquotes(html, state);
        }
        while (state.getBlockquoteDepth() > depth) {
            html.append("</blockquote>");
            state.setBlockquoteDepth(state.getBlockquoteDepth() - 1);
        }
        while (state.getBlockquoteDepth() < depth) {
            state.setBlockquoteDepth(state.getBlockquoteDepth() + 1);
            state.setInBlockquote(true);
            if (state.getBlockquoteDepth() == 0) {
                html.append("<blockquote style=\"background-color: ");
                html.append(styles.getBlockquoteBgColor());
                html.append("; border-left: ");
                html.append(styles.getBlockquoteBorderWidth());
                html.append("px solid ");
                html.append(styles.getBlockquoteBorderColor());
                html.append("; padding: ");
                html.append(styles.getBlockquotePaddingVertical());
                html.append(" ");
                html.append(styles.getBlockquoteGapWidth());
                html.append("px; margin: 0 0 ");
                html.append(styles.getBlockquoteMarginBottom());
                html.append("px 0; border-radius: ");
                html.append(styles.getBlockquoteBorderRadiusCorners());
                html.append(";\">");
            } else {
                html.append("<blockquote style=\"border-left: ");
                html.append(styles.getBlockquoteBorderWidth());
                html.append("px solid ");
                html.append(styles.getBlockquoteBorderColor());
                html.append("; padding-left: ");
                html.append(styles.getBlockquoteGapWidth());
                html.append("px; margin: ");
                html.append(styles.getBlockquoteNestedMargin());
                html.append(";\">");
            }
        }
        html.append("<p style=\"margin: ");
        html.append(styles.getBlockquoteParagraphMargin());
        html.append("; color: ");
        html.append(styles.getBlockquoteColor());
        html.append("; font-size: ");
        html.append(styles.getBlockquoteFontSize());
        html.append("px;\">");
        html.append(content);
        html.append("</p>");
        state.setPreviousWasBlockquote(true);
        state.setPreviousWasCodeBlock(false);
    }

    private final void handleList(StringBuilder html, String content, ParagraphInfo para, CachedStyles styles, GeneratorState state) {
        String str;
        closeCodeBlockIfOpen(html, state, styles);
        closeAllBlockquotes(html, state);
        int depth = para.getDepth();
        boolean z = para.getType() == 9;
        while (true) {
            if (state.getListDepth() <= depth) {
                break;
            }
            html.append(Intrinsics.areEqual(CollectionsKt.lastOrNull((List) state.getOpenListTypes()), (Object) true) ? "</ol>" : "</ul>");
            if (!state.getOpenListTypes().isEmpty()) {
                state.getOpenListTypes().remove(CollectionsKt.getLastIndex(state.getOpenListTypes()));
            }
            state.setListDepth(state.getListDepth() - 1);
        }
        if (state.getListDepth() == depth && !state.getOpenListTypes().isEmpty() && ((Boolean) CollectionsKt.last((List) state.getOpenListTypes())).booleanValue() != z) {
            html.append(((Boolean) CollectionsKt.last((List) state.getOpenListTypes())).booleanValue() ? "</ol>" : "</ul>");
            state.getOpenListTypes().remove(CollectionsKt.getLastIndex(state.getOpenListTypes()));
            state.setListDepth(state.getListDepth() - 1);
        }
        while (state.getListDepth() < depth) {
            state.setListDepth(state.getListDepth() + 1);
            if (state.getListDepth() == 0) {
                str = "margin: 0 0 " + styles.getParagraphMarginBottom() + "px 0; ";
            } else {
                str = "margin: 0; ";
            }
            if (z) {
                html.append("<ol style=\"");
                html.append(str);
                html.append("padding-left: ");
                html.append(styles.getListMarginLeft());
                html.append("px;\">");
                state.getOpenListTypes().add(true);
            } else {
                html.append("<ul style=\"");
                html.append(str);
                html.append("padding-left: ");
                html.append(styles.getListMarginLeft());
                html.append("px; list-style-type: disc;\">");
                state.getOpenListTypes().add(false);
            }
        }
        html.append("<li style=\"margin-bottom: ");
        html.append(styles.getListMarginBottom());
        html.append("px; color: ");
        html.append(styles.getListColor());
        html.append("; font-size: ");
        html.append(styles.getListFontSize());
        html.append("px;\">");
        html.append(content);
        html.append("</li>");
        state.setPreviousWasBlockquote(false);
        state.setPreviousWasCodeBlock(false);
    }

    private final void handleHeading(StringBuilder html, String content, int type, CachedStyles styles, GeneratorState state) {
        closeCodeBlockIfOpen(html, state, styles);
        closeAllBlockquotes(html, state);
        closeListsIfOpen(html, state);
        int i = type - 1;
        html.append("<h");
        html.append(type);
        html.append(" style=\"font-size: ");
        html.append(styles.getHeadingFontSizes()[i]);
        html.append("px; font-weight: ");
        html.append(styles.getHeadingFontWeights()[i]);
        html.append("; color: ");
        html.append(styles.getHeadingColors()[i]);
        html.append("; margin: 0 0 ");
        html.append(styles.getHeadingMarginBottoms()[i]);
        html.append("px 0;\">");
        html.append(content);
        html.append("</h");
        html.append(type);
        html.append(Typography.greater);
        state.setPreviousWasBlockquote(false);
        state.setPreviousWasCodeBlock(false);
    }

    private final void handleNormalParagraph(StringBuilder html, String content, CachedStyles styles, GeneratorState state) {
        closeCodeBlockIfOpen(html, state, styles);
        closeAllBlockquotes(html, state);
        closeListsIfOpen(html, state);
        html.append("<p style=\"margin: 0 0 ");
        html.append(styles.getParagraphMarginBottom());
        html.append("px 0; color: ");
        html.append(styles.getParagraphColor());
        html.append("; font-size: ");
        html.append(styles.getParagraphFontSize());
        html.append("px;\">");
        html.append(content);
        html.append("</p>");
        state.setPreviousWasBlockquote(false);
        state.setPreviousWasCodeBlock(false);
    }

    private final void closeCodeBlockIfOpen(StringBuilder html, GeneratorState state, CachedStyles styles) {
        if (state.getInCodeBlock()) {
            state.setInCodeBlock(false);
            outputCodeBlock(html, state.getCodeBlockLines(), styles);
            state.getCodeBlockLines().clear();
        }
    }

    private final void closeAllBlockquotes(StringBuilder html, GeneratorState state) {
        while (state.getBlockquoteDepth() >= 0) {
            html.append("</blockquote>");
            state.setBlockquoteDepth(state.getBlockquoteDepth() - 1);
        }
        state.setInBlockquote(false);
    }

    private final void closeListsIfOpen(StringBuilder html, GeneratorState state) {
        while (!state.getOpenListTypes().isEmpty()) {
            html.append(((Boolean) CollectionsKt.last((List) state.getOpenListTypes())).booleanValue() ? "</ol>" : "</ul>");
            state.getOpenListTypes().remove(CollectionsKt.getLastIndex(state.getOpenListTypes()));
        }
        state.setListDepth(-1);
    }

    private final void closeRemainingContainers(StringBuilder html, GeneratorState state, CachedStyles styles) {
        closeCodeBlockIfOpen(html, state, styles);
        closeAllBlockquotes(html, state);
        closeListsIfOpen(html, state);
    }

    private final String generateInlineHTML(Spannable text, int start, int end, CachedStyles styles, boolean isCodeBlock) {
        Spannable spannable;
        CachedStyles cachedStyles;
        boolean z;
        StringBuilder sb = new StringBuilder((end - start) + 32);
        int i = start;
        while (i < end) {
            char charAt = text.charAt(i);
            if (charAt != '\n' || i != end - 1) {
                if (charAt == 65532) {
                    appendImageIfPresent(sb, text, i, styles);
                } else {
                    int min = Math.min(text.nextSpanTransition(i, end, Object.class), end);
                    String obj = text.subSequence(i, min).toString();
                    if (obj.length() <= 0 || Intrinsics.areEqual(obj, "\n")) {
                        spannable = text;
                        cachedStyles = styles;
                        z = isCodeBlock;
                    } else {
                        spannable = text;
                        cachedStyles = styles;
                        z = isCodeBlock;
                        appendStyledSegment(sb, spannable, i, min, obj, cachedStyles, z);
                    }
                    text = spannable;
                    i = min;
                    styles = cachedStyles;
                    isCodeBlock = z;
                }
            }
            i++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final void appendImageIfPresent(StringBuilder html, Spannable text, int pos, CachedStyles styles) {
        ImageSpan[] imageSpanArr = (ImageSpan[]) text.getSpans(pos, pos + 1, ImageSpan.class);
        Intrinsics.checkNotNull(imageSpanArr);
        if (imageSpanArr.length == 0) {
            return;
        }
        ImageSpan imageSpan = imageSpanArr[0];
        if (imageSpan.getIsInline()) {
            html.append("<img src=\"");
            escapeHTMLTo(html, imageSpan.getImageUrl());
            html.append("\" style=\"height: ");
            html.append(styles.getInlineImageHeight());
            html.append("; width: auto; vertical-align: ");
            html.append(styles.getInlineImageVerticalAlign());
            html.append(";\">");
            return;
        }
        html.append("</p><div style=\"margin-bottom: ");
        html.append(styles.getImageMarginBottom());
        html.append("px;\"><img src=\"");
        escapeHTMLTo(html, imageSpan.getImageUrl());
        html.append("\" style=\"max-width: 100%; border-radius: ");
        html.append(styles.getImageBorderRadius());
        html.append("px;\"></div><p>");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void appendStyledSegment(StringBuilder html, Spannable text, int start, int end, String content, CachedStyles styles, boolean isCodeBlock) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        LinkSpan linkSpan;
        boolean z5;
        StrongSpan[] strongSpanArr = (StrongSpan[]) text.getSpans(start, end, StrongSpan.class);
        StyleSpan[] styleSpanArr = (StyleSpan[]) text.getSpans(start, end, StyleSpan.class);
        EmphasisSpan[] emphasisSpanArr = (EmphasisSpan[]) text.getSpans(start, end, EmphasisSpan.class);
        UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) text.getSpans(start, end, UnderlineSpan.class);
        StrikethroughSpan[] strikethroughSpanArr = (StrikethroughSpan[]) text.getSpans(start, end, StrikethroughSpan.class);
        LinkSpan[] linkSpanArr = (LinkSpan[]) text.getSpans(start, end, LinkSpan.class);
        CodeSpan[] codeSpanArr = (CodeSpan[]) text.getSpans(start, end, CodeSpan.class);
        Intrinsics.checkNotNull(strongSpanArr);
        if (strongSpanArr.length == 0) {
            Intrinsics.checkNotNull(styleSpanArr);
            for (StyleSpan styleSpan : styleSpanArr) {
                if (styleSpan.getStyle() != 1 && styleSpan.getStyle() != 3) {
                }
            }
            z = false;
            Intrinsics.checkNotNull(emphasisSpanArr);
            if (emphasisSpanArr.length != 0) {
                Intrinsics.checkNotNull(styleSpanArr);
                for (StyleSpan styleSpan2 : styleSpanArr) {
                    if (styleSpan2.getStyle() != 2 && styleSpan2.getStyle() != 3) {
                    }
                }
                z2 = false;
                Intrinsics.checkNotNull(underlineSpanArr);
                z3 = underlineSpanArr.length == 0;
                Intrinsics.checkNotNull(strikethroughSpanArr);
                z4 = strikethroughSpanArr.length == 0;
                Intrinsics.checkNotNull(linkSpanArr);
                linkSpan = (LinkSpan) ArraysKt.firstOrNull(linkSpanArr);
                Intrinsics.checkNotNull(codeSpanArr);
                z5 = (codeSpanArr.length == 0) && !isCodeBlock;
                if (linkSpan != null) {
                    html.append("<a href=\"");
                    INSTANCE.escapeHTMLTo(html, linkSpan.getUrl());
                    html.append("\" style=\"color: ");
                    html.append(styles.getLinkColor());
                    html.append("; text-decoration: ");
                    html.append(styles.getLinkUnderline() ? TtmlNode.UNDERLINE : "none");
                    html.append(";\">");
                }
                if (z5) {
                    html.append("<code style=\"background-color: ");
                    html.append(styles.getCodeBgColor());
                    html.append("; color: ");
                    html.append(styles.getCodeColor());
                    html.append("; padding: ");
                    html.append(styles.getCodePadding());
                    html.append("; border-radius: ");
                    html.append(styles.getCodeBorderRadius());
                    html.append("; font-size: ");
                    html.append(styles.getCodeFontSize());
                    html.append("; font-family: Menlo, Monaco, Consolas, monospace;\">");
                }
                if (z) {
                    if (styles.getStrongColor() != null) {
                        html.append("<strong style=\"color: ");
                        html.append(styles.getStrongColor());
                        html.append(";\">");
                    } else {
                        html.append("<strong>");
                    }
                }
                if (z2) {
                    if (styles.getEmphasisColor() != null) {
                        html.append("<em style=\"color: ");
                        html.append(styles.getEmphasisColor());
                        html.append(";\">");
                    } else {
                        html.append("<em>");
                    }
                }
                if (!z4) {
                    html.append("<s>");
                }
                if (!z3 && linkSpan == null) {
                    html.append("<u>");
                }
                escapeHTMLTo(html, StringsKt.trimEnd(content, '\n'));
                if (!z3 && linkSpan == null) {
                    html.append("</u>");
                }
                if (!z4) {
                    html.append("</s>");
                }
                if (z2) {
                    html.append("</em>");
                }
                if (z) {
                    html.append("</strong>");
                }
                if (z5) {
                    html.append("</code>");
                }
                if (linkSpan != null) {
                    html.append("</a>");
                    return;
                }
                return;
            }
            z2 = true;
            Intrinsics.checkNotNull(underlineSpanArr);
            if (underlineSpanArr.length == 0) {
            }
            Intrinsics.checkNotNull(strikethroughSpanArr);
            if (strikethroughSpanArr.length == 0) {
            }
            Intrinsics.checkNotNull(linkSpanArr);
            linkSpan = (LinkSpan) ArraysKt.firstOrNull(linkSpanArr);
            Intrinsics.checkNotNull(codeSpanArr);
            if (codeSpanArr.length == 0) {
            }
            if (linkSpan != null) {
            }
            if (z5) {
            }
            if (z) {
            }
            if (z2) {
            }
            if (!z4) {
            }
            if (!z3) {
                html.append("<u>");
            }
            escapeHTMLTo(html, StringsKt.trimEnd(content, '\n'));
            if (!z3) {
                html.append("</u>");
            }
            if (!z4) {
            }
            if (z2) {
            }
            if (z) {
            }
            if (z5) {
            }
            if (linkSpan != null) {
            }
        }
        z = true;
        Intrinsics.checkNotNull(emphasisSpanArr);
        if (emphasisSpanArr.length != 0) {
        }
        z2 = true;
        Intrinsics.checkNotNull(underlineSpanArr);
        if (underlineSpanArr.length == 0) {
        }
        Intrinsics.checkNotNull(strikethroughSpanArr);
        if (strikethroughSpanArr.length == 0) {
        }
        Intrinsics.checkNotNull(linkSpanArr);
        linkSpan = (LinkSpan) ArraysKt.firstOrNull(linkSpanArr);
        Intrinsics.checkNotNull(codeSpanArr);
        if (codeSpanArr.length == 0) {
        }
        if (linkSpan != null) {
        }
        if (z5) {
        }
        if (z) {
        }
        if (z2) {
        }
        if (!z4) {
        }
        if (!z3) {
        }
        escapeHTMLTo(html, StringsKt.trimEnd(content, '\n'));
        if (!z3) {
        }
        if (!z4) {
        }
        if (z2) {
        }
        if (z) {
        }
        if (z5) {
        }
        if (linkSpan != null) {
        }
    }

    private final ArrayList<ParagraphInfo> collectParagraphs(Spannable text) {
        String obj = text.toString();
        ArrayList<ParagraphInfo> arrayList = new ArrayList<>((obj.length() / 40) + 1);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= obj.length()) {
                return arrayList;
            }
            int indexOf$default = StringsKt.indexOf$default((CharSequence) obj, '\n', i2, false, 4, (Object) null);
            i = indexOf$default == -1 ? obj.length() : indexOf$default + 1;
            int paragraphType = getParagraphType(text, i2);
            arrayList.add(new ParagraphInfo(i2, i, paragraphType, getDepthForType(text, i2, paragraphType)));
        }
    }

    private final int getParagraphType(Spannable text, int start) {
        int min = Math.min(start + 1, text.length());
        Object[] spans = text.getSpans(start, min, CodeBlockSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        if (!(spans.length == 0)) {
            return 7;
        }
        HeadingSpan[] headingSpanArr = (HeadingSpan[]) text.getSpans(start, min, HeadingSpan.class);
        Intrinsics.checkNotNull(headingSpanArr);
        if (!(headingSpanArr.length == 0)) {
            return RangesKt.coerceIn(headingSpanArr[0].getLevel(), 1, 6);
        }
        Object[] spans2 = text.getSpans(start, min, BlockquoteSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans2, "getSpans(...)");
        if (!(spans2.length == 0)) {
            return 8;
        }
        Object[] spans3 = text.getSpans(start, min, OrderedListSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans3, "getSpans(...)");
        if (!(spans3.length == 0)) {
            return 9;
        }
        Object[] spans4 = text.getSpans(start, min, UnorderedListSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans4, "getSpans(...)");
        return !(spans4.length == 0) ? 10 : 0;
    }

    private final int getDepthForType(Spannable text, int start, int type) {
        int i = start + 1;
        Integer num = null;
        int i2 = 1;
        switch (type) {
            case 8:
                Object[] spans = text.getSpans(start, i, BlockquoteSpan.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                if (spans.length != 0) {
                    Integer valueOf = Integer.valueOf(((BlockquoteSpan) spans[0]).getDepth());
                    int lastIndex = ArraysKt.getLastIndex(spans);
                    if (1 <= lastIndex) {
                        while (true) {
                            Integer valueOf2 = Integer.valueOf(((BlockquoteSpan) spans[i2]).getDepth());
                            if (valueOf.compareTo(valueOf2) < 0) {
                                valueOf = valueOf2;
                            }
                            if (i2 != lastIndex) {
                                i2++;
                            }
                        }
                    }
                    num = valueOf;
                }
                Integer num2 = num;
                if (num2 != null) {
                    return num2.intValue();
                }
                return 0;
            case 9:
                Object[] spans2 = text.getSpans(start, i, OrderedListSpan.class);
                Intrinsics.checkNotNullExpressionValue(spans2, "getSpans(...)");
                if (spans2.length != 0) {
                    Integer valueOf3 = Integer.valueOf(((OrderedListSpan) spans2[0]).getDepth());
                    int lastIndex2 = ArraysKt.getLastIndex(spans2);
                    if (1 <= lastIndex2) {
                        while (true) {
                            Integer valueOf4 = Integer.valueOf(((OrderedListSpan) spans2[i2]).getDepth());
                            if (valueOf3.compareTo(valueOf4) < 0) {
                                valueOf3 = valueOf4;
                            }
                            if (i2 != lastIndex2) {
                                i2++;
                            }
                        }
                    }
                    num = valueOf3;
                }
                Integer num3 = num;
                if (num3 != null) {
                    return num3.intValue();
                }
                return 0;
            case 10:
                Object[] spans3 = text.getSpans(start, i, UnorderedListSpan.class);
                Intrinsics.checkNotNullExpressionValue(spans3, "getSpans(...)");
                if (spans3.length != 0) {
                    Integer valueOf5 = Integer.valueOf(((UnorderedListSpan) spans3[0]).getDepth());
                    int lastIndex3 = ArraysKt.getLastIndex(spans3);
                    if (1 <= lastIndex3) {
                        while (true) {
                            Integer valueOf6 = Integer.valueOf(((UnorderedListSpan) spans3[i2]).getDepth());
                            if (valueOf5.compareTo(valueOf6) < 0) {
                                valueOf5 = valueOf6;
                            }
                            if (i2 != lastIndex3) {
                                i2++;
                            }
                        }
                    }
                    num = valueOf5;
                }
                Integer num4 = num;
                if (num4 != null) {
                    return num4.intValue();
                }
                return 0;
            default:
                return 0;
        }
    }

    private final void escapeHTMLTo(StringBuilder output, String text) {
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char charAt = text.charAt(i);
            if (charAt == '\"' || charAt == '<' || charAt == '>' || charAt == '&' || charAt == '\'') {
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt2 = text.charAt(i2);
                    if (charAt2 == '\"') {
                        output.append("&quot;");
                    } else if (charAt2 == '<') {
                        output.append("&lt;");
                    } else if (charAt2 == '>') {
                        output.append("&gt;");
                    } else if (charAt2 == '&') {
                        output.append("&amp;");
                    } else if (charAt2 == '\'') {
                        output.append("&#39;");
                    } else {
                        output.append(charAt2);
                    }
                }
                return;
            }
        }
        output.append(text);
    }
}
