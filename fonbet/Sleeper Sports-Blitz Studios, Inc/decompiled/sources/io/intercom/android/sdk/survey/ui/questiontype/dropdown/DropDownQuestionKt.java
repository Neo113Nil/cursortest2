package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.rnlineargradient.LinearGradientManager;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DropDownQuestion.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"DropDownQuestion", "", "modifier", "Landroidx/compose/ui/Modifier;", "dropDownQuestionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DropDownQuestionModel;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", LinearGradientManager.PROP_COLORS, "Lio/intercom/android/sdk/survey/SurveyUiColors;", "questionHeader", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DropDownQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/survey/SurveyUiColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DropDownQuestionPreview", "(Landroidx/compose/runtime/Composer;I)V", "DropDownSelectedQuestionPreview", "ColoredDropDownSelectedQuestionPreview", "intercom-sdk-base_release", "expanded", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DropDownQuestionKt {
    private static final SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColoredDropDownSelectedQuestionPreview$lambda$14(int i, Composer composer, int i2) {
        ColoredDropDownSelectedQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownQuestion$lambda$11(Modifier modifier, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, Function1 onAnswer, SurveyUiColors colors, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(dropDownQuestionModel2, "$dropDownQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        DropDownQuestion(modifier, dropDownQuestionModel2, answer, onAnswer, colors, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownQuestionPreview$lambda$12(int i, Composer composer, int i2) {
        DropDownQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownSelectedQuestionPreview$lambda$13(int i, Composer composer, int i2) {
        DropDownSelectedQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DropDownQuestion(Modifier modifier, final SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, final Function1<? super Answer, Unit> onAnswer, final SurveyUiColors colors, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        String placeholder;
        Intrinsics.checkNotNullParameter(dropDownQuestionModel2, "dropDownQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(1475245134);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final Answer answer2 = (i2 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        Function2<? super Composer, ? super Integer, Unit> m12738getLambda1$intercom_sdk_base_release = (i2 & 32) != 0 ? ComposableSingletons$DropDownQuestionKt.INSTANCE.m12738getLambda1$intercom_sdk_base_release() : function2;
        startRestartGroup.startReplaceGroup(1842846242);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        boolean z = DropDownQuestion$lambda$1(mutableState) || !(answer2 instanceof Answer.NoAnswer);
        startRestartGroup.startReplaceGroup(1842850021);
        long m12628getButton0d7_KjU = z ? colors.m12628getButton0d7_KjU() : IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU();
        startRestartGroup.endReplaceGroup();
        long m13180generateTextColor8_81llA = z ? ColorExtensionsKt.m13180generateTextColor8_81llA(colors.m12628getButton0d7_KjU()) : ColorKt.Color(4285756278L);
        long m6038copywmQWz5c$default = Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        float m8798constructorimpl = Dp.m8798constructorimpl(1);
        Color m12630getDropDownSelectedColorQN2ZGVo = colors.m12630getDropDownSelectedColorQN2ZGVo();
        long m6049unboximpl = m12630getDropDownSelectedColorQN2ZGVo != null ? m12630getDropDownSelectedColorQN2ZGVo.m6049unboximpl() : m13180generateTextColor8_81llA;
        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localFocusManager);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FocusManager focusManager = (FocusManager) consume;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        long j = m13180generateTextColor8_81llA;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
        final Modifier modifier3 = modifier2;
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        m12738getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i >> 15) & 14));
        float f = 8;
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), startRestartGroup, 6);
        final Function2<? super Composer, ? super Integer, Unit> function22 = m12738getLambda1$intercom_sdk_base_release;
        Modifier clip = ClipKt.clip(BorderKt.m594borderxT4_qwU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m8798constructorimpl, m6038copywmQWz5c$default, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, clip);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl3 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
            m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
            m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
        }
        Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier m582backgroundbw27NRU$default = BackgroundKt.m582backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m12628getButton0d7_KjU, null, 2, null);
        startRestartGroup.startReplaceGroup(-585752368);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3;
                    DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3 = DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3(MutableState.this);
                    return DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceGroup();
        Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(m582backgroundbw27NRU$default, false, null, null, null, (Function0) rememberedValue2, 15, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m623clickableoSLSa3U$default);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor4);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl4 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl4.getInserting() || !Intrinsics.areEqual(m5333constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
            m5333constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
            m5333constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
        }
        Updater.m5340setimpl(m5333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(602811226);
        if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
            placeholder = StringResources_androidKt.stringResource(dropDownQuestionModel2.getPlaceHolderStringRes().intValue(), startRestartGroup, 0);
        } else {
            placeholder = dropDownQuestionModel2.getPlaceholder();
        }
        startRestartGroup.endReplaceGroup();
        if (answer2 instanceof Answer.SingleAnswer) {
            placeholder = ((Answer.SingleAnswer) answer2).getAnswer();
        }
        float f2 = 16;
        TextKt.m3901TextNvy7gAk(placeholder, SizeKt.wrapContentSize$default(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), null, false, 3, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m8245copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, 48, 0, 131068);
        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_down_arrow, startRestartGroup, 0), StringResources_androidKt.stringResource(io.intercom.android.sdk.R.string.intercom_choose_one, startRestartGroup, 0), PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), m6049unboximpl, startRestartGroup, 392, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        boolean DropDownQuestion$lambda$1 = DropDownQuestion$lambda$1(mutableState);
        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f);
        long m13094getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU();
        CornerBasedShape small = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
        float m8798constructorimpl2 = Dp.m8798constructorimpl(f);
        startRestartGroup.startReplaceGroup(-585710671);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6;
                    DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6 = DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(MutableState.this);
                    return DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceGroup();
        AndroidMenu_androidKt.m2625DropdownMenuIlH_yew(DropDownQuestion$lambda$1, (Function0) rememberedValue3, fillMaxWidth, 0L, null, null, small, m13094getBackground0d7_KjU, 0.0f, m8798constructorimpl2, null, ComposableLambdaKt.rememberComposableLambda(17506981, true, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(dropDownQuestionModel2, focusManager, onAnswer, mutableState), startRestartGroup, 54), startRestartGroup, 805306800, 48, 1336);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropDownQuestion$lambda$11;
                    DropDownQuestion$lambda$11 = DropDownQuestionKt.DropDownQuestion$lambda$11(Modifier.this, dropDownQuestionModel2, answer2, onAnswer, colors, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DropDownQuestion$lambda$11;
                }
            });
        }
    }

    private static final boolean DropDownQuestion$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DropDownQuestion$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3(MutableState expanded$delegate) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        DropDownQuestion$lambda$2(expanded$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(MutableState expanded$delegate) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        DropDownQuestion$lambda$2(expanded$delegate, false);
        return Unit.INSTANCE;
    }

    static {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        dropDownQuestionModel = new SurveyData.Step.Question.DropDownQuestionModel(uuid, CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Is this a preview?")), true, CollectionsKt.listOf((Object[]) new String[]{"Option A", "Option B", "Option C"}), "Please Select", null, 32, null);
    }

    public static final void DropDownQuestionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(281876673);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m12739getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropDownQuestionPreview$lambda$12;
                    DropDownQuestionPreview$lambda$12 = DropDownQuestionKt.DropDownQuestionPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DropDownQuestionPreview$lambda$12;
                }
            });
        }
    }

    public static final void DropDownSelectedQuestionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-891294020);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m12740getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropDownSelectedQuestionPreview$lambda$13;
                    DropDownSelectedQuestionPreview$lambda$13 = DropDownQuestionKt.DropDownSelectedQuestionPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DropDownSelectedQuestionPreview$lambda$13;
                }
            });
        }
    }

    public static final void ColoredDropDownSelectedQuestionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2103500414);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m12741getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ColoredDropDownSelectedQuestionPreview$lambda$14;
                    ColoredDropDownSelectedQuestionPreview$lambda$14 = DropDownQuestionKt.ColoredDropDownSelectedQuestionPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ColoredDropDownSelectedQuestionPreview$lambda$14;
                }
            });
        }
    }
}
