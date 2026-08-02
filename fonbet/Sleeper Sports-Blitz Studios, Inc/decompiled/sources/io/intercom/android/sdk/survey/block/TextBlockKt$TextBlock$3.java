package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextBlock.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class TextBlockKt$TextBlock$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Block $block;
    final /* synthetic */ BlockRenderData $blockRenderData;
    final /* synthetic */ BlockRenderTextStyle $blockRenderTextStyle;
    final /* synthetic */ AnnotatedString $finalTextToRender;
    final /* synthetic */ Set<InlineSource> $inlineSources;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<TextLayoutResult, Unit> $onLayoutResult;
    final /* synthetic */ SuffixText $suffixText;
    final /* synthetic */ AnnotatedString $textToRender;

    /* JADX WARN: Multi-variable type inference failed */
    TextBlockKt$TextBlock$3(BlockRenderTextStyle blockRenderTextStyle, BlockRenderData blockRenderData, Block block, Modifier modifier, AnnotatedString annotatedString, SuffixText suffixText, Set<InlineSource> set, AnnotatedString annotatedString2, Function1<? super TextLayoutResult, Unit> function1, MutableState<TextLayoutResult> mutableState) {
        this.$blockRenderTextStyle = blockRenderTextStyle;
        this.$blockRenderData = blockRenderData;
        this.$block = block;
        this.$modifier = modifier;
        this.$textToRender = annotatedString;
        this.$suffixText = suffixText;
        this.$inlineSources = set;
        this.$finalTextToRender = annotatedString2;
        this.$onLayoutResult = function1;
        this.$layoutResult = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long m6049unboximpl;
        int textAlign;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            long m12650getFontSizeXSAIIZE = this.$blockRenderTextStyle.m12650getFontSizeXSAIIZE();
            Color m12654getTextColorQN2ZGVo = this.$blockRenderTextStyle.m12654getTextColorQN2ZGVo();
            if (m12654getTextColorQN2ZGVo == null) {
                m12654getTextColorQN2ZGVo = this.$blockRenderData.m12642getTextColorQN2ZGVo();
            }
            composer.startReplaceGroup(231563533);
            if (m12654getTextColorQN2ZGVo != null) {
                m6049unboximpl = m12654getTextColorQN2ZGVo.m6049unboximpl();
            } else {
                m6049unboximpl = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU();
            }
            long j = m6049unboximpl;
            composer.endReplaceGroup();
            TextAlign m12653getTextAlignbuA522U = this.$blockRenderTextStyle.m12653getTextAlignbuA522U();
            if (m12653getTextAlignbuA522U != null) {
                textAlign = m12653getTextAlignbuA522U.getValue();
            } else {
                BlockAlignment align = this.$block.getAlign();
                Intrinsics.checkNotNullExpressionValue(align, "getAlign(...)");
                textAlign = BlockExtensionsKt.getTextAlign(align);
            }
            long m12651getLineHeightXSAIIZE = this.$blockRenderTextStyle.m12651getLineHeightXSAIIZE();
            FontWeight fontWeight = this.$blockRenderTextStyle.getFontWeight();
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(231575459);
            boolean changed = composer.changed(this.$textToRender) | composer.changed(this.$suffixText);
            final AnnotatedString annotatedString = this.$textToRender;
            final SuffixText suffixText = this.$suffixText;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = TextBlockKt$TextBlock$3.invoke$lambda$1$lambda$0(AnnotatedString.this, suffixText, (SemanticsPropertyReceiver) obj);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null);
            composer.startReplaceGroup(231583295);
            Set<InlineSource> set = this.$inlineSources;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (final InlineSource inlineSource : set) {
                arrayList.add(TuplesKt.to(inlineSource.getDataEntityId(), new InlineTextContent(new Placeholder(TextUnitKt.getEm(1.5d), TextUnitKt.getEm(1.1d), PlaceholderVerticalAlign.INSTANCE.m8136getCenterJ6kI3mc(), null), ComposableLambdaKt.rememberComposableLambda(-1830349960, true, new Function3<String, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer2, Integer num) {
                        invoke(str, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String it, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                            TextBlockKt.m12685InlineSourceBadgeFNF3uiM(InlineSource.this.getDataSourceIndex(), null, 0L, composer2, 0, 6);
                        } else {
                            composer2.skipToGroupEnd();
                        }
                    }
                }, composer, 54))));
                textAlign = textAlign;
                j = j;
            }
            int i2 = textAlign;
            long j2 = j;
            composer.endReplaceGroup();
            Map map = MapsKt.toMap(arrayList);
            AnnotatedString annotatedString2 = this.$finalTextToRender;
            TextAlign m8647boximpl = TextAlign.m8647boximpl(i2);
            composer.startReplaceGroup(231578616);
            boolean changed2 = composer.changed(this.$onLayoutResult);
            final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
            final Function1<TextLayoutResult, Unit> function1 = this.$onLayoutResult;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$4$lambda$3;
                        invoke$lambda$4$lambda$3 = TextBlockKt$TextBlock$3.invoke$lambda$4$lambda$3(MutableState.this, function1, (TextLayoutResult) obj);
                        return invoke$lambda$4$lambda$3;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            TextKt.m3902TextZ58ophY(annotatedString2, semantics$default, j2, null, m12650getFontSizeXSAIIZE, null, fontWeight, null, 0L, null, m8647boximpl, m12651getLineHeightXSAIIZE, 0, false, 0, 0, map, (Function1) rememberedValue2, null, composer, 0, 2097152, 324520);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(AnnotatedString textToRender, SuffixText suffixText, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(textToRender, "$textToRender");
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, ((Object) textToRender) + suffixText.getTtsText());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(MutableState layoutResult, Function1 function1, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(layoutResult, "$layoutResult");
        Intrinsics.checkNotNullParameter(it, "it");
        layoutResult.setValue(it);
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
