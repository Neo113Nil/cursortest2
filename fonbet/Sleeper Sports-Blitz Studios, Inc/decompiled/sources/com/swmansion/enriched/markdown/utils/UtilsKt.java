package com.swmansion.enriched.markdown.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.margelo.nitro.core.ArrayBuffer$$ExternalSyntheticApiModelOutline0;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.renderer.BlockStyle;
import com.swmansion.enriched.markdown.spans.MarginBottomSpan;
import com.swmansion.enriched.markdown.styles.ParagraphStyle;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\n\u0010\u0006\u001a\u00020\u0007\"\u00020\u0001\u001a\u001a\u0010\r\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0014\u001a\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\n\u0010\u001c\u001a\u00020\u0013*\u00020\u001d\u001a\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016\u001a\u001e\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"SPAN_FLAGS_EXCLUSIVE_EXCLUSIVE", "", "applyColorPreserving", "", "Landroid/text/TextPaint;", "color", "preserveColors", "", "typefaceCache", "", "", "Landroid/graphics/Typeface;", "fontWeightCache", "applyBlockStyleFont", "blockStyle", "Lcom/swmansion/enriched/markdown/renderer/BlockStyle;", "context", "Landroid/content/Context;", "containsBlockImage", "", "Lcom/swmansion/enriched/markdown/parser/MarkdownASTNode;", "getMarginBottomForParagraph", "", "paragraph", "paragraphStyle", "Lcom/swmansion/enriched/markdown/styles/ParagraphStyle;", "style", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "isInlineImage", "Landroid/text/SpannableStringBuilder;", "createLineHeightSpan", "Landroid/text/style/LineHeightSpan;", ViewProps.LINE_HEIGHT, "applyMarginBottom", "builder", "start", ViewProps.MARGIN_BOTTOM, "react-native-enriched-markdown_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UtilsKt {
    public static final int SPAN_FLAGS_EXCLUSIVE_EXCLUSIVE = 33;
    private static final Map<String, Typeface> typefaceCache = new LinkedHashMap();
    private static final Map<String, Integer> fontWeightCache = new LinkedHashMap();

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarkdownASTNode.NodeType.values().length];
            try {
                iArr[MarkdownASTNode.NodeType.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyColorPreserving(TextPaint textPaint, int i, int... preserveColors) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Intrinsics.checkNotNullParameter(preserveColors, "preserveColors");
        if (ArraysKt.contains(preserveColors, textPaint.getColor())) {
            return;
        }
        textPaint.setColor(i);
    }

    public static final void applyBlockStyleFont(TextPaint textPaint, BlockStyle blockStyle, Context context) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = blockStyle.getFontFamily() + "|" + blockStyle.getFontWeight();
        Map<String, Typeface> map = typefaceCache;
        Typeface typeface = map.get(str);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
            return;
        }
        Map<String, Integer> map2 = fontWeightCache;
        String fontWeight = blockStyle.getFontWeight();
        Integer num = map2.get(fontWeight);
        if (num == null) {
            num = Integer.valueOf(ReactTypefaceUtils.parseFontWeight(blockStyle.getFontWeight()));
            map2.put(fontWeight, num);
        }
        int intValue = num.intValue();
        String fontFamily = blockStyle.getFontFamily();
        if (fontFamily.length() <= 0) {
            fontFamily = null;
        }
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        Typeface applyStyles = ReactTypefaceUtils.applyStyles(null, -1, intValue, fontFamily, assets);
        map.put(str, applyStyles);
        textPaint.setTypeface(applyStyles);
    }

    public static final boolean containsBlockImage(MarkdownASTNode markdownASTNode) {
        MarkdownASTNode markdownASTNode2;
        Intrinsics.checkNotNullParameter(markdownASTNode, "<this>");
        return markdownASTNode.getType() == MarkdownASTNode.NodeType.Paragraph && (markdownASTNode2 = (MarkdownASTNode) CollectionsKt.firstOrNull((List) markdownASTNode.getChildren())) != null && markdownASTNode.getChildren().size() == 1 && markdownASTNode2.getType() == MarkdownASTNode.NodeType.Image;
    }

    public static final float getMarginBottomForParagraph(MarkdownASTNode paragraph, ParagraphStyle paragraphStyle, StyleConfig style) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        Intrinsics.checkNotNullParameter(style, "style");
        if (paragraph.getChildren().size() == 1) {
            if (WhenMappings.$EnumSwitchMapping$0[((MarkdownASTNode) CollectionsKt.first((List) paragraph.getChildren())).getType().ordinal()] == 1) {
                return style.getImageStyle().getMarginBottom();
            }
        }
        return paragraphStyle.getMarginBottom();
    }

    public static final boolean isInlineImage(SpannableStringBuilder spannableStringBuilder) {
        char last;
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        return (spannableStringBuilder2.length() == 0 || (last = StringsKt.last(spannableStringBuilder2)) == '\n' || last == 8203) ? false : true;
    }

    public static final LineHeightSpan createLineHeightSpan(float f) {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayBuffer$$ExternalSyntheticApiModelOutline0.m11393m();
            return ArrayBuffer$$ExternalSyntheticApiModelOutline0.m11389m((int) f);
        }
        return new com.swmansion.enriched.markdown.spans.LineHeightSpan(f);
    }

    public static final void applyMarginBottom(SpannableStringBuilder builder, int i, float f) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append("\n");
        if (f > 0.0f) {
            builder.setSpan(new MarginBottomSpan(f), i, builder.length(), 33);
        }
    }
}
