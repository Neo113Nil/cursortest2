package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.text.HtmlCompat;
import androidx.media3.extractor.WavUtil;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: TextBlock.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001ae\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aM\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001b0\u0019*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u001f\u001a<\u0010 \u001a\u00020\u0001*\u00020!2\u0006\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00010\tH\u0002\u001aY\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001b0\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010&\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\u001a\u0010\r\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0001¢\u0006\u0002\u0010'\u001a\u001e\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001b\u0012\u0004\u0012\u00020\u00130\u0019*\u00020\u0013H\u0002\u001a\u0016\u0010)\u001a\u0004\u0018\u00010\u0013*\u00020\u00132\u0006\u0010*\u001a\u00020\u0013H\u0002\u001a\r\u0010,\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u0010.\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u0010/\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u00100\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u00101\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u00102\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u00103\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u00105\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\"\u000e\u0010+\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"TextBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "blockRenderData", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "suffixText", "Lio/intercom/android/sdk/survey/block/SuffixText;", "onLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "inlineSourcesVisible", "", "onInlineSourcesClick", "", "Lio/intercom/android/sdk/models/InlineSource;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/block/BlockRenderData;Lio/intercom/android/sdk/survey/block/SuffixText;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "InlineSourceBadge", "index", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "InlineSourceBadge-FNF3uiM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "textToRender", "Lkotlin/Pair;", "Landroidx/compose/ui/text/AnnotatedString;", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "blockRenderTextStyle", "Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "appendInlineSources", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "text", "sources", "textListToRender", "items", "isOrderedList", "(Ljava/util/List;ZLio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "extractInlineSources", "findAttribute", "name", "formattedText", "TextBlockPreview", "(Landroidx/compose/runtime/Composer;I)V", "TextBlockAlignmentPreview", "HeadingTextBlockPreview", "SubheadingTextBlockPreview", "TextBlockWithSuffixPreview", "OrderedListTextBlockPreview", "UnorderedListTextBlockPreview", "textWithSources", "InlineSourcesTextBlockPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextBlockKt {
    private static final String formattedText = "Hello <b>World</b>. This <i><strike>text</strike>sentence</i> is form<b>att<u>ed</u></b> in simple html. <a href=\"https://github.com/ch4rl3x/HtmlText\">HtmlText</a>";
    private static final List<String> items = CollectionsKt.listOf((Object[]) new String[]{"First item", "Second item with very long text. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", formattedText});
    private static final String textWithSources = "Hello World! This is <a href=\"https://github.com/ch4rl3x/HtmlText\">simple link</a>. And this is source link <a class=\"inline-citation\" data-entity-id=\"111\" data-entity-type=\"article\" data-source-index=\"1\" href=\"https://github.com/ch4rl3x/HtmlText\" title=\"Leaving Elephant Energy\">link here</a> <a class=\"inline-citation\" data-entity-id=\"222\" data-entity-type=\"article\" data-source-index=\"2\" href=\"https://github.com/ch4rl3x/HtmlText\" title=\"Article 2\">link here</a>";

    /* compiled from: TextBlock.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeadingTextBlockPreview$lambda$27(int i, Composer composer, int i2) {
        HeadingTextBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourceBadge_FNF3uiM$lambda$9(String index, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(index, "$index");
        m12685InlineSourceBadgeFNF3uiM(index, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourcesTextBlockPreview$lambda$32(int i, Composer composer, int i2) {
        InlineSourcesTextBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderedListTextBlockPreview$lambda$30(int i, Composer composer, int i2) {
        OrderedListTextBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubheadingTextBlockPreview$lambda$28(int i, Composer composer, int i2) {
        SubheadingTextBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlock$lambda$5(Modifier modifier, BlockRenderData blockRenderData, SuffixText suffixText, Function1 function1, boolean z, Function1 function12, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        TextBlock(modifier, blockRenderData, suffixText, function1, z, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlockAlignmentPreview$lambda$26(int i, Composer composer, int i2) {
        TextBlockAlignmentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlockPreview$lambda$25(int i, Composer composer, int i2) {
        TextBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlockWithSuffixPreview$lambda$29(int i, Composer composer, int i2) {
        TextBlockWithSuffixPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnorderedListTextBlockPreview$lambda$31(int i, Composer composer, int i2) {
        UnorderedListTextBlockPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlock$lambda$0(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextBlock$lambda$1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void TextBlock(Modifier modifier, final BlockRenderData blockRenderData, SuffixText suffixText, Function1<? super TextLayoutResult, Unit> function1, boolean z, Function1<? super List<InlineSource>, Unit> function12, Composer composer, final int i, final int i2) {
        AnnotatedString annotatedString;
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        Composer startRestartGroup = composer.startRestartGroup(-295791429);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        SuffixText no_suffix = (i2 & 4) != 0 ? SuffixText.INSTANCE.getNO_SUFFIX() : suffixText;
        Function1<? super TextLayoutResult, Unit> function13 = (i2 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TextBlock$lambda$0;
                TextBlock$lambda$0 = TextBlockKt.TextBlock$lambda$0((TextLayoutResult) obj);
                return TextBlock$lambda$0;
            }
        } : function1;
        boolean z2 = (i2 & 16) != 0 ? false : z;
        Function1<? super List<InlineSource>, Unit> function14 = (i2 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TextBlock$lambda$1;
                TextBlock$lambda$1 = TextBlockKt.TextBlock$lambda$1((List) obj);
                return TextBlock$lambda$1;
            }
        } : function12;
        Block block = blockRenderData.getBlock();
        BlockRenderTextStyle textStyle = blockRenderData.getTextStyle();
        int i3 = i >> 6;
        Pair<AnnotatedString, Set<InlineSource>> textToRender = textToRender(block, textStyle, z2, function14, startRestartGroup, (i3 & 896) | 8 | (i3 & 7168));
        final boolean z3 = z2;
        final Function1<? super List<InlineSource>, Unit> function15 = function14;
        AnnotatedString component1 = textToRender.component1();
        Set<InlineSource> component2 = textToRender.component2();
        if (Intrinsics.areEqual(no_suffix, SuffixText.INSTANCE.getNO_SUFFIX())) {
            annotatedString = component1;
        } else {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(component1);
            int pushStyle = builder.pushStyle(new SpanStyle(no_suffix.m12682getColor0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null));
            try {
                builder.append(no_suffix.getText());
                Unit unit = Unit.INSTANCE;
                builder.pop(pushStyle);
                annotatedString = builder.toAnnotatedString();
            } catch (Throwable th) {
                builder.pop(pushStyle);
                throw th;
            }
        }
        startRestartGroup.startReplaceGroup(1265159187);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceGroup();
        final Modifier modifier3 = modifier2;
        final SuffixText suffixText2 = no_suffix;
        SelectionContainerKt.DisableSelection(ComposableLambdaKt.rememberComposableLambda(-1368971764, true, new TextBlockKt$TextBlock$3(textStyle, blockRenderData, block, modifier3, component1, suffixText2, component2, annotatedString, function13, (MutableState) rememberedValue), startRestartGroup, 54), startRestartGroup, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1<? super TextLayoutResult, Unit> function16 = function13;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextBlock$lambda$5;
                    TextBlock$lambda$5 = TextBlockKt.TextBlock$lambda$5(Modifier.this, blockRenderData, suffixText2, function16, z3, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TextBlock$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005d  */
    /* renamed from: InlineSourceBadge-FNF3uiM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12685InlineSourceBadgeFNF3uiM(final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        final long j2;
        Modifier.Companion companion;
        boolean z;
        Object rememberedValue;
        int hashCode;
        Composer m5333constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(234500363);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = (startRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        j2 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13120getSourceBackground0d7_KjU();
                        i3 &= -897;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                }
                startRestartGroup.endDefaults();
                z = true;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-1159000328);
                if ((((i3 & 896) ^ 384) > 256 || !startRestartGroup.changed(j2)) && (i3 & 384) != 256) {
                    z = false;
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit InlineSourceBadge_FNF3uiM$lambda$7$lambda$6;
                            InlineSourceBadge_FNF3uiM$lambda$7$lambda$6 = TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(j2, (DrawScope) obj);
                            return InlineSourceBadge_FNF3uiM$lambda$7$lambda$6;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                Modifier drawBehind = DrawModifierKt.drawBehind(fillMaxSize$default, (Function1) rememberedValue);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                composer2 = startRestartGroup;
                TextKt.m3901TextNvy7gAk(str2, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), null, 0L, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 1, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType05(), composer2, (i3 & 14) | 1572864, 24576, 114616);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                modifier3 = companion;
                j3 = j2;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier3 = modifier2;
                j3 = j2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit InlineSourceBadge_FNF3uiM$lambda$9;
                        InlineSourceBadge_FNF3uiM$lambda$9 = TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9(str, modifier3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return InlineSourceBadge_FNF3uiM$lambda$9;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        if ((i3 & 731) == 146) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        startRestartGroup.endDefaults();
        z = true;
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1159000328);
        if (((i3 & 896) ^ 384) > 256) {
        }
        z = false;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit InlineSourceBadge_FNF3uiM$lambda$7$lambda$6;
                InlineSourceBadge_FNF3uiM$lambda$7$lambda$6 = TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(j2, (DrawScope) obj);
                return InlineSourceBadge_FNF3uiM$lambda$7$lambda$6;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier drawBehind2 = DrawModifierKt.drawBehind(fillMaxSize$default2, (Function1) rememberedValue);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        composer2 = startRestartGroup;
        TextKt.m3901TextNvy7gAk(str2, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), null, 0L, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 1, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType05(), composer2, (i3 & 14) | 1572864, 24576, 114616);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        modifier3 = companion;
        j3 = j2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6599drawCircleVaOC9Bg$default(drawBehind, j, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    private static final Pair<AnnotatedString, Set<InlineSource>> textToRender(Block block, BlockRenderTextStyle blockRenderTextStyle, boolean z, Function1<? super List<InlineSource>, Unit> function1, Composer composer, int i) {
        Pair<AnnotatedString, Set<InlineSource>> textListToRender;
        Pair<Set<InlineSource>, String> pair;
        composer.startReplaceGroup(1340770584);
        BlockType type = block.getType();
        int i2 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1598782922);
            List<String> items2 = block.getItems();
            Intrinsics.checkNotNullExpressionValue(items2, "getItems(...)");
            textListToRender = textListToRender(items2, false, blockRenderTextStyle, function1, composer, ((i << 3) & 896) | 56 | (i & 7168));
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-1598776075);
            List<String> items3 = block.getItems();
            Intrinsics.checkNotNullExpressionValue(items3, "getItems(...)");
            textListToRender = textListToRender(items3, true, blockRenderTextStyle, function1, composer, ((i << 3) & 896) | 56 | (i & 7168));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1977764865);
            if (z) {
                String text = block.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                pair = extractInlineSources(text);
            } else {
                pair = TuplesKt.to(SetsKt.emptySet(), block.getText());
            }
            Set<InlineSource> component1 = pair.component1();
            String component2 = pair.component2();
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            Spanned fromHtml = HtmlCompat.fromHtml(component2, 0);
            Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
            Spanned spanned = fromHtml;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Context context = (Context) consume;
            TextDecoration underline = TextDecoration.INSTANCE.getUnderline();
            Color m12652getLinkTextColorQN2ZGVo = blockRenderTextStyle.m12652getLinkTextColorQN2ZGVo();
            AnnotatedString annotatedString = BlockExtensionsKt.toAnnotatedString(spanned, context, new SpanStyle(m12652getLinkTextColorQN2ZGVo != null ? m12652getLinkTextColorQN2ZGVo.m6049unboximpl() : Color.INSTANCE.m6075getUnspecified0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, underline, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null));
            if (z && !component1.isEmpty()) {
                appendInlineSources(builder, annotatedString, component1, function1);
            } else {
                builder.append(annotatedString);
            }
            textListToRender = TuplesKt.to(builder.toAnnotatedString(), component1);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        return textListToRender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendInlineSources(AnnotatedString.Builder builder, AnnotatedString annotatedString, final Set<InlineSource> set, final Function1<? super List<InlineSource>, Unit> function1) {
        int pushLink = builder.pushLink(new LinkAnnotation.Clickable("inline_source", null, new LinkInteractionListener() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda3
            @Override // androidx.compose.ui.text.LinkInteractionListener
            public final void onClick(LinkAnnotation linkAnnotation) {
                TextBlockKt.appendInlineSources$lambda$11(Function1.this, set, linkAnnotation);
            }
        }, 2, null));
        try {
            builder.append(annotatedString);
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                InlineTextContentKt.appendInlineContent$default(builder, ((InlineSource) it.next()).getDataEntityId(), null, 2, null);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            builder.pop(pushLink);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendInlineSources$lambda$11(Function1 onInlineSourcesClick, Set sources, LinkAnnotation it) {
        Intrinsics.checkNotNullParameter(onInlineSourcesClick, "$onInlineSourcesClick");
        Intrinsics.checkNotNullParameter(sources, "$sources");
        Intrinsics.checkNotNullParameter(it, "it");
        onInlineSourcesClick.invoke(CollectionsKt.toList(sources));
    }

    public static final Pair<AnnotatedString, Set<InlineSource>> textListToRender(List<String> items2, boolean z, BlockRenderTextStyle blockRenderTextStyle, Function1<? super List<InlineSource>, Unit> function1, Composer composer, int i) {
        int i2;
        Pair<Set<InlineSource>, String> pair;
        Intrinsics.checkNotNullParameter(items2, "items");
        Intrinsics.checkNotNullParameter(blockRenderTextStyle, "blockRenderTextStyle");
        composer.startReplaceGroup(239669781);
        TextStyle textStyle$intercom_sdk_base_release = blockRenderTextStyle.toTextStyle$intercom_sdk_base_release();
        TextMeasurer rememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, composer, 0, 1);
        composer.startReplaceGroup(1608522809);
        boolean changed = composer.changed(textStyle$intercom_sdk_base_release) | composer.changed(rememberTextMeasurer);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            i2 = 1;
            rememberedValue = IntSize.m8961boximpl(TextMeasurer.m8205measurewNUYSr0$default(rememberTextMeasurer, textListToRender$bullet(z, items2.size()), textStyle$intercom_sdk_base_release, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize());
            composer.updateRememberedValue(rememberedValue);
        } else {
            i2 = 1;
        }
        long m8973unboximpl = ((IntSize) rememberedValue).m8973unboximpl();
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        int i3 = 2023513938;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long mo748toSpkPz2Gy4 = ((Density) consume).mo748toSpkPz2Gy4((int) (m8973unboximpl >> 32));
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ParagraphStyle paragraphStyle = new ParagraphStyle(0, 0, ((Density) consume2).mo748toSpkPz2Gy4((int) (m8973unboximpl & 4294967295L)), new TextIndent(0L, mo748toSpkPz2Gy4, 1, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 499, (DefaultConstructorMarker) null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, i2, null);
        List<String> list = items2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            if (function1 != null) {
                pair = extractInlineSources(str);
            } else {
                pair = TuplesKt.to(SetsKt.emptySet(), str);
            }
            Set<InlineSource> component1 = pair.component1();
            String component2 = pair.component2();
            linkedHashSet.addAll(component1);
            Spanned fromHtml = HtmlCompat.fromHtml(component2, 0);
            Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
            Spanned spanned = fromHtml;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, i3, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Context context = (Context) consume3;
            TextDecoration underline = TextDecoration.INSTANCE.getUnderline();
            Color m12652getLinkTextColorQN2ZGVo = blockRenderTextStyle.m12652getLinkTextColorQN2ZGVo();
            arrayList.add(TuplesKt.to(BlockExtensionsKt.toAnnotatedString(spanned, context, new SpanStyle(m12652getLinkTextColorQN2ZGVo != null ? m12652getLinkTextColorQN2ZGVo.m6049unboximpl() : Color.INSTANCE.m6075getUnspecified0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, underline, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null)), component1));
            i3 = 2023513938;
        }
        int i4 = 0;
        for (Object obj : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair2 = (Pair) obj;
            AnnotatedString annotatedString = (AnnotatedString) pair2.component1();
            Set set = (Set) pair2.component2();
            int pushStyle = builder.pushStyle(paragraphStyle);
            try {
                builder.append(textListToRender$bullet(z, i5));
                int length = String.valueOf(items2.size()).length();
                if (length > i2) {
                    Iterator<Integer> it = RangesKt.until(0, length - String.valueOf(i5).length()).iterator();
                    while (it.hasNext()) {
                        ((IntIterator) it).nextInt();
                        builder.append("\t");
                    }
                }
                if (function1 != null && !set.isEmpty()) {
                    appendInlineSources(builder, annotatedString, set, function1);
                } else {
                    builder.append(annotatedString);
                }
                Unit unit = Unit.INSTANCE;
                builder.pop(pushStyle);
                if (i4 < CollectionsKt.getLastIndex(items2)) {
                    pushStyle = builder.pushStyle(new ParagraphStyle(0, 0, TextUnitKt.getSp(0), (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_Y, (DefaultConstructorMarker) null));
                    try {
                        Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                    }
                }
                i4 = i5;
            } finally {
            }
        }
        Pair<AnnotatedString, Set<InlineSource>> pair3 = TuplesKt.to(builder.toAnnotatedString(), linkedHashSet);
        composer.endReplaceGroup();
        return pair3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String textListToRender$bullet(boolean z, int i) {
        if (z) {
            return i + ".\t\t";
        }
        return "•\t\t";
    }

    private static final Pair<Set<InlineSource>, String> extractInlineSources(String str) {
        String str2;
        String str3;
        List<String> split = new Regex("((?=<a)|(?<=</a>))").split(str, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : split) {
            String str4 = (String) obj;
            if (StringsKt.contains$default((CharSequence) str4, (CharSequence) "<a", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str4, (CharSequence) "</a>", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str4, (CharSequence) "inline-citation", false, 2, (Object) null)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<String> list = (List) pair.component1();
        List list2 = (List) pair.component2();
        ArrayList arrayList3 = new ArrayList();
        for (String str5 : list) {
            String findAttribute = findAttribute(str5, "href");
            String findAttribute2 = findAttribute(str5, "data-entity-id");
            String findAttribute3 = findAttribute(str5, "data-source-index");
            String str6 = findAttribute;
            InlineSource inlineSource = (str6 == null || str6.length() == 0 || (str2 = findAttribute2) == null || str2.length() == 0 || (str3 = findAttribute3) == null || str3.length() == 0) ? null : new InlineSource(findAttribute2, findAttribute(str5, "data-entity-type"), findAttribute3, findAttribute, findAttribute(str5, "title"));
            if (inlineSource != null) {
                arrayList3.add(inlineSource);
            }
        }
        return TuplesKt.to(CollectionsKt.toSet(arrayList3), CollectionsKt.joinToString$default(list2, "", null, null, 0, null, null, 62, null));
    }

    private static final String findAttribute(String str, String str2) {
        Pattern compile = Pattern.compile(str2 + "=\".*?\"", 0);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        Matcher matcher = compile.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group();
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return StringsKt.substringBefore$default(StringsKt.substringAfter$default(group, "\"", (String) null, 2, (Object) null), "\"", (String) null, 2, (Object) null);
    }

    @IntercomPreviews
    public static final void TextBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(443046075);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            final Block build = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formattedText).build();
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-140923183, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlockPreview$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Block block = Block.this;
                        SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(30237398, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlockPreview$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    Block block2 = Block.this;
                                    Intrinsics.checkNotNull(block2);
                                    TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, BlockRenderTextStyle.m12643copyZsBm6Y$default(BlockRenderTextStyle.INSTANCE.getParagraphDefault(), 0L, null, 0L, null, Color.m6029boximpl(Color.INSTANCE.m6066getBlue0d7_KjU()), null, 47, null), 14, null), null, null, false, null, composer3, 64, 61);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextBlockPreview$lambda$25;
                    TextBlockPreview$lambda$25 = TextBlockKt.TextBlockPreview$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextBlockPreview$lambda$25;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TextBlockAlignmentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1235422502);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextBlockKt.INSTANCE.m12668getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextBlockAlignmentPreview$lambda$26;
                    TextBlockAlignmentPreview$lambda$26 = TextBlockKt.TextBlockAlignmentPreview$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextBlockAlignmentPreview$lambda$26;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void HeadingTextBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1066073995);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            final Block build = new Block.Builder().withType(BlockType.HEADING.getSerializedName()).withText("Heading").build();
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(1821427103, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$HeadingTextBlockPreview$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Block block = Block.this;
                        SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1844474362, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$HeadingTextBlockPreview$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Block block2 = Block.this;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, composer3, 64, 61);
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HeadingTextBlockPreview$lambda$27;
                    HeadingTextBlockPreview$lambda$27 = TextBlockKt.HeadingTextBlockPreview$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HeadingTextBlockPreview$lambda$27;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void SubheadingTextBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1598324377);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            final Block build = new Block.Builder().withType(BlockType.SUBHEADING.getSerializedName()).withText("Subheading").build();
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-756436689, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$SubheadingTextBlockPreview$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Block block = Block.this;
                        SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1350311180, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$SubheadingTextBlockPreview$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Block block2 = Block.this;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, composer3, 64, 61);
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubheadingTextBlockPreview$lambda$28;
                    SubheadingTextBlockPreview$lambda$28 = TextBlockKt.SubheadingTextBlockPreview$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SubheadingTextBlockPreview$lambda$28;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TextBlockWithSuffixPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-979323118);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            final Block build = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Paragraph with suffix").build();
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(960883112, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlockWithSuffixPreview$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Block block = Block.this;
                        SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(367008621, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlockWithSuffixPreview$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    Block block2 = Block.this;
                                    Intrinsics.checkNotNull(block2);
                                    TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), new SuffixText("*", "", Color.INSTANCE.m6073getRed0d7_KjU(), null), null, false, null, composer3, 64, 57);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextBlockWithSuffixPreview$lambda$29;
                    TextBlockWithSuffixPreview$lambda$29 = TextBlockKt.TextBlockWithSuffixPreview$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextBlockWithSuffixPreview$lambda$29;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void OrderedListTextBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(627599340);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            final Block build = new Block.Builder().withType(BlockType.ORDEREDLIST.getSerializedName()).withItems(items).build();
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(644450326, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$OrderedListTextBlockPreview$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Block block = Block.this;
                        SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-585789711, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$OrderedListTextBlockPreview$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Block block2 = Block.this;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, composer3, 64, 61);
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OrderedListTextBlockPreview$lambda$30;
                    OrderedListTextBlockPreview$lambda$30 = TextBlockKt.OrderedListTextBlockPreview$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                    return OrderedListTextBlockPreview$lambda$30;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void UnorderedListTextBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-321451131);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            final Block build = new Block.Builder().withType(BlockType.UNORDEREDLIST.getSerializedName()).withItems(items).build();
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1307522769, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$UnorderedListTextBlockPreview$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Block block = Block.this;
                        SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1842775370, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$UnorderedListTextBlockPreview$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Block block2 = Block.this;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, composer3, 64, 61);
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnorderedListTextBlockPreview$lambda$31;
                    UnorderedListTextBlockPreview$lambda$31 = TextBlockKt.UnorderedListTextBlockPreview$lambda$31(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UnorderedListTextBlockPreview$lambda$31;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void InlineSourcesTextBlockPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1209811272);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            final Block build = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(textWithSources).build();
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(2099084386, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$InlineSourcesTextBlockPreview$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Block block = Block.this;
                        SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(954415229, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$InlineSourcesTextBlockPreview$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Block block2 = Block.this;
                                Intrinsics.checkNotNull(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, true, null, composer3, 24640, 45);
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InlineSourcesTextBlockPreview$lambda$32;
                    InlineSourcesTextBlockPreview$lambda$32 = TextBlockKt.InlineSourcesTextBlockPreview$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                    return InlineSourcesTextBlockPreview$lambda$32;
                }
            });
        }
    }
}
