package io.intercom.android.sdk.survey.ui.questiontype;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DatePickerDialog_androidKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.sentry.metrics.MetricsUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DatePickerQuestion.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aR\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010\r\u001a1\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019\u001a\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u001a\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\"¨\u0006#²\u0006\n\u0010$\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\u0018X\u008a\u008e\u0002"}, d2 = {"DatePickerQuestion", "", "modifier", "Landroidx/compose/ui/Modifier;", "questionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DatePickerQuestionModel;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", "questionHeader", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DatePickerQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DatePicker", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ComposeDatePickerDialog", "onDismiss", "(Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TimePicker", "ComposeTimePickerDialog", "contentAlpha", "", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)F", "getUtcTime", "", "", MetricsUnit.Duration.HOUR, "", MetricsUnit.Duration.MINUTE, "getLocalTime", "DatePickerQuestionPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release", "showDatePicker", "showTimePicker"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DatePickerQuestionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeDatePickerDialog$lambda$13(Answer answer, Function1 onAnswer, Function0 onDismiss, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        ComposeDatePickerDialog(answer, onAnswer, onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeTimePickerDialog$lambda$27(Answer answer, Function1 onAnswer, Function0 onDismiss, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
        ComposeTimePickerDialog(answer, onAnswer, onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$12(Modifier modifier, Answer answer, Function1 onAnswer, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        DatePicker(modifier, answer, onAnswer, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerQuestion$lambda$2(Modifier modifier, SurveyData.Step.Question.DatePickerQuestionModel questionModel, Answer answer, Function1 onAnswer, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(questionModel, "$questionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        DatePickerQuestion(modifier, questionModel, answer, onAnswer, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerQuestionPreview$lambda$28(int i, Composer composer, int i2) {
        DatePickerQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker$lambda$23(Modifier modifier, Answer answer, Function1 onAnswer, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        TimePicker(modifier, answer, onAnswer, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DatePickerQuestion(Modifier modifier, final SurveyData.Step.Question.DatePickerQuestionModel questionModel, Answer answer, final Function1<? super Answer, Unit> onAnswer, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Answer answer2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier.Companion companion;
        int hashCode;
        Composer m5333constructorimpl;
        int hashCode2;
        Composer m5333constructorimpl2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(questionModel, "questionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Composer startRestartGroup = composer.startRestartGroup(1725209962);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            answer2 = answer;
            i3 |= startRestartGroup.changed(answer2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(onAnswer) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                if ((46731 & i3) == 9346 || !startRestartGroup.getSkipping()) {
                    companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i6 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i4 != 0) {
                        function22 = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m12707getLambda1$intercom_sdk_base_release();
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                    SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                    }
                    Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i7 = i3 >> 3;
                    int i8 = (i7 & 896) | (i7 & 112) | 6;
                    DatePicker(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.5f), answer2, onAnswer, startRestartGroup, i8);
                    SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), startRestartGroup, 6);
                    TimePicker(SizeKt.fillMaxWidth(Modifier.INSTANCE, 1.0f), answer2, onAnswer, startRestartGroup, i8);
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
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                }
                final Answer answer3 = answer2;
                final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DatePickerQuestion$lambda$2;
                            DatePickerQuestion$lambda$2 = DatePickerQuestionKt.DatePickerQuestion$lambda$2(Modifier.this, questionModel, answer3, onAnswer, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return DatePickerQuestion$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if ((46731 & i3) == 9346) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash3);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl2.getInserting()) {
            }
            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22);
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i72 = i3 >> 3;
            int i82 = (i72 & 896) | (i72 & 112) | 6;
            DatePicker(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.5f), answer2, onAnswer, startRestartGroup, i82);
            SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), startRestartGroup, 6);
            TimePicker(SizeKt.fillMaxWidth(Modifier.INSTANCE, 1.0f), answer2, onAnswer, startRestartGroup, i82);
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
            final Answer answer32 = answer2;
            final Function2 function232 = function22;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        answer2 = answer;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((46731 & i3) == 9346) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash32);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween22, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl2.getInserting()) {
        }
        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222);
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        int i722 = i3 >> 3;
        int i822 = (i722 & 896) | (i722 & 112) | 6;
        DatePicker(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.5f), answer2, onAnswer, startRestartGroup, i822);
        SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), startRestartGroup, 6);
        TimePicker(SizeKt.fillMaxWidth(Modifier.INSTANCE, 1.0f), answer2, onAnswer, startRestartGroup, i822);
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
        final Answer answer322 = answer2;
        final Function2 function2322 = function22;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DatePicker(final Modifier modifier, final Answer answer, final Function1<? super Answer, Unit> function1, Composer composer, final int i) {
        int i2;
        String str;
        int hashCode;
        Composer m5333constructorimpl;
        final MutableState mutableState;
        Composer startRestartGroup = composer.startRestartGroup(2133326452);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(answer) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusManager focusManager = (FocusManager) consume;
            startRestartGroup.startReplaceGroup(995397106);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (dateTimeAnswer.getDate() != -1) {
                    str = TimeFormatter.formatTimeInMillisAsDate(dateTimeAnswer.getDate(), "dd - MM - YYYY");
                    Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.m594borderxT4_qwU(modifier, Dp.m8798constructorimpl(1), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit DatePicker$lambda$6;
                            DatePicker$lambda$6 = DatePickerQuestionKt.DatePicker$lambda$6(FocusManager.this, mutableState2);
                            return DatePicker$lambda$6;
                        }
                    }, 15, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m623clickableoSLSa3U$default);
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
                    Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Intrinsics.checkNotNull(str);
                    float f = 16;
                    TextKt.m3901TextNvy7gAk(str, SizeKt.wrapContentSize$default(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), null, false, 3, null), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), contentAlpha(!Intrinsics.areEqual(str, "DD - MM - YYYY"), startRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, 48, 0, 131064);
                    startRestartGroup = startRestartGroup;
                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_pick_date, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.intercom_choose_the_date, startRestartGroup, 0), PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU(), startRestartGroup, 392, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (DatePicker$lambda$4(mutableState2)) {
                        startRestartGroup.startReplaceGroup(995446935);
                        boolean z = (i2 & 896) == 256;
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            mutableState = mutableState2;
                            rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit DatePicker$lambda$9$lambda$8;
                                    DatePicker$lambda$9$lambda$8 = DatePickerQuestionKt.DatePicker$lambda$9$lambda$8(Function1.this, mutableState, (Answer) obj);
                                    return DatePicker$lambda$9$lambda$8;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            mutableState = mutableState2;
                        }
                        Function1 function12 = (Function1) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(995450986);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DatePicker$lambda$11$lambda$10;
                                    DatePicker$lambda$11$lambda$10 = DatePickerQuestionKt.DatePicker$lambda$11$lambda$10(MutableState.this);
                                    return DatePicker$lambda$11$lambda$10;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposeDatePickerDialog(answer, function12, (Function0) rememberedValue3, startRestartGroup, ((i2 >> 3) & 14) | 384);
                    }
                }
            }
            str = "DD - MM - YYYY";
            Modifier m623clickableoSLSa3U$default2 = ClickableKt.m623clickableoSLSa3U$default(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.m594borderxT4_qwU(modifier, Dp.m8798constructorimpl(1), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DatePicker$lambda$6;
                    DatePicker$lambda$6 = DatePickerQuestionKt.DatePicker$lambda$6(FocusManager.this, mutableState2);
                    return DatePicker$lambda$6;
                }
            }, 15, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m623clickableoSLSa3U$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Intrinsics.checkNotNull(str);
            float f2 = 16;
            TextKt.m3901TextNvy7gAk(str, SizeKt.wrapContentSize$default(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), null, false, 3, null), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), contentAlpha(!Intrinsics.areEqual(str, "DD - MM - YYYY"), startRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, 48, 0, 131064);
            startRestartGroup = startRestartGroup;
            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_pick_date, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.intercom_choose_the_date, startRestartGroup, 0), PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU(), startRestartGroup, 392, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (DatePicker$lambda$4(mutableState2)) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DatePicker$lambda$12;
                    DatePicker$lambda$12 = DatePickerQuestionKt.DatePicker$lambda$12(Modifier.this, answer, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DatePicker$lambda$12;
                }
            });
        }
    }

    private static final boolean DatePicker$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DatePicker$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$6(FocusManager focusManager, MutableState showDatePicker$delegate) {
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(showDatePicker$delegate, "$showDatePicker$delegate");
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        DatePicker$lambda$5(showDatePicker$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$9$lambda$8(Function1 onAnswer, MutableState showDatePicker$delegate, Answer newAnswer) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(showDatePicker$delegate, "$showDatePicker$delegate");
        Intrinsics.checkNotNullParameter(newAnswer, "newAnswer");
        onAnswer.invoke(newAnswer);
        DatePicker$lambda$5(showDatePicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePicker$lambda$11$lambda$10(MutableState showDatePicker$delegate) {
        Intrinsics.checkNotNullParameter(showDatePicker$delegate, "$showDatePicker$delegate");
        DatePicker$lambda$5(showDatePicker$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void ComposeDatePickerDialog(final Answer answer, final Function1<? super Answer, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        long currentTimeMillis;
        Composer startRestartGroup = composer.startRestartGroup(-307045537);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(answer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (dateTimeAnswer.getDate() > 0) {
                    currentTimeMillis = dateTimeAnswer.getDate();
                    final DatePickerState m2970rememberDatePickerStateEU0dCGE = DatePickerKt.m2970rememberDatePickerStateEU0dCGE(Long.valueOf(currentTimeMillis), null, null, 0, null, startRestartGroup, 0, 30);
                    DatePickerDialog_androidKt.m2952DatePickerDialogGmEhDVc(function0, ComposableLambdaKt.rememberComposableLambda(308986865, true, new DatePickerQuestionKt$ComposeDatePickerDialog$1(m2970rememberDatePickerStateEU0dCGE, answer, function1, function0), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(1712856051, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeDatePickerDialog$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                                ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m12709getLambda3$intercom_sdk_base_release(), composer2, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                            } else {
                                composer2.skipToGroupEnd();
                            }
                        }
                    }, startRestartGroup, 54), null, 0.0f, null, null, ComposableLambdaKt.rememberComposableLambda(-725444728, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeDatePickerDialog$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope DatePickerDialog, Composer composer2, int i3) {
                            Intrinsics.checkNotNullParameter(DatePickerDialog, "$this$DatePickerDialog");
                            if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                                DatePickerKt.DatePicker(DatePickerState.this, PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), null, null, null, null, false, null, composer2, 48, 252);
                            } else {
                                composer2.skipToGroupEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i2 >> 6) & 14) | 100666416, 244);
                    startRestartGroup = startRestartGroup;
                }
            }
            currentTimeMillis = System.currentTimeMillis();
            final DatePickerState m2970rememberDatePickerStateEU0dCGE2 = DatePickerKt.m2970rememberDatePickerStateEU0dCGE(Long.valueOf(currentTimeMillis), null, null, 0, null, startRestartGroup, 0, 30);
            DatePickerDialog_androidKt.m2952DatePickerDialogGmEhDVc(function0, ComposableLambdaKt.rememberComposableLambda(308986865, true, new DatePickerQuestionKt$ComposeDatePickerDialog$1(m2970rememberDatePickerStateEU0dCGE2, answer, function1, function0), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(1712856051, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeDatePickerDialog$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m12709getLambda3$intercom_sdk_base_release(), composer2, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), null, 0.0f, null, null, ComposableLambdaKt.rememberComposableLambda(-725444728, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeDatePickerDialog$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope DatePickerDialog, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(DatePickerDialog, "$this$DatePickerDialog");
                    if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                        DatePickerKt.DatePicker(DatePickerState.this, PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), null, null, null, null, false, null, composer2, 48, 252);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ((i2 >> 6) & 14) | 100666416, 244);
            startRestartGroup = startRestartGroup;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ComposeDatePickerDialog$lambda$13;
                    ComposeDatePickerDialog$lambda$13 = DatePickerQuestionKt.ComposeDatePickerDialog$lambda$13(Answer.this, function1, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ComposeDatePickerDialog$lambda$13;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TimePicker(final Modifier modifier, final Answer answer, final Function1<? super Answer, Unit> function1, Composer composer, final int i) {
        int i2;
        String str;
        int hashCode;
        Composer m5333constructorimpl;
        final MutableState mutableState;
        Composer startRestartGroup = composer.startRestartGroup(1270472949);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(answer) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusManager focusManager = (FocusManager) consume;
            startRestartGroup.startReplaceGroup(-1349242735);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (!StringsKt.isBlank(dateTimeAnswer.getLocalTime())) {
                    str = dateTimeAnswer.getLocalTime();
                    Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.m594borderxT4_qwU(modifier, Dp.m8798constructorimpl(1), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TimePicker$lambda$17;
                            TimePicker$lambda$17 = DatePickerQuestionKt.TimePicker$lambda$17(FocusManager.this, mutableState2);
                            return TimePicker$lambda$17;
                        }
                    }, 15, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m623clickableoSLSa3U$default);
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
                    Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f = 16;
                    TextKt.m3901TextNvy7gAk(str, SizeKt.wrapContentSize$default(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), null, false, 3, null), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), contentAlpha(!Intrinsics.areEqual(str, "HH:MM"), startRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, 48, 0, 131064);
                    startRestartGroup = startRestartGroup;
                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_pick_time, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.intercom_choose_the_date, startRestartGroup, 0), PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU(), startRestartGroup, 392, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (TimePicker$lambda$15(mutableState2)) {
                        startRestartGroup.startReplaceGroup(-1349194218);
                        boolean z = (i2 & 896) == 256;
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            mutableState = mutableState2;
                            rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TimePicker$lambda$20$lambda$19;
                                    TimePicker$lambda$20$lambda$19 = DatePickerQuestionKt.TimePicker$lambda$20$lambda$19(Function1.this, mutableState, (Answer) obj);
                                    return TimePicker$lambda$20$lambda$19;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            mutableState = mutableState2;
                        }
                        Function1 function12 = (Function1) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1349190167);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TimePicker$lambda$22$lambda$21;
                                    TimePicker$lambda$22$lambda$21 = DatePickerQuestionKt.TimePicker$lambda$22$lambda$21(MutableState.this);
                                    return TimePicker$lambda$22$lambda$21;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposeTimePickerDialog(answer, function12, (Function0) rememberedValue3, startRestartGroup, ((i2 >> 3) & 14) | 384);
                    }
                }
            }
            str = "HH:MM";
            Modifier m623clickableoSLSa3U$default2 = ClickableKt.m623clickableoSLSa3U$default(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.m594borderxT4_qwU(modifier, Dp.m8798constructorimpl(1), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TimePicker$lambda$17;
                    TimePicker$lambda$17 = DatePickerQuestionKt.TimePicker$lambda$17(FocusManager.this, mutableState2);
                    return TimePicker$lambda$17;
                }
            }, 15, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m623clickableoSLSa3U$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            float f2 = 16;
            TextKt.m3901TextNvy7gAk(str, SizeKt.wrapContentSize$default(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), null, false, 3, null), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), contentAlpha(!Intrinsics.areEqual(str, "HH:MM"), startRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, 48, 0, 131064);
            startRestartGroup = startRestartGroup;
            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_pick_time, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.intercom_choose_the_date, startRestartGroup, 0), PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU(), startRestartGroup, 392, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (TimePicker$lambda$15(mutableState2)) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TimePicker$lambda$23;
                    TimePicker$lambda$23 = DatePickerQuestionKt.TimePicker$lambda$23(Modifier.this, answer, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TimePicker$lambda$23;
                }
            });
        }
    }

    private static final boolean TimePicker$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void TimePicker$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker$lambda$17(FocusManager focusManager, MutableState showTimePicker$delegate) {
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(showTimePicker$delegate, "$showTimePicker$delegate");
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        TimePicker$lambda$16(showTimePicker$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker$lambda$20$lambda$19(Function1 onAnswer, MutableState showTimePicker$delegate, Answer newAnswer) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(showTimePicker$delegate, "$showTimePicker$delegate");
        Intrinsics.checkNotNullParameter(newAnswer, "newAnswer");
        onAnswer.invoke(newAnswer);
        TimePicker$lambda$16(showTimePicker$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimePicker$lambda$22$lambda$21(MutableState showTimePicker$delegate) {
        Intrinsics.checkNotNullParameter(showTimePicker$delegate, "$showTimePicker$delegate");
        TimePicker$lambda$16(showTimePicker$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void ComposeTimePickerDialog(final Answer answer, final Function1<? super Answer, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer startRestartGroup = composer.startRestartGroup(-1295396418);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(answer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            List<String> localTime = getLocalTime(answer);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = localTime.iterator();
            while (it.hasNext()) {
                Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
            ArrayList arrayList2 = arrayList;
            final TimePickerState rememberTimePickerState = TimePickerKt.rememberTimePickerState(((Number) (arrayList2.size() > 0 ? arrayList2.get(0) : 0)).intValue(), ((Number) (1 < arrayList2.size() ? arrayList2.get(1) : 0)).intValue(), true, startRestartGroup, 384, 0);
            function02 = function0;
            AndroidDialog_androidKt.Dialog(function02, null, ComposableLambdaKt.rememberComposableLambda(-1529528875, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        SurfaceKt.m3729SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getShapes(composer2, MaterialTheme.$stable).getExtraLarge(), 0L, 0L, Dp.m8798constructorimpl(6), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1066676752, true, new AnonymousClass1(TimePickerState.this, function0, answer, function1), composer2, 54), composer2, 12607494, 108);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* compiled from: DatePickerQuestion.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Answer $answer;
                    final /* synthetic */ Function1<Answer, Unit> $onAnswer;
                    final /* synthetic */ Function0<Unit> $onDismiss;
                    final /* synthetic */ TimePickerState $timePickerState;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(TimePickerState timePickerState, Function0<Unit> function0, Answer answer, Function1<? super Answer, Unit> function1) {
                        this.$timePickerState = timePickerState;
                        this.$onDismiss = function0;
                        this.$answer = answer;
                        this.$onAnswer = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) != 2 || !composer.getSkipping()) {
                            float f = 24;
                            Modifier m1157padding3ABfNKs = PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            final TimePickerState timePickerState = this.$timePickerState;
                            Function0<Unit> function0 = this.$onDismiss;
                            final Answer answer = this.$answer;
                            final Function1<Answer, Unit> function1 = this.$onAnswer;
                            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1157padding3ABfNKs);
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
                            TextKt.m3901TextNvy7gAk("Select time", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 6, 0, 131070);
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), composer, 6);
                            TimePickerKt.m3953TimePickermT9BvqQ(timePickerState, null, null, 0, composer, 8, 14);
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), composer, 6);
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer, 6);
                            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
                            Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                            }
                            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m12710getLambda4$intercom_sdk_base_release(), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                            SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), composer, 6);
                            ButtonKt.TextButton(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0254: INVOKE 
                                  (wrap:kotlin.jvm.functions.Function0:0x024b: CONSTRUCTOR 
                                  (r4v0 'timePickerState' androidx.compose.material3.TimePickerState A[DONT_INLINE])
                                  (r6v0 'answer' io.intercom.android.sdk.survey.ui.models.Answer A[DONT_INLINE])
                                  (r7v0 'function1' kotlin.jvm.functions.Function1<io.intercom.android.sdk.survey.ui.models.Answer, kotlin.Unit> A[DONT_INLINE])
                                 A[MD:(androidx.compose.material3.TimePickerState, io.intercom.android.sdk.survey.ui.models.Answer, kotlin.jvm.functions.Function1):void (m), WRAPPED] (LINE:273) call: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.material3.TimePickerState, io.intercom.android.sdk.survey.ui.models.Answer, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR)
                                  (null androidx.compose.ui.Modifier)
                                  false
                                  (null androidx.compose.ui.graphics.Shape)
                                  (null androidx.compose.material3.ButtonColors)
                                  (null androidx.compose.material3.ButtonElevation)
                                  (null androidx.compose.foundation.BorderStroke)
                                  (null androidx.compose.foundation.layout.PaddingValues)
                                  (null androidx.compose.foundation.interaction.MutableInteractionSource)
                                  (wrap:kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0250: INVOKE 
                                  (wrap:io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt:0x024e: SGET  A[WRAPPED] io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt.INSTANCE io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt)
                                 VIRTUAL call: io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt.getLambda-5$intercom_sdk_base_release():kotlin.jvm.functions.Function3 A[MD:():kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> (m), WRAPPED])
                                  (r37v0 'composer' androidx.compose.runtime.Composer)
                                  (805306368 int)
                                  (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_POSITION_TYPE int)
                                 STATIC call: androidx.compose.material3.ButtonKt.TextButton(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.material3.ButtonElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, int, int):void (m)] (LINE:273) in method: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 23 more
                                */
                            /*
                                Method dump skipped, instructions count: 630
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(TimePickerState timePickerState, Answer answer, Function1 onAnswer) {
                            List utcTime;
                            Answer.DateTimeAnswer dateTimeAnswer;
                            Intrinsics.checkNotNullParameter(timePickerState, "$timePickerState");
                            Intrinsics.checkNotNullParameter(answer, "$answer");
                            Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
                            utcTime = DatePickerQuestionKt.getUtcTime(timePickerState.getHour(), timePickerState.getMinute());
                            if (answer instanceof Answer.DateTimeAnswer) {
                                dateTimeAnswer = Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, 0L, Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)), 1, null);
                            } else {
                                dateTimeAnswer = new Answer.DateTimeAnswer(-1L, Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)));
                            }
                            onAnswer.invoke(dateTimeAnswer);
                            return Unit.INSTANCE;
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i2 >> 6) & 14) | 384, 2);
            } else {
                startRestartGroup.skipToGroupEnd();
                function02 = function0;
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ComposeTimePickerDialog$lambda$27;
                        ComposeTimePickerDialog$lambda$27 = DatePickerQuestionKt.ComposeTimePickerDialog$lambda$27(Answer.this, function1, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                        return ComposeTimePickerDialog$lambda$27;
                    }
                });
            }
        }

        public static final float contentAlpha(boolean z, Composer composer, int i) {
            composer.startReplaceGroup(2064501839);
            float f = z ? 1.0f : 0.6f;
            composer.endReplaceGroup();
            return f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List<String> getUtcTime(int i, int i2) {
            String formatToUtcTime = TimeFormatter.formatToUtcTime(i, i2);
            Intrinsics.checkNotNullExpressionValue(formatToUtcTime, "formatToUtcTime(...)");
            return StringsKt.split$default((CharSequence) formatToUtcTime, new String[]{":"}, false, 0, 6, (Object) null);
        }

        private static final List<String> getLocalTime(Answer answer) {
            if (answer instanceof Answer.DateTimeAnswer) {
                return StringsKt.split$default((CharSequence) ((Answer.DateTimeAnswer) answer).getLocalTime(), new String[]{":"}, false, 0, 6, (Object) null);
            }
            return CollectionsKt.emptyList();
        }

        @IntercomPreviews
        private static final void DatePickerQuestionPreview(Composer composer, final int i) {
            Composer startRestartGroup = composer.startRestartGroup(-1652233850);
            if (i != 0 || !startRestartGroup.getSkipping()) {
                IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m12713getLambda7$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DatePickerQuestionPreview$lambda$28;
                        DatePickerQuestionPreview$lambda$28 = DatePickerQuestionKt.DatePickerQuestionPreview$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                        return DatePickerQuestionPreview$lambda$28;
                    }
                });
            }
        }
    }
