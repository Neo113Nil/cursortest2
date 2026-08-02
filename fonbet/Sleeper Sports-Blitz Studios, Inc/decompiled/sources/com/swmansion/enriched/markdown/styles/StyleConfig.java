package com.swmansion.enriched.markdown.styles;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.UserDataStore;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactTypefaceUtils;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StyleConfig.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010R\u001a\u00020SH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0011\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0011\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u0011\u001a\u0004\bB\u0010CR\u001b\u0010E\u001a\u00020F8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0011\u001a\u0004\bG\u0010HR\u001b\u0010J\u001a\u00020K8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\u0011\u001a\u0004\bL\u0010M¨\u0006T"}, d2 = {"Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "", "style", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)V", "styleParser", "Lcom/swmansion/enriched/markdown/styles/StyleParser;", "assets", "Landroid/content/res/AssetManager;", "paragraphStyle", "Lcom/swmansion/enriched/markdown/styles/ParagraphStyle;", "getParagraphStyle", "()Lcom/swmansion/enriched/markdown/styles/ParagraphStyle;", "paragraphStyle$delegate", "Lkotlin/Lazy;", "headingStyles", "", "Lcom/swmansion/enriched/markdown/styles/HeadingStyle;", "getHeadingStyles", "()[Lcom/swmansion/enriched/markdown/styles/HeadingStyle;", "headingStyles$delegate", "headingTypefaces", "Landroid/graphics/Typeface;", "getHeadingTypefaces", "()[Landroid/graphics/Typeface;", "headingTypefaces$delegate", "linkStyle", "Lcom/swmansion/enriched/markdown/styles/LinkStyle;", "getLinkStyle", "()Lcom/swmansion/enriched/markdown/styles/LinkStyle;", "linkStyle$delegate", "strongStyle", "Lcom/swmansion/enriched/markdown/styles/StrongStyle;", "getStrongStyle", "()Lcom/swmansion/enriched/markdown/styles/StrongStyle;", "strongStyle$delegate", "emphasisStyle", "Lcom/swmansion/enriched/markdown/styles/EmphasisStyle;", "getEmphasisStyle", "()Lcom/swmansion/enriched/markdown/styles/EmphasisStyle;", "emphasisStyle$delegate", "codeStyle", "Lcom/swmansion/enriched/markdown/styles/CodeStyle;", "getCodeStyle", "()Lcom/swmansion/enriched/markdown/styles/CodeStyle;", "codeStyle$delegate", "imageStyle", "Lcom/swmansion/enriched/markdown/styles/ImageStyle;", "getImageStyle", "()Lcom/swmansion/enriched/markdown/styles/ImageStyle;", "imageStyle$delegate", "inlineImageStyle", "Lcom/swmansion/enriched/markdown/styles/InlineImageStyle;", "getInlineImageStyle", "()Lcom/swmansion/enriched/markdown/styles/InlineImageStyle;", "inlineImageStyle$delegate", "blockquoteStyle", "Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle;", "getBlockquoteStyle", "()Lcom/swmansion/enriched/markdown/styles/BlockquoteStyle;", "blockquoteStyle$delegate", "listStyle", "Lcom/swmansion/enriched/markdown/styles/ListStyle;", "getListStyle", "()Lcom/swmansion/enriched/markdown/styles/ListStyle;", "listStyle$delegate", "codeBlockStyle", "Lcom/swmansion/enriched/markdown/styles/CodeBlockStyle;", "getCodeBlockStyle", "()Lcom/swmansion/enriched/markdown/styles/CodeBlockStyle;", "codeBlockStyle$delegate", "thematicBreakStyle", "Lcom/swmansion/enriched/markdown/styles/ThematicBreakStyle;", "getThematicBreakStyle", "()Lcom/swmansion/enriched/markdown/styles/ThematicBreakStyle;", "thematicBreakStyle$delegate", "equals", "", "other", "hashCode", "", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StyleConfig {
    private final AssetManager assets;

    /* renamed from: blockquoteStyle$delegate, reason: from kotlin metadata */
    private final Lazy blockquoteStyle;

    /* renamed from: codeBlockStyle$delegate, reason: from kotlin metadata */
    private final Lazy codeBlockStyle;

    /* renamed from: codeStyle$delegate, reason: from kotlin metadata */
    private final Lazy codeStyle;

    /* renamed from: emphasisStyle$delegate, reason: from kotlin metadata */
    private final Lazy emphasisStyle;

    /* renamed from: headingStyles$delegate, reason: from kotlin metadata */
    private final Lazy headingStyles;

    /* renamed from: headingTypefaces$delegate, reason: from kotlin metadata */
    private final Lazy headingTypefaces;

    /* renamed from: imageStyle$delegate, reason: from kotlin metadata */
    private final Lazy imageStyle;

    /* renamed from: inlineImageStyle$delegate, reason: from kotlin metadata */
    private final Lazy inlineImageStyle;

    /* renamed from: linkStyle$delegate, reason: from kotlin metadata */
    private final Lazy linkStyle;

    /* renamed from: listStyle$delegate, reason: from kotlin metadata */
    private final Lazy listStyle;

    /* renamed from: paragraphStyle$delegate, reason: from kotlin metadata */
    private final Lazy paragraphStyle;

    /* renamed from: strongStyle$delegate, reason: from kotlin metadata */
    private final Lazy strongStyle;
    private final ReadableMap style;
    private final StyleParser styleParser;

    /* renamed from: thematicBreakStyle$delegate, reason: from kotlin metadata */
    private final Lazy thematicBreakStyle;

    public StyleConfig(ReadableMap style, Context context) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(context, "context");
        this.style = style;
        this.styleParser = new StyleParser(context);
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        this.assets = assets;
        this.paragraphStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ParagraphStyle paragraphStyle_delegate$lambda$1;
                paragraphStyle_delegate$lambda$1 = StyleConfig.paragraphStyle_delegate$lambda$1(StyleConfig.this);
                return paragraphStyle_delegate$lambda$1;
            }
        });
        this.headingStyles = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HeadingStyle[] headingStyles_delegate$lambda$3;
                headingStyles_delegate$lambda$3 = StyleConfig.headingStyles_delegate$lambda$3(StyleConfig.this);
                return headingStyles_delegate$lambda$3;
            }
        });
        this.headingTypefaces = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Typeface[] headingTypefaces_delegate$lambda$5;
                headingTypefaces_delegate$lambda$5 = StyleConfig.headingTypefaces_delegate$lambda$5(StyleConfig.this);
                return headingTypefaces_delegate$lambda$5;
            }
        });
        this.linkStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LinkStyle linkStyle_delegate$lambda$7;
                linkStyle_delegate$lambda$7 = StyleConfig.linkStyle_delegate$lambda$7(StyleConfig.this);
                return linkStyle_delegate$lambda$7;
            }
        });
        this.strongStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StrongStyle strongStyle_delegate$lambda$9;
                strongStyle_delegate$lambda$9 = StyleConfig.strongStyle_delegate$lambda$9(StyleConfig.this);
                return strongStyle_delegate$lambda$9;
            }
        });
        this.emphasisStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EmphasisStyle emphasisStyle_delegate$lambda$11;
                emphasisStyle_delegate$lambda$11 = StyleConfig.emphasisStyle_delegate$lambda$11(StyleConfig.this);
                return emphasisStyle_delegate$lambda$11;
            }
        });
        this.codeStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CodeStyle codeStyle_delegate$lambda$13;
                codeStyle_delegate$lambda$13 = StyleConfig.codeStyle_delegate$lambda$13(StyleConfig.this);
                return codeStyle_delegate$lambda$13;
            }
        });
        this.imageStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ImageStyle imageStyle_delegate$lambda$15;
                imageStyle_delegate$lambda$15 = StyleConfig.imageStyle_delegate$lambda$15(StyleConfig.this);
                return imageStyle_delegate$lambda$15;
            }
        });
        this.inlineImageStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InlineImageStyle inlineImageStyle_delegate$lambda$17;
                inlineImageStyle_delegate$lambda$17 = StyleConfig.inlineImageStyle_delegate$lambda$17(StyleConfig.this);
                return inlineImageStyle_delegate$lambda$17;
            }
        });
        this.blockquoteStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BlockquoteStyle blockquoteStyle_delegate$lambda$19;
                blockquoteStyle_delegate$lambda$19 = StyleConfig.blockquoteStyle_delegate$lambda$19(StyleConfig.this);
                return blockquoteStyle_delegate$lambda$19;
            }
        });
        this.listStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ListStyle listStyle_delegate$lambda$21;
                listStyle_delegate$lambda$21 = StyleConfig.listStyle_delegate$lambda$21(StyleConfig.this);
                return listStyle_delegate$lambda$21;
            }
        });
        this.codeBlockStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CodeBlockStyle codeBlockStyle_delegate$lambda$23;
                codeBlockStyle_delegate$lambda$23 = StyleConfig.codeBlockStyle_delegate$lambda$23(StyleConfig.this);
                return codeBlockStyle_delegate$lambda$23;
            }
        });
        this.thematicBreakStyle = LazyKt.lazy(new Function0() { // from class: com.swmansion.enriched.markdown.styles.StyleConfig$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ThematicBreakStyle thematicBreakStyle_delegate$lambda$25;
                thematicBreakStyle_delegate$lambda$25 = StyleConfig.thematicBreakStyle_delegate$lambda$25(StyleConfig.this);
                return thematicBreakStyle_delegate$lambda$25;
            }
        });
    }

    public final ParagraphStyle getParagraphStyle() {
        return (ParagraphStyle) this.paragraphStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParagraphStyle paragraphStyle_delegate$lambda$1(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("paragraph");
        if (map == null) {
            throw new IllegalArgumentException("Paragraph style not found. JS should always provide defaults.".toString());
        }
        return ParagraphStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final HeadingStyle[] getHeadingStyles() {
        return (HeadingStyle[]) this.headingStyles.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeadingStyle[] headingStyles_delegate$lambda$3(StyleConfig styleConfig) {
        HeadingStyle fromReadableMap;
        HeadingStyle[] headingStyleArr = new HeadingStyle[7];
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                fromReadableMap = null;
            } else {
                String str = CmcdData.STREAMING_FORMAT_HLS + i;
                ReadableMap map = styleConfig.style.getMap(str);
                if (map == null) {
                    throw new IllegalArgumentException(("Style for " + str + " not found. JS should always provide defaults.").toString());
                }
                fromReadableMap = HeadingStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
            }
            headingStyleArr[i] = fromReadableMap;
        }
        return headingStyleArr;
    }

    public final Typeface[] getHeadingTypefaces() {
        return (Typeface[]) this.headingTypefaces.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface[] headingTypefaces_delegate$lambda$5(StyleConfig styleConfig) {
        String str;
        Typeface[] typefaceArr = new Typeface[7];
        for (int i = 0; i < 7; i++) {
            Typeface typeface = null;
            if (i != 0) {
                HeadingStyle headingStyle = styleConfig.getHeadingStyles()[i];
                if (headingStyle == null || (str = headingStyle.getFontFamily()) == null || str.length() <= 0) {
                    str = null;
                }
                int parseFontWeight = ReactTypefaceUtils.parseFontWeight(headingStyle != null ? headingStyle.getFontWeight() : null);
                if (str != null) {
                    typeface = ReactTypefaceUtils.applyStyles(null, -1, parseFontWeight, str, styleConfig.assets);
                }
            }
            typefaceArr[i] = typeface;
        }
        return typefaceArr;
    }

    public final LinkStyle getLinkStyle() {
        return (LinkStyle) this.linkStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStyle linkStyle_delegate$lambda$7(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("link");
        if (map == null) {
            throw new IllegalArgumentException("Link style not found. JS should always provide defaults.".toString());
        }
        return LinkStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final StrongStyle getStrongStyle() {
        return (StrongStyle) this.strongStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StrongStyle strongStyle_delegate$lambda$9(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("strong");
        if (map == null) {
            throw new IllegalArgumentException("Strong style not found. JS should always provide defaults.".toString());
        }
        return StrongStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final EmphasisStyle getEmphasisStyle() {
        return (EmphasisStyle) this.emphasisStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmphasisStyle emphasisStyle_delegate$lambda$11(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap(UserDataStore.EMAIL);
        if (map == null) {
            throw new IllegalArgumentException("Emphasis style not found. JS should always provide defaults.".toString());
        }
        return EmphasisStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final CodeStyle getCodeStyle() {
        return (CodeStyle) this.codeStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CodeStyle codeStyle_delegate$lambda$13(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("code");
        if (map == null) {
            throw new IllegalArgumentException("Code style not found. JS should always provide defaults.".toString());
        }
        return CodeStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final ImageStyle getImageStyle() {
        return (ImageStyle) this.imageStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageStyle imageStyle_delegate$lambda$15(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("image");
        if (map == null) {
            throw new IllegalArgumentException("Image style not found. JS should always provide defaults.".toString());
        }
        return ImageStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final InlineImageStyle getInlineImageStyle() {
        return (InlineImageStyle) this.inlineImageStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InlineImageStyle inlineImageStyle_delegate$lambda$17(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("inlineImage");
        if (map == null) {
            throw new IllegalArgumentException("InlineImage style not found. JS should always provide defaults.".toString());
        }
        return InlineImageStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final BlockquoteStyle getBlockquoteStyle() {
        return (BlockquoteStyle) this.blockquoteStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockquoteStyle blockquoteStyle_delegate$lambda$19(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("blockquote");
        if (map == null) {
            throw new IllegalArgumentException("Blockquote style not found. JS should always provide defaults.".toString());
        }
        return BlockquoteStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final ListStyle getListStyle() {
        return (ListStyle) this.listStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListStyle listStyle_delegate$lambda$21(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap(AttributeType.LIST);
        if (map == null) {
            throw new IllegalArgumentException("List style not found. JS should always provide defaults.".toString());
        }
        return ListStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final CodeBlockStyle getCodeBlockStyle() {
        return (CodeBlockStyle) this.codeBlockStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CodeBlockStyle codeBlockStyle_delegate$lambda$23(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("codeBlock");
        if (map == null) {
            throw new IllegalArgumentException("CodeBlock style not found. JS should always provide defaults.".toString());
        }
        return CodeBlockStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public final ThematicBreakStyle getThematicBreakStyle() {
        return (ThematicBreakStyle) this.thematicBreakStyle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThematicBreakStyle thematicBreakStyle_delegate$lambda$25(StyleConfig styleConfig) {
        ReadableMap map = styleConfig.style.getMap("thematicBreak");
        if (map == null) {
            throw new IllegalArgumentException("ThematicBreak style not found. JS should always provide defaults.".toString());
        }
        return ThematicBreakStyle.INSTANCE.fromReadableMap(map, styleConfig.styleParser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleConfig)) {
            return false;
        }
        StyleConfig styleConfig = (StyleConfig) other;
        return Intrinsics.areEqual(getParagraphStyle(), styleConfig.getParagraphStyle()) && Arrays.equals(getHeadingStyles(), styleConfig.getHeadingStyles()) && Intrinsics.areEqual(getLinkStyle(), styleConfig.getLinkStyle()) && Intrinsics.areEqual(getStrongStyle(), styleConfig.getStrongStyle()) && Intrinsics.areEqual(getEmphasisStyle(), styleConfig.getEmphasisStyle()) && Intrinsics.areEqual(getCodeStyle(), styleConfig.getCodeStyle()) && Intrinsics.areEqual(getImageStyle(), styleConfig.getImageStyle()) && Intrinsics.areEqual(getInlineImageStyle(), styleConfig.getInlineImageStyle()) && Intrinsics.areEqual(getBlockquoteStyle(), styleConfig.getBlockquoteStyle()) && Intrinsics.areEqual(getListStyle(), styleConfig.getListStyle()) && Intrinsics.areEqual(getCodeBlockStyle(), styleConfig.getCodeBlockStyle()) && Intrinsics.areEqual(getThematicBreakStyle(), styleConfig.getThematicBreakStyle());
    }

    public int hashCode() {
        return (((((((((((((((((((((getParagraphStyle().hashCode() * 31) + Arrays.hashCode(getHeadingStyles())) * 31) + getLinkStyle().hashCode()) * 31) + getStrongStyle().hashCode()) * 31) + getEmphasisStyle().hashCode()) * 31) + getCodeStyle().hashCode()) * 31) + getImageStyle().hashCode()) * 31) + getInlineImageStyle().hashCode()) * 31) + getBlockquoteStyle().hashCode()) * 31) + getListStyle().hashCode()) * 31) + getCodeBlockStyle().hashCode()) * 31) + getThematicBreakStyle().hashCode();
    }
}
