package io.intercom.android.sdk.survey.ui.questiontype.text;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.rnlineargradient.LinearGradientManager;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.IOUtils;
import org.objectweb.asm.Opcodes;

/* compiled from: LongTextQuestion.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"LongTextQuestion", "", "modifier", "Landroidx/compose/ui/Modifier;", "textQuestionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$LongTextQuestionModel;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", LinearGradientManager.PROP_COLORS, "Lio/intercom/android/sdk/survey/SurveyUiColors;", "validationError", "Lio/intercom/android/sdk/survey/ValidationError;", "onImeActionNext", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Lkotlin/ExtensionFunctionType;", "questionHeader", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$LongTextQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/ValidationError;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LongTextPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LongTextQuestionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextPreview$lambda$7(int i, Composer composer, int i2) {
        LongTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextQuestion$lambda$5(Modifier modifier, SurveyData.Step.Question.LongTextQuestionModel textQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, ValidationError validationError, Function1 function1, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(textQuestionModel, "$textQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        Intrinsics.checkNotNullParameter(validationError, "$validationError");
        LongTextQuestion(modifier, textQuestionModel, answer, onAnswer, colors, validationError, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextQuestion$lambda$0(KeyboardActionScope keyboardActionScope) {
        Intrinsics.checkNotNullParameter(keyboardActionScope, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LongTextQuestion(Modifier modifier, final SurveyData.Step.Question.LongTextQuestionModel textQuestionModel, Answer answer, final Function1<? super Answer, Unit> onAnswer, final SurveyUiColors colors, final ValidationError validationError, Function1<? super KeyboardActionScope, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Answer answer2;
        int i4;
        int i5;
        Function1<? super KeyboardActionScope, Unit> function12;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int hashCode;
        Composer m5333constructorimpl;
        int hashCode2;
        Composer m5333constructorimpl2;
        boolean z;
        String placeholder;
        boolean z2;
        Object rememberedValue;
        Composer composer2;
        final Answer answer3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function1<? super KeyboardActionScope, Unit> function13;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(textQuestionModel, "textQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        Composer startRestartGroup = composer.startRestartGroup(977241530);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(textQuestionModel) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            answer2 = answer;
            i3 |= startRestartGroup.changed(answer2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(onAnswer) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(colors) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((458752 & i) == 0) {
                    i4 = startRestartGroup.changed(validationError) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        function22 = function2;
                    } else {
                        function22 = function2;
                        if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        Answer.NoAnswer.InitialNoAnswer initialNoAnswer = i8 == 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer2;
                        Function1<? super KeyboardActionScope, Unit> function14 = i5 == 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit LongTextQuestion$lambda$0;
                                LongTextQuestion$lambda$0 = LongTextQuestionKt.LongTextQuestion$lambda$0((KeyboardActionScope) obj);
                                return LongTextQuestion$lambda$0;
                            }
                        } : function12;
                        Function2<? super Composer, ? super Integer, Unit> m12787getLambda1$intercom_sdk_base_release = i6 == 0 ? ComposableSingletons$LongTextQuestionKt.INSTANCE.m12787getLambda1$intercom_sdk_base_release() : function22;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Modifier modifier4 = modifier2;
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
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                        Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                        }
                        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        m12787getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
                        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
                        startRestartGroup.startReplaceGroup(-497967796);
                        if (textQuestionModel.getPlaceHolderStringRes() == null) {
                            z = false;
                            placeholder = StringResources_androidKt.stringResource(textQuestionModel.getPlaceHolderStringRes().intValue(), startRestartGroup, 0);
                        } else {
                            z = false;
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        startRestartGroup.endReplaceGroup();
                        String answer4 = !(initialNoAnswer instanceof Answer.SingleAnswer) ? ((Answer.SingleAnswer) initialNoAnswer).getAnswer() : "";
                        Color m6029boximpl = ((validationError instanceof ValidationError.ValidationStringError) || (initialNoAnswer instanceof Answer.NoAnswer.InitialNoAnswer)) ? null : Color.m6029boximpl(Color.INSTANCE.m6073getRed0d7_KjU());
                        long m13183getAccessibleColorOnWhiteBackground8_81llA = ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(colors.m12628getButton0d7_KjU());
                        int m8414getDefaulteUduSuo = ImeAction.INSTANCE.m8414getDefaulteUduSuo();
                        int maxLine = textQuestionModel.getMaxLine();
                        float minHeight = textQuestionModel.getMinHeight();
                        startRestartGroup.startReplaceGroup(-497955273);
                        z2 = (i3 & 7168) != 2048 ? true : z;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1;
                                    LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1 = LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(Function1.this, (String) obj);
                                    return LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        TextInputPillKt.m12809TextInputPillg5ZjG94(answer4, placeholder, (Function1) rememberedValue, m6029boximpl, m13183getAccessibleColorOnWhiteBackground8_81llA, maxLine, false, function14, 0, m8414getDefaulteUduSuo, false, null, false, minHeight, startRestartGroup, ((i3 << 3) & 29360128) | 805306368, 6, 6464);
                        Function1<? super KeyboardActionScope, Unit> function15 = function14;
                        startRestartGroup.startReplaceGroup(-497931568);
                        if (textQuestionModel.getCharacterLimit() == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(initialNoAnswer.getLength());
                            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                            sb.append(textQuestionModel.getCharacterLimit());
                            TextKt.m3901TextNvy7gAk(sb.toString(), PaddingKt.m1161paddingqDBjuR0$default(columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), 0.0f, Dp.m8798constructorimpl(4), 0.0f, 0.0f, 13, null), ColorKt.Color(4285756278L), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, 24960, 0, 262120);
                            composer2 = startRestartGroup;
                        } else {
                            composer2 = startRestartGroup;
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        answer3 = initialNoAnswer;
                        function23 = m12787getLambda1$intercom_sdk_base_release;
                        function13 = function15;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        answer3 = answer2;
                        function23 = function22;
                        function13 = function12;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit LongTextQuestion$lambda$5;
                                LongTextQuestion$lambda$5 = LongTextQuestionKt.LongTextQuestion$lambda$5(Modifier.this, textQuestionModel, answer3, onAnswer, colors, validationError, function13, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return LongTextQuestion$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i3 & 23967451) == 4793490) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier42 = modifier2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting()) {
                }
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash3);
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl2.getInserting()) {
                }
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22);
                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                m12787getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
                SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() == null) {
                }
                startRestartGroup.endReplaceGroup();
                if (!(initialNoAnswer instanceof Answer.SingleAnswer)) {
                }
                Color m6029boximpl2 = ((validationError instanceof ValidationError.ValidationStringError) || (initialNoAnswer instanceof Answer.NoAnswer.InitialNoAnswer)) ? null : Color.m6029boximpl(Color.INSTANCE.m6073getRed0d7_KjU());
                long m13183getAccessibleColorOnWhiteBackground8_81llA2 = ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(colors.m12628getButton0d7_KjU());
                int m8414getDefaulteUduSuo2 = ImeAction.INSTANCE.m8414getDefaulteUduSuo();
                int maxLine2 = textQuestionModel.getMaxLine();
                float minHeight2 = textQuestionModel.getMinHeight();
                startRestartGroup.startReplaceGroup(-497955273);
                if ((i3 & 7168) != 2048) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1;
                        LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1 = LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(Function1.this, (String) obj);
                        return LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                TextInputPillKt.m12809TextInputPillg5ZjG94(answer4, placeholder, (Function1) rememberedValue, m6029boximpl2, m13183getAccessibleColorOnWhiteBackground8_81llA2, maxLine2, false, function14, 0, m8414getDefaulteUduSuo2, false, null, false, minHeight2, startRestartGroup, ((i3 << 3) & 29360128) | 805306368, 6, 6464);
                Function1<? super KeyboardActionScope, Unit> function152 = function14;
                startRestartGroup.startReplaceGroup(-497931568);
                if (textQuestionModel.getCharacterLimit() == null) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                answer3 = initialNoAnswer;
                function23 = m12787getLambda1$intercom_sdk_base_release;
                function13 = function152;
                modifier3 = modifier42;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i3 |= i4;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function12 = function1;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i3 & 23967451) == 4793490) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier422 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash32);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl2.getInserting()) {
            }
            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222);
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            m12787getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(-497967796);
            if (textQuestionModel.getPlaceHolderStringRes() == null) {
            }
            startRestartGroup.endReplaceGroup();
            if (!(initialNoAnswer instanceof Answer.SingleAnswer)) {
            }
            Color m6029boximpl22 = ((validationError instanceof ValidationError.ValidationStringError) || (initialNoAnswer instanceof Answer.NoAnswer.InitialNoAnswer)) ? null : Color.m6029boximpl(Color.INSTANCE.m6073getRed0d7_KjU());
            long m13183getAccessibleColorOnWhiteBackground8_81llA22 = ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(colors.m12628getButton0d7_KjU());
            int m8414getDefaulteUduSuo22 = ImeAction.INSTANCE.m8414getDefaulteUduSuo();
            int maxLine22 = textQuestionModel.getMaxLine();
            float minHeight22 = textQuestionModel.getMinHeight();
            startRestartGroup.startReplaceGroup(-497955273);
            if ((i3 & 7168) != 2048) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1;
                    LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1 = LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(Function1.this, (String) obj);
                    return LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            TextInputPillKt.m12809TextInputPillg5ZjG94(answer4, placeholder, (Function1) rememberedValue, m6029boximpl22, m13183getAccessibleColorOnWhiteBackground8_81llA22, maxLine22, false, function14, 0, m8414getDefaulteUduSuo22, false, null, false, minHeight22, startRestartGroup, ((i3 << 3) & 29360128) | 805306368, 6, 6464);
            Function1<? super KeyboardActionScope, Unit> function1522 = function14;
            startRestartGroup.startReplaceGroup(-497931568);
            if (textQuestionModel.getCharacterLimit() == null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            answer3 = initialNoAnswer;
            function23 = m12787getLambda1$intercom_sdk_base_release;
            function13 = function1522;
            modifier3 = modifier422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        answer2 = answer;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i4;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        function12 = function1;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier4222 = modifier2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash322);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion222 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl2.getInserting()) {
        }
        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2222);
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        m12787getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(-497967796);
        if (textQuestionModel.getPlaceHolderStringRes() == null) {
        }
        startRestartGroup.endReplaceGroup();
        if (!(initialNoAnswer instanceof Answer.SingleAnswer)) {
        }
        Color m6029boximpl222 = ((validationError instanceof ValidationError.ValidationStringError) || (initialNoAnswer instanceof Answer.NoAnswer.InitialNoAnswer)) ? null : Color.m6029boximpl(Color.INSTANCE.m6073getRed0d7_KjU());
        long m13183getAccessibleColorOnWhiteBackground8_81llA222 = ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(colors.m12628getButton0d7_KjU());
        int m8414getDefaulteUduSuo222 = ImeAction.INSTANCE.m8414getDefaulteUduSuo();
        int maxLine222 = textQuestionModel.getMaxLine();
        float minHeight222 = textQuestionModel.getMinHeight();
        startRestartGroup.startReplaceGroup(-497955273);
        if ((i3 & 7168) != 2048) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1;
                LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1 = LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(Function1.this, (String) obj);
                return LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        TextInputPillKt.m12809TextInputPillg5ZjG94(answer4, placeholder, (Function1) rememberedValue, m6029boximpl222, m13183getAccessibleColorOnWhiteBackground8_81llA222, maxLine222, false, function14, 0, m8414getDefaulteUduSuo222, false, null, false, minHeight222, startRestartGroup, ((i3 << 3) & 29360128) | 805306368, 6, 6464);
        Function1<? super KeyboardActionScope, Unit> function15222 = function14;
        startRestartGroup.startReplaceGroup(-497931568);
        if (textQuestionModel.getCharacterLimit() == null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        answer3 = initialNoAnswer;
        function23 = m12787getLambda1$intercom_sdk_base_release;
        function13 = function15222;
        modifier3 = modifier4222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(Function1 onAnswer, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() > 0) {
            onAnswer.invoke(new Answer.SingleAnswer(it));
        } else {
            onAnswer.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    public static final void LongTextPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-479343201);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            LongTextQuestion(null, new SurveyData.Step.Question.LongTextQuestionModel(uuid, CollectionsKt.listOf(new Block.Builder().withText("Is this a preview?")), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 2000, 0.0f, 0, null, 448, null), null, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit LongTextPreview$lambda$6;
                    LongTextPreview$lambda$6 = LongTextQuestionKt.LongTextPreview$lambda$6((Answer) obj);
                    return LongTextPreview$lambda$6;
                }
            }, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), ValidationError.NoValidationError.INSTANCE, null, null, startRestartGroup, 199680, Opcodes.MULTIANEWARRAY);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LongTextPreview$lambda$7;
                    LongTextPreview$lambda$7 = LongTextQuestionKt.LongTextPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return LongTextPreview$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextPreview$lambda$6(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
