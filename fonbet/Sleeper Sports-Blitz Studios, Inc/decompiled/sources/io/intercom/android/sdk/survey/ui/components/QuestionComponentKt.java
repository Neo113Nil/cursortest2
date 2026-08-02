package io.intercom.android.sdk.survey.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionComponent.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"QuestionComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentModifier", "questionState", "Lio/intercom/android/sdk/survey/QuestionState;", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "onAnswerUpdated", "Lkotlin/Function1;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "elevation", "Landroidx/compose/ui/unit/Dp;", "questionFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "questionFontSize", "Landroidx/compose/ui/unit/TextUnit;", "onAnswerClick", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "QuestionComponent-lzVJ5Jw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/QuestionState;Lio/intercom/android/sdk/survey/SurveyUiColors;Lkotlin/jvm/functions/Function1;JFLandroidx/compose/ui/text/font/FontWeight;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QuestionComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionComponent_lzVJ5Jw$lambda$3(Modifier modifier, Modifier modifier2, QuestionState questionState, SurveyUiColors surveyUiColors, Function1 onAnswerUpdated, long j, float f, FontWeight fontWeight, long j2, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        m12693QuestionComponentlzVJ5Jw(modifier, modifier2, questionState, surveyUiColors, onAnswerUpdated, j, f, fontWeight, j2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionComponent_lzVJ5Jw$lambda$0(AnswerClickData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: QuestionComponent-lzVJ5Jw, reason: not valid java name */
    public static final void m12693QuestionComponentlzVJ5Jw(Modifier modifier, Modifier modifier2, final QuestionState questionState, SurveyUiColors surveyUiColors, final Function1<? super String, Unit> onAnswerUpdated, long j, float f, FontWeight fontWeight, long j2, Function1<? super AnswerClickData, Unit> function1, Composer composer, final int i, final int i2) {
        final SurveyUiColors surveyUiColors2;
        int i3;
        long j3;
        Intrinsics.checkNotNullParameter(questionState, "questionState");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "onAnswerUpdated");
        Composer startRestartGroup = composer.startRestartGroup(435304450);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Modifier m1157padding3ABfNKs = (i2 & 2) != 0 ? PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)) : modifier2;
        if ((i2 & 8) != 0) {
            surveyUiColors2 = questionState.getSurveyUiColors();
            i3 = i & (-7169);
        } else {
            surveyUiColors2 = surveyUiColors;
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            i3 &= -458753;
            j3 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU();
        } else {
            j3 = j;
        }
        float m8798constructorimpl = (i2 & 64) != 0 ? Dp.m8798constructorimpl(1) : f;
        final FontWeight normal = (i2 & 128) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight;
        long sp = (i2 & 256) != 0 ? TextUnitKt.getSp(16) : j2;
        Function1<? super AnswerClickData, Unit> function12 = (i2 & 512) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit QuestionComponent_lzVJ5Jw$lambda$0;
                QuestionComponent_lzVJ5Jw$lambda$0 = QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$0((AnswerClickData) obj);
                return QuestionComponent_lzVJ5Jw$lambda$0;
            }
        } : function1;
        int i4 = i3;
        final Function1 function13 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit QuestionComponent_lzVJ5Jw$lambda$1;
                QuestionComponent_lzVJ5Jw$lambda$1 = QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$1(QuestionState.this, onAnswerUpdated, (Answer) obj);
                return QuestionComponent_lzVJ5Jw$lambda$1;
            }
        };
        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localSoftwareKeyboardController);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume;
        final Modifier modifier4 = m1157padding3ABfNKs;
        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localFocusManager);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final FocusManager focusManager = (FocusManager) consume2;
        final Function1 function14 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit QuestionComponent_lzVJ5Jw$lambda$2;
                QuestionComponent_lzVJ5Jw$lambda$2 = QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$2(QuestionState.this, onAnswerUpdated, softwareKeyboardController, focusManager, (KeyboardActionScope) obj);
                return QuestionComponent_lzVJ5Jw$lambda$2;
            }
        };
        final Function1<? super AnswerClickData, Unit> function15 = function12;
        final long j4 = sp;
        final ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1322549775, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    List<Block.Builder> title = QuestionState.this.getQuestionModel().getTitle();
                    StringProvider description = QuestionState.this.getQuestionModel().getDescription();
                    boolean isRequired = QuestionState.this.getQuestionModel().getIsRequired();
                    ValidationError validationError = QuestionState.this.getValidationError();
                    FontWeight fontWeight2 = normal;
                    long j5 = j4;
                    SurveyData.Step.Question.QuestionModel questionModel = QuestionState.this.getQuestionModel();
                    SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                    QuestionHeaderComponentKt.m12696QuestionHeadern1tc1qA(title, description, isRequired, validationError, fontWeight2, j5, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, composer2, (StringProvider.$stable << 3) | 8, 64);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54);
        Modifier bringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(modifier3, questionState.getBringIntoViewRequester());
        CardColors m2729cardColorsro_MJ88 = CardDefaults.INSTANCE.m2729cardColorsro_MJ88(j3, 0L, 0L, 0L, startRestartGroup, ((i4 >> 15) & 14) | (CardDefaults.$stable << 12), 14);
        final long j5 = j3;
        final float f2 = m8798constructorimpl;
        final FontWeight fontWeight2 = normal;
        final Modifier modifier5 = modifier3;
        final SurveyUiColors surveyUiColors3 = surveyUiColors2;
        CardKt.Card(bringIntoViewRequester, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), m2729cardColorsro_MJ88, CardDefaults.INSTANCE.m2730cardElevationaqJV_2Y(f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ((i4 >> 18) & 14) | (CardDefaults.$stable << 18), 62), null, ComposableLambdaKt.rememberComposableLambda(2001737844, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Card, Composer composer2, int i5) {
                Composer composer3 = composer2;
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                    final QuestionState questionState2 = QuestionState.this;
                    Modifier modifier6 = modifier4;
                    Function1<Answer, Unit> function16 = function13;
                    SurveyUiColors surveyUiColors4 = surveyUiColors2;
                    Function2<Composer, Integer, Unit> function2 = rememberComposableLambda;
                    Function1<KeyboardActionScope, Unit> function17 = function14;
                    Function1<AnswerClickData, Unit> function18 = function15;
                    final FontWeight fontWeight3 = fontWeight2;
                    final long j6 = j4;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                    Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                    if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                        composer3.startReplaceGroup(1477570659);
                        DropDownQuestionKt.DropDownQuestion(modifier6, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), function16, surveyUiColors4, function2, composer3, 196672, 0);
                        composer3.endReplaceGroup();
                    } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                        composer3.startReplaceGroup(1478010146);
                        ShortTextQuestionKt.ShortTextQuestion(modifier6, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), function16, surveyUiColors4, questionState2.getValidationError(), function17, function2, composer2, 12582912, 0);
                        composer3 = composer2;
                        composer3.endReplaceGroup();
                    } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                        composer3.startReplaceGroup(1478572579);
                        LongTextQuestionKt.LongTextQuestion(modifier6, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), function16, surveyUiColors4, questionState2.getValidationError(), function17, function2, composer2, 12582912, 0);
                        composer3 = composer2;
                        composer3.endReplaceGroup();
                    } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                        composer3.startReplaceGroup(1479135353);
                        NumericRatingQuestionKt.NumericRatingQuestion(modifier6, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), function16, surveyUiColors4, function2, composer3, 196672, 0);
                        composer3.endReplaceGroup();
                    } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        composer3.startReplaceGroup(1479583675);
                        SingleChoiceQuestionKt.SingleChoiceQuestion(modifier6, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), function16, surveyUiColors4, function2, composer3, 196672, 0);
                        composer3.endReplaceGroup();
                    } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                        composer3.startReplaceGroup(1480032183);
                        MultipleChoiceQuestionKt.MultipleChoiceQuestion(modifier6, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), function16, surveyUiColors4, function2, composer3, 196672, 0);
                        composer3.endReplaceGroup();
                    } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                        composer3.startReplaceGroup(1480478490);
                        DatePickerQuestionKt.DatePickerQuestion(modifier6, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), function16, function2, composer2, 24576, 0);
                        composer3 = composer2;
                        composer3.endReplaceGroup();
                    } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                        composer3.startReplaceGroup(1480867695);
                        UploadFileQuestionKt.UploadFileQuestion(modifier6, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), function16, function18, ComposableLambdaKt.rememberComposableLambda(-1590070470, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 11) != 2 || !composer4.getSkipping()) {
                                    UploadFileQuestionHeaderKt.m12772UploadFileQuestionHeaderINMd_9Y(QuestionState.this, fontWeight3, j6, composer4, 8);
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                            }
                        }, composer3, 54), composer3, 196672, 0);
                        composer3.endReplaceGroup();
                    } else if (Intrinsics.areEqual(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                        composer3.startReplaceGroup(1481459516);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1481518571);
                        composer3.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuestionComponent_lzVJ5Jw$lambda$3;
                    QuestionComponent_lzVJ5Jw$lambda$3 = QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3(Modifier.this, modifier4, questionState, surveyUiColors3, onAnswerUpdated, j5, f2, fontWeight2, j4, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return QuestionComponent_lzVJ5Jw$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionComponent_lzVJ5Jw$lambda$1(QuestionState questionState, Function1 onAnswerUpdated, Answer it) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(it, "it");
        questionState.setAnswer(it);
        if (!(questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getQuestionModel() instanceof SurveyData.Step.Question.LongTextQuestionModel)) {
            questionState.validate();
        }
        onAnswerUpdated.invoke(questionState.getQuestionModel().getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionComponent_lzVJ5Jw$lambda$2(QuestionState questionState, Function1 onAnswerUpdated, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, KeyboardActionScope keyboardActionScope) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(keyboardActionScope, "<this>");
        questionState.validate();
        onAnswerUpdated.invoke(questionState.getQuestionModel().getId());
        if (questionState.getValidationError() instanceof ValidationError.NoValidationError) {
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            FocusManager.clearFocus$default(focusManager, false, 1, null);
        }
        return Unit.INSTANCE;
    }
}
