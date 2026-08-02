package io.intercom.android.sdk.survey.ui.questiontype.text;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.rnlineargradient.LinearGradientManager;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.io.IOUtils;
import org.slf4j.Marker;

/* compiled from: ShortTextQuestion.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u001a"}, d2 = {"ShortTextQuestion", "", "modifier", "Landroidx/compose/ui/Modifier;", "textQuestionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$ShortTextQuestionModel;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", LinearGradientManager.PROP_COLORS, "Lio/intercom/android/sdk/survey/SurveyUiColors;", "validationError", "Lio/intercom/android/sdk/survey/ValidationError;", "onImeActionNext", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Lkotlin/ExtensionFunctionType;", "questionHeader", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$ShortTextQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/ValidationError;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ShortTextPreview", "(Landroidx/compose/runtime/Composer;I)V", "ShortTextAnsweredPreview", "ShortTextPhoneNumberPreview", "ShortTextDisabledPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShortTextQuestionKt {

    /* compiled from: ShortTextQuestion.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextAnsweredPreview$lambda$10(int i, Composer composer, int i2) {
        ShortTextAnsweredPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextDisabledPreview$lambda$12(int i, Composer composer, int i2) {
        ShortTextDisabledPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextPhoneNumberPreview$lambda$11(int i, Composer composer, int i2) {
        ShortTextPhoneNumberPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextPreview$lambda$9(int i, Composer composer, int i2) {
        ShortTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextQuestion$lambda$8(Modifier modifier, SurveyData.Step.Question.ShortTextQuestionModel textQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, ValidationError validationError, Function1 function1, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(textQuestionModel, "$textQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        Intrinsics.checkNotNullParameter(validationError, "$validationError");
        ShortTextQuestion(modifier, textQuestionModel, answer, onAnswer, colors, validationError, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextQuestion$lambda$0(KeyboardActionScope keyboardActionScope) {
        Intrinsics.checkNotNullParameter(keyboardActionScope, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShortTextQuestion(Modifier modifier, final SurveyData.Step.Question.ShortTextQuestionModel textQuestionModel, Answer answer, final Function1<? super Answer, Unit> onAnswer, final SurveyUiColors colors, final ValidationError validationError, Function1<? super KeyboardActionScope, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Answer answer2;
        int i4;
        int i5;
        Function1<? super KeyboardActionScope, Unit> function12;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Answer.NoAnswer.InitialNoAnswer initialNoAnswer;
        Object rememberedValue;
        Object rememberedValue2;
        int hashCode;
        Composer m5333constructorimpl;
        int hashCode2;
        Composer m5333constructorimpl2;
        int i7;
        int m8471getNumberPjHm6EE;
        boolean z;
        String placeholder;
        Color color;
        ComposableLambda composableLambda;
        boolean z2;
        Object rememberedValue3;
        final Function1<? super KeyboardActionScope, Unit> function13;
        Composer composer2;
        SurveyData.Step.Question.QuestionValidation.ValidationType validationType;
        Integer characterLimit;
        final Answer answer3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        final CountryAreaCode countryAreaCodeFromLocale;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(textQuestionModel, "textQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        Composer startRestartGroup = composer.startRestartGroup(13974558);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
        int i9 = i2 & 4;
        if (i9 != 0) {
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
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    i4 = startRestartGroup.changed(validationError) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    function12 = function1;
                } else {
                    function12 = function1;
                    if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                    }
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    function22 = function2;
                } else {
                    function22 = function2;
                    if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    initialNoAnswer = i9 != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer2;
                    Function1<? super KeyboardActionScope, Unit> function14 = i5 != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ShortTextQuestion$lambda$0;
                            ShortTextQuestion$lambda$0 = ShortTextQuestionKt.ShortTextQuestion$lambda$0((KeyboardActionScope) obj);
                            return ShortTextQuestion$lambda$0;
                        }
                    } : function12;
                    Function2<? super Composer, ? super Integer, Unit> m12788getLambda1$intercom_sdk_base_release = i6 != 0 ? ComposableSingletons$ShortTextQuestionKt.INSTANCE.m12788getLambda1$intercom_sdk_base_release() : function22;
                    startRestartGroup.startReplaceGroup(-1483108825);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = BringIntoViewRequesterKt.BringIntoViewRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier onFocusEvent = FocusEventModifierKt.onFocusEvent(BringIntoViewRequesterKt.bringIntoViewRequester(modifier2, bringIntoViewRequester), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ShortTextQuestion$lambda$2;
                            ShortTextQuestion$lambda$2 = ShortTextQuestionKt.ShortTextQuestion$lambda$2(CoroutineScope.this, bringIntoViewRequester, (FocusState) obj);
                            return ShortTextQuestion$lambda$2;
                        }
                    });
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusEvent);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier4 = modifier2;
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
                    if (startRestartGroup.getInserting()) {
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
                    m12788getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
                    SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
                    i7 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i7 == 1) {
                        m8471getNumberPjHm6EE = KeyboardType.INSTANCE.m8471getNumberPjHm6EE();
                    } else if (i7 == 2) {
                        m8471getNumberPjHm6EE = KeyboardType.INSTANCE.m8470getEmailPjHm6EE();
                    } else if (i7 == 3) {
                        m8471getNumberPjHm6EE = KeyboardType.INSTANCE.m8474getPhonePjHm6EE();
                    } else if (i7 == 4) {
                        m8471getNumberPjHm6EE = KeyboardType.INSTANCE.m8471getNumberPjHm6EE();
                    } else {
                        m8471getNumberPjHm6EE = KeyboardType.INSTANCE.m8475getTextPjHm6EE();
                    }
                    int i10 = m8471getNumberPjHm6EE;
                    String answer4 = initialNoAnswer instanceof Answer.SingleAnswer ? ((Answer.SingleAnswer) initialNoAnswer).getAnswer() : "";
                    startRestartGroup.startReplaceGroup(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        z = false;
                        placeholder = StringResources_androidKt.stringResource(textQuestionModel.getPlaceHolderStringRes().intValue(), startRestartGroup, 0);
                    } else {
                        z = false;
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1720978057);
                    color = null;
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Context context = (Context) consume;
                        PhoneNumberValidator.loadCountryAreaCodes(context);
                        Locale localeCompat = UtilsKt.getLocaleCompat(context);
                        if (!(initialNoAnswer instanceof Answer.NoAnswer)) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer4));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (initialNoAnswer instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer4 = Marker.ANY_NON_NULL_MARKER + countryAreaCodeFromLocale.getDialCode();
                        }
                        composableLambda = ComposableLambdaKt.rememberComposableLambda(854302399, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11) {
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                String emoji = CountryAreaCode.this.getEmoji();
                                Intrinsics.checkNotNullExpressionValue(emoji, "getEmoji(...)");
                                TextKt.m3901TextNvy7gAk(emoji, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                            }
                        }, startRestartGroup, 54);
                        placeholder = "+1 123 456 7890";
                    } else {
                        composableLambda = null;
                    }
                    startRestartGroup.endReplaceGroup();
                    if ((validationError instanceof ValidationError.ValidationStringError) && !(initialNoAnswer instanceof Answer.NoAnswer.InitialNoAnswer) && ((ValidationError.ValidationStringError) validationError).getStringRes() != R.string.intercom_surveys_required_response) {
                        color = Color.m6029boximpl(Color.INSTANCE.m6073getRed0d7_KjU());
                    }
                    Color color2 = color;
                    long m13183getAccessibleColorOnWhiteBackground8_81llA = ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(colors.m12628getButton0d7_KjU());
                    boolean z3 = (textQuestionModel.getEnabled() || !(validationError instanceof ValidationError.NoValidationError) || (initialNoAnswer instanceof Answer.NoAnswer)) ? z : true;
                    int m8417getNexteUduSuo = ImeAction.INSTANCE.m8417getNexteUduSuo();
                    boolean enabled = textQuestionModel.getEnabled();
                    startRestartGroup.startReplaceGroup(1721011229);
                    z2 = (i3 & 7168) != 2048 ? z : true;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3;
                                ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3 = ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(Function1.this, (String) obj);
                                return ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    boolean z4 = z;
                    TextInputPillKt.m12809TextInputPillg5ZjG94(answer4, placeholder, (Function1) rememberedValue3, color2, m13183getAccessibleColorOnWhiteBackground8_81llA, 0, true, function14, i10, m8417getNexteUduSuo, z3, composableLambda, enabled, 0.0f, startRestartGroup, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                    function13 = function14;
                    composer2 = startRestartGroup;
                    validationType = textQuestionModel.getValidationType();
                    composer2.startReplaceGroup(1721048023);
                    if ((validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION || validationType == SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT) && (characterLimit = textQuestionModel.getCharacterLimit()) != null) {
                        int intValue = characterLimit.intValue();
                        StringBuilder sb = new StringBuilder();
                        sb.append(initialNoAnswer.getLength());
                        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                        sb.append(intValue);
                        TextKt.m3901TextNvy7gAk(sb.toString(), PaddingKt.m1161paddingqDBjuR0$default(columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), 0.0f, Dp.m8798constructorimpl(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24576, 0, 262120);
                        Unit unit = Unit.INSTANCE;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_tickets_email_copy, composer2, z4 ? 1 : 0), PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 48, 0, 131064);
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
                    function23 = m12788getLambda1$intercom_sdk_base_release;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                    function13 = function12;
                    function23 = function22;
                    answer3 = answer2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ShortTextQuestion$lambda$8;
                            ShortTextQuestion$lambda$8 = ShortTextQuestionKt.ShortTextQuestion$lambda$8(Modifier.this, textQuestionModel, answer3, onAnswer, colors, validationError, function13, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ShortTextQuestion$lambda$8;
                        }
                    });
                    return;
                }
                return;
            }
            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i4;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            if ((i3 & 23967451) == 4793490) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            startRestartGroup.startReplaceGroup(-1483108825);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier onFocusEvent2 = FocusEventModifierKt.onFocusEvent(BringIntoViewRequesterKt.bringIntoViewRequester(modifier2, bringIntoViewRequester2), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ShortTextQuestion$lambda$2;
                    ShortTextQuestion$lambda$2 = ShortTextQuestionKt.ShortTextQuestion$lambda$2(CoroutineScope.this, bringIntoViewRequester2, (FocusState) obj);
                    return ShortTextQuestion$lambda$2;
                }
            });
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusEvent2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier42 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            if (startRestartGroup.getInserting()) {
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
            m12788getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
            i7 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
            if (i7 == 1) {
            }
            int i102 = m8471getNumberPjHm6EE;
            if (initialNoAnswer instanceof Answer.SingleAnswer) {
            }
            startRestartGroup.startReplaceGroup(1720968786);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1720978057);
            color = null;
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
            }
            startRestartGroup.endReplaceGroup();
            if (validationError instanceof ValidationError.ValidationStringError) {
                color = Color.m6029boximpl(Color.INSTANCE.m6073getRed0d7_KjU());
            }
            Color color22 = color;
            long m13183getAccessibleColorOnWhiteBackground8_81llA2 = ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(colors.m12628getButton0d7_KjU());
            if (textQuestionModel.getEnabled()) {
            }
            int m8417getNexteUduSuo2 = ImeAction.INSTANCE.m8417getNexteUduSuo();
            boolean enabled2 = textQuestionModel.getEnabled();
            startRestartGroup.startReplaceGroup(1721011229);
            if ((i3 & 7168) != 2048) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3;
                    ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3 = ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(Function1.this, (String) obj);
                    return ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            boolean z42 = z;
            TextInputPillKt.m12809TextInputPillg5ZjG94(answer4, placeholder, (Function1) rememberedValue3, color22, m13183getAccessibleColorOnWhiteBackground8_81llA2, 0, true, function14, i102, m8417getNexteUduSuo2, z3, composableLambda, enabled2, 0.0f, startRestartGroup, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
            function13 = function14;
            composer2 = startRestartGroup;
            validationType = textQuestionModel.getValidationType();
            composer2.startReplaceGroup(1721048023);
            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
            }
            int intValue2 = characterLimit.intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(initialNoAnswer.getLength());
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(intValue2);
            TextKt.m3901TextNvy7gAk(sb2.toString(), PaddingKt.m1161paddingqDBjuR0$default(columnScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), 0.0f, Dp.m8798constructorimpl(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24576, 0, 262120);
            Unit unit3 = Unit.INSTANCE;
            Unit unit22 = Unit.INSTANCE;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1721067384);
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
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
            function23 = m12788getLambda1$intercom_sdk_base_release;
            modifier3 = modifier42;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        answer2 = answer;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i3 |= i4;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        startRestartGroup.startReplaceGroup(-1483108825);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier onFocusEvent22 = FocusEventModifierKt.onFocusEvent(BringIntoViewRequesterKt.bringIntoViewRequester(modifier2, bringIntoViewRequester22), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ShortTextQuestion$lambda$2;
                ShortTextQuestion$lambda$2 = ShortTextQuestionKt.ShortTextQuestion$lambda$2(CoroutineScope.this, bringIntoViewRequester22, (FocusState) obj);
                return ShortTextQuestion$lambda$2;
            }
        });
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, onFocusEvent22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier422 = modifier2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
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
        if (startRestartGroup.getInserting()) {
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
        m12788getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
        i7 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
        if (i7 == 1) {
        }
        int i1022 = m8471getNumberPjHm6EE;
        if (initialNoAnswer instanceof Answer.SingleAnswer) {
        }
        startRestartGroup.startReplaceGroup(1720968786);
        if (textQuestionModel.getPlaceHolderStringRes() != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1720978057);
        color = null;
        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
        }
        startRestartGroup.endReplaceGroup();
        if (validationError instanceof ValidationError.ValidationStringError) {
        }
        Color color222 = color;
        long m13183getAccessibleColorOnWhiteBackground8_81llA22 = ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(colors.m12628getButton0d7_KjU());
        if (textQuestionModel.getEnabled()) {
        }
        int m8417getNexteUduSuo22 = ImeAction.INSTANCE.m8417getNexteUduSuo();
        boolean enabled22 = textQuestionModel.getEnabled();
        startRestartGroup.startReplaceGroup(1721011229);
        if ((i3 & 7168) != 2048) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3;
                ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3 = ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(Function1.this, (String) obj);
                return ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        boolean z422 = z;
        TextInputPillKt.m12809TextInputPillg5ZjG94(answer4, placeholder, (Function1) rememberedValue3, color222, m13183getAccessibleColorOnWhiteBackground8_81llA22, 0, true, function14, i1022, m8417getNexteUduSuo22, z3, composableLambda, enabled22, 0.0f, startRestartGroup, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
        function13 = function14;
        composer2 = startRestartGroup;
        validationType = textQuestionModel.getValidationType();
        composer2.startReplaceGroup(1721048023);
        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
        }
        int intValue22 = characterLimit.intValue();
        StringBuilder sb22 = new StringBuilder();
        sb22.append(initialNoAnswer.getLength());
        sb22.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb22.append(intValue22);
        TextKt.m3901TextNvy7gAk(sb22.toString(), PaddingKt.m1161paddingqDBjuR0$default(columnScopeInstance22.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), 0.0f, Dp.m8798constructorimpl(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24576, 0, 262120);
        Unit unit32 = Unit.INSTANCE;
        Unit unit222 = Unit.INSTANCE;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1721067384);
        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
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
        function23 = m12788getLambda1$intercom_sdk_base_release;
        modifier3 = modifier422;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextQuestion$lambda$2(CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester, FocusState it) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        Intrinsics.checkNotNullParameter(bringIntoViewRequester, "$bringIntoViewRequester");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isFocused()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ShortTextQuestionKt$ShortTextQuestion$2$1(bringIntoViewRequester, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(Function1 onAnswer, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() > 0) {
            onAnswer.invoke(new Answer.SingleAnswer(it));
        } else {
            onAnswer.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    public static final void ShortTextPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2147193389);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m12789getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ShortTextPreview$lambda$9;
                    ShortTextPreview$lambda$9 = ShortTextQuestionKt.ShortTextPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ShortTextPreview$lambda$9;
                }
            });
        }
    }

    public static final void ShortTextAnsweredPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1590545552);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m12790getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ShortTextAnsweredPreview$lambda$10;
                    ShortTextAnsweredPreview$lambda$10 = ShortTextQuestionKt.ShortTextAnsweredPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ShortTextAnsweredPreview$lambda$10;
                }
            });
        }
    }

    public static final void ShortTextPhoneNumberPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-38271892);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m12791getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ShortTextPhoneNumberPreview$lambda$11;
                    ShortTextPhoneNumberPreview$lambda$11 = ShortTextQuestionKt.ShortTextPhoneNumberPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ShortTextPhoneNumberPreview$lambda$11;
                }
            });
        }
    }

    public static final void ShortTextDisabledPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1539795729);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m12792getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ShortTextDisabledPreview$lambda$12;
                    ShortTextDisabledPreview$lambda$12 = ShortTextQuestionKt.ShortTextDisabledPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ShortTextDisabledPreview$lambda$12;
                }
            });
        }
    }
}
