package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SurveyComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SurveyComponentKt$SurveyContent$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Function1<String, Unit> $onAnswerUpdated;
    final /* synthetic */ Function1<CoroutineScope, Unit> $onContinue;
    final /* synthetic */ Function1<SurveyState.Content.SecondaryCta, Unit> $onSecondaryCtaClicked;
    final /* synthetic */ SurveyState.Content $state;

    /* JADX WARN: Multi-variable type inference failed */
    SurveyComponentKt$SurveyContent$1(SurveyState.Content content, Function1<? super SurveyState.Content.SecondaryCta, Unit> function1, Function1<? super String, Unit> function12, Function1<? super CoroutineScope, Unit> function13, CoroutineScope coroutineScope) {
        this.$state = content;
        this.$onSecondaryCtaClicked = function1;
        this.$onAnswerUpdated = function12;
        this.$onContinue = function13;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        String stringResource;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((((i & 14) == 0 ? i | (composer.changed(BoxWithConstraints) ? 4 : 2) : i) & 91) != 18 || !composer.getSkipping()) {
            float mo1044getMaxHeightD9Ej5fM = BoxWithConstraints.mo1044getMaxHeightD9Ej5fM();
            ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
            composer.startReplaceGroup(1705494839);
            boolean changed = composer.changed(rememberScrollState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new SurveyComponentKt$SurveyContent$1$1$1(rememberScrollState, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect("", (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer, 70);
            float f = 16;
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m1159paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(f), 0.0f, 2, null), rememberScrollState, true, null, false, 12, null);
            SurveyState.Content content = this.$state;
            Function1<SurveyState.Content.SecondaryCta, Unit> function1 = this.$onSecondaryCtaClicked;
            Function1<String, Unit> function12 = this.$onAnswerUpdated;
            Function1<CoroutineScope, Unit> function13 = this.$onContinue;
            CoroutineScope coroutineScope = this.$coroutineScope;
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer);
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), composer, 6);
            float m8798constructorimpl = Dp.m8798constructorimpl(mo1044getMaxHeightD9Ej5fM - Dp.m8798constructorimpl(96));
            int size = content.getSecondaryCtaActions().size();
            for (int i2 = 0; i2 < size; i2++) {
                m8798constructorimpl = Dp.m8798constructorimpl(m8798constructorimpl - Dp.m8798constructorimpl(64));
            }
            Modifier m1194defaultMinSizeVpY3zN4$default = SizeKt.m1194defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, m8798constructorimpl, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            boolean z = false;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1194defaultMinSizeVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer);
            Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(412604363);
            List<Block.Builder> stepTitle = content.getStepTitle();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stepTitle, 10));
            Iterator<T> it = stepTitle.iterator();
            while (it.hasNext()) {
                arrayList.add(((Block.Builder) it.next()).build());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Block block = (Block) it2.next();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Intrinsics.checkNotNull(block);
                BlockViewKt.BlockView(fillMaxWidth$default, new BlockRenderData(block, Color.m6029boximpl(content.getSurveyUiColors().m12631getOnBackground0d7_KjU()), null, null, null, 28, null), false, null, false, null, null, null, null, false, null, null, composer, 70, 0, 4092);
                it2 = it2;
                content = content;
                function1 = function1;
                function12 = function12;
                f = f;
                function13 = function13;
                coroutineScope = coroutineScope;
                z = false;
            }
            SurveyState.Content content2 = content;
            Function1<SurveyState.Content.SecondaryCta, Unit> function14 = function1;
            Function1<String, Unit> function15 = function12;
            final Function1<CoroutineScope, Unit> function16 = function13;
            final CoroutineScope coroutineScope2 = coroutineScope;
            float f2 = f;
            composer.endReplaceGroup();
            float f3 = 8;
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f3)), composer, 6);
            composer.startReplaceGroup(412619710);
            int i3 = 0;
            for (Object obj : content2.getQuestions()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                final CharSequence format = Phrase.from((Context) consume, R.string.intercom_surveys_question_question_number_of_question_count).put("questioin_number", i4).put("question_count", content2.getQuestions().size()).format();
                QuestionComponentKt.m12693QuestionComponentlzVJ5Jw(PaddingKt.m1159paddingVpY3zN4$default(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invoke$lambda$8$lambda$6$lambda$5$lambda$4;
                        invoke$lambda$8$lambda$6$lambda$5$lambda$4 = SurveyComponentKt$SurveyContent$1.invoke$lambda$8$lambda$6$lambda$5$lambda$4(format, (SemanticsPropertyReceiver) obj2);
                        return invoke$lambda$8$lambda$6$lambda$5$lambda$4;
                    }
                }), 0.0f, Dp.m8798constructorimpl(f3), 1, null), null, (QuestionState) obj, null, function15, 0L, 0.0f, null, 0L, null, composer, 512, 1002);
                i3 = i4;
                f3 = f3;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f3)), composer, 6);
            SurveyState.Content.PrimaryCta primaryCta = content2.getPrimaryCta();
            composer.startReplaceGroup(-1140607254);
            if (primaryCta instanceof SurveyState.Content.PrimaryCta.Custom) {
                stringResource = ((SurveyState.Content.PrimaryCta.Custom) primaryCta).getText();
            } else {
                if (!(primaryCta instanceof SurveyState.Content.PrimaryCta.Fallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResource = StringResources_androidKt.stringResource(((SurveyState.Content.PrimaryCta.Fallback) primaryCta).getFallbackTextRes(), composer, 0);
            }
            String str = stringResource;
            composer.endReplaceGroup();
            SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(null, str, content2.getSecondaryCtaActions(), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyContent$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = SurveyComponentKt$SurveyContent$1.invoke$lambda$8$lambda$7(Function1.this, coroutineScope2);
                    return invoke$lambda$8$lambda$7;
                }
            }, function14, content2.getSurveyUiColors(), composer, 512, 1);
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$6$lambda$5$lambda$4(CharSequence charSequence, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, charSequence.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(Function1 onContinue, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(onContinue, "$onContinue");
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        onContinue.invoke(coroutineScope);
        return Unit.INSTANCE;
    }
}
